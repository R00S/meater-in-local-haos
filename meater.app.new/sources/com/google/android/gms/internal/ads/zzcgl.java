package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcgl implements zzdti<zzcgb> {

    /* renamed from: a */
    private final zzdtu<Executor> f24272a;

    /* renamed from: b */
    private final zzdtu<Context> f24273b;

    /* renamed from: c */
    private final zzdtu<Executor> f24274c;

    /* renamed from: d */
    private final zzdtu<zzclc> f24275d;

    /* renamed from: e */
    private final zzdtu<ScheduledExecutorService> f24276e;

    public zzcgl(zzdtu<Executor> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzclc> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5) {
        this.f24272a = zzdtuVar;
        this.f24273b = zzdtuVar2;
        this.f24274c = zzdtuVar3;
        this.f24275d = zzdtuVar4;
        this.f24276e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcgb(this.f24272a.get(), this.f24273b.get(), this.f24274c.get(), this.f24275d.get(), this.f24276e.get());
    }
}
