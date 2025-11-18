package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f46056a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f46057b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f46058c;

    /* compiled from: DefaultTaskExecutor.java */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f46059a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f46059a.getAndIncrement());
            return thread;
        }
    }

    /* compiled from: DefaultTaskExecutor.java */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // o.e
    public void a(Runnable runnable) {
        this.f46057b.execute(runnable);
    }

    @Override // o.e
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // o.e
    public void d(Runnable runnable) {
        if (this.f46058c == null) {
            synchronized (this.f46056a) {
                try {
                    if (this.f46058c == null) {
                        this.f46058c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f46058c.post(runnable);
    }
}
