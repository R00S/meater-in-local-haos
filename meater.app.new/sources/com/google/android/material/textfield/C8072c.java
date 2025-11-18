package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;

/* compiled from: CutoutDrawable.java */
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes2.dex */
class C8072c extends C8900g {

    /* renamed from: D */
    private final Paint f30529D;

    /* renamed from: E */
    private final RectF f30530E;

    /* renamed from: F */
    private int f30531F;

    C8072c() {
        this(null);
    }

    /* renamed from: m0 */
    private void m24809m0(Canvas canvas) {
        if (m24813t0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f30531F);
    }

    /* renamed from: n0 */
    private void m24810n0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!m24813t0(callback)) {
            m24811p0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    /* renamed from: p0 */
    private void m24811p0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f30531F = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.f30531F = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    /* renamed from: s0 */
    private void m24812s0() {
        this.f30529D.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f30529D.setColor(-1);
        this.f30529D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: t0 */
    private boolean m24813t0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m24810n0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f30530E, this.f30529D);
        m24809m0(canvas);
    }

    /* renamed from: l0 */
    boolean m24814l0() {
        return !this.f30530E.isEmpty();
    }

    /* renamed from: o0 */
    void m24815o0() {
        m24816q0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: q0 */
    void m24816q0(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f30530E;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    /* renamed from: r0 */
    void m24817r0(RectF rectF) {
        m24816q0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    C8072c(C8904k c8904k) {
        super(c8904k == null ? new C8904k() : c8904k);
        this.f30529D = new Paint(1);
        m24812s0();
        this.f30530E = new RectF();
    }
}
