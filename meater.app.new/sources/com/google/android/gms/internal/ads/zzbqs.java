package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqs implements zzdti<zzbqr> {

    /* renamed from: a */
    private final zzdtu<Context> f23500a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f23501b;

    /* renamed from: c */
    private final zzdtu<zzbai> f23502c;

    /* renamed from: d */
    private final zzdtu<zzaxb> f23503d;

    /* renamed from: e */
    private final zzdtu<zzcgb> f23504e;

    private zzbqs(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4, zzdtu<zzcgb> zzdtuVar5) {
        this.f23500a = zzdtuVar;
        this.f23501b = zzdtuVar2;
        this.f23502c = zzdtuVar3;
        this.f23503d = zzdtuVar4;
        this.f23504e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzbqs m18274a(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4, zzdtu<zzcgb> zzdtuVar5) {
        return new zzbqs(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbqr(this.f23500a.get(), this.f23501b.get(), this.f23502c.get(), this.f23503d.get(), this.f23504e.get());
    }
}
