package com.example.wallpaperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
public class MainActivity extends AppCompatActivity {
    Animation fade_in, fade_out; //muutujate fade_in, fade_out lisamine
    ViewFlipper viewFlipper; //muutuja viewFlipper lisamine
    @Override
    //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //võtab layoutiks activity_maini

        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1); //otsib projektist üles bckgrndViewFlipper1
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in); //otsib projektist üles fade_in
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out); //otsib projektist üles fade_out
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);

//sets auto flipping
        viewFlipper.setAutoStart(true); //programm käivitub
        viewFlipper.setFlipInterval(5000); //pildi vahetus peale igat viiendat sekundit
        viewFlipper.startFlipping(); //vahetab pilti
    }
}
