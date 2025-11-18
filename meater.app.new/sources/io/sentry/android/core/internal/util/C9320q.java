package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Permissions.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.q */
/* loaded from: classes2.dex */
public final class C9320q {
    /* renamed from: a */
    public static boolean m30298a(Context context, String str) {
        C9646q.m31802c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
