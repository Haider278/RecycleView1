package com.example.myrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class personViewHolder extends RecyclerView.ViewHolder {
    ImageView personImage;
    TextView personName,personInfo;

    public personViewHolder(@NonNull View itemView) {
        super(itemView);
        personImage=itemView.findViewById(R.id.personImage);
        personName=itemView.findViewById(R.id.personName);
        personInfo=itemView.findViewById(R.id.personInfo);
    }
}
