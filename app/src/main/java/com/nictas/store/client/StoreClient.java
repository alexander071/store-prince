package com.nictas.store.client;

import com.nictas.store.client.filter.ItemFilter;
import com.nictas.store.domain.Category;
import com.nictas.store.domain.Item;

import java.util.List;

public interface StoreClient {

    List<Category> getCategories();

    Category getCategory(long id);

    List<Item> getItems();

    List<Item> getItems(ItemFilter filter);

    Item getItem(long id);

}
