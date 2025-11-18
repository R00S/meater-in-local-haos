package androidx.fragment.app;

import K1.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import d.AbstractC2994F;
import d.C2995G;
import d.C2998b;
import f1.v;
import g.AbstractC3371c;
import g.AbstractC3373e;
import g.C3369a;
import g.C3375g;
import g.InterfaceC3370b;
import g.InterfaceC3374f;
import g1.InterfaceC3378b;
import g1.InterfaceC3379c;
import h.AbstractC3466a;
import h.C3467b;
import h.C3469d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r1.InterfaceC4334a;
import s1.InterfaceC4420A;
import s1.InterfaceC4464w;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: U, reason: collision with root package name */
    private static boolean f25735U = false;

    /* renamed from: V, reason: collision with root package name */
    static boolean f25736V = true;

    /* renamed from: A, reason: collision with root package name */
    Fragment f25737A;

    /* renamed from: F, reason: collision with root package name */
    private AbstractC3371c<Intent> f25742F;

    /* renamed from: G, reason: collision with root package name */
    private AbstractC3371c<C3375g> f25743G;

    /* renamed from: H, reason: collision with root package name */
    private AbstractC3371c<String[]> f25744H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f25746J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f25747K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f25748L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f25749M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f25750N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList<C2080a> f25751O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList<Boolean> f25752P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList<Fragment> f25753Q;

    /* renamed from: R, reason: collision with root package name */
    private y f25754R;

    /* renamed from: S, reason: collision with root package name */
    private b.c f25755S;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25758b;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f25761e;

    /* renamed from: g, reason: collision with root package name */
    private C2995G f25763g;

    /* renamed from: x, reason: collision with root package name */
    private androidx.fragment.app.s<?> f25780x;

    /* renamed from: y, reason: collision with root package name */
    private J1.g f25781y;

    /* renamed from: z, reason: collision with root package name */
    private Fragment f25782z;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f25757a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final B f25759c = new B();

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C2080a> f25760d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.t f25762f = new androidx.fragment.app.t(this);

    /* renamed from: h, reason: collision with root package name */
    C2080a f25764h = null;

    /* renamed from: i, reason: collision with root package name */
    boolean f25765i = false;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2994F f25766j = new b(false);

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f25767k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, C2082c> f25768l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f25769m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, n> f25770n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    ArrayList<o> f25771o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final u f25772p = new u(this);

    /* renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<J1.n> f25773q = new CopyOnWriteArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC4334a<Configuration> f25774r = new InterfaceC4334a() { // from class: J1.h
        @Override // r1.InterfaceC4334a
        public final void accept(Object obj) {
            this.f7221a.a1((Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC4334a<Integer> f25775s = new InterfaceC4334a() { // from class: J1.i
        @Override // r1.InterfaceC4334a
        public final void accept(Object obj) {
            this.f7222a.b1((Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC4334a<f1.j> f25776t = new InterfaceC4334a() { // from class: J1.j
        @Override // r1.InterfaceC4334a
        public final void accept(Object obj) {
            this.f7223a.c1((f1.j) obj);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC4334a<f1.v> f25777u = new InterfaceC4334a() { // from class: J1.k
        @Override // r1.InterfaceC4334a
        public final void accept(Object obj) {
            this.f7224a.d1((v) obj);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC4420A f25778v = new c();

    /* renamed from: w, reason: collision with root package name */
    int f25779w = -1;

    /* renamed from: B, reason: collision with root package name */
    private androidx.fragment.app.r f25738B = null;

    /* renamed from: C, reason: collision with root package name */
    private androidx.fragment.app.r f25739C = new d();

    /* renamed from: D, reason: collision with root package name */
    private L f25740D = null;

    /* renamed from: E, reason: collision with root package name */
    private L f25741E = new e();

    /* renamed from: I, reason: collision with root package name */
    ArrayDeque<m> f25745I = new ArrayDeque<>();

    /* renamed from: T, reason: collision with root package name */
    private Runnable f25756T = new f();

    /* compiled from: FragmentManager.java */
    class a implements InterfaceC3370b<Map<String, Boolean>> {
        a() {
        }

        @Override // g.InterfaceC3370b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m mVarPollFirst = v.this.f25745I.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = mVarPollFirst.f25797B;
            int i11 = mVarPollFirst.f25798C;
            Fragment fragmentI = v.this.f25759c.i(str);
            if (fragmentI != null) {
                fragmentI.u1(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    class b extends AbstractC2994F {
        b(boolean z10) {
            super(z10);
        }

        @Override // d.AbstractC2994F
        public void c() {
            if (v.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + v.f25736V + " fragment manager " + v.this);
            }
            if (v.f25736V) {
                v.this.s();
            }
        }

        @Override // d.AbstractC2994F
        public void d() {
            if (v.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + v.f25736V + " fragment manager " + v.this);
            }
            v.this.M0();
        }

        @Override // d.AbstractC2994F
        public void e(C2998b c2998b) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + v.f25736V + " fragment manager " + v.this);
            }
            v vVar = v.this;
            if (vVar.f25764h != null) {
                Iterator<K> it = vVar.z(new ArrayList<>(Collections.singletonList(v.this.f25764h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(c2998b);
                }
                Iterator<o> it2 = v.this.f25771o.iterator();
                while (it2.hasNext()) {
                    it2.next().e(c2998b);
                }
            }
        }

        @Override // d.AbstractC2994F
        public void f(C2998b c2998b) {
            if (v.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + v.f25736V + " fragment manager " + v.this);
            }
            if (v.f25736V) {
                v.this.c0();
                v.this.r1();
            }
        }
    }

    /* compiled from: FragmentManager.java */
    class c implements InterfaceC4420A {
        c() {
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return v.this.O(menuItem);
        }

        @Override // s1.InterfaceC4420A
        public void b(Menu menu) {
            v.this.P(menu);
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            v.this.H(menu, menuInflater);
        }

        @Override // s1.InterfaceC4420A
        public void d(Menu menu) {
            v.this.T(menu);
        }
    }

    /* compiled from: FragmentManager.java */
    class d extends androidx.fragment.app.r {
        d() {
        }

        @Override // androidx.fragment.app.r
        public Fragment c(ClassLoader classLoader, String str) {
            return v.this.D0().b(v.this.D0().getContext(), str, null);
        }
    }

    /* compiled from: FragmentManager.java */
    class e implements L {
        e() {
        }

        @Override // androidx.fragment.app.L
        public K a(ViewGroup viewGroup) {
            return new C2084e(viewGroup);
        }
    }

    /* compiled from: FragmentManager.java */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f0(true);
        }
    }

    /* compiled from: FragmentManager.java */
    class g implements InterfaceC2111s {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f25789B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ J1.o f25790C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f25791D;

        g(String str, J1.o oVar, AbstractC2106m abstractC2106m) {
            this.f25789B = str;
            this.f25790C = oVar;
            this.f25791D = abstractC2106m;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
            Bundle bundle;
            if (aVar == AbstractC2106m.a.ON_START && (bundle = (Bundle) v.this.f25769m.get(this.f25789B)) != null) {
                this.f25790C.a(this.f25789B, bundle);
                v.this.x(this.f25789B);
            }
            if (aVar == AbstractC2106m.a.ON_DESTROY) {
                this.f25791D.d(this);
                v.this.f25770n.remove(this.f25789B);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    class h implements J1.n {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f25793B;

        h(Fragment fragment) {
            this.f25793B = fragment;
        }

        @Override // J1.n
        public void a(v vVar, Fragment fragment) {
            this.f25793B.Y0(fragment);
        }
    }

    /* compiled from: FragmentManager.java */
    class i implements InterfaceC3370b<C3369a> {
        i() {
        }

        @Override // g.InterfaceC3370b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3369a c3369a) {
            m mVarPollLast = v.this.f25745I.pollLast();
            if (mVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVarPollLast.f25797B;
            int i10 = mVarPollLast.f25798C;
            Fragment fragmentI = v.this.f25759c.i(str);
            if (fragmentI != null) {
                fragmentI.V0(i10, c3369a.getResultCode(), c3369a.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    class j implements InterfaceC3370b<C3369a> {
        j() {
        }

        @Override // g.InterfaceC3370b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3369a c3369a) {
            m mVarPollFirst = v.this.f25745I.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVarPollFirst.f25797B;
            int i10 = mVarPollFirst.f25798C;
            Fragment fragmentI = v.this.f25759c.i(str);
            if (fragmentI != null) {
                fragmentI.V0(i10, c3369a.getResultCode(), c3369a.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    static class k extends AbstractC3466a<C3375g, C3369a> {
        k() {
        }

        @Override // h.AbstractC3466a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, C3375g c3375g) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = c3375g.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c3375g = new C3375g.a(c3375g.getIntentSender()).b(null).c(c3375g.getFlagsValues(), c3375g.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c3375g);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.AbstractC3466a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C3369a c(int i10, Intent intent) {
            return new C3369a(i10, intent);
        }
    }

    /* compiled from: FragmentManager.java */
    private static class n implements J1.o {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC2106m f25799a;

        /* renamed from: b, reason: collision with root package name */
        private final J1.o f25800b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC2111s f25801c;

        n(AbstractC2106m abstractC2106m, J1.o oVar, InterfaceC2111s interfaceC2111s) {
            this.f25799a = abstractC2106m;
            this.f25800b = oVar;
            this.f25801c = interfaceC2111s;
        }

        @Override // J1.o
        public void a(String str, Bundle bundle) {
            this.f25800b.a(str, bundle);
        }

        public boolean b(AbstractC2106m.b bVar) {
            return this.f25799a.getState().j(bVar);
        }

        public void c() {
            this.f25799a.d(this.f25801c);
        }
    }

    /* compiled from: FragmentManager.java */
    interface p {
        boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    private class q implements p {

        /* renamed from: a, reason: collision with root package name */
        final String f25802a;

        /* renamed from: b, reason: collision with root package name */
        final int f25803b;

        /* renamed from: c, reason: collision with root package name */
        final int f25804c;

        q(String str, int i10, int i11) {
            this.f25802a = str;
            this.f25803b = i10;
            this.f25804c = i11;
        }

        @Override // androidx.fragment.app.v.p
        public boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = v.this.f25737A;
            if (fragment == null || this.f25803b >= 0 || this.f25802a != null || !fragment.Y().m1()) {
                return v.this.p1(arrayList, arrayList2, this.f25802a, this.f25803b, this.f25804c);
            }
            return false;
        }
    }

    /* compiled from: FragmentManager.java */
    class r implements p {
        r() {
        }

        @Override // androidx.fragment.app.v.p
        public boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zQ1 = v.this.q1(arrayList, arrayList2);
            if (!v.this.f25771o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<C2080a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(v.this.s0(it.next()));
                }
                Iterator<o> it2 = v.this.f25771o.iterator();
                while (it2.hasNext()) {
                    o next = it2.next();
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        next.b((Fragment) it3.next(), zBooleanValue);
                    }
                }
            }
            return zQ1;
        }
    }

    /* compiled from: FragmentManager.java */
    private class s implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f25807a;

        s(String str) {
            this.f25807a = str;
        }

        @Override // androidx.fragment.app.v.p
        public boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
            return v.this.y1(arrayList, arrayList2, this.f25807a);
        }
    }

    /* compiled from: FragmentManager.java */
    private class t implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f25809a;

        t(String str) {
            this.f25809a = str;
        }

        @Override // androidx.fragment.app.v.p
        public boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
            return v.this.D1(arrayList, arrayList2, this.f25809a);
        }
    }

    static int A1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    static Fragment K0(View view) {
        Object tag = view.getTag(I1.b.f6645a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void L1(Fragment fragment) {
        ViewGroup viewGroupZ0 = z0(fragment);
        if (viewGroupZ0 == null || fragment.a0() + fragment.d0() + fragment.q0() + fragment.r0() <= 0) {
            return;
        }
        int i10 = I1.b.f6647c;
        if (viewGroupZ0.getTag(i10) == null) {
            viewGroupZ0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupZ0.getTag(i10)).q2(fragment.p0());
    }

    private void N1() {
        Iterator<A> it = this.f25759c.k().iterator();
        while (it.hasNext()) {
            i1(it.next());
        }
    }

    private void O1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
        androidx.fragment.app.s<?> sVar = this.f25780x;
        if (sVar != null) {
            try {
                sVar.m("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            b0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void Q(Fragment fragment) {
        if (fragment == null || !fragment.equals(k0(fragment.f25458G))) {
            return;
        }
        fragment.T1();
    }

    public static boolean Q0(int i10) {
        return f25735U || Log.isLoggable("FragmentManager", i10);
    }

    private void Q1() {
        synchronized (this.f25757a) {
            try {
                if (!this.f25757a.isEmpty()) {
                    this.f25766j.j(true);
                    if (Q0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = v0() > 0 && V0(this.f25782z);
                if (Q0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f25766j.j(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean R0(Fragment fragment) {
        return (fragment.f25485h0 && fragment.f25486i0) || fragment.f25476Y.t();
    }

    private boolean S0() {
        Fragment fragment = this.f25782z;
        if (fragment == null) {
            return true;
        }
        return fragment.K0() && this.f25782z.o0().S0();
    }

    private void X(int i10) {
        try {
            this.f25758b = true;
            this.f25759c.d(i10);
            f1(i10, false);
            Iterator<K> it = y().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.f25758b = false;
            f0(true);
        } catch (Throwable th) {
            this.f25758b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0() {
        Iterator<o> it = this.f25771o.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void a0() {
        if (this.f25750N) {
            this.f25750N = false;
            N1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(Configuration configuration) {
        if (S0()) {
            E(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(Integer num) {
        if (S0() && num.intValue() == 80) {
            K(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        Iterator<K> it = y().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(f1.j jVar) {
        if (S0()) {
            L(jVar.getIsInMultiWindowMode(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(f1.v vVar) {
        if (S0()) {
            S(vVar.getIsInPictureInPictureMode(), false);
        }
    }

    private void e0(boolean z10) {
        if (this.f25758b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f25780x == null) {
            if (!this.f25749M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f25780x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            u();
        }
        if (this.f25751O == null) {
            this.f25751O = new ArrayList<>();
            this.f25752P = new ArrayList<>();
        }
    }

    private static void h0(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C2080a c2080a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c2080a.D(-1);
                c2080a.J();
            } else {
                c2080a.D(1);
                c2080a.I();
            }
            i10++;
        }
    }

    private void i0(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f25411r;
        ArrayList<Fragment> arrayList3 = this.f25753Q;
        if (arrayList3 == null) {
            this.f25753Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f25753Q.addAll(this.f25759c.o());
        Fragment fragmentH0 = H0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C2080a c2080a = arrayList.get(i12);
            fragmentH0 = !arrayList2.get(i12).booleanValue() ? c2080a.K(this.f25753Q, fragmentH0) : c2080a.N(this.f25753Q, fragmentH0);
            z11 = z11 || c2080a.f25402i;
        }
        this.f25753Q.clear();
        if (!z10 && this.f25779w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<C.a> it = arrayList.get(i13).f25396c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f25414b;
                    if (fragment != null && fragment.f25474W != null) {
                        this.f25759c.r(A(fragment));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f25771o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C2080a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(s0(it2.next()));
            }
            if (this.f25764h == null) {
                Iterator<o> it3 = this.f25771o.iterator();
                while (it3.hasNext()) {
                    o next = it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        next.b((Fragment) it4.next(), zBooleanValue);
                    }
                }
                Iterator<o> it5 = this.f25771o.iterator();
                while (it5.hasNext()) {
                    o next2 = it5.next();
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        next2.a((Fragment) it6.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C2080a c2080a2 = arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c2080a2.f25396c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c2080a2.f25396c.get(size).f25414b;
                    if (fragment2 != null) {
                        A(fragment2).m();
                    }
                }
            } else {
                Iterator<C.a> it7 = c2080a2.f25396c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = it7.next().f25414b;
                    if (fragment3 != null) {
                        A(fragment3).m();
                    }
                }
            }
        }
        f1(this.f25779w, true);
        for (K k10 : z(arrayList, i10, i11)) {
            k10.D(zBooleanValue);
            k10.z();
            k10.n();
        }
        while (i10 < i11) {
            C2080a c2080a3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c2080a3.f25597v >= 0) {
                c2080a3.f25597v = -1;
            }
            c2080a3.M();
            i10++;
        }
        if (z11) {
            w1();
        }
    }

    private int l0(String str, int i10, boolean z10) {
        if (this.f25760d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f25760d.size() - 1;
        }
        int size = this.f25760d.size() - 1;
        while (size >= 0) {
            C2080a c2080a = this.f25760d.get(size);
            if ((str != null && str.equals(c2080a.L())) || (i10 >= 0 && i10 == c2080a.f25597v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f25760d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2080a c2080a2 = this.f25760d.get(size - 1);
            if ((str == null || !str.equals(c2080a2.L())) && (i10 < 0 || i10 != c2080a2.f25597v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private boolean o1(String str, int i10, int i11) {
        f0(false);
        e0(true);
        Fragment fragment = this.f25737A;
        if (fragment != null && i10 < 0 && str == null && fragment.Y().m1()) {
            return true;
        }
        boolean zP1 = p1(this.f25751O, this.f25752P, str, i10, i11);
        if (zP1) {
            this.f25758b = true;
            try {
                v1(this.f25751O, this.f25752P);
            } finally {
                v();
            }
        }
        Q1();
        a0();
        this.f25759c.b();
        return zP1;
    }

    public static v p0(View view) {
        androidx.fragment.app.o oVar;
        Fragment fragmentQ0 = q0(view);
        if (fragmentQ0 != null) {
            if (fragmentQ0.K0()) {
                return fragmentQ0.Y();
            }
            throw new IllegalStateException("The Fragment " + fragmentQ0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                oVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.o) {
                oVar = (androidx.fragment.app.o) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (oVar != null) {
            return oVar.w0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment q0(View view) {
        while (view != null) {
            Fragment fragmentK0 = K0(view);
            if (fragmentK0 != null) {
                return fragmentK0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void r0() {
        Iterator<K> it = y().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private boolean t0(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f25757a) {
            if (this.f25757a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f25757a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f25757a.get(i10).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f25757a.clear();
                this.f25780x.getHandler().removeCallbacks(this.f25756T);
            }
        }
    }

    private void u() {
        if (X0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void v() {
        this.f25758b = false;
        this.f25752P.clear();
        this.f25751O.clear();
    }

    private void v1(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f25411r) {
                if (i11 != i10) {
                    i0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f25411r) {
                        i11++;
                    }
                }
                i0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            i0(arrayList, arrayList2, i11, size);
        }
    }

    private void w() {
        androidx.fragment.app.s<?> sVar = this.f25780x;
        if (sVar instanceof c0 ? this.f25759c.p().q() : sVar.getContext() instanceof Activity ? !((Activity) this.f25780x.getContext()).isChangingConfigurations() : true) {
            Iterator<C2082c> it = this.f25768l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f25613B.iterator();
                while (it2.hasNext()) {
                    this.f25759c.p().j(it2.next(), false);
                }
            }
        }
    }

    private y w0(Fragment fragment) {
        return this.f25754R.m(fragment);
    }

    private void w1() {
        for (int i10 = 0; i10 < this.f25771o.size(); i10++) {
            this.f25771o.get(i10).d();
        }
    }

    private Set<K> y() {
        HashSet hashSet = new HashSet();
        Iterator<A> it = this.f25759c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().f25488k0;
            if (viewGroup != null) {
                hashSet.add(K.v(viewGroup, I0()));
            }
        }
        return hashSet;
    }

    private ViewGroup z0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f25488k0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f25479b0 > 0 && this.f25781y.f()) {
            View viewE = this.f25781y.e(fragment.f25479b0);
            if (viewE instanceof ViewGroup) {
                return (ViewGroup) viewE;
            }
        }
        return null;
    }

    A A(Fragment fragment) {
        A aN = this.f25759c.n(fragment.f25458G);
        if (aN != null) {
            return aN;
        }
        A a10 = new A(this.f25772p, this.f25759c, fragment);
        a10.o(this.f25780x.getContext().getClassLoader());
        a10.t(this.f25779w);
        return a10;
    }

    public androidx.fragment.app.r A0() {
        androidx.fragment.app.r rVar = this.f25738B;
        if (rVar != null) {
            return rVar;
        }
        Fragment fragment = this.f25782z;
        return fragment != null ? fragment.f25474W.A0() : this.f25739C;
    }

    void B(Fragment fragment) {
        if (Q0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f25482e0) {
            return;
        }
        fragment.f25482e0 = true;
        if (fragment.f25464M) {
            if (Q0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f25759c.u(fragment);
            if (R0(fragment)) {
                this.f25746J = true;
            }
            L1(fragment);
        }
    }

    B B0() {
        return this.f25759c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public Bundle Y0() {
        C2081b[] c2081bArr;
        Bundle bundle = new Bundle();
        r0();
        c0();
        f0(true);
        this.f25747K = true;
        this.f25754R.s(true);
        ArrayList<String> arrayListY = this.f25759c.y();
        HashMap<String, Bundle> mapM = this.f25759c.m();
        if (!mapM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f25759c.z();
            int size = this.f25760d.size();
            if (size > 0) {
                c2081bArr = new C2081b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c2081bArr[i10] = new C2081b(this.f25760d.get(i10));
                    if (Q0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f25760d.get(i10));
                    }
                }
            } else {
                c2081bArr = null;
            }
            x xVar = new x();
            xVar.f25811B = arrayListY;
            xVar.f25812C = arrayListZ;
            xVar.f25813D = c2081bArr;
            xVar.f25814E = this.f25767k.get();
            Fragment fragment = this.f25737A;
            if (fragment != null) {
                xVar.f25815F = fragment.f25458G;
            }
            xVar.f25816G.addAll(this.f25768l.keySet());
            xVar.f25817H.addAll(this.f25768l.values());
            xVar.f25818I = new ArrayList<>(this.f25745I);
            bundle.putParcelable("state", xVar);
            for (String str : this.f25769m.keySet()) {
                bundle.putBundle("result_" + str, this.f25769m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, mapM.get(str2));
            }
        } else if (Q0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    void C() {
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        X(4);
    }

    public List<Fragment> C0() {
        return this.f25759c.o();
    }

    public void C1(String str) {
        d0(new t(str), false);
    }

    void D() {
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        X(0);
    }

    public androidx.fragment.app.s<?> D0() {
        return this.f25780x;
    }

    boolean D1(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        int i10;
        int iL0 = l0(str, -1, true);
        if (iL0 < 0) {
            return false;
        }
        for (int i11 = iL0; i11 < this.f25760d.size(); i11++) {
            C2080a c2080a = this.f25760d.get(i11);
            if (!c2080a.f25411r) {
                O1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c2080a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = iL0; i12 < this.f25760d.size(); i12++) {
            C2080a c2080a2 = this.f25760d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<C.a> it = c2080a2.f25396c.iterator();
            while (it.hasNext()) {
                C.a next = it.next();
                Fragment fragment = next.f25414b;
                if (fragment != null) {
                    if (!next.f25415c || (i10 = next.f25413a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i13 = next.f25413a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb2.append(" in ");
                sb2.append(c2080a2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                O1(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.f25483f0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                O1(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.f25476Y.u0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).f25458G);
        }
        ArrayList arrayList4 = new ArrayList(this.f25760d.size() - iL0);
        for (int i14 = iL0; i14 < this.f25760d.size(); i14++) {
            arrayList4.add(null);
        }
        C2082c c2082c = new C2082c(arrayList3, arrayList4);
        for (int size = this.f25760d.size() - 1; size >= iL0; size--) {
            C2080a c2080aRemove = this.f25760d.remove(size);
            C2080a c2080a3 = new C2080a(c2080aRemove);
            c2080a3.E();
            arrayList4.set(size - iL0, new C2081b(c2080a3));
            c2080aRemove.f25598w = true;
            arrayList.add(c2080aRemove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f25768l.put(str, c2082c);
        return true;
    }

    void E(Configuration configuration, boolean z10) {
        if (z10 && (this.f25780x instanceof InterfaceC3378b)) {
            O1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.D1(configuration);
                if (z10) {
                    fragment.f25476Y.E(configuration, true);
                }
            }
        }
    }

    LayoutInflater.Factory2 E0() {
        return this.f25762f;
    }

    public Fragment.l E1(Fragment fragment) {
        A aN = this.f25759c.n(fragment.f25458G);
        if (aN == null || !aN.k().equals(fragment)) {
            O1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return aN.q();
    }

    boolean F(MenuItem menuItem) {
        if (this.f25779w < 1) {
            return false;
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null && fragment.E1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    u F0() {
        return this.f25772p;
    }

    void F1() {
        synchronized (this.f25757a) {
            try {
                if (this.f25757a.size() == 1) {
                    this.f25780x.getHandler().removeCallbacks(this.f25756T);
                    this.f25780x.getHandler().post(this.f25756T);
                    Q1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void G() {
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        X(1);
    }

    Fragment G0() {
        return this.f25782z;
    }

    void G1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupZ0 = z0(fragment);
        if (viewGroupZ0 == null || !(viewGroupZ0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupZ0).setDrawDisappearingViewsLast(!z10);
    }

    boolean H(Menu menu, MenuInflater menuInflater) {
        if (this.f25779w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null && U0(fragment) && fragment.G1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f25761e != null) {
            for (int i10 = 0; i10 < this.f25761e.size(); i10++) {
                Fragment fragment2 = this.f25761e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.g1();
                }
            }
        }
        this.f25761e = arrayList;
        return z10;
    }

    public Fragment H0() {
        return this.f25737A;
    }

    public final void H1(String str, Bundle bundle) {
        n nVar = this.f25770n.get(str);
        if (nVar == null || !nVar.b(AbstractC2106m.b.STARTED)) {
            this.f25769m.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    void I() {
        this.f25749M = true;
        f0(true);
        c0();
        w();
        X(-1);
        Object obj = this.f25780x;
        if (obj instanceof InterfaceC3379c) {
            ((InterfaceC3379c) obj).D(this.f25775s);
        }
        Object obj2 = this.f25780x;
        if (obj2 instanceof InterfaceC3378b) {
            ((InterfaceC3378b) obj2).u(this.f25774r);
        }
        Object obj3 = this.f25780x;
        if (obj3 instanceof f1.r) {
            ((f1.r) obj3).d(this.f25776t);
        }
        Object obj4 = this.f25780x;
        if (obj4 instanceof f1.s) {
            ((f1.s) obj4).M(this.f25777u);
        }
        Object obj5 = this.f25780x;
        if ((obj5 instanceof InterfaceC4464w) && this.f25782z == null) {
            ((InterfaceC4464w) obj5).o(this.f25778v);
        }
        this.f25780x = null;
        this.f25781y = null;
        this.f25782z = null;
        if (this.f25763g != null) {
            this.f25766j.h();
            this.f25763g = null;
        }
        AbstractC3371c<Intent> abstractC3371c = this.f25742F;
        if (abstractC3371c != null) {
            abstractC3371c.c();
            this.f25743G.c();
            this.f25744H.c();
        }
    }

    L I0() {
        L l10 = this.f25740D;
        if (l10 != null) {
            return l10;
        }
        Fragment fragment = this.f25782z;
        return fragment != null ? fragment.f25474W.I0() : this.f25741E;
    }

    public final void I1(String str, InterfaceC2114v interfaceC2114v, J1.o oVar) {
        AbstractC2106m lifecycle = interfaceC2114v.getLifecycle();
        if (lifecycle.getState() == AbstractC2106m.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, oVar, lifecycle);
        n nVarPut = this.f25770n.put(str, new n(lifecycle, oVar, gVar));
        if (nVarPut != null) {
            nVarPut.c();
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + oVar);
        }
        lifecycle.a(gVar);
    }

    void J() {
        X(1);
    }

    public b.c J0() {
        return this.f25755S;
    }

    void J1(Fragment fragment, AbstractC2106m.b bVar) {
        if (fragment.equals(k0(fragment.f25458G)) && (fragment.f25475X == null || fragment.f25474W == this)) {
            fragment.f25499v0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void K(boolean z10) {
        if (z10 && (this.f25780x instanceof InterfaceC3379c)) {
            O1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.M1();
                if (z10) {
                    fragment.f25476Y.K(true);
                }
            }
        }
    }

    void K1(Fragment fragment) {
        if (fragment == null || (fragment.equals(k0(fragment.f25458G)) && (fragment.f25475X == null || fragment.f25474W == this))) {
            Fragment fragment2 = this.f25737A;
            this.f25737A = fragment;
            Q(fragment2);
            Q(this.f25737A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void L(boolean z10, boolean z11) {
        if (z11 && (this.f25780x instanceof f1.r)) {
            O1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.N1(z10);
                if (z11) {
                    fragment.f25476Y.L(z10, true);
                }
            }
        }
    }

    b0 L0(Fragment fragment) {
        return this.f25754R.p(fragment);
    }

    void M(Fragment fragment) {
        Iterator<J1.n> it = this.f25773q.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void M0() {
        this.f25765i = true;
        f0(true);
        this.f25765i = false;
        if (!f25736V || this.f25764h == null) {
            if (this.f25766j.getIsEnabled()) {
                if (Q0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                m1();
                return;
            } else {
                if (Q0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f25763g.l();
                return;
            }
        }
        if (!this.f25771o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s0(this.f25764h));
            Iterator<o> it = this.f25771o.iterator();
            while (it.hasNext()) {
                o next = it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    next.a((Fragment) it2.next(), true);
                }
            }
        }
        Iterator<C.a> it3 = this.f25764h.f25396c.iterator();
        while (it3.hasNext()) {
            Fragment fragment = it3.next().f25414b;
            if (fragment != null) {
                fragment.f25466O = false;
            }
        }
        Iterator<K> it4 = z(new ArrayList<>(Collections.singletonList(this.f25764h)), 0, 1).iterator();
        while (it4.hasNext()) {
            it4.next().f();
        }
        Iterator<C.a> it5 = this.f25764h.f25396c.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = it5.next().f25414b;
            if (fragment2 != null && fragment2.f25488k0 == null) {
                A(fragment2).m();
            }
        }
        this.f25764h = null;
        Q1();
        if (Q0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f25766j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    void M1(Fragment fragment) {
        if (Q0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f25481d0) {
            fragment.f25481d0 = false;
            fragment.f25495r0 = !fragment.f25495r0;
        }
    }

    void N() {
        for (Fragment fragment : this.f25759c.l()) {
            if (fragment != null) {
                fragment.k1(fragment.L0());
                fragment.f25476Y.N();
            }
        }
    }

    void N0(Fragment fragment) {
        if (Q0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f25481d0) {
            return;
        }
        fragment.f25481d0 = true;
        fragment.f25495r0 = true ^ fragment.f25495r0;
        L1(fragment);
    }

    boolean O(MenuItem menuItem) {
        if (this.f25779w < 1) {
            return false;
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null && fragment.O1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void O0(Fragment fragment) {
        if (fragment.f25464M && R0(fragment)) {
            this.f25746J = true;
        }
    }

    void P(Menu menu) {
        if (this.f25779w < 1) {
            return;
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.P1(menu);
            }
        }
    }

    public boolean P0() {
        return this.f25749M;
    }

    public void P1(l lVar) {
        this.f25772p.p(lVar);
    }

    void R() {
        X(5);
    }

    void S(boolean z10, boolean z11) {
        if (z11 && (this.f25780x instanceof f1.s)) {
            O1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.R1(z10);
                if (z11) {
                    fragment.f25476Y.S(z10, true);
                }
            }
        }
    }

    boolean T(Menu menu) {
        boolean z10 = false;
        if (this.f25779w < 1) {
            return false;
        }
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null && U0(fragment) && fragment.S1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean T0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.L0();
    }

    void U() {
        Q1();
        Q(this.f25737A);
    }

    boolean U0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.N0();
    }

    void V() {
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        X(7);
    }

    boolean V0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        v vVar = fragment.f25474W;
        return fragment.equals(vVar.H0()) && V0(vVar.f25782z);
    }

    void W() {
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        X(5);
    }

    boolean W0(int i10) {
        return this.f25779w >= i10;
    }

    public boolean X0() {
        return this.f25747K || this.f25748L;
    }

    void Y() {
        this.f25748L = true;
        this.f25754R.s(true);
        X(4);
    }

    void Z() {
        X(2);
    }

    public void b0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f25759c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f25761e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f25761e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f25760d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C2080a c2080a = this.f25760d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c2080a.toString());
                c2080a.G(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f25767k.get());
        synchronized (this.f25757a) {
            try {
                int size3 = this.f25757a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        p pVar = this.f25757a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f25780x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f25781y);
        if (this.f25782z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f25782z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f25779w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f25747K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f25748L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f25749M);
        if (this.f25746J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f25746J);
        }
    }

    void d0(p pVar, boolean z10) {
        if (!z10) {
            if (this.f25780x == null) {
                if (!this.f25749M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f25757a) {
            try {
                if (this.f25780x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f25757a.add(pVar);
                    F1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void e1(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f25742F == null) {
            this.f25780x.q(fragment, intent, i10, bundle);
            return;
        }
        this.f25745I.addLast(new m(fragment.f25458G, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f25742F.a(intent);
    }

    boolean f0(boolean z10) {
        C2080a c2080a;
        e0(z10);
        boolean z11 = false;
        if (!this.f25765i && (c2080a = this.f25764h) != null) {
            c2080a.f25596u = false;
            c2080a.E();
            if (Q0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f25764h + " as part of execPendingActions for actions " + this.f25757a);
            }
            this.f25764h.F(false, false);
            this.f25757a.add(0, this.f25764h);
            Iterator<C.a> it = this.f25764h.f25396c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f25414b;
                if (fragment != null) {
                    fragment.f25466O = false;
                }
            }
            this.f25764h = null;
        }
        while (t0(this.f25751O, this.f25752P)) {
            z11 = true;
            this.f25758b = true;
            try {
                v1(this.f25751O, this.f25752P);
            } finally {
                v();
            }
        }
        Q1();
        a0();
        this.f25759c.b();
        return z11;
    }

    void f1(int i10, boolean z10) {
        androidx.fragment.app.s<?> sVar;
        if (this.f25780x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f25779w) {
            this.f25779w = i10;
            this.f25759c.t();
            N1();
            if (this.f25746J && (sVar = this.f25780x) != null && this.f25779w == 7) {
                sVar.s();
                this.f25746J = false;
            }
        }
    }

    void g0(p pVar, boolean z10) {
        if (z10 && (this.f25780x == null || this.f25749M)) {
            return;
        }
        e0(z10);
        C2080a c2080a = this.f25764h;
        boolean z11 = false;
        if (c2080a != null) {
            c2080a.f25596u = false;
            c2080a.E();
            if (Q0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f25764h + " as part of execSingleAction for action " + pVar);
            }
            this.f25764h.F(false, false);
            boolean zA = this.f25764h.a(this.f25751O, this.f25752P);
            Iterator<C.a> it = this.f25764h.f25396c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f25414b;
                if (fragment != null) {
                    fragment.f25466O = false;
                }
            }
            this.f25764h = null;
            z11 = zA;
        }
        boolean zA2 = pVar.a(this.f25751O, this.f25752P);
        if (z11 || zA2) {
            this.f25758b = true;
            try {
                v1(this.f25751O, this.f25752P);
            } finally {
                v();
            }
        }
        Q1();
        a0();
        this.f25759c.b();
    }

    void g1() {
        if (this.f25780x == null) {
            return;
        }
        this.f25747K = false;
        this.f25748L = false;
        this.f25754R.s(false);
        for (Fragment fragment : this.f25759c.o()) {
            if (fragment != null) {
                fragment.T0();
            }
        }
    }

    public final void h1(FragmentContainerView fragmentContainerView) {
        View view;
        for (A a10 : this.f25759c.k()) {
            Fragment fragmentK = a10.k();
            if (fragmentK.f25479b0 == fragmentContainerView.getId() && (view = fragmentK.f25489l0) != null && view.getParent() == null) {
                fragmentK.f25488k0 = fragmentContainerView;
                a10.b();
                a10.m();
            }
        }
    }

    void i1(A a10) {
        Fragment fragmentK = a10.k();
        if (fragmentK.f25490m0) {
            if (this.f25758b) {
                this.f25750N = true;
            } else {
                fragmentK.f25490m0 = false;
                a10.m();
            }
        }
    }

    public boolean j0() {
        boolean zF0 = f0(true);
        r0();
        return zF0;
    }

    public void j1() {
        d0(new q(null, -1, 0), false);
    }

    void k(C2080a c2080a) {
        this.f25760d.add(c2080a);
    }

    Fragment k0(String str) {
        return this.f25759c.f(str);
    }

    void k1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            d0(new q(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    A l(Fragment fragment) {
        String str = fragment.f25498u0;
        if (str != null) {
            K1.b.f(fragment, str);
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        A A10 = A(fragment);
        fragment.f25474W = this;
        this.f25759c.r(A10);
        if (!fragment.f25482e0) {
            this.f25759c.a(fragment);
            fragment.f25465N = false;
            if (fragment.f25489l0 == null) {
                fragment.f25495r0 = false;
            }
            if (R0(fragment)) {
                this.f25746J = true;
            }
        }
        return A10;
    }

    public void l1(String str, int i10) {
        d0(new q(str, -1, i10), false);
    }

    public void m(J1.n nVar) {
        this.f25773q.add(nVar);
    }

    public Fragment m0(int i10) {
        return this.f25759c.g(i10);
    }

    public boolean m1() {
        return o1(null, -1, 0);
    }

    public void n(o oVar) {
        this.f25771o.add(oVar);
    }

    public Fragment n0(String str) {
        return this.f25759c.h(str);
    }

    public boolean n1(int i10, int i11) {
        if (i10 >= 0) {
            return o1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    int o() {
        return this.f25767k.getAndIncrement();
    }

    Fragment o0(String str) {
        return this.f25759c.i(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void p(androidx.fragment.app.s<?> sVar, J1.g gVar, Fragment fragment) {
        String str;
        if (this.f25780x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f25780x = sVar;
        this.f25781y = gVar;
        this.f25782z = fragment;
        if (fragment != null) {
            m(new h(fragment));
        } else if (sVar instanceof J1.n) {
            m((J1.n) sVar);
        }
        if (this.f25782z != null) {
            Q1();
        }
        if (sVar instanceof d.J) {
            d.J j10 = (d.J) sVar;
            C2995G c2995gC = j10.getOnBackPressedDispatcher();
            this.f25763g = c2995gC;
            InterfaceC2114v interfaceC2114v = j10;
            if (fragment != null) {
                interfaceC2114v = fragment;
            }
            c2995gC.h(interfaceC2114v, this.f25766j);
        }
        if (fragment != null) {
            this.f25754R = fragment.f25474W.w0(fragment);
        } else if (sVar instanceof c0) {
            this.f25754R = y.n(((c0) sVar).v());
        } else {
            this.f25754R = new y(false);
        }
        this.f25754R.s(X0());
        this.f25759c.A(this.f25754R);
        Object obj = this.f25780x;
        if ((obj instanceof InterfaceC4549f) && fragment == null) {
            C4547d c4547dB = ((InterfaceC4549f) obj).B();
            c4547dB.h("android:support:fragments", new C4547d.c() { // from class: J1.l
                @Override // t3.C4547d.c
                public final Bundle a() {
                    return this.f7225a.Y0();
                }
            });
            Bundle bundleB = c4547dB.b("android:support:fragments");
            if (bundleB != null) {
                z1(bundleB);
            }
        }
        Object obj2 = this.f25780x;
        if (obj2 instanceof InterfaceC3374f) {
            AbstractC3373e abstractC3373eR = ((InterfaceC3374f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.f25458G + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f25742F = abstractC3373eR.m(str2 + "StartActivityForResult", new C3469d(), new i());
            this.f25743G = abstractC3373eR.m(str2 + "StartIntentSenderForResult", new k(), new j());
            this.f25744H = abstractC3373eR.m(str2 + "RequestPermissions", new C3467b(), new a());
        }
        Object obj3 = this.f25780x;
        if (obj3 instanceof InterfaceC3378b) {
            ((InterfaceC3378b) obj3).j(this.f25774r);
        }
        Object obj4 = this.f25780x;
        if (obj4 instanceof InterfaceC3379c) {
            ((InterfaceC3379c) obj4).g(this.f25775s);
        }
        Object obj5 = this.f25780x;
        if (obj5 instanceof f1.r) {
            ((f1.r) obj5).z(this.f25776t);
        }
        Object obj6 = this.f25780x;
        if (obj6 instanceof f1.s) {
            ((f1.s) obj6).x(this.f25777u);
        }
        Object obj7 = this.f25780x;
        if ((obj7 instanceof InterfaceC4464w) && fragment == null) {
            ((InterfaceC4464w) obj7).C(this.f25778v);
        }
    }

    boolean p1(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iL0 = l0(str, i10, (i11 & 1) != 0);
        if (iL0 < 0) {
            return false;
        }
        for (int size = this.f25760d.size() - 1; size >= iL0; size--) {
            arrayList.add(this.f25760d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void q(Fragment fragment) {
        if (Q0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f25482e0) {
            fragment.f25482e0 = false;
            if (fragment.f25464M) {
                return;
            }
            this.f25759c.a(fragment);
            if (Q0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (R0(fragment)) {
                this.f25746J = true;
            }
        }
    }

    boolean q1(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
        if (Q0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f25757a);
        }
        if (this.f25760d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<C2080a> arrayList3 = this.f25760d;
        C2080a c2080a = arrayList3.get(arrayList3.size() - 1);
        this.f25764h = c2080a;
        Iterator<C.a> it = c2080a.f25396c.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().f25414b;
            if (fragment != null) {
                fragment.f25466O = true;
            }
        }
        return p1(arrayList, arrayList2, null, -1, 0);
    }

    public C r() {
        return new C2080a(this);
    }

    void r1() {
        d0(new r(), false);
    }

    void s() {
        if (Q0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f25764h);
        }
        C2080a c2080a = this.f25764h;
        if (c2080a != null) {
            c2080a.f25596u = false;
            c2080a.E();
            this.f25764h.v(true, new Runnable() { // from class: J1.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7226B.Z0();
                }
            });
            this.f25764h.j();
            this.f25765i = true;
            j0();
            this.f25765i = false;
            this.f25764h = null;
        }
    }

    Set<Fragment> s0(C2080a c2080a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c2080a.f25396c.size(); i10++) {
            Fragment fragment = c2080a.f25396c.get(i10).f25414b;
            if (fragment != null && c2080a.f25402i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public void s1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f25474W != this) {
            O1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f25458G);
    }

    boolean t() {
        boolean zR0 = false;
        for (Fragment fragment : this.f25759c.l()) {
            if (fragment != null) {
                zR0 = R0(fragment);
            }
            if (zR0) {
                return true;
            }
        }
        return false;
    }

    public void t1(l lVar, boolean z10) {
        this.f25772p.o(lVar, z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f25782z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f25782z)));
            sb2.append("}");
        } else {
            androidx.fragment.app.s<?> sVar = this.f25780x;
            if (sVar != null) {
                sb2.append(sVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f25780x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    List<Fragment> u0() {
        return this.f25759c.l();
    }

    void u1(Fragment fragment) {
        if (Q0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f25473V);
        }
        boolean zM0 = fragment.M0();
        if (fragment.f25482e0 && zM0) {
            return;
        }
        this.f25759c.u(fragment);
        if (R0(fragment)) {
            this.f25746J = true;
        }
        fragment.f25465N = true;
        L1(fragment);
    }

    public int v0() {
        return this.f25760d.size() + (this.f25764h != null ? 1 : 0);
    }

    public final void x(String str) {
        this.f25769m.remove(str);
        if (Q0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    J1.g x0() {
        return this.f25781y;
    }

    public void x1(String str) {
        d0(new s(str), false);
    }

    public Fragment y0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentK0 = k0(string);
        if (fragmentK0 == null) {
            O1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentK0;
    }

    boolean y1(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        C2082c c2082cRemove = this.f25768l.remove(str);
        if (c2082cRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator<C2080a> it = arrayList.iterator();
        while (it.hasNext()) {
            C2080a next = it.next();
            if (next.f25598w) {
                Iterator<C.a> it2 = next.f25396c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f25414b;
                    if (fragment != null) {
                        map.put(fragment.f25458G, fragment);
                    }
                }
            }
        }
        Iterator<C2080a> it3 = c2082cRemove.a(this, map).iterator();
        while (true) {
            boolean z10 = false;
            while (it3.hasNext()) {
                if (it3.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    Set<K> z(ArrayList<C2080a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<C.a> it = arrayList.get(i10).f25396c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f25414b;
                if (fragment != null && (viewGroup = fragment.f25488k0) != null) {
                    hashSet.add(K.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    void z1(Parcelable parcelable) {
        A a10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f25780x.getContext().getClassLoader());
                this.f25769m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f25780x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f25759c.x(map);
        x xVar = (x) bundle3.getParcelable("state");
        if (xVar == null) {
            return;
        }
        this.f25759c.v();
        Iterator<String> it = xVar.f25811B.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f25759c.B(it.next(), null);
            if (bundleB != null) {
                Fragment fragmentL = this.f25754R.l(((z) bundleB.getParcelable("state")).f25828C);
                if (fragmentL != null) {
                    if (Q0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentL);
                    }
                    a10 = new A(this.f25772p, this.f25759c, fragmentL, bundleB);
                } else {
                    a10 = new A(this.f25772p, this.f25759c, this.f25780x.getContext().getClassLoader(), A0(), bundleB);
                }
                Fragment fragmentK = a10.k();
                fragmentK.f25451C = bundleB;
                fragmentK.f25474W = this;
                if (Q0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.f25458G + "): " + fragmentK);
                }
                a10.o(this.f25780x.getContext().getClassLoader());
                this.f25759c.r(a10);
                a10.t(this.f25779w);
            }
        }
        for (Fragment fragment : this.f25754R.o()) {
            if (!this.f25759c.c(fragment.f25458G)) {
                if (Q0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + xVar.f25811B);
                }
                this.f25754R.r(fragment);
                fragment.f25474W = this;
                A a11 = new A(this.f25772p, this.f25759c, fragment);
                a11.t(1);
                a11.m();
                fragment.f25465N = true;
                a11.m();
            }
        }
        this.f25759c.w(xVar.f25812C);
        if (xVar.f25813D != null) {
            this.f25760d = new ArrayList<>(xVar.f25813D.length);
            int i10 = 0;
            while (true) {
                C2081b[] c2081bArr = xVar.f25813D;
                if (i10 >= c2081bArr.length) {
                    break;
                }
                C2080a c2080aB = c2081bArr[i10].b(this);
                if (Q0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c2080aB.f25597v + "): " + c2080aB);
                    PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
                    c2080aB.H("  ", printWriter, false);
                    printWriter.close();
                }
                this.f25760d.add(c2080aB);
                i10++;
            }
        } else {
            this.f25760d = new ArrayList<>();
        }
        this.f25767k.set(xVar.f25814E);
        String str3 = xVar.f25815F;
        if (str3 != null) {
            Fragment fragmentK0 = k0(str3);
            this.f25737A = fragmentK0;
            Q(fragmentK0);
        }
        ArrayList<String> arrayList = xVar.f25816G;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f25768l.put(arrayList.get(i11), xVar.f25817H.get(i11));
            }
        }
        this.f25745I = new ArrayDeque<>(xVar.f25818I);
    }

    /* compiled from: FragmentManager.java */
    @SuppressLint({"BanParcelableUsage"})
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        String f25797B;

        /* renamed from: C, reason: collision with root package name */
        int f25798C;

        /* compiled from: FragmentManager.java */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f25797B = str;
            this.f25798C = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f25797B);
            parcel.writeInt(this.f25798C);
        }

        m(Parcel parcel) {
            this.f25797B = parcel.readString();
            this.f25798C = parcel.readInt();
        }
    }

    /* compiled from: FragmentManager.java */
    public interface o {
        void d();

        default void c() {
        }

        default void e(C2998b c2998b) {
        }

        default void a(Fragment fragment, boolean z10) {
        }

        default void b(Fragment fragment, boolean z10) {
        }
    }

    /* compiled from: FragmentManager.java */
    public static abstract class l {
        public void d(v vVar, Fragment fragment) {
        }

        public void e(v vVar, Fragment fragment) {
        }

        public void f(v vVar, Fragment fragment) {
        }

        public void i(v vVar, Fragment fragment) {
        }

        public void k(v vVar, Fragment fragment) {
        }

        public void l(v vVar, Fragment fragment) {
        }

        public void n(v vVar, Fragment fragment) {
        }

        @Deprecated
        public void a(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void b(v vVar, Fragment fragment, Context context) {
        }

        public void c(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void g(v vVar, Fragment fragment, Context context) {
        }

        public void h(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void j(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void m(v vVar, Fragment fragment, View view, Bundle bundle) {
        }
    }
}
