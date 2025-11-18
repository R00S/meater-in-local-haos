package Q2;

import X1.y;
import androidx.media3.common.ParserException;
import v2.C4812s;
import v2.InterfaceC4811q;

/* compiled from: OggPageHeader.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f14243a;

    /* renamed from: b, reason: collision with root package name */
    public int f14244b;

    /* renamed from: c, reason: collision with root package name */
    public long f14245c;

    /* renamed from: d, reason: collision with root package name */
    public long f14246d;

    /* renamed from: e, reason: collision with root package name */
    public long f14247e;

    /* renamed from: f, reason: collision with root package name */
    public long f14248f;

    /* renamed from: g, reason: collision with root package name */
    public int f14249g;

    /* renamed from: h, reason: collision with root package name */
    public int f14250h;

    /* renamed from: i, reason: collision with root package name */
    public int f14251i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f14252j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final y f14253k = new y(255);

    f() {
    }

    public boolean a(InterfaceC4811q interfaceC4811q, boolean z10) throws ParserException {
        b();
        this.f14253k.S(27);
        if (!C4812s.b(interfaceC4811q, this.f14253k.e(), 0, 27, z10) || this.f14253k.J() != 1332176723) {
            return false;
        }
        int iH = this.f14253k.H();
        this.f14243a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.d("unsupported bit stream revision");
        }
        this.f14244b = this.f14253k.H();
        this.f14245c = this.f14253k.v();
        this.f14246d = this.f14253k.x();
        this.f14247e = this.f14253k.x();
        this.f14248f = this.f14253k.x();
        int iH2 = this.f14253k.H();
        this.f14249g = iH2;
        this.f14250h = iH2 + 27;
        this.f14253k.S(iH2);
        if (!C4812s.b(interfaceC4811q, this.f14253k.e(), 0, this.f14249g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14249g; i10++) {
            this.f14252j[i10] = this.f14253k.H();
            this.f14251i += this.f14252j[i10];
        }
        return true;
    }

    public void b() {
        this.f14243a = 0;
        this.f14244b = 0;
        this.f14245c = 0L;
        this.f14246d = 0L;
        this.f14247e = 0L;
        this.f14248f = 0L;
        this.f14249g = 0;
        this.f14250h = 0;
        this.f14251i = 0;
    }

    public boolean c(InterfaceC4811q interfaceC4811q) {
        return d(interfaceC4811q, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.b(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(v2.InterfaceC4811q r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.i()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            X1.C1804a.a(r0)
            X1.y r0 = r8.f14253k
            r3 = 4
            r0.S(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            X1.y r4 = r8.f14253k
            byte[] r4 = r4.e()
            boolean r4 = v2.C4812s.b(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            X1.y r0 = r8.f14253k
            r0.W(r1)
            X1.y r0 = r8.f14253k
            long r4 = r0.J()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.m()
            return r2
        L4d:
            r9.n(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.b(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.f.d(v2.q, long):boolean");
    }
}
