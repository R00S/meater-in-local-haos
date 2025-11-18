package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbne implements zzdti<zzbtb> {

    /* renamed from: a */
    private final zzdtu<ScheduledExecutorService> f23292a;

    /* renamed from: b */
    private final zzdtu<Clock> f23293b;

    public zzbne(zzdtu<ScheduledExecutorService> zzdtuVar, zzdtu<Clock> zzdtuVar2) {
        this.f23292a = zzdtuVar;
        this.f23293b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbtb m17916a(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbtb) zzdto.m19874b(new zzbtb(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17916a(this.f23292a.get(), this.f23293b.get());
    }
}
