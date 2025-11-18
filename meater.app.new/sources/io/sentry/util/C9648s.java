package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: Platform.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.s */
/* loaded from: classes2.dex */
public final class C9648s {

    /* renamed from: a */
    private static boolean f36935a;

    /* renamed from: b */
    static boolean f36936b;

    static {
        try {
            f36935a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f36935a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f36936b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f36936b = false;
            }
        } catch (Throwable unused2) {
            f36936b = false;
        }
    }

    /* renamed from: a */
    public static boolean m31805a() {
        return f36936b;
    }

    /* renamed from: b */
    public static boolean m31806b() {
        return !f36935a;
    }
}
