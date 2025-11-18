package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.android.core.internal.util.C9323t;

/* compiled from: SentryFrameMetricsCollector.java */
/* renamed from: io.sentry.android.core.internal.util.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9324u {
    /* renamed from: a */
    public static void m30323a(C9323t.c _this, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
    }

    /* renamed from: b */
    public static void m30324b(C9323t.c _this, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
    }
}
