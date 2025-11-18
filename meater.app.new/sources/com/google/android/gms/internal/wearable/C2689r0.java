package com.google.android.gms.internal.wearable;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2689r0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f34652a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f34653b;

    static {
        Charset.forName("US-ASCII");
        f34652a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f34653b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = T.f34526a;
        try {
            new Q(bArr, 0, 0, false, null).a(0);
        } catch (zzcx e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
