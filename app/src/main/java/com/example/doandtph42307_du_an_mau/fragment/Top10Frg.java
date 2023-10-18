package com.example.doandtph42307_du_an_mau.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doandtph42307_du_an_mau.DAO.ThongKeDao;
import com.example.doandtph42307_du_an_mau.R;
import com.example.doandtph42307_du_an_mau.adapter.Top10Adapter;
import com.example.doandtph42307_du_an_mau.model.Sach;

import java.util.ArrayList;


public class Top10Frg extends Fragment {


    public Top10Frg() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.fragment_top10_frg, container, false);
        RecyclerView rcvTop10 = view.findViewById(R.id.rcvTop10);

        ThongKeDao thongKeDAO = new ThongKeDao(getContext());
        ArrayList<Sach> list = thongKeDAO.getTop10();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rcvTop10.setLayoutManager(layoutManager);
        Top10Adapter adapter = new Top10Adapter(getContext(),list);
        rcvTop10.setAdapter(adapter);
        return view;
    }
}