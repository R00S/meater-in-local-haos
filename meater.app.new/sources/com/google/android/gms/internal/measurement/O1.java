package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class O1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Activity f33826F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1.b f33827G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O1(C2497i1.b bVar, Activity activity) {
        super(C2497i1.this);
        this.f33826F = activity;
        this.f33827G = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(C2497i1.this.f34162i)).onActivityDestroyedByScionActivityInfo(C2481g1.f0(this.f33826F), this.f34164C);
    }
}
