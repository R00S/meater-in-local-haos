package androidx.media3.exoplayer.source;

import U1.G;
import U1.v;
import X1.C1804a;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m8.M;
import m8.N;
import n2.C4058f;
import n2.InterfaceC4057e;

/* loaded from: classes.dex */
public final class MergingMediaSource extends AbstractC2139c<Integer> {

    /* renamed from: w, reason: collision with root package name */
    private static final U1.v f27690w = new v.c().c("MergingMediaSource").a();

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27691k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f27692l;

    /* renamed from: m, reason: collision with root package name */
    private final r[] f27693m;

    /* renamed from: n, reason: collision with root package name */
    private final List<List<c>> f27694n;

    /* renamed from: o, reason: collision with root package name */
    private final U1.G[] f27695o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<r> f27696p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC4057e f27697q;

    /* renamed from: r, reason: collision with root package name */
    private final Map<Object, Long> f27698r;

    /* renamed from: s, reason: collision with root package name */
    private final M<Object, C2138b> f27699s;

    /* renamed from: t, reason: collision with root package name */
    private int f27700t;

    /* renamed from: u, reason: collision with root package name */
    private long[][] f27701u;

    /* renamed from: v, reason: collision with root package name */
    private IllegalMergeException f27702v;

    public static final class IllegalMergeException extends IOException {

        /* renamed from: B, reason: collision with root package name */
        public final int f27703B;

        public IllegalMergeException(int i10) {
            this.f27703B = i10;
        }
    }

    private static final class b extends m {

        /* renamed from: f, reason: collision with root package name */
        private final long[] f27704f;

        /* renamed from: g, reason: collision with root package name */
        private final long[] f27705g;

