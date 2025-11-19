package p8;

import l8.m;

/* compiled from: Chars.java */
/* renamed from: p8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4245b {
    public static char a(long j10) {
        char c10 = (char) j10;
        m.g(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
