package com.xianren.guchangyou.eventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by guchangyou on 2017/12/12.
 */

public class MyRelativeLayout extends RelativeLayout {
    boolean temTouch, temDispatch, temInter;

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        temTouch = super.onTouchEvent(event);
//        findViewById(R.id.btn1).dispatchTouchEvent(event);
        return temTouch;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        temDispatch = super.dispatchTouchEvent(ev);
        return temDispatch;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        temInter = super.onInterceptTouchEvent(ev);
        return temInter;
    }
}
