package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzg {

    /* renamed from: a */
    private static final OutputStream f27622a = new C7458c();

    /* renamed from: a */
    public static byte[] m20938a(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        int i3 = 0;
        while (i3 < 2147483639) {
            int iMin = Math.min(i2, 2147483639 - i3);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = inputStream.read(bArr, i4, iMin - i4);
                if (i5 == -1) {
                    return m20940c(arrayDeque, i3);
                }
                i4 += i5;
                i3 += i5;
            }
            long j2 = i2;
            long j3 = j2 + j2;
            i2 = j3 > 2147483647L ? Integer.MAX_VALUE : j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
        }
        if (inputStream.read() == -1) {
            return m20940c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: b */
    public static InputStream m20939b(InputStream inputStream, long j2) {
        return new C7459d(inputStream, 1048577L);
    }

    /* renamed from: c */
    private static byte[] m20940c(Queue<byte[]> queue, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] bArrRemove = queue.remove();
            int iMin = Math.min(i3, bArrRemove.length);
            System.arraycopy(bArrRemove, 0, bArr, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArr;
    }
}
