package com.example.homework3_3.phones;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_3.R;

public class PhoneViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPhones;
    public PhoneViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPhones = itemView.findViewById(R.id.tv_phones);
    }
    public void bind (String phone){
        tvPhones.setText(phone);
    }
}
