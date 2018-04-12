package com.example.hp.fourezshopping.Categories.Mens;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.fourezshopping.Adapter.Recycler_Kids;
import com.example.hp.fourezshopping.Adapter.Recycler_Kids_Adapter;
import com.example.hp.fourezshopping.Adapter.Recycler_Mens;
import com.example.hp.fourezshopping.Adapter.Recycler_Mens_Adapter;
import com.example.hp.fourezshopping.Adapter.Recycler_Womens;
import com.example.hp.fourezshopping.Adapter.Recycler_Womens_Adapter;
import com.example.hp.fourezshopping.R;

import java.util.ArrayList;
import java.util.List;

public class MensCategory extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    List<Recycler_Mens> recy_mens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_category);
        getSupportActionBar().setTitle("Mens Fashion");
        recy_mens = new ArrayList<>();
        recy_mens.add(new Recycler_Mens(
                "AJ Dezines",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothnineone,
                R.drawable.mensclothnineone,
                R.drawable.mensclothninetwo,
                R.drawable.mensclothninethree));
        recy_mens.add(new Recycler_Mens(
                "Churidar",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclotheightone,
                R.drawable.mensclotheightone,
                R.drawable.mensclotheighttwo,
                R.drawable.mensclotheightthree));
        recy_mens.add(new Recycler_Mens(
                "Lehenga",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothsevenone,
                R.drawable.mensclothsevenone,
                R.drawable.mensclothseventwo,
                R.drawable.mensclothseventhree));
        recy_mens.add(new Recycler_Mens(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothoneone,
                R.drawable.mensclothoneone,
                R.drawable.mensclothonetwo,
                R.drawable.mensclothonethree));
        recy_mens.add(new Recycler_Mens(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothtwoone,
                R.drawable.mensclothtwoone,
                R.drawable.mensclothtwotwo,
                R.drawable.mensclothtwothree));
        recy_mens.add(new Recycler_Mens(
                "Choli and Dupatta ",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensthreeone,
                R.drawable.mensthreeone,
                R.drawable.mensthreetwo,
                R.drawable.mensthreethree));
        recy_mens.add(new Recycler_Mens(
                "Festive Kurta",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothfourone,
                R.drawable.mensclothfourone,
                R.drawable.mensclothfourtwo,
                R.drawable.mensclothfourthree));
        recy_mens.add(new Recycler_Mens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothfiveone,
                R.drawable.mensclothfiveone,
                R.drawable.mensclothfivetwo,
                R.drawable.mensclothfivethree));
        recy_mens.add(new Recycler_Mens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothsixone,
                R.drawable.mensclothsixone,
                R.drawable.mensclothsixtwo,
                R.drawable.mensclothsixthree));
        recy_mens.add(new Recycler_Mens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mensclothsevenone,
                R.drawable.mensclothsevenone,
                R.drawable.mensclothseventwo,
                R.drawable.mensclothseventhree));

        RecyclerView myrecycler = (RecyclerView) findViewById(R.id.mens_recycler);
        Recycler_Mens_Adapter recyadapter = new Recycler_Mens_Adapter(this, recy_mens);
        myrecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myrecycler.setAdapter(recyadapter);

    }


//        viewPager = (ViewPager) findViewById(R.id.viewPager);
//
//        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);
//
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
//
//        viewPager.setAdapter(viewPagerAdapter);
//
//        dotscount = viewPagerAdapter.getCount();
//        dots = new ImageView[dotscount];
//
//        for(int i = 0; i < dotscount; i++){
//
//            dots[i] = new ImageView(this);
//            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
//
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//            params.setMargins(8, 0, 8, 0);
//
//            sliderDotspanel.addView(dots[i], params);
//
//        }
//
//        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
//
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//                for(int i = 0; i< dotscount; i++){
//                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
//                }
//
//                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot ));
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 4000);



//    public class MyTimerTask extends TimerTask {
//
//        @Override
//        public void run() {
//
//            MensCategory.this.runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//
//                    if(viewPager.getCurrentItem() == 0){
//                        viewPager.setCurrentItem(1);
//                    } else if(viewPager.getCurrentItem() == 1){
//                        viewPager.setCurrentItem(2);
//                    } else {
//                        viewPager.setCurrentItem(0);
//                    }
//
//                }
//            });
//
//        }
//    }



}
