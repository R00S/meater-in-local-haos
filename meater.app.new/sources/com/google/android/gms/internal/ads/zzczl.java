package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzczl<O> {

    /* renamed from: a */
    private final E f25374a;

    /* renamed from: b */
    private final String f25375b;

    /* renamed from: c */
    private final zzbbh<?> f25376c;

    /* renamed from: d */
    private final List<zzbbh<?>> f25377d;

    /* renamed from: e */
    private final zzbbh<O> f25378e;

    /* renamed from: f */
    final /* synthetic */ zzczf f25379f;

    private zzczl(zzczf zzczfVar, E e2, String str, zzbbh<?> zzbbhVar, List<zzbbh<?>> list, zzbbh<O> zzbbhVar2) {
        this.f25379f = zzczfVar;
        this.f25374a = e2;
        this.f25375b = str;
        this.f25376c = zzbbhVar;
        this.f25377d = list;
        this.f25378e = zzbbhVar2;
    }

    /* renamed from: c */
    private final <O2> zzczl<O2> m19107c(zzbal<O, O2> zzbalVar, Executor executor) {
        return new zzczl<>(this.f25379f, this.f25374a, this.f25375b, this.f25376c, this.f25377d, zzbar.m17366c(this.f25378e, zzbalVar, executor));
    }

    /* renamed from: a */
    public final zzczl<O> m19108a(long j2, TimeUnit timeUnit) {
        zzczf zzczfVar = this.f25379f;
        return new zzczl<>(zzczfVar, this.f25374a, this.f25375b, this.f25376c, this.f25377d, zzbar.m17365b(this.f25378e, j2, timeUnit, zzczfVar.f25367c));
    }

    /* renamed from: b */
    public final <O2> zzczl<O2> m19109b(zzbal<O, O2> zzbalVar) {
        return m19107c(zzbalVar, this.f25379f.f25366b);
    }

    /* renamed from: d */
    public final <T extends Throwable> zzczl<O> m19110d(Class<T> cls, zzbal<T, O> zzbalVar) {
        zzczf zzczfVar = this.f25379f;
        return new zzczl<>(zzczfVar, this.f25374a, this.f25375b, this.f25376c, this.f25377d, zzbar.m17368e(this.f25378e, cls, zzbalVar, zzczfVar.f25366b));
    }

    /* renamed from: e */
    public final <T extends Throwable> zzczl<O> m19111e(Class<T> cls, final zzczc<T, O> zzczcVar) {
        return m19110d(cls, new zzbal(zzczcVar) { // from class: com.google.android.gms.internal.ads.iq

            /* renamed from: a */
            private final zzczc f19397a;

            {
                this.f19397a = zzczcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.m17378o(this.f19397a.mo14763a((Throwable) obj));
            }
        });
    }

    /* renamed from: f */
    public final zzcze<E, O> m19112f() {
        E e2 = this.f25374a;
        String strMo19101h = this.f25375b;
        if (strMo19101h == null) {
            strMo19101h = this.f25379f.mo19101h(e2);
        }
        final zzcze<E, O> zzczeVar = new zzcze<>(e2, strMo19101h, this.f25378e);
        this.f25379f.f25368d.mo15514M(zzczeVar);
        zzbbh<?> zzbbhVar = this.f25376c;
        Runnable runnable = new Runnable(this, zzczeVar) { // from class: com.google.android.gms.internal.ads.jq

            /* renamed from: f */
            private final zzczl f19497f;

            /* renamed from: g */
            private final zzcze f19498g;

            {
                this.f19497f = this;
                this.f19498g = zzczeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzczl zzczlVar = this.f19497f;
                zzczlVar.f25379f.f25368d.mo15513L(this.f19498g);
            }
        };
        Executor executor = zzbbm.f22758b;
        zzbbhVar.mo14748k(runnable, executor);
        zzbar.m17369f(zzczeVar, new C6867kq(this, zzczeVar), executor);
        return zzczeVar;
    }

    /* renamed from: g */
    public final <O2> zzczl<O2> m19113g(final zzbbh<O2> zzbbhVar) {
        return m19107c(new zzbal(zzbbhVar) { // from class: com.google.android.gms.internal.ads.hq

            /* renamed from: a */
            private final zzbbh f19243a;

            {
                this.f19243a = zzbbhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f19243a;
            }
        }, zzbbm.f22758b);
    }

    /* renamed from: h */
    public final <O2> zzczl<O2> m19114h(final zzczc<O, O2> zzczcVar) {
        return m19109b(new zzbal(zzczcVar) { // from class: com.google.android.gms.internal.ads.gq

            /* renamed from: a */
            private final zzczc f18989a;

            {
                this.f18989a = zzczcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.m17378o(this.f18989a.mo14763a(obj));
            }
        });
    }

    /* renamed from: i */
    public final zzczl<O> m19115i(String str) {
        return new zzczl<>(this.f25379f, this.f25374a, str, this.f25376c, this.f25377d, this.f25378e);
    }

    /* renamed from: j */
    public final zzczl<O> m19116j(E e2) {
        return this.f25379f.m19099c(e2, m19112f());
    }
}
