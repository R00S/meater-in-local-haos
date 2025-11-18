package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.jx */
/* loaded from: classes2.dex */
final class C6837jx {

    /* renamed from: a */
    private static final AbstractC6911lx f19505a;

    static {
        f19505a = (!(C6726gx.m15214p() && C6726gx.m15215q()) || C7425zt.m16158a()) ? new C6948mx() : new C7022ox();
    }

    /* renamed from: a */
    static int m15374a(CharSequence charSequence) {
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
                                throw new C6985nx(i3, length2);
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

    /* renamed from: b */
    static int m15375b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f19505a.mo15520b(charSequence, bArr, i2, i3);
    }

    /* renamed from: c */
    static void m15376c(CharSequence charSequence, ByteBuffer byteBuffer) {
        AbstractC6911lx abstractC6911lx = f19505a;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m15375b(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            abstractC6911lx.mo15521c(charSequence, byteBuffer);
        } else {
            AbstractC6911lx.m15518d(charSequence, byteBuffer);
        }
    }

    /* renamed from: d */
    public static boolean m15377d(byte[] bArr) {
        return f19505a.m15522e(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static int m15378e(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m15380g(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m15381h(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* renamed from: k */
    public static boolean m15384k(byte[] bArr, int i2, int i3) {
        return f19505a.m15522e(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m15385l(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return m15381h(b2);
        }
        if (i4 == 1) {
            return m15378e(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return m15380g(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    static String m15386m(byte[] bArr, int i2, int i3) throws zzdok {
        return f19505a.mo15523f(bArr, i2, i3);
    }
}
