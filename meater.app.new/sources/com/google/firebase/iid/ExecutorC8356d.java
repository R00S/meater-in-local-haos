package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.d */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8356d implements Executor {

    /* renamed from: f */
    static final Executor f31723f = new ExecutorC8356d();

    private ExecutorC8356d() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
