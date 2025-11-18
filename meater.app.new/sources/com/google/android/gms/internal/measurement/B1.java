package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class B1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Q0 f33663F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33664G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(C2497i1 c2497i1, Q0 q02) {
        super(c2497i1);
        this.f33663F = q02;
        this.f33664G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33664G.f34162i)).getCurrentScreenName(this.f33663F);
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    protected final void b() {
        this.f33663F.h(null);
    }
}
