package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: CodedInputStream.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f44033a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44034b;

    /* renamed from: c, reason: collision with root package name */
    private int f44035c;

    /* renamed from: d, reason: collision with root package name */
    private int f44036d;

    /* renamed from: e, reason: collision with root package name */
    private int f44037e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f44038f;

    /* renamed from: g, reason: collision with root package name */
    private int f44039g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44040h;

    /* renamed from: i, reason: collision with root package name */
    private int f44041i;

    /* renamed from: j, reason: collision with root package name */
    private int f44042j;

    /* renamed from: k, reason: collision with root package name */
    private int f44043k;

    /* renamed from: l, reason: collision with root package name */
    private int f44044l;

    /* renamed from: m, reason: collision with root package name */
    private int f44045m;

    private e(InputStream inputStream) {
        this.f44040h = false;
        this.f44042j = Integer.MAX_VALUE;
        this.f44044l = 64;
        this.f44045m = 67108864;
        this.f44033a = new byte[4096];
        this.f44035c = 0;
        this.f44037e = 0;
        this.f44041i = 0;
        this.f44038f = inputStream;
        this.f44034b = false;
    }

    public static int B(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i10 = this.f44035c + this.f44036d;
        this.f44035c = i10;
        int i11 = this.f44041i + i10;
        int i12 = this.f44042j;
        if (i11 <= i12) {
            this.f44036d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f44036d = i13;
        this.f44035c = i10 - i13;
    }

    private void O(int i10) throws InvalidProtocolBufferException {
        if (!T(i10)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f44041i;
        int i12 = this.f44037e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f44042j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        int i15 = this.f44035c;
        int i16 = i15 - i12;
        this.f44037e = i15;
        O(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f44035c;
            if (i17 <= i18) {
                this.f44037e = i17;
                return;
            } else {
                i16 += i18;
                this.f44037e = i18;
                O(1);
            }
        }
    }

    private boolean T(int i10) throws IOException {
        int i11 = this.f44037e;
        int i12 = i11 + i10;
        int i13 = this.f44035c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f44041i + i11 + i10 <= this.f44042j && this.f44038f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f44033a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f44041i += i11;
                this.f44035c -= i11;
                this.f44037e = 0;
            }
            InputStream inputStream = this.f44038f;
            byte[] bArr2 = this.f44033a;
            int i14 = this.f44035c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f44033a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f44035c += i15;
                if ((this.f44041i + i10) - this.f44045m > 0) {
                    throw InvalidProtocolBufferException.j();
                }
                N();
                if (this.f44035c >= i10) {
                    return true;
                }
                return T(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws InvalidProtocolBufferException {
        if (this.f44035c - this.f44037e < i10) {
            O(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    static e h(n nVar) {
        e eVar = new e(nVar);
        try {
            eVar.j(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private byte[] x(int i10) throws InvalidProtocolBufferException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return i.f44076a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f44041i;
        int i12 = this.f44037e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f44042j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f44035c - i12;
            System.arraycopy(this.f44033a, i12, bArr, 0, i15);
            this.f44037e = this.f44035c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f44033a, 0, bArr, i15, i16);
            this.f44037e = i16;
            return bArr;
        }
        int i17 = this.f44035c;
        this.f44041i = i11 + i17;
        this.f44037e = 0;
        this.f44035c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f44038f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f44041i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f44033a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int A() {
        int i10;
        int i11 = this.f44037e;
        int i12 = this.f44035c;
        if (i12 != i11) {
            byte[] bArr = this.f44033a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f44037e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        long j12 = i17 ^ (bArr[i16] << 21);
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            int i19 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i18] < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i20 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i20;
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f44037e = i14;
                return i10;
            }
        }
        return (int) D();
    }

    public long C() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f44037e;
        int i11 = this.f44035c;
        if (i11 != i10) {
            byte[] bArr = this.f44033a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f44037e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ (bArr[i13] << 14);
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ (bArr[i14] << 21);
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (bArr[i13] << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (bArr[i14] << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (bArr[i13] << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (bArr[i14] << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f44037e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f44037e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f44037e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f44037e = i13;
                return j10;
            }
        }
        return D();
    }

    long D() throws InvalidProtocolBufferException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & 127) << i10;
            if ((w() & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public int E() {
        return y();
    }

    public long F() {
        return z();
    }

    public int G() {
        return b(A());
    }

    public long H() {
        return c(C());
    }

    public String I() {
        int iA = A();
        int i10 = this.f44035c;
        int i11 = this.f44037e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? "" : new String(x(iA), "UTF-8");
        }
        String str = new String(this.f44033a, i11, iA, "UTF-8");
        this.f44037e += iA;
        return str;
    }

    public String J() throws InvalidProtocolBufferException {
        byte[] bArrX;
        int iA = A();
        int i10 = this.f44037e;
        if (iA <= this.f44035c - i10 && iA > 0) {
            bArrX = this.f44033a;
            this.f44037e = i10 + iA;
        } else {
            if (iA == 0) {
                return "";
            }
            bArrX = x(iA);
            i10 = 0;
        }
        if (v.f(bArrX, i10, i10 + iA)) {
            return new String(bArrX, i10, iA, "UTF-8");
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws InvalidProtocolBufferException {
        if (f()) {
            this.f44039g = 0;
            return 0;
        }
        int iA = A();
        this.f44039g = iA;
        if (w.a(iA) != 0) {
            return this.f44039g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() {
        return A();
    }

    public long M() {
        return C();
    }

    public boolean P(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iB = w.b(i10);
        if (iB == 0) {
            long jT = t();
            codedOutputStream.o0(i10);
            codedOutputStream.z0(jT);
            return true;
        }
        if (iB == 1) {
            long jZ = z();
            codedOutputStream.o0(i10);
            codedOutputStream.V(jZ);
            return true;
        }
        if (iB == 2) {
            d dVarL = l();
            codedOutputStream.o0(i10);
            codedOutputStream.P(dVarL);
            return true;
        }
        if (iB == 3) {
            codedOutputStream.o0(i10);
            Q(codedOutputStream);
            int iC = w.c(w.a(i10), 4);
            a(iC);
            codedOutputStream.o0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw InvalidProtocolBufferException.e();
        }
        int iY = y();
        codedOutputStream.o0(i10);
        codedOutputStream.U(iY);
        return true;
    }

    public void Q(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
        } while (P(iK, codedOutputStream));
    }

    public void R(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f44035c;
        int i12 = this.f44037e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f44037e = i12 + i10;
        }
    }

    public void a(int i10) throws InvalidProtocolBufferException {
        if (this.f44039g != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i10 = this.f44042j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f44041i + this.f44037e);
    }

    public boolean f() {
        return this.f44037e == this.f44035c && !T(1);
    }

    public void i(int i10) {
        this.f44042j = i10;
        N();
    }

    public int j(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = i10 + this.f44041i + this.f44037e;
        int i12 = this.f44042j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.k();
        }
        this.f44042j = i11;
        N();
        return i12;
    }

    public boolean k() {
        return C() != 0;
    }

    public d l() {
        int iA = A();
        int i10 = this.f44035c;
        int i11 = this.f44037e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? d.f44026B : new n(x(iA));
        }
        d cVar = (this.f44034b && this.f44040h) ? new c(this.f44033a, this.f44037e, iA) : d.j(this.f44033a, i11, iA);
        this.f44037e += iA;
        return cVar;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public int n() {
        return A();
    }

    public int o() {
        return y();
    }

    public long p() {
        return z();
    }

    public float q() {
        return Float.intBitsToFloat(y());
    }

    public void r(int i10, o.a aVar, f fVar) throws InvalidProtocolBufferException {
        int i11 = this.f44043k;
        if (i11 >= this.f44044l) {
            throw InvalidProtocolBufferException.h();
        }
        this.f44043k = i11 + 1;
        aVar.k(this, fVar);
        a(w.c(i10, 4));
        this.f44043k--;
    }

    public int s() {
        return A();
    }

    public long t() {
        return C();
    }

    public <T extends o> T u(q<T> qVar, f fVar) throws InvalidProtocolBufferException {
        int iA = A();
        if (this.f44043k >= this.f44044l) {
            throw InvalidProtocolBufferException.h();
        }
        int iJ = j(iA);
        this.f44043k++;
        T tB = qVar.b(this, fVar);
        a(0);
        this.f44043k--;
        i(iJ);
        return tB;
    }

    public void v(o.a aVar, f fVar) throws InvalidProtocolBufferException {
        int iA = A();
        if (this.f44043k >= this.f44044l) {
            throw InvalidProtocolBufferException.h();
        }
        int iJ = j(iA);
        this.f44043k++;
        aVar.k(this, fVar);
        a(0);
        this.f44043k--;
        i(iJ);
    }

    public byte w() throws InvalidProtocolBufferException {
        if (this.f44037e == this.f44035c) {
            O(1);
        }
        byte[] bArr = this.f44033a;
        int i10 = this.f44037e;
        this.f44037e = i10 + 1;
        return bArr[i10];
    }

    public int y() throws InvalidProtocolBufferException {
        int i10 = this.f44037e;
        if (this.f44035c - i10 < 4) {
            O(4);
            i10 = this.f44037e;
        }
        byte[] bArr = this.f44033a;
        this.f44037e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() throws InvalidProtocolBufferException {
        int i10 = this.f44037e;
        if (this.f44035c - i10 < 8) {
            O(8);
            i10 = this.f44037e;
        }
        byte[] bArr = this.f44033a;
        this.f44037e = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    private e(n nVar) {
        this.f44040h = false;
        this.f44042j = Integer.MAX_VALUE;
        this.f44044l = 64;
        this.f44045m = 67108864;
        this.f44033a = nVar.f44087C;
        int iQ = nVar.Q();
        this.f44037e = iQ;
        this.f44035c = iQ + nVar.size();
        this.f44041i = -this.f44037e;
        this.f44038f = null;
        this.f44034b = true;
    }
}
