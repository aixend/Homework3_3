package com.example.homework3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework3_3.databinding.ActivityMainBinding;
import com.example.homework3_3.ui.car.FirstFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,new FirstFragment()).commit();
    }
}
