package com.airbnb.lottie;

import L3.v;
import L3.z;
import android.os.Handler;
import android.os.Looper;
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
/* loaded from: classes.dex */
public class o<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f31324e = Executors.newCachedThreadPool(new X3.e());

    /* renamed from: a, reason: collision with root package name */
    private final Set<v<T>> f31325a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<v<Throwable>> f31326b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f31327c;

    /* renamed from: d, reason: collision with root package name */
    private volatile z<T> f31328d;

    /* compiled from: LottieTask.java */
    private static class a<T> extends FutureTask<z<T>> {

        /* renamed from: B, reason: collision with root package name */
        private o<T> f31329B;

        a(o<T> oVar, Callable<z<T>> callable) {
            super(callable);
            this.f31329B = oVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f31329B.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f31329B.l(new z(e10));
                }
            } finally {
                this.f31329B = null;
            }
        }
    }

    public o(Callable<z<T>> callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f31326b);
        if (arrayList.isEmpty()) {
            X3.d.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v) it.next()).onResult(th);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f31327c.post(new Runnable() { // from class: L3.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9103B.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        z<T> zVar = this.f31328d;
        if (zVar == null) {
            return;
        }
        if (zVar.b() != null) {
            i(zVar.b());
        } else {
            f(zVar.a());
        }
    }

    private synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f31325a).iterator();
        while (it.hasNext()) {
            ((v) it.next()).onResult(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(z<T> zVar) {
        if (this.f31328d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f31328d = zVar;
        g();
    }

    public synchronized o<T> c(v<Throwable> vVar) {
        try {
            z<T> zVar = this.f31328d;
            if (zVar != null && zVar.a() != null) {
                vVar.onResult(zVar.a());
            }
            this.f31326b.add(vVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized o<T> d(v<T> vVar) {
        try {
            z<T> zVar = this.f31328d;
            if (zVar != null && zVar.b() != null) {
                vVar.onResult(zVar.b());
            }
            this.f31325a.add(vVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public z<T> e() {
        return this.f31328d;
    }

    public synchronized o<T> j(v<Throwable> vVar) {
        this.f31326b.remove(vVar);
        return this;
    }

    public synchronized o<T> k(v<T> vVar) {
        this.f31325a.remove(vVar);
        return this;
    }

    public o(T t10) {
        this.f31325a = new LinkedHashSet(1);
        this.f31326b = new LinkedHashSet(1);
        this.f31327c = new Handler(Looper.getMainLooper());
        this.f31328d = null;
        l(new z<>(t10));
    }

    o(Callable<z<T>> callable, boolean z10) {
        this.f31325a = new LinkedHashSet(1);
        this.f31326b = new LinkedHashSet(1);
        this.f31327c = new Handler(Looper.getMainLooper());
        this.f31328d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th) {
                l(new z<>(th));
                return;
            }
        }
        f31324e.execute(new a(this, callable));
    }
}
