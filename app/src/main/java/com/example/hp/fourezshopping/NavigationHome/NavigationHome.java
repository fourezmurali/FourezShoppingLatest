package com.example.hp.fourezshopping.NavigationHome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.fourezshopping.Categories.Electronics.ElectronicsCategory;
import com.example.hp.fourezshopping.Categories.HomeAppliances.HomeAppliancesCategory;
import com.example.hp.fourezshopping.Categories.Kids.KidsCategory;
import com.example.hp.fourezshopping.Categories.Mens.MensCategory;
import com.example.hp.fourezshopping.Categories.Model.SqliteItemList;
import com.example.hp.fourezshopping.Categories.Womens.WomensCategory;
import com.example.hp.fourezshopping.MyCart;
import com.example.hp.fourezshopping.R;

import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.hp.fourezshopping.R.id.*;

public class NavigationHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    CircleImageView mencategory,womencategory,kidscategory;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mencategory = (CircleImageView) findViewById(R.id.men);
        womencategory = (CircleImageView) findViewById(R.id.women);
        kidscategory = (CircleImageView) findViewById(R.id.kids);


        mencategory();
        womencategory();
        kidscategory();

//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(SliderDots);

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
        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 4000);

    }

    private void kidscategory() {
        kidscategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kidsin = new Intent(NavigationHome.this,KidsCategory.class);
                startActivity(kidsin);
            }
        });
    }

    private void womencategory() {
        womencategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent womensin = new Intent(NavigationHome.this,WomensCategory.class);
                startActivity(womensin);
            }
        });
    }

    private void mencategory() {

        mencategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensin = new Intent(NavigationHome.this,MensCategory.class);
                startActivity(mensin);
            }
        });

    }


    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            NavigationHome.this.runOnUiThread(new Runnable() {
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == home) {
            // Handle the camera action
            Intent in = new Intent(NavigationHome.this, NavigationHome.class);
            startActivity(in);
        } else if (id == men) {
            Intent in = new Intent(NavigationHome.this, MensCategory.class);
            startActivity(in);

        } else if (id == women) {
            Intent in = new Intent(NavigationHome.this, WomensCategory.class);
            startActivity(in);

        } else if (id == kid) {
            Intent in = new Intent(NavigationHome.this, KidsCategory.class);
            startActivity(in);

        } else if (id == electronics) {
            Intent in = new Intent(NavigationHome.this, ElectronicsCategory.class);
            startActivity(in);

        }else if (id == cart) {
//            Intent in = new Intent(NavigationHome.this,SqliteItemList.class);
//            startActivity(in);

        } else switch (id) {
            case homeappliances:
                Intent in = new Intent(NavigationHome.this, HomeAppliancesCategory.class);
                startActivity(in);

                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
