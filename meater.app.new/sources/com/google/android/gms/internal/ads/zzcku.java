package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcku implements zzdti<zzckr> {

    /* renamed from: a */
    private final zzdtu<Context> f24451a;

    /* renamed from: b */
    private final zzdtu<Executor> f24452b;

    /* renamed from: c */
    private final zzdtu<zzbws> f24453c;

    /* renamed from: d */
    private final zzdtu<zzcxk> f24454d;

    public zzcku(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzbws> zzdtuVar3, zzdtu<zzcxk> zzdtuVar4) {
        this.f24451a = zzdtuVar;
        this.f24452b = zzdtuVar2;
        this.f24453c = zzdtuVar3;
        this.f24454d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckr(this.f24451a.get(), this.f24452b.get(), this.f24453c.get(), this.f24454d.get());
    }
}
