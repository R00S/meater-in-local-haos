package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kx */
/* loaded from: classes2.dex */
final class C6874kx {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static void m15483a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzdok {
        if (m15494l(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || m15494l(b4) || m15494l(b5)) {
            throw zzdok.m19757h();
        }
        int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m15484b(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzdok {
        if (m15494l(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m15494l(b4)))) {
            throw zzdok.m19757h();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m15485c(byte b2, byte b3, char[] cArr, int i2) throws zzdok {
        if (b2 < -62 || m15494l(b3)) {
            throw zzdok.m19757h();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m15486d(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m15491i(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m15492j(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m15493k(byte b2) {
        return b2 < -16;
    }

    /* renamed from: l */
    private static boolean m15494l(byte b2) {
        return b2 > -65;
    }
}
