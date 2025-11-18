package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class H1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Long f33765F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f33766G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ String f33767H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ Bundle f33768I;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ boolean f33769J;

    /* renamed from: K, reason: collision with root package name */
    private final /* synthetic */ boolean f33770K;

    /* renamed from: L, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33771L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(C2497i1 c2497i1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c2497i1);
        this.f33765F = l10;
        this.f33766G = str;
        this.f33767H = str2;
        this.f33768I = bundle;
        this.f33769J = z10;
        this.f33770K = z11;
        this.f33771L = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        Long l10 = this.f33765F;
        ((P0) C3445p.k(this.f33771L.f34162i)).logEvent(this.f33766G, this.f33767H, this.f33768I, this.f33769J, this.f33770K, l10 == null ? this.f34163B : l10.longValue());
    }
}
