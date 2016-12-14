package com.tp.demo_bganimation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private AnimBGView iv_bg;
    private int mScreenWidth;

    private void initView() {
        iv_bg = (AnimBGView) findViewById(R.id.iv_bg);
        mScreenWidth = getResources().getDisplayMetrics().widthPixels;
    }

    public void start(View v) {
        int x = iv_bg.getWidth() - mScreenWidth;
        TranslateAnimation anim = new TranslateAnimation(0, -x, 0, 0);
        anim.setDuration(8000);
        iv_bg.startAnimation(anim);
    }
}
