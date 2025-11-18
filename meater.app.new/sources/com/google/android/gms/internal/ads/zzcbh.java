package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbh implements zzdti<zzcbd> {

    /* renamed from: a */
    private final zzdtu<Executor> f24004a;

    /* renamed from: b */
    private final zzdtu<zzcau> f24005b;

    public zzcbh(zzdtu<Executor> zzdtuVar, zzdtu<zzcau> zzdtuVar2) {
        this.f24004a = zzdtuVar;
        this.f24005b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbd(this.f24004a.get(), this.f24005b.get());
    }
}
