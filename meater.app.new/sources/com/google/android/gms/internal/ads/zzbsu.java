package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbsu implements zzdti<zzbss> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<AdMetadataListener>>> f23540a;

    private zzbsu(zzdtu<Set<zzbuz<AdMetadataListener>>> zzdtuVar) {
        this.f23540a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbsu m18318a(zzdtu<Set<zzbuz<AdMetadataListener>>> zzdtuVar) {
        return new zzbsu(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbss(this.f23540a.get());
    }
}
