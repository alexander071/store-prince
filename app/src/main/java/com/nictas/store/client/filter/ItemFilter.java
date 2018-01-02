package com.nictas.store.client.filter;

// TODO: Add other filtering fields (price ranges, brands, etc.).
public class ItemFilter {

    private String nameContains;

    private ItemFilter(Builder builder) {
        this.nameContains = builder.nameContains;
    }

    public String getNameContains() {
        return nameContains;
    }

    public static class Builder {

        private String nameContains;

        public Builder setNameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        public ItemFilter build() {
            return new ItemFilter(this);
        }

    }
}
