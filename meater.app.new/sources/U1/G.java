package U1;

import U1.C1726b;
import U1.v;
import X1.C1804a;
import android.net.Uri;
import android.util.Pair;

/* compiled from: Timeline.java */
/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f16812a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f16813b = X1.L.B0(0);

    /* renamed from: c, reason: collision with root package name */
    private static final String f16814c = X1.L.B0(1);

    /* renamed from: d, reason: collision with root package name */
    private static final String f16815d = X1.L.B0(2);

    /* compiled from: Timeline.java */
    class a extends G {
        a() {
        }

        @Override // U1.G
        public int b(Object obj) {
            return -1;
        }

        @Override // U1.G
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // U1.G
        public int i() {
            return 0;
        }

        @Override // U1.G
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // U1.G
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // U1.G
        public int p() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        private static final String f16816h = X1.L.B0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f16817i = X1.L.B0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f16818j = X1.L.B0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f16819k = X1.L.B0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f16820l = X1.L.B0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f16821a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16822b;

        /* renamed from: c, reason: collision with root package name */
        public int f16823c;

        /* renamed from: d, reason: collision with root package name */
        public long f16824d;

        /* renamed from: e, reason: collision with root package name */
        public long f16825e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16826f;

        /* renamed from: g, reason: collision with root package name */
        public C1726b f16827g = C1726b.f16996g;

        public int a(int i10) {
            return this.f16827g.a(i10).f17018b;
        }

        public long b(int i10, int i11) {
            C1726b.a aVarA = this.f16827g.a(i10);
            if (aVarA.f17018b != -1) {
                return aVarA.f17023g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f16827g.f17003b;
        }

        public int d(long j10) {
            return this.f16827g.b(j10, this.f16824d);
        }

        public int e(long j10) {
            return this.f16827g.c(j10, this.f16824d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return X1.L.d(this.f16821a, bVar.f16821a) && X1.L.d(this.f16822b, bVar.f16822b) && this.f16823c == bVar.f16823c && this.f16824d == bVar.f16824d && this.f16825e == bVar.f16825e && this.f16826f == bVar.f16826f && X1.L.d(this.f16827g, bVar.f16827g);
        }

        public long f(int i10) {
            return this.f16827g.a(i10).f17017a;
        }

        public long g() {
            return this.f16827g.f17004c;
        }

        public int h(int i10, int i11) {
            C1726b.a aVarA = this.f16827g.a(i10);
            if (aVarA.f17018b != -1) {
                return aVarA.f17022f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f16821a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f16822b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f16823c) * 31;
            long j10 = this.f16824d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f16825e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f16826f ? 1 : 0)) * 31) + this.f16827g.hashCode();
        }

        public long i(int i10) {
            return this.f16827g.a(i10).f17024h;
        }

        public long j() {
            return this.f16824d;
        }

        public int k(int i10) {
            return this.f16827g.a(i10).d();
        }

        public int l(int i10, int i11) {
            return this.f16827g.a(i10).e(i11);
        }

        public long m() {
            return X1.L.u1(this.f16825e);
        }

        public long n() {
            return this.f16825e;
        }

        public int o() {
            return this.f16827g.f17006e;
        }

        public boolean p(int i10) {
            return !this.f16827g.a(i10).f();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f16827g.d(i10);
        }

        public boolean r(int i10) {
            return this.f16827g.a(i10).f17025i;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, C1726b.f16996g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, C1726b c1726b, boolean z10) {
            this.f16821a = obj;
            this.f16822b = obj2;
            this.f16823c = i10;
            this.f16824d = j10;
            this.f16825e = j11;
            this.f16827g = c1726b;
            this.f16826f = z10;
            return this;
        }
    }

    /* compiled from: Timeline.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f16845b;

        /* renamed from: d, reason: collision with root package name */
        public Object f16847d;

        /* renamed from: e, reason: collision with root package name */
        public long f16848e;

        /* renamed from: f, reason: collision with root package name */
        public long f16849f;

        /* renamed from: g, reason: collision with root package name */
        public long f16850g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16851h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f16852i;

        /* renamed from: j, reason: collision with root package name */
        public v.g f16853j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16854k;

        /* renamed from: l, reason: collision with root package name */
        public long f16855l;

        /* renamed from: m, reason: collision with root package name */
        public long f16856m;

        /* renamed from: n, reason: collision with root package name */
        public int f16857n;

        /* renamed from: o, reason: collision with root package name */
        public int f16858o;

        /* renamed from: p, reason: collision with root package name */
        public long f16859p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f16834q = new Object();

        /* renamed from: r, reason: collision with root package name */
        private static final Object f16835r = new Object();

        /* renamed from: s, reason: collision with root package name */
        private static final v f16836s = new v.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        private static final String f16837t = X1.L.B0(1);

        /* renamed from: u, reason: collision with root package name */
        private static final String f16838u = X1.L.B0(2);

        /* renamed from: v, reason: collision with root package name */
        private static final String f16839v = X1.L.B0(3);

        /* renamed from: w, reason: collision with root package name */
        private static final String f16840w = X1.L.B0(4);

        /* renamed from: x, reason: collision with root package name */
        private static final String f16841x = X1.L.B0(5);

        /* renamed from: y, reason: collision with root package name */
        private static final String f16842y = X1.L.B0(6);

        /* renamed from: z, reason: collision with root package name */
        private static final String f16843z = X1.L.B0(7);

        /* renamed from: A, reason: collision with root package name */
        private static final String f16828A = X1.L.B0(8);

        /* renamed from: B, reason: collision with root package name */
        private static final String f16829B = X1.L.B0(9);

        /* renamed from: C, reason: collision with root package name */
        private static final String f16830C = X1.L.B0(10);

        /* renamed from: D, reason: collision with root package name */
        private static final String f16831D = X1.L.B0(11);

        /* renamed from: E, reason: collision with root package name */
        private static final String f16832E = X1.L.B0(12);

        /* renamed from: F, reason: collision with root package name */
        private static final String f16833F = X1.L.B0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f16844a = f16834q;

        /* renamed from: c, reason: collision with root package name */
        public v f16846c = f16836s;

        public long a() {
            return X1.L.f0(this.f16850g);
        }

        public long b() {
            return X1.L.u1(this.f16855l);
        }

        public long c() {
            return this.f16855l;
        }

        public long d() {
            return X1.L.u1(this.f16856m);
        }

        public long e() {
            return this.f16859p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return X1.L.d(this.f16844a, cVar.f16844a) && X1.L.d(this.f16846c, cVar.f16846c) && X1.L.d(this.f16847d, cVar.f16847d) && X1.L.d(this.f16853j, cVar.f16853j) && this.f16848e == cVar.f16848e && this.f16849f == cVar.f16849f && this.f16850g == cVar.f16850g && this.f16851h == cVar.f16851h && this.f16852i == cVar.f16852i && this.f16854k == cVar.f16854k && this.f16855l == cVar.f16855l && this.f16856m == cVar.f16856m && this.f16857n == cVar.f16857n && this.f16858o == cVar.f16858o && this.f16859p == cVar.f16859p;
        }

        public boolean f() {
            return this.f16853j != null;
        }

        public c g(Object obj, v vVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, v.g gVar, long j13, long j14, int i10, int i11, long j15) {
            v.h hVar;
            this.f16844a = obj;
            this.f16846c = vVar != null ? vVar : f16836s;
            this.f16845b = (vVar == null || (hVar = vVar.f17234b) == null) ? null : hVar.f17333h;
            this.f16847d = obj2;
            this.f16848e = j10;
            this.f16849f = j11;
            this.f16850g = j12;
            this.f16851h = z10;
            this.f16852i = z11;
            this.f16853j = gVar;
            this.f16855l = j13;
            this.f16856m = j14;
            this.f16857n = i10;
            this.f16858o = i11;
            this.f16859p = j15;
            this.f16854k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f16844a.hashCode()) * 31) + this.f16846c.hashCode()) * 31;
            Object obj = this.f16847d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            v.g gVar = this.f16853j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f16848e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f16849f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f16850g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f16851h ? 1 : 0)) * 31) + (this.f16852i ? 1 : 0)) * 31) + (this.f16854k ? 1 : 0)) * 31;
            long j13 = this.f16855l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f16856m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f16857n) * 31) + this.f16858o) * 31;
            long j15 = this.f16859p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected G() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f16823c;
        if (n(i12, cVar).f16858o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f16857n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (g10.p() != p() || g10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(g10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(g10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != g10.a(true) || (iC = c(true)) != g10.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != g10.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) C1804a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        C1804a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f16857n;
        f(i11, bVar);
        while (i11 < cVar.f16858o && bVar.f16825e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f16825e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f16825e;
        long j12 = bVar.f16824d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(C1804a.e(bVar.f16822b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
