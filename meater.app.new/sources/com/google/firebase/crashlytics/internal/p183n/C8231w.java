package com.google.firebase.crashlytics.internal.p183n;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.h.n.w */
/* loaded from: classes2.dex */
public class C8231w {

    /* renamed from: a */
    private final Executor f30985a;

    /* renamed from: b */
    private Task<Void> f30986b = Tasks.m23663e(null);

    /* renamed from: c */
    private final Object f30987c = new Object();

    /* renamed from: d */
    private final ThreadLocal<Boolean> f30988d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.w$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8231w.this.f30988d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.w$b */
    class b<T> implements Continuation<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f30990a;

        b(Callable callable) {
            this.f30990a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public T mo13777a(Task<Void> task) throws Exception {
            return (T) this.f30990a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.w$c */
    class c<T> implements Continuation<T, Void> {
        c() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo13777a(Task<T> task) throws Exception {
            return null;
        }
    }

    public C8231w(Executor executor) {
        this.f30985a = executor;
        executor.execute(new a());
    }

    /* renamed from: d */
    private <T> Task<Void> m25370d(Task<T> task) {
        return task.mo23644g(this.f30985a, new c());
    }

    /* renamed from: e */
    private boolean m25371e() {
        return Boolean.TRUE.equals(this.f30988d.get());
    }

    /* renamed from: f */
    private <T> Continuation<Void, T> m25372f(Callable<T> callable) {
        return new b(callable);
    }

    /* renamed from: b */
    public void m25373b() {
        if (!m25371e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m25374c() {
        return this.f30985a;
    }

    /* renamed from: g */
    public <T> Task<T> m25375g(Callable<T> callable) {
        Task<T> taskMo23644g;
        synchronized (this.f30987c) {
            taskMo23644g = this.f30986b.mo23644g(this.f30985a, m25372f(callable));
            this.f30986b = m25370d(taskMo23644g);
        }
        return taskMo23644g;
    }

    /* renamed from: h */
    public <T> Task<T> m25376h(Callable<Task<T>> callable) {
        Task<T> taskMo23645h;
        synchronized (this.f30987c) {
            taskMo23645h = this.f30986b.mo23645h(this.f30985a, m25372f(callable));
            this.f30986b = m25370d(taskMo23645h);
        }
        return taskMo23645h;
    }
}
