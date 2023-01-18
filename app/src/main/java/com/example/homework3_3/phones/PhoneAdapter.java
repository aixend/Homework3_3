package com.example.homework3_3.phones;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_3.R;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneViewHolder> {
    private ArrayList<String> listPhone;

    public PhoneAdapter(ArrayList<String> listPhone) {
        this.listPhone = listPhone;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_phones,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.bind(listPhone.get(position));

    }

    @Override
    public int getItemCount() {
        return listPhone.size();
    }
}
