package androidx.work.impl.utils;

import androidx.work.AbstractC0807n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* renamed from: androidx.work.impl.utils.n */
/* loaded from: classes.dex */
public class C0795n {

    /* renamed from: a */
    private static final String f4916a = AbstractC0807n.m5223f("WorkTimer");

    /* renamed from: b */
    private final ThreadFactory f4917b;

    /* renamed from: c */
    private final ScheduledExecutorService f4918c;

    /* renamed from: d */
    final Map<String, c> f4919d;

    /* renamed from: e */
    final Map<String, b> f4920e;

    /* renamed from: f */
    final Object f4921f;

    /* compiled from: WorkTimer.java */
    /* renamed from: androidx.work.impl.utils.n$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        private int f4922f = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f4922f);
            this.f4922f = this.f4922f + 1;
            return threadNewThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* renamed from: androidx.work.impl.utils.n$b */
    public interface b {
        /* renamed from: a */
        void mo4896a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* renamed from: androidx.work.impl.utils.n$c */
    public static class c implements Runnable {

        /* renamed from: f */
        private final C0795n f4924f;

        /* renamed from: g */
        private final String f4925g;

        c(C0795n c0795n, String str) {
            this.f4924f = c0795n;
            this.f4925g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4924f.f4921f) {
                if (this.f4924f.f4919d.remove(this.f4925g) != null) {
                    b bVarRemove = this.f4924f.f4920e.remove(this.f4925g);
                    if (bVarRemove != null) {
                        bVarRemove.mo4896a(this.f4925g);
                    }
                } else {
                    AbstractC0807n.m5221c().mo5224a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f4925g), new Throwable[0]);
                }
            }
        }
    }

    public C0795n() {
        a aVar = new a();
        this.f4917b = aVar;
        this.f4919d = new HashMap();
        this.f4920e = new HashMap();
        this.f4921f = new Object();
        this.f4918c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void m5174a() {
        if (this.f4918c.isShutdown()) {
            return;
        }
        this.f4918c.shutdownNow();
    }

    /* renamed from: b */
    public void m5175b(String str, long j2, b bVar) {
        synchronized (this.f4921f) {
            AbstractC0807n.m5221c().mo5224a(f4916a, String.format("Starting timer for %s", str), new Throwable[0]);
            m5176c(str);
            c cVar = new c(this, str);
            this.f4919d.put(str, cVar);
            this.f4920e.put(str, bVar);
            this.f4918c.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void m5176c(String str) {
        synchronized (this.f4921f) {
            if (this.f4919d.remove(str) != null) {
                AbstractC0807n.m5221c().mo5224a(f4916a, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f4920e.remove(str);
            }
        }
    }
}
