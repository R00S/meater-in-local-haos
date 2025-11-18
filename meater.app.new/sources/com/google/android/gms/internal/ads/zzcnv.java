package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnv implements zzdti<zzcnl> {

    /* renamed from: a */
    private final zzdtu<Context> f24787a;

    /* renamed from: b */
    private final zzdtu<zzbai> f24788b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24789c;

    /* renamed from: d */
    private final zzdtu<Executor> f24790d;

    /* renamed from: e */
    private final zzdtu<zzcdf> f24791e;

    /* renamed from: f */
    private final zzdtu<zzcdn> f24792f;

    public zzcnv(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4, zzdtu<zzcdf> zzdtuVar5, zzdtu<zzcdn> zzdtuVar6) {
        this.f24787a = zzdtuVar;
        this.f24788b = zzdtuVar2;
        this.f24789c = zzdtuVar3;
        this.f24790d = zzdtuVar4;
        this.f24791e = zzdtuVar5;
        this.f24792f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcnl(this.f24787a.get(), this.f24788b.get(), this.f24789c.get(), this.f24790d.get(), this.f24791e.get(), this.f24792f.get());
    }
}
