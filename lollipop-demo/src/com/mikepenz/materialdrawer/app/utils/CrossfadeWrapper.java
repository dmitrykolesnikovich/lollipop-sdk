package com.mikepenz.materialdrawer.app.utils;

import lollipop.crossfader.Crossfader;
import lollipop.materialdrawer.interfaces.ICrossfader;

/**
 * Created by mikepenz on 18.07.15.
 */
public class CrossfadeWrapper implements ICrossfader {
    private Crossfader mCrossfader;

    public CrossfadeWrapper(Crossfader crossfader) {
        this.mCrossfader = crossfader;
    }

    @Override
    public void crossfade() {
        mCrossfader.crossFade();
    }

    @Override
    public boolean isCrossfaded() {
        return mCrossfader.isCrossFaded();
    }
}
