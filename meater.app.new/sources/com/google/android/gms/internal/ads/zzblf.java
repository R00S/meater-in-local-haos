package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzblf implements zzdti<zzayu> {

    /* renamed from: a */
    private final zzdtu<Context> f23189a;

    public zzblf(zzdtu<Context> zzdtuVar) {
        this.f23189a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzayu) zzdto.m19874b(new zzayu(this.f23189a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
