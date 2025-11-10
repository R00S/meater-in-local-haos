package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class RoundedLayout extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    View f10411q;

    /* renamed from: r, reason: collision with root package name */
    int f10412r;

    /* renamed from: s, reason: collision with root package name */
    int f10413s;

    public RoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10413s = -1;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        float f10;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15909e, 0, 0);
        float f11 = context.getResources().getDisplayMetrics().widthPixels;
        this.f10413s = obtainStyledAttributes.getInteger(2, 0);
        View.inflate(context, 2131558724, this);
        View findViewById = findViewById(2131363426);
        this.f10411q = findViewById;
        int i10 = this.f10413s;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            f10 = 12.0f;
        } else if (i10 == 1) {
            f10 = 3.8f;
        } else if (i10 == 2) {
            f10 = 17.0f;
        } else if (i10 == 4) {
            f10 = 9.3f;
        } else {
            f10 = 6.4f;
        }
        int i11 = (int) (f11 / f10);
        findViewById.getLayoutParams().height = i11;
        this.f10411q.getLayoutParams().width = i11;
        this.f10411q.requestLayout();
        try {
            setColor(obtainStyledAttributes.getColor(0, -16777216));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getColor() {
        return this.f10412r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setColor(String str) {
        if (str != null) {
            this.f10412r = Color.parseColor(str);
            f8.q0.d(this.f10411q.getBackground(), this.f10412r, true);
        }
    }

    public void setColor(int i10) {
        f8.q0.d(this.f10411q.getBackground(), i10, false);
    }
}
