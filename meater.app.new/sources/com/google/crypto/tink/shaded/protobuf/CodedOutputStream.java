package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends AbstractC2897g {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f37722c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f37723d = p0.E();

    /* renamed from: a, reason: collision with root package name */
    C2901k f37724a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37725b;

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

    private static class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f37726e;

        /* renamed from: f, reason: collision with root package name */
        private final int f37727f;

        /* renamed from: g, reason: collision with root package name */
        private final int f37728g;

        /* renamed from: h, reason: collision with root package name */
        private int f37729h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f37726e = bArr;
            this.f37727f = i10;
            this.f37729h = i10;
            this.f37728g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void A0(int i10, P p10) throws OutOfSpaceException {
            L0(1, 3);
            M0(2, i10);
            S0(3, p10);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i10, AbstractC2898h abstractC2898h) throws OutOfSpaceException {
            L0(1, 3);
            M0(2, i10);
            i0(3, abstractC2898h);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void K0(int i10, String str) throws OutOfSpaceException {
            L0(i10, 2);
            U0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void L0(int i10, int i11) throws OutOfSpaceException {
            N0(r0.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M0(int i10, int i11) throws OutOfSpaceException {
            L0(i10, 0);
            N0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void N0(int i10) throws OutOfSpaceException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f37726e;
                    int i11 = this.f37729h;
                    this.f37729h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), 1), e10);
                }
            }
            byte[] bArr2 = this.f37726e;
            int i12 = this.f37729h;
            this.f37729h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void O0(int i10, long j10) throws OutOfSpaceException {
            L0(i10, 0);
            P0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P0(long j10) throws OutOfSpaceException {
            if (CodedOutputStream.f37723d && e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f37726e;
                    int i10 = this.f37729h;
                    this.f37729h = i10 + 1;
                    p0.K(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f37726e;
                int i11 = this.f37729h;
                this.f37729h = i11 + 1;
                p0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f37726e;
                    int i12 = this.f37729h;
                    this.f37729h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), 1), e10);
                }
            }
            byte[] bArr4 = this.f37726e;
            int i13 = this.f37729h;
            this.f37729h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void Q0(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i10, this.f37726e, this.f37729h, i11);
                this.f37729h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), Integer.valueOf(i11)), e10);
            }
        }

        public final void R0(AbstractC2898h abstractC2898h) throws OutOfSpaceException {
            N0(abstractC2898h.size());
            abstractC2898h.Q(this);
        }

        public final void S0(int i10, P p10) throws OutOfSpaceException {
            L0(i10, 2);
            T0(p10);
        }

        public final void T0(P p10) throws OutOfSpaceException {
            N0(p10.f());
            p10.k(this);
        }

        public final void U0(String str) throws OutOfSpaceException {
            int i10 = this.f37729h;
            try {
                int iV = CodedOutputStream.V(str.length() * 3);
                int iV2 = CodedOutputStream.V(str.length());
                if (iV2 == iV) {
                    int i11 = i10 + iV2;
                    this.f37729h = i11;
                    int iF = q0.f(str, this.f37726e, i11, e0());
                    this.f37729h = i10;
                    N0((iF - i10) - iV2);
                    this.f37729h = iF;
                } else {
                    N0(q0.g(str));
                    this.f37729h = q0.f(str, this.f37726e, this.f37729h, e0());
                }
            } catch (q0.d e10) {
                this.f37729h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.AbstractC2897g
        public final void a(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            Q0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int e0() {
            return this.f37728g - this.f37729h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void f0(byte b10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37726e;
                int i10 = this.f37729h;
                this.f37729h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(int i10, boolean z10) throws OutOfSpaceException {
            L0(i10, 0);
            f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i10, AbstractC2898h abstractC2898h) throws OutOfSpaceException {
            L0(i10, 2);
            R0(abstractC2898h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i10, int i11) throws OutOfSpaceException {
            L0(i10, 5);
            o0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37726e;
                int i11 = this.f37729h;
                int i12 = i11 + 1;
                this.f37729h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f37729h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f37729h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f37729h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i10, long j10) throws OutOfSpaceException {
            L0(i10, 1);
            q0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(long j10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37726e;
                int i10 = this.f37729h;
                int i11 = i10 + 1;
                this.f37729h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f37729h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f37729h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f37729h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f37729h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f37729h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f37729h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f37729h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37729h), Integer.valueOf(this.f37728g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void v0(int i10, int i11) throws OutOfSpaceException {
            L0(i10, 0);
            w0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w0(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                N0(i10);
            } else {
                P0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void z0(int i10, P p10, f0 f0Var) throws OutOfSpaceException {
            L0(i10, 2);
            N0(((AbstractC2891a) p10).m(f0Var));
            f0Var.i(p10, this.f37724a);
        }
    }

    public static int A(int i10, C c10) {
        return T(i10) + B(c10);
    }

    public static int B(C c10) {
        return C(c10.b());
    }

    static int C(int i10) {
        return V(i10) + i10;
    }

    public static int D(int i10, P p10) {
        return (T(1) * 2) + U(2, i10) + E(3, p10);
    }

    public static int E(int i10, P p10) {
        return T(i10) + G(p10);
    }

    static int F(int i10, P p10, f0 f0Var) {
        return T(i10) + H(p10, f0Var);
    }

    public static int G(P p10) {
        return C(p10.f());
    }

    static int H(P p10, f0 f0Var) {
        return C(((AbstractC2891a) p10).m(f0Var));
    }

    public static int I(int i10, AbstractC2898h abstractC2898h) {
        return (T(1) * 2) + U(2, i10) + g(3, abstractC2898h);
    }

    public static int J(int i10, int i11) {
        return T(i10) + K(i11);
    }

    public static int K(int i10) {
        return 4;
    }

    public static int L(int i10, long j10) {
        return T(i10) + M(j10);
    }

    public static int M(long j10) {
        return 8;
    }

    public static int N(int i10, int i11) {
        return T(i10) + O(i11);
    }

    public static int O(int i10) {
        return V(Y(i10));
    }

    public static int P(int i10, long j10) {
        return T(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return X(Z(j10));
    }

    public static int R(int i10, String str) {
        return T(i10) + S(str);
    }

    public static int S(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(C2915z.f38061b).length;
        }
        return C(length);
    }

    public static int T(int i10) {
        return V(r0.c(i10, 0));
    }

    public static int U(int i10, int i11) {
        return T(i10) + V(i11);
    }

    public static int V(int i10) {
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

    public static int W(int i10, long j10) {
        return T(i10) + X(j10);
    }

    public static int X(long j10) {
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

    public static int Y(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long Z(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int d(int i10, boolean z10) {
        return T(i10) + e(z10);
    }

    public static CodedOutputStream d0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, AbstractC2898h abstractC2898h) {
        return T(i10) + h(abstractC2898h);
    }

    public static int h(AbstractC2898h abstractC2898h) {
        return C(abstractC2898h.size());
    }

    public static int i(int i10, double d10) {
        return T(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return T(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return T(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return T(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return T(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, P p10, f0 f0Var) {
        return (T(i10) * 2) + u(p10, f0Var);
    }

    @Deprecated
    public static int t(P p10) {
        return p10.f();
    }

    @Deprecated
    static int u(P p10, f0 f0Var) {
        return ((AbstractC2891a) p10).m(f0Var);
    }

    public static int v(int i10, int i11) {
        return T(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return V(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return T(i10) + y(j10);
    }

    public static int y(long j10) {
        return X(j10);
    }

    public static int z(int i10, C c10) {
        return (T(1) * 2) + U(2, i10) + A(3, c10);
    }

    public abstract void A0(int i10, P p10);

    public abstract void B0(int i10, AbstractC2898h abstractC2898h);

    public final void C0(int i10, int i11) {
        n0(i10, i11);
    }

    public final void D0(int i10) {
        o0(i10);
    }

    public final void E0(int i10, long j10) {
        p0(i10, j10);
    }

    public final void F0(long j10) {
        q0(j10);
    }

    public final void G0(int i10, int i11) {
        M0(i10, Y(i11));
    }

    public final void H0(int i10) {
        N0(Y(i10));
    }

    public final void I0(int i10, long j10) {
        O0(i10, Z(j10));
    }

    public final void J0(long j10) {
        P0(Z(j10));
    }

    public abstract void K0(int i10, String str);

    public abstract void L0(int i10, int i11);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10);

    public abstract void O0(int i10, long j10);

    public abstract void P0(long j10);

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2897g
    public abstract void a(byte[] bArr, int i10, int i11);

    final void a0(String str, q0.d dVar) throws OutOfSpaceException {
        f37722c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C2915z.f38061b);
        try {
            N0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean b0() {
        return this.f37725b;
    }

    public final void c() {
        if (e0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int e0();

    public abstract void f0(byte b10);

    public abstract void g0(int i10, boolean z10);

    public final void h0(boolean z10) {
        f0(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void i0(int i10, AbstractC2898h abstractC2898h);

    public final void j0(int i10, double d10) {
        p0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void k0(double d10) {
        q0(Double.doubleToRawLongBits(d10));
    }

    public final void l0(int i10, int i11) {
        v0(i10, i11);
    }

    public final void m0(int i10) {
        w0(i10);
    }

    public abstract void n0(int i10, int i11);

    public abstract void o0(int i10);

    public abstract void p0(int i10, long j10);

    public abstract void q0(long j10);

    public final void r0(int i10, float f10) {
        n0(i10, Float.floatToRawIntBits(f10));
    }

    public final void s0(float f10) {
        o0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    final void t0(int i10, P p10, f0 f0Var) {
        L0(i10, 3);
        u0(p10, f0Var);
        L0(i10, 4);
    }

    @Deprecated
    final void u0(P p10, f0 f0Var) {
        f0Var.i(p10, this.f37724a);
    }

    public abstract void v0(int i10, int i11);

    public abstract void w0(int i10);

    public final void x0(int i10, long j10) {
        O0(i10, j10);
    }

    public final void y0(long j10) {
        P0(j10);
    }

    abstract void z0(int i10, P p10, f0 f0Var);

    private CodedOutputStream() {
    }
}
