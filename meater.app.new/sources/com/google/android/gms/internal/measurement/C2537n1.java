package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2537n1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Bundle f34218F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34219G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2537n1(C2497i1 c2497i1, Bundle bundle) {
        super(c2497i1);
        this.f34218F = bundle;
        this.f34219G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34219G.f34162i)).setConditionalUserProperty(this.f34218F, this.f34163B);
    }
}
