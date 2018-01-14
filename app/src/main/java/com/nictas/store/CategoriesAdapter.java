package com.nictas.store;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nictas.store.domain.Category;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder> {

    private List<Category> categories;

    public CategoriesAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_card, parent, false);

        return new CategoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        Category category = categories.get(position);

        holder.categoryImage.setImageBitmap(category.getImage());
        holder.categoryName.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private ImageView categoryImage;
        private TextView categoryName;

        public CategoryViewHolder(View view) {
            super(view);
            categoryImage = (ImageView) view.findViewById(R.id.image_category);
            categoryName = (TextView) view.findViewById(R.id.text_category_name);
        }

    }

}
