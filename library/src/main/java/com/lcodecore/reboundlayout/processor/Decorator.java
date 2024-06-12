package com.lcodecore.reboundlayout.processor;

import com.lcodecore.reboundlayout.ReboundLayout;

/**
 * Created by lcodecore on 2017/3/3.
 */

public abstract class Decorator implements IDecorator {
    protected IDecorator decorator;
    protected ReboundLayout.CoContext cp;

    public Decorator(ReboundLayout.CoContext processor, IDecorator decorator1) {
        cp = processor;
        decorator = decorator1;
    }
}
