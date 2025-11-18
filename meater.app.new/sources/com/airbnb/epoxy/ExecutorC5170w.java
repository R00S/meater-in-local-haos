package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: HandlerExecutor.java */
/* renamed from: com.airbnb.epoxy.w */
/* loaded from: classes.dex */
class ExecutorC5170w implements Executor {

    /* renamed from: f */
    final Handler f12303f;

    ExecutorC5170w(Handler handler) {
        this.f12303f = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.f12303f.getLooper()) {
            runnable.run();
        } else {
            this.f12303f.post(runnable);
        }
    }
}
