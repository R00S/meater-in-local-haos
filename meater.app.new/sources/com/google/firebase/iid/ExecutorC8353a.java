package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8353a implements Executor {

    /* renamed from: f */
    static final Executor f31718f = new ExecutorC8353a();

    private ExecutorC8353a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
