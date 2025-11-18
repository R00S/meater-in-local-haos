package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.C9344s0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ScreenshotUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.s */
/* loaded from: classes2.dex */
public class C9322s {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static boolean m30304a(Activity activity, C9344s0 c9344s0) {
        return c9344s0.m30406d() >= 17 ? (activity.isFinishing() || activity.isDestroyed()) ? false : true : !activity.isFinishing();
    }

    /* renamed from: b */
    static /* synthetic */ void m30305b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i2) {
        atomicBoolean.set(i2 == 0);
        countDownLatch.countDown();
    }

    /* renamed from: c */
    static /* synthetic */ void m30306c(View view, Canvas canvas, InterfaceC9670w1 interfaceC9670w1, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m30307d(android.app.Activity r11, io.sentry.util.thread.InterfaceC9651b r12, final io.sentry.InterfaceC9670w1 r13, io.sentry.android.core.C9344s0 r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.C9322s.m30307d(android.app.Activity, io.sentry.util.thread.b, io.sentry.w1, io.sentry.android.core.s0):byte[]");
    }
}
