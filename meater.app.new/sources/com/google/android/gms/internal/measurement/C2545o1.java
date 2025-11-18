package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2545o1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f34223F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f34224G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ Q0 f34225H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34226I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2545o1(C2497i1 c2497i1, String str, String str2, Q0 q02) {
        super(c2497i1);
        this.f34223F = str;
        this.f34224G = str2;
        this.f34225H = q02;
        this.f34226I = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34226I.f34162i)).getConditionalUserProperties(this.f34223F, this.f34224G, this.f34225H);
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    protected final void b() {
        this.f34225H.h(null);
    }
}
