package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbxr implements zzdti<Set<String>> {

    /* renamed from: a */
    private final zzdtu<zzbzc> f23702a;

    public zzbxr(zzdtu<zzbzc> zzdtuVar) {
        this.f23702a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23702a.get().m18565d() != null ? Collections.singleton("banner") : Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
