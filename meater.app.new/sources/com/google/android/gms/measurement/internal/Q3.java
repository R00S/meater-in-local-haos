package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Q3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Bundle f35137B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35138C;

    Q3(C2843t3 c2843t3, Bundle bundle) {
        this.f35137B = bundle;
        this.f35138C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2843t3.W0(this.f35138C, this.f35137B);
    }
}
