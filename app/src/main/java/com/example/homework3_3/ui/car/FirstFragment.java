package com.example.homework3_3.ui.car;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework3_3.R;
import com.example.homework3_3.phones.SecondFragment;
import com.example.homework3_3.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private ArrayList<String> listCar = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,parent,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CarAdapter carAdapter = new CarAdapter(listCar);
        binding.rvCars.setAdapter(carAdapter);
        binding.btnClick.setOnClickListener(view1 -> {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container,new SecondFragment()).commit();

        });

    }

    private void loadData() {
        listCar.add("BMW");
        listCar.add("Mersedes");
        listCar.add("Toyota");
        listCar.add("Honda");
        listCar.add("Tesla");
        listCar.add("Ferrari");
        listCar.add("Mazda");
        listCar.add("Daewoo");
        listCar.add("Renault");
        listCar.add("Maybah");
        listCar.add("Hyundai");
        listCar.add("Kia");
        listCar.add("Rolls-Roys");
    }
}