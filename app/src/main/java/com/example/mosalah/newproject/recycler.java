package com.example.mosalah.newproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.mosalah.newproject.model.model;

public class recycler extends RecyclerView.Adapter<recycler.adapter> {

    private ArrayList<model> arrayList;

    public recycler( ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater .inflate(R.layout.listmodel, parent,false);
        return new adapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter holder, int position) {
        model model = arrayList.get(position);
        holder.age.setText(model.getAge());
        holder.id.setText(model.getId());
        holder.name.setText(model.getName());
        holder.pass.setText(model.getPass());
        holder.job.setText(model.getJob());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class adapter extends RecyclerView.ViewHolder {
        TextView id, name, pass, job, age;

        adapter(View itemView) {
            super(itemView);
            job = itemView.findViewById(R.id.Li_c_job);
            name = itemView.findViewById(R.id.Li_c_name);
            age = itemView.findViewById(R.id.Li_c_age);
            id = itemView.findViewById(R.id.Li_c_id);
            pass = itemView.findViewById(R.id.Li_c_pass);
        }
    }


}
