package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcpj implements zzdti<zzcpf> {

    /* renamed from: a */
    private final zzdtu<zzclc> f24853a;

    /* renamed from: b */
    private final zzdtu<Executor> f24854b;

    /* renamed from: c */
    private final zzdtu<Context> f24855c;

    public zzcpj(zzdtu<zzclc> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.f24853a = zzdtuVar;
        this.f24854b = zzdtuVar2;
        this.f24855c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpf(this.f24853a.get(), this.f24854b.get(), this.f24855c.get());
    }
}
