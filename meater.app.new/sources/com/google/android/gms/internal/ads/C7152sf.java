package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sf */
/* loaded from: classes2.dex */
final class C7152sf implements zzaho<Object> {

    /* renamed from: a */
    private WeakReference<zzbxx> f20521a;

    private C7152sf(zzbxx zzbxxVar) {
        this.f20521a = new WeakReference<>(zzbxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        zzbxx zzbxxVar = this.f20521a.get();
        if (zzbxxVar == null) {
            return;
        }
        zzbxxVar.f23722g.m18301Y();
    }
}
