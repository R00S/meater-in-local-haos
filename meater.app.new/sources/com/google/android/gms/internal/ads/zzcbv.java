package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbv implements zzdti<zzcbi> {

    /* renamed from: a */
    private final zzdtu<Context> f24016a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f24017b;

    /* renamed from: c */
    private final zzdtu<Executor> f24018c;

    /* renamed from: d */
    private final zzdtu<zzcdn> f24019d;

    public zzcbv(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcdn> zzdtuVar4) {
        this.f24016a = zzdtuVar;
        this.f24017b = zzdtuVar2;
        this.f24018c = zzdtuVar3;
        this.f24019d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbi(this.f24016a.get(), this.f24017b.get(), this.f24018c.get(), this.f24019d.get());
    }
}
