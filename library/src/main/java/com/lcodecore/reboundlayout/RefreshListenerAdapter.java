package com.lcodecore.reboundlayout;

public abstract class RefreshListenerAdapter implements PullListener {
    @Override
    public void onPullingDown(ReboundLayout refreshLayout, float fraction, float offset) {
    }

    @Override
    public void onPullingUp(ReboundLayout refreshLayout, float fraction, float offset) {
    }

    @Override
    public void onPullDownReleasing(ReboundLayout refreshLayout, float fraction) {
    }

    @Override
    public void onPullUpReleasing(ReboundLayout refreshLayout, float fraction) {
    }

    @Override
    public void onRefresh(ReboundLayout refreshLayout) {
    }

    @Override
    public void onLoadMore(ReboundLayout refreshLayout) {
    }

    @Override
    public void onFinishRefresh() {

    }

    @Override
    public void onFinishLoadMore() {

    }

    @Override
    public void onRefreshCanceled() {

    }

    @Override
    public void onLoadmoreCanceled() {

    }
}