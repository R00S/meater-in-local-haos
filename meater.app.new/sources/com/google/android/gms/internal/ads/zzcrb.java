package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcrb implements zzdti<zzcqz> {

    /* renamed from: a */
    private final zzdtu<Executor> f24953a;

    /* renamed from: b */
    private final zzdtu<zzchz> f24954b;

    public zzcrb(zzdtu<Executor> zzdtuVar, zzdtu<zzchz> zzdtuVar2) {
        this.f24953a = zzdtuVar;
        this.f24954b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcqz(this.f24953a.get(), this.f24954b.get());
    }
}
