package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MainLooperHandler.java */
/* renamed from: io.sentry.android.core.c1 */
/* loaded from: classes2.dex */
final class C9268c1 {

    /* renamed from: a */
    private final Handler f35867a;

    C9268c1() {
        this(Looper.getMainLooper());
    }

    /* renamed from: a */
    public Thread m30154a() {
        return this.f35867a.getLooper().getThread();
    }

    /* renamed from: b */
    public void m30155b(Runnable runnable) {
        this.f35867a.post(runnable);
    }

    C9268c1(Looper looper) {
        this.f35867a = new Handler(looper);
    }
}
