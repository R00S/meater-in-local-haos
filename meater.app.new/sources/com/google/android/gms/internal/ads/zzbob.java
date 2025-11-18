package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbob implements zzdti<zzcva<zzcrd>> {

    /* renamed from: a */
    private final zzdtu<zzcre> f23341a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f23342b;

    public zzbob(zzdtu<zzcre> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2) {
        this.f23341a = zzdtuVar;
        this.f23342b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcva) zzdto.m19874b(new zzctz(this.f23341a.get(), 0L, this.f23342b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
