package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.l0 */
/* loaded from: classes2.dex */
final class C6878l0 implements zzaho<zzbgz> {
    C6878l0() {
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        zzbgz zzbgzVar2 = zzbgzVar;
        if (map.keySet().contains("start")) {
            zzbgzVar2.mo14891S(true);
        }
        if (map.keySet().contains("stop")) {
            zzbgzVar2.mo14891S(false);
        }
    }
}
