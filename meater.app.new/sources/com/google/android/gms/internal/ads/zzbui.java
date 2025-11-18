package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbui implements zzdti<Set<zzbuz<AdMetadataListener>>> {

    /* renamed from: a */
    private final zzbtv f23582a;

    private zzbui(zzbtv zzbtvVar) {
        this.f23582a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbui m18373a(zzbtv zzbtvVar) {
        return new zzbui(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23582a.m18338f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
