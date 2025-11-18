package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.flurry.sdk.z1 */
/* loaded from: classes2.dex */
public final class ThreadFactoryC6212z1 implements ThreadFactory {

    /* renamed from: f */
    private final ThreadGroup f16535f;

    /* renamed from: g */
    private final int f16536g = 1;

    public ThreadFactoryC6212z1(String str) {
        this.f16535f = new ThreadGroup(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f16535f, runnable);
        thread.setName(this.f16535f.getName() + ":" + thread.getId());
        thread.setPriority(this.f16536g);
        return thread;
    }
}
