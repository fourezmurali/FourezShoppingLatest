package com.example.hp.fourezshopping.Categories.Electronics;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.fourezshopping.Adapter.Recycler_Electronics;
import com.example.hp.fourezshopping.Adapter.Recycler_Electronics_Adapter;
import com.example.hp.fourezshopping.R;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsCategory extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    List<Recycler_Electronics> recy_electronics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_category);
        getSupportActionBar().setTitle("Electronics");

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

        recy_electronics = new ArrayList<>();
        recy_electronics.add(new Recycler_Electronics(
                "Samsung Galaxy J7 Prime 2 (Gold, 32 GB)  (3 GB RAM)",
                "\n" +
                        ". 3 GB RAM | 32 GB ROM |\n" +
                        ". 5.5 inch Full HD Display\n" +
                        ". 13MP Rear Camera | 13MP Front Camera\n" +
                        ". 3300 mAh Li-ion Battery\n" +
                        ". Exynos Processor",
                "Description T-shirt",
                R.drawable.electronicstwoone,
                R.drawable.electronicstwoone,
                R.drawable.electronicstwotwo,
                R.drawable.electronicstwothree));
        recy_electronics.add(new Recycler_Electronics(
                "Churidar",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicsthreeone,
                R.drawable.electronicsthreeone,
                R.drawable.electronicsthreetwo,
                R.drawable.electronicsthreethree));
        recy_electronics.add(new Recycler_Electronics(
                "Induction Cooktop  (Black, Push Button",
                "Faster Cooking\n" +
                        "Thanks to its large heating element\n " +
                        "the 1800W Flipkart SmartBuy induction cooktop heats food 85-percent faster than regular gas stoves.\n" +
                        "As a result, it is highly efficient and aids in speeding up the cooking process.",
                "Description T-shirt",
                R.drawable.electronicsfourone,
                R.drawable.electronicsfourone,
                R.drawable.electronicsfourtwo,
                R.drawable.electronicsfourthree));
        recy_electronics.add(new Recycler_Electronics(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicsfiveone,
                R.drawable.electronicsfiveone,
                R.drawable.electronicsfivetwo,
                R.drawable.electronicsfivethree));
        recy_electronics.add(new Recycler_Electronics(
                "Party Dress",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicssixone,
                R.drawable.electronicssixone,
                R.drawable.electronicssixtwo,
                R.drawable.electronicssixthree));
        recy_electronics.add(new Recycler_Electronics(
                "Choli and Dupatta ",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicssevenone,
                R.drawable.electronicssevenone,
                R.drawable.electronicsseventwo,
                R.drawable.electronicsseventhree));
        recy_electronics.add(new Recycler_Electronics(
                "Festive Kurta",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicseightone,
                R.drawable.electronicseightone,
                R.drawable.electronicseighttwo,
                R.drawable.electronicseightthree));
        recy_electronics.add(new Recycler_Electronics(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicsnineone,
                R.drawable.electronicsnineone,
                R.drawable.electronicsninetwo,
                R.drawable.electronicsninethree));
        recy_electronics.add(new Recycler_Electronics(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.mobileoneone,
                R.drawable.mobileoneone,
                R.drawable.mobileonetwo,
                R.drawable.mobileonethree));
        recy_electronics.add(new Recycler_Electronics(
                "Midi/Knee",
                "Comfort : Best Fashionably Comfortable Printed Tshirt that you have wore till now\n" +
                        "Combine the T shirts with Jeans or Lowers to complete your look\n" +
                        "Sleeve Type: Full Sleeve ; Neck type crew Neck: Fitting Type: Regular Fit Tshirt; Occasion: Casual T-Shirt\n" +
                        "Quality :All garments are subjected to the following tests Fabric dimensional stability test and print quality inspection for colours and wash fastness\n" +
                        "Care Instructions: Wash with similar colors in cold water, Check the Size chart to get Perfect fit for you!",
                "Description T-shirt",
                R.drawable.electronicstenone,
                R.drawable.electronicstenone,
                R.drawable.electronicstentwo,
                R.drawable.electronicstenthree));

        RecyclerView myrecycler = (RecyclerView) findViewById(R.id.mens_recycler);
        Recycler_Electronics_Adapter recyadapter = new Recycler_Electronics_Adapter(this, recy_electronics);
        myrecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myrecycler.setAdapter(recyadapter);

    }


//    public class MyTimerTask extends TimerTask {
//
//        @Override
//        public void run() {
//
//            ElectronicsCategory.this.runOnUiThread(new Runnable() {
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
