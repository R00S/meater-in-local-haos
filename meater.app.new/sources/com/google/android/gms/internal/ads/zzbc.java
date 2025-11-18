package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzbc {
    /* renamed from: a */
    public static int m17394a(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    /* renamed from: b */
    public static long m17395b(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    /* renamed from: c */
    public static int m17396c(ByteBuffer byteBuffer) {
        return (m17394a(byteBuffer.get()) << 8) + 0 + m17394a(byteBuffer.get());
    }

    /* renamed from: d */
    public static long m17397d(ByteBuffer byteBuffer) {
        long jM17395b = (m17395b(byteBuffer) << 32) + 0;
        if (jM17395b >= 0) {
            return jM17395b + m17395b(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    /* renamed from: e */
    public static double m17398e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = 0 | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 65536.0d;
    }

    /* renamed from: f */
    public static double m17399f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = 0 | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 1.073741824E9d;
    }

    /* renamed from: g */
    public static String m17400g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
