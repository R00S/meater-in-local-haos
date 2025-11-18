package com.google.firebase.analytics.p179a;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.a.d */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8098d implements Executor {

    /* renamed from: f */
    static final Executor f30650f = new ExecutorC8098d();

    private ExecutorC8098d() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
