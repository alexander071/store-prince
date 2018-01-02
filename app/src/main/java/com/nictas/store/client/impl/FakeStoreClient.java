package com.nictas.store.client.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.nictas.store.client.StoreClient;
import com.nictas.store.client.filter.ItemFilter;
import com.nictas.store.domain.Category;
import com.nictas.store.domain.Item;

import java.util.Collections;
import java.util.List;

public class FakeStoreClient implements StoreClient {

    private List<Category> categories;

    public FakeStoreClient(Context context) {
        this.categories = FakeData.getCategories(context);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public Category getCategory(long id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Item> getItems() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Item> getItems(ItemFilter filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Item getItem(long id) {
        throw new UnsupportedOperationException();
    }

}
