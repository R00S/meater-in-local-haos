package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class I4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f33783a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f33784b;

    static {
        Charset.forName("US-ASCII");
        f33783a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f33784b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC2524l4.c(bArr, 0, bArr.length, false);
    }

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static <T> T e(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T f(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static boolean g(InterfaceC2517k5 interfaceC2517k5) {
        boolean z10 = interfaceC2517k5 instanceof Q3;
        return false;
    }
}
