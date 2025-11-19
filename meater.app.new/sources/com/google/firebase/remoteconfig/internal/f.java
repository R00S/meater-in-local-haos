package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5202d;
import z7.InterfaceC5204f;
import z7.InterfaceC5205g;
import z7.InterfaceC5207i;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, f> f38666d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f38667e = new ExecutorC4121m();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38668a;

    /* renamed from: b, reason: collision with root package name */
    private final u f38669b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5208j<g> f38670c = null;

    /* compiled from: ConfigCacheClient.java */
    private static class b<TResult> implements InterfaceC5205g<TResult>, InterfaceC5204f, InterfaceC5202d {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f38671a;

        private b() {
            this.f38671a = new CountDownLatch(1);
        }

        @Override // z7.InterfaceC5205g
        public void a(TResult tresult) {
            this.f38671a.countDown();
        }

        @Override // z7.InterfaceC5202d
        public void b() {
            this.f38671a.countDown();
        }

        public boolean c(long j10, TimeUnit timeUnit) {
            return this.f38671a.await(j10, timeUnit);
        }

        @Override // z7.InterfaceC5204f
        public void d(Exception exc) {
            this.f38671a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f38668a = executor;
        this.f38669b = uVar;
    }

    private static <TResult> TResult c(AbstractC5208j<TResult> abstractC5208j, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f38667e;
        abstractC5208j.f(executor, bVar);
        abstractC5208j.d(executor, bVar);
        abstractC5208j.a(executor, bVar);
        if (!bVar.c(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC5208j.o()) {
            return abstractC5208j.k();
        }
        throw new ExecutionException(abstractC5208j.j());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map<String, f> map;
        try {
            strB = uVar.b();
            map = f38666d;
            if (!map.containsKey(strB)) {
                map.put(strB, new f(executor, uVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(g gVar) {
        return this.f38669b.e(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j j(boolean z10, g gVar, Void r32) {
        if (z10) {
            m(gVar);
        }
        return C5211m.e(gVar);
    }

    private synchronized void m(g gVar) {
        this.f38670c = C5211m.e(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f38670c = C5211m.e(null);
        }
        this.f38669b.a();
    }

    public synchronized AbstractC5208j<g> e() {
        try {
            AbstractC5208j<g> abstractC5208j = this.f38670c;
            if (abstractC5208j == null || (abstractC5208j.n() && !this.f38670c.o())) {
                Executor executor = this.f38668a;
                final u uVar = this.f38669b;
                Objects.requireNonNull(uVar);
                this.f38670c = C5211m.c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38670c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j10) {
        synchronized (this) {
            try {
                AbstractC5208j<g> abstractC5208j = this.f38670c;
                if (abstractC5208j != null && abstractC5208j.o()) {
                    return this.f38670c.k();
                }
                try {
                    return (g) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC5208j<g> k(g gVar) {
        return l(gVar, true);
    }

    public AbstractC5208j<g> l(final g gVar, final boolean z10) {
        return C5211m.c(this.f38668a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f38661a.i(gVar);
            }
        }).p(this.f38668a, new InterfaceC5207i() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // z7.InterfaceC5207i
            public final AbstractC5208j a(Object obj) {
                return this.f38663a.j(z10, gVar, (Void) obj);
            }
        });
    }
}
