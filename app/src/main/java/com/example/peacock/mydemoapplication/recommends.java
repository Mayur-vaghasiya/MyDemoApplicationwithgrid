package com.example.peacock.mydemoapplication;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.ArrayList;

/**
 * Created by peacock on 6/15/16.
 */
public class recommends extends Fragment  {
    private RecyclerView recyclerview;
    private ArrayList<item> itemlist;
    private Rvadapter adapter;
    private RVadapter rvadapter;

    Activity mactivity;

    public recommends() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mactivity = activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        itemlist = new ArrayList<item>();

        itemlist.add(new item("car Rentals", R.drawable.car2564, R.drawable.car1));
        itemlist.add(new item("Air Service", R.drawable.airplane564, R.drawable.plane));
        itemlist.add(new item("Grocery", R.drawable.cart1, R.drawable.images));

        itemlist.add(new item("Mechanic", R.drawable.wrench, R.drawable.mechanic));
        itemlist.add(new item("Chemists", R.drawable.pill64, R.drawable.chemistshop));
        itemlist.add(new item("Taxi", R.drawable.car64, R.drawable.taxi));

        itemlist.add(new item("Mobile Recharge", R.drawable.smartphone, R.drawable.sunday));
        itemlist.add(new item("Educations", R.drawable.graduationcap, R.drawable.scho));
        itemlist.add(new item("Shoppings", R.drawable.cart, R.drawable.shopping));

        itemlist.add(new item("Beauty Care", R.drawable.beauty, R.drawable.skincareimage));
        itemlist.add(new item("Restaurant", R.drawable.restaurant, R.drawable.res));
        itemlist.add(new item("Doctor", R.drawable.steth, R.drawable.docter));

        itemlist.add(new item("Mobile Recharge", R.drawable.smartphone, R.drawable.sunday));
        itemlist.add(new item("Educations", R.drawable.graduationcap, R.drawable.scho));
        itemlist.add(new item("Shoppings", R.drawable.cart, R.drawable.shopping));

        itemlist.add(new item("car Rentals", R.drawable.car2564, R.drawable.car1));
        itemlist.add(new item("Air Service", R.drawable.airplane564, R.drawable.plane));
        itemlist.add(new item("Grocery", R.drawable.cart1, R.drawable.images));

        itemlist.add(new item("Mechanic", R.drawable.wrench, R.drawable.mechanic));
        itemlist.add(new item("Chemists", R.drawable.pill64, R.drawable.chemistshop));
        itemlist.add(new item("Taxi", R.drawable.car64, R.drawable.taxi));


        itemlist.add(new item("Beauty Care", R.drawable.beauty, R.drawable.skincareimage));
        itemlist.add(new item("Restaurant", R.drawable.restaurant, R.drawable.res));
        itemlist.add(new item("Doctor", R.drawable.steth, R.drawable.docter));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //   return inflater.inflate(R.layout.recommend1, container, false);
        View view = inflater.inflate(R.layout.recommend1, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerlist);
        recyclerview.setHasFixedSize(true);

        setlayout();

        ((Switch)mactivity.findViewById(R.id.switch_btn)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    recyclerview.setLayoutManager(linearLayoutManager);

                    rvadapter = new RVadapter(getActivity(), itemlist);
                    recyclerview.setAdapter(rvadapter);
                } else {
                    setlayout();
                }
            }
        });
        return view;
    }


    public void setlayout() {
        final GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerview.setLayoutManager(layoutManager);

        if (getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        } else {
            recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        }
        adapter = new Rvadapter(getActivity(), itemlist);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}