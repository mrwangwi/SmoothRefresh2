package com.jx.watchos.smartrefresh;

import android.content.Context;
import android.util.AttributeSet;

import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

public class TwinklingRefresh extends TwinklingRefreshLayout {
    public TwinklingRefresh(Context context) {
        super(context);
        init();
    }

    public TwinklingRefresh(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TwinklingRefresh(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setEnableLoadmore(false);
        setEnableRefresh(false);
    }
}
