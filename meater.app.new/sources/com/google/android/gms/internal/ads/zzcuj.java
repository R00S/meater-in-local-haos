package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuj implements zzdti<zzcuh> {

    /* renamed from: a */
    private final zzdtu<Context> f25088a;

    /* renamed from: b */
    private final zzdtu<String> f25089b;

    private zzcuj(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.f25088a = zzdtuVar;
        this.f25089b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcuj m18987a(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        return new zzcuj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcuh(this.f25088a.get(), this.f25089b.get());
    }
}
