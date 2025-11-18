package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzff {

    /* renamed from: a */
    static final Charset f28137a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Charset f28138b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f28139c;

    /* renamed from: d */
    private static final ByteBuffer f28140d;

    /* renamed from: e */
    private static final zzeg f28141e;

    static {
        byte[] bArr = new byte[0];
        f28139c = bArr;
        f28140d = ByteBuffer.wrap(bArr);
        f28141e = zzeg.m22160c(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static int m22286a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* renamed from: b */
    public static int m22287b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: c */
    public static int m22288c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    static <T> T m22289d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    static Object m22290e(Object obj, Object obj2) {
        return ((zzgo) obj).mo22269e().mo22141X0((zzgo) obj2).mo22282x();
    }

    /* renamed from: f */
    static <T> T m22291f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    static boolean m22292g(zzgo zzgoVar) {
        if (!(zzgoVar instanceof zzdm)) {
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m22293h(byte[] bArr) {
        return C7556n4.m21252f(bArr);
    }

    /* renamed from: i */
    public static String m22294i(byte[] bArr) {
        return new String(bArr, f28137a);
    }

    /* renamed from: j */
    public static int m22295j(byte[] bArr) {
        int length = bArr.length;
        int iM22286a = m22286a(length, bArr, 0, length);
        if (iM22286a == 0) {
            return 1;
        }
        return iM22286a;
    }
}
