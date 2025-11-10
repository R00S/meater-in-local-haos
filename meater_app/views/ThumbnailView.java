package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import b6.t9;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ThumbnailView extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    t9 f10439q;

    /* renamed from: r, reason: collision with root package name */
    float f10440r;

    /* renamed from: s, reason: collision with root package name */
    float f10441s;

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10440r = 1.77f;
        this.f10441s = 2.566f;
        a(context);
    }

    private void a(Context context) {
        this.f10439q = (t9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558727, this, true);
        if (b1.f10467g >= 1600.0f) {
            this.f10440r = 1.33f;
            this.f10441s = 2.2f;
        }
    }

    public void b(Drawable drawable, String str) {
        this.f10439q.S.setText(str);
        this.f10439q.Q.setImageDrawable(drawable);
    }
}
