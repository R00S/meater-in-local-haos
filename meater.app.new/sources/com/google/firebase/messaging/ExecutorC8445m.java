package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8445m implements Executor {

    /* renamed from: f */
    static final Executor f32014f = new ExecutorC8445m();

    private ExecutorC8445m() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
