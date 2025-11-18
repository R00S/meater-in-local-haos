package p024c.p033b.p034a.p035a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* renamed from: c.b.a.a.b */
/* loaded from: classes.dex */
public class C0851b extends AbstractC0852c {

    /* renamed from: a */
    private final Object f5632a = new Object();

    /* renamed from: b */
    private final ExecutorService f5633b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f5634c;

    /* compiled from: DefaultTaskExecutor.java */
    /* renamed from: c.b.a.a.b$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f5635f = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f5635f.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m5376d(Looper looper) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i2 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: a */
    public void mo5373a(Runnable runnable) {
        this.f5633b.execute(runnable);
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: b */
    public boolean mo5374b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: c */
    public void mo5375c(Runnable runnable) {
        if (this.f5634c == null) {
            synchronized (this.f5632a) {
                if (this.f5634c == null) {
                    this.f5634c = m5376d(Looper.getMainLooper());
                }
            }
        }
        this.f5634c.post(runnable);
    }
}
