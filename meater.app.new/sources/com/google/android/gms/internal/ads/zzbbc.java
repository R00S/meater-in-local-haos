package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzbbc<V> {

    /* renamed from: a */
    private final zzbbr<Void> f22756a = new zzbbr<>();

    zzbbc(Iterable<? extends zzbbh<? extends V>> iterable) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh<? extends V> zzbbhVar : iterable) {
            atomicInteger.incrementAndGet();
            zzbar.m17371h(this.f22756a, zzbbhVar);
        }
        if (atomicInteger.get() == 0) {
            this.f22756a.m17385a(null);
            return;
        }
        Iterator<? extends zzbbh<? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            it.next().mo14748k(new Runnable(this, atomicInteger) { // from class: com.google.android.gms.internal.ads.y6

                /* renamed from: f */
                private final zzbbc f21105f;

                /* renamed from: g */
                private final AtomicInteger f21106g;

                {
                    this.f21105f = this;
                    this.f21106g = atomicInteger;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f21105f.m17380b(this.f21106g);
                }
            }, zzbbm.f22758b);
        }
    }

    /* renamed from: a */
    public final <C> zzbbh<C> m17379a(final Callable<C> callable, Executor executor) {
        return zzbar.m17366c(this.f22756a, new zzbal(callable) { // from class: com.google.android.gms.internal.ads.z6

            /* renamed from: a */
            private final Callable f21372a;

            {
                this.f21372a = callable;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.m17378o(this.f21372a.call());
            }
        }, executor);
    }

    /* renamed from: b */
    final /* synthetic */ void m17380b(AtomicInteger atomicInteger) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.f22756a.m17385a(null);
        }
    }
}
