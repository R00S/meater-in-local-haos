package com.flurry.sdk;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.c2 */
/* loaded from: classes2.dex */
public final class C6013c2 {
    /* renamed from: a */
    public static long m12985a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 < 0) {
                return j2;
            }
            outputStream.write(bArr, 0, i2);
            j2 += i2;
        }
    }

    /* renamed from: b */
    public static String m12986b(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.length() <= 255 ? str : str.substring(0, 255);
    }

    /* renamed from: c */
    public static String m12987c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (byte b2 : bArr) {
            sb.append(cArr[(byte) ((b2 & 240) >> 4)]);
            sb.append(cArr[(byte) (b2 & 15)]);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m12988d() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Must be called from a background thread!");
        }
    }

    /* renamed from: e */
    public static void m12989e(int i2, String str, String str2, boolean z) {
        if (i2 < 100) {
            return;
        }
        String strM13026y = C6037e7.m13055a().f15832l.m13026y();
        long jM13257f = C6131p2.m13257f("last_streaming_session_id", Long.MIN_VALUE);
        HashMap map = new HashMap();
        map.put("fl.response.code", String.valueOf(i2));
        map.put("fl.message", m12995k(str));
        map.put("fl.current.session", Boolean.toString(z));
        map.put("fl.current.session.id", strM13026y);
        if (i2 != 200) {
            C6048g0.m13065a();
            C6048g0.m13067d("Flurry.SDKReport.ServerRequest", map);
        }
        map.put("fl.report.identifier", str2);
        if (jM13257f != Long.MIN_VALUE) {
            map.put("fl.last.session.id", String.valueOf(jM13257f));
        }
        C6048g0.m13065a();
        C6048g0.m13068f("Flurry.SDKReport.ServerRequest", map);
    }

    /* renamed from: f */
    public static void m12990f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static boolean m12991g(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    /* renamed from: h */
    public static String m12992h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException e2) {
            C6021d1.m13030c(5, "GeneralUtil", "Unsupported UTF-8: " + e2.getMessage());
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: i */
    public static byte[] m12993i(String str) {
        byte[] bArr = new byte[str.length() / 2];
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2 += 2) {
            StringBuilder sb = new StringBuilder(2);
            sb.append(charArray[i2]);
            sb.append(charArray[i2 + 1]);
            bArr[i2 / 2] = (byte) Integer.parseInt(sb.toString(), 16);
        }
        return bArr;
    }

    /* renamed from: j */
    public static long m12994j(String str) {
        if (str == null) {
            return 0L;
        }
        long jCharAt = 1125899906842597L;
        for (int i2 = 0; i2 < str.length(); i2++) {
            jCharAt = (jCharAt * 31) + str.charAt(i2);
        }
        return jCharAt;
    }

    /* renamed from: k */
    private static String m12995k(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("status code")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("<!--|-->")) {
            if (!str2.contains("timestamp")) {
                String strTrim = str2.trim();
                if (strTrim.length() > 0) {
                    sb.append("<");
                    sb.append(strTrim);
                    sb.append(">");
                }
            }
        }
        return sb.toString();
    }
}
