package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class E1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f33711F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ Q0 f33712G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33713H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E1(C2497i1 c2497i1, String str, Q0 q02) {
        super(c2497i1);
        this.f33711F = str;
        this.f33712G = q02;
        this.f33713H = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33713H.f34162i)).getMaxUserProperties(this.f33711F, this.f33712G);
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    protected final void b() {
        this.f33712G.h(null);
    }
}
