package com.google.protobuf;

import com.google.protobuf.q0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends AbstractC2946f {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f39155c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f39156d = p0.E();

    /* renamed from: a, reason: collision with root package name */
    C2950j f39157a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39158b;

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
        private final byte[] f39159e;

        /* renamed from: f, reason: collision with root package name */
        private final int f39160f;

        /* renamed from: g, reason: collision with root package name */
        private final int f39161g;

        /* renamed from: h, reason: collision with root package name */
        private int f39162h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f39159e = bArr;
            this.f39160f = i10;
            this.f39162h = i10;
            this.f39161g = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A0(int i10, int i11) throws OutOfSpaceException {
            S0(i10, 0);
            B0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                U0(i10);
            } else {
                W0(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void E0(int i10, P p10, f0 f0Var) throws OutOfSpaceException {
            S0(i10, 2);
            U0(((AbstractC2941a) p10).s(f0Var));
            f0Var.h(p10, this.f39157a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F0(P p10) throws OutOfSpaceException {
            U0(p10.f());
            p10.l(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(int i10, P p10) throws OutOfSpaceException {
            S0(1, 3);
            T0(2, i10);
            Y0(3, p10);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i10, AbstractC2947g abstractC2947g) throws OutOfSpaceException {
            S0(1, 3);
            T0(2, i10);
            k0(3, abstractC2947g);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q0(int i10, String str) throws OutOfSpaceException {
            S0(i10, 2);
            R0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R0(String str) throws OutOfSpaceException {
            int i10 = this.f39162h;
            try {
                int iV = CodedOutputStream.V(str.length() * 3);
                int iV2 = CodedOutputStream.V(str.length());
                if (iV2 == iV) {
                    int i11 = i10 + iV2;
                    this.f39162h = i11;
                    int iF = q0.f(str, this.f39159e, i11, e0());
                    this.f39162h = i10;
                    U0((iF - i10) - iV2);
                    this.f39162h = iF;
                } else {
                    U0(q0.g(str));
                    this.f39162h = q0.f(str, this.f39159e, this.f39162h, e0());
                }
            } catch (q0.d e10) {
                this.f39162h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S0(int i10, int i11) throws OutOfSpaceException {
            U0(r0.c(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T0(int i10, int i11) throws OutOfSpaceException {
            S0(i10, 0);
            U0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U0(int i10) throws OutOfSpaceException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f39159e;
                    int i11 = this.f39162h;
                    this.f39162h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), 1), e10);
                }
            }
            byte[] bArr2 = this.f39159e;
            int i12 = this.f39162h;
            this.f39162h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V0(int i10, long j10) throws OutOfSpaceException {
            S0(i10, 0);
            W0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W0(long j10) throws OutOfSpaceException {
            if (CodedOutputStream.f39156d && e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f39159e;
                    int i10 = this.f39162h;
                    this.f39162h = i10 + 1;
                    p0.K(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f39159e;
                int i11 = this.f39162h;
                this.f39162h = i11 + 1;
                p0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f39159e;
                    int i12 = this.f39162h;
                    this.f39162h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), 1), e10);
                }
            }
            byte[] bArr4 = this.f39159e;
            int i13 = this.f39162h;
            this.f39162h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void X0(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i10, this.f39159e, this.f39162h, i11);
                this.f39162h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), Integer.valueOf(i11)), e10);
            }
        }

        public final void Y0(int i10, P p10) throws OutOfSpaceException {
            S0(i10, 2);
            F0(p10);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC2946f
        public final void a(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int e0() {
            return this.f39161g - this.f39162h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(byte b10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f39159e;
                int i10 = this.f39162h;
                this.f39162h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i10, boolean z10) throws OutOfSpaceException {
            S0(i10, 0);
            f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            U0(i11);
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i10, AbstractC2947g abstractC2947g) throws OutOfSpaceException {
            S0(i10, 2);
            l0(abstractC2947g);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(AbstractC2947g abstractC2947g) throws OutOfSpaceException {
            U0(abstractC2947g.size());
            abstractC2947g.L(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i10, int i11) throws OutOfSpaceException {
            S0(i10, 5);
            r0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f39159e;
                int i11 = this.f39162h;
                int i12 = i11 + 1;
                this.f39162h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f39162h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f39162h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f39162h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i10, long j10) throws OutOfSpaceException {
            S0(i10, 1);
            t0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(long j10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f39159e;
                int i10 = this.f39162h;
                int i11 = i10 + 1;
                this.f39162h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f39162h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f39162h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f39162h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f39162h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f39162h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f39162h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f39162h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39162h), Integer.valueOf(this.f39161g), 1), e10);
            }
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
        return C(((AbstractC2941a) p10).s(f0Var));
    }

    public static int I(int i10, AbstractC2947g abstractC2947g) {
        return (T(1) * 2) + U(2, i10) + g(3, abstractC2947g);
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
            length = str.getBytes(C2964y.f39491b).length;
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

    public static int g(int i10, AbstractC2947g abstractC2947g) {
        return T(i10) + h(abstractC2947g);
    }

    public static int h(AbstractC2947g abstractC2947g) {
        return C(abstractC2947g.size());
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
        return ((AbstractC2941a) p10).s(f0Var);
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

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public final void C0(int i10, long j10) {
        V0(i10, j10);
    }

    public final void D0(long j10) {
        W0(j10);
    }

    abstract void E0(int i10, P p10, f0 f0Var);

    public abstract void F0(P p10);

    public abstract void G0(int i10, P p10);

    public abstract void H0(int i10, AbstractC2947g abstractC2947g);

    public final void I0(int i10, int i11) {
        q0(i10, i11);
    }

    public final void J0(int i10) {
        r0(i10);
    }

    public final void K0(int i10, long j10) {
        s0(i10, j10);
    }

    public final void L0(long j10) {
        t0(j10);
    }

    public final void M0(int i10, int i11) {
        T0(i10, Y(i11));
    }

    public final void N0(int i10) {
        U0(Y(i10));
    }

    public final void O0(int i10, long j10) {
        V0(i10, Z(j10));
    }

    public final void P0(long j10) {
        W0(Z(j10));
    }

    public abstract void Q0(int i10, String str);

    public abstract void R0(String str);

    public abstract void S0(int i10, int i11);

    public abstract void T0(int i10, int i11);

    public abstract void U0(int i10);

    public abstract void V0(int i10, long j10);

    public abstract void W0(long j10);

    @Override // com.google.protobuf.AbstractC2946f
    public abstract void a(byte[] bArr, int i10, int i11);

    final void a0(String str, q0.d dVar) throws OutOfSpaceException {
        f39155c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C2964y.f39491b);
        try {
            U0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean b0() {
        return this.f39158b;
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

    public final void i0(byte[] bArr) {
        j0(bArr, 0, bArr.length);
    }

    abstract void j0(byte[] bArr, int i10, int i11);

    public abstract void k0(int i10, AbstractC2947g abstractC2947g);

    public abstract void l0(AbstractC2947g abstractC2947g);

    public final void m0(int i10, double d10) {
        s0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void n0(double d10) {
        t0(Double.doubleToRawLongBits(d10));
    }

    public final void o0(int i10, int i11) {
        A0(i10, i11);
    }

    public final void p0(int i10) {
        B0(i10);
    }

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, long j10);

    public abstract void t0(long j10);

    public final void u0(int i10, float f10) {
        q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void v0(float f10) {
        r0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void w0(int i10, P p10) {
        S0(i10, 3);
        y0(p10);
        S0(i10, 4);
    }

    @Deprecated
    final void x0(int i10, P p10, f0 f0Var) {
        S0(i10, 3);
        z0(p10, f0Var);
        S0(i10, 4);
    }

    @Deprecated
    public final void y0(P p10) {
        p10.l(this);
    }

    @Deprecated
    final void z0(P p10, f0 f0Var) {
        f0Var.h(p10, this.f39157a);
    }

    private CodedOutputStream() {
    }
}
