package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.k */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8441k implements Executor {

    /* renamed from: f */
    static final Executor f32005f = new ExecutorC8441k();

    private ExecutorC8441k() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
