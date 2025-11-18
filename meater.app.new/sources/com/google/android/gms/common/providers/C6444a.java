package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.providers.a */
/* loaded from: classes2.dex */
final class C6444a implements PooledExecutorsProvider.PooledExecutorFactory {
    C6444a() {
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    /* renamed from: a */
    public final ScheduledExecutorService mo14545a() {
        zzh.m20928a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
