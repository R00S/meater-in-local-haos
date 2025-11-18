package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.z */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8471z implements Executor {

    /* renamed from: f */
    static final Executor f32091f = new ExecutorC8471z();

    private ExecutorC8471z() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
