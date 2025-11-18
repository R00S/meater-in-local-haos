package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzble implements zzdti<zzdan> {

    /* renamed from: a */
    private final zzdtu<Context> f23188a;

    public zzble(zzdtu<Context> zzdtuVar) {
        this.f23188a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzdan) zzdto.m19874b(new zzdan(this.f23188a.get(), zzk.zzlu().m17276b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
