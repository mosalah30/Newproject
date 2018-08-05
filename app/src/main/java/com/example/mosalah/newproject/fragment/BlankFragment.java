package com.example.mosalah.newproject.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mosalah.newproject.model.user;
import com.example.mosalah.newproject.activite.MainActivity;
import com.example.mosalah.newproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {

    private EditText editText;
    private Button button;
    private int o;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        editText = view.findViewById(R.id.f_e_t);
        button = view.findViewById(R.id.f1_b);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        try
        {
        o =Integer.parseInt( editText.getText().toString());
        user h= new user();
        h.setId(o);
        MainActivity.my.information().Delete(h);
    }catch (Exception e){
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }}
}
