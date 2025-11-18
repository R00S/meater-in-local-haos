package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes2.dex */
public final class zzceu implements zzdti<zzcez> {

    /* renamed from: a */
    private static final zzceu f24190a = new zzceu();

    /* renamed from: a */
    public static zzceu m18711a() {
        return f24190a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcez) zzdto.m19874b(new zzcez(zzwl.zza.zzb.REQUEST_WILL_MAKE_NETWORK_REQUEST, zzwl.zza.zzb.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, zzwl.zza.zzb.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}
