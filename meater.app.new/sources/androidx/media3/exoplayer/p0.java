package androidx.media3.exoplayer;

import X1.C1804a;
import X1.InterfaceC1813j;
import android.util.Pair;
import androidx.media3.exoplayer.source.r;
import d2.AbstractC3029a;
import e2.InterfaceC3129a;
import e2.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.t;

/* compiled from: MediaSourceList.java */
/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private final v1 f27421a;

    /* renamed from: e, reason: collision with root package name */
    private final d f27425e;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3129a f27428h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1813j f27429i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27431k;

    /* renamed from: l, reason: collision with root package name */
    private a2.n f27432l;

    /* renamed from: j, reason: collision with root package name */
    private n2.t f27430j = new t.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<androidx.media3.exoplayer.source.q, c> f27423c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f27424d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f27422b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f27426f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final Set<c> f27427g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaSourceList.java */
    final class a implements androidx.media3.exoplayer.source.s, androidx.media3.exoplayer.drm.h {

        /* renamed from: B, reason: collision with root package name */
        private final c f27433B;

        public a(c cVar) {
            this.f27433B = cVar;
        }

        private Pair<Integer, r.b> K(int i10, r.b bVar) {
            r.b bVar2 = null;
            if (bVar != null) {
                r.b bVarN = p0.n(this.f27433B, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(p0.s(this.f27433B, i10)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair, n2.j jVar) {
            p0.this.f27428h.I(((Integer) pair.first).intValue(), (r.b) pair.second, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void P(Pair pair) {
            p0.this.f27428h.c0(((Integer) pair.first).intValue(), (r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(Pair pair) {
            p0.this.f27428h.m0(((Integer) pair.first).intValue(), (r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void U(Pair pair) {
            p0.this.f27428h.Q(((Integer) pair.first).intValue(), (r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, int i10) {
            p0.this.f27428h.i0(((Integer) pair.first).intValue(), (r.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, Exception exc) {
            p0.this.f27428h.n0(((Integer) pair.first).intValue(), (r.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair) {
            p0.this.f27428h.h0(((Integer) pair.first).intValue(), (r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Z(Pair pair, n2.i iVar, n2.j jVar) {
            p0.this.f27428h.T(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a0(Pair pair, n2.i iVar, n2.j jVar) {
            p0.this.f27428h.e0(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b0(Pair pair, n2.i iVar, n2.j jVar, IOException iOException, boolean z10) {
            p0.this.f27428h.L(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d0(Pair pair, n2.i iVar, n2.j jVar) {
            p0.this.f27428h.M(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f0(Pair pair, n2.j jVar) {
            p0.this.f27428h.D(((Integer) pair.first).intValue(), (r.b) C1804a.e((r.b) pair.second), jVar);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void D(int i10, r.b bVar, final n2.j jVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27414B.f0(pairK, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void I(int i10, r.b bVar, final n2.j jVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27229B.N(pairK, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void L(int i10, r.b bVar, final n2.i iVar, final n2.j jVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27247B.b0(pairK, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27214B.d0(pairK, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27162B.U(pairK);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void T(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26879B.Z(pairK, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void c0(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27190B.P(pairK);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void e0(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27238B.a0(pairK, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void h0(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27235B.Y(pairK);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void i0(int i10, r.b bVar, final int i11) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27243B.W(pairK, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void m0(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27419B.S(pairK);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void n0(int i10, r.b bVar, final Exception exc) {
            final Pair<Integer, r.b> pairK = K(i10, bVar);
            if (pairK != null) {
                p0.this.f27429i.c(new Runnable() { // from class: androidx.media3.exoplayer.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27205B.X(pairK, exc);
                    }
                });
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r f27435a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f27436b;

        /* renamed from: c, reason: collision with root package name */
        public final a f27437c;

        public b(androidx.media3.exoplayer.source.r rVar, r.c cVar, a aVar) {
            this.f27435a = rVar;
            this.f27436b = cVar;
            this.f27437c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    static final class c implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.p f27438a;

        /* renamed from: d, reason: collision with root package name */
        public int f27441d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27442e;

        /* renamed from: c, reason: collision with root package name */
        public final List<r.b> f27440c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f27439b = new Object();

        public c(androidx.media3.exoplayer.source.r rVar, boolean z10) {
            this.f27438a = new androidx.media3.exoplayer.source.p(rVar, z10);
        }

        @Override // androidx.media3.exoplayer.b0
        public Object a() {
            return this.f27439b;
        }

        @Override // androidx.media3.exoplayer.b0
        public U1.G b() {
            return this.f27438a.V();
        }

        public void c(int i10) {
            this.f27441d = i10;
            this.f27442e = false;
            this.f27440c.clear();
        }
    }

    /* compiled from: MediaSourceList.java */
    public interface d {
        void c();
    }

    public p0(d dVar, InterfaceC3129a interfaceC3129a, InterfaceC1813j interfaceC1813j, v1 v1Var) {
        this.f27421a = v1Var;
        this.f27425e = dVar;
        this.f27428h = interfaceC3129a;
        this.f27429i = interfaceC1813j;
    }

    private void C(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f27422b.remove(i12);
            this.f27424d.remove(cVarRemove.f27439b);
            g(i12, -cVarRemove.f27438a.V().p());
            cVarRemove.f27442e = true;
            if (this.f27431k) {
                v(cVarRemove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f27422b.size()) {
            this.f27422b.get(i10).f27441d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f27426f.get(cVar);
        if (bVar != null) {
            bVar.f27435a.f(bVar.f27436b);
        }
    }

    private void k() {
        Iterator<c> it = this.f27427g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f27440c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f27427g.add(cVar);
        b bVar = this.f27426f.get(cVar);
        if (bVar != null) {
            bVar.f27435a.c(bVar.f27436b);
        }
    }

    private static Object m(Object obj) {
        return AbstractC3029a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.b n(c cVar, r.b bVar) {
        for (int i10 = 0; i10 < cVar.f27440c.size(); i10++) {
            if (cVar.f27440c.get(i10).f27815d == bVar.f27815d) {
                return bVar.a(p(cVar, bVar.f27812a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return AbstractC3029a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC3029a.y(cVar.f27439b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f27441d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(androidx.media3.exoplayer.source.r rVar, U1.G g10) {
        this.f27425e.c();
    }

    private void v(c cVar) {
        if (cVar.f27442e && cVar.f27440c.isEmpty()) {
            b bVar = (b) C1804a.e(this.f27426f.remove(cVar));
            bVar.f27435a.e(bVar.f27436b);
            bVar.f27435a.d(bVar.f27437c);
            bVar.f27435a.o(bVar.f27437c);
            this.f27427g.remove(cVar);
        }
    }

    private void y(c cVar) {
        androidx.media3.exoplayer.source.p pVar = cVar.f27438a;
        r.c cVar2 = new r.c() { // from class: androidx.media3.exoplayer.c0
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar, U1.G g10) {
                this.f26867a.u(rVar, g10);
            }
        };
        a aVar = new a(cVar);
        this.f27426f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.b(X1.L.C(), aVar);
        pVar.n(X1.L.C(), aVar);
        pVar.m(cVar2, this.f27432l, this.f27421a);
    }

    public void A(androidx.media3.exoplayer.source.q qVar) {
        c cVar = (c) C1804a.e(this.f27423c.remove(qVar));
        cVar.f27438a.p(qVar);
        cVar.f27440c.remove(((androidx.media3.exoplayer.source.o) qVar).f27790B);
        if (!this.f27423c.isEmpty()) {
            k();
        }
        v(cVar);
    }

    public U1.G B(int i10, int i11, n2.t tVar) {
        C1804a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f27430j = tVar;
        C(i10, i11);
        return i();
    }

    public U1.G D(List<c> list, n2.t tVar) {
        C(0, this.f27422b.size());
        return f(this.f27422b.size(), list, tVar);
    }

    public U1.G E(n2.t tVar) {
        int iR = r();
        if (tVar.a() != iR) {
            tVar = tVar.h().f(0, iR);
        }
        this.f27430j = tVar;
        return i();
    }

    public U1.G F(int i10, int i11, List<U1.v> list) {
        C1804a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        C1804a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f27422b.get(i12).f27438a.j(list.get(i12 - i10));
        }
        return i();
    }

    public U1.G f(int i10, List<c> list, n2.t tVar) {
        if (!list.isEmpty()) {
            this.f27430j = tVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f27422b.get(i11 - 1);
                    cVar.c(cVar2.f27441d + cVar2.f27438a.V().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f27438a.V().p());
                this.f27422b.add(i11, cVar);
                this.f27424d.put(cVar.f27439b, cVar);
                if (this.f27431k) {
                    y(cVar);
                    if (this.f27423c.isEmpty()) {
                        this.f27427g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public androidx.media3.exoplayer.source.q h(r.b bVar, r2.b bVar2, long j10) {
        Object objO = o(bVar.f27812a);
        r.b bVarA = bVar.a(m(bVar.f27812a));
        c cVar = (c) C1804a.e(this.f27424d.get(objO));
        l(cVar);
        cVar.f27440c.add(bVarA);
        androidx.media3.exoplayer.source.o oVarA = cVar.f27438a.a(bVarA, bVar2, j10);
        this.f27423c.put(oVarA, cVar);
        k();
        return oVarA;
    }

    public U1.G i() {
        if (this.f27422b.isEmpty()) {
            return U1.G.f16812a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f27422b.size(); i10++) {
            c cVar = this.f27422b.get(i10);
            cVar.f27441d = iP;
            iP += cVar.f27438a.V().p();
        }
        return new s0(this.f27422b, this.f27430j);
    }

    public n2.t q() {
        return this.f27430j;
    }

    public int r() {
        return this.f27422b.size();
    }

    public boolean t() {
        return this.f27431k;
    }

    public U1.G w(int i10, int i11, int i12, n2.t tVar) {
        C1804a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f27430j = tVar;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iP = this.f27422b.get(iMin).f27441d;
        X1.L.P0(this.f27422b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f27422b.get(iMin);
            cVar.f27441d = iP;
            iP += cVar.f27438a.V().p();
            iMin++;
        }
        return i();
    }

    public void x(a2.n nVar) {
        C1804a.g(!this.f27431k);
        this.f27432l = nVar;
        for (int i10 = 0; i10 < this.f27422b.size(); i10++) {
            c cVar = this.f27422b.get(i10);
            y(cVar);
            this.f27427g.add(cVar);
        }
        this.f27431k = true;
    }

    public void z() {
        for (b bVar : this.f27426f.values()) {
            try {
                bVar.f27435a.e(bVar.f27436b);
            } catch (RuntimeException e10) {
                X1.n.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f27435a.d(bVar.f27437c);
            bVar.f27435a.o(bVar.f27437c);
        }
        this.f27426f.clear();
        this.f27427g.clear();
        this.f27431k = false;
    }
}
