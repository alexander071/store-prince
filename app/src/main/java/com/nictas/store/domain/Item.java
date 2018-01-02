package com.nictas.store.domain;

import android.graphics.Bitmap;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private long id;
    private String name;
    private String description;
    private List<Bitmap> images;
    private List<Characteristic> characteristics;
    private BigDecimal price;

    private Item(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.images = builder.images;
        this.characteristics = builder.characteristics;
        this.price = builder.price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Bitmap> getImages() {
        return images;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static class Builder {

        private long id;
        private String name;
        private String description;
        private List<Bitmap> images;
        private List<Characteristic> characteristics;
        private BigDecimal price;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImages(List<Bitmap> images) {
            this.images = images;
            return this;
        }

        public Builder setCharacteristics(List<Characteristic> characteristics) {
            this.characteristics = characteristics;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Item build() {
            return new Item(this);
        }

    }

}
