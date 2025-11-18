package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzczh {

    /* renamed from: a */
    private final E f25369a;

    /* renamed from: b */
    private final List<zzbbh<?>> f25370b;

    /* renamed from: c */
    private final /* synthetic */ zzczf f25371c;

    private zzczh(zzczf zzczfVar, E e2, List<zzbbh<?>> list) {
        this.f25371c = zzczfVar;
        this.f25369a = e2;
        this.f25370b = list;
    }

    /* renamed from: a */
    public final <O> zzczl<O> m19102a(Callable<O> callable) {
        zzbbc zzbbcVarM17377n = zzbar.m17377n(this.f25370b);
        zzbbh zzbbhVarM17379a = zzbbcVarM17377n.m17379a(CallableC6645eq.f18831f, zzbbm.f22758b);
        zzczf zzczfVar = this.f25371c;
        return new zzczl<>(zzczfVar, this.f25369a, zzbbhVarM17379a, this.f25370b, zzbbcVarM17377n.m17379a(callable, zzczfVar.f25366b));
    }
}
