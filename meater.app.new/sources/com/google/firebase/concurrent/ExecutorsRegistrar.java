package com.google.firebase.concurrent;

import K8.A;
import K8.t;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import j9.InterfaceC3755b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final t<ScheduledExecutorService> f38097a = new t<>(new InterfaceC3755b() { // from class: L8.a
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final t<ScheduledExecutorService> f38098b = new t<>(new InterfaceC3755b() { // from class: L8.b
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final t<ScheduledExecutorService> f38099c = new t<>(new InterfaceC3755b() { // from class: L8.c
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final t<ScheduledExecutorService> f38100d = new t<>(new InterfaceC3755b() { // from class: L8.d
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(K8.d dVar) {
        return f38097a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(K8.d dVar) {
        return f38099c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(K8.d dVar) {
        return f38098b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(K8.d dVar) {
        return L8.k.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f38100d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<?>> getComponents() {
        return Arrays.asList(K8.c.d(A.a(J8.a.class, ScheduledExecutorService.class), A.a(J8.a.class, ExecutorService.class), A.a(J8.a.class, Executor.class)).f(new K8.g() { // from class: L8.e
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return ExecutorsRegistrar.l(dVar);
            }
        }).d(), K8.c.d(A.a(J8.b.class, ScheduledExecutorService.class), A.a(J8.b.class, ExecutorService.class), A.a(J8.b.class, Executor.class)).f(new K8.g() { // from class: L8.f
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return ExecutorsRegistrar.m(dVar);
            }
        }).d(), K8.c.d(A.a(J8.c.class, ScheduledExecutorService.class), A.a(J8.c.class, ExecutorService.class), A.a(J8.c.class, Executor.class)).f(new K8.g() { // from class: L8.g
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return ExecutorsRegistrar.n(dVar);
            }
        }).d(), K8.c.c(A.a(J8.d.class, Executor.class)).f(new K8.g() { // from class: L8.h
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return ExecutorsRegistrar.o(dVar);
            }
        }).d());
    }
}
