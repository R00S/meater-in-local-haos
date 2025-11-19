package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class D1 extends C2497i1.a {

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f33691G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ Object f33692H;

    /* renamed from: K, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33695K;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ int f33690F = 5;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ Object f33693I = null;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ Object f33694J = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(C2497i1 c2497i1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f33691G = str;
        this.f33692H = obj;
        this.f33695K = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33695K.f34162i)).logHealthData(this.f33690F, this.f33691G, m7.b.u1(this.f33692H), m7.b.u1(null), m7.b.u1(null));
    }
}
