package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2553p1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Boolean f34259F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34260G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2553p1(C2497i1 c2497i1, Boolean bool) {
        super(c2497i1);
        this.f34259F = bool;
        this.f34260G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        if (this.f34259F != null) {
            ((P0) C3445p.k(this.f34260G.f34162i)).setMeasurementEnabled(this.f34259F.booleanValue(), this.f34163B);
        } else {
            ((P0) C3445p.k(this.f34260G.f34162i)).clearMeasurementEnabled(this.f34163B);
        }
    }
}
