package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.e0 */
/* loaded from: classes2.dex */
final class C6619e0 implements zzaho<zzbgz> {
    C6619e0() {
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        zzbgz zzbgzVar2 = zzbgzVar;
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = zzbgzVar2.mo14918k0();
        if (zzdVarMo14918k0 != null) {
            zzdVarMo14918k0.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14931s0 = zzbgzVar2.mo14931s0();
        if (zzdVarMo14931s0 != null) {
            zzdVarMo14931s0.close();
        } else {
            zzbad.m17353i("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
