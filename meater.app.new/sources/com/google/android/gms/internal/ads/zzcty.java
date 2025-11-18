package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcty implements zzdti<zzctw> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25071a;

    /* renamed from: b */
    private final zzdtu<Context> f25072b;

    /* renamed from: c */
    private final zzdtu<Set<String>> f25073c;

    private zzcty(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Set<String>> zzdtuVar3) {
        this.f25071a = zzdtuVar;
        this.f25072b = zzdtuVar2;
        this.f25073c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcty m18982a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Set<String>> zzdtuVar3) {
        return new zzcty(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctw(this.f25071a.get(), this.f25072b.get(), this.f25073c.get());
    }
}
