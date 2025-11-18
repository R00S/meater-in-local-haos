package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyn implements zzdti<zzcyk> {

    /* renamed from: a */
    private final zzdtu<Context> f25341a;

    /* renamed from: b */
    private final zzdtu<zzbai> f25342b;

    /* renamed from: c */
    private final zzdtu<zzawm> f25343c;

    public zzcyn(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzawm> zzdtuVar3) {
        this.f25341a = zzdtuVar;
        this.f25342b = zzdtuVar2;
        this.f25343c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcyk(this.f25341a.get(), this.f25342b.get(), this.f25343c.get());
    }
}
