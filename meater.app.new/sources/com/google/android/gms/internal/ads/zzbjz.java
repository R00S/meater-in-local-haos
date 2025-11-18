package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbjz implements zzdti<zzasl> {

    /* renamed from: a */
    private final zzdtu<Context> f23127a;

    public zzbjz(zzdtu<Context> zzdtuVar) {
        this.f23127a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Context context = this.f23127a.get();
        return (zzasl) zzdto.m19874b(new zzasj(context, new zzaso(context).mo16901a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
