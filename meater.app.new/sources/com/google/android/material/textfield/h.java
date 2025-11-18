package com.google.android.material.textfield;

import X7.g;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes2.dex */
class h extends X7.g {

    /* renamed from: a0, reason: collision with root package name */
    b f37345a0;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // X7.g
        protected void r(Canvas canvas) {
            if (this.f37345a0.f37346w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f37345a0.f37346w);
            super.r(canvas);
            canvas.restore();
        }
    }

    static h p0(X7.k kVar) {
        if (kVar == null) {
            kVar = new X7.k();
        }
        return q0(new b(kVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h q0(b bVar) {
        return new c(bVar);
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f37345a0 = new b(this.f37345a0);
        return this;
    }

    boolean r0() {
        return !this.f37345a0.f37346w.isEmpty();
    }

    void s0() {
        t0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void t0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f37345a0.f37346w.left && f11 == this.f37345a0.f37346w.top && f12 == this.f37345a0.f37346w.right && f13 == this.f37345a0.f37346w.bottom) {
            return;
        }
        this.f37345a0.f37346w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void u0(RectF rectF) {
        t0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* compiled from: CutoutDrawable.java */
    private static final class b extends g.c {

        /* renamed from: w, reason: collision with root package name */
        private final RectF f37346w;

        @Override // X7.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarQ0 = h.q0(this);
            hVarQ0.invalidateSelf();
            return hVarQ0;
        }

        private b(X7.k kVar, RectF rectF) {
            super(kVar, null);
            this.f37346w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f37346w = bVar.f37346w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.f37345a0 = bVar;
    }
}
