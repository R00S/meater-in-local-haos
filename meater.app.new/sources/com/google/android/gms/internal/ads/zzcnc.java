package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnc implements zzdti<zzcna> {

    /* renamed from: a */
    private final zzdtu<Context> f24761a;

    /* renamed from: b */
    private final zzdtu<Executor> f24762b;

    /* renamed from: c */
    private final zzdtu<zzcdf> f24763c;

    public zzcnc(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzcdf> zzdtuVar3) {
        this.f24761a = zzdtuVar;
        this.f24762b = zzdtuVar2;
        this.f24763c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcna(this.f24761a.get(), this.f24762b.get(), this.f24763c.get());
    }
}
