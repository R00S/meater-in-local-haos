package p353j;

import kotlin.jvm.internal.C9801m;

/* compiled from: PeekSource.kt */
/* renamed from: j.v */
/* loaded from: classes3.dex */
public final class C9723v implements InterfaceC9700d0 {

    /* renamed from: f */
    private final C9703f f37077f;

    /* renamed from: g */
    private C9726y f37078g;

    /* renamed from: h */
    private int f37079h;

    /* renamed from: i */
    private boolean f37080i;

    /* renamed from: j */
    private long f37081j;

    /* renamed from: k */
    private final InterfaceC9709h f37082k;

    public C9723v(InterfaceC9709h interfaceC9709h) {
        C9801m.m32346f(interfaceC9709h, "upstream");
        this.f37082k = interfaceC9709h;
        C9703f c9703fMo32042i = interfaceC9709h.mo32042i();
        this.f37077f = c9703fMo32042i;
        C9726y c9726y = c9703fMo32042i.f37038f;
        this.f37078g = c9726y;
        this.f37079h = c9726y != null ? c9726y.f37092c : -1;
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37080i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // p353j.InterfaceC9700d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(p353j.C9703f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C9801m.m32346f(r9, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L89
            boolean r4 = r8.f37080i
            r4 = r4 ^ r1
            if (r4 == 0) goto L7d
            j.y r4 = r8.f37078g
            if (r4 == 0) goto L2a
            j.f r5 = r8.f37077f
            j.y r5 = r5.f37038f
            if (r4 != r5) goto L2b
            int r4 = r8.f37079h
            kotlin.jvm.internal.C9801m.m32343c(r5)
            int r5 = r5.f37092c
            if (r4 != r5) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L71
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L32
            return r2
        L32:
            j.h r0 = r8.f37082k
            long r1 = r8.f37081j
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L42
            r9 = -1
            return r9
        L42:
            j.y r0 = r8.f37078g
            if (r0 != 0) goto L55
            j.f r0 = r8.f37077f
            j.y r0 = r0.f37038f
            if (r0 == 0) goto L55
            r8.f37078g = r0
            kotlin.jvm.internal.C9801m.m32343c(r0)
            int r0 = r0.f37092c
            r8.f37079h = r0
        L55:
            j.f r0 = r8.f37077f
            long r0 = r0.size()
            long r2 = r8.f37081j
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            j.f r2 = r8.f37077f
            long r4 = r8.f37081j
            r3 = r9
            r6 = r10
            r2.m32044j(r3, r4, r6)
            long r0 = r8.f37081j
            long r0 = r0 + r10
            r8.f37081j = r0
            return r10
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L89:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9723v.read(j.f, long):long");
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.f37082k.timeout();
    }
}
