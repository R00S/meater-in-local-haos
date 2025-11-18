package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* renamed from: com.airbnb.lottie.l */
/* loaded from: classes.dex */
public class C5188l<T> {

    /* renamed from: a */
    public static Executor f12421a = Executors.newCachedThreadPool();

    /* renamed from: b */
    private Thread f12422b;

    /* renamed from: c */
    private final Set<InterfaceC5184h<T>> f12423c;

    /* renamed from: d */
    private final Set<InterfaceC5184h<Throwable>> f12424d;

    /* renamed from: e */
    private final Handler f12425e;

    /* renamed from: f */
    private final FutureTask<C5187k<T>> f12426f;

    /* renamed from: g */
    private volatile C5187k<T> f12427g;

    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5188l.this.f12427g == null || C5188l.this.f12426f.isCancelled()) {
                return;
            }
            C5187k c5187k = C5188l.this.f12427g;
            if (c5187k.m9488b() != null) {
                C5188l.this.m9497k(c5187k.m9488b());
            } else {
                C5188l.this.m9495i(c5187k.m9487a());
            }
        }
    }

    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.l$b */
    class b extends Thread {

        /* renamed from: f */
        private boolean f12429f;

        b(String str) {
            super(str);
            this.f12429f = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!isInterrupted() && !this.f12429f) {
                if (C5188l.this.f12426f.isDone()) {
                    try {
                        C5188l c5188l = C5188l.this;
                        c5188l.m9498n((C5187k) c5188l.f12426f.get());
                    } catch (InterruptedException | ExecutionException e2) {
                        C5188l.this.m9498n(new C5187k(e2));
                    }
                    this.f12429f = true;
                    C5188l.this.m9500p();
                }
            }
        }
    }

    public C5188l(Callable<C5187k<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m9495i(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f12424d);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5184h) it.next()).mo9387a(th);
        }
    }

    /* renamed from: j */
    private void m9496j() {
        this.f12425e.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m9497k(T t) {
        Iterator it = new ArrayList(this.f12423c).iterator();
        while (it.hasNext()) {
            ((InterfaceC5184h) it.next()).mo9387a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m9498n(C5187k<T> c5187k) {
        if (this.f12427g != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f12427g = c5187k;
        m9496j();
    }

    /* renamed from: o */
    private synchronized void m9499o() {
        if (!m9501q() && this.f12427g == null) {
            b bVar = new b("LottieTaskObserver");
            this.f12422b = bVar;
            bVar.start();
            C5179c.m9392b("Starting TaskObserver thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public synchronized void m9500p() {
        if (m9501q()) {
            if (this.f12423c.isEmpty() || this.f12427g != null) {
                this.f12422b.interrupt();
                this.f12422b = null;
                C5179c.m9392b("Stopping TaskObserver thread");
            }
        }
    }

    /* renamed from: q */
    private boolean m9501q() {
        Thread thread = this.f12422b;
        return thread != null && thread.isAlive();
    }

    /* renamed from: g */
    public synchronized C5188l<T> m9502g(InterfaceC5184h<Throwable> interfaceC5184h) {
        if (this.f12427g != null && this.f12427g.m9487a() != null) {
            interfaceC5184h.mo9387a(this.f12427g.m9487a());
        }
        this.f12424d.add(interfaceC5184h);
        m9499o();
        return this;
    }

    /* renamed from: h */
    public synchronized C5188l<T> m9503h(InterfaceC5184h<T> interfaceC5184h) {
        if (this.f12427g != null && this.f12427g.m9488b() != null) {
            interfaceC5184h.mo9387a(this.f12427g.m9488b());
        }
        this.f12423c.add(interfaceC5184h);
        m9499o();
        return this;
    }

    /* renamed from: l */
    public synchronized C5188l<T> m9504l(InterfaceC5184h<Throwable> interfaceC5184h) {
        this.f12424d.remove(interfaceC5184h);
        m9500p();
        return this;
    }

    /* renamed from: m */
    public synchronized C5188l<T> m9505m(InterfaceC5184h<T> interfaceC5184h) {
        this.f12423c.remove(interfaceC5184h);
        m9500p();
        return this;
    }

    C5188l(Callable<C5187k<T>> callable, boolean z) {
        this.f12423c = new LinkedHashSet(1);
        this.f12424d = new LinkedHashSet(1);
        this.f12425e = new Handler(Looper.getMainLooper());
        this.f12427g = null;
        FutureTask<C5187k<T>> futureTask = new FutureTask<>(callable);
        this.f12426f = futureTask;
        if (!z) {
            f12421a.execute(futureTask);
            m9499o();
        } else {
            try {
                m9498n(callable.call());
            } catch (Throwable th) {
                m9498n(new C5187k<>(th));
            }
        }
    }
}
