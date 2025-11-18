package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class K1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Activity f33799F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1.b f33800G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K1(C2497i1.b bVar, Activity activity) {
        super(C2497i1.this);
        this.f33799F = activity;
        this.f33800G = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(C2497i1.this.f34162i)).onActivityPausedByScionActivityInfo(C2481g1.f0(this.f33799F), this.f34164C);
    }
}
