package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public class zzbbr<T> implements zzbbh<T> {

    /* renamed from: g */
    private T f22763g;

    /* renamed from: h */
    private Throwable f22764h;

    /* renamed from: i */
    private boolean f22765i;

    /* renamed from: j */
    private boolean f22766j;

    /* renamed from: f */
    private final Object f22762f = new Object();

    /* renamed from: k */
    private final C6552c7 f22767k = new C6552c7();

    /* renamed from: d */
    private final boolean m17384d() {
        return this.f22764h != null || this.f22765i;
    }

    /* renamed from: a */
    public final void m17385a(T t) {
        synchronized (this.f22762f) {
            if (this.f22766j) {
                return;
            }
            if (m17384d()) {
                zzk.zzlk().m17053h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                return;
            }
            this.f22765i = true;
            this.f22763g = t;
            this.f22762f.notifyAll();
            this.f22767k.m14965b();
        }
    }

    /* renamed from: c */
    public final void m17386c(Throwable th) {
        synchronized (this.f22762f) {
            if (this.f22766j) {
                return;
            }
            if (m17384d()) {
                zzk.zzlk().m17053h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                return;
            }
            this.f22764h = th;
            this.f22762f.notifyAll();
            this.f22767k.m14965b();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f22762f) {
            if (m17384d()) {
                return false;
            }
            this.f22766j = true;
            this.f22765i = true;
            this.f22762f.notifyAll();
            this.f22767k.m14965b();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, CancellationException, InterruptedException {
        T t;
        synchronized (this.f22762f) {
            while (!m17384d()) {
                this.f22762f.wait();
            }
            if (this.f22764h != null) {
                throw new ExecutionException(this.f22764h);
            }
            if (this.f22766j) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.f22763g;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.f22762f) {
            z = this.f22766j;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean zM17384d;
        synchronized (this.f22762f) {
            zM17384d = m17384d();
        }
        return zM17384d;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    /* renamed from: k */
    public final void mo14748k(Runnable runnable, Executor executor) {
        this.f22767k.m14964a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws ExecutionException, CancellationException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f22762f) {
            long millis = timeUnit.toMillis(j2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = millis + jCurrentTimeMillis;
            while (!m17384d() && jCurrentTimeMillis < j3) {
                this.f22762f.wait(j3 - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (!this.f22766j) {
                if (this.f22764h == null) {
                    if (this.f22765i) {
                        t = this.f22763g;
                    } else {
                        throw new TimeoutException("SettableFuture timed out.");
                    }
                } else {
                    throw new ExecutionException(this.f22764h);
                }
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }
}
