package n2;

import U1.G;
import U1.v;
import X1.C1804a;
import android.net.Uri;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes.dex */
public final class u extends G {

    /* renamed from: r, reason: collision with root package name */
    private static final Object f45659r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final U1.v f45660s = new v.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    private final long f45661e;

    /* renamed from: f, reason: collision with root package name */
    private final long f45662f;

    /* renamed from: g, reason: collision with root package name */
    private final long f45663g;

    /* renamed from: h, reason: collision with root package name */
    private final long f45664h;

    /* renamed from: i, reason: collision with root package name */
    private final long f45665i;

    /* renamed from: j, reason: collision with root package name */
    private final long f45666j;

    /* renamed from: k, reason: collision with root package name */
    private final long f45667k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f45668l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f45669m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f45670n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f45671o;

    /* renamed from: p, reason: collision with root package name */
    private final U1.v f45672p;

    /* renamed from: q, reason: collision with root package name */
    private final v.g f45673q;

    public u(long j10, boolean z10, boolean z11, boolean z12, Object obj, U1.v vVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, vVar);
    }

    @Override // U1.G
    public int b(Object obj) {
        return f45659r.equals(obj) ? 0 : -1;
    }

    @Override // U1.G
    public G.b g(int i10, G.b bVar, boolean z10) {
        C1804a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f45659r : null, 0, this.f45664h, -this.f45666j);
    }

    @Override // U1.G
    public int i() {
        return 1;
    }

    @Override // U1.G
    public Object m(int i10) {
        C1804a.c(i10, 0, 1);
        return f45659r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // U1.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public U1.G.c o(int r25, U1.G.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            X1.C1804a.c(r3, r1, r2)
            long r1 = r0.f45667k
            boolean r14 = r0.f45669m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f45670n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f45665i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = U1.G.c.f16834q
            U1.v r5 = r0.f45672p
            java.lang.Object r6 = r0.f45671o
            long r7 = r0.f45661e
            long r9 = r0.f45662f
            long r11 = r0.f45663g
            boolean r13 = r0.f45668l
            U1.v$g r15 = r0.f45673q
            long r1 = r0.f45665i
            r18 = r1
            r21 = 0
            long r1 = r0.f45666j
            r22 = r1
            r20 = 0
            r3 = r26
            U1.G$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.u.o(int, U1.G$c, long):U1.G$c");
    }

    @Override // U1.G
    public int p() {
        return 1;
    }

    public u(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, U1.v vVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, vVar, z12 ? vVar.f17236d : null);
    }

    public u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, U1.v vVar, v.g gVar) {
        this.f45661e = j10;
        this.f45662f = j11;
        this.f45663g = j12;
        this.f45664h = j13;
        this.f45665i = j14;
        this.f45666j = j15;
        this.f45667k = j16;
        this.f45668l = z10;
        this.f45669m = z11;
        this.f45670n = z12;
        this.f45671o = obj;
        this.f45672p = (U1.v) C1804a.e(vVar);
        this.f45673q = gVar;
    }
}
