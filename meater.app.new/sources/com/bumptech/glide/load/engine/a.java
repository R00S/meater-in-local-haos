package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import m6.InterfaceC3970e;
import o6.InterfaceC4139c;

/* compiled from: ActiveResources.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33069a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f33070b;

    /* renamed from: c, reason: collision with root package name */
    final Map<InterfaceC3970e, c> f33071c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<o<?>> f33072d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f33073e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f33074f;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0454a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0455a implements Runnable {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Runnable f33075B;

            RunnableC0455a(Runnable runnable) {
                this.f33075B = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f33075B.run();
            }
        }

        ThreadFactoryC0454a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0455a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* compiled from: ActiveResources.java */
    static final class c extends WeakReference<o<?>> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC3970e f33078a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f33079b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC4139c<?> f33080c;

        c(InterfaceC3970e interfaceC3970e, o<?> oVar, ReferenceQueue<? super o<?>> referenceQueue, boolean z10) {
            super(oVar, referenceQueue);
            this.f33078a = (InterfaceC3970e) H6.k.d(interfaceC3970e);
            this.f33080c = (oVar.f() && z10) ? (InterfaceC4139c) H6.k.d(oVar.e()) : null;
            this.f33079b = oVar.f();
        }

        void a() {
            this.f33080c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0454a()));
    }

    synchronized void a(InterfaceC3970e interfaceC3970e, o<?> oVar) {
        c cVarPut = this.f33071c.put(interfaceC3970e, new c(interfaceC3970e, oVar, this.f33072d, this.f33069a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    void b() {
        while (!this.f33074f) {
            try {
                c((c) this.f33072d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        InterfaceC4139c<?> interfaceC4139c;
        synchronized (this) {
            this.f33071c.remove(cVar.f33078a);
            if (cVar.f33079b && (interfaceC4139c = cVar.f33080c) != null) {
                this.f33073e.c(cVar.f33078a, new o<>(interfaceC4139c, true, false, cVar.f33078a, this.f33073e));
            }
        }
    }

    synchronized void d(InterfaceC3970e interfaceC3970e) {
        c cVarRemove = this.f33071c.remove(interfaceC3970e);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    synchronized o<?> e(InterfaceC3970e interfaceC3970e) {
        c cVar = this.f33071c.get(interfaceC3970e);
        if (cVar == null) {
            return null;
        }
        o<?> oVar = cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f33073e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f33071c = new HashMap();
        this.f33072d = new ReferenceQueue<>();
        this.f33069a = z10;
        this.f33070b = executor;
        executor.execute(new b());
    }
}
