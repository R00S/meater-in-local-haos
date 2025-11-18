package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbye implements zzdti<JSONObject> {

    /* renamed from: a */
    private final zzbyc f23761a;

    public zzbye(zzbyc zzbycVar) {
        this.f23761a = zzbycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (JSONObject) zzdto.m19874b(this.f23761a.m18473a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
