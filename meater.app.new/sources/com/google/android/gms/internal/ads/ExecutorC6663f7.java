package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.f7 */
/* loaded from: classes2.dex */
final class ExecutorC6663f7 implements Executor {

    /* renamed from: f */
    private final Handler f18867f = new zzaxa(Looper.getMainLooper());

    ExecutorC6663f7() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f18867f.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            zzk.zzlg();
            zzaxi.m17162n(zzk.zzlk().m17049a(), th);
            throw th;
        }
    }
}
