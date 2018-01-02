package com.nictas.store.domain;

public class Characteristic {

    private String name;
    private String description;
    private String value;

    private Characteristic(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.value = builder.value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getValue() {
        return value;
    }


    public static class Builder {

        private String name;
        private String description;
        private String value;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Characteristic build() {
            return new Characteristic(this);
        }

    }

}
