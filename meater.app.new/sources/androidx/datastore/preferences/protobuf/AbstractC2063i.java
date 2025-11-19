package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: CodedInputStream.java */
/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2063i {

    /* renamed from: a, reason: collision with root package name */
    int f24939a;

    /* renamed from: b, reason: collision with root package name */
    int f24940b;

    /* renamed from: c, reason: collision with root package name */
    int f24941c;

    /* renamed from: d, reason: collision with root package name */
    C2064j f24942d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24943e;

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    private static final class b extends AbstractC2063i {

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f24944f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f24945g;

        /* renamed from: h, reason: collision with root package name */
        private int f24946h;

        /* renamed from: i, reason: collision with root package name */
        private int f24947i;

        /* renamed from: j, reason: collision with root package name */
        private int f24948j;

        /* renamed from: k, reason: collision with root package name */
        private int f24949k;

        /* renamed from: l, reason: collision with root package name */
        private int f24950l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24951m;

        /* renamed from: n, reason: collision with root package name */
        private int f24952n;

        private void M() {
            int i10 = this.f24946h + this.f24947i;
            this.f24946h = i10;
            int i11 = i10 - this.f24949k;
            int i12 = this.f24952n;
            if (i11 <= i12) {
                this.f24947i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f24947i = i13;
            this.f24946h = i10 - i13;
        }

        private void P() throws InvalidProtocolBufferException {
            if (this.f24946h - this.f24948j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f24944f;
                int i11 = this.f24948j;
                this.f24948j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void R() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public String A() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f24946h;
                int i11 = this.f24948j;
                if (iJ <= i10 - i11) {
                    String strE = q0.e(this.f24944f, i11, iJ);
                    this.f24948j += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f24950l = 0;
                return 0;
            }
            int iJ = J();
            this.f24950l = iJ;
            if (r0.a(iJ) != 0) {
                return this.f24950l;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean E(int i10) throws InvalidProtocolBufferException {
            int iB = r0.b(i10);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.d();
            }
            O(4);
            return true;
        }

        public byte F() throws InvalidProtocolBufferException {
            int i10 = this.f24948j;
            if (i10 == this.f24946h) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24944f;
            this.f24948j = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f24946h;
                int i12 = this.f24948j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f24948j = i13;
                    return Arrays.copyOfRange(this.f24944f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (i10 == 0) {
                return C2079z.f25186c;
            }
            throw InvalidProtocolBufferException.f();
        }

        public int H() throws InvalidProtocolBufferException {
            int i10 = this.f24948j;
            if (this.f24946h - i10 < 4) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24944f;
            this.f24948j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws InvalidProtocolBufferException {
            int i10 = this.f24948j;
            if (this.f24946h - i10 < 8) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24944f;
            this.f24948j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() {
            int i10;
            int i11 = this.f24948j;
            int i12 = this.f24946h;
            if (i12 != i11) {
                byte[] bArr = this.f24944f;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f24948j = i13;
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
                    this.f24948j = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f24948j;
            int i11 = this.f24946h;
            if (i11 != i10) {
                byte[] bArr = this.f24944f;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f24948j = i12;
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
                    this.f24948j = i13;
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
            throw InvalidProtocolBufferException.e();
        }

        public void N() throws InvalidProtocolBufferException {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f24946h;
                int i12 = this.f24948j;
                if (i10 <= i11 - i12) {
                    this.f24948j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f24950l != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int d() {
            return this.f24948j - this.f24949k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean e() {
            return this.f24948j == this.f24946h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public void k(int i10) {
            this.f24952n = i10;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i10 + d();
            int i11 = this.f24952n;
            if (iD > i11) {
                throw InvalidProtocolBufferException.k();
            }
            this.f24952n = iD;
            M();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public AbstractC2062h n() {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f24946h;
                int i11 = this.f24948j;
                if (iJ <= i10 - i11) {
                    AbstractC2062h abstractC2062hM = (this.f24945g && this.f24951m) ? AbstractC2062h.M(this.f24944f, i11, iJ) : AbstractC2062h.r(this.f24944f, i11, iJ);
                    this.f24948j += iJ;
                    return abstractC2062hM;
                }
            }
            return iJ == 0 ? AbstractC2062h.f24923C : AbstractC2062h.L(G(iJ));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int x() {
            return AbstractC2063i.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long y() {
            return AbstractC2063i.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public String z() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f24946h;
                int i11 = this.f24948j;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f24944f, i11, iJ, C2079z.f25184a);
                    this.f24948j += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f24952n = Integer.MAX_VALUE;
            this.f24944f = bArr;
            this.f24946h = i11 + i10;
            this.f24948j = i10;
            this.f24949k = i10;
            this.f24945g = z10;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    private static final class c extends AbstractC2063i {

        /* renamed from: f, reason: collision with root package name */
        private final InputStream f24953f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f24954g;

        /* renamed from: h, reason: collision with root package name */
        private int f24955h;

        /* renamed from: i, reason: collision with root package name */
        private int f24956i;

        /* renamed from: j, reason: collision with root package name */
        private int f24957j;

        /* renamed from: k, reason: collision with root package name */
        private int f24958k;

        /* renamed from: l, reason: collision with root package name */
        private int f24959l;

        /* renamed from: m, reason: collision with root package name */
        private int f24960m;

        private AbstractC2062h F(int i10) throws IOException {
            byte[] bArrI = I(i10);
            if (bArrI != null) {
                return AbstractC2062h.j(bArrI);
            }
            int i11 = this.f24957j;
            int i12 = this.f24955h;
            int length = i12 - i11;
            this.f24959l += i12;
            this.f24957j = 0;
            this.f24955h = 0;
            List<byte[]> listJ = J(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f24954g, i11, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2062h.L(bArr);
        }

        private byte[] H(int i10, boolean z10) throws IOException {
            byte[] bArrI = I(i10);
            if (bArrI != null) {
                return z10 ? (byte[]) bArrI.clone() : bArrI;
            }
            int i11 = this.f24957j;
            int i12 = this.f24955h;
            int length = i12 - i11;
            this.f24959l += i12;
            this.f24957j = 0;
            this.f24955h = 0;
            List<byte[]> listJ = J(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f24954g, i11, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i10) throws IOException {
            if (i10 == 0) {
                return C2079z.f25186c;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i11 = this.f24959l;
            int i12 = this.f24957j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f24941c > 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i14 = this.f24960m;
            if (i13 > i14) {
                S((i14 - i11) - i12);
                throw InvalidProtocolBufferException.k();
            }
            int i15 = this.f24955h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f24953f.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f24954g, this.f24957j, bArr, 0, i15);
            this.f24959l += this.f24955h;
            this.f24957j = 0;
            this.f24955h = 0;
            while (i15 < i10) {
                int i17 = this.f24953f.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f24959l += i17;
                i15 += i17;
            }
            return bArr;
        }

        private List<byte[]> J(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f24953f.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.k();
                    }
                    this.f24959l += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i10 = this.f24955h + this.f24956i;
            this.f24955h = i10;
            int i11 = this.f24959l + i10;
            int i12 = this.f24960m;
            if (i11 <= i12) {
                this.f24956i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f24956i = i13;
            this.f24955h = i10 - i13;
        }

        private void Q(int i10) throws InvalidProtocolBufferException {
            if (X(i10)) {
                return;
            }
            if (i10 <= (this.f24941c - this.f24959l) - this.f24957j) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.j();
        }

        private void T(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i11 = this.f24959l;
            int i12 = this.f24957j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f24960m;
            if (i13 > i14) {
                S((i14 - i11) - i12);
                throw InvalidProtocolBufferException.k();
            }
            this.f24959l = i11 + i12;
            int i15 = this.f24955h - i12;
            this.f24955h = 0;
            this.f24957j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jSkip = this.f24953f.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(this.f24953f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i15 += (int) jSkip;
                    }
                } finally {
                    this.f24959l += i15;
                    P();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f24955h;
            int i17 = i16 - this.f24957j;
            this.f24957j = i16;
            Q(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f24955h;
                if (i18 <= i19) {
                    this.f24957j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f24957j = i19;
                    Q(1);
                }
            }
        }

        private void U() throws InvalidProtocolBufferException {
            if (this.f24955h - this.f24957j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f24954g;
                int i11 = this.f24957j;
                this.f24957j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void W() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private boolean X(int i10) throws IOException {
            int i11 = this.f24957j;
            int i12 = i11 + i10;
            int i13 = this.f24955h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f24941c;
            int i15 = this.f24959l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f24960m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f24954g;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f24959l += i11;
                this.f24955h -= i11;
                this.f24957j = 0;
            }
            InputStream inputStream = this.f24953f;
            byte[] bArr2 = this.f24954g;
            int i16 = this.f24955h;
            int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f24941c - this.f24959l) - i16));
            if (i17 == 0 || i17 < -1 || i17 > this.f24954g.length) {
                throw new IllegalStateException(this.f24953f.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f24955h += i17;
            P();
            if (this.f24955h >= i10) {
                return true;
            }
            return X(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public String A() throws IOException {
            byte[] bArrH;
            int iM = M();
            int i10 = this.f24957j;
            int i11 = this.f24955h;
            if (iM <= i11 - i10 && iM > 0) {
                bArrH = this.f24954g;
                this.f24957j = i10 + iM;
            } else {
                if (iM == 0) {
                    return "";
                }
                i10 = 0;
                if (iM <= i11) {
                    Q(iM);
                    bArrH = this.f24954g;
                    this.f24957j = iM;
                } else {
                    bArrH = H(iM, false);
                }
            }
            return q0.e(bArrH, i10, iM);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f24958k = 0;
                return 0;
            }
            int iM = M();
            this.f24958k = iM;
            if (r0.a(iM) != 0) {
                return this.f24958k;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean E(int i10) throws InvalidProtocolBufferException {
            int iB = r0.b(i10);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                S(8);
                return true;
            }
            if (iB == 2) {
                S(M());
                return true;
            }
            if (iB == 3) {
                R();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.d();
            }
            S(4);
            return true;
        }

        public byte G() throws InvalidProtocolBufferException {
            if (this.f24957j == this.f24955h) {
                Q(1);
            }
            byte[] bArr = this.f24954g;
            int i10 = this.f24957j;
            this.f24957j = i10 + 1;
            return bArr[i10];
        }

        public int K() throws InvalidProtocolBufferException {
            int i10 = this.f24957j;
            if (this.f24955h - i10 < 4) {
                Q(4);
                i10 = this.f24957j;
            }
            byte[] bArr = this.f24954g;
            this.f24957j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long L() throws InvalidProtocolBufferException {
            int i10 = this.f24957j;
            if (this.f24955h - i10 < 8) {
                Q(8);
                i10 = this.f24957j;
            }
            byte[] bArr = this.f24954g;
            this.f24957j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int M() {
            int i10;
            int i11 = this.f24957j;
            int i12 = this.f24955h;
            if (i12 != i11) {
                byte[] bArr = this.f24954g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f24957j = i13;
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
                    this.f24957j = i14;
                    return i10;
                }
            }
            return (int) O();
        }

        public long N() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f24957j;
            int i11 = this.f24955h;
            if (i11 != i10) {
                byte[] bArr = this.f24954g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f24957j = i12;
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
                    this.f24957j = i13;
                    return j10;
                }
            }
            return O();
        }

        long O() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((G() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void R() throws InvalidProtocolBufferException {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void S(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f24955h;
            int i12 = this.f24957j;
            if (i10 > i11 - i12 || i10 < 0) {
                T(i10);
            } else {
                this.f24957j = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f24958k != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int d() {
            return this.f24959l + this.f24957j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean e() {
            return this.f24957j == this.f24955h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public void k(int i10) {
            this.f24960m = i10;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i11 = i10 + this.f24959l + this.f24957j;
            int i12 = this.f24960m;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.k();
            }
            this.f24960m = i11;
            P();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public AbstractC2062h n() {
            int iM = M();
            int i10 = this.f24955h;
            int i11 = this.f24957j;
            if (iM > i10 - i11 || iM <= 0) {
                return iM == 0 ? AbstractC2062h.f24923C : F(iM);
            }
            AbstractC2062h abstractC2062hR = AbstractC2062h.r(this.f24954g, i11, iM);
            this.f24957j += iM;
            return abstractC2062hR;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public int x() {
            return AbstractC2063i.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public long y() {
            return AbstractC2063i.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2063i
        public String z() throws InvalidProtocolBufferException {
            int iM = M();
            if (iM > 0) {
                int i10 = this.f24955h;
                int i11 = this.f24957j;
                if (iM <= i10 - i11) {
                    String str = new String(this.f24954g, i11, iM, C2079z.f25184a);
                    this.f24957j += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM > this.f24955h) {
                return new String(H(iM, false), C2079z.f25184a);
            }
            Q(iM);
            String str2 = new String(this.f24954g, this.f24957j, iM, C2079z.f25184a);
            this.f24957j += iM;
            return str2;
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f24960m = Integer.MAX_VALUE;
            C2079z.b(inputStream, "input");
            this.f24953f = inputStream;
            this.f24954g = new byte[i10];
            this.f24955h = 0;
            this.f24957j = 0;
            this.f24959l = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2063i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC2063i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(C2079z.f25186c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2063i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC2063i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static AbstractC2063i j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract AbstractC2062h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private AbstractC2063i() {
        this.f24940b = 100;
        this.f24941c = Integer.MAX_VALUE;
        this.f24943e = false;
    }
}
