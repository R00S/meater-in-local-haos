package androidx.media3.exoplayer;

import U1.G;
import X1.C1804a;
import X1.InterfaceC1813j;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.source.r;
import e2.InterfaceC3129a;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes.dex */
final class a0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3129a f26597c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1813j f26598d;

    /* renamed from: e, reason: collision with root package name */
    private final X.a f26599e;

    /* renamed from: f, reason: collision with root package name */
    private long f26600f;

    /* renamed from: g, reason: collision with root package name */
    private int f26601g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26602h;

    /* renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f26603i;

    /* renamed from: j, reason: collision with root package name */
    private X f26604j;

    /* renamed from: k, reason: collision with root package name */
    private X f26605k;

    /* renamed from: l, reason: collision with root package name */
    private X f26606l;

    /* renamed from: m, reason: collision with root package name */
    private X f26607m;

    /* renamed from: n, reason: collision with root package name */
    private int f26608n;

    /* renamed from: o, reason: collision with root package name */
    private Object f26609o;

    /* renamed from: p, reason: collision with root package name */
    private long f26610p;

    /* renamed from: a, reason: collision with root package name */
    private final G.b f26595a = new G.b();

    /* renamed from: b, reason: collision with root package name */
    private final G.c f26596b = new G.c();

    /* renamed from: q, reason: collision with root package name */
    private List<X> f26611q = new ArrayList();

    public a0(InterfaceC3129a interfaceC3129a, InterfaceC1813j interfaceC1813j, X.a aVar, ExoPlayer.c cVar) {
        this.f26597c = interfaceC3129a;
        this.f26598d = interfaceC1813j;
        this.f26599e = aVar;
        this.f26603i = cVar;
    }

    private boolean A(r.b bVar) {
        return !bVar.b() && bVar.f27816e == -1;
    }

    private boolean B(U1.G g10, r.b bVar, boolean z10) {
        int iB = g10.b(bVar.f27812a);
        return !g10.n(g10.f(iB, this.f26595a).f16823c, this.f26596b).f16852i && g10.r(iB, this.f26595a, this.f26596b, this.f26601g, this.f26602h) && z10;
    }

    private boolean C(U1.G g10, r.b bVar) {
        if (A(bVar)) {
            return g10.n(g10.h(bVar.f27812a, this.f26595a).f16823c, this.f26596b).f16858o == g10.b(bVar.f27812a);
        }
        return false;
    }

    private static boolean F(G.b bVar) {
        int iC = bVar.c();
        if (iC == 0) {
            return false;
        }
        if ((iC == 1 && bVar.q(0)) || !bVar.r(bVar.o())) {
            return false;
        }
        long jI = 0;
        if (bVar.e(0L) != -1) {
            return false;
        }
        if (bVar.f16824d == 0) {
            return true;
        }
        int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
        for (int i11 = 0; i11 <= i10; i11++) {
            jI += bVar.i(i11);
        }
        return bVar.f16824d <= jI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(AbstractC4009y.a aVar, r.b bVar) {
        this.f26597c.G(aVar.k(), bVar);
    }

    private void I() {
        final AbstractC4009y.a aVarY = AbstractC4009y.y();
        for (X xK = this.f26604j; xK != null; xK = xK.k()) {
            aVarY.a(xK.f26567h.f26577a);
        }
        X x10 = this.f26605k;
        final r.b bVar = x10 == null ? null : x10.f26567h.f26577a;
        this.f26598d.c(new Runnable() { // from class: androidx.media3.exoplayer.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f26586B.G(aVarY, bVar);
            }
        });
    }

    private void K(List<X> list) {
        for (int i10 = 0; i10 < this.f26611q.size(); i10++) {
            this.f26611q.get(i10).x();
        }
        this.f26611q = list;
        this.f26607m = null;
        H();
    }

    private X N(Y y10) {
        for (int i10 = 0; i10 < this.f26611q.size(); i10++) {
            if (this.f26611q.get(i10).d(y10)) {
                return this.f26611q.remove(i10);
            }
        }
        return null;
    }

    private static r.b O(U1.G g10, Object obj, long j10, long j11, G.c cVar, G.b bVar) {
        g10.h(obj, bVar);
        g10.n(bVar.f16823c, cVar);
        Object objE = obj;
        for (int iB = g10.b(obj); F(bVar) && iB <= cVar.f16858o; iB++) {
            g10.g(iB, bVar, true);
            objE = C1804a.e(bVar.f16822b);
        }
        g10.h(objE, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new r.b(objE, j11, bVar.d(j10)) : new r.b(objE, iE, bVar.k(iE), j11);
    }

    private long Q(U1.G g10, Object obj) {
        int iB;
        int i10 = g10.h(obj, this.f26595a).f16823c;
        Object obj2 = this.f26609o;
        if (obj2 != null && (iB = g10.b(obj2)) != -1 && g10.f(iB, this.f26595a).f16823c == i10) {
            return this.f26610p;
        }
        for (X xK = this.f26604j; xK != null; xK = xK.k()) {
            if (xK.f26561b.equals(obj)) {
                return xK.f26567h.f26577a.f27815d;
            }
        }
        for (X xK2 = this.f26604j; xK2 != null; xK2 = xK2.k()) {
            int iB2 = g10.b(xK2.f26561b);
            if (iB2 != -1 && g10.f(iB2, this.f26595a).f16823c == i10) {
                return xK2.f26567h.f26577a.f27815d;
            }
        }
        long jR = R(obj);
        if (jR != -1) {
            return jR;
        }
        long j10 = this.f26600f;
        this.f26600f = 1 + j10;
        if (this.f26604j == null) {
            this.f26609o = obj;
            this.f26610p = j10;
        }
        return j10;
    }

    private long R(Object obj) {
        for (int i10 = 0; i10 < this.f26611q.size(); i10++) {
            X x10 = this.f26611q.get(i10);
            if (x10.f26561b.equals(obj)) {
                return x10.f26567h.f26577a.f27815d;
            }
        }
        return -1L;
    }

    private boolean T(U1.G g10) {
        X xK = this.f26604j;
        if (xK == null) {
            return true;
        }
        int iB = g10.b(xK.f26561b);
        while (true) {
            iB = g10.d(iB, this.f26595a, this.f26596b, this.f26601g, this.f26602h);
            while (((X) C1804a.e(xK)).k() != null && !xK.f26567h.f26583g) {
                xK = xK.k();
            }
            X xK2 = xK.k();
            if (iB == -1 || xK2 == null || g10.b(xK2.f26561b) != iB) {
                break;
            }
            xK = xK2;
        }
        boolean zM = M(xK);
        xK.f26567h = x(g10, xK.f26567h);
        return !zM;
    }

    static boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(Y y10, Y y11) {
        return y10.f26578b == y11.f26578b && y10.f26577a.equals(y11.f26577a);
    }

    private Pair<Object, Long> h(U1.G g10, Object obj, long j10) {
        int iE = g10.e(g10.h(obj, this.f26595a).f16823c, this.f26601g, this.f26602h);
        if (iE != -1) {
            return g10.k(this.f26596b, this.f26595a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private Y i(q0 q0Var) {
        return n(q0Var.f27445a, q0Var.f27446b, q0Var.f27447c, q0Var.f27463s);
    }

    private Y j(U1.G g10, X x10, long j10) {
        Y y10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        long jR;
        Y y11 = x10.f26567h;
        int iD = g10.d(g10.b(y11.f26577a.f27812a), this.f26595a, this.f26596b, this.f26601g, this.f26602h);
        if (iD == -1) {
            return null;
        }
        int i10 = g10.g(iD, this.f26595a, true).f16823c;
        Object objE = C1804a.e(this.f26595a.f16822b);
        long j15 = y11.f26577a.f27815d;
        if (g10.n(i10, this.f26596b).f16857n == iD) {
            y10 = y11;
            Pair<Object, Long> pairK = g10.k(this.f26596b, this.f26595a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            X xK = x10.k();
            if (xK == null || !xK.f26561b.equals(obj2)) {
                jR = R(obj2);
                if (jR == -1) {
                    jR = this.f26600f;
                    this.f26600f = 1 + jR;
                }
            } else {
                jR = xK.f26567h.f26577a.f27815d;
            }
            j11 = jR;
            j12 = -9223372036854775807L;
            obj = obj2;
            j13 = jLongValue;
        } else {
            y10 = y11;
            j11 = j15;
            j12 = 0;
            obj = objE;
            j13 = 0;
        }
        r.b bVarO = O(g10, obj, j13, j11, this.f26596b, this.f26595a);
        if (j12 == -9223372036854775807L || y10.f26579c == -9223372036854775807L) {
            j14 = j13;
        } else {
            boolean zY = y(y10.f26577a.f27812a, g10);
            if (bVarO.b() && zY) {
                j12 = y10.f26579c;
            } else if (zY) {
                j14 = y10.f26579c;
            }
            j14 = j13;
        }
        return n(g10, bVarO, j12, j14);
    }

    private Y k(U1.G g10, X x10, long j10) {
        Y y10 = x10.f26567h;
        long jM = (x10.m() + y10.f26581e) - j10;
        return y10.f26583g ? j(g10, x10, jM) : l(g10, x10, jM);
    }

    private Y l(U1.G g10, X x10, long j10) {
        Y y10 = x10.f26567h;
        r.b bVar = y10.f26577a;
        g10.h(bVar.f27812a, this.f26595a);
        if (!bVar.b()) {
            int i10 = bVar.f27816e;
            if (i10 != -1 && this.f26595a.q(i10)) {
                return j(g10, x10, j10);
            }
            int iK = this.f26595a.k(bVar.f27816e);
            boolean z10 = this.f26595a.r(bVar.f27816e) && this.f26595a.h(bVar.f27816e, iK) == 3;
            if (iK == this.f26595a.a(bVar.f27816e) || z10) {
                return p(g10, bVar.f27812a, r(g10, bVar.f27812a, bVar.f27816e), y10.f26581e, bVar.f27815d);
            }
            return o(g10, bVar.f27812a, bVar.f27816e, iK, y10.f26581e, bVar.f27815d);
        }
        int i11 = bVar.f27813b;
        int iA = this.f26595a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f26595a.l(i11, bVar.f27814c);
        if (iL < iA) {
            return o(g10, bVar.f27812a, i11, iL, y10.f26579c, bVar.f27815d);
        }
        long jLongValue = y10.f26579c;
        if (jLongValue == -9223372036854775807L) {
            G.c cVar = this.f26596b;
            G.b bVar2 = this.f26595a;
            Pair<Object, Long> pairK = g10.k(cVar, bVar2, bVar2.f16823c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return p(g10, bVar.f27812a, Math.max(r(g10, bVar.f27812a, bVar.f27813b), jLongValue), y10.f26579c, bVar.f27815d);
    }

    private Y n(U1.G g10, r.b bVar, long j10, long j11) {
        g10.h(bVar.f27812a, this.f26595a);
        return bVar.b() ? o(g10, bVar.f27812a, bVar.f27813b, bVar.f27814c, j10, bVar.f27815d) : p(g10, bVar.f27812a, j11, j10, bVar.f27815d);
    }

    private Y o(U1.G g10, Object obj, int i10, int i11, long j10, long j11) {
        r.b bVar = new r.b(obj, i10, i11, j11);
        long jB = g10.h(bVar.f27812a, this.f26595a).b(bVar.f27813b, bVar.f27814c);
        long jG = i11 == this.f26595a.k(i10) ? this.f26595a.g() : 0L;
        return new Y(bVar, (jB == -9223372036854775807L || jG < jB) ? jG : Math.max(0L, jB - 1), j10, -9223372036854775807L, jB, this.f26595a.r(bVar.f27813b), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.media3.exoplayer.Y p(U1.G r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            U1.G$b r5 = r0.f26595a
            r1.h(r2, r5)
            U1.G$b r5 = r0.f26595a
            int r5 = r5.d(r3)
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L22
            U1.G$b r9 = r0.f26595a
            boolean r9 = r9.q(r5)
            if (r9 == 0) goto L22
            r9 = r7
            goto L23
        L22:
            r9 = r6
        L23:
            if (r5 != r8) goto L3b
            U1.G$b r10 = r0.f26595a
            int r10 = r10.c()
            if (r10 <= 0) goto L5a
            U1.G$b r10 = r0.f26595a
            int r11 = r10.o()
            boolean r10 = r10.r(r11)
            if (r10 == 0) goto L5a
            r10 = r7
            goto L5b
        L3b:
            U1.G$b r10 = r0.f26595a
            boolean r10 = r10.r(r5)
            if (r10 == 0) goto L5a
            U1.G$b r10 = r0.f26595a
            long r10 = r10.f(r5)
            U1.G$b r12 = r0.f26595a
            long r13 = r12.f16824d
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L5a
            boolean r10 = r12.p(r5)
            if (r10 == 0) goto L5a
            r10 = r7
            r5 = r8
            goto L5b
        L5a:
            r10 = r6
        L5b:
            androidx.media3.exoplayer.source.r$b r12 = new androidx.media3.exoplayer.source.r$b
            r13 = r32
            r12.<init>(r2, r13, r5)
            boolean r2 = r0.A(r12)
            boolean r23 = r0.C(r1, r12)
            boolean r24 = r0.B(r1, r12, r2)
            if (r5 == r8) goto L7d
            U1.G$b r1 = r0.f26595a
            boolean r1 = r1.r(r5)
            if (r1 == 0) goto L7d
            if (r9 != 0) goto L7d
            r21 = r7
            goto L7f
        L7d:
            r21 = r6
        L7f:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L91
            if (r9 != 0) goto L91
            U1.G$b r1 = r0.f26595a
            long r8 = r1.f(r5)
        L8e:
            r17 = r8
            goto L9a
        L91:
            if (r10 == 0) goto L98
            U1.G$b r1 = r0.f26595a
            long r8 = r1.f16824d
            goto L8e
        L98:
            r17 = r13
        L9a:
            int r1 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r1 == 0) goto La8
            r8 = -9223372036854775808
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 != 0) goto La5
            goto La8
        La5:
            r19 = r17
            goto Lae
        La8:
            U1.G$b r1 = r0.f26595a
            long r8 = r1.f16824d
            r19 = r8
        Lae:
            int r1 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r1 == 0) goto Lc4
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto Lc4
            if (r24 != 0) goto Lba
            if (r10 != 0) goto Lbb
        Lba:
            r6 = r7
        Lbb:
            long r3 = (long) r6
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lc4:
            r13 = r3
            androidx.media3.exoplayer.Y r1 = new androidx.media3.exoplayer.Y
            r11 = r1
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.a0.p(U1.G, java.lang.Object, long, long, long):androidx.media3.exoplayer.Y");
    }

    private Y q(U1.G g10, Object obj, long j10, long j11) {
        r.b bVarO = O(g10, obj, j10, j11, this.f26596b, this.f26595a);
        return bVarO.b() ? o(g10, bVarO.f27812a, bVarO.f27813b, bVarO.f27814c, j10, bVarO.f27815d) : p(g10, bVarO.f27812a, j10, -9223372036854775807L, bVarO.f27815d);
    }

    private long r(U1.G g10, Object obj, int i10) {
        g10.h(obj, this.f26595a);
        long jF = this.f26595a.f(i10);
        return jF == Long.MIN_VALUE ? this.f26595a.f16824d : jF + this.f26595a.i(i10);
    }

    private boolean y(Object obj, U1.G g10) {
        int iC = g10.h(obj, this.f26595a).c();
        int iO = this.f26595a.o();
        return iC > 0 && this.f26595a.r(iO) && (iC > 1 || this.f26595a.f(iO) != Long.MIN_VALUE);
    }

    public boolean D(androidx.media3.exoplayer.source.q qVar) {
        X x10 = this.f26606l;
        return x10 != null && x10.f26560a == qVar;
    }

    public boolean E(androidx.media3.exoplayer.source.q qVar) {
        X x10 = this.f26607m;
        return x10 != null && x10.f26560a == qVar;
    }

    public void H() {
        X x10 = this.f26607m;
        if (x10 == null || x10.t()) {
            this.f26607m = null;
            for (int i10 = 0; i10 < this.f26611q.size(); i10++) {
                X x11 = this.f26611q.get(i10);
                if (!x11.t()) {
                    this.f26607m = x11;
                    return;
                }
            }
        }
    }

    public void J(long j10) {
        X x10 = this.f26606l;
        if (x10 != null) {
            x10.w(j10);
        }
    }

    public void L() {
        if (this.f26611q.isEmpty()) {
            return;
        }
        K(new ArrayList());
    }

    public boolean M(X x10) {
        C1804a.i(x10);
        boolean z10 = false;
        if (x10.equals(this.f26606l)) {
            return false;
        }
        this.f26606l = x10;
        while (x10.k() != null) {
            x10 = (X) C1804a.e(x10.k());
            if (x10 == this.f26605k) {
                this.f26605k = this.f26604j;
                z10 = true;
            }
            x10.x();
            this.f26608n--;
        }
        ((X) C1804a.e(this.f26606l)).A(null);
        I();
        return z10;
    }

    public r.b P(U1.G g10, Object obj, long j10) {
        long jQ = Q(g10, obj);
        g10.h(obj, this.f26595a);
        g10.n(this.f26595a.f16823c, this.f26596b);
        boolean z10 = false;
        for (int iB = g10.b(obj); iB >= this.f26596b.f16857n; iB--) {
            g10.g(iB, this.f26595a, true);
            boolean z11 = this.f26595a.c() > 0;
            z10 |= z11;
            G.b bVar = this.f26595a;
            if (bVar.e(bVar.f16824d) != -1) {
                obj = C1804a.e(this.f26595a.f16822b);
            }
            if (z10 && (!z11 || this.f26595a.f16824d != 0)) {
                break;
            }
        }
        return O(g10, obj, j10, jQ, this.f26596b, this.f26595a);
    }

    public boolean S() {
        X x10 = this.f26606l;
        return x10 == null || (!x10.f26567h.f26585i && x10.s() && this.f26606l.f26567h.f26581e != -9223372036854775807L && this.f26608n < 100);
    }

    public void U(U1.G g10, ExoPlayer.c cVar) {
        this.f26603i = cVar;
        z(g10);
    }

    public boolean V(U1.G g10, long j10, long j11) {
        Y yX;
        X xK = this.f26604j;
        X x10 = null;
        while (xK != null) {
            Y y10 = xK.f26567h;
            if (x10 == null) {
                yX = x(g10, y10);
            } else {
                Y yK = k(g10, x10, j10);
                if (yK == null) {
                    return !M(x10);
                }
                if (!e(y10, yK)) {
                    return !M(x10);
                }
                yX = yK;
            }
            xK.f26567h = yX.a(y10.f26579c);
            if (!d(y10.f26581e, yX.f26581e)) {
                xK.E();
                long j12 = yX.f26581e;
                return (M(xK) || (xK == this.f26605k && !xK.f26567h.f26582f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : xK.D(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : xK.D(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            x10 = xK;
            xK = xK.k();
        }
        return true;
    }

    public boolean W(U1.G g10, int i10) {
        this.f26601g = i10;
        return T(g10);
    }

    public boolean X(U1.G g10, boolean z10) {
        this.f26602h = z10;
        return T(g10);
    }

    public X b() {
        X x10 = this.f26604j;
        if (x10 == null) {
            return null;
        }
        if (x10 == this.f26605k) {
            this.f26605k = x10.k();
        }
        this.f26604j.x();
        int i10 = this.f26608n - 1;
        this.f26608n = i10;
        if (i10 == 0) {
            this.f26606l = null;
            X x11 = this.f26604j;
            this.f26609o = x11.f26561b;
            this.f26610p = x11.f26567h.f26577a.f27815d;
        }
        this.f26604j = this.f26604j.k();
        I();
        return this.f26604j;
    }

    public X c() {
        this.f26605k = ((X) C1804a.i(this.f26605k)).k();
        I();
        return (X) C1804a.i(this.f26605k);
    }

    public void f() {
        if (this.f26608n == 0) {
            return;
        }
        X xK = (X) C1804a.i(this.f26604j);
        this.f26609o = xK.f26561b;
        this.f26610p = xK.f26567h.f26577a.f27815d;
        while (xK != null) {
            xK.x();
            xK = xK.k();
        }
        this.f26604j = null;
        this.f26606l = null;
        this.f26605k = null;
        this.f26608n = 0;
        I();
    }

    public X g(Y y10) {
        X x10 = this.f26606l;
        long jM = x10 == null ? 1000000000000L : (x10.m() + this.f26606l.f26567h.f26581e) - y10.f26578b;
        X xN = N(y10);
        if (xN == null) {
            xN = this.f26599e.a(y10, jM);
        } else {
            xN.f26567h = y10;
            xN.B(jM);
        }
        X x11 = this.f26606l;
        if (x11 != null) {
            x11.A(xN);
        } else {
            this.f26604j = xN;
            this.f26605k = xN;
        }
        this.f26609o = null;
        this.f26606l = xN;
        this.f26608n++;
        I();
        return xN;
    }

    public X m() {
        return this.f26606l;
    }

    public Y s(long j10, q0 q0Var) {
        X x10 = this.f26606l;
        return x10 == null ? i(q0Var) : k(q0Var.f27445a, x10, j10);
    }

    public X t() {
        return this.f26604j;
    }

    public X u(androidx.media3.exoplayer.source.q qVar) {
        for (int i10 = 0; i10 < this.f26611q.size(); i10++) {
            X x10 = this.f26611q.get(i10);
            if (x10.f26560a == qVar) {
                return x10;
            }
        }
        return null;
    }

    public X v() {
        return this.f26607m;
    }

    public X w() {
        return this.f26605k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.exoplayer.Y x(U1.G r19, androidx.media3.exoplayer.Y r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.media3.exoplayer.source.r$b r3 = r2.f26577a
            boolean r12 = r0.A(r3)
            boolean r13 = r0.C(r1, r3)
            boolean r14 = r0.B(r1, r3, r12)
            androidx.media3.exoplayer.source.r$b r4 = r2.f26577a
            java.lang.Object r4 = r4.f27812a
            U1.G$b r5 = r0.f26595a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f27816e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            U1.G$b r7 = r0.f26595a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            U1.G$b r1 = r0.f26595a
            int r4 = r3.f27813b
            int r5 = r3.f27814c
            long r4 = r1.b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            U1.G$b r1 = r0.f26595a
            long r4 = r1.j()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            U1.G$b r1 = r0.f26595a
            int r4 = r3.f27813b
            boolean r1 = r1.r(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f27816e
            if (r1 == r6) goto L7a
            U1.G$b r4 = r0.f26595a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            androidx.media3.exoplayer.Y r15 = new androidx.media3.exoplayer.Y
            long r4 = r2.f26578b
            long r1 = r2.f26579c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.a0.x(U1.G, androidx.media3.exoplayer.Y):androidx.media3.exoplayer.Y");
    }

    public void z(U1.G g10) {
        X x10;
        if (this.f26603i.f26359a == -9223372036854775807L || (x10 = this.f26606l) == null) {
            L();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairH = h(g10, x10.f26567h.f26577a.f27812a, 0L);
        if (pairH != null && !g10.n(g10.h(pairH.first, this.f26595a).f16823c, this.f26596b).f()) {
            long jR = R(pairH.first);
            if (jR == -1) {
                jR = this.f26600f;
                this.f26600f = 1 + jR;
            }
            Y yQ = q(g10, pairH.first, ((Long) pairH.second).longValue(), jR);
            X xN = N(yQ);
            if (xN == null) {
                xN = this.f26599e.a(yQ, (x10.m() + x10.f26567h.f26581e) - yQ.f26578b);
            }
            arrayList.add(xN);
        }
        K(arrayList);
    }
}
