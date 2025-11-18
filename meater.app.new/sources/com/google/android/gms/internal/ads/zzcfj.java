package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcfj implements zzdti<zzcfi> {

    /* renamed from: a */
    private final zzdtu<Context> f24219a;

    /* renamed from: b */
    private final zzdtu<String> f24220b;

    private zzcfj(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.f24219a = zzdtuVar;
        this.f24220b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfj m18731a(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        return new zzcfj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfi(this.f24219a.get(), this.f24220b.get());
    }
}
