package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcrv implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Executor f24992a;

    /* renamed from: b */
    private final zzawm f24993b;

    zzcrv(Executor executor, zzawm zzawmVar) {
        this.f24992a = executor;
        this.f24993b = zzawmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuz<Bundle>> mo14982b() {
        return ((Boolean) zzyt.m20848e().m16421c(zzacu.f21847p2)).booleanValue() ? zzbar.m17378o(null) : zzbar.m17367d(this.f24993b.m17062s(), C7234un.f20645a, this.f24992a);
    }
}
