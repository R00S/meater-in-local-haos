package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbjq implements zzdti<Context> {

    /* renamed from: a */
    private final zzbjn f23115a;

    public zzbjq(zzbjn zzbjnVar) {
        this.f23115a = zzbjnVar;
    }

    /* renamed from: a */
    public static Context m17799a(zzbjn zzbjnVar) {
        return (Context) zzdto.m19874b(zzbjnVar.m17790a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17799a(this.f23115a);
    }
}
