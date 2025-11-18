package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.v */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC6347v implements Executor {

    /* renamed from: f */
    static final Executor f17183f = new ExecutorC6347v();

    private ExecutorC6347v() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
