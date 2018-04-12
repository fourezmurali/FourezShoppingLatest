package com.example.hp.fourezshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.fourezshopping.Categories.Electronics.Activity_Electronics;
import com.example.hp.fourezshopping.Categories.Model.SQLiteHelper;
import com.example.hp.fourezshopping.R;
import com.like.LikeButton;
import com.like.OnLikeListener;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import static android.app.Activity.RESULT_OK;

/**
 * Created by HP on 19/03/2018.
 */

public class Recycler_Electronics_Adapter extends RecyclerView.Adapter<Recycler_Electronics_Adapter.MyViewHolder> {

    private Context context;
    private List<Recycler_Electronics> mData;
    public static SQLiteHelper sqLiteHelper;
    final int REQUEST_CODE_GALLERY = 999;
    ImageView img1;

    private int flag = 0;

    public Recycler_Electronics_Adapter(Context context, List<Recycler_Electronics> mData) {
        this.context = context;
        this.mData = mData;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater= LayoutInflater.from(context);
        view=mInflater.inflate(R.layout.cardview_electronics_collection,parent,false);
        return new MyViewHolder(view);
    }



    public static byte[] imageViewToByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.collection_title.setText(mData.get(position).getTitle());
        holder.collection_image.setImageResource(mData.get(position).getThumbnail());
        img1 = (ImageView)holder.cardView.findViewById(R.id.mens_collection_image);


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


        final String text = holder.collection_title.getText().toString();
        final String amount = "Price";
        //final


        sqLiteHelper = new SQLiteHelper(context, "FoodDB.sqlite", null, 1);

        sqLiteHelper.queryData("CREATE TABLE IF NOT EXISTS WISHLIST(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, price VARCHAR, image BLOB)");


        holder.wish.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
               // Toast.makeText(context, "Added to WishList", Toast.LENGTH_SHORT).show();

                try{
                    sqLiteHelper.insertData(
                            text,
                            amount,
                            imageViewToByte(img1)
                    );

                    Toast.makeText(context, "Added successfully!", Toast.LENGTH_SHORT).show();

                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }

            @Override
            public void unLiked(LikeButton likeButton) {
                Toast.makeText(context, "Deleted From WishList", Toast.LENGTH_SHORT).show();
            }
        });



//        holder.wish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView collection_title;
        ImageView collection_image;

        CardView cardView;
        LikeButton wish;



        public MyViewHolder(View itemView) {
            super(itemView);

            collection_title=(TextView)itemView.findViewById(R.id.image_title);
            collection_image=(ImageView)itemView.findViewById(R.id.mens_collection_image);
            cardView=(CardView)itemView.findViewById(R.id.mens_cardview_id);
            wish = (LikeButton)itemView.findViewById(R.id.star_button);

        }



        @Override
        public void onClick(View view) {

        }


    }

}
