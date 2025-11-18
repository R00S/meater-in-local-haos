package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class PooledExecutorsProvider {

    /* renamed from: a */
    private static PooledExecutorFactory f17895a;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface PooledExecutorFactory {
        @KeepForSdk
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo14545a();
    }

    private PooledExecutorsProvider() {
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static synchronized PooledExecutorFactory m14544a() {
        if (f17895a == null) {
            f17895a = new C6444a();
        }
        return f17895a;
    }
}
