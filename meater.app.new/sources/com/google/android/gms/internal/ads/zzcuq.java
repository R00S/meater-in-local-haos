package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcuq implements zzdti<zzcul> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25097a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f25098b;

    /* renamed from: c */
    private final zzdtu<String> f25099c;

    /* renamed from: d */
    private final zzdtu<zzcpf> f25100d;

    /* renamed from: e */
    private final zzdtu<Context> f25101e;

    /* renamed from: f */
    private final zzdtu<zzcxv> f25102f;

    private zzcuq(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzcpf> zzdtuVar4, zzdtu<Context> zzdtuVar5, zzdtu<zzcxv> zzdtuVar6) {
        this.f25097a = zzdtuVar;
        this.f25098b = zzdtuVar2;
        this.f25099c = zzdtuVar3;
        this.f25100d = zzdtuVar4;
        this.f25101e = zzdtuVar5;
        this.f25102f = zzdtuVar6;
    }

    /* renamed from: a */
    public static zzcuq m18992a(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzcpf> zzdtuVar4, zzdtu<Context> zzdtuVar5, zzdtu<zzcxv> zzdtuVar6) {
        return new zzcuq(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcul(this.f25097a.get(), this.f25098b.get(), this.f25099c.get(), this.f25100d.get(), this.f25101e.get(), this.f25102f.get());
    }
}
