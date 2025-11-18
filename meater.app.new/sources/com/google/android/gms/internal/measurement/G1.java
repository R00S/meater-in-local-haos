package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class G1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2497i1.c f33743F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33744G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(C2497i1 c2497i1, C2497i1.c cVar) {
        super(c2497i1);
        this.f33743F = cVar;
        this.f33744G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33744G.f34162i)).registerOnMeasurementEventListener(this.f33743F);
    }
}
