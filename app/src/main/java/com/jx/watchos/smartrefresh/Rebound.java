package com.jx.watchos.smartrefresh;

import android.content.Context;
import android.util.AttributeSet;

import com.lcodecore.reboundlayout.ReboundLayout;

public class Rebound extends ReboundLayout {
    public Rebound(Context context) {
        super(context);
        init();
    }

    public Rebound(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Rebound(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setEnableLoadmore(false);
        setEnableRefresh(false);
    }
}