        public b(U1.G g10, Map<Object, Long> map) {
            super(g10);
            int iP = g10.p();
            this.f27705g = new long[g10.p()];
            G.c cVar = new G.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f27705g[i10] = g10.n(i10, cVar).f16856m;
            }
            int i11 = g10.i();
            this.f27704f = new long[i11];
            G.b bVar = new G.b();
            for (int i12 = 0; i12 < i11; i12++) {
                g10.g(i12, bVar, true);
                long jLongValue = ((Long) C1804a.e(map.get(bVar.f16822b))).longValue();
                long[] jArr = this.f27704f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f16824d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f16824d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f27705g;
                    int i13 = bVar.f16823c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f16824d = this.f27704f[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.m, U1.G
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public U1.G.c o(int r5, U1.G.c r6, long r7) {
            /*
                r4 = this;
                super.o(r5, r6, r7)
                long[] r7 = r4.f27705g
                r0 = r7[r5]
                r6.f16856m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f16855l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f16855l
            L20:
                r6.f16855l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MergingMediaSource.b.o(int, U1.G$c, long):U1.G$c");
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final r.b f27706a;

        /* renamed from: b, reason: collision with root package name */
        private final q f27707b;

        private c(r.b bVar, q qVar) {
            this.f27706a = bVar;
            this.f27707b = qVar;
        }
    }

    public MergingMediaSource(r... rVarArr) {
        this(false, rVarArr);
    }

    private void I() {
        G.b bVar = new G.b();
        for (int i10 = 0; i10 < this.f27700t; i10++) {
            long j10 = -this.f27695o[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                U1.G[] gArr = this.f27695o;
                if (i11 < gArr.length) {
                    this.f27701u[i10][i11] = j10 - (-gArr[i11].f(i10, bVar).n());
                    i11++;
                }
            }
        }
    }

    private void L() {
        U1.G[] gArr;
        G.b bVar = new G.b();
        for (int i10 = 0; i10 < this.f27700t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                gArr = this.f27695o;
                if (i11 >= gArr.length) {
                    break;
                }
                long j11 = gArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f27701u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object objM = gArr[0].m(i10);
            this.f27698r.put(objM, Long.valueOf(j10));
            Iterator<C2138b> it = this.f27699s.get(objM).iterator();
            while (it.hasNext()) {
                it.next().t(0L, j10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
        super.A();
        Arrays.fill(this.f27695o, (Object) null);
        this.f27700t = -1;
        this.f27702v = null;
        this.f27696p.clear();
        Collections.addAll(this.f27696p, this.f27693m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public r.b C(Integer num, r.b bVar) {
        List<c> list = this.f27694n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f27706a.equals(bVar)) {
                return this.f27694n.get(0).get(i10).f27706a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void F(Integer num, r rVar, U1.G g10) {
        if (this.f27702v != null) {
            return;
        }
        if (this.f27700t == -1) {
            this.f27700t = g10.i();
        } else if (g10.i() != this.f27700t) {
            this.f27702v = new IllegalMergeException(0);
            return;
        }
        if (this.f27701u.length == 0) {
            this.f27701u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f27700t, this.f27695o.length);
        }
        this.f27696p.remove(rVar);
        this.f27695o[num.intValue()] = g10;
        if (this.f27696p.isEmpty()) {
            if (this.f27691k) {
                I();
            }
            U1.G bVar = this.f27695o[0];
            if (this.f27692l) {
                L();
                bVar = new b(bVar, this.f27698r);
            }
            z(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        int length = this.f27693m.length;
        q[] qVarArr = new q[length];
        int iB = this.f27695o[0].b(bVar.f27812a);
        for (int i10 = 0; i10 < length; i10++) {
            r.b bVarA = bVar.a(this.f27695o[i10].m(iB));
            qVarArr[i10] = this.f27693m[i10].a(bVarA, bVar2, j10 - this.f27701u[iB][i10]);
            this.f27694n.get(i10).add(new c(bVarA, qVarArr[i10]));
        }
        v vVar = new v(this.f27697q, this.f27701u[iB], qVarArr);
        if (!this.f27692l) {
            return vVar;
        }
        C2138b c2138b = new C2138b(vVar, true, 0L, ((Long) C1804a.e(this.f27698r.get(bVar.f27812a))).longValue());
        this.f27699s.put(bVar.f27812a, c2138b);
        return c2138b;
    }

    @Override // androidx.media3.exoplayer.source.r
    public U1.v h() {
        r[] rVarArr = this.f27693m;
        return rVarArr.length > 0 ? rVarArr[0].h() : f27690w;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.r
    public void i() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f27702v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.i();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(U1.v vVar) {
        this.f27693m[0].j(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        if (this.f27692l) {
            C2138b c2138b = (C2138b) qVar;
            Iterator<Map.Entry<Object, C2138b>> it = this.f27699s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C2138b> next = it.next();
                if (next.getValue().equals(c2138b)) {
                    this.f27699s.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            qVar = c2138b.f27717B;
        }
        v vVar = (v) qVar;
        for (int i10 = 0; i10 < this.f27693m.length; i10++) {
            List<c> list = this.f27694n.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (list.get(i11).f27707b.equals(qVar)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f27693m[i10].p(vVar.k(i10));
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(a2.n nVar) {
        super.y(nVar);
        for (int i10 = 0; i10 < this.f27693m.length; i10++) {
            H(Integer.valueOf(i10), this.f27693m[i10]);
        }
    }

    public MergingMediaSource(boolean z10, r... rVarArr) {
        this(z10, false, rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, r... rVarArr) {
        this(z10, z11, new C4058f(), rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, InterfaceC4057e interfaceC4057e, r... rVarArr) {
        this.f27691k = z10;
        this.f27692l = z11;
        this.f27693m = rVarArr;
        this.f27697q = interfaceC4057e;
        this.f27696p = new ArrayList<>(Arrays.asList(rVarArr));
        this.f27700t = -1;
        this.f27694n = new ArrayList(rVarArr.length);
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            this.f27694n.add(new ArrayList());
        }
        this.f27695o = new U1.G[rVarArr.length];
        this.f27701u = new long[0][];
        this.f27698r = new HashMap();
        this.f27699s = N.a().a().e();
    }
}
