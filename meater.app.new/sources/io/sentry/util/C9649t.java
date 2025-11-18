package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: SampleRateUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.t */
/* loaded from: classes2.dex */
public final class C9649t {
    /* renamed from: a */
    public static boolean m31807a(Double d2) {
        return m31808b(d2, true);
    }

    /* renamed from: b */
    private static boolean m31808b(Double d2, boolean z) {
        return d2 == null ? z : !d2.isNaN() && d2.doubleValue() >= 0.0d && d2.doubleValue() <= 1.0d;
    }

    /* renamed from: c */
    public static boolean m31809c(Double d2) {
        return m31808b(d2, true);
    }

    /* renamed from: d */
    public static boolean m31810d(Double d2) {
        return m31811e(d2, true);
    }

    /* renamed from: e */
    public static boolean m31811e(Double d2, boolean z) {
        return m31808b(d2, z);
    }
}
