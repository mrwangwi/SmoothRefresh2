package me.dkzwm.widget.srl;

import android.content.Context;
import android.util.AttributeSet;

public class SmartRefresh extends SmoothRefreshLayout {
    public SmartRefresh(Context context) {
        super(context);
        init();
    }

    public SmartRefresh(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SmartRefresh(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        setDisableLoadMore(false);
        setEnableOverScroll(true);
        setEnableNoMoreDataAndNoSpringBack(false);
    }
}
