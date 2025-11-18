package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbnx implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzbnk f23332a;

    /* renamed from: b */
    private final zzdtu<Context> f23333b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23334c;

    public zzbnx(zzbnk zzbnkVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.f23332a = zzbnkVar;
        this.f23333b = zzdtuVar;
        this.f23334c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.m19874b(new zzavf(this.f23333b.get(), this.f23334c.get().f25295f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
