package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbny implements zzdti<zzbuz<zzue>> {

    /* renamed from: a */
    private final zzbnk f23335a;

    /* renamed from: b */
    private final zzdtu<zzboz> f23336b;

    /* renamed from: c */
    private final zzdtu<Executor> f23337c;

    public zzbny(zzbnk zzbnkVar, zzdtu<zzboz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23335a = zzbnkVar;
        this.f23336b = zzdtuVar;
        this.f23337c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23336b.get(), this.f23337c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
