package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonRecyclerAdapter extends RecyclerView.Adapter<personViewHolder> {
    List<person> personList;
    Context context;

    public PersonRecyclerAdapter(List<person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public personViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View personItem= LayoutInflater.from(context).inflate(R.layout.person_item,parent,false);
        return new personViewHolder(personItem);
    }

    @Override
    public void onBindViewHolder(@NonNull personViewHolder holder, int position) {
        holder.personName.setText(personList.get(position).personName);
        holder.personInfo.setText(personList.get(position).personInfo);
        holder.personImage.setImageResource(personList.get(position).imageId);

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
