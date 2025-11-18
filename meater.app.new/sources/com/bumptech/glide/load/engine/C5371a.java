package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.C5399p;
import com.bumptech.glide.p145r.C5596j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes.dex */
final class C5371a {

    /* renamed from: a */
    private final boolean f13240a;

    /* renamed from: b */
    private final Executor f13241b;

    /* renamed from: c */
    final Map<InterfaceC5423f, d> f13242c;

    /* renamed from: d */
    private final ReferenceQueue<C5399p<?>> f13243d;

    /* renamed from: e */
    private C5399p.a f13244e;

    /* renamed from: f */
    private volatile boolean f13245f;

    /* renamed from: g */
    private volatile c f13246g;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a */
    class a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC11452a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f13247f;

            RunnableC11452a(Runnable runnable) {
                this.f13247f = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f13247f.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC11452a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5371a.this.m10172b();
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    interface c {
        /* renamed from: a */
        void m10177a();
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$d */
    static final class d extends WeakReference<C5399p<?>> {

        /* renamed from: a */
        final InterfaceC5423f f13250a;

        /* renamed from: b */
        final boolean f13251b;

        /* renamed from: c */
        InterfaceC5404u<?> f13252c;

        d(InterfaceC5423f interfaceC5423f, C5399p<?> c5399p, ReferenceQueue<? super C5399p<?>> referenceQueue, boolean z) {
            super(c5399p, referenceQueue);
            this.f13250a = (InterfaceC5423f) C5596j.m11042d(interfaceC5423f);
            this.f13252c = (c5399p.m10343f() && z) ? (InterfaceC5404u) C5596j.m11042d(c5399p.m10339b()) : null;
            this.f13251b = c5399p.m10343f();
        }

        /* renamed from: a */
        void m10178a() {
            this.f13252c = null;
            clear();
        }
    }

    C5371a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    synchronized void m10171a(InterfaceC5423f interfaceC5423f, C5399p<?> c5399p) {
        d dVarPut = this.f13242c.put(interfaceC5423f, new d(interfaceC5423f, c5399p, this.f13243d, this.f13240a));
        if (dVarPut != null) {
            dVarPut.m10178a();
        }
    }

    /* renamed from: b */
    void m10172b() {
        while (!this.f13245f) {
            try {
                m10173c((d) this.f13243d.remove());
                c cVar = this.f13246g;
                if (cVar != null) {
                    cVar.m10177a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    void m10173c(d dVar) {
        InterfaceC5404u<?> interfaceC5404u;
        synchronized (this.f13244e) {
            synchronized (this) {
                this.f13242c.remove(dVar.f13250a);
                if (dVar.f13251b && (interfaceC5404u = dVar.f13252c) != null) {
                    C5399p<?> c5399p = new C5399p<>(interfaceC5404u, true, false);
                    c5399p.m10345h(dVar.f13250a, this.f13244e);
                    this.f13244e.mo10308d(dVar.f13250a, c5399p);
                }
            }
        }
    }

    /* renamed from: d */
    synchronized void m10174d(InterfaceC5423f interfaceC5423f) {
        d dVarRemove = this.f13242c.remove(interfaceC5423f);
        if (dVarRemove != null) {
            dVarRemove.m10178a();
        }
    }

    /* renamed from: e */
    synchronized C5399p<?> m10175e(InterfaceC5423f interfaceC5423f) {
        d dVar = this.f13242c.get(interfaceC5423f);
        if (dVar == null) {
            return null;
        }
        C5399p<?> c5399p = dVar.get();
        if (c5399p == null) {
            m10173c(dVar);
        }
        return c5399p;
    }

    /* renamed from: f */
    void m10176f(C5399p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f13244e = aVar;
            }
        }
    }

    C5371a(boolean z, Executor executor) {
        this.f13242c = new HashMap();
        this.f13243d = new ReferenceQueue<>();
        this.f13240a = z;
        this.f13241b = executor;
        executor.execute(new b());
    }
}
