package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8466w0 implements Executor {

    /* renamed from: f */
    static final Executor f32084f = new ExecutorC8466w0();

    private ExecutorC8466w0() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
