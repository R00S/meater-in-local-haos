package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class x10 {

    /* renamed from: a */
    private static final long[] f20894a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f20895b = new byte[8];

    /* renamed from: c */
    private int f20896c;

    /* renamed from: d */
    private int f20897d;

    /* renamed from: c */
    public static long m16002c(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= f20894a[i2 - 1] ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    /* renamed from: d */
    public static int m16003d(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = f20894a;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & i2) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    /* renamed from: a */
    public final void m16004a() {
        this.f20896c = 0;
        this.f20897d = 0;
    }

    /* renamed from: b */
    public final long m16005b(zzno zznoVar, boolean z, boolean z2, int i2) throws InterruptedException, IOException {
        if (this.f20896c == 0) {
            if (!zznoVar.mo20323b(this.f20895b, 0, 1, z)) {
                return -1L;
            }
            int iM16003d = m16003d(this.f20895b[0] & 255);
            this.f20897d = iM16003d;
            if (iM16003d == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f20896c = 1;
        }
        int i3 = this.f20897d;
        if (i3 > i2) {
            this.f20896c = 0;
            return -2L;
        }
        if (i3 != 1) {
            zznoVar.readFully(this.f20895b, 1, i3 - 1);
        }
        this.f20896c = 0;
        return m16002c(this.f20895b, this.f20897d, z2);
    }

    /* renamed from: e */
    public final int m16006e() {
        return this.f20897d;
    }
}
