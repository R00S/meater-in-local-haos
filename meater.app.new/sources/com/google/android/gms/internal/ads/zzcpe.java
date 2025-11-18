package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcpe implements zzdti<zzcpa> {

    /* renamed from: a */
    private final zzdtu<Context> f24846a;

    /* renamed from: b */
    private final zzdtu<zzbws> f24847b;

    public zzcpe(zzdtu<Context> zzdtuVar, zzdtu<zzbws> zzdtuVar2) {
        this.f24846a = zzdtuVar;
        this.f24847b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpa(this.f24846a.get(), this.f24847b.get());
    }
}
