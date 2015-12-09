package com.jackson.example.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.jackson.example.deserializer.AnimalDeSerializer;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */

@JsonDeserialize(using = AnimalDeSerializer.class)
public interface Animal {

}
