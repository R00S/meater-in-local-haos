package com.google.android.material.snackbar;

import C7.e;
import C7.g;
import R7.i;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import s1.X;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: B, reason: collision with root package name */
    private TextView f37138B;

    /* renamed from: C, reason: collision with root package name */
    private Button f37139C;

    /* renamed from: D, reason: collision with root package name */
    private final TimeInterpolator f37140D;

    /* renamed from: E, reason: collision with root package name */
    private int f37141E;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37140D = i.g(context, C7.c.f2292P, D7.a.f3487b);
    }

    private static void d(View view, int i10, int i11) {
        if (X.T(view)) {
            X.C0(view, X.E(view), i10, X.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37138B.getPaddingTop() == i11 && this.f37138B.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f37138B, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f37138B.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f37138B.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f37140D).setStartDelay(j11).start();
        if (this.f37139C.getVisibility() == 0) {
            this.f37139C.setAlpha(0.0f);
            this.f37139C.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f37140D).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f37138B.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f37138B.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f37140D).setStartDelay(j11).start();
        if (this.f37139C.getVisibility() == 0) {
            this.f37139C.setAlpha(1.0f);
            this.f37139C.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f37140D).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f37139C.setTextColor(M7.a.j(M7.a.d(this, C7.c.f2331p), this.f37139C.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f37139C;
    }

    public TextView getMessageView() {
        return this.f37138B;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f37138B = (TextView) findViewById(g.f2463T);
        this.f37139C = (Button) findViewById(g.f2462S);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f2403m);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(e.f2401l);
        Layout layout = this.f37138B.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f37141E <= 0 || this.f37139C.getMeasuredWidth() <= this.f37141E) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f37141E = i10;
    }
}
