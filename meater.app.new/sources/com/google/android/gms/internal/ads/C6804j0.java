package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.j0 */
/* loaded from: classes2.dex */
final class C6804j0 implements zzaho<zzbgz> {
    C6804j0() {
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        zzbgz zzbgzVar2 = zzbgzVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbgzVar2.zzlc();
        } else if ("resume".equals(str)) {
            zzbgzVar2.zzld();
        }
    }
}
