package com.example.personalresume.fragments;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.personalresume.Data;
import com.example.personalresume.model.DemoItem;
import com.example.personalresume.adapters.EducationAdapter;
import com.example.personalresume.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {


    RecyclerView recyclerView;
    EducationAdapter adapter;

    public EducationFragment() {
        // Required empty public constructor
    }
    public static EducationFragment newInstance() {
        EducationFragment fragment = new EducationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewDemo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new EducationAdapter(this,Data.getData());
        recyclerView.setAdapter(adapter);
        return view;
    }
}