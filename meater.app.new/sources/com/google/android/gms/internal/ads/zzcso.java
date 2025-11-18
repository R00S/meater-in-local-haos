package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcso implements zzdti<zzcxk> {

    /* renamed from: a */
    private final zzdtu<Clock> f25032a;

    public zzcso(zzdtu<Clock> zzdtuVar) {
        this.f25032a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcxk) zzdto.m19874b(new zzcxk(this.f25032a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
