package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2561q1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2481g1 f34267F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f34268G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ String f34269H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34270I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2561q1(C2497i1 c2497i1, C2481g1 c2481g1, String str, String str2) {
        super(c2497i1);
        this.f34267F = c2481g1;
        this.f34268G = str;
        this.f34269H = str2;
        this.f34270I = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34270I.f34162i)).setCurrentScreenByScionActivityInfo(this.f34267F, this.f34268G, this.f34269H, this.f34163B);
    }
}
