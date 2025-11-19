package androidx.media3.exoplayer.source;

import U1.C1738n;
import U1.InterfaceC1734j;
import X1.C1804a;
import X1.InterfaceC1811h;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.F;
import d2.C3025C;
import v2.O;

/* compiled from: SampleQueue.java */
/* loaded from: classes.dex */
public class F implements O {

    /* renamed from: A, reason: collision with root package name */
    private U1.s f27607A;

    /* renamed from: B, reason: collision with root package name */
    private U1.s f27608B;

    /* renamed from: C, reason: collision with root package name */
    private long f27609C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27611E;

    /* renamed from: F, reason: collision with root package name */
    private long f27612F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f27613G;

    /* renamed from: a, reason: collision with root package name */
    private final D f27614a;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f27617d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a f27618e;

    /* renamed from: f, reason: collision with root package name */
    private d f27619f;

    /* renamed from: g, reason: collision with root package name */
    private U1.s f27620g;

    /* renamed from: h, reason: collision with root package name */
    private DrmSession f27621h;

    /* renamed from: p, reason: collision with root package name */
    private int f27629p;

    /* renamed from: q, reason: collision with root package name */
    private int f27630q;

    /* renamed from: r, reason: collision with root package name */
    private int f27631r;

    /* renamed from: s, reason: collision with root package name */
    private int f27632s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27636w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f27639z;

    /* renamed from: b, reason: collision with root package name */
    private final b f27615b = new b();

