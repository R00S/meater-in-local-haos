package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcit implements zzdti<zzcig> {

    /* renamed from: a */
    private final zzdtu<Context> f24361a;

    /* renamed from: b */
    private final zzdtu<Executor> f24362b;

    /* renamed from: c */
    private final zzdtu<zzasm> f24363c;

    /* renamed from: d */
    private final zzdtu<zzblp> f24364d;

    /* renamed from: e */
    private final zzdtu<zzasl> f24365e;

    private zzcit(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzasm> zzdtuVar3, zzdtu<zzblp> zzdtuVar4, zzdtu<zzasl> zzdtuVar5) {
        this.f24361a = zzdtuVar;
        this.f24362b = zzdtuVar2;
        this.f24363c = zzdtuVar3;
        this.f24364d = zzdtuVar4;
        this.f24365e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzcit m18807a(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzasm> zzdtuVar3, zzdtu<zzblp> zzdtuVar4, zzdtu<zzasl> zzdtuVar5) {
        return new zzcit(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcig(this.f24361a.get(), this.f24362b.get(), this.f24363c.get(), this.f24364d.get(), this.f24365e.get());
    }
}
