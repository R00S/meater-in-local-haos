package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbta implements zzdti<zzbsv> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>>> f23541a;

    private zzbta(zzdtu<Set<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>>> zzdtuVar) {
        this.f23541a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbta m18319a(zzdtu<Set<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>>> zzdtuVar) {
        return new zzbta(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbsv(this.f23541a.get());
    }
}