    /* renamed from: i, reason: collision with root package name */
    private int f27622i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private long[] f27623j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f27624k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f27627n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f27626m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f27625l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private O.a[] f27628o = new O.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final J<c> f27616c = new J<>(new InterfaceC1811h() { // from class: androidx.media3.exoplayer.source.E
        @Override // X1.InterfaceC1811h
        public final void accept(Object obj) {
            F.M((F.c) obj);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private long f27633t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f27634u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f27635v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f27638y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27637x = true;

    /* renamed from: D, reason: collision with root package name */
    private boolean f27610D = true;

    /* compiled from: SampleQueue.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f27640a;

        /* renamed from: b, reason: collision with root package name */
        public long f27641b;

        /* renamed from: c, reason: collision with root package name */
        public O.a f27642c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SampleQueue.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final U1.s f27643a;

        /* renamed from: b, reason: collision with root package name */
        public final i.b f27644b;

        private c(U1.s sVar, i.b bVar) {
            this.f27643a = sVar;
            this.f27644b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    public interface d {
        void p(U1.s sVar);
    }

    protected F(r2.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        this.f27617d = iVar;
        this.f27618e = aVar;
        this.f27614a = new D(bVar);
    }

    private long C(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iE = E(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f27627n[iE]);
            if ((this.f27626m[iE] & 1) != 0) {
                break;
            }
            iE--;
            if (iE == -1) {
                iE = this.f27622i - 1;
            }
        }
        return jMax;
    }

    private int E(int i10) {
        int i11 = this.f27631r + i10;
        int i12 = this.f27622i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean I() {
        return this.f27632s != this.f27629p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(c cVar) {
        cVar.f27644b.c();
    }

    private boolean N(int i10) {
        DrmSession drmSession = this.f27621h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f27626m[i10] & 1073741824) == 0 && this.f27621h.c());
    }

    private void P(U1.s sVar, C3025C c3025c) {
        U1.s sVar2 = this.f27620g;
        boolean z10 = sVar2 == null;
        C1738n c1738n = sVar2 == null ? null : sVar2.f17166s;
        this.f27620g = sVar;
        C1738n c1738n2 = sVar.f17166s;
        androidx.media3.exoplayer.drm.i iVar = this.f27617d;
        c3025c.f39668b = iVar != null ? sVar.c(iVar.d(sVar)) : sVar;
        c3025c.f39667a = this.f27621h;
        if (this.f27617d == null) {
            return;
        }
        if (z10 || !X1.L.d(c1738n, c1738n2)) {
            DrmSession drmSession = this.f27621h;
            DrmSession drmSessionA = this.f27617d.a(this.f27618e, sVar);
            this.f27621h = drmSessionA;
            c3025c.f39667a = drmSessionA;
            if (drmSession != null) {
                drmSession.e(this.f27618e);
            }
        }
    }

    private synchronized int Q(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        try {
            decoderInputBuffer.f26294F = false;
            if (!I()) {
                if (!z11 && !this.f27636w) {
                    U1.s sVar = this.f27608B;
                    if (sVar == null || (!z10 && sVar == this.f27620g)) {
                        return -3;
                    }
                    P((U1.s) C1804a.e(sVar), c3025c);
                    return -5;
                }
                decoderInputBuffer.B(4);
                decoderInputBuffer.f26295G = Long.MIN_VALUE;
                return -4;
            }
            U1.s sVar2 = this.f27616c.e(D()).f27643a;
            if (!z10 && sVar2 == this.f27620g) {
                int iE = E(this.f27632s);
                if (!N(iE)) {
                    decoderInputBuffer.f26294F = true;
                    return -3;
                }
                decoderInputBuffer.B(this.f27626m[iE]);
                if (this.f27632s == this.f27629p - 1 && (z11 || this.f27636w)) {
                    decoderInputBuffer.s(536870912);
                }
                decoderInputBuffer.f26295G = this.f27627n[iE];
                bVar.f27640a = this.f27625l[iE];
                bVar.f27641b = this.f27624k[iE];
                bVar.f27642c = this.f27628o[iE];
                return -4;
            }
            P(sVar2, c3025c);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void U() {
        DrmSession drmSession = this.f27621h;
        if (drmSession != null) {
            drmSession.e(this.f27618e);
            this.f27621h = null;
            this.f27620g = null;
        }
    }

    private synchronized void X() {
        this.f27632s = 0;
        this.f27614a.o();
    }

    private synchronized boolean c0(U1.s sVar) {
        try {
            this.f27638y = false;
            if (X1.L.d(sVar, this.f27608B)) {
                return false;
            }
            if (this.f27616c.g() || !this.f27616c.f().f27643a.equals(sVar)) {
                this.f27608B = sVar;
            } else {
                this.f27608B = this.f27616c.f().f27643a;
            }
            boolean z10 = this.f27610D;
            U1.s sVar2 = this.f27608B;
            this.f27610D = z10 & U1.z.a(sVar2.f17162o, sVar2.f17158k);
            this.f27611E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean h(long j10) {
        if (this.f27629p == 0) {
            return j10 > this.f27634u;
        }
        if (B() >= j10) {
            return false;
        }
        t(this.f27630q + j(j10));
        return true;
    }

    private synchronized void i(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f27629p;
            if (i12 > 0) {
                int iE = E(i12 - 1);
                C1804a.a(this.f27624k[iE] + ((long) this.f27625l[iE]) <= j11);
            }
            this.f27636w = (536870912 & i10) != 0;
            this.f27635v = Math.max(this.f27635v, j10);
            int iE2 = E(this.f27629p);
            this.f27627n[iE2] = j10;
            this.f27624k[iE2] = j11;
            this.f27625l[iE2] = i11;
            this.f27626m[iE2] = i10;
            this.f27628o[iE2] = aVar;
            this.f27623j[iE2] = this.f27609C;
            if (this.f27616c.g() || !this.f27616c.f().f27643a.equals(this.f27608B)) {
                U1.s sVar = (U1.s) C1804a.e(this.f27608B);
                androidx.media3.exoplayer.drm.i iVar = this.f27617d;
                this.f27616c.a(H(), new c(sVar, iVar != null ? iVar.b(this.f27618e, sVar) : i.b.f27130a));
            }
            int i13 = this.f27629p + 1;
            this.f27629p = i13;
            int i14 = this.f27622i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f27631r;
                int i17 = i14 - i16;
                System.arraycopy(this.f27624k, i16, jArr2, 0, i17);
                System.arraycopy(this.f27627n, this.f27631r, jArr3, 0, i17);
                System.arraycopy(this.f27626m, this.f27631r, iArr, 0, i17);
                System.arraycopy(this.f27625l, this.f27631r, iArr2, 0, i17);
                System.arraycopy(this.f27628o, this.f27631r, aVarArr, 0, i17);
                System.arraycopy(this.f27623j, this.f27631r, jArr, 0, i17);
                int i18 = this.f27631r;
                System.arraycopy(this.f27624k, 0, jArr2, i17, i18);
                System.arraycopy(this.f27627n, 0, jArr3, i17, i18);
                System.arraycopy(this.f27626m, 0, iArr, i17, i18);
                System.arraycopy(this.f27625l, 0, iArr2, i17, i18);
                System.arraycopy(this.f27628o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f27623j, 0, jArr, i17, i18);
                this.f27624k = jArr2;
                this.f27627n = jArr3;
                this.f27626m = iArr;
                this.f27625l = iArr2;
                this.f27628o = aVarArr;
                this.f27623j = jArr;
                this.f27631r = 0;
                this.f27622i = i15;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int j(long j10) {
        int i10 = this.f27629p;
        int iE = E(i10 - 1);
        while (i10 > this.f27632s && this.f27627n[iE] >= j10) {
            i10--;
            iE--;
            if (iE == -1) {
                iE = this.f27622i - 1;
            }
        }
        return i10;
    }

    public static F k(r2.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        return new F(bVar, (androidx.media3.exoplayer.drm.i) C1804a.e(iVar), (h.a) C1804a.e(aVar));
    }

    public static F l(r2.b bVar) {
        return new F(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        try {
            int i11 = this.f27629p;
            if (i11 != 0) {
                long[] jArr = this.f27627n;
                int i12 = this.f27631r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f27632s) != i11) {
                        i11 = i10 + 1;
                    }
                    int iW = w(i12, i11, j10, z10);
                    if (iW == -1) {
                        return -1L;
                    }
                    return p(iW);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long n() {
        int i10 = this.f27629p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f27634u = Math.max(this.f27634u, C(i10));
        this.f27629p -= i10;
        int i11 = this.f27630q + i10;
        this.f27630q = i11;
        int i12 = this.f27631r + i10;
        this.f27631r = i12;
        int i13 = this.f27622i;
        if (i12 >= i13) {
            this.f27631r = i12 - i13;
        }
        int i14 = this.f27632s - i10;
        this.f27632s = i14;
        if (i14 < 0) {
            this.f27632s = 0;
        }
        this.f27616c.d(i11);
        if (this.f27629p != 0) {
            return this.f27624k[this.f27631r];
        }
        int i15 = this.f27631r;
        if (i15 == 0) {
            i15 = this.f27622i;
        }
        return this.f27624k[i15 - 1] + this.f27625l[r6];
    }

    private long t(int i10) {
        int iH = H() - i10;
        boolean z10 = false;
        C1804a.a(iH >= 0 && iH <= this.f27629p - this.f27632s);
        int i11 = this.f27629p - iH;
        this.f27629p = i11;
        this.f27635v = Math.max(this.f27634u, C(i11));
        if (iH == 0 && this.f27636w) {
            z10 = true;
        }
        this.f27636w = z10;
        this.f27616c.c(i10);
        int i12 = this.f27629p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f27624k[E(i12 - 1)] + this.f27625l[r9];
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f27627n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f27622i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int w(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f27627n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f27626m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f27622i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return this.f27635v;
    }

    public final synchronized long B() {
        return Math.max(this.f27634u, C(this.f27632s));
    }

    public final int D() {
        return this.f27630q + this.f27632s;
    }

    public final synchronized int F(long j10, boolean z10) {
        int iE = E(this.f27632s);
        if (I() && j10 >= this.f27627n[iE]) {
            if (j10 > this.f27635v && z10) {
                return this.f27629p - this.f27632s;
            }
            int iW = w(iE, this.f27629p - this.f27632s, j10, true);
            if (iW == -1) {
                return 0;
            }
            return iW;
        }
        return 0;
    }

    public final synchronized U1.s G() {
        return this.f27638y ? null : this.f27608B;
    }

    public final int H() {
        return this.f27630q + this.f27629p;
    }

    protected final void J() {
        this.f27639z = true;
    }

    public final synchronized boolean K() {
        return this.f27636w;
    }

    public synchronized boolean L(boolean z10) {
        U1.s sVar;
        boolean z11 = true;
        if (I()) {
            if (this.f27616c.e(D()).f27643a != this.f27620g) {
                return true;
            }
            return N(E(this.f27632s));
        }
        if (!z10 && !this.f27636w && ((sVar = this.f27608B) == null || sVar == this.f27620g)) {
            z11 = false;
        }
        return z11;
    }

    public void O() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f27621h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) C1804a.e(this.f27621h.h()));
        }
    }

    public void R() {
        r();
        U();
    }

    public int S(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iQ = Q(c3025c, decoderInputBuffer, (i10 & 2) != 0, z10, this.f27615b);
        if (iQ == -4 && !decoderInputBuffer.w()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f27614a.f(decoderInputBuffer, this.f27615b);
                } else {
                    this.f27614a.m(decoderInputBuffer, this.f27615b);
                }
            }
            if (!z11) {
                this.f27632s++;
            }
        }
        return iQ;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f27614a.n();
        this.f27629p = 0;
        this.f27630q = 0;
        this.f27631r = 0;
        this.f27632s = 0;
        this.f27637x = true;
        this.f27633t = Long.MIN_VALUE;
        this.f27634u = Long.MIN_VALUE;
        this.f27635v = Long.MIN_VALUE;
        this.f27636w = false;
        this.f27616c.b();
        if (z10) {
            this.f27607A = null;
            this.f27608B = null;
            this.f27638y = true;
            this.f27610D = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        X();
        int i11 = this.f27630q;
        if (i10 >= i11 && i10 <= this.f27629p + i11) {
            this.f27633t = Long.MIN_VALUE;
            this.f27632s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j10, boolean z10) {
        try {
            X();
            int iE = E(this.f27632s);
            if (I() && j10 >= this.f27627n[iE] && (j10 <= this.f27635v || z10)) {
                int iV = this.f27610D ? v(iE, this.f27629p - this.f27632s, j10, z10) : w(iE, this.f27629p - this.f27632s, j10, true);
                if (iV == -1) {
                    return false;
                }
                this.f27633t = j10;
                this.f27632s += iV;
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // v2.O
    public final int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11) {
        return this.f27614a.p(interfaceC1734j, i10, z10);
    }

    public final void a0(long j10) {
        if (this.f27612F != j10) {
            this.f27612F = j10;
            J();
        }
    }

    @Override // v2.O
    public final void b(X1.y yVar, int i10, int i11) {
        this.f27614a.q(yVar, i10);
    }

    public final void b0(long j10) {
        this.f27633t = j10;
    }

    public final void d0(d dVar) {
        this.f27619f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // v2.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(long r12, int r14, int r15, int r16, v2.O.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f27639z
            if (r0 == 0) goto L10
            U1.s r0 = r8.f27607A
            java.lang.Object r0 = X1.C1804a.i(r0)
            U1.s r0 = (U1.s) r0
            r11.f(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f27637x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f27637x = r1
        L22:
            long r4 = r8.f27612F
            long r4 = r4 + r12
            boolean r6 = r8.f27610D
            if (r6 == 0) goto L54
            long r6 = r8.f27633t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f27611E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            U1.s r6 = r8.f27608B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            X1.n.h(r6, r0)
            r8.f27611E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f27613G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f27613G = r1
            goto L66
        L65:
            return
        L66:
            androidx.media3.exoplayer.source.D r0 = r8.f27614a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.F.e(long, int, int, int, v2.O$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f27632s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f27629p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            X1.C1804a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f27632s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f27632s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.F.e0(int):void");
    }

    @Override // v2.O
    public final void f(U1.s sVar) {
        U1.s sVarX = x(sVar);
        this.f27639z = false;
        this.f27607A = sVar;
        boolean zC0 = c0(sVarX);
        d dVar = this.f27619f;
        if (dVar == null || !zC0) {
            return;
        }
        dVar.p(sVarX);
    }

    public synchronized long o() {
        int i10 = this.f27632s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f27614a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f27614a.b(n());
    }

    public final void s() {
        this.f27614a.b(o());
    }

    public final void u(int i10) {
        this.f27614a.c(t(i10));
    }

    protected U1.s x(U1.s sVar) {
        return (this.f27612F == 0 || sVar.f17167t == Long.MAX_VALUE) ? sVar : sVar.b().w0(sVar.f17167t + this.f27612F).M();
    }

    public final int y() {
        return this.f27630q;
    }

    public final synchronized long z() {
        return this.f27629p == 0 ? Long.MIN_VALUE : this.f27627n[this.f27631r];
    }
}
