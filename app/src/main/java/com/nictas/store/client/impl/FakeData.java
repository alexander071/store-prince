package com.nictas.store.client.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.nictas.store.R;
import com.nictas.store.domain.Category;

import java.util.ArrayList;
import java.util.List;

public class FakeData {

    public static List<Category> getCategories(Context context) {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category.Builder()
                .setId(1)
                .setName("Cycling")
                .setImage(getImage(context, R.drawable.cycling_category))
                .build());
        categories.add(new Category.Builder()
                .setId(2)
                .setName("Football")
                .setImage(getImage(context, R.drawable.football_category))
                .build());
        categories.add(new Category.Builder()
                .setId(3)
                .setName("Golf")
                .setImage(getImage(context, R.drawable.golf_category))
                .build());
        categories.add(new Category.Builder()
                .setId(4)
                .setName("Gym")
                .setImage(getImage(context, R.drawable.gym_category))
                .build());
        categories.add(new Category.Builder()
                .setId(5)
                .setName("Hiking")
                .setImage(getImage(context, R.drawable.hiking_category))
                .build());
        categories.add(new Category.Builder()
                .setId(6)
                .setName("Hunting")
                .setImage(getImage(context, R.drawable.hunting_category))
                .build());
        categories.add(new Category.Builder()
                .setId(7)
                .setName("Tennis")
                .setImage(getImage(context, R.drawable.tennis_category))
                .build());
        return categories;
    }

    private static Bitmap getImage(Context context, int resourceId) {
        return BitmapFactory.decodeResource(context.getResources(), resourceId);
    }

}
