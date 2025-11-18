package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
public final class zzaxg {

    /* renamed from: a */
    public static final zzbbl f22651a;

    /* renamed from: b */
    public static final zzbbl f22652b;

    /* renamed from: c */
    public static final ScheduledExecutorService f22653c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f22651a = zzbbm.m17381a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), m17120c("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), m17120c("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22652b = zzbbm.m17381a(threadPoolExecutor);
        f22653c = new ScheduledThreadPoolExecutor(3, m17120c("Schedule"));
    }

    /* renamed from: a */
    public static <T> zzbbh<T> m17118a(Callable<T> callable) {
        return f22651a.submit(callable);
    }

    /* renamed from: b */
    public static zzbbh<?> m17119b(Runnable runnable) {
        return f22651a.submit(runnable);
    }

    /* renamed from: c */
    private static ThreadFactory m17120c(String str) {
        return new ThreadFactoryC6587d5(str);
    }
}
