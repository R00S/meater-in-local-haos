package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzclm implements zzdti<zzcle> {

    /* renamed from: a */
    private final zzdtu<Context> f24674a;

    /* renamed from: b */
    private final zzdtu<zzbai> f24675b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24676c;

    /* renamed from: d */
    private final zzdtu<Executor> f24677d;

    /* renamed from: e */
    private final zzdtu<zzbws> f24678e;

    /* renamed from: f */
    private final zzdtu<zzcdn> f24679f;

    public zzclm(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4, zzdtu<zzbws> zzdtuVar5, zzdtu<zzcdn> zzdtuVar6) {
        this.f24674a = zzdtuVar;
        this.f24675b = zzdtuVar2;
        this.f24676c = zzdtuVar3;
        this.f24677d = zzdtuVar4;
        this.f24678e = zzdtuVar5;
        this.f24679f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcle(this.f24674a.get(), this.f24675b.get(), this.f24676c.get(), this.f24677d.get(), this.f24678e.get(), this.f24679f.get());
    }
}
