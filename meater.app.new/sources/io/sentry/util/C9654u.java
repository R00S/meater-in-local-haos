package io.sentry.util;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: StringUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.u */
/* loaded from: classes2.dex */
public final class C9654u {

    /* renamed from: a */
    private static final Charset f36940a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static String m31817a(String str, InterfaceC9670w1 interfaceC9670w1) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f36940a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e2) {
                interfaceC9670w1.mo30213b(EnumC9587s4.INFO, "SHA-1 isn't available to calculate the hash.", e2);
            } catch (Throwable th) {
                interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m31818b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    /* renamed from: c */
    public static String m31819c(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i2 = iLastIndexOf + 1)) ? str : str.substring(i2);
    }

    /* renamed from: d */
    public static String m31820d(String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    /* renamed from: e */
    public static String m31821e(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    /* renamed from: f */
    public static String m31822f(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
