package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: /tmp/meat/meat/classes.dex */
public class VerticalConnectionComponent extends View {

    /* renamed from: q, reason: collision with root package name */
    private final Paint f10447q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f10448r;

    /* renamed from: s, reason: collision with root package name */
    private float f10449s;

    /* renamed from: t, reason: collision with root package name */
    private float f10450t;

    /* renamed from: u, reason: collision with root package name */
    private int f10451u;

    /* renamed from: v, reason: collision with root package name */
    private int f10452v;

    /* renamed from: w, reason: collision with root package name */
    private int f10453w;

    /* renamed from: x, reason: collision with root package name */
    private final RectF f10454x;

    /* renamed from: y, reason: collision with root package name */
    private final RectF f10455y;

    public VerticalConnectionComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10447q = new Paint();
        this.f10448r = new Paint();
        this.f10449s = 0.0f;
        this.f10450t = 0.0f;
        this.f10451u = 0;
        this.f10452v = 0;
        this.f10453w = 0;
        this.f10454x = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10455y = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        int c10;
        boolean z10 = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15915k, 0, 0).getBoolean(0, false);
        float c11 = c();
        float f10 = 7.0f * c11;
        this.f10449s = f10;
        this.f10452v = (int) f10;
        this.f10451u = (int) (c11 * 14.0f);
        this.f10450t = f10 / 2.0f;
        setWillNotDraw(false);
        if (z10) {
            c10 = f8.l0.h(2131100472);
        } else {
            c10 = f8.q0.c(2131099716);
        }
        this.f10447q.setColor(c10);
        this.f10447q.setAlpha(127);
        Paint paint = this.f10447q;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f10447q.setAntiAlias(true);
        this.f10448r.setColor(-1);
        this.f10448r.setStyle(style);
        this.f10448r.setAntiAlias(true);
    }

    private int b(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i10;
            }
            return size;
        }
        return Math.min(i10, size);
    }

    private float c() {
        return b1.f10469i / 450.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 <= 50; i10++) {
            float f10 = (this.f10451u * i10) + this.f10453w;
            this.f10454x.set(0.0f, f10, this.f10449s, this.f10450t + f10);
            this.f10455y.set(0.0f, f10 + 1.0f, this.f10450t, this.f10449s + f10 + 1.0f);
            canvas.drawRoundRect(this.f10454x, 15.0f, 15.0f, this.f10448r);
            canvas.drawRoundRect(this.f10455y, 15.0f, 15.0f, this.f10447q);
        }
        int i11 = this.f10453w + 2;
        this.f10453w = i11;
        if (i11 >= this.f10451u) {
            this.f10453w = 0;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(b(getSuggestedMinimumWidth() + getPaddingStart() + getPaddingEnd(), i10), b(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), i11));
    }
}
