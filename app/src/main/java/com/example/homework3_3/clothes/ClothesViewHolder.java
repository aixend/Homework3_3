package com.example.homework3_3.clothes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_3.R;

public class ClothesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvClothes;
    public ClothesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvClothes = itemView.findViewById(R.id.tv_clothes);
    }
    public void bind(String clothes){
        tvClothes.setText(clothes);
    }
}
