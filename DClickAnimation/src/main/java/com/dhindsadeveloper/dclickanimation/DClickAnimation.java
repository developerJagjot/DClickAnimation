package com.dhindsadeveloper.dclickanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

public class DClickAnimation {
    public void JClickAnimation(final View view) {

        ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
        fade_in.setDuration(300);
        fade_in.setFillAfter(true);
        view.startAnimation(fade_in);
    }
}
