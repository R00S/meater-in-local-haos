package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes2.dex */
final class C7568p4 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m21281f(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzfo {
        if (m21290o(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || m21290o(b4) || m21290o(b5)) {
            throw zzfo.m22303h();
        }
        int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m21282g(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzfo {
        if (m21290o(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m21290o(b4)))) {
            throw zzfo.m22303h();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static void m21283h(byte b2, byte b3, char[] cArr, int i2) throws zzfo {
        if (b2 < -62 || m21290o(b3)) {
            throw zzfo.m22303h();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static void m21284i(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m21287l(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m21288m(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m21289n(byte b2) {
        return b2 < -16;
    }

    /* renamed from: o */
    private static boolean m21290o(byte b2) {
        return b2 > -65;
    }
}
