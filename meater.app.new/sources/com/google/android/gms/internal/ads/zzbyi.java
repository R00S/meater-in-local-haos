package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzbyi implements zzdti<zzbva> {

    /* renamed from: a */
    private final zzdtu<Context> f23767a;

    /* renamed from: b */
    private final zzdtu<zzcxm> f23768b;

    public zzbyi(zzdtu<Context> zzdtuVar, zzdtu<zzcxm> zzdtuVar2) {
        this.f23767a = zzdtuVar;
        this.f23768b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbva) zzdto.m19874b(new zzbva(this.f23767a.get(), new HashSet(), this.f23768b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
