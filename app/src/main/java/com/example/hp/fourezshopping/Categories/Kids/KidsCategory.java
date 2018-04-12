package com.example.hp.fourezshopping.Categories.Kids;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
//import com.example.hp.fourezshopping.Categories.Mens.*;
//import com.example.hp.fourezshopping.Categories.Mens.ViewPagerAdapter;
import com.example.hp.fourezshopping.Adapter.Recycler_Kids;
import com.example.hp.fourezshopping.Adapter.Recycler_Kids_Adapter;
import com.example.hp.fourezshopping.Adapter.Recycler_Mens;
import com.example.hp.fourezshopping.Adapter.Recycler_Mens_Adapter;
import com.example.hp.fourezshopping.R;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class KidsCategory extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    List<Recycler_Kids> recy_mens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_category2);
      //  getSupportActionBar().setTitle("Kids Fashion");

        Recycler_Kids mens =new Recycler_Kids();
        mens.setTitle("AJ Dezines");


        // refer to string
        recy_mens = new ArrayList<>();
        recy_mens.add(new Recycler_Kids(
                "AJ Dezines",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.boysclothone,
                R.drawable.boysclothone,
                R.drawable.boysclothonefour,
                R.drawable.boysclothonethree));
        recy_mens.add(new Recycler_Kids(
                "Churidar",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlsclothsixone,
                R.drawable.girlsclothsixone,
                R.drawable.girlsclothsixtwo,
                R.drawable.girlsclothsixthree));
        recy_mens.add(new Recycler_Kids(
                "Lehenga",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlsclothfiveone,
                R.drawable.girlsclothfiveone,
                R.drawable.girlsclothfivetwo,
                R.drawable.girlsclothfivethree));
        recy_mens.add(new Recycler_Kids(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlsclothfourone,
                R.drawable.girlsclothfourone,
                R.drawable.girlsclothfourtwo,
                R.drawable.girlsclothfourthree));
        recy_mens.add(new Recycler_Kids(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlscloththreeone,
                R.drawable.girlscloththreeone,
                R.drawable.girlscloththreetwo,
                R.drawable.girlscloththreethree));
        recy_mens.add(new Recycler_Kids(
                "Choli and Dupatta ",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlsclothtwoone,
                R.drawable.girlsclothtwoone,
                R.drawable.girlsclothtwotwo,
                R.drawable.girlsclothtwothree));
        recy_mens.add(new Recycler_Kids(
                "Festive Kurta",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.boyscloththreeone,
                R.drawable.boyscloththreeone,
                R.drawable.boyscloththreetwo,
                R.drawable.boyscloththreethree));
        recy_mens.add(new Recycler_Kids(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.girlsclothfourone,
                R.drawable.girlsclothfourone,
                R.drawable.girlsclothfourtwo,
                R.drawable.girlsclothfourthree));
        recy_mens.add(new Recycler_Kids(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.babygirlclothoneone,
                R.drawable.babygirlclothoneone,
                R.drawable.babygirlclothonetwo,
                R.drawable.babygirlclothonethree));
        recy_mens.add(new Recycler_Kids(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.babygirlclothtwoone,
                R.drawable.babygirlclothtwoone,
                R.drawable.babyclothtwotwo,
                R.drawable.babygirlclothtwothree));


        RecyclerView myrecycler = (RecyclerView) findViewById(R.id.mens_recycler);
        Recycler_Kids_Adapter recyadapter = new Recycler_Kids_Adapter(this, recy_mens);
        myrecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myrecycler.setAdapter(recyadapter);

      /*  viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot ));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 4000);*/

    }


    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            KidsCategory.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if(viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });

        }
    }

}
