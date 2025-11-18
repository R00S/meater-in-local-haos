package com.google.crypto.tink.internal;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f37699a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    private static final byte d(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c10);
    }

    public static final F8.a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = d(str.charAt(i10));
        }
        return F8.a.a(bArr);
    }
}
