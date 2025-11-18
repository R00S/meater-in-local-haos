package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes2.dex */
public final class zzcet implements zzdti<zzcez> {

    /* renamed from: a */
    private static final zzcet f24189a = new zzcet();

    /* renamed from: a */
    public static zzcet m18710a() {
        return f24189a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcez) zzdto.m19874b(new zzcez(zzwl.zza.zzb.REQUEST_WILL_UPDATE_GMS_SIGNALS, zzwl.zza.zzb.REQUEST_DID_UPDATE_GMS_SIGNALS, zzwl.zza.zzb.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
