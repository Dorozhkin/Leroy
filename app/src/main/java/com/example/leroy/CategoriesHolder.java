package com.example.leroy;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.leroy.databinding.CategoriesHolderBinding;

public class CategoriesHolder extends RecyclerView.ViewHolder {

    CategoriesHolderBinding binding;

    public CategoriesHolder(CategoriesHolderBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void putInfo(String title, String image,  int position, Drawable color) {
            binding.categoryTitle.setText(title);
            binding.categoryConstraint.setBackgroundDrawable(color);
            binding.categoryButton.setVisibility(position == 6 ? View.VISIBLE: View.INVISIBLE);
        switch (image) {
            case "menu": binding.categoryImage.setImageResource(R.drawable.menu); break;
            case "plantcategory": binding.categoryImage.setImageResource(R.drawable.plantcategory); break;
            case "lampcategory": binding.categoryImage.setImageResource(R.drawable.lampcategory); break;
            case "drillcategory": binding.categoryImage.setImageResource(R.drawable.drillcategory); break;
            case "brickcategory": binding.categoryImage.setImageResource(R.drawable.brickcategory); break;
            case "curtaincategory": binding.categoryImage.setImageResource(R.drawable.curtaincategory); break;
        }
        if (position == 0) {
            binding.categoryTitle.setTextColor(Color.WHITE);
            binding.categoryImage.setPadding(40,30,0,0);
        } else {
            binding.categoryImage.setPadding(0,0,0,0);
            binding.categoryTitle.setTextColor(Color.BLACK);
        }
    }
}

