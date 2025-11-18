package p241e.p307h.p308a.p315k0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FileDownloadExecutors.java */
/* renamed from: e.h.a.k0.b */
/* loaded from: classes2.dex */
public class C9032b {

    /* compiled from: FileDownloadExecutors.java */
    /* renamed from: e.h.a.k0.b$a */
    static class a implements ThreadFactory {

        /* renamed from: f */
        private static final AtomicInteger f34814f = new AtomicInteger(1);

        /* renamed from: g */
        private final String f34815g;

        /* renamed from: i */
        private final AtomicInteger f34817i = new AtomicInteger(1);

        /* renamed from: h */
        private final ThreadGroup f34816h = Thread.currentThread().getThreadGroup();

        a(String str) {
            this.f34815g = C9036f.m28977D(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f34816h, runnable, this.f34815g + this.f34817i.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m28953a(int i2, String str) {
        return m28954b(i2, new LinkedBlockingQueue(), str);
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m28954b(int i2, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m28955c(String str) {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new SynchronousQueue(), new a(str));
    }
}
