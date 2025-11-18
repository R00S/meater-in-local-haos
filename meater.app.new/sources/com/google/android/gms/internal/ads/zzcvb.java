package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcvb<T> {

    /* renamed from: a */
    private final Set<zzcva<? extends zzcuz<T>>> f25126a;

    /* renamed from: b */
    private final Executor f25127b;

    public zzcvb(Executor executor, Set<zzcva<? extends zzcuz<T>>> set) {
        this.f25127b = executor;
        this.f25126a = set;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m18997a(List list, Object obj) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                zzcuz zzcuzVar = (zzcuz) ((zzbbh) it.next()).get();
                if (zzcuzVar != null) {
                    zzcuzVar.mo15076a(obj);
                }
            } catch (InterruptedException | ExecutionException e2) {
                zzbad.m17347c("Derive quality signals error.", e2);
                throw new Exception(e2);
            }
        }
        return obj;
    }

    /* renamed from: b */
    public final zzbbh<T> m18998b(final T t) {
        final ArrayList arrayList = new ArrayList(this.f25126a.size());
        for (final zzcva<? extends zzcuz<T>> zzcvaVar : this.f25126a) {
            zzbbh<S> zzbbhVarMo14982b = zzcvaVar.mo14982b();
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21672N1)).booleanValue()) {
                final long jMo14609b = zzk.zzln().mo14609b();
                zzbbhVarMo14982b.mo14748k(new Runnable(zzcvaVar, jMo14609b) { // from class: com.google.android.gms.internal.ads.ap

                    /* renamed from: f */
                    private final zzcva f18178f;

                    /* renamed from: g */
                    private final long f18179g;

                    {
                        this.f18178f = zzcvaVar;
                        this.f18179g = jMo14609b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcva zzcvaVar2 = this.f18178f;
                        long j2 = this.f18179g;
                        String canonicalName = zzcvaVar2.getClass().getCanonicalName();
                        long jMo14609b2 = zzk.zzln().mo14609b() - j2;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(jMo14609b2);
                        zzawz.m17082m(sb.toString());
                    }
                }, zzbbm.f22758b);
            }
            arrayList.add(zzbbhVarMo14982b);
        }
        return zzbar.m17377n(arrayList).m17379a(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.bp

            /* renamed from: f */
            private final List f18350f;

            /* renamed from: g */
            private final Object f18351g;

            {
                this.f18350f = arrayList;
                this.f18351g = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcvb.m18997a(this.f18350f, this.f18351g);
            }
        }, this.f25127b);
    }
}
