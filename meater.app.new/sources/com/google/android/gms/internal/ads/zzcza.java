package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class zzcza implements zzdti<ScheduledExecutorService> {

    /* renamed from: a */
    private final zzdtu<ThreadFactory> f25360a;

    public zzcza(zzdtu<ThreadFactory> zzdtuVar) {
        this.f25360a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (ScheduledExecutorService) zzdto.m19874b(new ScheduledThreadPoolExecutor(1, this.f25360a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
