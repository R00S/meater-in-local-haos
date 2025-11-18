package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblt implements zzbls {

    /* renamed from: a */
    private zzaxb f23201a;

    public zzblt(zzaxb zzaxbVar) {
        this.f23201a = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    /* renamed from: a */
    public final void mo17873a(Map<String, String> map) {
        this.f23201a.mo17104r(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
