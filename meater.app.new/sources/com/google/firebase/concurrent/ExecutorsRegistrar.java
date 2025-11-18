package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.C8111b0;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8134x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.p200o.p201a.InterfaceC8474a;
import com.google.firebase.p200o.p201a.InterfaceC8475b;
import com.google.firebase.p200o.p201a.InterfaceC8476c;
import com.google.firebase.p200o.p201a.InterfaceC8477d;
import com.google.firebase.p205s.InterfaceC8496b;
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

    /* renamed from: a */
    static final C8134x<ScheduledExecutorService> f30752a = new C8134x<>(new InterfaceC8496b() { // from class: com.google.firebase.concurrent.t
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            return ExecutorsRegistrar.m25098m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m25088c("Firebase Background", 10, ExecutorsRegistrar.m25086a())));
        }
    });

    /* renamed from: b */
    static final C8134x<ScheduledExecutorService> f30753b = new C8134x<>(new InterfaceC8496b() { // from class: com.google.firebase.concurrent.q
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            return ExecutorsRegistrar.m25098m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m25088c("Firebase Lite", 0, ExecutorsRegistrar.m25097l())));
        }
    });

    /* renamed from: c */
    static final C8134x<ScheduledExecutorService> f30754c = new C8134x<>(new InterfaceC8496b() { // from class: com.google.firebase.concurrent.p
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            return ExecutorsRegistrar.m25098m(Executors.newCachedThreadPool(ExecutorsRegistrar.m25087b("Firebase Blocking", 11)));
        }
    });

    /* renamed from: d */
    static final C8134x<ScheduledExecutorService> f30755d = new C8134x<>(new InterfaceC8496b() { // from class: com.google.firebase.concurrent.o
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m25087b("Firebase Scheduler", 0));
        }
    });

    /* renamed from: a */
    private static StrictMode.ThreadPolicy m25086a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            builderDetectNetwork.detectResourceMismatches();
            if (i2 >= 26) {
                builderDetectNetwork.detectUnbufferedIo();
            }
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    /* renamed from: b */
    private static ThreadFactory m25087b(String str, int i2) {
        return new ThreadFactoryC8159v(str, i2, null);
    }

    /* renamed from: c */
    private static ThreadFactory m25088c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC8159v(str, i2, threadPolicy);
    }

    /* renamed from: l */
    private static StrictMode.ThreadPolicy m25097l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static ScheduledExecutorService m25098m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC8160w(executorService, f30755d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24985b(C8111b0.m24971a(InterfaceC8474a.class, ScheduledExecutorService.class), C8111b0.m24971a(InterfaceC8474a.class, ExecutorService.class), C8111b0.m24971a(InterfaceC8474a.class, Executor.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.concurrent.u
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return ExecutorsRegistrar.f30752a.get();
            }
        }).m25008d(), C8124n.m24985b(C8111b0.m24971a(InterfaceC8475b.class, ScheduledExecutorService.class), C8111b0.m24971a(InterfaceC8475b.class, ExecutorService.class), C8111b0.m24971a(InterfaceC8475b.class, Executor.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.concurrent.n
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return ExecutorsRegistrar.f30754c.get();
            }
        }).m25008d(), C8124n.m24985b(C8111b0.m24971a(InterfaceC8476c.class, ScheduledExecutorService.class), C8111b0.m24971a(InterfaceC8476c.class, ExecutorService.class), C8111b0.m24971a(InterfaceC8476c.class, Executor.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return ExecutorsRegistrar.f30753b.get();
            }
        }).m25008d(), C8124n.m24984a(C8111b0.m24971a(InterfaceC8477d.class, Executor.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.concurrent.r
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return EnumC8138a0.INSTANCE;
            }
        }).m25008d());
    }
}
