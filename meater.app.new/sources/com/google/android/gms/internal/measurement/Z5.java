package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class Z5 {
    static /* synthetic */ void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzkp {
        if (e(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || e(b12) || e(b13)) {
            throw zzkp.c();
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    static /* synthetic */ void b(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzkp {
        if (e(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || e(b12)))) {
            throw zzkp.c();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    static /* synthetic */ void c(byte b10, byte b11, char[] cArr, int i10) throws zzkp {
        if (b10 < -62 || e(b11)) {
            throw zzkp.c();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* synthetic */ void d(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    private static boolean e(byte b10) {
        return b10 > -65;
    }
}
