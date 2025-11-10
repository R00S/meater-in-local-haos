package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import b6.y5;

/* loaded from: /tmp/meat/meat/classes.dex */
public class JuicyVideoView extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    y5 f10317q;

    public JuicyVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        this.f10317q = (y5) androidx.databinding.g.h(LayoutInflater.from(context), 2131558578, this, true);
    }

    public y5 b() {
        return this.f10317q;
    }

    public void c(String str) {
        com.bumptech.glide.b.t(getContext()).m().I0(str).C0(this.f10317q.R);
    }
}
