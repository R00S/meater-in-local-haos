package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class F1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f33718F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33719G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(C2497i1 c2497i1, boolean z10) {
        super(c2497i1);
        this.f33718F = z10;
        this.f33719G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33719G.f34162i)).setDataCollectionEnabled(this.f33718F);
    }
}
