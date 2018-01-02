package com.nictas.store.client;

public class ClientConfiguration {

    private ImageSize preferredImageSize;
    private Language preferredLanguage;

    private ClientConfiguration(Builder builder) {
        this.preferredImageSize = builder.preferredImageSize;
        this.preferredLanguage = builder.preferredLanguage;
    }

    public ImageSize getPreferredImageSize() {
        return preferredImageSize;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public static class Builder {

        private ImageSize preferredImageSize;
        private Language preferredLanguage;

        public Builder setPreferredImageSize(ImageSize preferredImageSize) {
            this.preferredImageSize = preferredImageSize;
            return this;
        }

        public Builder setPreferredLanguage(Language preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }

        public ClientConfiguration build() {
            return new ClientConfiguration(this);
        }

    }

}
