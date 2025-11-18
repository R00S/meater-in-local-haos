package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes2.dex */
public final class zzcyf implements zzdti<Clock> {

    /* renamed from: a */
    private final zzcye f25324a;

    public zzcyf(zzcye zzcyeVar) {
        this.f25324a = zzcyeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Clock) zzdto.m19874b(DefaultClock.m14620c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
