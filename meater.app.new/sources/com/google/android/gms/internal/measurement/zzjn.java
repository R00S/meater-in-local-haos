package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class zzjn extends V3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f34469b = Logger.getLogger(zzjn.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f34470c = V5.w();

    /* renamed from: a, reason: collision with root package name */
    C2540n4 f34471a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    private static class a extends zzjn {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f34472d;

        /* renamed from: e, reason: collision with root package name */
        private final int f34473e;

        /* renamed from: f, reason: collision with root package name */
        private int f34474f;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.f34472d = bArr;
            this.f34474f = 0;
            this.f34473e = i11;
        }

        private final void E0(byte[] bArr, int i10, int i11) throws zza {
            try {
                System.arraycopy(bArr, i10, this.f34472d, this.f34474f, i11);
                this.f34474f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(this.f34474f, this.f34473e, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void A0(int i10, int i11) {
            B0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void B0(int i10) throws zza {
            int i11;
            int i12 = this.f34474f;
            while ((i10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    throw new zza(i12, this.f34473e, 1, (Throwable) e);
                }
                try {
                    this.f34472d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i12 = i11;
                    throw new zza(i12, this.f34473e, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.f34472d[i12] = (byte) i10;
            this.f34474f = i11;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void C0(int i10, int i11) {
            A0(i10, 0);
            B0(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void N(int i10, InterfaceC2517k5 interfaceC2517k5) {
            A0(1, 3);
            C0(2, i10);
            A0(3, 2);
            Z(interfaceC2517k5);
            A0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void O(int i10, String str) {
            A0(i10, 2);
            R(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void P(int i10, boolean z10) {
            A0(i10, 0);
            x(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void Q(Y3 y32) {
            B0(y32.z());
            y32.x(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void R(String str) throws zza {
            int i10 = this.f34474f;
            try {
                int iO0 = zzjn.o0(str.length() * 3);
                int iO02 = zzjn.o0(str.length());
                if (iO02 != iO0) {
                    B0(X5.a(str));
                    this.f34474f = X5.b(str, this.f34472d, this.f34474f, b());
                    return;
                }
                int i11 = i10 + iO02;
                this.f34474f = i11;
                int iB = X5.b(str, this.f34472d, i11, b());
                this.f34474f = i10;
                B0((iB - i10) - iO02);
                this.f34474f = iB;
            } catch (C2434a6 e10) {
                this.f34474f = i10;
                y(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zza(e11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void X(int i10, Y3 y32) {
            A0(i10, 2);
            Q(y32);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        final void Y(int i10, InterfaceC2517k5 interfaceC2517k5, C5 c52) {
            A0(i10, 2);
            B0(((O3) interfaceC2517k5).e(c52));
            c52.h(interfaceC2517k5, this.f34471a);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void Z(InterfaceC2517k5 interfaceC2517k5) {
            B0(interfaceC2517k5.d());
            interfaceC2517k5.i(this);
        }

        @Override // com.google.android.gms.internal.measurement.V3
        public final void a(byte[] bArr, int i10, int i11) throws zza {
            E0(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final int b() {
            return this.f34473e - this.f34474f;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void f0(int i10, Y3 y32) {
            A0(1, 3);
            C0(2, i10);
            X(3, y32);
            A0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void m0(int i10, long j10) {
            A0(i10, 1);
            n0(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void n0(long j10) throws zza {
            int i10 = this.f34474f;
            try {
                byte[] bArr = this.f34472d;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.f34474f = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(i10, this.f34473e, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void p0(int i10, int i11) {
            A0(i10, 5);
            s0(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void s0(int i10) throws zza {
            int i11 = this.f34474f;
            try {
                byte[] bArr = this.f34472d;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.f34474f = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(i11, this.f34473e, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void t0(int i10, int i11) {
            A0(i10, 0);
            x0(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void u0(int i10, long j10) {
            A0(i10, 0);
            v0(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void v0(long j10) throws zza {
            int i10;
            int i11 = this.f34474f;
            if (!zzjn.f34470c || b() < 10) {
                while ((j10 & (-128)) != 0) {
                    try {
                        int i12 = i11 + 1;
                        try {
                            this.f34472d[i11] = (byte) (((int) j10) | 128);
                            j10 >>>= 7;
                            i11 = i12;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            i11 = i12;
                            throw new zza(i11, this.f34473e, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    }
                }
                i10 = i11 + 1;
                try {
                    this.f34472d[i11] = (byte) j10;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i11 = i10;
                    throw new zza(i11, this.f34473e, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    V5.m(this.f34472d, i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                V5.m(this.f34472d, i11, (byte) j10);
            }
            this.f34474f = i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void x(byte b10) throws zza {
            int i10;
            int i11 = this.f34474f;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                this.f34472d[i11] = b10;
                this.f34474f = i10;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i10;
                throw new zza(i11, this.f34473e, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void x0(int i10) {
            if (i10 >= 0) {
                B0(i10);
            } else {
                v0(i10);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zza(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zza(int i10, int i11, int i12, Throwable th) {
            this(i10, i11, i12, th);
        }

        private zza(long j10, long j11, int i10, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th);
        }
    }

    public static int A(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int B(int i10, long j10) {
        return o0(i10 << 3) + j0(j10);
    }

    public static int C(int i10, Y3 y32) {
        return (o0(8) << 1) + l0(2, i10) + j(3, y32);
    }

    public static int D(int i10, R4 r42) {
        int iO0 = o0(i10 << 3);
        int iA = r42.a();
        return iO0 + o0(iA) + iA;
    }

    private static int D0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    static int E(int i10, InterfaceC2517k5 interfaceC2517k5, C5 c52) {
        return o0(i10 << 3) + t(interfaceC2517k5, c52);
    }

    public static int F(long j10) {
        return j0(j10);
    }

    public static int G(InterfaceC2517k5 interfaceC2517k5) {
        int iD = interfaceC2517k5.d();
        return o0(iD) + iD;
    }

    public static zzjn H(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i10) {
        return j0(i10);
    }

    public static int U(int i10, int i11) {
        return o0(i10 << 3) + j0(i11);
    }

    public static int V(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int W(long j10) {
        return 8;
    }

    public static int b0(int i10) {
        return 4;
    }

    public static int c(double d10) {
        return 8;
    }

    public static int c0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int d(float f10) {
        return 4;
    }

    public static int d0(int i10, long j10) {
        return o0(i10 << 3) + j0(w0(j10));
    }

    public static int e(int i10) {
        return j0(i10);
    }

    public static int e0(long j10) {
        return j0(w0(j10));
    }

    public static int f(int i10, double d10) {
        return o0(i10 << 3) + 8;
    }

    public static int g(int i10, float f10) {
        return o0(i10 << 3) + 4;
    }

    public static int g0(int i10) {
        return o0(D0(i10));
    }

    public static int h(int i10, int i11) {
        return o0(i10 << 3) + j0(i11);
    }

    public static int h0(int i10, int i11) {
        return o0(i10 << 3) + o0(D0(i11));
    }

    public static int i(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int i0(int i10, long j10) {
        return o0(i10 << 3) + j0(j10);
    }

    public static int j(int i10, Y3 y32) {
        int iO0 = o0(i10 << 3);
        int iZ = y32.z();
        return iO0 + o0(iZ) + iZ;
    }

    public static int j0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int k(int i10, R4 r42) {
        return (o0(8) << 1) + l0(2, i10) + D(3, r42);
    }

    public static int k0(int i10) {
        return o0(i10 << 3);
    }

    public static int l(int i10, InterfaceC2517k5 interfaceC2517k5) {
        return (o0(8) << 1) + l0(2, i10) + o0(24) + G(interfaceC2517k5);
    }

    public static int l0(int i10, int i11) {
        return o0(i10 << 3) + o0(i11);
    }

    @Deprecated
    static int m(int i10, InterfaceC2517k5 interfaceC2517k5, C5 c52) {
        return (o0(i10 << 3) << 1) + ((O3) interfaceC2517k5).e(c52);
    }

    public static int n(int i10, String str) {
        return o0(i10 << 3) + u(str);
    }

    public static int o(int i10, boolean z10) {
        return o0(i10 << 3) + 1;
    }

    public static int o0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(Y3 y32) {
        int iZ = y32.z();
        return o0(iZ) + iZ;
    }

    public static int r(R4 r42) {
        int iA = r42.a();
        return o0(iA) + iA;
    }

    @Deprecated
    public static int s(InterfaceC2517k5 interfaceC2517k5) {
        return interfaceC2517k5.d();
    }

    static int t(InterfaceC2517k5 interfaceC2517k5, C5 c52) {
        int iE = ((O3) interfaceC2517k5).e(c52);
        return o0(iE) + iE;
    }

    public static int u(String str) {
        int length;
        try {
            length = X5.a(str);
        } catch (C2434a6 unused) {
            length = str.getBytes(I4.f33783a).length;
        }
        return o0(length) + length;
    }

    public static int v(boolean z10) {
        return 1;
    }

    public static int w(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    private static long w0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z(int i10) {
        return 4;
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public abstract void C0(int i10, int i11);

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void K(float f10) {
        s0(Float.floatToRawIntBits(f10));
    }

    public final void L(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void M(int i10, float f10) {
        p0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void N(int i10, InterfaceC2517k5 interfaceC2517k5);

    public abstract void O(int i10, String str);

    public abstract void P(int i10, boolean z10);

    public abstract void Q(Y3 y32);

    public abstract void R(String str);

    public final void S(boolean z10) {
        x(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void X(int i10, Y3 y32);

    abstract void Y(int i10, InterfaceC2517k5 interfaceC2517k5, C5 c52);

    public abstract void Z(InterfaceC2517k5 interfaceC2517k5);

    public abstract int b();

    public abstract void f0(int i10, Y3 y32);

    public abstract void m0(int i10, long j10);

    public abstract void n0(long j10);

    public abstract void p0(int i10, int i11);

    public final void q0(int i10, long j10) {
        u0(i10, w0(j10));
    }

    public final void r0(long j10) {
        v0(w0(j10));
    }

    public abstract void s0(int i10);

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10, long j10);

    public abstract void v0(long j10);

    public abstract void x(byte b10);

    public abstract void x0(int i10);

    final void y(String str, C2434a6 c2434a6) throws zza {
        f34469b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2434a6);
        byte[] bytes = str.getBytes(I4.f33783a);
        try {
            B0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zza(e10);
        }
    }

    public final void y0(int i10, int i11) {
        C0(i10, D0(i11));
    }

    public final void z0(int i10) {
        B0(D0(i10));
    }

    private zzjn() {
    }
}
