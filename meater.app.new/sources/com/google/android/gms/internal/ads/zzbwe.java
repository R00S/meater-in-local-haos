package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbwe implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzbvz f23631a;

    /* renamed from: b */
    private final zzdtu<zzbxc> f23632b;

    private zzbwe(zzbvz zzbvzVar, zzdtu<zzbxc> zzdtuVar) {
        this.f23631a = zzbvzVar;
        this.f23632b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbwe m18412a(zzbvz zzbvzVar, zzdtu<zzbxc> zzdtuVar) {
        return new zzbwe(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23631a.mo15845a(this.f23632b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
