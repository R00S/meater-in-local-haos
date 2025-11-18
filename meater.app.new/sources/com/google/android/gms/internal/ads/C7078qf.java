package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qf */
/* loaded from: classes2.dex */
final class C7078qf implements zzaho<Object> {

    /* renamed from: a */
    private WeakReference<zzbxx> f20390a;

    private C7078qf(zzbxx zzbxxVar) {
        this.f20390a = new WeakReference<>(zzbxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        zzbxx zzbxxVar = this.f20390a.get();
        if (zzbxxVar != null && "_ac".equals(map.get("eventName"))) {
            zzbxxVar.f23723h.onAdClicked();
        }
    }
}
