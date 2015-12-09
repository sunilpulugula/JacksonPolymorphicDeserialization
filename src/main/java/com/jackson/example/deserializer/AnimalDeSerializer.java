package com.jackson.example.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jackson.example.domain.Animal;
import com.jackson.example.domain.Lion;
import com.jackson.example.domain.Tiger;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */

public class AnimalDeSerializer extends JsonDeserializer<Animal> {

    public static final String NAME = "name";
    public static final String LION = "lion";
    public static final String TIGER = "tiger";

    @Override
    public Animal deserialize(JsonParser jp, DeserializationContext context) throws IOException {

        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode root = mapper.readTree(jp);
        if (root.has(NAME)) {
            JsonNode jsonNode = root.get(NAME);
            if(jsonNode.asText().equals(LION)) {
                return mapper.readValue(root.toString(), Lion.class);
            }else if(jsonNode.asText().equals(TIGER))
            {
                return mapper.readValue(root.toString(), Tiger.class);
            }
        }
        throw context.mappingException("Failed to de-serialize animal, as name property not exist");
    }
}
