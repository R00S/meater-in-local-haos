package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzef {

    /* renamed from: a */
    private static final char[] f26038a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static boolean m19917a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static long m19918b(double d2, DisplayMetrics displayMetrics) {
        double d3 = displayMetrics.density;
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    /* renamed from: c */
    public static String m19919c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzdmb.m19579a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static boolean m19920d(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* renamed from: e */
    public static String m19921e(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID uuidFromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
        return zzcg.m18756a(bArr, true);
    }

    /* renamed from: f */
    public static boolean m19922f(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: g */
    public static Activity m19923g(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i2 = 0; (context instanceof ContextWrapper) && i2 < 10; i2++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
