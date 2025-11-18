package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbrb implements zzdti<Context> {

    /* renamed from: a */
    private final zzbqy f23520a;

    /* renamed from: b */
    private final zzdtu<Context> f23521b;

    private zzbrb(zzbqy zzbqyVar, zzdtu<Context> zzdtuVar) {
        this.f23520a = zzbqyVar;
        this.f23521b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbrb m18292a(zzbqy zzbqyVar, zzdtu<Context> zzdtuVar) {
        return new zzbrb(zzbqyVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Context) zzdto.m19874b(this.f23520a.m18281e(this.f23521b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
