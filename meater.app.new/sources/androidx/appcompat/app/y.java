package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import s1.C4434g0;
import s1.C4438i0;
import s1.InterfaceC4436h0;
import s1.InterfaceC4440j0;
import s1.X;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class y extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f20803E = new AccelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    private static final Interpolator f20804F = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    boolean f20805A;

    /* renamed from: a, reason: collision with root package name */
    Context f20809a;

    /* renamed from: b, reason: collision with root package name */
    private Context f20810b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f20811c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f20812d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f20813e;

    /* renamed from: f, reason: collision with root package name */
    D f20814f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f20815g;

    /* renamed from: h, reason: collision with root package name */
    View f20816h;

    /* renamed from: i, reason: collision with root package name */
    T f20817i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20820l;

    /* renamed from: m, reason: collision with root package name */
    d f20821m;

    /* renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f20822n;

    /* renamed from: o, reason: collision with root package name */
    b.a f20823o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20824p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20826r;

    /* renamed from: u, reason: collision with root package name */
    boolean f20829u;

    /* renamed from: v, reason: collision with root package name */
    boolean f20830v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20831w;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f20833y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20834z;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f20818j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f20819k = -1;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f20825q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private int f20827s = 0;

    /* renamed from: t, reason: collision with root package name */
    boolean f20828t = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20832x = true;

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC4436h0 f20806B = new a();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC4436h0 f20807C = new b();

    /* renamed from: D, reason: collision with root package name */
    final InterfaceC4440j0 f20808D = new c();

    /* compiled from: WindowDecorActionBar.java */
    class a extends C4438i0 {
        a() {
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            View view2;
            y yVar = y.this;
            if (yVar.f20828t && (view2 = yVar.f20816h) != null) {
                view2.setTranslationY(0.0f);
                y.this.f20813e.setTranslationY(0.0f);
            }
            y.this.f20813e.setVisibility(8);
            y.this.f20813e.setTransitioning(false);
            y yVar2 = y.this;
            yVar2.f20833y = null;
            yVar2.L();
            ActionBarOverlayLayout actionBarOverlayLayout = y.this.f20812d;
            if (actionBarOverlayLayout != null) {
                X.k0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class b extends C4438i0 {
        b() {
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            y yVar = y.this;
            yVar.f20833y = null;
            yVar.f20813e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class c implements InterfaceC4440j0 {
        c() {
        }

        @Override // s1.InterfaceC4440j0
        public void a(View view) {
            ((View) y.this.f20813e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: D, reason: collision with root package name */
        private final Context f20838D;

        /* renamed from: E, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f20839E;

        /* renamed from: F, reason: collision with root package name */
        private b.a f20840F;

        /* renamed from: G, reason: collision with root package name */
        private WeakReference<View> f20841G;

        public d(Context context, b.a aVar) {
            this.f20838D = context;
            this.f20840F = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.f20839E = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f20840F;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f20840F == null) {
                return;
            }
            k();
            y.this.f20815g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            y yVar = y.this;
            if (yVar.f20821m != this) {
                return;
            }
            if (y.K(yVar.f20829u, yVar.f20830v, false)) {
                this.f20840F.a(this);
            } else {
                y yVar2 = y.this;
                yVar2.f20822n = this;
                yVar2.f20823o = this.f20840F;
            }
            this.f20840F = null;
            y.this.J(false);
            y.this.f20815g.g();
            y yVar3 = y.this;
            yVar3.f20812d.setHideOnContentScrollEnabled(yVar3.f20805A);
            y.this.f20821m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f20841G;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f20839E;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f20838D);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return y.this.f20815g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return y.this.f20815g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (y.this.f20821m != this) {
                return;
            }
            this.f20839E.i0();
            try {
                this.f20840F.c(this, this.f20839E);
            } finally {
                this.f20839E.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return y.this.f20815g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            y.this.f20815g.setCustomView(view);
            this.f20841G = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(y.this.f20809a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            y.this.f20815g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(y.this.f20809a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            y.this.f20815g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            y.this.f20815g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f20839E.i0();
            try {
                return this.f20840F.b(this, this.f20839E);
            } finally {
                this.f20839E.h0();
            }
        }
    }

    public y(Activity activity, boolean z10) {
        this.f20811c = activity;
        View decorView = activity.getWindow().getDecorView();
        R(decorView);
        if (z10) {
            return;
        }
        this.f20816h = decorView.findViewById(R.id.content);
    }

    static boolean K(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private D O(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void Q() {
        if (this.f20831w) {
            this.f20831w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f20812d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            X(false);
        }
    }

    private void R(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f42515p);
        this.f20812d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f20814f = O(view.findViewById(i.f.f42500a));
        this.f20815g = (ActionBarContextView) view.findViewById(i.f.f42505f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f42502c);
        this.f20813e = actionBarContainer;
        D d10 = this.f20814f;
        if (d10 == null || this.f20815g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f20809a = d10.getContext();
        boolean z10 = (this.f20814f.u() & 4) != 0;
        if (z10) {
            this.f20820l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f20809a);
        C(aVarB.a() || z10);
        T(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f20809a.obtainStyledAttributes(null, i.j.f42684a, i.a.f42396c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f42734k, false)) {
            U(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f42724i, 0);
        if (dimensionPixelSize != 0) {
            B(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void T(boolean z10) {
        this.f20826r = z10;
        if (z10) {
            this.f20813e.setTabContainer(null);
            this.f20814f.j(this.f20817i);
        } else {
            this.f20814f.j(null);
            this.f20813e.setTabContainer(this.f20817i);
        }
        boolean z11 = P() == 2;
        T t10 = this.f20817i;
        if (t10 != null) {
            if (z11) {
                t10.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20812d;
                if (actionBarOverlayLayout != null) {
                    X.k0(actionBarOverlayLayout);
                }
            } else {
                t10.setVisibility(8);
            }
        }
        this.f20814f.y(!this.f20826r && z11);
        this.f20812d.setHasNonEmbeddedTabs(!this.f20826r && z11);
    }

    private boolean V() {
        return this.f20813e.isLaidOut();
    }

    private void W() {
        if (this.f20831w) {
            return;
        }
        this.f20831w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20812d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        X(false);
    }

    private void X(boolean z10) {
        if (K(this.f20829u, this.f20830v, this.f20831w)) {
            if (this.f20832x) {
                return;
            }
            this.f20832x = true;
            N(z10);
            return;
        }
        if (this.f20832x) {
            this.f20832x = false;
            M(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
        S(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void B(float f10) {
        X.v0(this.f20813e, f10);
    }

    @Override // androidx.appcompat.app.a
    public void C(boolean z10) {
        this.f20814f.t(z10);
    }

    @Override // androidx.appcompat.app.a
    public void D(int i10) {
        this.f20814f.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void E(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f20834z = z10;
        if (z10 || (hVar = this.f20833y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void F(CharSequence charSequence) {
        this.f20814f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void G(CharSequence charSequence) {
        this.f20814f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void H() {
        if (this.f20829u) {
            this.f20829u = false;
            X(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b I(b.a aVar) {
        d dVar = this.f20821m;
        if (dVar != null) {
            dVar.c();
        }
        this.f20812d.setHideOnContentScrollEnabled(false);
        this.f20815g.k();
        d dVar2 = new d(this.f20815g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f20821m = dVar2;
        dVar2.k();
        this.f20815g.h(dVar2);
        J(true);
        return dVar2;
    }

    public void J(boolean z10) {
        C4434g0 c4434g0P;
        C4434g0 c4434g0F;
        if (z10) {
            W();
        } else {
            Q();
        }
        if (!V()) {
            if (z10) {
                this.f20814f.r(4);
                this.f20815g.setVisibility(0);
                return;
            } else {
                this.f20814f.r(0);
                this.f20815g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c4434g0F = this.f20814f.p(4, 100L);
            c4434g0P = this.f20815g.f(0, 200L);
        } else {
            c4434g0P = this.f20814f.p(0, 200L);
            c4434g0F = this.f20815g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c4434g0F, c4434g0P);
        hVar.h();
    }

    void L() {
        b.a aVar = this.f20823o;
        if (aVar != null) {
            aVar.a(this.f20822n);
            this.f20822n = null;
            this.f20823o = null;
        }
    }

    public void M(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f20833y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f20827s != 0 || (!this.f20834z && !z10)) {
            this.f20806B.b(null);
            return;
        }
        this.f20813e.setAlpha(1.0f);
        this.f20813e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f20813e.getHeight();
        if (z10) {
            this.f20813e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C4434g0 c4434g0M = X.e(this.f20813e).m(f10);
        c4434g0M.k(this.f20808D);
        hVar2.c(c4434g0M);
        if (this.f20828t && (view = this.f20816h) != null) {
            hVar2.c(X.e(view).m(f10));
        }
        hVar2.f(f20803E);
        hVar2.e(250L);
        hVar2.g(this.f20806B);
        this.f20833y = hVar2;
        hVar2.h();
    }

    public void N(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f20833y;
        if (hVar != null) {
            hVar.a();
        }
        this.f20813e.setVisibility(0);
        if (this.f20827s == 0 && (this.f20834z || z10)) {
            this.f20813e.setTranslationY(0.0f);
            float f10 = -this.f20813e.getHeight();
            if (z10) {
                this.f20813e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f20813e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C4434g0 c4434g0M = X.e(this.f20813e).m(0.0f);
            c4434g0M.k(this.f20808D);
            hVar2.c(c4434g0M);
            if (this.f20828t && (view2 = this.f20816h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(X.e(this.f20816h).m(0.0f));
            }
            hVar2.f(f20804F);
            hVar2.e(250L);
            hVar2.g(this.f20807C);
            this.f20833y = hVar2;
            hVar2.h();
        } else {
            this.f20813e.setAlpha(1.0f);
            this.f20813e.setTranslationY(0.0f);
            if (this.f20828t && (view = this.f20816h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f20807C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20812d;
        if (actionBarOverlayLayout != null) {
            X.k0(actionBarOverlayLayout);
        }
    }

    public int P() {
        return this.f20814f.o();
    }

    public void S(int i10, int i11) {
        int iU = this.f20814f.u();
        if ((i11 & 4) != 0) {
            this.f20820l = true;
        }
        this.f20814f.l((i10 & i11) | ((~i11) & iU));
    }

    public void U(boolean z10) {
        if (z10 && !this.f20812d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f20805A = z10;
        this.f20812d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f20830v) {
            this.f20830v = false;
            X(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f20828t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f20830v) {
            return;
        }
        this.f20830v = true;
        X(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f20833y;
        if (hVar != null) {
            hVar.a();
            this.f20833y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i10) {
        this.f20827s = i10;
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        D d10 = this.f20814f;
        if (d10 == null || !d10.k()) {
            return false;
        }
        this.f20814f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f20824p) {
            return;
        }
        this.f20824p = z10;
        int size = this.f20825q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20825q.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public View j() {
        return this.f20814f.i();
    }

    @Override // androidx.appcompat.app.a
    public int k() {
        return this.f20814f.u();
    }

    @Override // androidx.appcompat.app.a
    public Context l() {
        if (this.f20810b == null) {
            TypedValue typedValue = new TypedValue();
            this.f20809a.getTheme().resolveAttribute(i.a.f42400g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f20810b = new ContextThemeWrapper(this.f20809a, i10);
            } else {
                this.f20810b = this.f20809a;
            }
        }
        return this.f20810b;
    }

    @Override // androidx.appcompat.app.a
    public void m() {
        if (this.f20829u) {
            return;
        }
        this.f20829u = true;
        X(false);
    }

    @Override // androidx.appcompat.app.a
    public void o(Configuration configuration) {
        T(androidx.appcompat.view.a.b(this.f20809a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean q(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f20821m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void t(View view) {
        this.f20814f.v(view);
    }

    @Override // androidx.appcompat.app.a
    public void u(View view, a.C0299a c0299a) {
        view.setLayoutParams(c0299a);
        this.f20814f.v(view);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        if (this.f20820l) {
            return;
        }
        w(z10);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        S(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        if ((i10 & 4) != 0) {
            this.f20820l = true;
        }
        this.f20814f.l(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(boolean z10) {
        S(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void z(boolean z10) {
        S(z10 ? 2 : 0, 2);
    }

    public y(Dialog dialog) {
        R(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
