package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC2061g {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f24832c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f24833d = p0.C();

    /* renamed from: a, reason: collision with root package name */
    C2065k f24834a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24835b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f24836e;

        /* renamed from: f, reason: collision with root package name */
        final int f24837f;

        /* renamed from: g, reason: collision with root package name */
        int f24838g;

        /* renamed from: h, reason: collision with root package name */
        int f24839h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f24836e = bArr;
            this.f24837f = bArr.length;
        }

        final void b1(byte b10) {
            byte[] bArr = this.f24836e;
            int i10 = this.f24838g;
            this.f24838g = i10 + 1;
            bArr[i10] = b10;
            this.f24839h++;
        }

        final void c1(int i10) {
            byte[] bArr = this.f24836e;
            int i11 = this.f24838g;
            int i12 = i11 + 1;
            this.f24838g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f24838g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f24838g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f24838g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f24839h += 4;
        }

        final void d1(long j10) {
            byte[] bArr = this.f24836e;
            int i10 = this.f24838g;
            int i11 = i10 + 1;
            this.f24838g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f24838g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f24838g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f24838g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f24838g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f24838g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f24838g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f24838g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f24839h += 8;
        }

        final void e1(int i10) {
            if (i10 >= 0) {
                g1(i10);
            } else {
                h1(i10);
            }
        }

        final void f1(int i10, int i11) {
            g1(r0.c(i10, i11));
        }

        final void g1(int i10) {
            if (!CodedOutputStream.f24833d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f24836e;
                    int i11 = this.f24838g;
                    this.f24838g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f24839h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f24836e;
                int i12 = this.f24838g;
                this.f24838g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f24839h++;
                return;
            }
            long j10 = this.f24838g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f24836e;
                int i13 = this.f24838g;
                this.f24838g = i13 + 1;
                p0.H(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f24836e;
            int i14 = this.f24838g;
            this.f24838g = i14 + 1;
            p0.H(bArr4, i14, (byte) i10);
            this.f24839h += (int) (this.f24838g - j10);
        }

        final void h1(long j10) {
            if (!CodedOutputStream.f24833d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f24836e;
                    int i10 = this.f24838g;
                    this.f24838g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f24839h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f24836e;
                int i11 = this.f24838g;
                this.f24838g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f24839h++;
                return;
            }
            long j11 = this.f24838g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f24836e;
                int i12 = this.f24838g;
                this.f24838g = i12 + 1;
                p0.H(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f24836e;
            int i13 = this.f24838g;
            this.f24838g = i13 + 1;
            p0.H(bArr4, i13, (byte) j10);
            this.f24839h += (int) (this.f24838g - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static final class d extends b {

        /* renamed from: i, reason: collision with root package name */
        private final OutputStream f24844i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f24844i = outputStream;
        }

        private void i1() throws IOException {
            this.f24844i.write(this.f24836e, 0, this.f24838g);
            this.f24838g = 0;
        }

        private void j1(int i10) throws IOException {
            if (this.f24837f - this.f24838g < i10) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void E0(int i10, int i11) throws IOException {
            j1(20);
            f1(i10, 0);
            e1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void F0(int i10) throws IOException {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void I0(int i10, P p10, f0 f0Var) throws IOException {
            W0(i10, 2);
            m1(p10, f0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(P p10) throws IOException {
            Y0(p10.f());
            p10.k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(int i10, P p10) throws IOException {
            W0(1, 3);
            X0(2, i10);
            l1(3, p10);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i10, AbstractC2062h abstractC2062h) throws IOException {
            W0(1, 3);
            X0(2, i10);
            o0(3, abstractC2062h);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void U0(int i10, String str) throws IOException {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iX = CodedOutputStream.X(length);
                int i10 = iX + length;
                int i11 = this.f24837f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iF = q0.f(str, bArr, 0, length);
                    Y0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i10 > i11 - this.f24838g) {
                    i1();
                }
                int iX2 = CodedOutputStream.X(str.length());
                int i12 = this.f24838g;
                try {
                    if (iX2 == iX) {
                        int i13 = i12 + iX2;
                        this.f24838g = i13;
                        int iF2 = q0.f(str, this.f24836e, i13, this.f24837f - i13);
                        this.f24838g = i12;
                        iG = (iF2 - i12) - iX2;
                        g1(iG);
                        this.f24838g = iF2;
                    } else {
                        iG = q0.g(str);
                        g1(iG);
                        this.f24838g = q0.f(str, this.f24836e, this.f24838g, iG);
                    }
                    this.f24839h += iG;
                } catch (q0.d e10) {
                    this.f24839h -= this.f24838g - i12;
                    this.f24838g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (q0.d e12) {
                d0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int i10, int i11) throws IOException {
            Y0(r0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i10, int i11) throws IOException {
            j1(20);
            f1(i10, 0);
            g1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i10) throws IOException {
            j1(5);
            g1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(int i10, long j10) throws IOException {
            j1(20);
            f1(i10, 0);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC2061g
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(long j10) throws IOException {
            j1(10);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c0() throws IOException {
            if (this.f24838g > 0) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j0(byte b10) throws IOException {
            if (this.f24838g == this.f24837f) {
                i1();
            }
            b1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k0(int i10, boolean z10) throws IOException {
            j1(11);
            f1(i10, 0);
            b1(z10 ? (byte) 1 : (byte) 0);
        }

        public void k1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f24837f;
            int i13 = this.f24838g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f24836e, i13, i11);
                this.f24838g += i11;
                this.f24839h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f24836e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f24838g = this.f24837f;
            this.f24839h += i14;
            i1();
            if (i16 <= this.f24837f) {
                System.arraycopy(bArr, i15, this.f24836e, 0, i16);
                this.f24838g = i16;
            } else {
                this.f24844i.write(bArr, i15, i16);
            }
            this.f24839h += i16;
        }

        public void l1(int i10, P p10) throws IOException {
            W0(i10, 2);
            J0(p10);
        }

        void m1(P p10, f0 f0Var) throws IOException {
            Y0(((AbstractC2055a) p10).m(f0Var));
            f0Var.i(p10, this.f24834a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(byte[] bArr, int i10, int i11) throws IOException {
            Y0(i11);
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(int i10, AbstractC2062h abstractC2062h) throws IOException {
            W0(i10, 2);
            p0(abstractC2062h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void p0(AbstractC2062h abstractC2062h) throws IOException {
            Y0(abstractC2062h.size());
            abstractC2062h.O(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u0(int i10, int i11) throws IOException {
            j1(14);
            f1(i10, 5);
            c1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i10) throws IOException {
            j1(4);
            c1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i10, long j10) throws IOException {
            j1(18);
            f1(i10, 1);
            d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x0(long j10) throws IOException {
            j1(8);
            d1(j10);
        }
    }

    public static int A(int i10, C c10) {
        return V(i10) + B(c10);
    }

    public static int B(C c10) {
        return C(c10.b());
    }

    static int C(int i10) {
        return X(i10) + i10;
    }

    public static int D(int i10, P p10) {
        return (V(1) * 2) + W(2, i10) + E(3, p10);
    }

    public static int E(int i10, P p10) {
        return V(i10) + G(p10);
    }

    static int F(int i10, P p10, f0 f0Var) {
        return V(i10) + H(p10, f0Var);
    }

    public static int G(P p10) {
        return C(p10.f());
    }

    static int H(P p10, f0 f0Var) {
        return C(((AbstractC2055a) p10).m(f0Var));
    }

    static int I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int J(int i10, AbstractC2062h abstractC2062h) {
        return (V(1) * 2) + W(2, i10) + g(3, abstractC2062h);
    }

    @Deprecated
    public static int K(int i10) {
        return X(i10);
    }

    public static int L(int i10, int i11) {
        return V(i10) + M(i11);
    }

    public static int M(int i10) {
        return 4;
    }

    public static int N(int i10, long j10) {
        return V(i10) + O(j10);
    }

    public static int O(long j10) {
        return 8;
    }

    public static int P(int i10, int i11) {
        return V(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return X(a0(i10));
    }

    public static int R(int i10, long j10) {
        return V(i10) + S(j10);
    }

    public static int S(long j10) {
        return Z(b0(j10));
    }

    public static int T(int i10, String str) {
        return V(i10) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(C2079z.f25184a).length;
        }
        return C(length);
    }

    public static int V(int i10) {
        return X(r0.c(i10, 0));
    }

    public static int W(int i10, int i11) {
        return V(i10) + X(i11);
    }

    public static int X(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Y(int i10, long j10) {
        return V(i10) + Z(j10);
    }

    public static int Z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return V(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int g(int i10, AbstractC2062h abstractC2062h) {
        return V(i10) + h(abstractC2062h);
    }

    public static CodedOutputStream g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(AbstractC2062h abstractC2062h) {
        return C(abstractC2062h.size());
    }

    public static CodedOutputStream h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int i(int i10, double d10) {
        return V(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return V(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return V(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return V(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return V(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, P p10, f0 f0Var) {
        return (V(i10) * 2) + u(p10, f0Var);
    }

    @Deprecated
    public static int t(P p10) {
        return p10.f();
    }

    @Deprecated
    static int u(P p10, f0 f0Var) {
        return ((AbstractC2055a) p10).m(f0Var);
    }

    public static int v(int i10, int i11) {
        return V(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return X(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return V(i10) + y(j10);
    }

    public static int y(long j10) {
        return Z(j10);
    }

    public static int z(int i10, C c10) {
        return (V(1) * 2) + W(2, i10) + A(3, c10);
    }

    @Deprecated
    public final void A0(int i10, P p10) {
        W0(i10, 3);
        C0(p10);
        W0(i10, 4);
    }

    @Deprecated
    final void B0(int i10, P p10, f0 f0Var) {
        W0(i10, 3);
        D0(p10, f0Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void C0(P p10) {
        p10.k(this);
    }

    @Deprecated
    final void D0(P p10, f0 f0Var) {
        f0Var.i(p10, this.f24834a);
    }

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public final void G0(int i10, long j10) {
        Z0(i10, j10);
    }

    public final void H0(long j10) {
        a1(j10);
    }

    abstract void I0(int i10, P p10, f0 f0Var);

    public abstract void J0(P p10);

    public abstract void K0(int i10, P p10);

    public abstract void L0(int i10, AbstractC2062h abstractC2062h);

    public final void M0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void N0(int i10) {
        v0(i10);
    }

    public final void O0(int i10, long j10) {
        w0(i10, j10);
    }

    public final void P0(long j10) {
        x0(j10);
    }

    public final void Q0(int i10, int i11) {
        X0(i10, a0(i11));
    }

    public final void R0(int i10) {
        Y0(a0(i10));
    }

    public final void S0(int i10, long j10) {
        Z0(i10, b0(j10));
    }

    public final void T0(long j10) {
        a1(b0(j10));
    }

    public abstract void U0(int i10, String str);

    public abstract void V0(String str);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10, int i11);

    public abstract void Y0(int i10);

    public abstract void Z0(int i10, long j10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC2061g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a1(long j10);

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0();

    final void d0(String str, q0.d dVar) throws OutOfSpaceException {
        f24832c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C2079z.f25184a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    boolean e0() {
        return this.f24835b;
    }

    public abstract int i0();

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z10);

    public final void l0(boolean z10) {
        j0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i10, int i11);

    public abstract void o0(int i10, AbstractC2062h abstractC2062h);

    public abstract void p0(AbstractC2062h abstractC2062h);

    public final void q0(int i10, double d10) {
        w0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r0(double d10) {
        x0(Double.doubleToRawLongBits(d10));
    }

    public final void s0(int i10, int i11) {
        E0(i10, i11);
    }

    public final void t0(int i10) {
        F0(i10);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, long j10);

    public abstract void x0(long j10);

    public final void y0(int i10, float f10) {
        u0(i10, Float.floatToRawIntBits(f10));
    }

    public final void z0(float f10) {
        v0(Float.floatToRawIntBits(f10));
    }

    private CodedOutputStream() {
    }

    private static class c extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f24840e;

        /* renamed from: f, reason: collision with root package name */
        private final int f24841f;

        /* renamed from: g, reason: collision with root package name */
        private final int f24842g;

        /* renamed from: h, reason: collision with root package name */
        private int f24843h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f24840e = bArr;
            this.f24841f = i10;
            this.f24843h = i10;
            this.f24842g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i10, int i11) throws OutOfSpaceException {
            W0(i10, 0);
            F0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void I0(int i10, P p10, f0 f0Var) throws OutOfSpaceException {
            W0(i10, 2);
            Y0(((AbstractC2055a) p10).m(f0Var));
            f0Var.i(p10, this.f24834a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(P p10) throws OutOfSpaceException {
            Y0(p10.f());
            p10.k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(int i10, P p10) throws OutOfSpaceException {
            W0(1, 3);
            X0(2, i10);
            c1(3, p10);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L0(int i10, AbstractC2062h abstractC2062h) throws OutOfSpaceException {
            W0(1, 3);
            X0(2, i10);
            o0(3, abstractC2062h);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U0(int i10, String str) throws OutOfSpaceException {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(String str) throws OutOfSpaceException {
            int i10 = this.f24843h;
            try {
                int iX = CodedOutputStream.X(str.length() * 3);
                int iX2 = CodedOutputStream.X(str.length());
                if (iX2 == iX) {
                    int i11 = i10 + iX2;
                    this.f24843h = i11;
                    int iF = q0.f(str, this.f24840e, i11, i0());
                    this.f24843h = i10;
                    Y0((iF - i10) - iX2);
                    this.f24843h = iF;
                } else {
                    Y0(q0.g(str));
                    this.f24843h = q0.f(str, this.f24840e, this.f24843h, i0());
                }
            } catch (q0.d e10) {
                this.f24843h = i10;
                d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int i10, int i11) throws OutOfSpaceException {
            Y0(r0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i10, int i11) throws OutOfSpaceException {
            W0(i10, 0);
            Y0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i10) throws OutOfSpaceException {
            if (!CodedOutputStream.f24833d || C2058d.c() || i0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f24840e;
                        int i11 = this.f24843h;
                        this.f24843h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f24840e;
                int i12 = this.f24843h;
                this.f24843h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f24840e;
                int i13 = this.f24843h;
                this.f24843h = i13 + 1;
                p0.H(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f24840e;
            int i14 = this.f24843h;
            this.f24843h = i14 + 1;
            p0.H(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f24840e;
                int i16 = this.f24843h;
                this.f24843h = i16 + 1;
                p0.H(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f24840e;
            int i17 = this.f24843h;
            this.f24843h = i17 + 1;
            p0.H(bArr6, i17, (byte) (i15 | 128));
            int i18 = i10 >>> 14;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f24840e;
                int i19 = this.f24843h;
                this.f24843h = i19 + 1;
                p0.H(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f24840e;
            int i20 = this.f24843h;
            this.f24843h = i20 + 1;
            p0.H(bArr8, i20, (byte) (i18 | 128));
            int i21 = i10 >>> 21;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f24840e;
                int i22 = this.f24843h;
                this.f24843h = i22 + 1;
                p0.H(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f24840e;
            int i23 = this.f24843h;
            this.f24843h = i23 + 1;
            p0.H(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f24840e;
            int i24 = this.f24843h;
            this.f24843h = i24 + 1;
            p0.H(bArr11, i24, (byte) (i10 >>> 28));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(int i10, long j10) throws OutOfSpaceException {
            W0(i10, 0);
            a1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC2061g
        public final void a(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a1(long j10) throws OutOfSpaceException {
            if (CodedOutputStream.f24833d && i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f24840e;
                    int i10 = this.f24843h;
                    this.f24843h = i10 + 1;
                    p0.H(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f24840e;
                int i11 = this.f24843h;
                this.f24843h = i11 + 1;
                p0.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f24840e;
                    int i12 = this.f24843h;
                    this.f24843h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), 1), e10);
                }
            }
            byte[] bArr4 = this.f24840e;
            int i13 = this.f24843h;
            this.f24843h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void b1(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i10, this.f24840e, this.f24843h, i11);
                this.f24843h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), Integer.valueOf(i11)), e10);
            }
        }

        public final void c1(int i10, P p10) throws OutOfSpaceException {
            W0(i10, 2);
            J0(p10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int i0() {
            return this.f24842g - this.f24843h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j0(byte b10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f24840e;
                int i10 = this.f24843h;
                this.f24843h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k0(int i10, boolean z10) throws OutOfSpaceException {
            W0(i10, 0);
            j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n0(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            Y0(i11);
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(int i10, AbstractC2062h abstractC2062h) throws OutOfSpaceException {
            W0(i10, 2);
            p0(abstractC2062h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p0(AbstractC2062h abstractC2062h) throws OutOfSpaceException {
            Y0(abstractC2062h.size());
            abstractC2062h.O(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(int i10, int i11) throws OutOfSpaceException {
            W0(i10, 5);
            v0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f24840e;
                int i11 = this.f24843h;
                int i12 = i11 + 1;
                this.f24843h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f24843h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f24843h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f24843h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(int i10, long j10) throws OutOfSpaceException {
            W0(i10, 1);
            x0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(long j10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f24840e;
                int i10 = this.f24843h;
                int i11 = i10 + 1;
                this.f24843h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f24843h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f24843h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f24843h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f24843h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f24843h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f24843h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f24843h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24843h), Integer.valueOf(this.f24842g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c0() {
        }
    }
}
