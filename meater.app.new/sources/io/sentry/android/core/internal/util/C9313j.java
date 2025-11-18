package io.sentry.android.core.internal.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClassUtil.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.j */
/* loaded from: classes2.dex */
public class C9313j {
    /* renamed from: a */
    public static String m30279a(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }
}
