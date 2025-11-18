package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcfo implements zzdti<zzcfn> {

    /* renamed from: a */
    private final zzdtu<Clock> f24229a;

    public zzcfo(zzdtu<Clock> zzdtuVar) {
        this.f24229a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfn(this.f24229a.get());
    }
}
