package com.example.hp.fourezshopping.Categories.Model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.fourezshopping.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Quoc Nguyen on 13-Dec-16.
 */

public class SqliteItemListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Sqlite_Item> foodsList;
    private ArrayList<Sqlite_Item> listsave = new ArrayList<>();
    int minteger = 0;
    private ViewHolder holder;
    private View row;

    // TextView displayInteger;

    public SqliteItemListAdapter(Context context, int layout, ArrayList<Sqlite_Item> foodsList) {
        this.context = context;
        this.layout = layout;
        this.foodsList = foodsList;
    }

    @Override
    public int getCount() {
        return foodsList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView txtName, txtPrice, test, integernumber, displayInteger,texttotalprice;
        Button increase, decrease;

    }


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        row = view;
        holder = new ViewHolder();
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);
            holder.txtName = (TextView) row.findViewById(R.id.txtName);
            holder.txtPrice = (TextView) row.findViewById(R.id.txtPrice);
            holder.imageView = (ImageView) row.findViewById(R.id.imgFood);
            holder.test = (TextView) row.findViewById(R.id.test);
            holder.increase = (Button) row.findViewById(R.id.increase);
            holder.decrease = (Button) row.findViewById(R.id.decrease);
            holder.displayInteger = (TextView) row.findViewById(R.id.integer_number);
            holder.texttotalprice = (TextView)row.findViewById(R.id.texttotalamount);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();

        }

        if (foodsList != null && foodsList.size() != 0) {
            final Sqlite_Item food = foodsList.get(position);
            holder.txtName.setText(food.getName());
            holder.txtPrice.setText(food.getPrice());
            //int textprice = Integer.valueOf(holder.txtPrice.setText(food.getPrice());
            final byte[] foodImage = food.getImage();
            Bitmap bitmap = BitmapFactory.decodeByteArray(foodImage, 0, foodImage.length);
            holder.imageView.setImageBitmap(bitmap);
            holder.displayInteger.setText(food.getQty());
            //final int totalamount = Integer.valueOf(holder.texttotalprice.getText().toString());
          // final int textprice = Integer.valueOf(holder.txtPrice.getText().toString()) ;

            //int textprice = Integer.valueOf();

            holder.increase.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (foodsList.get(position).getQty().isEmpty()) {
                        minteger = 1;
                        minteger = minteger + 1;
                       //holder.txtPrice.setText(minteger*textprice);
                    } else {
                        minteger = Integer.valueOf(foodsList.get(position).getQty()) + 1;
                       // minteger = Integer.valueOf(foodsList.get(position).getQty()) + 1;
                    }
                    for (int i = 0; i < foodsList.size(); i++) {
                        if (position == i) {
                            foodsList.get(position).setQty("" + minteger);
                            Toast.makeText(context,"Total Purchase Price is : "+minteger,Toast.LENGTH_SHORT).show();
                            foodsList.get(position).setPrice(""+minteger);
                        }
                    }
                    notifyDataSetChanged();
                }
            });
            holder.decrease.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (minteger >= 1) {
                        if (foodsList.get(position).getQty().isEmpty()) {
                            minteger = 0;
                            minteger = minteger - 1;
                        } else {
                            minteger = Integer.valueOf(foodsList.get(position).getQty()) - 1;
                        }
                        for (int i = 0; i < foodsList.size(); i++) {
                            if (position == i) {
                                foodsList.get(position).setQty("" + minteger);

                            }
                        }
                        notifyDataSetChanged();
                    }
                }
            });

        }

        return row;
    }


}