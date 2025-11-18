package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzdod {

    /* renamed from: a */
    static final Charset f25772a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Charset f25773b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f25774c;

    /* renamed from: d */
    private static final ByteBuffer f25775d;

    /* renamed from: e */
    private static final zzdnd f25776e;

    static {
        byte[] bArr = new byte[0];
        f25774c = bArr;
        f25775d = ByteBuffer.wrap(bArr);
        f25776e = zzdnd.m19607v(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static <T> T m19740a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static int m19741b(byte[] bArr) {
        int length = bArr.length;
        int iM19742c = m19742c(length, bArr, 0, length);
        if (iM19742c == 0) {
            return 1;
        }
        return iM19742c;
    }

    /* renamed from: c */
    static int m19742c(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* renamed from: d */
    static <T> T m19743d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static boolean m19744e(byte[] bArr) {
        return C6837jx.m15377d(bArr);
    }

    /* renamed from: f */
    public static String m19745f(byte[] bArr) {
        return new String(bArr, f25772a);
    }

    /* renamed from: g */
    static Object m19746g(Object obj, Object obj2) {
        return ((zzdpk) obj).mo19725b().mo19589M0((zzdpk) obj2).mo19733a1();
    }

    /* renamed from: h */
    public static int m19747h(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: i */
    public static int m19748i(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: j */
    static boolean m19749j(zzdpk zzdpkVar) {
        return false;
    }
}
