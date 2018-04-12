package com.example.hp.fourezshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.fourezshopping.R;
import com.like.LikeButton;

import java.util.List;

/**
 * Created by HP on 19/03/2018.
 */

public class Recycler_HomeAppliances_Adapter extends RecyclerView.Adapter<Recycler_HomeAppliances_Adapter.MyViewHolder> {

    private Context context;
    private List<Recycler_HomeAppliances> mData;

    public Recycler_HomeAppliances_Adapter(Context context, List<Recycler_HomeAppliances> mData) {
        this.context = context;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater= LayoutInflater.from(context);
        view=mInflater.inflate(R.layout.cardview_homeappliances_collection,parent,false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.collection_title.setText(mData.get(position).getTitle());
        holder.collection_image.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(context,Activity_Intermediate.class);
                in.putExtra("Thumbnail",mData.get(position).getThumbnail());
                in.putExtra("Thumbnailfirst",mData.get(position).getThumbnailfirst());
                in.putExtra("Thumbnailsecond",mData.get(position).getThumbnailsecond());
                in.putExtra("Thumbnailthird",mData.get(position).getThumbnailthird());
                context.startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        LikeButton wishbutton;
        TextView collection_title;
        ImageView collection_image;

        CardView cardView;



        public MyViewHolder(View itemView) {
            super(itemView);

            collection_title=(TextView)itemView.findViewById(R.id.image_title);
            collection_image=(ImageView)itemView.findViewById(R.id.mens_collection_image);
            cardView=(CardView)itemView.findViewById(R.id.mens_cardview_id);
           // wishbutton=(LikeButton)itemView.findViewById(R.id.)


        }

        @Override
        public void onClick(View view) {

        }
    }

}
