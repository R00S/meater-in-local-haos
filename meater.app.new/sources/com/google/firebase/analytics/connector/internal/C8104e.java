package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes2.dex */
final class C8104e implements AppMeasurement.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8101b f30666a;

    public C8104e(C8101b c8101b) {
        this.f30666a = c8101b;
    }

    @Override // com.google.android.gms.measurement.internal.zzha
    /* renamed from: a */
    public final void mo22696a(String str, String str2, Bundle bundle, long j2) {
        if (this.f30666a.f30653a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C8102c.m24964f(str2));
            this.f30666a.f30654b.mo24953a(2, bundle2);
        }
    }
}
