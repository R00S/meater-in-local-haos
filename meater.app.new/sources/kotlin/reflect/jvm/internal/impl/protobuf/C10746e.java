package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import okhttp3.HttpUrl;

/* compiled from: CodedInputStream.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* loaded from: classes3.dex */
public final class C10746e {

    /* renamed from: a */
    private final byte[] f41270a;

    /* renamed from: b */
    private final boolean f41271b;

    /* renamed from: c */
    private int f41272c;

    /* renamed from: d */
    private int f41273d;

    /* renamed from: e */
    private int f41274e;

    /* renamed from: f */
    private final InputStream f41275f;

    /* renamed from: g */
    private int f41276g;

    /* renamed from: h */
    private boolean f41277h;

    /* renamed from: i */
    private int f41278i;

    /* renamed from: j */
    private int f41279j;

    /* renamed from: k */
    private int f41280k;

    /* renamed from: l */
    private int f41281l;

    /* renamed from: m */
    private int f41282m;

    /* renamed from: n */
    private a f41283n;

    /* compiled from: CodedInputStream.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    private interface a {
        /* renamed from: a */
        void m38346a();
    }

    private C10746e(InputStream inputStream) {
        this.f41277h = false;
        this.f41279j = Integer.MAX_VALUE;
        this.f41281l = 64;
        this.f41282m = 67108864;
        this.f41283n = null;
        this.f41270a = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f41272c = 0;
        this.f41274e = 0;
        this.f41278i = 0;
        this.f41275f = inputStream;
        this.f41271b = false;
    }

    /* renamed from: B */
    public static int m38300B(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.m38251k();
            }
            i3 |= (i5 & 127) << i4;
            if ((i5 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw InvalidProtocolBufferException.m38251k();
            }
            if ((i6 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw InvalidProtocolBufferException.m38247f();
    }

    /* renamed from: N */
    private void m38301N() {
        int i2 = this.f41272c + this.f41273d;
        this.f41272c = i2;
        int i3 = this.f41278i + i2;
        int i4 = this.f41279j;
        if (i3 <= i4) {
            this.f41273d = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f41273d = i5;
        this.f41272c = i2 - i5;
    }

    /* renamed from: O */
    private void m38302O(int i2) throws IOException {
        if (!m38304T(i2)) {
            throw InvalidProtocolBufferException.m38251k();
        }
    }

    /* renamed from: S */
    private void m38303S(int i2) throws IOException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m38248g();
        }
        int i3 = this.f41278i;
        int i4 = this.f41274e;
        int i5 = i3 + i4 + i2;
        int i6 = this.f41279j;
        if (i5 > i6) {
            m38325R((i6 - i3) - i4);
            throw InvalidProtocolBufferException.m38251k();
        }
        int i7 = this.f41272c;
        int i8 = i7 - i4;
        this.f41274e = i7;
        m38302O(1);
        while (true) {
            int i9 = i2 - i8;
            int i10 = this.f41272c;
            if (i9 <= i10) {
                this.f41274e = i9;
                return;
            } else {
                i8 += i10;
                this.f41274e = i10;
                m38302O(1);
            }
        }
    }

    /* renamed from: T */
    private boolean m38304T(int i2) throws IOException {
        int i3 = this.f41274e;
        if (i3 + i2 <= this.f41272c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f41278i + i3 + i2 > this.f41279j) {
            return false;
        }
        a aVar = this.f41283n;
        if (aVar != null) {
            aVar.m38346a();
        }
        if (this.f41275f != null) {
            int i4 = this.f41274e;
            if (i4 > 0) {
                int i5 = this.f41272c;
                if (i5 > i4) {
                    byte[] bArr = this.f41270a;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.f41278i += i4;
                this.f41272c -= i4;
                this.f41274e = 0;
            }
            InputStream inputStream = this.f41275f;
            byte[] bArr2 = this.f41270a;
            int i6 = this.f41272c;
            int i7 = inputStream.read(bArr2, i6, bArr2.length - i6);
            if (i7 == 0 || i7 < -1 || i7 > this.f41270a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i7);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i7 > 0) {
                this.f41272c += i7;
                if ((this.f41278i + i2) - this.f41282m > 0) {
                    throw InvalidProtocolBufferException.m38250j();
                }
                m38301N();
                if (this.f41272c >= i2) {
                    return true;
                }
                return m38304T(i2);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m38305b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* renamed from: c */
    public static long m38306c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* renamed from: d */
    private void m38307d(int i2) throws IOException {
        if (this.f41272c - this.f41274e < i2) {
            m38302O(i2);
        }
    }

    /* renamed from: g */
    public static C10746e m38308g(InputStream inputStream) {
        return new C10746e(inputStream);
    }

    /* renamed from: h */
    static C10746e m38309h(C10755n c10755n) {
        C10746e c10746e = new C10746e(c10755n);
        try {
            c10746e.m38330j(c10755n.size());
            return c10746e;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: x */
    private byte[] m38310x(int i2) throws IOException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return C10750i.f41314a;
            }
            throw InvalidProtocolBufferException.m38248g();
        }
        int i3 = this.f41278i;
        int i4 = this.f41274e;
        int i5 = i3 + i4 + i2;
        int i6 = this.f41279j;
        if (i5 > i6) {
            m38325R((i6 - i3) - i4);
            throw InvalidProtocolBufferException.m38251k();
        }
        if (i2 < 4096) {
            byte[] bArr = new byte[i2];
            int i7 = this.f41272c - i4;
            System.arraycopy(this.f41270a, i4, bArr, 0, i7);
            this.f41274e = this.f41272c;
            int i8 = i2 - i7;
            m38307d(i8);
            System.arraycopy(this.f41270a, 0, bArr, i7, i8);
            this.f41274e = i8;
            return bArr;
        }
        int i9 = this.f41272c;
        this.f41278i = i3 + i9;
        this.f41274e = 0;
        this.f41272c = 0;
        int length = i9 - i4;
        int i10 = i2 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr2 = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                InputStream inputStream = this.f41275f;
                int i12 = inputStream == null ? -1 : inputStream.read(bArr2, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.m38251k();
                }
                this.f41278i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(this.f41270a, i4, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m38311A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f41274e
            int r1 = r9.f41272c
            if (r1 != r0) goto L8
            goto L7b
        L8:
            byte[] r2 = r9.f41270a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f41274e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7b
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r3 = r3 ^ r5
            int r0 = (int) r3
            goto L81
        L2c:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3e
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3c:
            r1 = r3
            goto L81
        L3e:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L81
        L7b:
            long r0 = r9.m38313D()
            int r1 = (int) r0
            return r1
        L81:
            r9.f41274e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10746e.m38311A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r0] < 0) goto L40;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m38312C() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10746e.m38312C():long");
    }

    /* renamed from: D */
    long m38313D() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((m38343w() & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.m38247f();
    }

    /* renamed from: E */
    public int m38314E() throws IOException {
        return m38344y();
    }

    /* renamed from: F */
    public long m38315F() throws IOException {
        return m38345z();
    }

    /* renamed from: G */
    public int m38316G() throws IOException {
        return m38305b(m38311A());
    }

    /* renamed from: H */
    public long m38317H() throws IOException {
        return m38306c(m38312C());
    }

    /* renamed from: I */
    public String m38318I() throws IOException {
        int iM38311A = m38311A();
        if (iM38311A > this.f41272c - this.f41274e || iM38311A <= 0) {
            return iM38311A == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : new String(m38310x(iM38311A), "UTF-8");
        }
        String str = new String(this.f41270a, this.f41274e, iM38311A, "UTF-8");
        this.f41274e += iM38311A;
        return str;
    }

    /* renamed from: J */
    public String m38319J() throws IOException {
        byte[] bArrM38310x;
        int iM38311A = m38311A();
        int i2 = this.f41274e;
        if (iM38311A <= this.f41272c - i2 && iM38311A > 0) {
            bArrM38310x = this.f41270a;
            this.f41274e = i2 + iM38311A;
        } else {
            if (iM38311A == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            bArrM38310x = m38310x(iM38311A);
            i2 = 0;
        }
        if (C10763v.m38490f(bArrM38310x, i2, i2 + iM38311A)) {
            return new String(bArrM38310x, i2, iM38311A, "UTF-8");
        }
        throw InvalidProtocolBufferException.m38245d();
    }

    /* renamed from: K */
    public int m38320K() throws IOException {
        if (m38328f()) {
            this.f41276g = 0;
            return 0;
        }
        int iM38311A = m38311A();
        this.f41276g = iM38311A;
        if (C10764w.m38494a(iM38311A) != 0) {
            return this.f41276g;
        }
        throw InvalidProtocolBufferException.m38244c();
    }

    /* renamed from: L */
    public int m38321L() throws IOException {
        return m38311A();
    }

    /* renamed from: M */
    public long m38322M() throws IOException {
        return m38312C();
    }

    /* renamed from: P */
    public boolean m38323P(int i2, CodedOutputStream codedOutputStream) throws IOException {
        int iM38495b = C10764w.m38495b(i2);
        if (iM38495b == 0) {
            long jM38340t = m38340t();
            codedOutputStream.m38231o0(i2);
            codedOutputStream.m38242z0(jM38340t);
            return true;
        }
        if (iM38495b == 1) {
            long jM38345z = m38345z();
            codedOutputStream.m38231o0(i2);
            codedOutputStream.m38212V(jM38345z);
            return true;
        }
        if (iM38495b == 2) {
            AbstractC10745d abstractC10745dM38332l = m38332l();
            codedOutputStream.m38231o0(i2);
            codedOutputStream.m38206P(abstractC10745dM38332l);
            return true;
        }
        if (iM38495b == 3) {
            codedOutputStream.m38231o0(i2);
            m38324Q(codedOutputStream);
            int iM38496c = C10764w.m38496c(C10764w.m38494a(i2), 4);
            m38326a(iM38496c);
            codedOutputStream.m38231o0(iM38496c);
            return true;
        }
        if (iM38495b == 4) {
            return false;
        }
        if (iM38495b != 5) {
            throw InvalidProtocolBufferException.m38246e();
        }
        int iM38344y = m38344y();
        codedOutputStream.m38231o0(i2);
        codedOutputStream.m38211U(iM38344y);
        return true;
    }

    /* renamed from: Q */
    public void m38324Q(CodedOutputStream codedOutputStream) throws IOException {
        int iM38320K;
        do {
            iM38320K = m38320K();
            if (iM38320K == 0) {
                return;
            }
        } while (m38323P(iM38320K, codedOutputStream));
    }

    /* renamed from: R */
    public void m38325R(int i2) throws IOException {
        int i3 = this.f41272c;
        int i4 = this.f41274e;
        if (i2 > i3 - i4 || i2 < 0) {
            m38303S(i2);
        } else {
            this.f41274e = i4 + i2;
        }
    }

    /* renamed from: a */
    public void m38326a(int i2) throws InvalidProtocolBufferException {
        if (this.f41276g != i2) {
            throw InvalidProtocolBufferException.m38243b();
        }
    }

    /* renamed from: e */
    public int m38327e() {
        int i2 = this.f41279j;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f41278i + this.f41274e);
    }

    /* renamed from: f */
    public boolean m38328f() throws IOException {
        return this.f41274e == this.f41272c && !m38304T(1);
    }

    /* renamed from: i */
    public void m38329i(int i2) {
        this.f41279j = i2;
        m38301N();
    }

    /* renamed from: j */
    public int m38330j(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m38248g();
        }
        int i3 = i2 + this.f41278i + this.f41274e;
        int i4 = this.f41279j;
        if (i3 > i4) {
            throw InvalidProtocolBufferException.m38251k();
        }
        this.f41279j = i3;
        m38301N();
        return i4;
    }

    /* renamed from: k */
    public boolean m38331k() throws IOException {
        return m38312C() != 0;
    }

    /* renamed from: l */
    public AbstractC10745d m38332l() throws IOException {
        int iM38311A = m38311A();
        int i2 = this.f41272c;
        int i3 = this.f41274e;
        if (iM38311A > i2 - i3 || iM38311A <= 0) {
            return iM38311A == 0 ? AbstractC10745d.f41263f : new C10755n(m38310x(iM38311A));
        }
        AbstractC10745d c10744c = (this.f41271b && this.f41277h) ? new C10744c(this.f41270a, this.f41274e, iM38311A) : AbstractC10745d.m38278i(this.f41270a, i3, iM38311A);
        this.f41274e += iM38311A;
        return c10744c;
    }

    /* renamed from: m */
    public double m38333m() throws IOException {
        return Double.longBitsToDouble(m38345z());
    }

    /* renamed from: n */
    public int m38334n() throws IOException {
        return m38311A();
    }

    /* renamed from: o */
    public int m38335o() throws IOException {
        return m38344y();
    }

    /* renamed from: p */
    public long m38336p() throws IOException {
        return m38345z();
    }

    /* renamed from: q */
    public float m38337q() throws IOException {
        return Float.intBitsToFloat(m38344y());
    }

    /* renamed from: r */
    public void m38338r(int i2, InterfaceC10756o.a aVar, C10747f c10747f) throws IOException {
        int i3 = this.f41280k;
        if (i3 >= this.f41281l) {
            throw InvalidProtocolBufferException.m38249h();
        }
        this.f41280k = i3 + 1;
        aVar.mo34094i(this, c10747f);
        m38326a(C10764w.m38496c(i2, 4));
        this.f41280k--;
    }

    /* renamed from: s */
    public int m38339s() throws IOException {
        return m38311A();
    }

    /* renamed from: t */
    public long m38340t() throws IOException {
        return m38312C();
    }

    /* renamed from: u */
    public <T extends InterfaceC10756o> T m38341u(InterfaceC10758q<T> interfaceC10758q, C10747f c10747f) throws IOException {
        int iM38311A = m38311A();
        if (this.f41280k >= this.f41281l) {
            throw InvalidProtocolBufferException.m38249h();
        }
        int iM38330j = m38330j(iM38311A);
        this.f41280k++;
        T tMo34086b = interfaceC10758q.mo34086b(this, c10747f);
        m38326a(0);
        this.f41280k--;
        m38329i(iM38330j);
        return tMo34086b;
    }

    /* renamed from: v */
    public void m38342v(InterfaceC10756o.a aVar, C10747f c10747f) throws IOException {
        int iM38311A = m38311A();
        if (this.f41280k >= this.f41281l) {
            throw InvalidProtocolBufferException.m38249h();
        }
        int iM38330j = m38330j(iM38311A);
        this.f41280k++;
        aVar.mo34094i(this, c10747f);
        m38326a(0);
        this.f41280k--;
        m38329i(iM38330j);
    }

    /* renamed from: w */
    public byte m38343w() throws IOException {
        if (this.f41274e == this.f41272c) {
            m38302O(1);
        }
        byte[] bArr = this.f41270a;
        int i2 = this.f41274e;
        this.f41274e = i2 + 1;
        return bArr[i2];
    }

    /* renamed from: y */
    public int m38344y() throws IOException {
        int i2 = this.f41274e;
        if (this.f41272c - i2 < 4) {
            m38302O(4);
            i2 = this.f41274e;
        }
        byte[] bArr = this.f41270a;
        this.f41274e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long m38345z() throws IOException {
        int i2 = this.f41274e;
        if (this.f41272c - i2 < 8) {
            m38302O(8);
            i2 = this.f41274e;
        }
        byte[] bArr = this.f41270a;
        this.f41274e = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    private C10746e(C10755n c10755n) {
        this.f41277h = false;
        this.f41279j = Integer.MAX_VALUE;
        this.f41281l = 64;
        this.f41282m = 67108864;
        this.f41283n = null;
        this.f41270a = c10755n.f41325g;
        int iMo38270M = c10755n.mo38270M();
        this.f41274e = iMo38270M;
        this.f41272c = iMo38270M + c10755n.size();
        this.f41278i = -this.f41274e;
        this.f41275f = null;
        this.f41271b = true;
    }
}
