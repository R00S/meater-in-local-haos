package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2513k1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f34175F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f34176G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ Object f34177H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ boolean f34178I;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34179J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2513k1(C2497i1 c2497i1, String str, String str2, Object obj, boolean z10) {
        super(c2497i1);
        this.f34175F = str;
        this.f34176G = str2;
        this.f34177H = obj;
        this.f34178I = z10;
        this.f34179J = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34179J.f34162i)).setUserProperty(this.f34175F, this.f34176G, m7.b.u1(this.f34177H), this.f34178I, this.f34163B);
    }
}
