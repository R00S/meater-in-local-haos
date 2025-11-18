package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbu implements zzdti<zzcbp> {

    /* renamed from: a */
    private final zzdtu<Executor> f24013a;

    /* renamed from: b */
    private final zzdtu<zzbmy> f24014b;

    /* renamed from: c */
    private final zzdtu<zzbva> f24015c;

    public zzcbu(zzdtu<Executor> zzdtuVar, zzdtu<zzbmy> zzdtuVar2, zzdtu<zzbva> zzdtuVar3) {
        this.f24013a = zzdtuVar;
        this.f24014b = zzdtuVar2;
        this.f24015c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbp(this.f24013a.get(), this.f24014b.get(), this.f24015c.get());
    }
}
