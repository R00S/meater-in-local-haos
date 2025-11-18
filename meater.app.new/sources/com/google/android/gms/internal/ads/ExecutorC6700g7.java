package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.g7 */
/* loaded from: classes2.dex */
final class ExecutorC6700g7 implements Executor {
    ExecutorC6700g7() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
