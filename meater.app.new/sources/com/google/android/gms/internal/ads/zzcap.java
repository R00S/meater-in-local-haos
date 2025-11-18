package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcap implements zzdti<zzcan> {

    /* renamed from: a */
    private final zzdtu<zzayu> f23969a;

    /* renamed from: b */
    private final zzdtu<Clock> f23970b;

    /* renamed from: c */
    private final zzdtu<Executor> f23971c;

    public zzcap(zzdtu<zzayu> zzdtuVar, zzdtu<Clock> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        this.f23969a = zzdtuVar;
        this.f23970b = zzdtuVar2;
        this.f23971c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcan(this.f23969a.get(), this.f23970b.get(), this.f23971c.get());
    }
}
