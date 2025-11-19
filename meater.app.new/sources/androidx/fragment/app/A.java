package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbstractC2106m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.K;
import s1.X;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    private final u f25382a;

    /* renamed from: b, reason: collision with root package name */
    private final B f25383b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f25384c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25385d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f25386e = -1;

    /* compiled from: FragmentStateManager.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25389a;

        static {
            int[] iArr = new int[AbstractC2106m.b.values().length];
            f25389a = iArr;
            try {
                iArr[AbstractC2106m.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25389a[AbstractC2106m.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25389a[AbstractC2106m.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25389a[AbstractC2106m.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    A(u uVar, B b10, Fragment fragment) {
        this.f25382a = uVar;
        this.f25383b = b10;
        this.f25384c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f25384c.f25489l0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f25384c.f25489l0) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f25384c);
        }
        Bundle bundle = this.f25384c.f25451C;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f25384c.B1(bundle2);
        this.f25382a.a(this.f25384c, bundle2, false);
    }

    void b() {
        Fragment fragmentQ0 = v.q0(this.f25384c.f25488k0);
        Fragment fragmentN0 = this.f25384c.n0();
        if (fragmentQ0 != null && !fragmentQ0.equals(fragmentN0)) {
            Fragment fragment = this.f25384c;
            K1.b.j(fragment, fragmentQ0, fragment.f25479b0);
        }
        int iJ = this.f25383b.j(this.f25384c);
        Fragment fragment2 = this.f25384c;
        fragment2.f25488k0.addView(fragment2.f25489l0, iJ);
    }

    void c() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f25384c);
        }
        Fragment fragment = this.f25384c;
        Fragment fragment2 = fragment.f25460I;
        A aN = null;
        if (fragment2 != null) {
            A aN2 = this.f25383b.n(fragment2.f25458G);
            if (aN2 == null) {
                throw new IllegalStateException("Fragment " + this.f25384c + " declared target fragment " + this.f25384c.f25460I + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f25384c;
            fragment3.f25461J = fragment3.f25460I.f25458G;
            fragment3.f25460I = null;
            aN = aN2;
        } else {
            String str = fragment.f25461J;
            if (str != null && (aN = this.f25383b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f25384c + " declared target fragment " + this.f25384c.f25461J + " that does not belong to this FragmentManager!");
            }
        }
        if (aN != null) {
            aN.m();
        }
        Fragment fragment4 = this.f25384c;
        fragment4.f25475X = fragment4.f25474W.D0();
        Fragment fragment5 = this.f25384c;
        fragment5.f25477Z = fragment5.f25474W.G0();
        this.f25382a.g(this.f25384c, false);
        this.f25384c.C1();
        this.f25382a.b(this.f25384c, false);
    }

    int d() {
        Fragment fragment = this.f25384c;
        if (fragment.f25474W == null) {
            return fragment.f25449B;
        }
        int iMin = this.f25386e;
        int i10 = b.f25389a[fragment.f25499v0.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f25384c;
        if (fragment2.f25468Q) {
            if (fragment2.f25469R) {
                iMin = Math.max(this.f25386e, 2);
                View view = this.f25384c.f25489l0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f25386e < 4 ? Math.min(iMin, fragment2.f25449B) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f25384c;
        if (fragment3.f25470S && fragment3.f25488k0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f25384c.f25464M) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f25384c;
        ViewGroup viewGroup = fragment4.f25488k0;
        K.d.a aVarS = viewGroup != null ? K.u(viewGroup, fragment4.o0()).s(this) : null;
        if (aVarS == K.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == K.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f25384c;
            if (fragment5.f25465N) {
                iMin = fragment5.M0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f25384c;
        if (fragment6.f25490m0 && fragment6.f25449B < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f25384c.f25466O) {
            iMin = Math.max(iMin, 3);
        }
        if (v.Q0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f25384c);
        }
        return iMin;
    }

    void e() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f25384c);
        }
        Bundle bundle = this.f25384c.f25451C;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f25384c;
        if (fragment.f25497t0) {
            fragment.f25449B = 1;
            fragment.g2();
        } else {
            this.f25382a.h(fragment, bundle2, false);
            this.f25384c.F1(bundle2);
            this.f25382a.c(this.f25384c, bundle2, false);
        }
    }

    void f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f25384c.f25468Q) {
            return;
        }
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f25384c);
        }
        Bundle bundle = this.f25384c.f25451C;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterL1 = this.f25384c.L1(bundle2);
        Fragment fragment = this.f25384c;
        ViewGroup viewGroup2 = fragment.f25488k0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.f25479b0;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f25384c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.f25474W.x0().e(this.f25384c.f25479b0);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f25384c;
                    if (!fragment2.f25471T && !fragment2.f25470S) {
                        try {
                            resourceName = fragment2.u0().getResourceName(this.f25384c.f25479b0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f25384c.f25479b0) + " (" + resourceName + ") for fragment " + this.f25384c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    K1.b.i(this.f25384c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f25384c;
        fragment3.f25488k0 = viewGroup;
        fragment3.H1(layoutInflaterL1, viewGroup, bundle2);
        if (this.f25384c.f25489l0 != null) {
            if (v.Q0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f25384c);
            }
            this.f25384c.f25489l0.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f25384c;
            fragment4.f25489l0.setTag(I1.b.f6645a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f25384c;
            if (fragment5.f25481d0) {
                fragment5.f25489l0.setVisibility(8);
            }
            if (this.f25384c.f25489l0.isAttachedToWindow()) {
                X.k0(this.f25384c.f25489l0);
            } else {
                View view = this.f25384c.f25489l0;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f25384c.Y1();
            u uVar = this.f25382a;
            Fragment fragment6 = this.f25384c;
            uVar.m(fragment6, fragment6.f25489l0, bundle2, false);
            int visibility = this.f25384c.f25489l0.getVisibility();
            this.f25384c.r2(this.f25384c.f25489l0.getAlpha());
            Fragment fragment7 = this.f25384c;
            if (fragment7.f25488k0 != null && visibility == 0) {
                View viewFindFocus = fragment7.f25489l0.findFocus();
                if (viewFindFocus != null) {
                    this.f25384c.l2(viewFindFocus);
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f25384c);
                    }
                }
                this.f25384c.f25489l0.setAlpha(0.0f);
            }
        }
        this.f25384c.f25449B = 2;
    }

    void g() {
        Fragment fragmentF;
        if (v.Q0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f25384c);
        }
        Fragment fragment = this.f25384c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.f25465N && !fragment.M0();
        if (z10) {
            Fragment fragment2 = this.f25384c;
            if (!fragment2.f25467P) {
                this.f25383b.B(fragment2.f25458G, null);
            }
        }
        if (!z10 && !this.f25383b.p().t(this.f25384c)) {
            String str = this.f25384c.f25461J;
            if (str != null && (fragmentF = this.f25383b.f(str)) != null && fragmentF.f25483f0) {
                this.f25384c.f25460I = fragmentF;
            }
            this.f25384c.f25449B = 0;
            return;
        }
        s<?> sVar = this.f25384c.f25475X;
        if (sVar instanceof c0) {
            zIsChangingConfigurations = this.f25383b.p().q();
        } else if (sVar.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) sVar.getContext()).isChangingConfigurations();
        }
        if ((z10 && !this.f25384c.f25467P) || zIsChangingConfigurations) {
            this.f25383b.p().i(this.f25384c, false);
        }
        this.f25384c.I1();
        this.f25382a.d(this.f25384c, false);
        for (A a10 : this.f25383b.k()) {
            if (a10 != null) {
                Fragment fragmentK = a10.k();
                if (this.f25384c.f25458G.equals(fragmentK.f25461J)) {
                    fragmentK.f25460I = this.f25384c;
                    fragmentK.f25461J = null;
                }
            }
        }
        Fragment fragment3 = this.f25384c;
        String str2 = fragment3.f25461J;
        if (str2 != null) {
            fragment3.f25460I = this.f25383b.f(str2);
        }
        this.f25383b.s(this);
    }

    void h() {
        View view;
        if (v.Q0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f25384c);
        }
        Fragment fragment = this.f25384c;
        ViewGroup viewGroup = fragment.f25488k0;
        if (viewGroup != null && (view = fragment.f25489l0) != null) {
            viewGroup.removeView(view);
        }
        this.f25384c.J1();
        this.f25382a.n(this.f25384c, false);
        Fragment fragment2 = this.f25384c;
        fragment2.f25488k0 = null;
        fragment2.f25489l0 = null;
        fragment2.f25501x0 = null;
        fragment2.f25502y0.o(null);
        this.f25384c.f25469R = false;
    }

    void i() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f25384c);
        }
        this.f25384c.K1();
        this.f25382a.e(this.f25384c, false);
        Fragment fragment = this.f25384c;
        fragment.f25449B = -1;
        fragment.f25475X = null;
        fragment.f25477Z = null;
        fragment.f25474W = null;
        if ((!fragment.f25465N || fragment.M0()) && !this.f25383b.p().t(this.f25384c)) {
            return;
        }
        if (v.Q0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f25384c);
        }
        this.f25384c.I0();
    }

    void j() {
        Fragment fragment = this.f25384c;
        if (fragment.f25468Q && fragment.f25469R && !fragment.f25472U) {
            if (v.Q0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f25384c);
            }
            Bundle bundle = this.f25384c.f25451C;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f25384c;
            fragment2.H1(fragment2.L1(bundle2), null, bundle2);
            View view = this.f25384c.f25489l0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f25384c;
                fragment3.f25489l0.setTag(I1.b.f6645a, fragment3);
                Fragment fragment4 = this.f25384c;
                if (fragment4.f25481d0) {
                    fragment4.f25489l0.setVisibility(8);
                }
                this.f25384c.Y1();
                u uVar = this.f25382a;
                Fragment fragment5 = this.f25384c;
                uVar.m(fragment5, fragment5.f25489l0, bundle2, false);
                this.f25384c.f25449B = 2;
            }
        }
    }

    Fragment k() {
        return this.f25384c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f25385d) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f25385d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f25384c;
                int i10 = fragment.f25449B;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.f25465N && !fragment.M0() && !this.f25384c.f25467P) {
                        if (v.Q0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f25384c);
                        }
                        this.f25383b.p().i(this.f25384c, true);
                        this.f25383b.s(this);
                        if (v.Q0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f25384c);
                        }
                        this.f25384c.I0();
                    }
                    Fragment fragment2 = this.f25384c;
                    if (fragment2.f25495r0) {
                        if (fragment2.f25489l0 != null && (viewGroup = fragment2.f25488k0) != null) {
                            K kU = K.u(viewGroup, fragment2.o0());
                            if (this.f25384c.f25481d0) {
                                kU.k(this);
                            } else {
                                kU.m(this);
                            }
                        }
                        Fragment fragment3 = this.f25384c;
                        v vVar = fragment3.f25474W;
                        if (vVar != null) {
                            vVar.O0(fragment3);
                        }
                        Fragment fragment4 = this.f25384c;
                        fragment4.f25495r0 = false;
                        fragment4.k1(fragment4.f25481d0);
                        this.f25384c.f25476Y.N();
                    }
                    this.f25385d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.f25467P && this.f25383b.q(fragment.f25458G) == null) {
                                this.f25383b.B(this.f25384c.f25458G, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f25384c.f25449B = 1;
                            break;
                        case 2:
                            fragment.f25469R = false;
                            fragment.f25449B = 2;
                            break;
                        case 3:
                            if (v.Q0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f25384c);
                            }
                            Fragment fragment5 = this.f25384c;
                            if (fragment5.f25467P) {
                                this.f25383b.B(fragment5.f25458G, r());
                            } else if (fragment5.f25489l0 != null && fragment5.f25453D == null) {
                                s();
                            }
                            Fragment fragment6 = this.f25384c;
                            if (fragment6.f25489l0 != null && (viewGroup2 = fragment6.f25488k0) != null) {
                                K.u(viewGroup2, fragment6.o0()).l(this);
                            }
                            this.f25384c.f25449B = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f25449B = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.f25489l0 != null && (viewGroup3 = fragment.f25488k0) != null) {
                                K.u(viewGroup3, fragment.o0()).j(K.d.b.n(this.f25384c.f25489l0.getVisibility()), this);
                            }
                            this.f25384c.f25449B = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f25449B = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f25385d = false;
            throw th;
        }
    }

    void n() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f25384c);
        }
        this.f25384c.Q1();
        this.f25382a.f(this.f25384c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f25384c.f25451C;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f25384c.f25451C.getBundle("savedInstanceState") == null) {
            this.f25384c.f25451C.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f25384c;
            fragment.f25453D = fragment.f25451C.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f25384c;
            fragment2.f25455E = fragment2.f25451C.getBundle("viewRegistryState");
            z zVar = (z) this.f25384c.f25451C.getParcelable("state");
            if (zVar != null) {
                Fragment fragment3 = this.f25384c;
                fragment3.f25461J = zVar.f25839N;
                fragment3.f25462K = zVar.f25840O;
                Boolean bool = fragment3.f25457F;
                if (bool != null) {
                    fragment3.f25491n0 = bool.booleanValue();
                    this.f25384c.f25457F = null;
                } else {
                    fragment3.f25491n0 = zVar.f25841P;
                }
            }
            Fragment fragment4 = this.f25384c;
            if (fragment4.f25491n0) {
                return;
            }
            fragment4.f25490m0 = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f25384c);
        }
        View viewG0 = this.f25384c.g0();
        if (viewG0 != null && l(viewG0)) {
            boolean zRequestFocus = viewG0.requestFocus();
            if (v.Q0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewG0);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f25384c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f25384c.f25489l0.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f25384c.l2(null);
        this.f25384c.U1();
        this.f25382a.i(this.f25384c, false);
        this.f25383b.B(this.f25384c.f25458G, null);
        Fragment fragment = this.f25384c;
        fragment.f25451C = null;
        fragment.f25453D = null;
        fragment.f25455E = null;
    }

    Fragment.l q() {
        if (this.f25384c.f25449B > -1) {
            return new Fragment.l(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f25384c;
        if (fragment.f25449B == -1 && (bundle = fragment.f25451C) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new z(this.f25384c));
        if (this.f25384c.f25449B > -1) {
            Bundle bundle3 = new Bundle();
            this.f25384c.V1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f25382a.j(this.f25384c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f25384c.f25448A0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleB1 = this.f25384c.f25476Y.Y0();
            if (!bundleB1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleB1);
            }
            if (this.f25384c.f25489l0 != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f25384c.f25453D;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f25384c.f25455E;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f25384c.f25459H;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f25384c.f25489l0 == null) {
            return;
        }
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f25384c + " with view " + this.f25384c.f25489l0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f25384c.f25489l0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f25384c.f25453D = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f25384c.f25501x0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f25384c.f25455E = bundle;
    }

    void t(int i10) {
        this.f25386e = i10;
    }

    void u() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f25384c);
        }
        this.f25384c.W1();
        this.f25382a.k(this.f25384c, false);
    }

    void v() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f25384c);
        }
        this.f25384c.X1();
        this.f25382a.l(this.f25384c, false);
    }

    A(u uVar, B b10, ClassLoader classLoader, r rVar, Bundle bundle) {
        this.f25382a = uVar;
        this.f25383b = b10;
        Fragment fragmentA = ((z) bundle.getParcelable("state")).a(rVar, classLoader);
        this.f25384c = fragmentA;
        fragmentA.f25451C = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.k2(bundle2);
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    /* compiled from: FragmentStateManager.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f25387B;

        a(View view) {
            this.f25387B = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f25387B.removeOnAttachStateChangeListener(this);
            X.k0(this.f25387B);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    A(u uVar, B b10, Fragment fragment, Bundle bundle) {
        this.f25382a = uVar;
        this.f25383b = b10;
        this.f25384c = fragment;
        fragment.f25453D = null;
        fragment.f25455E = null;
        fragment.f25473V = 0;
        fragment.f25469R = false;
        fragment.f25464M = false;
        Fragment fragment2 = fragment.f25460I;
        fragment.f25461J = fragment2 != null ? fragment2.f25458G : null;
        fragment.f25460I = null;
        fragment.f25451C = bundle;
        fragment.f25459H = bundle.getBundle("arguments");
    }
}
