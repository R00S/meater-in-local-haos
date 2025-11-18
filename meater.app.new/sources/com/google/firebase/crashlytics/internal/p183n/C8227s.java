package com.google.firebase.crashlytics.internal.p183n;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* renamed from: com.google.firebase.crashlytics.h.n.s */
/* loaded from: classes2.dex */
class C8227s {

    /* renamed from: a */
    private static final AtomicLong f30963a = new AtomicLong(0);

    /* renamed from: b */
    private static String f30964b;

    C8227s(C8209i0 c8209i0) {
        byte[] bArr = new byte[10];
        m25328e(bArr);
        m25327d(bArr);
        m25326c(bArr);
        String strM25355z = C8228t.m25355z(c8209i0.mo25261a().mo25270c());
        String strM25349t = C8228t.m25349t(bArr);
        Locale locale = Locale.US;
        f30964b = String.format(locale, "%s%s%s%s", strM25349t.substring(0, 12), strM25349t.substring(12, 16), strM25349t.subSequence(16, 20), strM25355z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m25324a(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    /* renamed from: b */
    private static byte[] m25325b(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    /* renamed from: c */
    private void m25326c(byte[] bArr) {
        byte[] bArrM25325b = m25325b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrM25325b[0];
        bArr[9] = bArrM25325b[1];
    }

    /* renamed from: d */
    private void m25327d(byte[] bArr) {
        byte[] bArrM25325b = m25325b(f30963a.incrementAndGet());
        bArr[6] = bArrM25325b[0];
        bArr[7] = bArrM25325b[1];
    }

    /* renamed from: e */
    private void m25328e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrM25324a = m25324a(time / 1000);
        bArr[0] = bArrM25324a[0];
        bArr[1] = bArrM25324a[1];
        bArr[2] = bArrM25324a[2];
        bArr[3] = bArrM25324a[3];
        byte[] bArrM25325b = m25325b(time % 1000);
        bArr[4] = bArrM25325b[0];
        bArr[5] = bArrM25325b[1];
    }

    public String toString() {
        return f30964b;
    }
}
