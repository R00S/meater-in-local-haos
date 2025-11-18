package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.v */
/* loaded from: classes2.dex */
final class ExecutorC7915v implements Executor {
    ExecutorC7915v() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
