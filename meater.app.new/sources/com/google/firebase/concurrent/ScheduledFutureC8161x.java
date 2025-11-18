package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p024c.p042f.p043a.AbstractC0875a;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: com.google.firebase.concurrent.x */
/* loaded from: classes2.dex */
class ScheduledFutureC8161x<V> extends AbstractC0875a<V> implements ScheduledFuture<V> {

    /* renamed from: m */
    private final ScheduledFuture<?> f30814m;

    /* compiled from: DelegatingScheduledFuture.java */
    /* renamed from: com.google.firebase.concurrent.x$a */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.b
        /* renamed from: a */
        public void mo25125a(Throwable th) {
            ScheduledFutureC8161x.this.m5504M(th);
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.b
        public void set(V v) {
            ScheduledFutureC8161x.this.m5503L(v);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* renamed from: com.google.firebase.concurrent.x$b */
    interface b<T> {
        /* renamed from: a */
        void mo25125a(Throwable th);

        void set(T t);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* renamed from: com.google.firebase.concurrent.x$c */
    interface c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo25099a(b<T> bVar);
    }

    ScheduledFutureC8161x(c<V> cVar) {
        this.f30814m = cVar.mo25099a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f30814m.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f30814m.getDelay(timeUnit);
    }

    @Override // p024c.p042f.p043a.AbstractC0875a
    /* renamed from: u */
    protected void mo5506u() {
        this.f30814m.cancel(m5505O());
    }
}
