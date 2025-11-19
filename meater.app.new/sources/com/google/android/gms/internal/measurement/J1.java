package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class J1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Bundle f33788F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ Activity f33789G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ C2497i1.b f33790H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(C2497i1.b bVar, Bundle bundle, Activity activity) {
        super(C2497i1.this);
        this.f33788F = bundle;
        this.f33789G = activity;
        this.f33790H = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        Bundle bundle;
        if (this.f33788F != null) {
            bundle = new Bundle();
            if (this.f33788F.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f33788F.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((P0) C3445p.k(C2497i1.this.f34162i)).onActivityCreatedByScionActivityInfo(C2481g1.f0(this.f33789G), bundle, this.f34164C);
    }
}
