package ru.dimorinny.showcasecard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;


public class WrapWidthLayout extends RelativeLayout {

    public WrapWidthLayout(Context context) {
        super(context);
    }

    public WrapWidthLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapWidthLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public WrapWidthLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        RelativeLayout layout = this;
        if (layout != null) {
            int width = getMeasuredWidth();
            int height = getMeasuredHeight();
            setMeasuredDimension(width, height);
        }
    }
}
