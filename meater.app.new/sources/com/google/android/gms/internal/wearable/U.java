package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class U extends W {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f34528d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34529e;

    /* renamed from: f, reason: collision with root package name */
    private int f34530f;

    U(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f34528d = bArr;
        this.f34530f = 0;
        this.f34529e = i11;
    }

    public final void C(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f34528d, this.f34530f, i11);
            this.f34530f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), Integer.valueOf(i11)), e10);
        }
    }

    public final void D(String str) throws zzbu {
        int i10 = this.f34530f;
        try {
            int iB = W.B(str.length() * 3);
            int iB2 = W.B(str.length());
            if (iB2 != iB) {
                v(t1.b(str));
                byte[] bArr = this.f34528d;
                int i11 = this.f34530f;
                this.f34530f = t1.a(str, bArr, i11, this.f34529e - i11);
                return;
            }
            int i12 = i10 + iB2;
            this.f34530f = i12;
            int iA = t1.a(str, this.f34528d, i12, this.f34529e - i12);
            this.f34530f = i10;
            v((iA - i10) - iB2);
            this.f34530f = iA;
        } catch (s1 e10) {
            this.f34530f = i10;
            c(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzbu(e11);
        }
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final int e() {
        return this.f34529e - this.f34530f;
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void f(byte b10) throws zzbu {
        try {
            byte[] bArr = this.f34528d;
            int i10 = this.f34530f;
            this.f34530f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void g(int i10, boolean z10) throws zzbu {
        v(i10 << 3);
        f(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void h(int i10, P p10) throws zzbu {
        v((i10 << 3) | 2);
        v(p10.h());
        p10.r(this);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void i(int i10, int i11) throws zzbu {
        v((i10 << 3) | 5);
        j(i11);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void j(int i10) throws zzbu {
        try {
            byte[] bArr = this.f34528d;
            int i11 = this.f34530f;
            int i12 = i11 + 1;
            this.f34530f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f34530f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f34530f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f34530f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void k(int i10, long j10) throws zzbu {
        v((i10 << 3) | 1);
        l(j10);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void l(long j10) throws zzbu {
        try {
            byte[] bArr = this.f34528d;
            int i10 = this.f34530f;
            int i11 = i10 + 1;
            this.f34530f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f34530f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f34530f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f34530f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f34530f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f34530f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f34530f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f34530f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void m(int i10, int i11) throws zzbu {
        v(i10 << 3);
        n(i11);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void n(int i10) throws zzbu {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void o(byte[] bArr, int i10, int i11) {
        C(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.wearable.W
    final void p(int i10, N0 n02, Z0 z02) throws zzbu {
        v((i10 << 3) | 2);
        v(((C) n02).a(z02));
        z02.a(n02, this.f34533a);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void q(int i10, N0 n02) throws zzbu {
        v(11);
        u(2, i10);
        v(26);
        v(n02.b());
        n02.c(this);
        v(12);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void r(int i10, P p10) throws zzbu {
        v(11);
        u(2, i10);
        h(3, p10);
        v(12);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void s(int i10, String str) throws zzbu {
        v((i10 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void t(int i10, int i11) throws zzbu {
        v((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void u(int i10, int i11) throws zzbu {
        v(i10 << 3);
        v(i11);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void v(int i10) throws zzbu {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f34528d;
                int i11 = this.f34530f;
                this.f34530f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), 1), e10);
            }
        }
        byte[] bArr2 = this.f34528d;
        int i12 = this.f34530f;
        this.f34530f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void w(int i10, long j10) throws zzbu {
        v(i10 << 3);
        x(j10);
    }

    @Override // com.google.android.gms.internal.wearable.W
    public final void x(long j10) throws zzbu {
        if (!W.f34532c || this.f34529e - this.f34530f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f34528d;
                    int i10 = this.f34530f;
                    this.f34530f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34530f), Integer.valueOf(this.f34529e), 1), e10);
                }
            }
            byte[] bArr2 = this.f34528d;
            int i11 = this.f34530f;
            this.f34530f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f34528d;
                int i13 = this.f34530f;
                this.f34530f = i13 + 1;
                C2690r1.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f34528d;
            int i14 = this.f34530f;
            this.f34530f = i14 + 1;
            C2690r1.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
