package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class N3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Bundle f35063B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35064C;

    N3(C2843t3 c2843t3, Bundle bundle) {
        this.f35063B = bundle;
        this.f35064C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2843t3.g1(this.f35064C, this.f35063B);
    }
}
