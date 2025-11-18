package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class zzsl {

    /* renamed from: a */
    private static final byte[] f26989a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f26990b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f26991c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    private static int m20484a(zzss zzssVar) {
        int iM20499a = zzssVar.m20499a(5);
        return iM20499a == 31 ? zzssVar.m20499a(6) + 32 : iM20499a;
    }

    /* renamed from: b */
    public static byte[] m20485b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f26989a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    /* renamed from: c */
    private static int m20486c(zzss zzssVar) {
        int iM20499a = zzssVar.m20499a(4);
        if (iM20499a == 15) {
            return zzssVar.m20499a(24);
        }
        zzsk.m20477a(iM20499a < 13);
        return f26990b[iM20499a];
    }

    /* renamed from: d */
    public static Pair<Integer, Integer> m20487d(byte[] bArr) {
        zzss zzssVar = new zzss(bArr);
        int iM20484a = m20484a(zzssVar);
        int iM20486c = m20486c(zzssVar);
        int iM20499a = zzssVar.m20499a(4);
        if (iM20484a == 5 || iM20484a == 29) {
            iM20486c = m20486c(zzssVar);
            if (m20484a(zzssVar) == 22) {
                iM20499a = zzssVar.m20499a(4);
            }
        }
        int i2 = f26991c[iM20499a];
        zzsk.m20477a(i2 != -1);
        return Pair.create(Integer.valueOf(iM20486c), Integer.valueOf(i2));
    }
}
