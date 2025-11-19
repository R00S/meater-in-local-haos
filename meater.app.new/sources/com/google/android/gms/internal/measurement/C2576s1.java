package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2576s1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f34304F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34305G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2576s1(C2497i1 c2497i1, String str) {
        super(c2497i1);
        this.f34304F = str;
        this.f34305G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34305G.f34162i)).beginAdUnitExposure(this.f34304F, this.f34164C);
    }
}
