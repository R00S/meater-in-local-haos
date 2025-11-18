package com.google.protobuf;

import java.util.Arrays;

/* compiled from: CodedInputStream.java */
/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2948h {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f39250f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f39251a;

    /* renamed from: b, reason: collision with root package name */
    int f39252b;

    /* renamed from: c, reason: collision with root package name */
    int f39253c;

    /* renamed from: d, reason: collision with root package name */
    C2949i f39254d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39255e;

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.h$b */
    private static final class b extends AbstractC2948h {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f39256g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f39257h;

        /* renamed from: i, reason: collision with root package name */
        private int f39258i;

        /* renamed from: j, reason: collision with root package name */
        private int f39259j;

        /* renamed from: k, reason: collision with root package name */
        private int f39260k;

        /* renamed from: l, reason: collision with root package name */
        private int f39261l;

        /* renamed from: m, reason: collision with root package name */
        private int f39262m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f39263n;

        /* renamed from: o, reason: collision with root package name */
        private int f39264o;

        private void M() {
            int i10 = this.f39258i + this.f39259j;
            this.f39258i = i10;
            int i11 = i10 - this.f39261l;
            int i12 = this.f39264o;
            if (i11 <= i12) {
                this.f39259j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f39259j = i13;
            this.f39258i = i10 - i13;
        }

        private void O() throws InvalidProtocolBufferException {
            if (this.f39258i - this.f39260k >= 10) {
                P();
            } else {
                Q();
            }
        }

        private void P() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f39256g;
                int i11 = this.f39260k;
                this.f39260k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void Q() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int A() throws InvalidProtocolBufferException {
            if (f()) {
                this.f39262m = 0;
                return 0;
            }
            int iJ = J();
            this.f39262m = iJ;
            if (r0.a(iJ) != 0) {
                return this.f39262m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int B() {
            return J();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public long C() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public boolean D(int i10) throws InvalidProtocolBufferException {
            int iB = r0.b(i10);
            if (iB == 0) {
                O();
                return true;
            }
            if (iB == 1) {
                N(8);
                return true;
            }
            if (iB == 2) {
                N(J());
                return true;
            }
            if (iB == 3) {
                E();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            N(4);
            return true;
        }

        public byte F() throws InvalidProtocolBufferException {
            int i10 = this.f39260k;
            if (i10 == this.f39258i) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f39256g;
            this.f39260k = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f39258i;
                int i12 = this.f39260k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f39260k = i13;
                    return Arrays.copyOfRange(this.f39256g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (i10 == 0) {
                return C2964y.f39493d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int H() throws InvalidProtocolBufferException {
            int i10 = this.f39260k;
            if (this.f39258i - i10 < 4) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f39256g;
            this.f39260k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws InvalidProtocolBufferException {
            int i10 = this.f39260k;
            if (this.f39258i - i10 < 8) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f39256g;
            this.f39260k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() {
            int i10;
            int i11 = this.f39260k;
            int i12 = this.f39258i;
            if (i12 != i11) {
                byte[] bArr = this.f39256g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f39260k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f39260k = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f39260k;
            int i11 = this.f39258i;
            if (i11 != i10) {
                byte[] bArr = this.f39256g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f39260k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f39260k = i13;
                    return j10;
                }
            }
            return L();
        }

        long L() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((F() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void N(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f39258i;
                int i12 = this.f39260k;
                if (i10 <= i11 - i12) {
                    this.f39260k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f39262m != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int e() {
            return this.f39260k - this.f39261l;
        }

        @Override // com.google.protobuf.AbstractC2948h
        public boolean f() {
            return this.f39260k == this.f39258i;
        }

        @Override // com.google.protobuf.AbstractC2948h
        public void j(int i10) {
            this.f39264o = i10;
            M();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int k(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i11 = this.f39264o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.k();
            }
            this.f39264o = iE;
            M();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC2948h
        public boolean l() {
            return K() != 0;
        }

        @Override // com.google.protobuf.AbstractC2948h
        public AbstractC2947g m() {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f39258i;
                int i11 = this.f39260k;
                if (iJ <= i10 - i11) {
                    AbstractC2947g abstractC2947gK = (this.f39257h && this.f39263n) ? AbstractC2947g.K(this.f39256g, i11, iJ) : AbstractC2947g.j(this.f39256g, i11, iJ);
                    this.f39260k += iJ;
                    return abstractC2947gK;
                }
            }
            return iJ == 0 ? AbstractC2947g.f39238C : AbstractC2947g.J(G(iJ));
        }

        @Override // com.google.protobuf.AbstractC2948h
        public double n() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int o() {
            return J();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int p() {
            return H();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public long q() {
            return I();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public float r() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int s() {
            return J();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public long t() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int u() {
            return H();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public long v() {
            return I();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public int w() {
            return AbstractC2948h.c(J());
        }

        @Override // com.google.protobuf.AbstractC2948h
        public long x() {
            return AbstractC2948h.d(K());
        }

        @Override // com.google.protobuf.AbstractC2948h
        public String y() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f39258i;
                int i11 = this.f39260k;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f39256g, i11, iJ, C2964y.f39491b);
                    this.f39260k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.AbstractC2948h
        public String z() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f39258i;
                int i11 = this.f39260k;
                if (iJ <= i10 - i11) {
                    String strE = q0.e(this.f39256g, i11, iJ);
                    this.f39260k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f39264o = Integer.MAX_VALUE;
            this.f39256g = bArr;
            this.f39258i = i11 + i10;
            this.f39260k = i10;
            this.f39261l = i10;
            this.f39257h = z10;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2948h g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static AbstractC2948h h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10, i11, false);
    }

    static AbstractC2948h i(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.k(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i10);

    public void E() throws InvalidProtocolBufferException {
        int iA;
        do {
            iA = A();
            if (iA == 0) {
                return;
            }
            b();
            this.f39251a++;
            this.f39251a--;
        } while (D(iA));
    }

    public abstract void a(int i10);

    public void b() throws InvalidProtocolBufferException {
        if (this.f39251a >= this.f39252b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void j(int i10);

    public abstract int k(int i10);

    public abstract boolean l();

    public abstract AbstractC2947g m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();

    private AbstractC2948h() {
        this.f39252b = f39250f;
        this.f39253c = Integer.MAX_VALUE;
        this.f39255e = false;
    }
}
