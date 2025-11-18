package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.w */
/* loaded from: classes2.dex */
final class ExecutorC7916w implements Executor {

    /* renamed from: f */
    private final Handler f29564f = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29564f.post(runnable);
    }
}
