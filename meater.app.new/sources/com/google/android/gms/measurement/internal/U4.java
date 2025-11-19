package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class U4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ ComponentName f35186B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S4 f35187C;

    U4(S4 s42, ComponentName componentName) {
        this.f35186B = componentName;
        this.f35187C = s42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2837s4.N(this.f35187C.f35171D, this.f35186B);
    }
}
