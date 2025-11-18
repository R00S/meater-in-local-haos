package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: CodedInputStream.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2899i {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f37817f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f37818a;

    /* renamed from: b, reason: collision with root package name */
    int f37819b;

    /* renamed from: c, reason: collision with root package name */
    int f37820c;

    /* renamed from: d, reason: collision with root package name */
    C2900j f37821d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37822e;

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    private static final class b extends AbstractC2899i {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f37823g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f37824h;

        /* renamed from: i, reason: collision with root package name */
        private int f37825i;

        /* renamed from: j, reason: collision with root package name */
        private int f37826j;

        /* renamed from: k, reason: collision with root package name */
        private int f37827k;

        /* renamed from: l, reason: collision with root package name */
        private int f37828l;

        /* renamed from: m, reason: collision with root package name */
        private int f37829m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f37830n;

        /* renamed from: o, reason: collision with root package name */
        private int f37831o;

        private void M() {
            int i10 = this.f37825i + this.f37826j;
            this.f37825i = i10;
            int i11 = i10 - this.f37828l;
            int i12 = this.f37831o;
            if (i11 <= i12) {
                this.f37826j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37826j = i13;
            this.f37825i = i10 - i13;
        }

        private void P() throws InvalidProtocolBufferException {
            if (this.f37825i - this.f37827k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f37823g;
                int i11 = this.f37827k;
                this.f37827k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void R() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public String A() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f37825i;
                int i11 = this.f37827k;
                if (iJ <= i10 - i11) {
                    String strE = q0.e(this.f37823g, i11, iJ);
                    this.f37827k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f37829m = 0;
                return 0;
            }
            int iJ = J();
            this.f37829m = iJ;
            if (r0.a(iJ) != 0) {
                return this.f37829m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
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
                throw InvalidProtocolBufferException.e();
            }
            O(4);
            return true;
        }

        public byte F() throws InvalidProtocolBufferException {
            int i10 = this.f37827k;
            if (i10 == this.f37825i) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f37823g;
            this.f37827k = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f37825i;
                int i12 = this.f37827k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f37827k = i13;
                    return Arrays.copyOfRange(this.f37823g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.m();
            }
            if (i10 == 0) {
                return C2915z.f38063d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int H() throws InvalidProtocolBufferException {
            int i10 = this.f37827k;
            if (this.f37825i - i10 < 4) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f37823g;
            this.f37827k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws InvalidProtocolBufferException {
            int i10 = this.f37827k;
            if (this.f37825i - i10 < 8) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f37823g;
            this.f37827k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() {
            int i10;
            int i11 = this.f37827k;
            int i12 = this.f37825i;
            if (i12 != i11) {
                byte[] bArr = this.f37823g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37827k = i13;
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
                    this.f37827k = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37827k;
            int i11 = this.f37825i;
            if (i11 != i10) {
                byte[] bArr = this.f37823g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37827k = i12;
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
                    this.f37827k = i13;
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
                int i11 = this.f37825i;
                int i12 = this.f37827k;
                if (i10 <= i11 - i12) {
                    this.f37827k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f37829m != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int d() {
            return this.f37827k - this.f37828l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public boolean e() {
            return this.f37827k == this.f37825i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public void k(int i10) {
            this.f37831o = i10;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iD = i10 + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i11 = this.f37831o;
            if (iD > i11) {
                throw InvalidProtocolBufferException.m();
            }
            this.f37831o = iD;
            M();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public AbstractC2898h n() {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f37825i;
                int i11 = this.f37827k;
                if (iJ <= i10 - i11) {
                    AbstractC2898h abstractC2898hO = (this.f37824h && this.f37830n) ? AbstractC2898h.O(this.f37823g, i11, iJ) : AbstractC2898h.r(this.f37823g, i11, iJ);
                    this.f37827k += iJ;
                    return abstractC2898hO;
                }
            }
            return iJ == 0 ? AbstractC2898h.f37801C : AbstractC2898h.M(G(iJ));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int x() {
            return AbstractC2899i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long y() {
            return AbstractC2899i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public String z() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f37825i;
                int i11 = this.f37827k;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f37823g, i11, iJ, C2915z.f38061b);
                    this.f37827k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f37831o = Integer.MAX_VALUE;
            this.f37823g = bArr;
            this.f37825i = i11 + i10;
            this.f37827k = i10;
            this.f37828l = i10;
            this.f37824h = z10;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    private static final class c extends AbstractC2899i {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f37832g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f37833h;

        /* renamed from: i, reason: collision with root package name */
        private int f37834i;

        /* renamed from: j, reason: collision with root package name */
        private int f37835j;

        /* renamed from: k, reason: collision with root package name */
        private int f37836k;

        /* renamed from: l, reason: collision with root package name */
        private int f37837l;

        /* renamed from: m, reason: collision with root package name */
        private int f37838m;

        /* renamed from: n, reason: collision with root package name */
        private int f37839n;

        private static int F(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        private static int G(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC2898h H(int i10) throws IOException {
            byte[] bArrK = K(i10);
            if (bArrK != null) {
                return AbstractC2898h.j(bArrK);
            }
            int i11 = this.f37836k;
            int i12 = this.f37834i;
            int length = i12 - i11;
            this.f37838m += i12;
            this.f37836k = 0;
            this.f37834i = 0;
            List<byte[]> listL = L(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37833h, i11, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2898h.M(bArr);
        }

        private byte[] J(int i10, boolean z10) throws IOException {
            byte[] bArrK = K(i10);
            if (bArrK != null) {
                return z10 ? (byte[]) bArrK.clone() : bArrK;
            }
            int i11 = this.f37836k;
            int i12 = this.f37834i;
            int length = i12 - i11;
            this.f37838m += i12;
            this.f37836k = 0;
            this.f37834i = 0;
            List<byte[]> listL = L(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37833h, i11, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] K(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return C2915z.f38063d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f37838m;
            int i12 = this.f37836k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f37820c > 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i14 = this.f37839n;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw InvalidProtocolBufferException.m();
            }
            int i15 = this.f37834i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > F(this.f37832g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37833h, this.f37836k, bArr, 0, i15);
            this.f37838m += this.f37834i;
            this.f37836k = 0;
            this.f37834i = 0;
            while (i15 < i10) {
                int iG = G(this.f37832g, bArr, i15, i10 - i15);
                if (iG == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f37838m += iG;
                i15 += iG;
            }
            return bArr;
        }

        private List<byte[]> L(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f37832g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.f37838m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i10 = this.f37834i + this.f37835j;
            this.f37834i = i10;
            int i11 = this.f37838m + i10;
            int i12 = this.f37839n;
            if (i11 <= i12) {
                this.f37835j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37835j = i13;
            this.f37834i = i10 - i13;
        }

        private void S(int i10) throws InvalidProtocolBufferException {
            if (a0(i10)) {
                return;
            }
            if (i10 <= (this.f37820c - this.f37838m) - this.f37836k) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.l();
        }

        private static long T(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        private void W(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f37838m;
            int i12 = this.f37836k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f37839n;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw InvalidProtocolBufferException.m();
            }
            this.f37838m = i11 + i12;
            int i15 = this.f37834i - i12;
            this.f37834i = 0;
            this.f37836k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jT = T(this.f37832g, j10);
                    if (jT < 0 || jT > j10) {
                        throw new IllegalStateException(this.f37832g.getClass() + "#skip returned invalid result: " + jT + "\nThe InputStream implementation is buggy.");
                    }
                    if (jT == 0) {
                        break;
                    } else {
                        i15 += (int) jT;
                    }
                } finally {
                    this.f37838m += i15;
                    R();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f37834i;
            int i17 = i16 - this.f37836k;
            this.f37836k = i16;
            S(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f37834i;
                if (i18 <= i19) {
                    this.f37836k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f37836k = i19;
                    S(1);
                }
            }
        }

        private void X() throws InvalidProtocolBufferException {
            if (this.f37834i - this.f37836k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f37833h;
                int i11 = this.f37836k;
                this.f37836k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void Z() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean a0(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f37836k;
            int i12 = i11 + i10;
            int i13 = this.f37834i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f37820c;
            int i15 = this.f37838m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f37839n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f37833h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f37838m += i11;
                this.f37834i -= i11;
                this.f37836k = 0;
            }
            InputStream inputStream = this.f37832g;
            byte[] bArr2 = this.f37833h;
            int i16 = this.f37834i;
            int iG = G(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f37820c - this.f37838m) - i16));
            if (iG == 0 || iG < -1 || iG > this.f37833h.length) {
                throw new IllegalStateException(this.f37832g.getClass() + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
            }
            if (iG <= 0) {
                return false;
            }
            this.f37834i += iG;
            R();
            if (this.f37834i >= i10) {
                return true;
            }
            return a0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public String A() throws IOException {
            byte[] bArrJ;
            int iO = O();
            int i10 = this.f37836k;
            int i11 = this.f37834i;
            if (iO <= i11 - i10 && iO > 0) {
                bArrJ = this.f37833h;
                this.f37836k = i10 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                i10 = 0;
                if (iO <= i11) {
                    S(iO);
                    bArrJ = this.f37833h;
                    this.f37836k = iO;
                } else {
                    bArrJ = J(iO, false);
                }
            }
            return q0.e(bArrJ, i10, iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f37837l = 0;
                return 0;
            }
            int iO = O();
            this.f37837l = iO;
            if (r0.a(iO) != 0) {
                return this.f37837l;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public boolean E(int i10) throws InvalidProtocolBufferException {
            int iB = r0.b(i10);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(O());
                return true;
            }
            if (iB == 3) {
                U();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            V(4);
            return true;
        }

        public byte I() throws InvalidProtocolBufferException {
            if (this.f37836k == this.f37834i) {
                S(1);
            }
            byte[] bArr = this.f37833h;
            int i10 = this.f37836k;
            this.f37836k = i10 + 1;
            return bArr[i10];
        }

        public int M() throws InvalidProtocolBufferException {
            int i10 = this.f37836k;
            if (this.f37834i - i10 < 4) {
                S(4);
                i10 = this.f37836k;
            }
            byte[] bArr = this.f37833h;
            this.f37836k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long N() throws InvalidProtocolBufferException {
            int i10 = this.f37836k;
            if (this.f37834i - i10 < 8) {
                S(8);
                i10 = this.f37836k;
            }
            byte[] bArr = this.f37833h;
            this.f37836k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int O() {
            int i10;
            int i11 = this.f37836k;
            int i12 = this.f37834i;
            if (i12 != i11) {
                byte[] bArr = this.f37833h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37836k = i13;
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
                    this.f37836k = i14;
                    return i10;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37836k;
            int i11 = this.f37834i;
            if (i11 != i10) {
                byte[] bArr = this.f37833h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37836k = i12;
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
                    this.f37836k = i13;
                    return j10;
                }
            }
            return Q();
        }

        long Q() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((I() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void U() throws InvalidProtocolBufferException {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void V(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f37834i;
            int i12 = this.f37836k;
            if (i10 > i11 - i12 || i10 < 0) {
                W(i10);
            } else {
                this.f37836k = i12 + i10;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f37837l != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int d() {
            return this.f37838m + this.f37836k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public boolean e() {
            return this.f37836k == this.f37834i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public void k(int i10) {
            this.f37839n = i10;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = i10 + this.f37838m + this.f37836k;
            int i12 = this.f37839n;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.m();
            }
            this.f37839n = i11;
            R();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public AbstractC2898h n() {
            int iO = O();
            int i10 = this.f37834i;
            int i11 = this.f37836k;
            if (iO > i10 - i11 || iO <= 0) {
                return iO == 0 ? AbstractC2898h.f37801C : H(iO);
            }
            AbstractC2898h abstractC2898hR = AbstractC2898h.r(this.f37833h, i11, iO);
            this.f37836k += iO;
            return abstractC2898hR;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public int x() {
            return AbstractC2899i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public long y() {
            return AbstractC2899i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899i
        public String z() throws InvalidProtocolBufferException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f37834i;
                int i11 = this.f37836k;
                if (iO <= i10 - i11) {
                    String str = new String(this.f37833h, i11, iO, C2915z.f38061b);
                    this.f37836k += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO > this.f37834i) {
                return new String(J(iO, false), C2915z.f38061b);
            }
            S(iO);
            String str2 = new String(this.f37833h, this.f37836k, iO, C2915z.f38061b);
            this.f37836k += iO;
            return str2;
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f37839n = Integer.MAX_VALUE;
            C2915z.b(inputStream, "input");
            this.f37832g = inputStream;
            this.f37833h = new byte[i10];
            this.f37834i = 0;
            this.f37836k = 0;
            this.f37838m = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2899i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC2899i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(C2915z.f38063d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2899i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC2899i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static AbstractC2899i j(byte[] bArr, int i10, int i11, boolean z10) {
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

    public abstract AbstractC2898h n();

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

    private AbstractC2899i() {
        this.f37819b = f37817f;
        this.f37820c = Integer.MAX_VALUE;
        this.f37822e = false;
    }
}
