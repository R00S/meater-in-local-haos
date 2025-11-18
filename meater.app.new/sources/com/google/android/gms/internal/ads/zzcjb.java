package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcjb implements zzdti<zzcja> {

    /* renamed from: a */
    private final zzdtu<Context> f24382a;

    private zzcjb(zzdtu<Context> zzdtuVar) {
        this.f24382a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcjb m18814a(zzdtu<Context> zzdtuVar) {
        return new zzcjb(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcja(this.f24382a.get());
    }
}
