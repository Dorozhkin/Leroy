package com.example.leroy;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.leroy.databinding.ThreeRecyclesHolderBinding;

public class HolderForThreeRecyclers extends RecyclerView.ViewHolder {

    ThreeRecyclesHolderBinding binding;
    public HolderForThreeRecyclers(ThreeRecyclesHolderBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void putInfo(String info) {
        String[] fields = info.split("%");
        switch (fields[0]) {
            case "cover": binding.productImage.setImageResource(R.drawable.cover); break;
            case "kashpo": binding.productImage.setImageResource(R.drawable.kashpo); break;
            case "oboi": binding.productImage.setImageResource(R.drawable.oboi); break;
            case "pena": binding.productImage.setImageResource(R.drawable.pena); break;
            case "perforator": binding.productImage.setImageResource(R.drawable.perforator); break;
            case "salfetka": binding.productImage.setImageResource(R.drawable.salfetka); break;
            case "stekol": binding.productImage.setImageResource(R.drawable.stekol); break;
        }
        binding.description.setText(fields[1]);

        String[] price = fields[2].split("₽");
        binding.costValue.setText(price[0]);
        binding.cost.setText("₽".concat(price[1]));
    }
}
