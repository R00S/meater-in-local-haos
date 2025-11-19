package p8;

import l8.m;

/* compiled from: UnsignedBytes.java */
/* loaded from: classes2.dex */
public final class j {
    public static byte a(long j10) {
        m.g((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
