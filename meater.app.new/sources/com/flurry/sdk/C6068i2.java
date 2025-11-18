package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.i2 */
/* loaded from: classes2.dex */
public final class C6068i2 {

    /* renamed from: a */
    private static final Map<b, C6022d2> f15985a;

    /* renamed from: com.flurry.sdk.i2$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15986a;

        static {
            int[] iArr = new int[b.values().length];
            f15986a = iArr;
            try {
                iArr[b.PUBLIC_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15986a[b.CORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15986a[b.DATA_PROCESSOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15986a[b.PROVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15986a[b.CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.i2$b */
    public enum b {
        CORE,
        DATA_PROCESSOR,
        PROVIDER,
        PUBLIC_API,
        REPORTS,
        CONFIG,
        MISC
    }

    /* renamed from: com.flurry.sdk.i2$c */
    static class c implements RejectedExecutionHandler {
        private c() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C6021d1.m13030c(6, "ActorFactory", runnable.toString() + "is rejected");
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* renamed from: com.flurry.sdk.i2$d */
    static class d implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f15995f = new AtomicInteger(0);

        /* renamed from: g */
        private final String f15996g = "Flurry #";

        d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f15996g + this.f15995f.incrementAndGet());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        HashMap map = new HashMap();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        for (b bVar : b.values()) {
            String strName = bVar.name();
            int i2 = a.f15986a[bVar.ordinal()];
            map.put(bVar, new C6022d2(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? m13112b() : m13112b() : m13113c(iAvailableProcessors) : m13112b() : m13113c(iAvailableProcessors) : m13112b(), strName));
        }
        f15985a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public static synchronized C6022d2 m13111a(b bVar) {
        return f15985a.get(bVar);
    }

    /* renamed from: b */
    private static Executor m13112b() {
        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(), new c((byte) 0));
    }

    /* renamed from: c */
    private static Executor m13113c(int i2) {
        return new ThreadPoolExecutor(0, i2, 6L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(), new c((byte) 0));
    }
}
