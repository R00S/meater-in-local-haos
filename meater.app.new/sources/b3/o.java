package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import java.util.Arrays;
import java.util.Collections;
import v2.O;

/* compiled from: H263Reader.java */
/* loaded from: classes.dex */
public final class o implements InterfaceC2224m {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f30326l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final N f30327a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30328b;

    /* renamed from: e, reason: collision with root package name */
    private final w f30331e;

    /* renamed from: f, reason: collision with root package name */
    private b f30332f;

    /* renamed from: g, reason: collision with root package name */
    private long f30333g;

    /* renamed from: h, reason: collision with root package name */
    private String f30334h;

    /* renamed from: i, reason: collision with root package name */
    private O f30335i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30336j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f30329c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f30330d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    private long f30337k = -9223372036854775807L;

    /* compiled from: H263Reader.java */
    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f30338f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f30339a;

        /* renamed from: b, reason: collision with root package name */
        private int f30340b;

        /* renamed from: c, reason: collision with root package name */
        public int f30341c;

        /* renamed from: d, reason: collision with root package name */
        public int f30342d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f30343e;

        public a(int i10) {
            this.f30343e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f30339a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f30343e;
                int length = bArr2.length;
                int i13 = this.f30341c;
                if (length < i13 + i12) {
                    this.f30343e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f30343e, this.f30341c, i12);
                this.f30341c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f30340b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f30341c -= i11;
                                this.f30339a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            X1.n.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f30342d = this.f30341c;
                            this.f30340b = 4;
                        }
                    } else if (i10 > 31) {
                        X1.n.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f30340b = 3;
                    }
                } else if (i10 != 181) {
                    X1.n.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f30340b = 2;
                }
            } else if (i10 == 176) {
                this.f30340b = 1;
                this.f30339a = true;
            }
            byte[] bArr = f30338f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f30339a = false;
            this.f30341c = 0;
            this.f30340b = 0;
        }
    }

    /* compiled from: H263Reader.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final O f30344a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30345b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30346c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30347d;

        /* renamed from: e, reason: collision with root package name */
        private int f30348e;

        /* renamed from: f, reason: collision with root package name */
        private int f30349f;

        /* renamed from: g, reason: collision with root package name */
        private long f30350g;

        /* renamed from: h, reason: collision with root package name */
        private long f30351h;

        public b(O o10) {
            this.f30344a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f30346c) {
                int i12 = this.f30349f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f30349f = i12 + (i11 - i10);
                } else {
                    this.f30347d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f30346c = false;
                }
            }
        }

        public void b(long j10, int i10, boolean z10) {
            C1804a.g(this.f30351h != -9223372036854775807L);
            if (this.f30348e == 182 && z10 && this.f30345b) {
                this.f30344a.e(this.f30351h, this.f30347d ? 1 : 0, (int) (j10 - this.f30350g), i10, null);
            }
            if (this.f30348e != 179) {
                this.f30350g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f30348e = i10;
            this.f30347d = false;
            this.f30345b = i10 == 182 || i10 == 179;
            this.f30346c = i10 == 182;
            this.f30349f = 0;
            this.f30351h = j10;
        }

        public void d() {
            this.f30345b = false;
            this.f30346c = false;
            this.f30347d = false;
            this.f30348e = -1;
        }
    }

    o(N n10) {
        this.f30327a = n10;
        if (n10 != null) {
            this.f30331e = new w(178, 128);
            this.f30328b = new X1.y();
        } else {
            this.f30331e = null;
            this.f30328b = null;
        }
    }

    private static U1.s f(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f30343e, aVar.f30341c);
        X1.x xVar = new X1.x(bArrCopyOf);
        xVar.s(i10);
        xVar.s(4);
        xVar.q();
        xVar.r(8);
        if (xVar.g()) {
            xVar.r(4);
            xVar.r(3);
        }
        int iH = xVar.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = xVar.h(8);
            int iH3 = xVar.h(8);
            if (iH3 == 0) {
                X1.n.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f30326l;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                X1.n.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.g()) {
            xVar.r(2);
            xVar.r(1);
            if (xVar.g()) {
                xVar.r(15);
                xVar.q();
                xVar.r(15);
                xVar.q();
                xVar.r(15);
                xVar.q();
                xVar.r(3);
                xVar.r(11);
                xVar.q();
                xVar.r(15);
                xVar.q();
            }
        }
        if (xVar.h(2) != 0) {
            X1.n.h("H263Reader", "Unhandled video object layer shape");
        }
        xVar.q();
        int iH4 = xVar.h(16);
        xVar.q();
        if (xVar.g()) {
            if (iH4 == 0) {
                X1.n.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xVar.r(i11);
            }
        }
        xVar.q();
        int iH5 = xVar.h(13);
        xVar.q();
        int iH6 = xVar.h(13);
        xVar.q();
        xVar.q();
        return new s.b().e0(str).s0("video/mp4v-es").z0(iH5).c0(iH6).o0(f10).f0(Collections.singletonList(bArrCopyOf)).M();
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        Y1.e.c(this.f30329c);
        this.f30330d.c();
        b bVar = this.f30332f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f30331e;
        if (wVar != null) {
            wVar.d();
        }
        this.f30333g = 0L;
        this.f30337k = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        C1804a.i(this.f30332f);
        C1804a.i(this.f30335i);
        int iF = yVar.f();
        int iG = yVar.g();
        byte[] bArrE = yVar.e();
        this.f30333g += yVar.a();
        this.f30335i.d(yVar, yVar.a());
        while (true) {
            int iE = Y1.e.e(bArrE, iF, iG, this.f30329c);
            if (iE == iG) {
                break;
            }
            int i10 = iE + 3;
            int i11 = yVar.e()[i10] & 255;
            int i12 = iE - iF;
            int i13 = 0;
            if (!this.f30336j) {
                if (i12 > 0) {
                    this.f30330d.a(bArrE, iF, iE);
                }
                if (this.f30330d.b(i11, i12 < 0 ? -i12 : 0)) {
                    O o10 = this.f30335i;
                    a aVar = this.f30330d;
                    o10.f(f(aVar, aVar.f30342d, (String) C1804a.e(this.f30334h)));
                    this.f30336j = true;
                }
            }
            this.f30332f.a(bArrE, iF, iE);
            w wVar = this.f30331e;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f30331e.b(i13)) {
                    w wVar2 = this.f30331e;
                    ((X1.y) X1.L.i(this.f30328b)).U(this.f30331e.f30501d, Y1.e.I(wVar2.f30501d, wVar2.f30502e));
                    ((N) X1.L.i(this.f30327a)).a(this.f30337k, this.f30328b);
                }
                if (i11 == 178 && yVar.e()[iE + 2] == 1) {
                    this.f30331e.e(i11);
                }
            }
            int i14 = iG - iE;
            this.f30332f.b(this.f30333g - i14, i14, this.f30336j);
            this.f30332f.c(i11, this.f30337k);
            iF = i10;
        }
        if (!this.f30336j) {
            this.f30330d.a(bArrE, iF, iG);
        }
        this.f30332f.a(bArrE, iF, iG);
        w wVar3 = this.f30331e;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        C1804a.i(this.f30332f);
        if (z10) {
            this.f30332f.b(this.f30333g, 0, this.f30336j);
            this.f30332f.d();
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30334h = dVar.b();
        O oA = rVar.a(dVar.c(), 2);
        this.f30335i = oA;
        this.f30332f = new b(oA);
        N n10 = this.f30327a;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30337k = j10;
    }
}
