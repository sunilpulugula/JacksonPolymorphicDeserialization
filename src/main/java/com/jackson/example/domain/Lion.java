package com.jackson.example.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */
@JsonDeserialize(as = Lion.class)
public class Lion implements Animal {

    private String name;
    private String roar;

    public Lion(String name, String roar) {
        this.name = name;
        this.roar = roar;
    }

    public Lion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", roar='" + roar + '\'' +
                '}';
    }
}
