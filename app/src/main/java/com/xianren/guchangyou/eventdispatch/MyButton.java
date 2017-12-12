package com.xianren.guchangyou.eventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by guchangyou on 2017/12/12.
 */

public class MyButton extends Button {
    boolean temTouch, temDispatch, temInter;

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        temTouch = super.onTouchEvent(event);
        return temTouch;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        temDispatch = super.dispatchTouchEvent(event);
        return temDispatch;
    }


}
