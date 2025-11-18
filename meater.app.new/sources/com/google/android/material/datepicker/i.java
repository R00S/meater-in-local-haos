package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import r1.C4338e;
import s1.C4421a;
import s1.X;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class i<S> extends r<S> {

    /* renamed from: U0, reason: collision with root package name */
    static final Object f36406U0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: V0, reason: collision with root package name */
    static final Object f36407V0 = "NAVIGATION_PREV_TAG";

    /* renamed from: W0, reason: collision with root package name */
    static final Object f36408W0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: X0, reason: collision with root package name */
    static final Object f36409X0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: H0, reason: collision with root package name */
    private int f36410H0;

    /* renamed from: I0, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f36411I0;

    /* renamed from: J0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f36412J0;

    /* renamed from: K0, reason: collision with root package name */
    private com.google.android.material.datepicker.g f36413K0;

    /* renamed from: L0, reason: collision with root package name */
    private n f36414L0;

    /* renamed from: M0, reason: collision with root package name */
    private l f36415M0;

    /* renamed from: N0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f36416N0;

    /* renamed from: O0, reason: collision with root package name */
    private RecyclerView f36417O0;

    /* renamed from: P0, reason: collision with root package name */
    private RecyclerView f36418P0;

    /* renamed from: Q0, reason: collision with root package name */
    private View f36419Q0;

    /* renamed from: R0, reason: collision with root package name */
    private View f36420R0;

    /* renamed from: S0, reason: collision with root package name */
    private View f36421S0;

    /* renamed from: T0, reason: collision with root package name */
    private View f36422T0;

    /* compiled from: MaterialCalendar.java */
    class a implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p f36423B;

        a(p pVar) {
            this.f36423B = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iG2 = i.this.O2().g2() - 1;
            if (iG2 >= 0) {
                i.this.R2(this.f36423B.J(iG2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f36425B;

        b(int i10) {
            this.f36425B = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f36418P0.D1(this.f36425B);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class c extends C4421a {
        c() {
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            tVar.j0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class d extends s {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f36428I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f36428I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void R1(RecyclerView.C c10, int[] iArr) {
            if (this.f36428I == 0) {
                iArr[0] = i.this.f36418P0.getWidth();
                iArr[1] = i.this.f36418P0.getWidth();
            } else {
                iArr[0] = i.this.f36418P0.getHeight();
                iArr[1] = i.this.f36418P0.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.i.m
        public void a(long j10) {
            if (i.this.f36412J0.g().S0(j10)) {
                i.this.f36411I0.s1(j10);
                Iterator<q<S>> it = i.this.f36514G0.iterator();
                while (it.hasNext()) {
                    it.next().a(i.this.f36411I0.k1());
                }
                i.this.f36418P0.getAdapter().n();
                if (i.this.f36417O0 != null) {
                    i.this.f36417O0.getAdapter().n();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class f extends C4421a {
        f() {
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            tVar.K0(false);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class g extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f36432a = u.i();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f36433b = u.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
            if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                v vVar = (v) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C4338e<Long, Long> c4338e : i.this.f36411I0.Q()) {
                    Long l10 = c4338e.f48339a;
                    if (l10 != null && c4338e.f48340b != null) {
                        this.f36432a.setTimeInMillis(l10.longValue());
                        this.f36433b.setTimeInMillis(c4338e.f48340b.longValue());
                        int iK = vVar.K(this.f36432a.get(1));
                        int iK2 = vVar.K(this.f36433b.get(1));
                        View viewH = gridLayoutManager.H(iK);
                        View viewH2 = gridLayoutManager.H(iK2);
                        int iM3 = iK / gridLayoutManager.m3();
                        int iM32 = iK2 / gridLayoutManager.m3();
                        int i10 = iM3;
                        while (i10 <= iM32) {
                            if (gridLayoutManager.H(gridLayoutManager.m3() * i10) != null) {
                                canvas.drawRect((i10 != iM3 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), r9.getTop() + i.this.f36416N0.f36396d.c(), (i10 != iM32 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), r9.getBottom() - i.this.f36416N0.f36396d.b(), i.this.f36416N0.f36400h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class h extends C4421a {
        h() {
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            tVar.v0(i.this.f36422T0.getVisibility() == 0 ? i.this.A0(C7.k.f2557z) : i.this.A0(C7.k.f2555x));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    class C0467i extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f36436a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f36437b;

        C0467i(p pVar, MaterialButton materialButton) {
            this.f36436a = pVar;
            this.f36437b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f36437b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iE2 = i10 < 0 ? i.this.O2().e2() : i.this.O2().g2();
            i.this.f36414L0 = this.f36436a.J(iE2);
            this.f36437b.setText(this.f36436a.K(iE2));
        }
    }

    /* compiled from: MaterialCalendar.java */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.U2();
        }
    }

    /* compiled from: MaterialCalendar.java */
    class k implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p f36440B;

        k(p pVar) {
            this.f36440B = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iE2 = i.this.O2().e2() + 1;
            if (iE2 < i.this.f36418P0.getAdapter().h()) {
                i.this.R2(this.f36440B.J(iE2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    enum l {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    interface m {
        void a(long j10);
    }

    private void G2(View view, p pVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C7.g.f2493t);
        materialButton.setTag(f36409X0);
        X.n0(materialButton, new h());
        View viewFindViewById = view.findViewById(C7.g.f2495v);
        this.f36419Q0 = viewFindViewById;
        viewFindViewById.setTag(f36407V0);
        View viewFindViewById2 = view.findViewById(C7.g.f2494u);
        this.f36420R0 = viewFindViewById2;
        viewFindViewById2.setTag(f36408W0);
        this.f36421S0 = view.findViewById(C7.g.f2447D);
        this.f36422T0 = view.findViewById(C7.g.f2498y);
        S2(l.DAY);
        materialButton.setText(this.f36414L0.v());
        this.f36418P0.n(new C0467i(pVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f36420R0.setOnClickListener(new k(pVar));
        this.f36419Q0.setOnClickListener(new a(pVar));
    }

    private RecyclerView.p H2() {
        return new g();
    }

    static int M2(Context context) {
        return context.getResources().getDimensionPixelSize(C7.e.f2388e0);
    }

    private static int N2(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7.e.f2402l0) + resources.getDimensionPixelOffset(C7.e.f2404m0) + resources.getDimensionPixelOffset(C7.e.f2400k0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7.e.f2392g0);
        int i10 = o.f36497H;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C7.e.f2388e0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C7.e.f2398j0)) + resources.getDimensionPixelOffset(C7.e.f2384c0);
    }

    public static <T> i<T> P2(com.google.android.material.datepicker.d<T> dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        iVar.k2(bundle);
        return iVar;
    }

    private void Q2(int i10) {
        this.f36418P0.post(new b(i10));
    }

    private void T2() {
        X.n0(this.f36418P0, new f());
    }

    com.google.android.material.datepicker.a I2() {
        return this.f36412J0;
    }

    com.google.android.material.datepicker.c J2() {
        return this.f36416N0;
    }

    n K2() {
        return this.f36414L0;
    }

    public com.google.android.material.datepicker.d<S> L2() {
        return this.f36411I0;
    }

    LinearLayoutManager O2() {
        return (LinearLayoutManager) this.f36418P0.getLayoutManager();
    }

    void R2(n nVar) {
        p pVar = (p) this.f36418P0.getAdapter();
        int iL = pVar.L(nVar);
        int iL2 = iL - pVar.L(this.f36414L0);
        boolean z10 = Math.abs(iL2) > 3;
        boolean z11 = iL2 > 0;
        this.f36414L0 = nVar;
        if (z10 && z11) {
            this.f36418P0.u1(iL - 3);
            Q2(iL);
        } else if (!z10) {
            Q2(iL);
        } else {
            this.f36418P0.u1(iL + 3);
            Q2(iL);
        }
    }

    void S2(l lVar) {
        this.f36415M0 = lVar;
        if (lVar == l.YEAR) {
            this.f36417O0.getLayoutManager().C1(((v) this.f36417O0.getAdapter()).K(this.f36414L0.f36492D));
            this.f36421S0.setVisibility(0);
            this.f36422T0.setVisibility(8);
            this.f36419Q0.setVisibility(8);
            this.f36420R0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f36421S0.setVisibility(8);
            this.f36422T0.setVisibility(0);
            this.f36419Q0.setVisibility(0);
            this.f36420R0.setVisibility(0);
            R2(this.f36414L0);
        }
    }

    void U2() {
        l lVar = this.f36415M0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            S2(l.DAY);
        } else if (lVar == l.DAY) {
            S2(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        if (bundle == null) {
            bundle = X();
        }
        this.f36410H0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f36411I0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f36412J0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f36413K0 = (com.google.android.material.datepicker.g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f36414L0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(Z(), this.f36410H0);
        this.f36416N0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVarL = this.f36412J0.l();
        if (com.google.android.material.datepicker.k.d3(contextThemeWrapper)) {
            i10 = C7.i.f2523u;
            i11 = 1;
        } else {
            i10 = C7.i.f2521s;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(N2(e2()));
        GridView gridView = (GridView) viewInflate.findViewById(C7.g.f2499z);
        X.n0(gridView, new c());
        int i12 = this.f36412J0.i();
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new com.google.android.material.datepicker.h(i12) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(nVarL.f36493E);
        gridView.setEnabled(false);
        this.f36418P0 = (RecyclerView) viewInflate.findViewById(C7.g.f2446C);
        this.f36418P0.setLayoutManager(new d(Z(), i11, false, i11));
        this.f36418P0.setTag(f36406U0);
        p pVar = new p(contextThemeWrapper, this.f36411I0, this.f36412J0, this.f36413K0, new e());
        this.f36418P0.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(C7.h.f2502c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C7.g.f2447D);
        this.f36417O0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f36417O0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f36417O0.setAdapter(new v(this));
            this.f36417O0.j(H2());
        }
        if (viewInflate.findViewById(C7.g.f2493t) != null) {
            G2(viewInflate, pVar);
        }
        if (!com.google.android.material.datepicker.k.d3(contextThemeWrapper)) {
            new androidx.recyclerview.widget.r().b(this.f36418P0);
        }
        this.f36418P0.u1(pVar.L(this.f36414L0));
        T2();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void w1(Bundle bundle) {
        super.w1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f36410H0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f36411I0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36412J0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f36413K0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f36414L0);
    }

    @Override // com.google.android.material.datepicker.r
    public boolean x2(q<S> qVar) {
        return super.x2(qVar);
    }
}
