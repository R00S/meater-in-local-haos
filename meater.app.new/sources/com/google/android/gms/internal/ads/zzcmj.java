package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcmj implements zzdti<zzcmg> {

    /* renamed from: a */
    private final zzdtu<Context> f24704a;

    /* renamed from: b */
    private final zzdtu<zzbxo> f24705b;

    public zzcmj(zzdtu<Context> zzdtuVar, zzdtu<zzbxo> zzdtuVar2) {
        this.f24704a = zzdtuVar;
        this.f24705b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcmg(this.f24704a.get(), this.f24705b.get());
    }
}
