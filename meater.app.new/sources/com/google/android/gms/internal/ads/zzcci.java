package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcci implements zzaho<Object> {

    /* renamed from: a */
    private final zzafo f24060a;

    /* renamed from: b */
    private final zzccj f24061b;

    /* renamed from: c */
    private final zzdte<zzccd> f24062c;

    public zzcci(zzbzc zzbzcVar, zzbyt zzbytVar, zzccj zzccjVar, zzdte<zzccd> zzdteVar) {
        this.f24060a = zzbzcVar.m18570i(zzbytVar.m18537e());
        this.f24061b = zzccjVar;
        this.f24062c = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f24060a.mo16518F0(this.f24062c.get(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzbad.m17348d(sb.toString(), e2);
        }
    }

    /* renamed from: b */
    public final void m18661b() {
        if (this.f24060a == null) {
            return;
        }
        this.f24061b.m18665d("/nativeAdCustomClick", this);
    }
}
