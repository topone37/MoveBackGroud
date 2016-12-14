package com.tp.demo_bganimation;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

/**
 * Created by root on 16-12-14.
 */

public class AnimBGView extends ImageView {

    private Context mContext;
    private int mHeight;
    private int mWidth;

    public int getmHeight() {
        return mHeight;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public int getmWidth() {
        return mWidth;
    }

    public void setmWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public AnimBGView(Context context) {
        this(context, null);
    }

    public AnimBGView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimBGView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        BitmapFactory.decodeResource(mContext.getResources(), R.drawable.bg, options);
        DisplayMetrics dm = mContext.getResources().getDisplayMetrics();

        mWidth = options.outWidth;
        mHeight = dm.heightPixels;
        setMeasuredDimension(mWidth, mHeight);
    }
}
