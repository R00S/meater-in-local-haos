package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbrh implements zzdti<zzavb> {

    /* renamed from: a */
    private final zzbrg f23527a;

    /* renamed from: b */
    private final zzdtu<Context> f23528b;

    /* renamed from: c */
    private final zzdtu<zzbai> f23529c;

    /* renamed from: d */
    private final zzdtu<zzcxm> f23530d;

    /* renamed from: e */
    private final zzdtu<zzavd> f23531e;

    private zzbrh(zzbrg zzbrgVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzavd> zzdtuVar4) {
        this.f23527a = zzbrgVar;
        this.f23528b = zzdtuVar;
        this.f23529c = zzdtuVar2;
        this.f23530d = zzdtuVar3;
        this.f23531e = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzbrh m18298a(zzbrg zzbrgVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzavd> zzdtuVar4) {
        return new zzbrh(zzbrgVar, zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Context context = this.f23528b.get();
        zzbai zzbaiVar = this.f23529c.get();
        zzcxm zzcxmVar = this.f23530d.get();
        zzavd zzavdVar = this.f23531e.get();
        if (zzcxmVar.f25266x != null) {
            return new zzauq(context, zzbaiVar, zzcxmVar.f25266x, zzcxmVar.f25258p.f25279b, zzavdVar);
        }
        return null;
    }
}
