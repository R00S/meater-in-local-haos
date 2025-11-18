package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tz */
/* loaded from: classes2.dex */
final class C7209tz {

    /* renamed from: g */
    private int f20594g;

    /* renamed from: h */
    private int f20595h;

    /* renamed from: i */
    private int f20596i;

    /* renamed from: j */
    private int f20597j;

    /* renamed from: a */
    private int f20588a = 1000;

    /* renamed from: b */
    private long[] f20589b = new long[1000];

    /* renamed from: e */
    private long[] f20592e = new long[1000];

    /* renamed from: d */
    private int[] f20591d = new int[1000];

    /* renamed from: c */
    private int[] f20590c = new int[1000];

    /* renamed from: f */
    private byte[][] f20593f = new byte[1000][];

    /* renamed from: a */
    public final void m15912a() {
        this.f20595h = 0;
        this.f20596i = 0;
        this.f20597j = 0;
        this.f20594g = 0;
    }

    /* renamed from: b */
    public final synchronized void m15913b(long j2, int i2, long j3, int i3, byte[] bArr) {
        long[] jArr = this.f20592e;
        int i4 = this.f20597j;
        jArr[i4] = j2;
        long[] jArr2 = this.f20589b;
        jArr2[i4] = j3;
        this.f20590c[i4] = i3;
        this.f20591d[i4] = i2;
        this.f20593f[i4] = bArr;
        int i5 = this.f20594g + 1;
        this.f20594g = i5;
        int i6 = this.f20588a;
        if (i5 != i6) {
            int i7 = i4 + 1;
            this.f20597j = i7;
            if (i7 == i6) {
                this.f20597j = 0;
            }
            return;
        }
        int i8 = i6 + 1000;
        long[] jArr3 = new long[i8];
        long[] jArr4 = new long[i8];
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        byte[][] bArr2 = new byte[i8][];
        int i9 = this.f20596i;
        int i10 = i6 - i9;
        System.arraycopy(jArr2, i9, jArr3, 0, i10);
        System.arraycopy(this.f20592e, this.f20596i, jArr4, 0, i10);
        System.arraycopy(this.f20591d, this.f20596i, iArr, 0, i10);
        System.arraycopy(this.f20590c, this.f20596i, iArr2, 0, i10);
        System.arraycopy(this.f20593f, this.f20596i, bArr2, 0, i10);
        int i11 = this.f20596i;
        System.arraycopy(this.f20589b, 0, jArr3, i10, i11);
        System.arraycopy(this.f20592e, 0, jArr4, i10, i11);
        System.arraycopy(this.f20591d, 0, iArr, i10, i11);
        System.arraycopy(this.f20590c, 0, iArr2, i10, i11);
        System.arraycopy(this.f20593f, 0, bArr2, i10, i11);
        this.f20589b = jArr3;
        this.f20592e = jArr4;
        this.f20591d = iArr;
        this.f20590c = iArr2;
        this.f20593f = bArr2;
        this.f20596i = 0;
        int i12 = this.f20588a;
        this.f20597j = i12;
        this.f20594g = i12;
        this.f20588a = i8;
    }

    /* renamed from: c */
    public final synchronized boolean m15914c(zzhm zzhmVar, C7246uz c7246uz) {
        if (this.f20594g == 0) {
            return false;
        }
        long[] jArr = this.f20592e;
        int i2 = this.f20596i;
        zzhmVar.f26210e = jArr[i2];
        zzhmVar.f26208c = this.f20590c[i2];
        zzhmVar.f26209d = this.f20591d[i2];
        c7246uz.f20660a = this.f20589b[i2];
        c7246uz.f20661b = this.f20593f[i2];
        return true;
    }

    /* renamed from: d */
    public final synchronized long m15915d(long j2) {
        if (this.f20594g != 0) {
            long[] jArr = this.f20592e;
            int i2 = this.f20596i;
            if (j2 >= jArr[i2]) {
                int i3 = this.f20597j;
                if (i3 == 0) {
                    i3 = this.f20588a;
                }
                if (j2 > jArr[i3 - 1]) {
                    return -1L;
                }
                int i4 = 0;
                int i5 = -1;
                while (i2 != this.f20597j && this.f20592e[i2] <= j2) {
                    if ((this.f20591d[i2] & 1) != 0) {
                        i5 = i4;
                    }
                    i2 = (i2 + 1) % this.f20588a;
                    i4++;
                }
                if (i5 == -1) {
                    return -1L;
                }
                this.f20594g -= i5;
                int i6 = (this.f20596i + i5) % this.f20588a;
                this.f20596i = i6;
                this.f20595h += i5;
                return this.f20589b[i6];
            }
        }
        return -1L;
    }

    /* renamed from: e */
    public final synchronized long m15916e() {
        int i2 = this.f20594g - 1;
        this.f20594g = i2;
        int i3 = this.f20596i;
        int i4 = i3 + 1;
        this.f20596i = i4;
        this.f20595h++;
        if (i4 == this.f20588a) {
            this.f20596i = 0;
        }
        if (i2 > 0) {
            return this.f20589b[this.f20596i];
        }
        return this.f20590c[i3] + this.f20589b[i3];
    }
}
