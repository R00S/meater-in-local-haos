package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbstractC2106m;
import android.view.C2098e0;
import android.view.C2116x;
import android.view.ContextMenu;
import android.view.InterfaceC2104k;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.S;
import android.view.V;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.animation.Animation;
import android.view.b0;
import android.view.c0;
import f1.C3310c;
import g.AbstractC3371c;
import g.AbstractC3373e;
import g.InterfaceC3370b;
import g.InterfaceC3374f;
import h.AbstractC3466a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q.InterfaceC4257a;
import s1.C4460u;
import t3.C4547d;
import t3.C4548e;
import t3.C4550g;
import t3.InterfaceC4549f;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2114v, c0, InterfaceC2104k, InterfaceC4549f {

    /* renamed from: F0, reason: collision with root package name */
    static final Object f25447F0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    C4548e f25448A0;

    /* renamed from: B, reason: collision with root package name */
    int f25449B;

    /* renamed from: B0, reason: collision with root package name */
    private int f25450B0;

    /* renamed from: C, reason: collision with root package name */
    Bundle f25451C;

    /* renamed from: C0, reason: collision with root package name */
    private final AtomicInteger f25452C0;

    /* renamed from: D, reason: collision with root package name */
    SparseArray<Parcelable> f25453D;

    /* renamed from: D0, reason: collision with root package name */
    private final ArrayList<k> f25454D0;

    /* renamed from: E, reason: collision with root package name */
    Bundle f25455E;

    /* renamed from: E0, reason: collision with root package name */
    private final k f25456E0;

    /* renamed from: F, reason: collision with root package name */
    Boolean f25457F;

    /* renamed from: G, reason: collision with root package name */
    String f25458G;

    /* renamed from: H, reason: collision with root package name */
    Bundle f25459H;

    /* renamed from: I, reason: collision with root package name */
    Fragment f25460I;

    /* renamed from: J, reason: collision with root package name */
    String f25461J;

    /* renamed from: K, reason: collision with root package name */
    int f25462K;

    /* renamed from: L, reason: collision with root package name */
    private Boolean f25463L;

    /* renamed from: M, reason: collision with root package name */
    boolean f25464M;

    /* renamed from: N, reason: collision with root package name */
    boolean f25465N;

    /* renamed from: O, reason: collision with root package name */
    boolean f25466O;

    /* renamed from: P, reason: collision with root package name */
    boolean f25467P;

    /* renamed from: Q, reason: collision with root package name */
    boolean f25468Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f25469R;

    /* renamed from: S, reason: collision with root package name */
    boolean f25470S;

    /* renamed from: T, reason: collision with root package name */
    boolean f25471T;

    /* renamed from: U, reason: collision with root package name */
    boolean f25472U;

    /* renamed from: V, reason: collision with root package name */
    int f25473V;

    /* renamed from: W, reason: collision with root package name */
    v f25474W;

    /* renamed from: X, reason: collision with root package name */
    s<?> f25475X;

    /* renamed from: Y, reason: collision with root package name */
    v f25476Y;

    /* renamed from: Z, reason: collision with root package name */
    Fragment f25477Z;

    /* renamed from: a0, reason: collision with root package name */
    int f25478a0;

    /* renamed from: b0, reason: collision with root package name */
    int f25479b0;

    /* renamed from: c0, reason: collision with root package name */
    String f25480c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f25481d0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f25482e0;

    /* renamed from: f0, reason: collision with root package name */
    boolean f25483f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f25484g0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f25485h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f25486i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f25487j0;

    /* renamed from: k0, reason: collision with root package name */
    ViewGroup f25488k0;

    /* renamed from: l0, reason: collision with root package name */
    View f25489l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f25490m0;

    /* renamed from: n0, reason: collision with root package name */
    boolean f25491n0;

    /* renamed from: o0, reason: collision with root package name */
    j f25492o0;

    /* renamed from: p0, reason: collision with root package name */
    Handler f25493p0;

    /* renamed from: q0, reason: collision with root package name */
    Runnable f25494q0;

    /* renamed from: r0, reason: collision with root package name */
    boolean f25495r0;

    /* renamed from: s0, reason: collision with root package name */
    LayoutInflater f25496s0;

    /* renamed from: t0, reason: collision with root package name */
    boolean f25497t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f25498u0;

    /* renamed from: v0, reason: collision with root package name */
    AbstractC2106m.b f25499v0;

    /* renamed from: w0, reason: collision with root package name */
    C2116x f25500w0;

    /* renamed from: x0, reason: collision with root package name */
    G f25501x0;

    /* renamed from: y0, reason: collision with root package name */
    android.view.D<InterfaceC2114v> f25502y0;

    /* renamed from: z0, reason: collision with root package name */
    a0.c f25503z0;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends AbstractC3371c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f25504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3466a f25505b;

        a(AtomicReference atomicReference, AbstractC3466a abstractC3466a) {
            this.f25504a = atomicReference;
            this.f25505b = abstractC3466a;
        }

        @Override // g.AbstractC3371c
        public void b(I i10, C3310c c3310c) {
            AbstractC3371c abstractC3371c = (AbstractC3371c) this.f25504a.get();
            if (abstractC3371c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC3371c.b(i10, c3310c);
        }

        @Override // g.AbstractC3371c
        public void c() {
            AbstractC3371c abstractC3371c = (AbstractC3371c) this.f25504a.getAndSet(null);
            if (abstractC3371c != null) {
                abstractC3371c.c();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.w2();
        }
    }

    class c extends k {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.k
        void a() {
            Fragment.this.f25448A0.c();
            S.c(Fragment.this);
            Bundle bundle = Fragment.this.f25451C;
            Fragment.this.f25448A0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.N(false);
        }
    }

    class e implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ K f25510B;

        e(K k10) {
            this.f25510B = k10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25510B.y()) {
                this.f25510B.n();
            }
        }
    }

    class f extends J1.g {
        f() {
        }

        @Override // J1.g
        public View e(int i10) {
            View view = Fragment.this.f25489l0;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // J1.g
        public boolean f() {
            return Fragment.this.f25489l0 != null;
        }
    }

    class g implements InterfaceC2111s {
        g() {
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
            View view;
            if (aVar != AbstractC2106m.a.ON_STOP || (view = Fragment.this.f25489l0) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    class h implements InterfaceC4257a<Void, AbstractC3373e> {
        h() {
        }

        @Override // q.InterfaceC4257a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3373e apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f25475X;
            return obj instanceof InterfaceC3374f ? ((InterfaceC3374f) obj).getActivityResultRegistry() : fragment.c2().getActivityResultRegistry();
        }
    }

    class i extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4257a f25515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f25516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3466a f25517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3370b f25518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC4257a interfaceC4257a, AtomicReference atomicReference, AbstractC3466a abstractC3466a, InterfaceC3370b interfaceC3370b) {
            super(null);
            this.f25515a = interfaceC4257a;
            this.f25516b = atomicReference;
            this.f25517c = abstractC3466a;
            this.f25518d = interfaceC3370b;
        }

        @Override // androidx.fragment.app.Fragment.k
        void a() {
            String strS = Fragment.this.S();
            this.f25516b.set(((AbstractC3373e) this.f25515a.apply(null)).l(strS, Fragment.this, this.f25517c, this.f25518d));
        }
    }

    static class j {

        /* renamed from: a, reason: collision with root package name */
        View f25520a;

        /* renamed from: b, reason: collision with root package name */
        boolean f25521b;

        /* renamed from: c, reason: collision with root package name */
        int f25522c;

        /* renamed from: d, reason: collision with root package name */
        int f25523d;

        /* renamed from: e, reason: collision with root package name */
        int f25524e;

        /* renamed from: f, reason: collision with root package name */
        int f25525f;

        /* renamed from: g, reason: collision with root package name */
        int f25526g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<String> f25527h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList<String> f25528i;

        /* renamed from: j, reason: collision with root package name */
        Object f25529j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f25530k;

        /* renamed from: l, reason: collision with root package name */
        Object f25531l;

        /* renamed from: m, reason: collision with root package name */
        Object f25532m;

        /* renamed from: n, reason: collision with root package name */
        Object f25533n;

        /* renamed from: o, reason: collision with root package name */
        Object f25534o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f25535p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f25536q;

        /* renamed from: r, reason: collision with root package name */
        f1.y f25537r;

        /* renamed from: s, reason: collision with root package name */
        f1.y f25538s;

        /* renamed from: t, reason: collision with root package name */
        float f25539t;

        /* renamed from: u, reason: collision with root package name */
        View f25540u;

        /* renamed from: v, reason: collision with root package name */
        boolean f25541v;

        j() {
            Object obj = Fragment.f25447F0;
            this.f25530k = obj;
            this.f25531l = null;
            this.f25532m = obj;
            this.f25533n = null;
            this.f25534o = obj;
            this.f25537r = null;
            this.f25538s = null;
            this.f25539t = 1.0f;
            this.f25540u = null;
        }
    }

    private static abstract class k {
        private k() {
        }

        abstract void a();

        /* synthetic */ k(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.f25449B = -1;
        this.f25458G = UUID.randomUUID().toString();
        this.f25461J = null;
        this.f25463L = null;
        this.f25476Y = new w();
        this.f25486i0 = true;
        this.f25491n0 = true;
        this.f25494q0 = new b();
        this.f25499v0 = AbstractC2106m.b.RESUMED;
        this.f25502y0 = new android.view.D<>();
        this.f25452C0 = new AtomicInteger();
        this.f25454D0 = new ArrayList<>();
        this.f25456E0 = new c();
        H0();
    }

    private Fragment D0(boolean z10) {
        String str;
        if (z10) {
            K1.b.h(this);
        }
        Fragment fragment = this.f25460I;
        if (fragment != null) {
            return fragment;
        }
        v vVar = this.f25474W;
        if (vVar == null || (str = this.f25461J) == null) {
            return null;
        }
        return vVar.k0(str);
    }

    private void H0() {
        this.f25500w0 = new C2116x(this);
        this.f25448A0 = C4548e.a(this);
        this.f25503z0 = null;
        if (this.f25454D0.contains(this.f25456E0)) {
            return;
        }
        b2(this.f25456E0);
    }

    @Deprecated
    public static Fragment J0(Context context, String str, Bundle bundle) throws IllegalAccessException, java.lang.InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = r.f(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.k2(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private j Q() {
        if (this.f25492o0 == null) {
            this.f25492o0 = new j();
        }
        return this.f25492o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0() {
        this.f25501x0.e(this.f25455E);
        this.f25455E = null;
    }

    private <I, O> AbstractC3371c<I> Z1(AbstractC3466a<I, O> abstractC3466a, InterfaceC4257a<Void, AbstractC3373e> interfaceC4257a, InterfaceC3370b<O> interfaceC3370b) {
        if (this.f25449B <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            b2(new i(interfaceC4257a, atomicReference, abstractC3466a, interfaceC3370b));
            return new a(atomicReference, abstractC3466a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void b2(k kVar) {
        if (this.f25449B >= 0) {
            kVar.a();
        } else {
            this.f25454D0.add(kVar);
        }
    }

    private void h2() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f25489l0 != null) {
            Bundle bundle = this.f25451C;
            i2(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f25451C = null;
    }

    private int l0() {
        AbstractC2106m.b bVar = this.f25499v0;
        return (bVar == AbstractC2106m.b.INITIALIZED || this.f25477Z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f25477Z.l0());
    }

    public final String A0(int i10) {
        return u0().getString(i10);
    }

    public void A1(Bundle bundle) {
        this.f25487j0 = true;
    }

    @Override // t3.InterfaceC4549f
    public final C4547d B() {
        return this.f25448A0.getSavedStateRegistry();
    }

    public final String B0(int i10, Object... objArr) {
        return u0().getString(i10, objArr);
    }

    void B1(Bundle bundle) {
        this.f25476Y.g1();
        this.f25449B = 3;
        this.f25487j0 = false;
        U0(bundle);
        if (this.f25487j0) {
            h2();
            this.f25476Y.C();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final String C0() {
        return this.f25480c0;
    }

    void C1() {
        Iterator<k> it = this.f25454D0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f25454D0.clear();
        this.f25476Y.p(this.f25475X, O(), this);
        this.f25449B = 0;
        this.f25487j0 = false;
        X0(this.f25475X.getContext());
        if (this.f25487j0) {
            this.f25474W.M(this);
            this.f25476Y.D();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void D1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public View E0() {
        return this.f25489l0;
    }

    boolean E1(MenuItem menuItem) {
        if (this.f25481d0) {
            return false;
        }
        if (Z0(menuItem)) {
            return true;
        }
        return this.f25476Y.F(menuItem);
    }

    public InterfaceC2114v F0() {
        G g10 = this.f25501x0;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    void F1(Bundle bundle) {
        this.f25476Y.g1();
        this.f25449B = 1;
        this.f25487j0 = false;
        this.f25500w0.a(new g());
        a1(bundle);
        this.f25497t0 = true;
        if (this.f25487j0) {
            this.f25500w0.i(AbstractC2106m.a.ON_CREATE);
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onCreate()");
    }

    public android.view.B<InterfaceC2114v> G0() {
        return this.f25502y0;
    }

    boolean G1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f25481d0) {
            return false;
        }
        if (this.f25485h0 && this.f25486i0) {
            d1(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.f25476Y.H(menu, menuInflater);
    }

    void H1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f25476Y.g1();
        this.f25472U = true;
        this.f25501x0 = new G(this, v(), new Runnable() { // from class: J1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f7216B.S0();
            }
        });
        View viewE1 = e1(layoutInflater, viewGroup, bundle);
        this.f25489l0 = viewE1;
        if (viewE1 == null) {
            if (this.f25501x0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f25501x0 = null;
            return;
        }
        this.f25501x0.b();
        if (v.Q0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f25489l0 + " for Fragment " + this);
        }
        android.view.View.b(this.f25489l0, this.f25501x0);
        C2098e0.b(this.f25489l0, this.f25501x0);
        C4550g.b(this.f25489l0, this.f25501x0);
        this.f25502y0.o(this.f25501x0);
    }

    void I0() {
        H0();
        this.f25498u0 = this.f25458G;
        this.f25458G = UUID.randomUUID().toString();
        this.f25464M = false;
        this.f25465N = false;
        this.f25468Q = false;
        this.f25469R = false;
        this.f25471T = false;
        this.f25473V = 0;
        this.f25474W = null;
        this.f25476Y = new w();
        this.f25475X = null;
        this.f25478a0 = 0;
        this.f25479b0 = 0;
        this.f25480c0 = null;
        this.f25481d0 = false;
        this.f25482e0 = false;
    }

    void I1() {
        this.f25476Y.I();
        this.f25500w0.i(AbstractC2106m.a.ON_DESTROY);
        this.f25449B = 0;
        this.f25487j0 = false;
        this.f25497t0 = false;
        f1();
        if (this.f25487j0) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void J1() {
        this.f25476Y.J();
        if (this.f25489l0 != null && this.f25501x0.getLifecycle().getState().j(AbstractC2106m.b.CREATED)) {
            this.f25501x0.a(AbstractC2106m.a.ON_DESTROY);
        }
        this.f25449B = 1;
        this.f25487j0 = false;
        h1();
        if (this.f25487j0) {
            androidx.loader.app.a.b(this).c();
            this.f25472U = false;
        } else {
            throw new M("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean K0() {
        return this.f25475X != null && this.f25464M;
    }

    void K1() {
        this.f25449B = -1;
        this.f25487j0 = false;
        i1();
        this.f25496s0 = null;
        if (this.f25487j0) {
            if (this.f25476Y.P0()) {
                return;
            }
            this.f25476Y.I();
            this.f25476Y = new w();
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean L0() {
        v vVar;
        return this.f25481d0 || ((vVar = this.f25474W) != null && vVar.T0(this.f25477Z));
    }

    LayoutInflater L1(Bundle bundle) {
        LayoutInflater layoutInflaterJ1 = j1(bundle);
        this.f25496s0 = layoutInflaterJ1;
        return layoutInflaterJ1;
    }

    final boolean M0() {
        return this.f25473V > 0;
    }

    void M1() {
        onLowMemory();
    }

    void N(boolean z10) {
        ViewGroup viewGroup;
        v vVar;
        j jVar = this.f25492o0;
        if (jVar != null) {
            jVar.f25541v = false;
        }
        if (this.f25489l0 == null || (viewGroup = this.f25488k0) == null || (vVar = this.f25474W) == null) {
            return;
        }
        K kU = K.u(viewGroup, vVar);
        kU.z();
        if (z10) {
            this.f25475X.getHandler().post(new e(kU));
        } else {
            kU.n();
        }
        Handler handler = this.f25493p0;
        if (handler != null) {
            handler.removeCallbacks(this.f25494q0);
            this.f25493p0 = null;
        }
    }

    public final boolean N0() {
        v vVar;
        return this.f25486i0 && ((vVar = this.f25474W) == null || vVar.U0(this.f25477Z));
    }

    void N1(boolean z10) {
        n1(z10);
    }

    J1.g O() {
        return new f();
    }

    boolean O0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return false;
        }
        return jVar.f25541v;
    }

    boolean O1(MenuItem menuItem) {
        if (this.f25481d0) {
            return false;
        }
        if (this.f25485h0 && this.f25486i0 && o1(menuItem)) {
            return true;
        }
        return this.f25476Y.O(menuItem);
    }

    public void P(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f25478a0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f25479b0));
        printWriter.print(" mTag=");
        printWriter.println(this.f25480c0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f25449B);
        printWriter.print(" mWho=");
        printWriter.print(this.f25458G);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f25473V);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f25464M);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f25465N);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f25468Q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f25469R);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f25481d0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f25482e0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f25486i0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f25485h0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f25483f0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f25491n0);
        if (this.f25474W != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f25474W);
        }
        if (this.f25475X != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f25475X);
        }
        if (this.f25477Z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f25477Z);
        }
        if (this.f25459H != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f25459H);
        }
        if (this.f25451C != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f25451C);
        }
        if (this.f25453D != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f25453D);
        }
        if (this.f25455E != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f25455E);
        }
        Fragment fragmentD0 = D0(false);
        if (fragmentD0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentD0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f25462K);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(p0());
        if (a0() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(a0());
        }
        if (d0() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(d0());
        }
        if (q0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(q0());
        }
        if (r0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(r0());
        }
        if (this.f25488k0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f25488k0);
        }
        if (this.f25489l0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f25489l0);
        }
        if (W() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(W());
        }
        if (Z() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f25476Y + ":");
        this.f25476Y.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean P0() {
        return this.f25465N;
    }

    void P1(Menu menu) {
        if (this.f25481d0) {
            return;
        }
        if (this.f25485h0 && this.f25486i0) {
            p1(menu);
        }
        this.f25476Y.P(menu);
    }

    public final boolean Q0() {
        v vVar = this.f25474W;
        if (vVar == null) {
            return false;
        }
        return vVar.X0();
    }

    void Q1() {
        this.f25476Y.R();
        if (this.f25489l0 != null) {
            this.f25501x0.a(AbstractC2106m.a.ON_PAUSE);
        }
        this.f25500w0.i(AbstractC2106m.a.ON_PAUSE);
        this.f25449B = 6;
        this.f25487j0 = false;
        q1();
        if (this.f25487j0) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onPause()");
    }

    Fragment R(String str) {
        return str.equals(this.f25458G) ? this : this.f25476Y.o0(str);
    }

    public final boolean R0() {
        View view;
        return (!K0() || L0() || (view = this.f25489l0) == null || view.getWindowToken() == null || this.f25489l0.getVisibility() != 0) ? false : true;
    }

    void R1(boolean z10) {
        r1(z10);
    }

    String S() {
        return "fragment_" + this.f25458G + "_rq#" + this.f25452C0.getAndIncrement();
    }

    boolean S1(Menu menu) {
        boolean z10 = false;
        if (this.f25481d0) {
            return false;
        }
        if (this.f25485h0 && this.f25486i0) {
            s1(menu);
            z10 = true;
        }
        return z10 | this.f25476Y.T(menu);
    }

    public final o T() {
        s<?> sVar = this.f25475X;
        if (sVar == null) {
            return null;
        }
        return (o) sVar.getActivity();
    }

    void T0() {
        this.f25476Y.g1();
    }

    void T1() {
        boolean zV0 = this.f25474W.V0(this);
        Boolean bool = this.f25463L;
        if (bool == null || bool.booleanValue() != zV0) {
            this.f25463L = Boolean.valueOf(zV0);
            t1(zV0);
            this.f25476Y.U();
        }
    }

    public boolean U() {
        Boolean bool;
        j jVar = this.f25492o0;
        if (jVar == null || (bool = jVar.f25536q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void U0(Bundle bundle) {
        this.f25487j0 = true;
    }

    void U1() {
        this.f25476Y.g1();
        this.f25476Y.f0(true);
        this.f25449B = 7;
        this.f25487j0 = false;
        v1();
        if (!this.f25487j0) {
            throw new M("Fragment " + this + " did not call through to super.onResume()");
        }
        C2116x c2116x = this.f25500w0;
        AbstractC2106m.a aVar = AbstractC2106m.a.ON_RESUME;
        c2116x.i(aVar);
        if (this.f25489l0 != null) {
            this.f25501x0.a(aVar);
        }
        this.f25476Y.V();
    }

    public boolean V() {
        Boolean bool;
        j jVar = this.f25492o0;
        if (jVar == null || (bool = jVar.f25535p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void V0(int i10, int i11, Intent intent) {
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    void V1(Bundle bundle) {
        w1(bundle);
    }

    View W() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25520a;
    }

    @Deprecated
    public void W0(Activity activity) {
        this.f25487j0 = true;
    }

    void W1() {
        this.f25476Y.g1();
        this.f25476Y.f0(true);
        this.f25449B = 5;
        this.f25487j0 = false;
        x1();
        if (!this.f25487j0) {
            throw new M("Fragment " + this + " did not call through to super.onStart()");
        }
        C2116x c2116x = this.f25500w0;
        AbstractC2106m.a aVar = AbstractC2106m.a.ON_START;
        c2116x.i(aVar);
        if (this.f25489l0 != null) {
            this.f25501x0.a(aVar);
        }
        this.f25476Y.W();
    }

    public final Bundle X() {
        return this.f25459H;
    }

    public void X0(Context context) {
        this.f25487j0 = true;
        s<?> sVar = this.f25475X;
        Activity activityH = sVar == null ? null : sVar.getActivity();
        if (activityH != null) {
            this.f25487j0 = false;
            W0(activityH);
        }
    }

    void X1() {
        this.f25476Y.Y();
        if (this.f25489l0 != null) {
            this.f25501x0.a(AbstractC2106m.a.ON_STOP);
        }
        this.f25500w0.i(AbstractC2106m.a.ON_STOP);
        this.f25449B = 4;
        this.f25487j0 = false;
        y1();
        if (this.f25487j0) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onStop()");
    }

    public final v Y() {
        if (this.f25475X != null) {
            return this.f25476Y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    void Y1() {
        Bundle bundle = this.f25451C;
        z1(this.f25489l0, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f25476Y.Z();
    }

    public Context Z() {
        s<?> sVar = this.f25475X;
        if (sVar == null) {
            return null;
        }
        return sVar.getContext();
    }

    public boolean Z0(MenuItem menuItem) {
        return false;
    }

    int a0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 0;
        }
        return jVar.f25522c;
    }

    public void a1(Bundle bundle) {
        this.f25487j0 = true;
        g2();
        if (this.f25476Y.W0(1)) {
            return;
        }
        this.f25476Y.G();
    }

    public final <I, O> AbstractC3371c<I> a2(AbstractC3466a<I, O> abstractC3466a, InterfaceC3370b<O> interfaceC3370b) {
        return Z1(abstractC3466a, new h(), interfaceC3370b);
    }

    public Object b0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25529j;
    }

    public Animation b1(int i10, boolean z10, int i11) {
        return null;
    }

    f1.y c0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25537r;
    }

    public Animator c1(int i10, boolean z10, int i11) {
        return null;
    }

    public final o c2() {
        o oVarT = T();
        if (oVarT != null) {
            return oVarT;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    int d0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 0;
        }
        return jVar.f25523d;
    }

    public final Bundle d2() {
        Bundle bundleX = X();
        if (bundleX != null) {
            return bundleX;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public Object e0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25531l;
    }

    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f25450B0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public final Context e2() {
        Context contextZ = Z();
        if (contextZ != null) {
            return contextZ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    f1.y f0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25538s;
    }

    public void f1() {
        this.f25487j0 = true;
    }

    public final View f2() {
        View viewE0 = E0();
        if (viewE0 != null) {
            return viewE0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    View g0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25540u;
    }

    void g2() {
        Bundle bundle;
        Bundle bundle2 = this.f25451C;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f25476Y.z1(bundle);
        this.f25476Y.G();
    }

    @Override // android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        return this.f25500w0;
    }

    public final Object h0() {
        s<?> sVar = this.f25475X;
        if (sVar == null) {
            return null;
        }
        return sVar.n();
    }

    public void h1() {
        this.f25487j0 = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final int i0() {
        return this.f25478a0;
    }

    public void i1() {
        this.f25487j0 = true;
    }

    final void i2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f25453D;
        if (sparseArray != null) {
            this.f25489l0.restoreHierarchyState(sparseArray);
            this.f25453D = null;
        }
        this.f25487j0 = false;
        A1(bundle);
        if (this.f25487j0) {
            if (this.f25489l0 != null) {
                this.f25501x0.a(AbstractC2106m.a.ON_CREATE);
            }
        } else {
            throw new M("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final LayoutInflater j0() {
        LayoutInflater layoutInflater = this.f25496s0;
        return layoutInflater == null ? L1(null) : layoutInflater;
    }

    public LayoutInflater j1(Bundle bundle) {
        return k0(bundle);
    }

    void j2(int i10, int i11, int i12, int i13) {
        if (this.f25492o0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        Q().f25522c = i10;
        Q().f25523d = i11;
        Q().f25524e = i12;
        Q().f25525f = i13;
    }

    @Deprecated
    public LayoutInflater k0(Bundle bundle) {
        s<?> sVar = this.f25475X;
        if (sVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterP = sVar.p();
        C4460u.a(layoutInflaterP, this.f25476Y.E0());
        return layoutInflaterP;
    }

    public void k2(Bundle bundle) {
        if (this.f25474W != null && Q0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f25459H = bundle;
    }

    @Override // android.view.InterfaceC2104k
    public a0.c l() {
        Application application;
        if (this.f25474W == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f25503z0 == null) {
            Context applicationContext = e2().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && v.Q0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + e2().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f25503z0 = new V(application, this, X());
        }
        return this.f25503z0;
    }

    @Deprecated
    public void l1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f25487j0 = true;
    }

    void l2(View view) {
        Q().f25540u = view;
    }

    @Override // android.view.InterfaceC2104k
    public Q1.a m() {
        Application application;
        Context applicationContext = e2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && v.Q0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + e2().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        Q1.d dVar = new Q1.d();
        if (application != null) {
            dVar.c(a0.a.f25931h, application);
        }
        dVar.c(S.f25904a, this);
        dVar.c(S.f25905b, this);
        if (X() != null) {
            dVar.c(S.f25906c, X());
        }
        return dVar;
    }

    int m0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 0;
        }
        return jVar.f25526g;
    }

    public void m1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f25487j0 = true;
        s<?> sVar = this.f25475X;
        Activity activityH = sVar == null ? null : sVar.getActivity();
        if (activityH != null) {
            this.f25487j0 = false;
            l1(activityH, attributeSet, bundle);
        }
    }

    @Deprecated
    public void m2(boolean z10) {
        if (this.f25485h0 != z10) {
            this.f25485h0 = z10;
            if (!K0() || L0()) {
                return;
            }
            this.f25475X.s();
        }
    }

    public final Fragment n0() {
        return this.f25477Z;
    }

    public void n2(l lVar) {
        Bundle bundle;
        if (this.f25474W != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (lVar == null || (bundle = lVar.f25542B) == null) {
            bundle = null;
        }
        this.f25451C = bundle;
    }

    public final v o0() {
        v vVar = this.f25474W;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public boolean o1(MenuItem menuItem) {
        return false;
    }

    public void o2(boolean z10) {
        if (this.f25486i0 != z10) {
            this.f25486i0 = z10;
            if (this.f25485h0 && K0() && !L0()) {
                this.f25475X.s();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f25487j0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        c2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f25487j0 = true;
    }

    boolean p0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return false;
        }
        return jVar.f25521b;
    }

    void p2(int i10) {
        if (this.f25492o0 == null && i10 == 0) {
            return;
        }
        Q();
        this.f25492o0.f25526g = i10;
    }

    int q0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 0;
        }
        return jVar.f25524e;
    }

    public void q1() {
        this.f25487j0 = true;
    }

    void q2(boolean z10) {
        if (this.f25492o0 == null) {
            return;
        }
        Q().f25521b = z10;
    }

    int r0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 0;
        }
        return jVar.f25525f;
    }

    void r2(float f10) {
        Q().f25539t = f10;
    }

    float s0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f25539t;
    }

    void s2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Q();
        j jVar = this.f25492o0;
        jVar.f25527h = arrayList;
        jVar.f25528i = arrayList2;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        v2(intent, i10, null);
    }

    public Object t0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f25532m;
        return obj == f25447F0 ? e0() : obj;
    }

    public void t2(Intent intent) {
        u2(intent, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f25458G);
        if (this.f25478a0 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f25478a0));
        }
        if (this.f25480c0 != null) {
            sb2.append(" tag=");
            sb2.append(this.f25480c0);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final Resources u0() {
        return e2().getResources();
    }

    public void u2(Intent intent, Bundle bundle) {
        s<?> sVar = this.f25475X;
        if (sVar != null) {
            sVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // android.view.c0
    public b0 v() {
        if (this.f25474W == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (l0() != AbstractC2106m.b.INITIALIZED.ordinal()) {
            return this.f25474W.L0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public Object v0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f25530k;
        return obj == f25447F0 ? b0() : obj;
    }

    public void v1() {
        this.f25487j0 = true;
    }

    @Deprecated
    public void v2(Intent intent, int i10, Bundle bundle) {
        if (this.f25475X != null) {
            o0().e1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object w0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        return jVar.f25533n;
    }

    public void w2() {
        if (this.f25492o0 == null || !Q().f25541v) {
            return;
        }
        if (this.f25475X == null) {
            Q().f25541v = false;
        } else if (Looper.myLooper() != this.f25475X.getHandler().getLooper()) {
            this.f25475X.getHandler().postAtFrontOfQueue(new d());
        } else {
            N(true);
        }
    }

    public Object x0() {
        j jVar = this.f25492o0;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f25534o;
        return obj == f25447F0 ? w0() : obj;
    }

    public void x1() {
        this.f25487j0 = true;
    }

    ArrayList<String> y0() {
        ArrayList<String> arrayList;
        j jVar = this.f25492o0;
        return (jVar == null || (arrayList = jVar.f25527h) == null) ? new ArrayList<>() : arrayList;
    }

    public void y1() {
        this.f25487j0 = true;
    }

    ArrayList<String> z0() {
        ArrayList<String> arrayList;
        j jVar = this.f25492o0;
        return (jVar == null || (arrayList = jVar.f25528i) == null) ? new ArrayList<>() : arrayList;
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        final Bundle f25542B;

        class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(Bundle bundle) {
            this.f25542B = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f25542B);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f25542B = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public Fragment(int i10) {
        this();
        this.f25450B0 = i10;
    }

    @Deprecated
    public void g1() {
    }

    @Deprecated
    public void Y0(Fragment fragment) {
    }

    public void k1(boolean z10) {
    }

    public void n1(boolean z10) {
    }

    @Deprecated
    public void p1(Menu menu) {
    }

    public void r1(boolean z10) {
    }

    @Deprecated
    public void s1(Menu menu) {
    }

    public void t1(boolean z10) {
    }

    public void w1(Bundle bundle) {
    }

    @Deprecated
    public void d1(Menu menu, MenuInflater menuInflater) {
    }

    public void z1(View view, Bundle bundle) {
    }

    @Deprecated
    public void u1(int i10, String[] strArr, int[] iArr) {
    }
}
