package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbjr implements zzdti<Context> {

    /* renamed from: a */
    private final zzbjn f23116a;

    public zzbjr(zzbjn zzbjnVar) {
        this.f23116a = zzbjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Context) zzdto.m19874b(this.f23116a.m17791b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
