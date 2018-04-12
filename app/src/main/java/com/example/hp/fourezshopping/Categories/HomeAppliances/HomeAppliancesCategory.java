package com.example.hp.fourezshopping.Categories.HomeAppliances;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.fourezshopping.Adapter.Recycler_HomeAppliances;
import com.example.hp.fourezshopping.Adapter.Recycler_HomeAppliances_Adapter;
import com.example.hp.fourezshopping.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAppliancesCategory extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    List<Recycler_HomeAppliances> recy_homeappliances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_category);
        getSupportActionBar().setTitle("HomeAppliances");

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

        recy_homeappliances = new ArrayList<>();
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "AJ Dezines",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancesnineone,
                R.drawable.homeappliancesnineone,
                R.drawable.homeappliancesninetwo,
                R.drawable.homeappliancesninethree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Churidar",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancestwoone,
                R.drawable.homeappliancestwoone,
                R.drawable.homeappliancestwotwo,
                R.drawable.homeappliancestwothree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Lehenga",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancesthreeone,
                R.drawable.homeappliancesthreeone,
                R.drawable.homeappliancesthreetwo,
                R.drawable.homeappliancesthreethree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancesfourone,
                R.drawable.homeappliancesfourone,
                R.drawable.homeappliancesfourtwo,
                R.drawable.homeappliancesfourthree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancesfiveone,
                R.drawable.homeappliancesfiveone,
                R.drawable.homeappliancesfivetwo,
                R.drawable.homeappliancesfivethree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Choli and Dupatta ",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancessixone,
                R.drawable.homeappliancessixone,
                R.drawable.homeappliancessixtwo,
                R.drawable.homeappliancessixthree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Festive Kurta",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancessevenone,
                R.drawable.homeappliancessevenone,
                R.drawable.homeappliancesseventwo,
                R.drawable.homeappliancesseventhree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeapplianceseightone,
                R.drawable.homeapplianceseightone,
                R.drawable.homeapplianceseighttwo,
                R.drawable.homeapplianceseightthree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancesnineone,
                R.drawable.homeappliancesnineone,
                R.drawable.homeappliancesninetwo,
                R.drawable.homeappliancesninethree));
        recy_homeappliances.add(new Recycler_HomeAppliances(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.homeappliancestenone,
                R.drawable.homeappliancestenone,
                R.drawable.homeappliancestentwo,
                R.drawable.homeappliancestenthree));

        RecyclerView myrecycler = (RecyclerView) findViewById(R.id.mens_recycler);
        Recycler_HomeAppliances_Adapter recyadapter = new Recycler_HomeAppliances_Adapter(this, recy_homeappliances);
        myrecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myrecycler.setAdapter(recyadapter);

    }


//    public class MyTimerTask extends TimerTask {
//
//        @Override
//        public void run() {
//
//            HomeAppliancesCategory.this.runOnUiThread(new Runnable() {
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
