package c3;

import U1.s;
import X1.C1804a;
import X1.L;
import X1.n;
import X1.y;
import android.util.Pair;
import androidx.media3.common.ParserException;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.O;
import v2.T;
import v2.r;
import v2.u;

/* compiled from: WavExtractor.java */
/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310b implements InterfaceC4810p {

    /* renamed from: h, reason: collision with root package name */
    public static final u f30953h = new u() { // from class: c3.a
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C2310b.g();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f30954a;

    /* renamed from: b, reason: collision with root package name */
    private O f30955b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0432b f30958e;

    /* renamed from: c, reason: collision with root package name */
    private int f30956c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f30957d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f30959f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f30960g = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: c3.b$a */
    private static final class a implements InterfaceC0432b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f30961m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f30962n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final r f30963a;

        /* renamed from: b, reason: collision with root package name */
        private final O f30964b;

        /* renamed from: c, reason: collision with root package name */
        private final C2311c f30965c;

        /* renamed from: d, reason: collision with root package name */
        private final int f30966d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f30967e;

        /* renamed from: f, reason: collision with root package name */
        private final y f30968f;

        /* renamed from: g, reason: collision with root package name */
        private final int f30969g;

        /* renamed from: h, reason: collision with root package name */
        private final s f30970h;

        /* renamed from: i, reason: collision with root package name */
        private int f30971i;

        /* renamed from: j, reason: collision with root package name */
        private long f30972j;

        /* renamed from: k, reason: collision with root package name */
        private int f30973k;

        /* renamed from: l, reason: collision with root package name */
        private long f30974l;

        public a(r rVar, O o10, C2311c c2311c) throws ParserException {
            this.f30963a = rVar;
            this.f30964b = o10;
            this.f30965c = c2311c;
            int iMax = Math.max(1, c2311c.f30985c / 10);
            this.f30969g = iMax;
            y yVar = new y(c2311c.f30989g);
            yVar.z();
            int iZ = yVar.z();
            this.f30966d = iZ;
            int i10 = c2311c.f30984b;
            int i11 = (((c2311c.f30987e - (i10 * 4)) * 8) / (c2311c.f30988f * i10)) + 1;
            if (iZ == i11) {
                int iK = L.k(iMax, iZ);
                this.f30967e = new byte[c2311c.f30987e * iK];
                this.f30968f = new y(iK * h(iZ, i10));
                int i12 = ((c2311c.f30985c * c2311c.f30987e) * 8) / iZ;
                this.f30970h = new s.b().s0("audio/raw").P(i12).n0(i12).j0(h(iMax, i10)).Q(c2311c.f30984b).t0(c2311c.f30985c).m0(2).M();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }

        private void d(byte[] bArr, int i10, y yVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f30965c.f30984b; i12++) {
                    e(bArr, i11, i12, yVar.e());
                }
            }
            int iG = g(this.f30966d * i10);
            yVar.W(0);
            yVar.V(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C2311c c2311c = this.f30965c;
            int i12 = c2311c.f30987e;
            int i13 = c2311c.f30984b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iP = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f30962n[iMin];
            int i18 = ((i10 * this.f30966d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iP & 255);
            bArr2[i18 + 1] = (byte) (iP >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iP = L.p(iP + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iP & 255);
                bArr2[i18 + 1] = (byte) (iP >> 8);
                int i22 = iMin + f30961m[i20];
                int[] iArr = f30962n;
                iMin = L.p(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f30965c.f30984b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f30965c.f30984b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jD1 = this.f30972j + L.d1(this.f30974l, 1000000L, this.f30965c.f30985c);
            int iG = g(i10);
            this.f30964b.e(jD1, 1, iG, this.f30973k - iG, null);
            this.f30974l += i10;
            this.f30973k -= iG;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // c3.C2310b.InterfaceC0432b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(v2.InterfaceC4811q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f30969g
                int r1 = r6.f30973k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f30966d
                int r0 = X1.L.k(r0, r1)
                c3.c r1 = r6.f30965c
                int r1 = r1.f30987e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f30971i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f30967e
                int r5 = r6.f30971i
                int r3 = r7.e(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f30971i
                int r4 = r4 + r3
                r6.f30971i = r4
                goto L1e
            L3e:
                int r7 = r6.f30971i
                c3.c r8 = r6.f30965c
                int r8 = r8.f30987e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f30967e
                X1.y r9 = r6.f30968f
                r6.d(r8, r7, r9)
                int r8 = r6.f30971i
                c3.c r9 = r6.f30965c
                int r9 = r9.f30987e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f30971i = r8
                X1.y r7 = r6.f30968f
                int r7 = r7.g()
                v2.O r8 = r6.f30964b
                X1.y r9 = r6.f30968f
                r8.d(r9, r7)
                int r8 = r6.f30973k
                int r8 = r8 + r7
                r6.f30973k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f30969g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f30973k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.C2310b.a.a(v2.q, long):boolean");
        }

        @Override // c3.C2310b.InterfaceC0432b
        public void b(long j10) {
            this.f30971i = 0;
            this.f30972j = j10;
            this.f30973k = 0;
            this.f30974l = 0L;
        }

        @Override // c3.C2310b.InterfaceC0432b
        public void c(int i10, long j10) {
            this.f30963a.f(new e(this.f30965c, this.f30966d, i10, j10));
            this.f30964b.f(this.f30970h);
        }
    }

    /* compiled from: WavExtractor.java */
    /* renamed from: c3.b$b, reason: collision with other inner class name */
    private interface InterfaceC0432b {
        boolean a(InterfaceC4811q interfaceC4811q, long j10);

        void b(long j10);

        void c(int i10, long j10);
    }

    /* compiled from: WavExtractor.java */
    /* renamed from: c3.b$c */
    private static final class c implements InterfaceC0432b {

        /* renamed from: a, reason: collision with root package name */
        private final r f30975a;

        /* renamed from: b, reason: collision with root package name */
        private final O f30976b;

        /* renamed from: c, reason: collision with root package name */
        private final C2311c f30977c;

        /* renamed from: d, reason: collision with root package name */
        private final s f30978d;

        /* renamed from: e, reason: collision with root package name */
        private final int f30979e;

        /* renamed from: f, reason: collision with root package name */
        private long f30980f;

        /* renamed from: g, reason: collision with root package name */
        private int f30981g;

        /* renamed from: h, reason: collision with root package name */
        private long f30982h;

        public c(r rVar, O o10, C2311c c2311c, String str, int i10) throws ParserException {
            this.f30975a = rVar;
            this.f30976b = o10;
            this.f30977c = c2311c;
            int i11 = (c2311c.f30984b * c2311c.f30988f) / 8;
            if (c2311c.f30987e == i11) {
                int i12 = c2311c.f30985c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f30979e = iMax;
                this.f30978d = new s.b().s0(str).P(i13).n0(i13).j0(iMax).Q(c2311c.f30984b).t0(c2311c.f30985c).m0(i10).M();
                return;
            }
            throw ParserException.a("Expected block size: " + i11 + "; got: " + c2311c.f30987e, null);
        }

        @Override // c3.C2310b.InterfaceC0432b
        public boolean a(InterfaceC4811q interfaceC4811q, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f30981g) < (i11 = this.f30979e)) {
                int iC = this.f30976b.c(interfaceC4811q, (int) Math.min(i11 - i10, j11), true);
                if (iC == -1) {
                    j11 = 0;
                } else {
                    this.f30981g += iC;
                    j11 -= iC;
                }
            }
            int i12 = this.f30977c.f30987e;
            int i13 = this.f30981g / i12;
            if (i13 > 0) {
                long jD1 = this.f30980f + L.d1(this.f30982h, 1000000L, r1.f30985c);
                int i14 = i13 * i12;
                int i15 = this.f30981g - i14;
                this.f30976b.e(jD1, 1, i14, i15, null);
                this.f30982h += i13;
                this.f30981g = i15;
            }
            return j11 <= 0;
        }

        @Override // c3.C2310b.InterfaceC0432b
        public void b(long j10) {
            this.f30980f = j10;
            this.f30981g = 0;
            this.f30982h = 0L;
        }

        @Override // c3.C2310b.InterfaceC0432b
        public void c(int i10, long j10) {
            this.f30975a.f(new e(this.f30977c, 1, i10, j10));
            this.f30976b.f(this.f30978d);
        }
    }

    private void f() {
        C1804a.i(this.f30955b);
        L.i(this.f30954a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] g() {
        return new InterfaceC4810p[]{new C2310b()};
    }

    private void k(InterfaceC4811q interfaceC4811q) throws ParserException {
        C1804a.g(interfaceC4811q.getPosition() == 0);
        int i10 = this.f30959f;
        if (i10 != -1) {
            interfaceC4811q.n(i10);
            this.f30956c = 4;
        } else {
            if (!d.a(interfaceC4811q)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC4811q.n((int) (interfaceC4811q.i() - interfaceC4811q.getPosition()));
            this.f30956c = 1;
        }
    }

    private void l(InterfaceC4811q interfaceC4811q) throws ParserException {
        C2311c c2311cB = d.b(interfaceC4811q);
        int i10 = c2311cB.f30983a;
        if (i10 == 17) {
            this.f30958e = new a(this.f30954a, this.f30955b, c2311cB);
        } else if (i10 == 6) {
            this.f30958e = new c(this.f30954a, this.f30955b, c2311cB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f30958e = new c(this.f30954a, this.f30955b, c2311cB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, c2311cB.f30988f);
            if (iA == 0) {
                throw ParserException.d("Unsupported WAV format type: " + c2311cB.f30983a);
            }
            this.f30958e = new c(this.f30954a, this.f30955b, c2311cB, "audio/raw", iA);
        }
        this.f30956c = 3;
    }

    private void m(InterfaceC4811q interfaceC4811q) {
        this.f30957d = d.c(interfaceC4811q);
        this.f30956c = 2;
    }

    private int n(InterfaceC4811q interfaceC4811q) {
        C1804a.g(this.f30960g != -1);
        return ((InterfaceC0432b) C1804a.e(this.f30958e)).a(interfaceC4811q, this.f30960g - interfaceC4811q.getPosition()) ? -1 : 0;
    }

    private void o(InterfaceC4811q interfaceC4811q) throws ParserException {
        Pair<Long, Long> pairE = d.e(interfaceC4811q);
        this.f30959f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f30957d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f30960g = this.f30959f + jLongValue;
        long jA = interfaceC4811q.a();
        if (jA != -1 && this.f30960g > jA) {
            n.h("WavExtractor", "Data exceeds input length: " + this.f30960g + ", " + jA);
            this.f30960g = jA;
        }
        ((InterfaceC0432b) C1804a.e(this.f30958e)).c(this.f30959f, this.f30960g);
        this.f30956c = 4;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f30956c = j10 == 0 ? 0 : 4;
        InterfaceC0432b interfaceC0432b = this.f30958e;
        if (interfaceC0432b != null) {
            interfaceC0432b.b(j11);
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        return d.a(interfaceC4811q);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f30954a = rVar;
        this.f30955b = rVar.a(0, 1);
        rVar.n();
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        f();
        int i11 = this.f30956c;
        if (i11 == 0) {
            k(interfaceC4811q);
            return 0;
        }
        if (i11 == 1) {
            m(interfaceC4811q);
            return 0;
        }
        if (i11 == 2) {
            l(interfaceC4811q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC4811q);
            return 0;
        }
        if (i11 == 4) {
            return n(interfaceC4811q);
        }
        throw new IllegalStateException();
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
