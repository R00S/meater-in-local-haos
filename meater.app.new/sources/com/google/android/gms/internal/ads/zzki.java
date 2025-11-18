package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class zzki {

    /* renamed from: a */
    private static final byte[] f26418a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f26419b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f26420c = {0, 1, 2, 3, 4, 5, 6, 8};

    /* renamed from: a */
    public static byte[] m20130a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f26418a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    /* renamed from: b */
    public static Pair<Integer, Integer> m20131b(byte[] bArr) {
        int i2 = (bArr[0] >> 3) & 31;
        int i3 = (i2 == 5 || i2 == 29) ? 1 : 0;
        int i4 = (bArr[i3] & 7) << 1;
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i5] >> 7) & 1);
        zzkh.m20129d(i6 < 13);
        return Pair.create(Integer.valueOf(f26419b[i6]), Integer.valueOf((bArr[i5] >> 3) & 15));
    }
}
