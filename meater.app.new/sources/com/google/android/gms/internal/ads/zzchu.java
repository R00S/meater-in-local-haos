package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzchu implements zzdti<zzchq> {

    /* renamed from: a */
    private final zzdtu<Context> f24338a;

    /* renamed from: b */
    private final zzdtu<zzbai> f24339b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24340c;

    /* renamed from: d */
    private final zzdtu<Executor> f24341d;

    private zzchu(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        this.f24338a = zzdtuVar;
        this.f24339b = zzdtuVar2;
        this.f24340c = zzdtuVar3;
        this.f24341d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzchu m18799a(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        return new zzchu(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzchq(this.f24338a.get(), this.f24339b.get(), this.f24340c.get(), this.f24341d.get());
    }
}
