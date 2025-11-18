package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* loaded from: classes2.dex */
final class C8105f implements AppMeasurement.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8103d f30667a;

    public C8105f(C8103d c8103d) {
        this.f30667a = c8103d;
    }

    @Override // com.google.android.gms.measurement.internal.zzha
    /* renamed from: a */
    public final void mo22696a(String str, String str2, Bundle bundle, long j2) {
        if (str == null || str.equals("crash") || !C8102c.m24963e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        this.f30667a.f30663a.mo24953a(3, bundle2);
    }
}
