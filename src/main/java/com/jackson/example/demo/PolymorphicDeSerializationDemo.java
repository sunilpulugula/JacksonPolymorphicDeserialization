package com.jackson.example.demo;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.example.domain.Animal;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */

public class PolymorphicDeSerializationDemo {

    public static void main(String[] args) throws IOException{

        String animalString = "{\"name\":\"tiger\",\"purr\":\"purr\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Animal animal = objectMapper.readValue(animalString, Animal.class);
        System.out.println(animal);

    }

}
