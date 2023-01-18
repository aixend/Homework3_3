package com.example.homework3_3.phones;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.homework3_3.R;
import com.example.homework3_3.clothes.ThirdFragment;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private ArrayList<String> listPhones = new ArrayList<>();
    private RecyclerView rvPhones;
    private Button btnClick;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvPhones = requireActivity().findViewById(R.id.rv_phones);
        btnClick = requireActivity().findViewById(R.id.btn_click);
        loadData();
        PhoneAdapter phoneAdapter = new PhoneAdapter(listPhones);
        rvPhones.setAdapter(phoneAdapter);
        btnClick.setOnClickListener(view1 -> {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container,new ThirdFragment()).commit();
        });

    }

    private void loadData() {
        listPhones.add("Iphone XS max");
        listPhones.add("Iphone Xr");
        listPhones.add("Iphone 11");
        listPhones.add("Iphone 11 pro");
        listPhones.add("Iphone 11 pro max");
        listPhones.add("Iphone 12 mini");
        listPhones.add("Iphone 12");
        listPhones.add("Iphone 12 pro");
        listPhones.add("Iphone 12 pro max");
        listPhones.add("Iphone 13 mini");
        listPhones.add("Iphone 13");
        listPhones.add("Iphone 13 pro");
        listPhones.add("Iphone 13 pro max");
        listPhones.add("Iphone 14");
        listPhones.add("Iphone 14 pro");
        listPhones.add("Iphone 14 pro max");

    }
}