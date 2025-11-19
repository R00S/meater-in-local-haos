package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import l8.C3916i;
import l8.m;
import q8.AbstractC4318a;
import q8.C4319b;

/* compiled from: Futures.java */
/* loaded from: classes2.dex */
public final class c extends d {

    /* compiled from: Futures.java */
    private static final class a<V> implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final Future<V> f37633B;

        /* renamed from: C, reason: collision with root package name */
        final b<? super V> f37634C;

        a(Future<V> future, b<? super V> bVar) {
            this.f37633B = future;
            this.f37634C = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f37633B;
            if ((future instanceof AbstractC4318a) && (thA = C4319b.a((AbstractC4318a) future)) != null) {
                this.f37634C.b(thA);
                return;
            }
            try {
                this.f37634C.a(c.b(this.f37633B));
            } catch (ExecutionException e10) {
                this.f37634C.b(e10.getCause());
            } catch (Throwable th) {
                this.f37634C.b(th);
            }
        }

        public String toString() {
            return C3916i.b(this).h(this.f37634C).toString();
        }
    }

    public static <V> void a(f<V> fVar, b<? super V> bVar, Executor executor) {
        m.l(bVar);
        fVar.c(new a(fVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        m.s(future.isDone(), "Future was expected to be done: %s", future);
        return (V) h.a(future);
    }
}
