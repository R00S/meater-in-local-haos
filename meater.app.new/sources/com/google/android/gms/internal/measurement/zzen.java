package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzen extends zzdv {

    /* renamed from: a */
    private static final Logger f28046a = Logger.getLogger(zzen.class.getName());

    /* renamed from: b */
    private static final boolean f28047b = C7538k4.m21201m();

    /* renamed from: c */
    C7488c2 f28048c;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzen$a */
    static class C7630a extends zzen {

        /* renamed from: d */
        private final byte[] f28049d;

        /* renamed from: e */
        private final int f28050e;

        /* renamed from: f */
        private final int f28051f;

        /* renamed from: g */
        private int f28052g;

        C7630a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i3 + 0;
            if ((i3 | 0 | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.f28049d = bArr;
            this.f28050e = 0;
            this.f28052g = 0;
            this.f28051f = i4;
        }

        /* renamed from: F0 */
        private final void m22244F0(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.f28049d, this.f28052g, i3);
                this.f28052g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: O */
        public final void mo22212O(int i2) throws IOException {
            if (!zzen.f28047b || C7535k1.m21167b() || mo22221b() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f28049d;
                        int i3 = this.f28052g;
                        this.f28052g = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f28049d;
                int i4 = this.f28052g;
                this.f28052g = i4 + 1;
                bArr2[i4] = (byte) i2;
                return;
            }
            if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f28049d;
                int i5 = this.f28052g;
                this.f28052g = i5 + 1;
                C7538k4.m21200l(bArr3, i5, (byte) i2);
                return;
            }
            byte[] bArr4 = this.f28049d;
            int i6 = this.f28052g;
            this.f28052g = i6 + 1;
            C7538k4.m21200l(bArr4, i6, (byte) (i2 | 128));
            int i7 = i2 >>> 7;
            if ((i7 & (-128)) == 0) {
                byte[] bArr5 = this.f28049d;
                int i8 = this.f28052g;
                this.f28052g = i8 + 1;
                C7538k4.m21200l(bArr5, i8, (byte) i7);
                return;
            }
            byte[] bArr6 = this.f28049d;
            int i9 = this.f28052g;
            this.f28052g = i9 + 1;
            C7538k4.m21200l(bArr6, i9, (byte) (i7 | 128));
            int i10 = i7 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr7 = this.f28049d;
                int i11 = this.f28052g;
                this.f28052g = i11 + 1;
                C7538k4.m21200l(bArr7, i11, (byte) i10);
                return;
            }
            byte[] bArr8 = this.f28049d;
            int i12 = this.f28052g;
            this.f28052g = i12 + 1;
            C7538k4.m21200l(bArr8, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr9 = this.f28049d;
                int i14 = this.f28052g;
                this.f28052g = i14 + 1;
                C7538k4.m21200l(bArr9, i14, (byte) i13);
                return;
            }
            byte[] bArr10 = this.f28049d;
            int i15 = this.f28052g;
            this.f28052g = i15 + 1;
            C7538k4.m21200l(bArr10, i15, (byte) (i13 | 128));
            byte[] bArr11 = this.f28049d;
            int i16 = this.f28052g;
            this.f28052g = i16 + 1;
            C7538k4.m21200l(bArr11, i16, (byte) (i13 >>> 7));
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: P */
        public final void mo22213P(int i2, int i3) throws IOException {
            mo22231m(i2, 0);
            mo22227j(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: R */
        public final void mo22215R(int i2, zzdu zzduVar) throws IOException {
            mo22231m(1, 3);
            mo22218X(2, i2);
            mo22233o(3, zzduVar);
            mo22231m(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: X */
        public final void mo22218X(int i2, int i3) throws IOException {
            mo22231m(i2, 0);
            mo22212O(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: Y */
        public final void mo22219Y(int i2, long j2) throws IOException {
            mo22231m(i2, 1);
            mo22220Z(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: Z */
        public final void mo22220Z(long j2) throws IOException {
            try {
                byte[] bArr = this.f28049d;
                int i2 = this.f28052g;
                int i3 = i2 + 1;
                this.f28052g = i3;
                bArr[i2] = (byte) j2;
                int i4 = i3 + 1;
                this.f28052g = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i4 + 1;
                this.f28052g = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i5 + 1;
                this.f28052g = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i6 + 1;
                this.f28052g = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i7 + 1;
                this.f28052g = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i8 + 1;
                this.f28052g = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.f28052g = i9 + 1;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzdv
        /* renamed from: a */
        public final void mo22158a(byte[] bArr, int i2, int i3) throws IOException {
            m22244F0(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: b */
        public final int mo22221b() {
            return this.f28051f - this.f28052g;
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: e0 */
        public final void mo22222e0(int i2) throws IOException {
            try {
                byte[] bArr = this.f28049d;
                int i3 = this.f28052g;
                int i4 = i3 + 1;
                this.f28052g = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f28052g = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f28052g = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f28052g = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: g */
        public final void mo22224g(byte b2) throws IOException {
            try {
                byte[] bArr = this.f28049d;
                int i2 = this.f28052g;
                this.f28052g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: j */
        public final void mo22227j(int i2) throws IOException {
            if (i2 >= 0) {
                mo22212O(i2);
            } else {
                mo22238t(i2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: j0 */
        public final void mo22228j0(int i2, int i3) throws IOException {
            mo22231m(i2, 5);
            mo22222e0(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: m */
        public final void mo22231m(int i2, int i3) throws IOException {
            mo22212O((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: n */
        public final void mo22232n(int i2, long j2) throws IOException {
            mo22231m(i2, 0);
            mo22238t(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: o */
        public final void mo22233o(int i2, zzdu zzduVar) throws IOException {
            mo22231m(i2, 2);
            mo22239u(zzduVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: p */
        public final void mo22234p(int i2, zzgo zzgoVar) throws IOException {
            mo22231m(1, 3);
            mo22218X(2, i2);
            mo22231m(3, 2);
            mo22240v(zzgoVar);
            mo22231m(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: q */
        final void mo22235q(int i2, zzgo zzgoVar, InterfaceC7567p3 interfaceC7567p3) throws IOException {
            mo22231m(i2, 2);
            zzdl zzdlVar = (zzdl) zzgoVar;
            int iMo22137k = zzdlVar.mo22137k();
            if (iMo22137k == -1) {
                iMo22137k = interfaceC7567p3.mo21096b(zzdlVar);
                zzdlVar.mo22138l(iMo22137k);
            }
            mo22212O(iMo22137k);
            interfaceC7567p3.mo21102h(zzgoVar, this.f28048c);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: r */
        public final void mo22236r(int i2, String str) throws IOException {
            mo22231m(i2, 2);
            mo22241w(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: s */
        public final void mo22237s(int i2, boolean z) throws IOException {
            mo22231m(i2, 0);
            mo22224g(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: t */
        public final void mo22238t(long j2) throws IOException {
            if (zzen.f28047b && mo22221b() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f28049d;
                    int i2 = this.f28052g;
                    this.f28052g = i2 + 1;
                    C7538k4.m21200l(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f28049d;
                int i3 = this.f28052g;
                this.f28052g = i3 + 1;
                C7538k4.m21200l(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f28049d;
                    int i4 = this.f28052g;
                    this.f28052g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28052g), Integer.valueOf(this.f28051f), 1), e2);
                }
            }
            byte[] bArr4 = this.f28049d;
            int i5 = this.f28052g;
            this.f28052g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: u */
        public final void mo22239u(zzdu zzduVar) throws IOException {
            mo22212O(zzduVar.mo21396f());
            zzduVar.mo21414s(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: v */
        public final void mo22240v(zzgo zzgoVar) throws IOException {
            mo22212O(zzgoVar.mo22272i());
            zzgoVar.mo22271g(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        /* renamed from: w */
        public final void mo22241w(String str) throws IOException {
            int i2 = this.f28052g;
            try {
                int iM22198o0 = zzen.m22198o0(str.length() * 3);
                int iM22198o02 = zzen.m22198o0(str.length());
                if (iM22198o02 != iM22198o0) {
                    mo22212O(C7556n4.m21250d(str));
                    this.f28052g = C7556n4.m21251e(str, this.f28049d, this.f28052g, mo22221b());
                    return;
                }
                int i3 = i2 + iM22198o02;
                this.f28052g = i3;
                int iM21251e = C7556n4.m21251e(str, this.f28049d, i3, mo22221b());
                this.f28052g = i2;
                mo22212O((iM21251e - i2) - iM22198o02);
                this.f28052g = iM21251e;
            } catch (C7574q4 e2) {
                this.f28052g = i2;
                m22242x(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zza(e3);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zza(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzen() {
    }

    /* renamed from: A */
    public static int m22162A(float f2) {
        return 4;
    }

    /* renamed from: A0 */
    public static int m22163A0(int i2, int i3) {
        return m22191g0(i2) + 4;
    }

    /* renamed from: B */
    public static int m22164B(int i2, double d2) {
        return m22191g0(i2) + 8;
    }

    /* renamed from: B0 */
    public static int m22165B0(int i2) {
        return m22194k0(i2);
    }

    /* renamed from: C */
    public static int m22166C(int i2, float f2) {
        return m22191g0(i2) + 4;
    }

    /* renamed from: C0 */
    public static int m22167C0(int i2, int i3) {
        return m22191g0(i2) + m22194k0(i3);
    }

    /* renamed from: D */
    public static int m22168D(int i2, zzft zzftVar) {
        return (m22191g0(1) << 1) + m22199p0(2, i2) + m22185c(3, zzftVar);
    }

    @Deprecated
    /* renamed from: D0 */
    public static int m22169D0(int i2) {
        return m22198o0(i2);
    }

    /* renamed from: E */
    public static int m22170E(int i2, zzgo zzgoVar) {
        return (m22191g0(1) << 1) + m22199p0(2, i2) + m22191g0(3) + m22176J(zzgoVar);
    }

    /* renamed from: E0 */
    private static int m22171E0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    /* renamed from: F */
    static int m22172F(int i2, zzgo zzgoVar, InterfaceC7567p3 interfaceC7567p3) {
        return m22191g0(i2) + m22189e(zzgoVar, interfaceC7567p3);
    }

    /* renamed from: G */
    public static int m22173G(int i2, String str) {
        return m22191g0(i2) + m22177K(str);
    }

    /* renamed from: H */
    public static int m22174H(int i2, boolean z) {
        return m22191g0(i2) + 1;
    }

    /* renamed from: I */
    public static int m22175I(zzdu zzduVar) {
        int iMo21396f = zzduVar.mo21396f();
        return m22198o0(iMo21396f) + iMo21396f;
    }

    /* renamed from: J */
    public static int m22176J(zzgo zzgoVar) {
        int iMo22272i = zzgoVar.mo22272i();
        return m22198o0(iMo22272i) + iMo22272i;
    }

    /* renamed from: K */
    public static int m22177K(String str) {
        int length;
        try {
            length = C7556n4.m21250d(str);
        } catch (C7574q4 unused) {
            length = str.getBytes(zzff.f28137a).length;
        }
        return m22198o0(length) + length;
    }

    /* renamed from: L */
    public static int m22178L(boolean z) {
        return 1;
    }

    /* renamed from: M */
    public static int m22179M(byte[] bArr) {
        int length = bArr.length;
        return m22198o0(length) + length;
    }

    /* renamed from: T */
    public static int m22180T(int i2, zzdu zzduVar) {
        int iM22191g0 = m22191g0(i2);
        int iMo21396f = zzduVar.mo21396f();
        return iM22191g0 + m22198o0(iMo21396f) + iMo21396f;
    }

    @Deprecated
    /* renamed from: U */
    static int m22181U(int i2, zzgo zzgoVar, InterfaceC7567p3 interfaceC7567p3) {
        int iM22191g0 = m22191g0(i2) << 1;
        zzdl zzdlVar = (zzdl) zzgoVar;
        int iMo22137k = zzdlVar.mo22137k();
        if (iMo22137k == -1) {
            iMo22137k = interfaceC7567p3.mo21096b(zzdlVar);
            zzdlVar.mo22138l(iMo22137k);
        }
        return iM22191g0 + iMo22137k;
    }

    @Deprecated
    /* renamed from: V */
    public static int m22182V(zzgo zzgoVar) {
        return zzgoVar.mo22272i();
    }

    /* renamed from: b0 */
    public static int m22184b0(int i2, long j2) {
        return m22191g0(i2) + m22193i0(j2);
    }

    /* renamed from: c */
    public static int m22185c(int i2, zzft zzftVar) {
        int iM22191g0 = m22191g0(i2);
        int iM22308b = zzftVar.m22308b();
        return iM22191g0 + m22198o0(iM22308b) + iM22308b;
    }

    /* renamed from: c0 */
    public static int m22186c0(int i2, zzdu zzduVar) {
        return (m22191g0(1) << 1) + m22199p0(2, i2) + m22180T(3, zzduVar);
    }

    /* renamed from: d */
    public static int m22187d(zzft zzftVar) {
        int iM22308b = zzftVar.m22308b();
        return m22198o0(iM22308b) + iM22308b;
    }

    /* renamed from: d0 */
    public static int m22188d0(long j2) {
        return m22193i0(j2);
    }

    /* renamed from: e */
    static int m22189e(zzgo zzgoVar, InterfaceC7567p3 interfaceC7567p3) {
        zzdl zzdlVar = (zzdl) zzgoVar;
        int iMo22137k = zzdlVar.mo22137k();
        if (iMo22137k == -1) {
            iMo22137k = interfaceC7567p3.mo21096b(zzdlVar);
            zzdlVar.mo22138l(iMo22137k);
        }
        return m22198o0(iMo22137k) + iMo22137k;
    }

    /* renamed from: f */
    public static zzen m22190f(byte[] bArr) {
        return new C7630a(bArr, 0, bArr.length);
    }

    /* renamed from: g0 */
    public static int m22191g0(int i2) {
        return m22198o0(i2 << 3);
    }

    /* renamed from: h0 */
    public static int m22192h0(int i2, long j2) {
        return m22191g0(i2) + m22193i0(j2);
    }

    /* renamed from: i0 */
    public static int m22193i0(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    /* renamed from: k0 */
    public static int m22194k0(int i2) {
        if (i2 >= 0) {
            return m22198o0(i2);
        }
        return 10;
    }

    /* renamed from: l0 */
    public static int m22195l0(int i2, int i3) {
        return m22191g0(i2) + m22194k0(i3);
    }

    /* renamed from: m0 */
    public static int m22196m0(int i2, long j2) {
        return m22191g0(i2) + m22193i0(m22208y0(j2));
    }

    /* renamed from: n0 */
    public static int m22197n0(long j2) {
        return m22193i0(m22208y0(j2));
    }

    /* renamed from: o0 */
    public static int m22198o0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: p0 */
    public static int m22199p0(int i2, int i3) {
        return m22191g0(i2) + m22198o0(i3);
    }

    /* renamed from: q0 */
    public static int m22200q0(int i2, long j2) {
        return m22191g0(i2) + 8;
    }

    /* renamed from: r0 */
    public static int m22201r0(long j2) {
        return 8;
    }

    /* renamed from: s0 */
    public static int m22202s0(int i2) {
        return m22198o0(m22171E0(i2));
    }

    /* renamed from: t0 */
    public static int m22203t0(int i2, int i3) {
        return m22191g0(i2) + m22198o0(m22171E0(i3));
    }

    /* renamed from: u0 */
    public static int m22204u0(int i2, long j2) {
        return m22191g0(i2) + 8;
    }

    /* renamed from: v0 */
    public static int m22205v0(long j2) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m22206w0(int i2) {
        return 4;
    }

    /* renamed from: x0 */
    public static int m22207x0(int i2, int i3) {
        return m22191g0(i2) + 4;
    }

    /* renamed from: y0 */
    private static long m22208y0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* renamed from: z */
    public static int m22209z(double d2) {
        return 8;
    }

    /* renamed from: z0 */
    public static int m22210z0(int i2) {
        return 4;
    }

    /* renamed from: N */
    public final void m22211N() {
        if (mo22221b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: O */
    public abstract void mo22212O(int i2) throws IOException;

    /* renamed from: P */
    public abstract void mo22213P(int i2, int i3) throws IOException;

    /* renamed from: Q */
    public final void m22214Q(int i2, long j2) throws IOException {
        mo22232n(i2, m22208y0(j2));
    }

    /* renamed from: R */
    public abstract void mo22215R(int i2, zzdu zzduVar) throws IOException;

    /* renamed from: S */
    public final void m22216S(long j2) throws IOException {
        mo22238t(m22208y0(j2));
    }

    /* renamed from: W */
    public final void m22217W(int i2) throws IOException {
        mo22212O(m22171E0(i2));
    }

    /* renamed from: X */
    public abstract void mo22218X(int i2, int i3) throws IOException;

    /* renamed from: Y */
    public abstract void mo22219Y(int i2, long j2) throws IOException;

    /* renamed from: Z */
    public abstract void mo22220Z(long j2) throws IOException;

    /* renamed from: b */
    public abstract int mo22221b();

    /* renamed from: e0 */
    public abstract void mo22222e0(int i2) throws IOException;

    /* renamed from: f0 */
    public final void m22223f0(int i2, int i3) throws IOException {
        mo22218X(i2, m22171E0(i3));
    }

    /* renamed from: g */
    public abstract void mo22224g(byte b2) throws IOException;

    /* renamed from: h */
    public final void m22225h(double d2) throws IOException {
        mo22220Z(Double.doubleToRawLongBits(d2));
    }

    /* renamed from: i */
    public final void m22226i(float f2) throws IOException {
        mo22222e0(Float.floatToRawIntBits(f2));
    }

    /* renamed from: j */
    public abstract void mo22227j(int i2) throws IOException;

    /* renamed from: j0 */
    public abstract void mo22228j0(int i2, int i3) throws IOException;

    /* renamed from: k */
    public final void m22229k(int i2, double d2) throws IOException {
        mo22219Y(i2, Double.doubleToRawLongBits(d2));
    }

    /* renamed from: l */
    public final void m22230l(int i2, float f2) throws IOException {
        mo22228j0(i2, Float.floatToRawIntBits(f2));
    }

    /* renamed from: m */
    public abstract void mo22231m(int i2, int i3) throws IOException;

    /* renamed from: n */
    public abstract void mo22232n(int i2, long j2) throws IOException;

    /* renamed from: o */
    public abstract void mo22233o(int i2, zzdu zzduVar) throws IOException;

    /* renamed from: p */
    public abstract void mo22234p(int i2, zzgo zzgoVar) throws IOException;

    /* renamed from: q */
    abstract void mo22235q(int i2, zzgo zzgoVar, InterfaceC7567p3 interfaceC7567p3) throws IOException;

    /* renamed from: r */
    public abstract void mo22236r(int i2, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo22237s(int i2, boolean z) throws IOException;

    /* renamed from: t */
    public abstract void mo22238t(long j2) throws IOException;

    /* renamed from: u */
    public abstract void mo22239u(zzdu zzduVar) throws IOException;

    /* renamed from: v */
    public abstract void mo22240v(zzgo zzgoVar) throws IOException;

    /* renamed from: w */
    public abstract void mo22241w(String str) throws IOException;

    /* renamed from: x */
    final void m22242x(String str, C7574q4 c7574q4) throws IOException {
        f28046a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c7574q4);
        byte[] bytes = str.getBytes(zzff.f28137a);
        try {
            mo22212O(bytes.length);
            mo22158a(bytes, 0, bytes.length);
        } catch (zza e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zza(e3);
        }
    }

    /* renamed from: y */
    public final void m22243y(boolean z) throws IOException {
        mo22224g(z ? (byte) 1 : (byte) 0);
    }
}
