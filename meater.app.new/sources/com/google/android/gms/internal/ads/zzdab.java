package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdab implements zzdti<C6904lq> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzczz>>> f25417a;

    private zzdab(zzdtu<Set<zzbuz<zzczz>>> zzdtuVar) {
        this.f25417a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzdab m19129a(zzdtu<Set<zzbuz<zzczz>>> zzdtuVar) {
        return new zzdab(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new C6904lq(this.f25417a.get());
    }
}
