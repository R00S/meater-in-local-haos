package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: I, reason: collision with root package name */
    private final ScheduledFuture<?> f38148I;

    /* compiled from: DelegatingScheduledFuture.java */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.E(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.D(v10);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f38148I = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f38148I.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f38148I.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void n() {
        this.f38148I.cancel(G());
    }
}
