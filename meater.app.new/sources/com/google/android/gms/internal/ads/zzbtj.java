package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtj implements zzdti<zzbtg> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbtk>>> f23548a;

    private zzbtj(zzdtu<Set<zzbuz<zzbtk>>> zzdtuVar) {
        this.f23548a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbtj m18326a(zzdtu<Set<zzbuz<zzbtk>>> zzdtuVar) {
        return new zzbtj(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbtg(this.f23548a.get());
    }
}
