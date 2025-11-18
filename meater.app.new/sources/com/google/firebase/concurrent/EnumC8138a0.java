package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: UiExecutor.java */
/* renamed from: com.google.firebase.concurrent.a0 */
/* loaded from: classes2.dex */
public enum EnumC8138a0 implements Executor {
    INSTANCE;


    /* renamed from: g */
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler f30759g = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f30759g.post(runnable);
    }
}
