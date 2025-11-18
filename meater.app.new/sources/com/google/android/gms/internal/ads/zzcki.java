package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcki implements zzdti<zzckb> {

    /* renamed from: a */
    private final zzdtu<zzboc> f24430a;

    /* renamed from: b */
    private final zzdtu<Context> f24431b;

    /* renamed from: c */
    private final zzdtu<Executor> f24432c;

    /* renamed from: d */
    private final zzdtu<zzcdn> f24433d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f24434e;

    /* renamed from: f */
    private final zzdtu<zzbam<zzcxm, zzayb>> f24435f;

    public zzcki(zzdtu<zzboc> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcdn> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5, zzdtu<zzbam<zzcxm, zzayb>> zzdtuVar6) {
        this.f24430a = zzdtuVar;
        this.f24431b = zzdtuVar2;
        this.f24432c = zzdtuVar3;
        this.f24433d = zzdtuVar4;
        this.f24434e = zzdtuVar5;
        this.f24435f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckb(this.f24430a.get(), this.f24431b.get(), this.f24432c.get(), this.f24433d.get(), this.f24434e.get(), this.f24435f.get());
    }
}
