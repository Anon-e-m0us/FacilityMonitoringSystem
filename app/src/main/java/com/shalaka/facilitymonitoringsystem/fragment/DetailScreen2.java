package com.shalaka.facilitymonitoringsystem.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.shalaka.facilitymonitoringsystem.R;

public class DetailScreen2 extends Fragment {
    Button btnPrev,btnNext1;
    EditText upr1;
    Switch s1;
    View view;
    public DetailScreen2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.screen2_detail, container, false);
        upr1=view.findViewById(R.id.power_delay);
        upr1.setEnabled(false);

        btnPrev = view.findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailScreen1 assetDetailFragment = new DetailScreen1();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container,assetDetailFragment,null);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();
            }
        });

        btnNext1 = view.findViewById(R.id.btnNext1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailScreen3 BlankFragment = new DetailScreen3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container,BlankFragment,null);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();
            }
        });

        s1=view.findViewById(R.id.switch1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (s1.isChecked()) {
                    upr1.setEnabled(true);
                    upr1.setInputType(InputType.TYPE_CLASS_NUMBER);
                    upr1.setFocusable(true);
                } else {upr1.setEnabled(false);

                }
            }
        });
        return view;
    }

}
