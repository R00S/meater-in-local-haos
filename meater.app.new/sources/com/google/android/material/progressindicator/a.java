package com.google.android.material.progressindicator;

import C7.l;
import C7.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import b8.C2272a;
import com.google.android.material.internal.r;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;
import s1.X;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes2.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {

    /* renamed from: P, reason: collision with root package name */
    static final int f36896P = l.f2561D;

    /* renamed from: B, reason: collision with root package name */
    S f36897B;

    /* renamed from: C, reason: collision with root package name */
    private int f36898C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f36899D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f36900E;

    /* renamed from: F, reason: collision with root package name */
    private final int f36901F;

    /* renamed from: G, reason: collision with root package name */
    private final int f36902G;

    /* renamed from: H, reason: collision with root package name */
    private long f36903H;

    /* renamed from: I, reason: collision with root package name */
    S7.a f36904I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f36905J;

    /* renamed from: K, reason: collision with root package name */
    private int f36906K;

    /* renamed from: L, reason: collision with root package name */
    private final Runnable f36907L;

    /* renamed from: M, reason: collision with root package name */
    private final Runnable f36908M;

    /* renamed from: N, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f36909N;

    /* renamed from: O, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f36910O;

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    class RunnableC0473a implements Runnable {
        RunnableC0473a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f36903H = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.f36898C, a.this.f36899D);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.f36905J) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f36906K);
        }
    }

    protected a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(C2272a.c(context, attributeSet, i10, f36896P), attributeSet, i10);
        this.f36903H = -1L;
        this.f36905J = false;
        this.f36906K = 4;
        this.f36907L = new RunnableC0473a();
        this.f36908M = new b();
        this.f36909N = new c();
        this.f36910O = new d();
        Context context2 = getContext();
        this.f36897B = (S) i(context2, attributeSet);
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f2928h0, i10, i11, new int[0]);
        this.f36901F = typedArrayI.getInt(m.f2994n0, -1);
        this.f36902G = Math.min(typedArrayI.getInt(m.f2972l0, -1), 1000);
        typedArrayI.recycle();
        this.f36904I = new S7.a();
        this.f36900E = true;
    }

    private e<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((com.google.android.material.progressindicator.d) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f36902G > 0) {
            this.f36903H = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f36909N);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.f36910O);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.f36910O);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.f36910O);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.f36910O);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f36897B.f36920f;
    }

    public int[] getIndicatorColor() {
        return this.f36897B.f36917c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f36897B.f36921g;
    }

    public int getShowAnimationBehavior() {
        return this.f36897B.f36919e;
    }

    public int getTrackColor() {
        return this.f36897B.f36918d;
    }

    public int getTrackCornerRadius() {
        return this.f36897B.f36916b;
    }

    public int getTrackThickness() {
        return this.f36897B.f36915a;
    }

    protected void h(boolean z10) {
        if (this.f36900E) {
            ((com.google.android.material.progressindicator.d) getCurrentDrawable()).q(q(), false, z10);
        }
    }

    abstract S i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void o(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f36898C = i10;
            this.f36899D = z10;
            this.f36905J = true;
            if (!getIndeterminateDrawable().isVisible() || this.f36904I.a(getContext().getContentResolver()) == 0.0f) {
                this.f36909N.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().u().f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f36908M);
        removeCallbacks(this.f36907L);
        ((com.google.android.material.progressindicator.d) getCurrentDrawable()).i();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            e<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    boolean q() {
        return X.Q(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(S7.a aVar) {
        this.f36904I = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f36931D = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f36931D = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f36897B.f36920f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            com.google.android.material.progressindicator.d dVar = (com.google.android.material.progressindicator.d) getCurrentDrawable();
            if (dVar != null) {
                dVar.i();
            }
            super.setIndeterminate(z10);
            com.google.android.material.progressindicator.d dVar2 = (com.google.android.material.progressindicator.d) getCurrentDrawable();
            if (dVar2 != null) {
                dVar2.q(q(), false, false);
            }
            if ((dVar2 instanceof g) && q()) {
                ((g) dVar2).u().g();
            }
            this.f36905J = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof g)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((com.google.android.material.progressindicator.d) drawable).i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{M7.a.b(getContext(), C7.c.f2329n, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f36897B.f36917c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        S s10 = this.f36897B;
        if (s10.f36921g != i10) {
            s10.f36921g = i10;
            s10.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        o(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.c)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            com.google.android.material.progressindicator.c cVar = (com.google.android.material.progressindicator.c) drawable;
            cVar.i();
            super.setProgressDrawable(cVar);
            cVar.A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f36897B.f36919e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f36897B;
        if (s10.f36918d != i10) {
            s10.f36918d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f36897B;
        if (s10.f36916b != i10) {
            s10.f36916b = Math.min(i10, s10.f36915a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f36897B;
        if (s10.f36915a != i10) {
            s10.f36915a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f36906K = i10;
    }

    @Override // android.widget.ProgressBar
    public g<S> getIndeterminateDrawable() {
        return (g) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.c<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.c) super.getProgressDrawable();
    }
}
