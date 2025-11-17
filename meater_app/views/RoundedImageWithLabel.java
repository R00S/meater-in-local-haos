package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import b6.e8;
import com.apptionlabs.meater_app.model.Probe;
import rk.C0462n;

/* loaded from: /tmp/meat/meat/classes.dex */
public class RoundedImageWithLabel extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    e8 f10405q;

    /* renamed from: r, reason: collision with root package name */
    private final C0462n f10406r;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum a {
        AlertView,
        GraphView,
        CancelCookView
    }

    public RoundedImageWithLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10406r = new C0462n();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15911g, 0, 0);
        this.f10405q = (e8) androidx.databinding.g.h(LayoutInflater.from(context), 2131558695, this, true);
        try {
            setColor(obtainStyledAttributes.getColor(0, -16777216));
            setLabel(obtainStyledAttributes.getString(5));
            setImage(obtainStyledAttributes.getDrawable(2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        super.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    public void b(Probe probe, a aVar) {
        this.f10405q.T(this.f10406r);
        this.f10406r.s(probe, aVar);
    }

    public void setColor(int i10) {
        f8.q0.d(this.f10405q.R.getBackground(), i10, false);
        this.f10405q.S.setTextColor(i10);
    }

    public void setImage(Drawable drawable) {
        this.f10405q.R.setImageDrawable(drawable);
    }

    public void setLabel(String str) {
        this.f10405q.S.setText(str);
    }
}
