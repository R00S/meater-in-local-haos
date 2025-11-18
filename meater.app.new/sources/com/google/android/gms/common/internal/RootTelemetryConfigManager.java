package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: a */
    private static RootTelemetryConfigManager f17785a;

    /* renamed from: b */
    private static final RootTelemetryConfiguration f17786b = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: c */
    private RootTelemetryConfiguration f17787c;

    private RootTelemetryConfigManager() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static synchronized RootTelemetryConfigManager m14384a() {
        if (f17785a == null) {
            f17785a = new RootTelemetryConfigManager();
        }
        return f17785a;
    }

    @VisibleForTesting
    /* renamed from: b */
    public final synchronized void m14385b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f17787c = f17786b;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f17787c;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.m14388e0() < rootTelemetryConfiguration.m14388e0()) {
            this.f17787c = rootTelemetryConfiguration;
        }
    }
}
