package com.example.mosalah.newproject.fragment;


import android.os.Bundle;
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
public class BlankFragment2 extends Fragment {
    private Button hg;
    private EditText id, pass, job;
    private int idd;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        id = view.findViewById(R.id.f2_id);
        pass = view.findViewById(R.id.f2_pass);
        job = view.findViewById(R.id.f2_job);
        hg =view.findViewById(R.id.f2_button);
        hg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                idd = Integer.parseInt(id.getText().toString());
                String passs = pass.getText().toString();
                String joob = job.getText().toString();
                user u = new user();
                u.setId(idd);
                u.setPass(passs);
                u.setJob(joob);
                MainActivity.my.information().Update(u);

                    Toast.makeText(getContext(),"Update",Toast.LENGTH_LONG).show();


                }
                catch (Exception e){
                    Toast.makeText(getContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }

}
