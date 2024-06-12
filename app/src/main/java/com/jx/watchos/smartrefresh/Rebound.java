package com.jx.watchos.smartrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.lcodecore.reboundlayout.ReboundLayout;
import com.lcodecore.reboundlayout.RefreshListenerAdapter;

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

        setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onPullingDown(ReboundLayout refreshLayout, float fraction, float offset) {
                super.onPullingDown(refreshLayout, fraction, offset);
                Log.e("onPullingDown:1 ", fraction + "/" + offset);
            }

            @Override
            public void onPullingUp(ReboundLayout refreshLayout, float fraction, float offset) {
                super.onPullingUp(refreshLayout, fraction, offset);
                Log.e("onPullingDown:2", fraction + "/" + offset);
            }
        });
    }

}
