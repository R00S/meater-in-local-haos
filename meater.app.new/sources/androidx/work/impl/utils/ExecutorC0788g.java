package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* renamed from: androidx.work.impl.utils.g */
/* loaded from: classes.dex */
public class ExecutorC0788g implements Executor {

    /* renamed from: g */
    private final Executor f4875g;

    /* renamed from: i */
    private volatile Runnable f4877i;

    /* renamed from: f */
    private final ArrayDeque<a> f4874f = new ArrayDeque<>();

    /* renamed from: h */
    private final Object f4876h = new Object();

    /* compiled from: SerialExecutor.java */
    /* renamed from: androidx.work.impl.utils.g$a */
    static class a implements Runnable {

        /* renamed from: f */
        final ExecutorC0788g f4878f;

        /* renamed from: g */
        final Runnable f4879g;

        a(ExecutorC0788g executorC0788g, Runnable runnable) {
            this.f4878f = executorC0788g;
            this.f4879g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4879g.run();
            } finally {
                this.f4878f.m5169b();
            }
        }
    }

    public ExecutorC0788g(Executor executor) {
        this.f4875g = executor;
    }

    /* renamed from: a */
    public boolean m5168a() {
        boolean z;
        synchronized (this.f4876h) {
            z = !this.f4874f.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    void m5169b() {
        synchronized (this.f4876h) {
            a aVarPoll = this.f4874f.poll();
            this.f4877i = aVarPoll;
            if (aVarPoll != null) {
                this.f4875g.execute(this.f4877i);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f4876h) {
            this.f4874f.add(new a(this, runnable));
            if (this.f4877i == null) {
                m5169b();
            }
        }
    }
}
