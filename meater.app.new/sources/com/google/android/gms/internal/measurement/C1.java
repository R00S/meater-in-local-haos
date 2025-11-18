package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* loaded from: classes2.dex */
final class C1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f33679F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f33680G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ boolean f33681H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ Q0 f33682I;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f33683J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1(C2497i1 c2497i1, String str, String str2, boolean z10, Q0 q02) {
        super(c2497i1);
        this.f33679F = str;
        this.f33680G = str2;
        this.f33681H = z10;
        this.f33682I = q02;
        this.f33683J = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f33683J.f34162i)).getUserProperties(this.f33679F, this.f33680G, this.f33681H, this.f33682I);
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    protected final void b() {
        this.f33682I.h(null);
    }
}
