package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.e;
import k1.C3784a;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class g<S extends b> extends d {

    /* renamed from: Q, reason: collision with root package name */
    private e<S> f36952Q;

    /* renamed from: R, reason: collision with root package name */
    private f<ObjectAnimator> f36953R;

    /* renamed from: S, reason: collision with root package name */
    private Drawable f36954S;

    g(Context context, b bVar, e<S> eVar, f<ObjectAnimator> fVar) {
        super(context, bVar);
        y(eVar);
        x(fVar);
    }

    static g<k> t(Context context, k kVar, h hVar) {
        return new g<>(context, kVar, hVar, kVar.f36981h == 0 ? new i(kVar) : new j(context, kVar));
    }

    private boolean w() {
        S7.a aVar = this.f36931D;
        return aVar != null && aVar.a(this.f36929B.getContentResolver()) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f36954S) != null) {
                drawable.setBounds(getBounds());
                C3784a.n(this.f36954S, this.f36930C.f36917c[0]);
                this.f36954S.draw(canvas);
                return;
            }
            canvas.save();
            this.f36952Q.g(canvas, getBounds(), h(), k(), j());
            int i10 = this.f36930C.f36921g;
            int alpha = getAlpha();
            if (i10 == 0) {
                this.f36952Q.d(canvas, this.f36941N, 0.0f, 1.0f, this.f36930C.f36918d, alpha, 0);
            } else {
                e.a aVar = this.f36953R.f36951b.get(0);
                e.a aVar2 = this.f36953R.f36951b.get(r3.size() - 1);
                e<S> eVar = this.f36952Q;
                if (eVar instanceof h) {
                    eVar.d(canvas, this.f36941N, 0.0f, aVar.f36946a, this.f36930C.f36918d, alpha, i10);
                    this.f36952Q.d(canvas, this.f36941N, aVar2.f36947b, 1.0f, this.f36930C.f36918d, alpha, i10);
                } else {
                    alpha = 0;
                    eVar.d(canvas, this.f36941N, aVar2.f36947b, 1.0f + aVar.f36946a, this.f36930C.f36918d, 0, i10);
                }
            }
            for (int i11 = 0; i11 < this.f36953R.f36951b.size(); i11++) {
                e.a aVar3 = this.f36953R.f36951b.get(i11);
                this.f36952Q.c(canvas, this.f36941N, aVar3, getAlpha());
                if (i11 > 0 && i10 > 0) {
                    this.f36952Q.d(canvas, this.f36941N, this.f36953R.f36951b.get(i11 - 1).f36947b, aVar3.f36946a, this.f36930C.f36918d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f36952Q.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f36952Q.f();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.d
    boolean r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zR = super.r(z10, z11, z12);
        if (w() && (drawable = this.f36954S) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f36953R.a();
        }
        if (z10 && z12) {
            this.f36953R.g();
        }
        return zR;
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.s(bVar);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    f<ObjectAnimator> u() {
        return this.f36953R;
    }

    e<S> v() {
        return this.f36952Q;
    }

    void x(f<ObjectAnimator> fVar) {
        this.f36953R = fVar;
        fVar.e(this);
    }

    void y(e<S> eVar) {
        this.f36952Q = eVar;
    }
}
