package com.example.leroy;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.leroy.databinding.ThreeRecyclesHolderBinding;

import java.util.concurrent.ThreadLocalRandom;

public class AdapterForThreeRecycles extends RecyclerView.Adapter<HolderForThreeRecyclers> {

    ThreeRecyclesHolderBinding binding;
    private String[] data;

    @NonNull
    @Override
    public HolderForThreeRecyclers onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ThreeRecyclesHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        HolderForThreeRecyclers holder = new HolderForThreeRecyclers(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderForThreeRecyclers holder, int position) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 6 + 1);
        holder.putInfo(data[randomNum]);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
