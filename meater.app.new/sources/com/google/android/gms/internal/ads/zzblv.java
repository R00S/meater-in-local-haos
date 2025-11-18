package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblv implements zzbls {

    /* renamed from: a */
    private zzaxb f23203a;

    public zzblv(zzaxb zzaxbVar) {
        this.f23203a = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    /* renamed from: a */
    public final void mo17873a(Map<String, String> map) {
        this.f23203a.mo17096j(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
