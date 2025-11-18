package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8429e implements Executor {

    /* renamed from: f */
    static final Executor f31986f = new ExecutorC8429e();

    private ExecutorC8429e() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
