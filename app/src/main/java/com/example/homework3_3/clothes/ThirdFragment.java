package com.example.homework3_3.clothes;

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

import java.util.ArrayList;


public class ThirdFragment extends Fragment {
    private ArrayList<String> listClothes = new ArrayList<>();
    private RecyclerView rvClothes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvClothes = requireActivity().findViewById(R.id.rv_clothes);
        loadData();
        ClothesAdapter clothesAdapter = new ClothesAdapter(listClothes);
        rvClothes.setAdapter(clothesAdapter);

    }

    private void loadData() {
        listClothes.add("Shirt");
        listClothes.add("Coat");
        listClothes.add("Jeans");
        listClothes.add("Hat");
        listClothes.add("Jacket");
        listClothes.add("Shoes");
        listClothes.add("Trousers");
        listClothes.add("Short");
        listClothes.add("Socks");
        listClothes.add("Dress");
        listClothes.add("Cap");
        listClothes.add("Skirt");
        listClothes.add("T-shirt");
        listClothes.add("Pants");
    }
}