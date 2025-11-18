package X1;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m8.AbstractC3979B;
import p8.C4245b;

/* compiled from: ParsableByteArray.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f18703d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f18704e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC3979B<Charset> f18705f = AbstractC3979B.M(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f18706a;

    /* renamed from: b, reason: collision with root package name */
    private int f18707b;

    /* renamed from: c, reason: collision with root package name */
    private int f18708c;

    public y() {
        this.f18706a = L.f18631f;
    }

    private void Y(Charset charset) {
        if (m(charset, f18703d) == '\r') {
            m(charset, f18704e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f18707b;
        while (true) {
            int i12 = this.f18708c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && L.H0(this.f18706a[i11])) {
                return i11;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f18706a;
                if (bArr[i11] == 0 && L.H0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f18706a;
                if (bArr2[i11 + 1] == 0 && L.H0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte bA;
        char c10;
        int i10 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            bA = (byte) C4245b.a(p8.j.b(this.f18706a[this.f18707b]));
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f18706a;
                int i11 = this.f18707b;
                c10 = C4245b.c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f18706a;
                int i12 = this.f18707b;
                c10 = C4245b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            bA = (byte) c10;
            i10 = 2;
        }
        return (C4245b.a(bA) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return (char) 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!C4245b.b(cArr, c10)) {
            return (char) 0;
        }
        this.f18707b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        this.f18707b = i10 + 1;
        this.f18707b = i10 + 2;
        this.f18707b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f18707b = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f18707b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f18707b = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f18707b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f18707b = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f18707b;
        int i12 = (i11 + i10) - 1;
        String strI = L.I(this.f18706a, i11, (i12 >= this.f18708c || this.f18706a[i12] != 0) ? i10 : i10 - 1);
        this.f18707b += i10;
        return strI;
    }

    public short D() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f18707b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String E(int i10) {
        return F(i10, StandardCharsets.UTF_8);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f18706a, this.f18707b, i10, charset);
        this.f18707b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        this.f18707b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f18707b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f18707b = i10 + 4;
        return i13;
    }

    public long J() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        this.f18707b = i10 + 1;
        this.f18707b = i10 + 2;
        this.f18707b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f18707b = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public int K() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f18707b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f18707b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int M() {
        return p8.f.d(N());
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f18707b == this.f18708c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jH = H();
            j10 |= (127 & jH) << (i10 * 7);
            if ((jH & 128) == 0) {
                break;
            }
        }
        return j10;
    }

    public long O() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public int P() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f18707b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long Q() {
        int i10;
        int i11;
        long j10 = this.f18706a[this.f18707b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f18706a[this.f18707b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f18707b += i11;
        return j10;
    }

    public Charset R() {
        if (a() >= 3) {
            byte[] bArr = this.f18706a;
            int i10 = this.f18707b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f18707b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f18706a;
        int i11 = this.f18707b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f18707b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f18707b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void S(int i10) {
        U(b() < i10 ? new byte[i10] : this.f18706a, i10);
    }

    public void T(byte[] bArr) {
        U(bArr, bArr.length);
    }

    public void U(byte[] bArr, int i10) {
        this.f18706a = bArr;
        this.f18708c = i10;
        this.f18707b = 0;
    }

    public void V(int i10) {
        C1804a.a(i10 >= 0 && i10 <= this.f18706a.length);
        this.f18708c = i10;
    }

    public void W(int i10) {
        C1804a.a(i10 >= 0 && i10 <= this.f18708c);
        this.f18707b = i10;
    }

    public void X(int i10) {
        W(this.f18707b + i10);
    }

    public int a() {
        return this.f18708c - this.f18707b;
    }

    public int b() {
        return this.f18706a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f18706a = Arrays.copyOf(this.f18706a, i10);
        }
    }

    public byte[] e() {
        return this.f18706a;
    }

    public int f() {
        return this.f18707b;
    }

    public int g() {
        return this.f18708c;
    }

    public char h(Charset charset) {
        C1804a.b(f18705f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f18706a[this.f18707b] & 255;
    }

    public void k(x xVar, int i10) {
        l(xVar.f18699a, 0, i10);
        xVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f18706a, this.f18707b, bArr, i10, i11);
        this.f18707b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f18707b;
        while (i10 < this.f18708c && this.f18706a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f18706a;
        int i11 = this.f18707b;
        String strI = L.I(bArr, i11, i10 - i11);
        this.f18707b = i10;
        if (i10 < this.f18708c) {
            this.f18707b = i10 + 1;
        }
        return strI;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f18707b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f18707b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f18707b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int r() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f18707b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f18707b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public String s() {
        return t(StandardCharsets.UTF_8);
    }

    public String t(Charset charset) {
        C1804a.b(f18705f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            R();
        }
        String strF = F(d(charset) - this.f18707b, charset);
        if (this.f18707b == this.f18708c) {
            return strF;
        }
        Y(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f18707b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f18707b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f18707b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long v() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        this.f18707b = i10 + 1;
        this.f18707b = i10 + 2;
        this.f18707b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f18707b = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.f18707b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.f18707b = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.f18707b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.f18707b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public short w() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = bArr[i10] & 255;
        this.f18707b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        this.f18707b = i10 + 1;
        this.f18707b = i10 + 2;
        this.f18707b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f18707b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f18706a;
        int i10 = this.f18707b;
        int i11 = i10 + 1;
        this.f18707b = i11;
        int i12 = bArr[i10] & 255;
        this.f18707b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public y(int i10) {
        this.f18706a = new byte[i10];
        this.f18708c = i10;
    }

    public y(byte[] bArr) {
        this.f18706a = bArr;
        this.f18708c = bArr.length;
    }

    public y(byte[] bArr, int i10) {
        this.f18706a = bArr;
        this.f18708c = i10;
    }
}
