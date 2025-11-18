package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.ThreadFactoryC3803a;

/* compiled from: FcmExecutors.java */
/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2929n {
    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3803a(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3803a("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService d() {
        return r9.b.a().a(new ThreadFactoryC3803a("Firebase-Messaging-Intent-Handle"), r9.c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3803a("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3803a("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3803a("Firebase-Messaging-Topics-Io"));
    }
}
