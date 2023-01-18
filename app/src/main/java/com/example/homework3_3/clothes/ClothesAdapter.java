package com.example.homework3_3.clothes;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_3.R;
import com.example.homework3_3.phones.PhoneViewHolder;

import java.util.ArrayList;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesViewHolder> {
    private ArrayList<String> listClothes;

    public ClothesAdapter(ArrayList<String> listClothes) {
        this.listClothes = listClothes;
    }

    @NonNull
    @Override
    public ClothesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClothesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clothes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClothesViewHolder holder, int position) {
        holder.bind(listClothes.get(position));
    }

    @Override
    public int getItemCount() {
        return listClothes.size();
    }
}
