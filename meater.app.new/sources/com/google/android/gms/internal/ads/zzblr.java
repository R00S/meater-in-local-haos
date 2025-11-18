package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblr implements zzdti<zzblq> {

    /* renamed from: a */
    private final zzdtu<Map<String, zzbls>> f23200a;

    private zzblr(zzdtu<Map<String, zzbls>> zzdtuVar) {
        this.f23200a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzblr m17872a(zzdtu<Map<String, zzbls>> zzdtuVar) {
        return new zzblr(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzblq(this.f23200a.get());
    }
}
