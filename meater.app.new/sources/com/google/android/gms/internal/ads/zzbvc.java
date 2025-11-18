package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvc implements zzdti<zzbva> {

    /* renamed from: a */
    private final zzdtu<Context> f23598a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzue>>> f23599b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f23600c;

    private zzbvc(zzdtu<Context> zzdtuVar, zzdtu<Set<zzbuz<zzue>>> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3) {
        this.f23598a = zzdtuVar;
        this.f23599b = zzdtuVar2;
        this.f23600c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbvc m18390a(zzdtu<Context> zzdtuVar, zzdtu<Set<zzbuz<zzue>>> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3) {
        return new zzbvc(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbva(this.f23598a.get(), this.f23599b.get(), this.f23600c.get());
    }
}
