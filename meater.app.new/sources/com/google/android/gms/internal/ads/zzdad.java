package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzdad implements zzdti<zzalr> {

    /* renamed from: a */
    private final zzdac f25418a;

    /* renamed from: b */
    private final zzdtu<Context> f25419b;

    /* renamed from: c */
    private final zzdtu<zzbai> f25420c;

    public zzdad(zzdac zzdacVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2) {
        this.f25418a = zzdacVar;
        this.f25419b = zzdtuVar;
        this.f25420c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzalr) zzdto.m19874b(new zzalk().m16656b(this.f25419b.get(), this.f25420c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
