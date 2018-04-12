package com.example.hp.fourezshopping.Categories.Electronics;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.fourezshopping.Categories.Model.SQLiteHelper;
import com.example.hp.fourezshopping.Categories.Model.SqliteItemList;
import com.example.hp.fourezshopping.R;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Activity_Electronics extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4;
    TextView realamount,oldamount,description,details;
    Button addtocart,buynow;
    public static SQLiteHelper sqLiteHelper;
    final int REQUEST_CODE_GALLERY = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        /// getSupportActionBar().setTitle("Kids Clothing");


        img1=(ImageView)findViewById(R.id.imagefirst);
        img2=(ImageView)findViewById(R.id.imagefirstone);
        img3=(ImageView)findViewById(R.id.imagesecond);
        img4=(ImageView)findViewById(R.id.imagethird);
        realamount = (TextView)findViewById(R.id.realamount);
        oldamount = (TextView)findViewById(R.id.oldamount);
        description = (TextView)findViewById(R.id.description);
        details = (TextView)findViewById(R.id.details);
        addtocart = (Button)findViewById(R.id.btnaddtocart);
        buynow = (Button)findViewById(R.id.btnbuynow);

        oldamount.setPaintFlags(oldamount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        description.setText("Induction Cooktop  (Black, Push Button)");
        details.setText(
                "Faster Cooking\n" +
                        "Thanks to its large heating element, the 1800W Flipkart SmartBuy induction cooktop heats food 85-percent faster than regular gas stoves. As a result, it is highly efficient and aids in speeding up the cooking process.");

        Intent in = getIntent();
        final int imageone = in.getExtras().getInt("Thumbnail");
        final int imagetwo = in.getExtras().getInt("Thumbnailfirst");
        final int imagethree = in.getExtras().getInt("Thumbnailsecond");
        final int imagefour = in.getExtras().getInt("Thumbnailthird");

        img1.setImageResource(imageone);
        img2.setImageResource(imagetwo);
        img3.setImageResource(imagethree);
        img4.setImageResource(imagefour);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               img1.setImageResource(imagetwo);
                Drawable highlight = getResources().getDrawable( R.drawable.borderhighlight);
                Drawable border = getResources().getDrawable(R.drawable.border);
                img2.setBackground(highlight);
                img3.setBackground(border);
                img4.setBackground(border);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(imagethree);
                Drawable highlight = getResources().getDrawable( R.drawable.borderhighlight);
                Drawable border = getResources().getDrawable(R.drawable.border);
                img3.setBackground(highlight);
                img2.setBackground(border);
                img4.setBackground(border);
            }
        });

        img4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(imagefour);
                Drawable highlight = getResources().getDrawable( R.drawable.borderhighlight);
                Drawable border = getResources().getDrawable(R.drawable.border);
                img4.setBackground(highlight);
                img2.setBackground(border);
                img3.setBackground(border);
            }
        });
        final String text = description.getText().toString();
        final String texttwo = details.getText().toString();
        final String amount = realamount.getText().toString();

        sqLiteHelper = new SQLiteHelper(this, "FoodDB.sqlite", null, 1);

        sqLiteHelper.queryData("CREATE TABLE IF NOT EXISTS FOOD(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, price VARCHAR, image BLOB)");

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Electronics.this,"Datas : "+imageone+text+"\n"+texttwo+"\n"+amount,Toast.LENGTH_SHORT).show();
                try{
                    sqLiteHelper.insertData(
                            text,
                            amount,
                            imageViewToByte(img1)
                    );
                    Toast.makeText(getApplicationContext(), "Added successfully!", Toast.LENGTH_SHORT).show();
                    //edtName.setText("");
                    //edtPrice.setText("");
                    // imageView.setImageResource(R.mipmap.ic_launcher);
                }
                catch (Exception e){
                    e.printStackTrace();
                }


            }
        });

        buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity_Electronics.this, SqliteItemList.class);
                startActivity(in);
            }
        });

    }

    public static byte[] imageViewToByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == REQUEST_CODE_GALLERY){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_CODE_GALLERY);
            }
            else {
                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE_GALLERY && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();

            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);

                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                img1.setImageBitmap(bitmap);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
        }
    }
}
