package com.rd;

import X9.b;
import Y9.c;
import Y9.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.b;
import ca.C2352a;
import ca.C2353b;
import ca.C2354c;
import com.rd.a;
import q1.t;

/* loaded from: classes2.dex */
public class PageIndicatorView extends View implements b.g, a.InterfaceC0502a, b.f, View.OnTouchListener {

    /* renamed from: G, reason: collision with root package name */
    private static final Handler f39496G = new Handler(Looper.getMainLooper());

    /* renamed from: B, reason: collision with root package name */
    private com.rd.a f39497B;

    /* renamed from: C, reason: collision with root package name */
    private DataSetObserver f39498C;

    /* renamed from: D, reason: collision with root package name */
    private androidx.viewpager.widget.b f39499D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f39500E;

    /* renamed from: F, reason: collision with root package name */
    private Runnable f39501F;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageIndicatorView.this.f39497B.d().F(true);
            PageIndicatorView.this.j();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39503a;

        static {
            int[] iArr = new int[d.values().length];
            f39503a = iArr;
            try {
                iArr[d.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39503a[d.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39503a[d.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39501F = new a();
        k(attributeSet);
    }

    private int e(int i10) {
        int iC = this.f39497B.d().c() - 1;
        if (i10 < 0) {
            return 0;
        }
        return i10 > iC ? iC : i10;
    }

    private void g() {
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    private androidx.viewpager.widget.b h(ViewGroup viewGroup, int i10) {
        View viewFindViewById;
        if (viewGroup.getChildCount() > 0 && (viewFindViewById = viewGroup.findViewById(i10)) != null && (viewFindViewById instanceof androidx.viewpager.widget.b)) {
            return (androidx.viewpager.widget.b) viewFindViewById;
        }
        return null;
    }

    private void i(ViewParent viewParent) {
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        androidx.viewpager.widget.b bVarH = h((ViewGroup) viewParent, this.f39497B.d().t());
        if (bVarH != null) {
            setViewPager(bVarH);
        } else {
            i(viewParent.getParent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        animate().cancel();
        animate().alpha(0.0f).setDuration(250L);
    }

    private void k(AttributeSet attributeSet) {
        t();
        l(attributeSet);
        if (this.f39497B.d().w()) {
            u();
        }
    }

    private void l(AttributeSet attributeSet) {
        com.rd.a aVar = new com.rd.a(this);
        this.f39497B = aVar;
        aVar.c().c(getContext(), attributeSet);
        Y9.a aVarD = this.f39497B.d();
        aVarD.M(getPaddingLeft());
        aVarD.O(getPaddingTop());
        aVarD.N(getPaddingRight());
        aVarD.L(getPaddingBottom());
        this.f39500E = aVarD.x();
    }

    private boolean m() {
        int i10 = b.f39503a[this.f39497B.d().m().ordinal()];
        if (i10 != 1) {
            return i10 == 3 && t.a(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean n() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void o(int i10, float f10) {
        Y9.a aVarD = this.f39497B.d();
        V9.a aVarB = aVarD.b();
        boolean zX = aVarD.x();
        if (n() && zX && aVarB != V9.a.NONE) {
            Pair<Integer, Float> pairC = C2352a.c(aVarD, i10, f10, m());
            s(((Integer) pairC.first).intValue(), ((Float) pairC.second).floatValue());
        }
    }

    private void p(int i10) {
        Y9.a aVarD = this.f39497B.d();
        boolean zN = n();
        int iC = aVarD.c();
        if (zN) {
            if (m()) {
                i10 = (iC - 1) - i10;
            }
            setSelection(i10);
        }
    }

    private void q() {
        androidx.viewpager.widget.b bVar;
        if (this.f39498C != null || (bVar = this.f39499D) == null) {
            return;
        }
        bVar.getAdapter();
    }

    private void t() {
        if (getId() == -1) {
            setId(C2354c.a());
        }
    }

    private void u() {
        Handler handler = f39496G;
        handler.removeCallbacks(this.f39501F);
        handler.postDelayed(this.f39501F, this.f39497B.d().d());
    }

    private void v() {
        f39496G.removeCallbacks(this.f39501F);
        g();
    }

    private void w() {
        androidx.viewpager.widget.b bVar;
        if (this.f39498C == null || (bVar = this.f39499D) == null) {
            return;
        }
        bVar.getAdapter();
    }

    private void x() {
        androidx.viewpager.widget.b bVar = this.f39499D;
        if (bVar != null) {
            bVar.getAdapter();
        }
    }

    private void y() {
        if (this.f39497B.d().u()) {
            int iC = this.f39497B.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && iC > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || iC > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    @Override // androidx.viewpager.widget.b.g
    public void E(int i10) {
        if (i10 == 0) {
            this.f39497B.d().H(this.f39500E);
        }
    }

    @Override // androidx.viewpager.widget.b.g
    public void H(int i10) {
        p(i10);
    }

    @Override // androidx.viewpager.widget.b.f
    public void a(androidx.viewpager.widget.b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (this.f39497B.d().v()) {
            q();
        }
        x();
    }

    @Override // com.rd.a.InterfaceC0502a
    public void b() {
        invalidate();
    }

    @Override // androidx.viewpager.widget.b.g
    public void f(int i10, float f10, int i11) {
        o(i10, f10);
    }

    public long getAnimationDuration() {
        return this.f39497B.d().a();
    }

    public int getCount() {
        return this.f39497B.d().c();
    }

    public int getPadding() {
        return this.f39497B.d().g();
    }

    public int getRadius() {
        return this.f39497B.d().l();
    }

    public float getScaleFactor() {
        return this.f39497B.d().n();
    }

    public int getSelectedColor() {
        return this.f39497B.d().o();
    }

    public int getSelection() {
        return this.f39497B.d().p();
    }

    public int getStrokeWidth() {
        return this.f39497B.d().r();
    }

    public int getUnselectedColor() {
        return this.f39497B.d().s();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(getParent());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        w();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f39497B.c().a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Pair<Integer, Integer> pairD = this.f39497B.c().d(i10, i11);
        setMeasuredDimension(((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Y9.a aVarD = this.f39497B.d();
        c cVar = (c) parcelable;
        aVarD.T(cVar.b());
        aVarD.U(cVar.c());
        aVarD.I(cVar.a());
        super.onRestoreInstanceState(cVar.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Y9.a aVarD = this.f39497B.d();
        c cVar = new c(super.onSaveInstanceState());
        cVar.e(aVarD.p());
        cVar.f(aVarD.q());
        cVar.d(aVarD.e());
        return cVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f39497B.d().w()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            v();
        } else if (action == 1) {
            u();
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f39497B.c().f(motionEvent);
        return true;
    }

    public void r() {
        androidx.viewpager.widget.b bVar = this.f39499D;
        if (bVar != null) {
            bVar.B(this);
            this.f39499D.A(this);
            this.f39499D = null;
        }
    }

    public void s(int i10, float f10) {
        Y9.a aVarD = this.f39497B.d();
        if (aVarD.x()) {
            int iC = aVarD.c();
            if (iC <= 0 || i10 < 0) {
                i10 = 0;
            } else {
                int i11 = iC - 1;
                if (i10 > i11) {
                    i10 = i11;
                }
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 == 1.0f) {
                aVarD.I(aVarD.p());
                aVarD.T(i10);
            }
            aVarD.U(i10);
            this.f39497B.b().b(f10);
        }
    }

    public void setAnimationDuration(long j10) {
        this.f39497B.d().y(j10);
    }

    public void setAnimationType(V9.a aVar) {
        this.f39497B.a(null);
        if (aVar != null) {
            this.f39497B.d().z(aVar);
        } else {
            this.f39497B.d().z(V9.a.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z10) {
        if (!z10) {
            setVisibility(0);
        }
        this.f39497B.d().A(z10);
        y();
    }

    public void setClickListener(b.InterfaceC0274b interfaceC0274b) {
        this.f39497B.c().e(interfaceC0274b);
    }

    public void setCount(int i10) {
        if (i10 < 0 || this.f39497B.d().c() == i10) {
            return;
        }
        this.f39497B.d().B(i10);
        y();
        requestLayout();
    }

    public void setDynamicCount(boolean z10) {
        this.f39497B.d().C(z10);
        if (z10) {
            q();
        } else {
            w();
        }
    }

    public void setFadeOnIdle(boolean z10) {
        this.f39497B.d().D(z10);
        if (z10) {
            u();
        } else {
            v();
        }
    }

    public void setIdleDuration(long j10) {
        this.f39497B.d().G(j10);
        if (this.f39497B.d().w()) {
            u();
        } else {
            v();
        }
    }

    public void setInteractiveAnimation(boolean z10) {
        this.f39497B.d().H(z10);
        this.f39500E = z10;
    }

    public void setOrientation(Y9.b bVar) {
        if (bVar != null) {
            this.f39497B.d().J(bVar);
            requestLayout();
        }
    }

    public void setPadding(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f39497B.d().K(C2353b.a(i10));
        invalidate();
    }

    public void setRadius(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f39497B.d().P(C2353b.a(i10));
        invalidate();
    }

    public void setRtlMode(d dVar) {
        Y9.a aVarD = this.f39497B.d();
        if (dVar == null) {
            aVarD.Q(d.Off);
        } else {
            aVarD.Q(dVar);
        }
        if (this.f39499D == null) {
            return;
        }
        int iP = aVarD.p();
        if (m()) {
            iP = (aVarD.c() - 1) - iP;
        } else {
            androidx.viewpager.widget.b bVar = this.f39499D;
            if (bVar != null) {
                iP = bVar.getCurrentItem();
            }
        }
        aVarD.I(iP);
        aVarD.U(iP);
        aVarD.T(iP);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setScaleFactor(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto L10
        L8:
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L6
        L10:
            com.rd.a r0 = r2.f39497B
            Y9.a r0 = r0.d()
            r0.R(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.setScaleFactor(float):void");
    }

    public void setSelected(int i10) {
        Y9.a aVarD = this.f39497B.d();
        V9.a aVarB = aVarD.b();
        aVarD.z(V9.a.NONE);
        setSelection(i10);
        aVarD.z(aVarB);
    }

    public void setSelectedColor(int i10) {
        this.f39497B.d().S(i10);
        invalidate();
    }

    public void setSelection(int i10) {
        Y9.a aVarD = this.f39497B.d();
        int iE = e(i10);
        if (iE == aVarD.p() || iE == aVarD.q()) {
            return;
        }
        aVarD.H(false);
        aVarD.I(aVarD.p());
        aVarD.U(iE);
        aVarD.T(iE);
        this.f39497B.b().a();
    }

    public void setStrokeWidth(float f10) {
        int iL = this.f39497B.d().l();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else {
            float f11 = iL;
            if (f10 > f11) {
                f10 = f11;
            }
        }
        this.f39497B.d().V((int) f10);
        invalidate();
    }

    public void setUnselectedColor(int i10) {
        this.f39497B.d().W(i10);
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(androidx.viewpager.widget.b bVar) {
        r();
        if (bVar == null) {
            return;
        }
        this.f39499D = bVar;
        bVar.b(this);
        this.f39499D.a(this);
        this.f39499D.setOnTouchListener(this);
        this.f39497B.d().X(this.f39499D.getId());
        setDynamicCount(this.f39497B.d().v());
        x();
    }

    public void setPadding(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f39497B.d().K((int) f10);
        invalidate();
    }

    public void setRadius(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f39497B.d().P((int) f10);
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        int iA = C2353b.a(i10);
        int iL = this.f39497B.d().l();
        if (iA < 0) {
            iA = 0;
        } else if (iA > iL) {
            iA = iL;
        }
        this.f39497B.d().V(iA);
        invalidate();
    }
}
