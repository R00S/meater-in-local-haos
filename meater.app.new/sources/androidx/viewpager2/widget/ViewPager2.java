package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import s1.X;
import t1.t;
import t1.w;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: V, reason: collision with root package name */
    static boolean f29779V = true;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f29780B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f29781C;

    /* renamed from: D, reason: collision with root package name */
    private androidx.viewpager2.widget.b f29782D;

    /* renamed from: E, reason: collision with root package name */
    int f29783E;

    /* renamed from: F, reason: collision with root package name */
    boolean f29784F;

    /* renamed from: G, reason: collision with root package name */
    private RecyclerView.j f29785G;

    /* renamed from: H, reason: collision with root package name */
    LinearLayoutManager f29786H;

    /* renamed from: I, reason: collision with root package name */
    private int f29787I;

    /* renamed from: J, reason: collision with root package name */
    private Parcelable f29788J;

    /* renamed from: K, reason: collision with root package name */
    RecyclerView f29789K;

    /* renamed from: L, reason: collision with root package name */
    private r f29790L;

    /* renamed from: M, reason: collision with root package name */
    androidx.viewpager2.widget.e f29791M;

    /* renamed from: N, reason: collision with root package name */
    private androidx.viewpager2.widget.b f29792N;

    /* renamed from: O, reason: collision with root package name */
    private androidx.viewpager2.widget.c f29793O;

    /* renamed from: P, reason: collision with root package name */
    private androidx.viewpager2.widget.d f29794P;

    /* renamed from: Q, reason: collision with root package name */
    private RecyclerView.n f29795Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f29796R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f29797S;

    /* renamed from: T, reason: collision with root package name */
    private int f29798T;

    /* renamed from: U, reason: collision with root package name */
    e f29799U;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f29784F = true;
            viewPager2.f29791M.l();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f29783E != i10) {
                viewPager2.f29783E = i10;
                viewPager2.f29799U.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f29789K.requestFocus(2);
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void n() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(t tVar) {
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void k(View view, t tVar) {
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(t tVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            tVar.Z(t.a.f49791r);
            tVar.Z(t.a.f49790q);
            tVar.K0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
        public void R0(RecyclerView.x xVar, RecyclerView.C c10, t tVar) {
            super.R0(xVar, c10, tVar);
            ViewPager2.this.f29799U.j(tVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void R1(RecyclerView.C c10, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.R1(c10, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void U0(RecyclerView.x xVar, RecyclerView.C c10, View view, t tVar) {
            ViewPager2.this.f29799U.k(view, tVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean m1(RecyclerView.x xVar, RecyclerView.C c10, int i10, Bundle bundle) {
            return ViewPager2.this.f29799U.b(i10) ? ViewPager2.this.f29799U.l(i10) : super.m1(xVar, c10, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final w f29807b;

        /* renamed from: c, reason: collision with root package name */
        private final w f29808c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f29809d;

        class a implements w {
            a() {
            }

            @Override // t1.w
            public boolean a(View view, w.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements w {
            b() {
            }

            @Override // t1.w
            public boolean a(View view, w.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f29807b = new a();
            this.f29808c = new b();
        }

        private void u(t tVar) {
            int iH;
            int iH2;
            if (ViewPager2.this.getAdapter() != null) {
                iH2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    iH2 = ViewPager2.this.getAdapter().h();
                    iH = 1;
                } else {
                    iH = ViewPager2.this.getAdapter().h();
                }
            } else {
                iH = 0;
                iH2 = 0;
            }
            tVar.j0(t.e.a(iH2, iH, false, 0));
        }

        private void v(View view, t tVar) {
            tVar.k0(t.f.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f29786H.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f29786H.l0(view) : 0, 1, false, false));
        }

        private void w(t tVar) {
            int iH;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iH = adapter.h()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f29783E > 0) {
                tVar.a(8192);
            }
            if (ViewPager2.this.f29783E < iH - 1) {
                tVar.a(4096);
            }
            tVar.K0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.E(this.f29809d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.H(this.f29809d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            X.x0(recyclerView, 2);
            this.f29809d = new c();
            if (X.x(ViewPager2.this) == 0) {
                X.x0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t tVarY0 = t.Y0(accessibilityNodeInfo);
            u(tVarY0);
            w(tVarY0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, t tVar) {
            v(view, tVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void y() {
            int iH;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            X.h0(viewPager2, R.id.accessibilityActionPageLeft);
            X.h0(viewPager2, R.id.accessibilityActionPageRight);
            X.h0(viewPager2, R.id.accessibilityActionPageUp);
            X.h0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iH = ViewPager2.this.getAdapter().h()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f29783E < iH - 1) {
                    X.j0(viewPager2, new t.a(R.id.accessibilityActionPageDown, null), null, this.f29807b);
                }
                if (ViewPager2.this.f29783E > 0) {
                    X.j0(viewPager2, new t.a(R.id.accessibilityActionPageUp, null), null, this.f29808c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f29783E < iH - 1) {
                X.j0(viewPager2, new t.a(i11, null), null, this.f29807b);
            }
            if (ViewPager2.this.f29783E > 0) {
                X.j0(viewPager2, new t.a(i10, null), null, this.f29808c);
            }
        }
    }

    public interface k {
    }

    private class l extends r {
        l() {
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.v
        public View f(RecyclerView.q qVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(qVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f29799U.d() ? ViewPager2.this.f29799U.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f29783E);
            accessibilityEvent.setToIndex(ViewPager2.this.f29783E);
            ViewPager2.this.f29799U.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final int f29819B;

        /* renamed from: C, reason: collision with root package name */
        private final RecyclerView f29820C;

        o(int i10, RecyclerView recyclerView) {
            this.f29819B = i10;
            this.f29820C = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29820C.D1(this.f29819B);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29780B = new Rect();
        this.f29781C = new Rect();
        this.f29782D = new androidx.viewpager2.widget.b(3);
        this.f29784F = false;
        this.f29785G = new a();
        this.f29787I = -1;
        this.f29795Q = null;
        this.f29796R = false;
        this.f29797S = true;
        this.f29798T = -1;
        b(context, attributeSet);
    }

    private RecyclerView.s a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f29799U = f29779V ? new j() : new f();
        m mVar = new m(context);
        this.f29789K = mVar;
        mVar.setId(X.k());
        this.f29789K.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f29786H = hVar;
        this.f29789K.setLayoutManager(hVar);
        this.f29789K.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f29789K.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f29789K.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f29791M = eVar;
        this.f29793O = new androidx.viewpager2.widget.c(this, eVar, this.f29789K);
        l lVar = new l();
        this.f29790L = lVar;
        lVar.b(this.f29789K);
        this.f29789K.n(this.f29791M);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f29792N = bVar;
        this.f29791M.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f29792N.d(bVar2);
        this.f29792N.d(cVar);
        this.f29799U.h(this.f29792N, this.f29789K);
        this.f29792N.d(this.f29782D);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f29786H);
        this.f29794P = dVar;
        this.f29792N.d(dVar);
        RecyclerView recyclerView = this.f29789K;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.E(this.f29785G);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        RecyclerView.h adapter;
        if (this.f29787I == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f29788J;
        if (parcelable != null) {
            if (adapter instanceof C3.c) {
                ((C3.c) adapter).b(parcelable);
            }
            this.f29788J = null;
        }
        int iMax = Math.max(0, Math.min(this.f29787I, adapter.h() - 1));
        this.f29783E = iMax;
        this.f29787I = -1;
        this.f29789K.u1(iMax);
        this.f29799U.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = B3.a.f1532a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        X.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(B3.a.f1533b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.H(this.f29785G);
        }
    }

    public boolean c() {
        return this.f29793O.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f29789K.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f29789K.canScrollVertically(i10);
    }

    boolean d() {
        return this.f29786H.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f29816B;
            sparseArray.put(this.f29789K.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f29797S;
    }

    public void g(i iVar) {
        this.f29782D.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f29799U.a() ? this.f29799U.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f29789K.getAdapter();
    }

    public int getCurrentItem() {
        return this.f29783E;
    }

    public int getItemDecorationCount() {
        return this.f29789K.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f29798T;
    }

    public int getOrientation() {
        return this.f29786H.r2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f29789K;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f29791M.h();
    }

    public void h() {
        this.f29794P.d();
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f29787I != -1) {
                this.f29787I = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.h() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.h() - 1);
        if (iMin == this.f29783E && this.f29791M.j()) {
            return;
        }
        int i11 = this.f29783E;
        if (iMin == i11 && z10) {
            return;
        }
        double dG = i11;
        this.f29783E = iMin;
        this.f29799U.r();
        if (!this.f29791M.j()) {
            dG = this.f29791M.g();
        }
        this.f29791M.m(iMin, z10);
        if (!z10) {
            this.f29789K.u1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dG) <= 3.0d) {
            this.f29789K.D1(iMin);
            return;
        }
        this.f29789K.u1(d10 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f29789K;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public void n(i iVar) {
        this.f29782D.e(iVar);
    }

    void o() {
        r rVar = this.f29790L;
        if (rVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = rVar.f(this.f29786H);
        if (viewF == null) {
            return;
        }
        int iL0 = this.f29786H.l0(viewF);
        if (iL0 != this.f29783E && getScrollState() == 0) {
            this.f29792N.c(iL0);
        }
        this.f29784F = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f29799U.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f29789K.getMeasuredWidth();
        int measuredHeight = this.f29789K.getMeasuredHeight();
        this.f29780B.left = getPaddingLeft();
        this.f29780B.right = (i12 - i10) - getPaddingRight();
        this.f29780B.top = getPaddingTop();
        this.f29780B.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f29780B, this.f29781C);
        RecyclerView recyclerView = this.f29789K;
        Rect rect = this.f29781C;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f29784F) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f29789K, i10, i11);
        int measuredWidth = this.f29789K.getMeasuredWidth();
        int measuredHeight = this.f29789K.getMeasuredHeight();
        int measuredState = this.f29789K.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f29787I = nVar.f29817C;
        this.f29788J = nVar.f29818D;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f29816B = this.f29789K.getId();
        int i10 = this.f29787I;
        if (i10 == -1) {
            i10 = this.f29783E;
        }
        nVar.f29817C = i10;
        Parcelable parcelable = this.f29788J;
        if (parcelable != null) {
            nVar.f29818D = parcelable;
        } else {
            Object adapter = this.f29789K.getAdapter();
            if (adapter instanceof C3.c) {
                nVar.f29818D = ((C3.c) adapter).a();
            }
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f29799U.c(i10, bundle) ? this.f29799U.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f29789K.getAdapter();
        this.f29799U.f(adapter);
        m(adapter);
        this.f29789K.setAdapter(hVar);
        this.f29783E = 0;
        i();
        this.f29799U.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f29799U.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f29798T = i10;
        this.f29789K.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f29786H.F2(i10);
        this.f29799U.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f29796R) {
                this.f29795Q = this.f29789K.getItemAnimator();
                this.f29796R = true;
            }
            this.f29789K.setItemAnimator(null);
        } else if (this.f29796R) {
            this.f29789K.setItemAnimator(this.f29795Q);
            this.f29795Q = null;
            this.f29796R = false;
        }
        this.f29794P.d();
        if (kVar == null) {
            return;
        }
        this.f29794P.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f29797S = z10;
        this.f29799U.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        int f29816B;

        /* renamed from: C, reason: collision with root package name */
        int f29817C;

        /* renamed from: D, reason: collision with root package name */
        Parcelable f29818D;

        class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f29816B = parcel.readInt();
            this.f29817C = parcel.readInt();
            this.f29818D = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29816B);
            parcel.writeInt(this.f29817C);
            parcel.writeParcelable(this.f29818D, i10);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class d implements RecyclerView.s {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) rVar).width != -1 || ((ViewGroup.MarginLayoutParams) rVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(View view) {
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void c(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }
    }
}
