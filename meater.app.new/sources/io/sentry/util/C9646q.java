package io.sentry.util;

import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Objects.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.q */
/* loaded from: classes2.dex */
public final class C9646q {
    /* renamed from: a */
    public static boolean m31800a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m31801b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static <T> T m31802c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}
