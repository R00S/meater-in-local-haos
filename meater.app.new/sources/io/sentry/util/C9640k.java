package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: ExceptionUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.k */
/* loaded from: classes2.dex */
public final class C9640k {
    /* renamed from: a */
    public static Throwable m31774a(Throwable th) {
        C9646q.m31802c(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }
}
