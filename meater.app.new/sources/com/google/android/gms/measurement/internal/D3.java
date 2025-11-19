package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class D3 implements Executor {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34791B;

    D3(C2843t3 c2843t3) {
        this.f34791B = c2843t3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34791B.o().E(runnable);
    }
}
