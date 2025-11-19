package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2632z1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Q0 f34459F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34460G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2632z1(C2497i1 c2497i1, Q0 q02) {
        super(c2497i1);
        this.f34459F = q02;
        this.f34460G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34460G.f34162i)).getCurrentScreenClass(this.f34459F);
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    protected final void b() {
        this.f34459F.h(null);
    }
}
