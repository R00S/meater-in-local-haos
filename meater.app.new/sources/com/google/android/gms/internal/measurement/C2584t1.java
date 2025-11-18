package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2584t1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Runnable f34318F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34319G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2584t1(C2497i1 c2497i1, Runnable runnable) {
        super(c2497i1);
        this.f34318F = runnable;
        this.f34319G = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34319G.f34162i)).retrieveAndUploadBatches(new BinderC2608w1(this, this.f34318F));
    }
}
