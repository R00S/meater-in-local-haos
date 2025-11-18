package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuo implements zzdti<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> {

    /* renamed from: a */
    private final zzbtv f23589a;

    private zzbuo(zzbtv zzbtvVar) {
        this.f23589a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuo m18379a(zzbtv zzbtvVar) {
        return new zzbuo(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
