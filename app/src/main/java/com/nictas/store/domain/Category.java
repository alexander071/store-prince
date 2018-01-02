package com.nictas.store.domain;

import android.graphics.Bitmap;

public class Category {

    private long id;
    private String name;
    private String description;
    private Bitmap image;

    private Category(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.image = builder.image;
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

    public Bitmap getImage() {
        return image;
    }

    public static class Builder {

        private long id;
        private String name;
        private String description;
        private Bitmap image;

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

        public Builder setImage(Bitmap image) {
            this.image = image;
            return this;
        }

        public Category build() {
            return new Category(this);
        }

    }

}
