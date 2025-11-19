package C3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r1.i;
import s.C4392b;
import s.C4411v;
import s1.X;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends RecyclerView.h<C3.b> implements C3.c {

    /* renamed from: E, reason: collision with root package name */
    final AbstractC2106m f2120E;

    /* renamed from: F, reason: collision with root package name */
    final v f2121F;

    /* renamed from: J, reason: collision with root package name */
    private g f2125J;

    /* renamed from: G, reason: collision with root package name */
    final C4411v<Fragment> f2122G = new C4411v<>();

    /* renamed from: H, reason: collision with root package name */
    private final C4411v<Fragment.l> f2123H = new C4411v<>();

    /* renamed from: I, reason: collision with root package name */
    private final C4411v<Integer> f2124I = new C4411v<>();

    /* renamed from: K, reason: collision with root package name */
    f f2126K = new f();

    /* renamed from: L, reason: collision with root package name */
    boolean f2127L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f2128M = false;

    /* compiled from: FragmentStateAdapter.java */
    /* renamed from: C3.a$a, reason: collision with other inner class name */
    class C0041a implements InterfaceC2111s {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3.b f2129B;

        C0041a(C3.b bVar) {
            this.f2129B = bVar;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
            if (a.this.b0()) {
                return;
            }
            interfaceC2114v.getLifecycle().d(this);
            if (X.Q(this.f2129B.b())) {
                a.this.X(this.f2129B);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    class b extends v.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f2132b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f2131a = fragment;
            this.f2132b = frameLayout;
        }

        @Override // androidx.fragment.app.v.l
        public void m(v vVar, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f2131a) {
                vVar.P1(this);
                a.this.I(view, this.f2132b);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f2127L = false;
            aVar.N();
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    class d implements InterfaceC2111s {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Handler f2135B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Runnable f2136C;

        d(Handler handler, Runnable runnable) {
            this.f2135B = handler;
            this.f2136C = runnable;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
            if (aVar == AbstractC2106m.a.ON_DESTROY) {
                this.f2135B.removeCallbacks(this.f2136C);
                interfaceC2114v.getLifecycle().d(this);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    private static abstract class e extends RecyclerView.j {
        private e() {
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

        /* synthetic */ e(C0041a c0041a) {
            this();
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    static class f {

        /* renamed from: a, reason: collision with root package name */
        private List<h> f2138a = new CopyOnWriteArrayList();

        f() {
        }

        public List<h.b> a(Fragment fragment, AbstractC2106m.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f2138a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, bVar));
            }
            return arrayList;
        }

        public void b(List<h.b> list) {
            Iterator<h.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<h.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f2138a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<h.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f2138a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        public List<h.b> e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f2138a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(fragment));
            }
            return arrayList;
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    class g {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.i f2139a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.j f2140b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC2111s f2141c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f2142d;

        /* renamed from: e, reason: collision with root package name */
        private long f2143e = -1;

        /* compiled from: FragmentStateAdapter.java */
        /* renamed from: C3.a$g$a, reason: collision with other inner class name */
        class C0042a extends ViewPager2.i {
            C0042a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void a(int i10) {
                g.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void c(int i10) {
                g.this.d(false);
            }
        }

        /* compiled from: FragmentStateAdapter.java */
        class b extends e {
            b() {
                super(null);
            }

            @Override // C3.a.e, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                g.this.d(true);
            }
        }

        /* compiled from: FragmentStateAdapter.java */
        class c implements InterfaceC2111s {
            c() {
            }

            @Override // android.view.InterfaceC2111s
            public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f2142d = a(recyclerView);
            C0042a c0042a = new C0042a();
            this.f2139a = c0042a;
            this.f2142d.g(c0042a);
            b bVar = new b();
            this.f2140b = bVar;
            a.this.E(bVar);
            c cVar = new c();
            this.f2141c = cVar;
            a.this.f2120E.a(cVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f2139a);
            a.this.H(this.f2140b);
            a.this.f2120E.d(this.f2141c);
            this.f2142d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragmentF;
            if (a.this.b0() || this.f2142d.getScrollState() != 0 || a.this.f2122G.h() || a.this.h() == 0 || (currentItem = this.f2142d.getCurrentItem()) >= a.this.h()) {
                return;
            }
            long jI = a.this.i(currentItem);
            if ((jI != this.f2143e || z10) && (fragmentF = a.this.f2122G.f(jI)) != null && fragmentF.K0()) {
                this.f2143e = jI;
                C cR = a.this.f2121F.r();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i10 = 0; i10 < a.this.f2122G.n(); i10++) {
                    long jI2 = a.this.f2122G.i(i10);
                    Fragment fragmentO = a.this.f2122G.o(i10);
                    if (fragmentO.K0()) {
                        if (jI2 != this.f2143e) {
                            AbstractC2106m.b bVar = AbstractC2106m.b.STARTED;
                            cR.y(fragmentO, bVar);
                            arrayList.add(a.this.f2126K.a(fragmentO, bVar));
                        } else {
                            fragment = fragmentO;
                        }
                        fragmentO.o2(jI2 == this.f2143e);
                    }
                }
                if (fragment != null) {
                    AbstractC2106m.b bVar2 = AbstractC2106m.b.RESUMED;
                    cR.y(fragment, bVar2);
                    arrayList.add(a.this.f2126K.a(fragment, bVar2));
                }
                if (cR.r()) {
                    return;
                }
                cR.l();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.this.f2126K.b((List) it.next());
                }
            }
        }
    }

    public a(v vVar, AbstractC2106m abstractC2106m) {
        this.f2121F = vVar;
        this.f2120E = abstractC2106m;
        super.F(true);
    }

    private static String L(String str, long j10) {
        return str + j10;
    }

    private void M(int i10) {
        long jI = i(i10);
        if (this.f2122G.d(jI)) {
            return;
        }
        Fragment fragmentK = K(i10);
        fragmentK.n2(this.f2123H.f(jI));
        this.f2122G.k(jI, fragmentK);
    }

    private boolean O(long j10) {
        View viewE0;
        if (this.f2124I.d(j10)) {
            return true;
        }
        Fragment fragmentF = this.f2122G.f(j10);
        return (fragmentF == null || (viewE0 = fragmentF.E0()) == null || viewE0.getParent() == null) ? false : true;
    }

    private static boolean P(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long Q(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.f2124I.n(); i11++) {
            if (this.f2124I.o(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f2124I.i(i11));
            }
        }
        return lValueOf;
    }

    private static long W(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void Y(long j10) {
        ViewParent parent;
        Fragment fragmentF = this.f2122G.f(j10);
        if (fragmentF == null) {
            return;
        }
        if (fragmentF.E0() != null && (parent = fragmentF.E0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!J(j10)) {
            this.f2123H.l(j10);
        }
        if (!fragmentF.K0()) {
            this.f2122G.l(j10);
            return;
        }
        if (b0()) {
            this.f2128M = true;
            return;
        }
        if (fragmentF.K0() && J(j10)) {
            List<h.b> listE = this.f2126K.e(fragmentF);
            Fragment.l lVarE1 = this.f2121F.E1(fragmentF);
            this.f2126K.b(listE);
            this.f2123H.k(j10, lVarE1);
        }
        List<h.b> listD = this.f2126K.d(fragmentF);
        try {
            this.f2121F.r().s(fragmentF).l();
            this.f2122G.l(j10);
        } finally {
            this.f2126K.b(listD);
        }
    }

    private void Z() {
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c();
        this.f2120E.a(new d(handler, cVar));
        handler.postDelayed(cVar, 10000L);
    }

    private void a0(Fragment fragment, FrameLayout frameLayout) {
        this.f2121F.t1(new b(fragment, frameLayout), false);
    }

    void I(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean J(long j10) {
        return j10 >= 0 && j10 < ((long) h());
    }

    public abstract Fragment K(int i10);

    void N() {
        if (!this.f2128M || b0()) {
            return;
        }
        C4392b c4392b = new C4392b();
        for (int i10 = 0; i10 < this.f2122G.n(); i10++) {
            long jI = this.f2122G.i(i10);
            if (!J(jI)) {
                c4392b.add(Long.valueOf(jI));
                this.f2124I.l(jI);
            }
        }
        if (!this.f2127L) {
            this.f2128M = false;
            for (int i11 = 0; i11 < this.f2122G.n(); i11++) {
                long jI2 = this.f2122G.i(i11);
                if (!O(jI2)) {
                    c4392b.add(Long.valueOf(jI2));
                }
            }
        }
        Iterator<E> it = c4392b.iterator();
        while (it.hasNext()) {
            Y(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void w(C3.b bVar, int i10) {
        long itemId = bVar.getItemId();
        int id2 = bVar.b().getId();
        Long lQ = Q(id2);
        if (lQ != null && lQ.longValue() != itemId) {
            Y(lQ.longValue());
            this.f2124I.l(lQ.longValue());
        }
        this.f2124I.k(itemId, Integer.valueOf(id2));
        M(i10);
        if (X.Q(bVar.b())) {
            X(bVar);
        }
        N();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C3.b y(ViewGroup viewGroup, int i10) {
        return C3.b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final boolean A(C3.b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void B(C3.b bVar) {
        X(bVar);
        N();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void D(C3.b bVar) {
        Long lQ = Q(bVar.b().getId());
        if (lQ != null) {
            Y(lQ.longValue());
            this.f2124I.l(lQ.longValue());
        }
    }

    void X(C3.b bVar) {
        Fragment fragmentF = this.f2122G.f(bVar.getItemId());
        if (fragmentF == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutB = bVar.b();
        View viewE0 = fragmentF.E0();
        if (!fragmentF.K0() && viewE0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentF.K0() && viewE0 == null) {
            a0(fragmentF, frameLayoutB);
            return;
        }
        if (fragmentF.K0() && viewE0.getParent() != null) {
            if (viewE0.getParent() != frameLayoutB) {
                I(viewE0, frameLayoutB);
                return;
            }
            return;
        }
        if (fragmentF.K0()) {
            I(viewE0, frameLayoutB);
            return;
        }
        if (b0()) {
            if (this.f2121F.P0()) {
                return;
            }
            this.f2120E.a(new C0041a(bVar));
            return;
        }
        a0(fragmentF, frameLayoutB);
        List<h.b> listC = this.f2126K.c(fragmentF);
        try {
            fragmentF.o2(false);
            this.f2121F.r().e(fragmentF, "f" + bVar.getItemId()).y(fragmentF, AbstractC2106m.b.STARTED).l();
            this.f2125J.d(false);
        } finally {
            this.f2126K.b(listC);
        }
    }

    @Override // C3.c
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f2122G.n() + this.f2123H.n());
        for (int i10 = 0; i10 < this.f2122G.n(); i10++) {
            long jI = this.f2122G.i(i10);
            Fragment fragmentF = this.f2122G.f(jI);
            if (fragmentF != null && fragmentF.K0()) {
                this.f2121F.s1(bundle, L("f#", jI), fragmentF);
            }
        }
        for (int i11 = 0; i11 < this.f2123H.n(); i11++) {
            long jI2 = this.f2123H.i(i11);
            if (J(jI2)) {
                bundle.putParcelable(L("s#", jI2), this.f2123H.f(jI2));
            }
        }
        return bundle;
    }

    @Override // C3.c
    public final void b(Parcelable parcelable) {
        if (!this.f2123H.h() || !this.f2122G.h()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (P(str, "f#")) {
                this.f2122G.k(W(str, "f#"), this.f2121F.y0(bundle, str));
            } else {
                if (!P(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jW = W(str, "s#");
                Fragment.l lVar = (Fragment.l) bundle.getParcelable(str);
                if (J(jW)) {
                    this.f2123H.k(jW, lVar);
                }
            }
        }
        if (this.f2122G.h()) {
            return;
        }
        this.f2128M = true;
        this.f2127L = true;
        N();
        Z();
    }

    boolean b0() {
        return this.f2121F.X0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void v(RecyclerView recyclerView) {
        i.a(this.f2125J == null);
        g gVar = new g();
        this.f2125J = gVar;
        gVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void z(RecyclerView recyclerView) {
        this.f2125J.c(recyclerView);
        this.f2125J = null;
    }

    /* compiled from: FragmentStateAdapter.java */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        private static final b f2148a = new C0043a();

        /* compiled from: FragmentStateAdapter.java */
        public interface b {
            void a();
        }

        public b a(Fragment fragment, AbstractC2106m.b bVar) {
            return f2148a;
        }

        public b b(Fragment fragment) {
            return f2148a;
        }

        public b c(Fragment fragment) {
            return f2148a;
        }

        public b d(Fragment fragment) {
            return f2148a;
        }

        /* compiled from: FragmentStateAdapter.java */
        /* renamed from: C3.a$h$a, reason: collision with other inner class name */
        class C0043a implements b {
            C0043a() {
            }

            @Override // C3.a.h.b
            public void a() {
            }
        }
    }
}
