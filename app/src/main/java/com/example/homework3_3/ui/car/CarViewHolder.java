package com.example.homework3_3.ui.car;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3_3.R;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCars;
    public CarViewHolder(@NonNull View itemView)  {
        super(itemView);
        tvCars = itemView.findViewById(R.id.tv_cars);
    }
    public void bind (String car){
        tvCars.setText(car);
    }
}
