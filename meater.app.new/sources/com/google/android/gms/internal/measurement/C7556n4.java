package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes2.dex */
final class C7556n4 {

    /* renamed from: a */
    private static final AbstractC7562o4 f27854a;

    static {
        f27854a = (!(C7538k4.m21201m() && C7538k4.m21206r()) || C7535k1.m21167b()) ? new C7580r4() : new C7592t4();
    }

    /* renamed from: d */
    static int m21250d(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new C7574q4(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        long j2 = i4 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static int m21251e(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f27854a.mo21270b(charSequence, bArr, i2, i3);
    }

    /* renamed from: f */
    public static boolean m21252f(byte[] bArr) {
        return f27854a.m21271c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m21253g(byte[] bArr, int i2, int i3) {
        return f27854a.m21271c(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m21254h(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m21255i(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m21256j(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* renamed from: k */
    static String m21257k(byte[] bArr, int i2, int i3) throws zzfo {
        return f27854a.mo21272d(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static int m21259m(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return m21254h(b2);
        }
        if (i4 == 1) {
            return m21255i(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return m21256j(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }
}
