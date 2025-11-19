package b3;

import X1.C1804a;
import b3.L;
import java.util.Arrays;
import v2.O;

/* compiled from: H262Reader.java */
/* renamed from: b3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2225n implements InterfaceC2224m {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f30304q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f30305a;

    /* renamed from: b, reason: collision with root package name */
    private O f30306b;

    /* renamed from: c, reason: collision with root package name */
    private final N f30307c;

    /* renamed from: d, reason: collision with root package name */
    private final X1.y f30308d;

    /* renamed from: e, reason: collision with root package name */
    private final w f30309e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f30310f;

    /* renamed from: g, reason: collision with root package name */
    private final a f30311g;

    /* renamed from: h, reason: collision with root package name */
    private long f30312h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30313i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30314j;

    /* renamed from: k, reason: collision with root package name */
    private long f30315k;

    /* renamed from: l, reason: collision with root package name */
    private long f30316l;

    /* renamed from: m, reason: collision with root package name */
    private long f30317m;

    /* renamed from: n, reason: collision with root package name */
    private long f30318n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30319o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30320p;

    /* compiled from: H262Reader.java */
    /* renamed from: b3.n$a */
    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f30321e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f30322a;

        /* renamed from: b, reason: collision with root package name */
        public int f30323b;

        /* renamed from: c, reason: collision with root package name */
        public int f30324c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f30325d;

        public a(int i10) {
            this.f30325d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f30322a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f30325d;
                int length = bArr2.length;
                int i13 = this.f30323b;
                if (length < i13 + i12) {
                    this.f30325d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f30325d, this.f30323b, i12);
                this.f30323b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f30322a) {
                int i12 = this.f30323b - i11;
                this.f30323b = i12;
                if (this.f30324c != 0 || i10 != 181) {
                    this.f30322a = false;
                    return true;
                }
                this.f30324c = i12;
            } else if (i10 == 179) {
                this.f30322a = true;
            }
            byte[] bArr = f30321e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f30322a = false;
            this.f30323b = 0;
            this.f30324c = 0;
        }
    }

    public C2225n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<U1.s, java.lang.Long> f(b3.C2225n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f30325d
            int r1 = r8.f30323b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            U1.s$b r6 = new U1.s$b
            r6.<init>()
            U1.s$b r9 = r6.e0(r9)
            java.lang.String r6 = "video/mpeg2"
            U1.s$b r9 = r9.s0(r6)
            U1.s$b r9 = r9.z0(r2)
            U1.s$b r9 = r9.c0(r4)
            U1.s$b r9 = r9.o0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            U1.s$b r9 = r9.f0(r1)
            U1.s r9 = r9.M()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = b3.C2225n.f30304q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f30324c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C2225n.f(b3.n$a, java.lang.String):android.util.Pair");
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        Y1.e.c(this.f30310f);
        this.f30311g.c();
        w wVar = this.f30309e;
        if (wVar != null) {
            wVar.d();
        }
        this.f30312h = 0L;
        this.f30313i = false;
        this.f30316l = -9223372036854775807L;
        this.f30318n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // b3.InterfaceC2224m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(X1.y r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C2225n.b(X1.y):void");
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        C1804a.i(this.f30306b);
        if (z10) {
            boolean z11 = this.f30319o;
            this.f30306b.e(this.f30318n, z11 ? 1 : 0, (int) (this.f30312h - this.f30317m), 0, null);
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30305a = dVar.b();
        this.f30306b = rVar.a(dVar.c(), 2);
        N n10 = this.f30307c;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30316l = j10;
    }

    C2225n(N n10) {
        this.f30307c = n10;
        this.f30310f = new boolean[4];
        this.f30311g = new a(128);
        if (n10 != null) {
            this.f30309e = new w(178, 128);
            this.f30308d = new X1.y();
        } else {
            this.f30309e = null;
            this.f30308d = null;
        }
        this.f30316l = -9223372036854775807L;
        this.f30318n = -9223372036854775807L;
    }
}
