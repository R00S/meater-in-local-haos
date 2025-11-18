package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zzd;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.p */
/* loaded from: classes2.dex */
class C8451p {
    /* renamed from: a */
    private static Executor m26612a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Trigger-Topics-Io"));
    }

    /* renamed from: b */
    static ScheduledExecutorService m26613b() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    /* renamed from: c */
    static ExecutorService m26614c() {
        zzd.m20937a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: d */
    static ExecutorService m26615d() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: e */
    static ExecutorService m26616e() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    /* renamed from: f */
    static ScheduledExecutorService m26617f() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    /* renamed from: g */
    static Executor m26618g() {
        return m26612a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
