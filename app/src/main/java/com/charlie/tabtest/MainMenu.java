package com.charlie.tabtest;

import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.charlie.tabtest.R;
import com.charlie.tabtest.OneFragment;
import com.charlie.tabtest.TwoFragment;
import com.charlie.tabtest.ThreeFragment;
import com.charlie.tabtest.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Charlie on 3/10/2016.
 */
public class MainMenu extends AppCompatActivity {
ImageButton calendar;
    ImageButton fb;
    ImageButton tw;
    ImageButton goodies;
    ImageButton inst;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            calendar = (ImageButton) findViewById(R.id.button);
            fb = (ImageButton) findViewById(R.id.fbButton);
            tw= (ImageButton) findViewById(R.id.twButton);
            goodies = (ImageButton) findViewById(R.id.deButton);
            inst = (ImageButton) findViewById(R.id.instaButton);

            calendar.setOnClickListener(sch);
            fb.setOnClickListener(faceBook);
            tw.setOnClickListener(twitter);
            inst.setOnClickListener(insta);
            goodies.setOnClickListener(good);





    }
    View.OnClickListener sch = new View.OnClickListener(){

        public void onClick(View v){

            Intent navi = new Intent(getApplicationContext(),MainActivity.class );
            startActivityForResult(navi, 0);

        }

    };
    View.OnClickListener good = new View.OnClickListener(){

        public void onClick(View v){

            Intent navi = new Intent(getApplicationContext(),Merch.class );
            startActivityForResult(navi, 0);

        }

    };
    View.OnClickListener faceBook = new View.OnClickListener(){

     public void onClick(View v){



             startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Dance-Excellence-116261978439678/")));

         }



    };
    View.OnClickListener twitter = new View.OnClickListener(){

        public void onClick(View v){



                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/danceexcellence")));


        }
    };
    View.OnClickListener insta = new View.OnClickListener(){

        public void onClick(View v){



            Uri uri = Uri.parse("http://instagram.com/_u/DanceExcellence");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/2256863879")));
            }catch (Exception e){}












        }


    };

}