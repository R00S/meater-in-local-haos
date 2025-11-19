package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.e;
import m1.C3946a;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class c<S extends b> extends d {

    /* renamed from: V, reason: collision with root package name */
    private static final F1.c<c<?>> f36922V = new a("indicatorLevel");

    /* renamed from: Q, reason: collision with root package name */
    private e<S> f36923Q;

    /* renamed from: R, reason: collision with root package name */
    private final F1.f f36924R;

    /* renamed from: S, reason: collision with root package name */
    private final F1.e f36925S;

    /* renamed from: T, reason: collision with root package name */
    private final e.a f36926T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f36927U;

    /* compiled from: DeterminateDrawable.java */
    class a extends F1.c<c<?>> {
        a(String str) {
            super(str);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(c<?> cVar) {
            return cVar.x() * 10000.0f;
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(c<?> cVar, float f10) {
            cVar.z(f10 / 10000.0f);
        }
    }

    c(Context context, b bVar, e<S> eVar) {
        super(context, bVar);
        this.f36927U = false;
        y(eVar);
        this.f36926T = new e.a();
        F1.f fVar = new F1.f();
        this.f36924R = fVar;
        fVar.d(1.0f);
        fVar.f(50.0f);
        F1.e eVar2 = new F1.e(this, f36922V);
        this.f36925S = eVar2;
        eVar2.w(fVar);
        n(1.0f);
    }

    static c<k> v(Context context, k kVar, h hVar) {
        return new c<>(context, kVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x() {
        return this.f36926T.f36947b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(float f10) {
        this.f36926T.f36947b = f10;
        invalidateSelf();
    }

    void A(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f36923Q.g(canvas, getBounds(), h(), k(), j());
            this.f36941N.setStyle(Paint.Style.FILL);
            this.f36941N.setAntiAlias(true);
            e.a aVar = this.f36926T;
            b bVar = this.f36930C;
            aVar.f36948c = bVar.f36917c[0];
            int iA = bVar.f36921g;
            if (iA > 0) {
                if (!(this.f36923Q instanceof h)) {
                    iA = (int) ((iA * C3946a.a(x(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f36923Q.d(canvas, this.f36941N, x(), 1.0f, this.f36930C.f36918d, getAlpha(), iA);
            } else {
                this.f36923Q.d(canvas, this.f36941N, 0.0f, 1.0f, bVar.f36918d, getAlpha(), 0);
            }
            this.f36923Q.c(canvas, this.f36941N, this.f36926T, getAlpha());
            this.f36923Q.b(canvas, this.f36941N, this.f36930C.f36917c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f36923Q.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f36923Q.f();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f36925S.x();
        z(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f36927U) {
            this.f36925S.x();
            z(i10 / 10000.0f);
            return true;
        }
        this.f36925S.m(x() * 10000.0f);
        this.f36925S.s(i10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.d
    boolean r(boolean z10, boolean z11, boolean z12) {
        boolean zR = super.r(z10, z11, z12);
        float fA = this.f36931D.a(this.f36929B.getContentResolver());
        if (fA == 0.0f) {
            this.f36927U = true;
        } else {
            this.f36927U = false;
            this.f36924R.f(50.0f / fA);
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

    e<S> w() {
        return this.f36923Q;
    }

    void y(e<S> eVar) {
        this.f36923Q = eVar;
    }
}
