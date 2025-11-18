package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzczj {

    /* renamed from: a */
    private final E f25372a;

    /* renamed from: b */
    private final /* synthetic */ zzczf f25373b;

    private zzczj(zzczf zzczfVar, E e2) {
        this.f25373b = zzczfVar;
        this.f25372a = e2;
    }

    /* renamed from: b */
    private final <O> zzczl<O> m19103b(Callable<O> callable, zzbbl zzbblVar) {
        return new zzczl<>(this.f25373b, this.f25372a, zzczf.f25365a, Collections.emptyList(), zzbblVar.submit(callable));
    }

    /* renamed from: a */
    public final zzczl<?> m19104a(final zzczd zzczdVar, zzbbl zzbblVar) {
        return m19103b(new Callable(zzczdVar) { // from class: com.google.android.gms.internal.ads.fq

            /* renamed from: f */
            private final zzczd f18914f;

            {
                this.f18914f = zzczdVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f18914f.run();
                return null;
            }
        }, zzbblVar);
    }

    /* renamed from: c */
    public final <O> zzczl<O> m19105c(zzbbh<O> zzbbhVar) {
        return new zzczl<>(this.f25373b, this.f25372a, zzczf.f25365a, Collections.emptyList(), zzbbhVar);
    }

    /* renamed from: d */
    public final <O> zzczl<O> m19106d(Callable<O> callable) {
        return m19103b(callable, this.f25373b.f25366b);
    }
}
