package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzbar {
    /* renamed from: a */
    public static <V> zzbbc<V> m17364a(zzbbh<? extends V>... zzbbhVarArr) {
        return m17377n(Arrays.asList(zzbbhVarArr));
    }

    /* renamed from: b */
    public static <V> zzbbh<V> m17365b(zzbbh<V> zzbbhVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final zzbbr zzbbrVar = new zzbbr();
        m17371h(zzbbrVar, zzbbhVar);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(zzbbrVar) { // from class: com.google.android.gms.internal.ads.t6

            /* renamed from: f */
            private final zzbbr f20559f;

            {
                this.f20559f = zzbbrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20559f.m17386c(new TimeoutException());
            }
        }, j2, timeUnit);
        m17370g(zzbbhVar, zzbbrVar);
        zzbbrVar.mo14748k(new Runnable(scheduledFutureSchedule) { // from class: com.google.android.gms.internal.ads.u6

            /* renamed from: f */
            private final Future f20619f;

            {
                this.f20619f = scheduledFutureSchedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future = this.f20619f;
                if (future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        }, zzbbm.f22758b);
        return zzbbrVar;
    }

    /* renamed from: c */
    public static <A, B> zzbbh<B> m17366c(final zzbbh<A> zzbbhVar, final zzbal<? super A, ? extends B> zzbalVar, Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbbhVar.mo14748k(new Runnable(zzbbrVar, zzbalVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.q6

            /* renamed from: f */
            private final zzbbr f20375f;

            /* renamed from: g */
            private final zzbal f20376g;

            /* renamed from: h */
            private final zzbbh f20377h;

            {
                this.f20375f = zzbbrVar;
                this.f20376g = zzbalVar;
                this.f20377h = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbar.m17372i(this.f20375f, this.f20376g, this.f20377h);
            }
        }, executor);
        m17371h(zzbbrVar, zzbbhVar);
        return zzbbrVar;
    }

    /* renamed from: d */
    public static <A, B> zzbbh<B> m17367d(final zzbbh<A> zzbbhVar, final zzbam<A, B> zzbamVar, Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbbhVar.mo14748k(new Runnable(zzbbrVar, zzbamVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.p6

            /* renamed from: f */
            private final zzbbr f20281f;

            /* renamed from: g */
            private final zzbam f20282g;

            /* renamed from: h */
            private final zzbbh f20283h;

            {
                this.f20281f = zzbbrVar;
                this.f20282g = zzbamVar;
                this.f20283h = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbr zzbbrVar2 = this.f20281f;
                try {
                    zzbbrVar2.m17385a(this.f20282g.mo14764a(this.f20283h.get()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzbbrVar2.m17386c(e2);
                } catch (CancellationException unused) {
                    zzbbrVar2.cancel(true);
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzbbrVar2.m17386c(e);
                } catch (Exception e4) {
                    zzbbrVar2.m17386c(e4);
                }
            }
        }, executor);
        m17371h(zzbbrVar, zzbbhVar);
        return zzbbrVar;
    }

    /* renamed from: e */
    public static <V, X extends Throwable> zzbbh<V> m17368e(final zzbbh<? extends V> zzbbhVar, final Class<X> cls, final zzbal<? super X, ? extends V> zzbalVar, final Executor executor) {
        final zzbbr zzbbrVar = new zzbbr();
        m17371h(zzbbrVar, zzbbhVar);
        zzbbhVar.mo14748k(new Runnable(zzbbrVar, zzbbhVar, cls, zzbalVar, executor) { // from class: com.google.android.gms.internal.ads.v6

            /* renamed from: f */
            private final zzbbr f20723f;

            /* renamed from: g */
            private final zzbbh f20724g;

            /* renamed from: h */
            private final Class f20725h;

            /* renamed from: i */
            private final zzbal f20726i;

            /* renamed from: j */
            private final Executor f20727j;

            {
                this.f20723f = zzbbrVar;
                this.f20724g = zzbbhVar;
                this.f20725h = cls;
                this.f20726i = zzbalVar;
                this.f20727j = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbar.m17373j(this.f20723f, this.f20724g, this.f20725h, this.f20726i, this.f20727j);
            }
        }, zzbbm.f22758b);
        return zzbbrVar;
    }

    /* renamed from: f */
    public static <V> void m17369f(final zzbbh<V> zzbbhVar, final zzban<? super V> zzbanVar, Executor executor) {
        zzbbhVar.mo14748k(new Runnable(zzbanVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.o6

            /* renamed from: f */
            private final zzban f20139f;

            /* renamed from: g */
            private final zzbbh f20140g;

            {
                this.f20139f = zzbanVar;
                this.f20140g = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzban zzbanVar2 = this.f20139f;
                try {
                    zzbanVar2.mo14743b(this.f20140g.get());
                } catch (InterruptedException e2) {
                    e = e2;
                    Thread.currentThread().interrupt();
                    zzbanVar2.mo14742a(e);
                } catch (ExecutionException e3) {
                    e = e3.getCause();
                    zzbanVar2.mo14742a(e);
                } catch (Exception e4) {
                    e = e4;
                    zzbanVar2.mo14742a(e);
                }
            }
        }, executor);
    }

    /* renamed from: g */
    private static <V> void m17370g(final zzbbh<? extends V> zzbbhVar, final zzbbr<V> zzbbrVar) {
        m17371h(zzbbrVar, zzbbhVar);
        zzbbhVar.mo14748k(new Runnable(zzbbrVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.w6

            /* renamed from: f */
            private final zzbbr f20836f;

            /* renamed from: g */
            private final zzbbh f20837g;

            {
                this.f20836f = zzbbrVar;
                this.f20837g = zzbbhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbr zzbbrVar2 = this.f20836f;
                try {
                    zzbbrVar2.m17385a(this.f20837g.get());
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzbbrVar2.m17386c(e2);
                } catch (ExecutionException e3) {
                    zzbbrVar2.m17386c(e3.getCause());
                } catch (Exception e4) {
                    zzbbrVar2.m17386c(e4);
                }
            }
        }, zzbbm.f22758b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static <A, B> void m17371h(final zzbbh<A> zzbbhVar, final Future<B> future) {
        zzbbhVar.mo14748k(new Runnable(zzbbhVar, future) { // from class: com.google.android.gms.internal.ads.x6

            /* renamed from: f */
            private final zzbbh f20949f;

            /* renamed from: g */
            private final Future f20950g;

            {
                this.f20949f = zzbbhVar;
                this.f20950g = future;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbh zzbbhVar2 = this.f20949f;
                Future future2 = this.f20950g;
                if (zzbbhVar2.isCancelled()) {
                    future2.cancel(true);
                }
            }
        }, zzbbm.f22758b);
    }

    /* renamed from: i */
    static final /* synthetic */ void m17372i(zzbbr zzbbrVar, zzbal zzbalVar, zzbbh zzbbhVar) {
        if (zzbbrVar.isCancelled()) {
            return;
        }
        try {
            m17370g(zzbalVar.zzf(zzbbhVar.get()), zzbbrVar);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzbbrVar.m17386c(e2);
        } catch (CancellationException unused) {
            zzbbrVar.cancel(true);
        } catch (ExecutionException e3) {
            zzbbrVar.m17386c(e3.getCause());
        } catch (Exception e4) {
            zzbbrVar.m17386c(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final /* synthetic */ void m17373j(com.google.android.gms.internal.ads.zzbbr r1, com.google.android.gms.internal.ads.zzbbh r2, java.lang.Class r3, com.google.android.gms.internal.ads.zzbal r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            r1.m17385a(r2)     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            return
        L8:
            r2 = move-exception
            goto L18
        La:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L18
        L13:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L18:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L2a
            com.google.android.gms.internal.ads.b7 r2 = m17378o(r2)
            com.google.android.gms.internal.ads.zzbbh r2 = m17366c(r2, r4, r5)
            m17370g(r2, r1)
            return
        L2a:
            r1.m17386c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbar.m17373j(com.google.android.gms.internal.ads.zzbbr, com.google.android.gms.internal.ads.zzbbh, java.lang.Class, com.google.android.gms.internal.ads.zzbal, java.util.concurrent.Executor):void");
    }

    /* renamed from: l */
    public static <T> C6478a7<T> m17375l(Throwable th) {
        return new C6478a7<>(th);
    }

    /* renamed from: m */
    public static <V> zzbbh<List<V>> m17376m(final Iterable<? extends zzbbh<? extends V>> iterable) {
        final zzbbr zzbbrVar = new zzbbr();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh<? extends V> zzbbhVar : iterable) {
            atomicInteger.incrementAndGet();
            m17371h(zzbbrVar, zzbbhVar);
        }
        final Runnable runnable = new Runnable(iterable, zzbbrVar) { // from class: com.google.android.gms.internal.ads.r6

            /* renamed from: f */
            private final Iterable f20437f;

            /* renamed from: g */
            private final zzbbr f20438g;

            {
                this.f20437f = iterable;
                this.f20438g = zzbbrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Iterable iterable2 = this.f20437f;
                zzbbr zzbbrVar2 = this.f20438g;
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((zzbbh) it.next()).get());
                    } catch (InterruptedException e2) {
                        e = e2;
                        zzbbrVar2.m17386c(e);
                    } catch (ExecutionException e3) {
                        zzbbrVar2.m17386c(e3.getCause());
                    } catch (Exception e4) {
                        e = e4;
                        zzbbrVar2.m17386c(e);
                    }
                }
                zzbbrVar2.m17385a(arrayList);
            }
        };
        for (final zzbbh<? extends V> zzbbhVar2 : iterable) {
            zzbbhVar2.mo14748k(new Runnable(zzbbhVar2, atomicInteger, runnable, zzbbrVar) { // from class: com.google.android.gms.internal.ads.s6

                /* renamed from: f */
                private final zzbbh f20503f;

                /* renamed from: g */
                private final AtomicInteger f20504g;

                /* renamed from: h */
                private final Runnable f20505h;

                /* renamed from: i */
                private final zzbbr f20506i;

                {
                    this.f20503f = zzbbhVar2;
                    this.f20504g = atomicInteger;
                    this.f20505h = runnable;
                    this.f20506i = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    zzbbh zzbbhVar3 = this.f20503f;
                    AtomicInteger atomicInteger2 = this.f20504g;
                    Runnable runnable2 = this.f20505h;
                    zzbbr zzbbrVar2 = this.f20506i;
                    try {
                        zzbbhVar3.get();
                        if (atomicInteger2.decrementAndGet() == 0) {
                            runnable2.run();
                        }
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        zzbbrVar2.m17386c(e2);
                    } catch (ExecutionException e3) {
                        zzbbrVar2.m17386c(e3.getCause());
                    } catch (Exception e4) {
                        zzbbrVar2.m17386c(e4);
                    }
                }
            }, zzbbm.f22758b);
        }
        return zzbbrVar;
    }

    /* renamed from: n */
    public static <V> zzbbc<V> m17377n(Iterable<? extends zzbbh<? extends V>> iterable) {
        return new zzbbc<>(iterable);
    }

    /* renamed from: o */
    public static <T> C6515b7<T> m17378o(T t) {
        return new C6515b7<>(t);
    }
}
