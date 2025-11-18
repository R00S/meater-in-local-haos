package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbsd implements zzdti<zzbry> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbrx>>> f23536a;

    private zzbsd(zzdtu<Set<zzbuz<zzbrx>>> zzdtuVar) {
        this.f23536a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbsd m18307a(zzdtu<Set<zzbuz<zzbrx>>> zzdtuVar) {
        return new zzbsd(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbry(this.f23536a.get());
    }
}
