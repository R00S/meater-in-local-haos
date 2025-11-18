package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2529m1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f34203F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f34204G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ Bundle f34205H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34206I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2529m1(C2497i1 c2497i1, String str, String str2, Bundle bundle) {
        super(c2497i1);
        this.f34203F = str;
        this.f34204G = str2;
        this.f34205H = bundle;
        this.f34206I = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    final void a() {
        ((P0) C3445p.k(this.f34206I.f34162i)).clearConditionalUserProperty(this.f34203F, this.f34204G, this.f34205H);
    }
}
