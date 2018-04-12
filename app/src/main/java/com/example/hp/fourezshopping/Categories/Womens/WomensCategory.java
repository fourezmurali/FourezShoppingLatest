package com.example.hp.fourezshopping.Categories.Womens;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.fourezshopping.Adapter.Recycler_Kids;
import com.example.hp.fourezshopping.Adapter.Recycler_Kids_Adapter;
import com.example.hp.fourezshopping.Adapter.Recycler_Womens;
import com.example.hp.fourezshopping.Adapter.Recycler_Womens_Adapter;
import com.example.hp.fourezshopping.R;

import java.util.ArrayList;
import java.util.List;

public class WomensCategory extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    List<Recycler_Womens> recy_mens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens_category);
        getSupportActionBar().setTitle("Womens Fashion");
        viewPager = (ViewPager) findViewById(R.id.viewPager);

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

        recy_mens = new ArrayList<>();
        recy_mens.add(new Recycler_Womens(
                "AJ Dezines",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothoneone,
                R.drawable.womensclothoneone,
                R.drawable.womensclothonetwo,
                R.drawable.womensclothonethree));
        recy_mens.add(new Recycler_Womens(
                "Churidar",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothtwoone,
                R.drawable.womensclothtwoone,
                R.drawable.womensclothtwotwo,
                R.drawable.womensclothtwothree));
        recy_mens.add(new Recycler_Womens(
                "Lehenga",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womenscloththreeone,
                R.drawable.womenscloththreeone,
                R.drawable.womenscloththreetwo,
                R.drawable.womrnscloththreetwo));
        recy_mens.add(new Recycler_Womens(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothfourone,
                R.drawable.womensclothfourone,
                R.drawable.womensclothfourtwo,
                R.drawable.womensclothfourthree));
        recy_mens.add(new Recycler_Womens(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothfiveone,
                R.drawable.womensclothfiveone,
                R.drawable.womensclothfivetwo,
                R.drawable.womensclothfivethree));
        recy_mens.add(new Recycler_Womens(
                "Choli and Dupatta ",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothsixone,
                R.drawable.womensclothsixone,
                R.drawable.womensclothsixtwo,
                R.drawable.womensclothsixthree));
        recy_mens.add(new Recycler_Womens(
                "Festive Kurta",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothsevenone,
                R.drawable.womensclothsevenone,
                R.drawable.womensclothseventwo,
                R.drawable.womensclothseventhree));
        recy_mens.add(new Recycler_Womens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclotheightone,
                R.drawable.womensclotheightone,
                R.drawable.womensclotheighttwo,
                R.drawable.womensclotheightthree));
        recy_mens.add(new Recycler_Womens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothnineone,
                R.drawable.womensclothnineone,
                R.drawable.womensclothninetwo,
                R.drawable.womensclothninethree));
        recy_mens.add(new Recycler_Womens(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.womensclothoneone,
                R.drawable.womensclothoneone,
                R.drawable.womensclothonetwo,
                R.drawable.womensclothonethree));

        RecyclerView myrecycler = (RecyclerView) findViewById(R.id.mens_recycler);
        Recycler_Womens_Adapter recyadapter = new Recycler_Womens_Adapter(this, recy_mens);
        myrecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myrecycler.setAdapter(recyadapter);

    }


//    public class MyTimerTask extends TimerTask {
//
//        @Override
//        public void run() {
//
//            WomensCategory.this.runOnUiThread(new Runnable() {
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
