package com.example.leroy;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.leroy.databinding.CategoriesHolderBinding;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesHolder> {

    CategoriesHolderBinding binding;
    private Resources resources;
    private String[] data;
    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = CategoriesHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        CategoriesHolder holder = new CategoriesHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder holder, int position) {


        String title = data[position].split("%")[1];
        String image = data[position].split("%")[0];
        Drawable drawable = position == 0 ? resources.getDrawable(R.drawable.category_layout_green) : resources.getDrawable(R.drawable.category_layout);
        holder.putInfo(title, image, position, drawable);
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }
}
