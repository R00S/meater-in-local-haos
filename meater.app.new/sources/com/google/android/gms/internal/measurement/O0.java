package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class O0 implements J0 {
    O0() {
    }

    @Override // com.google.android.gms.internal.measurement.J0
    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    @Override // com.google.android.gms.internal.measurement.J0
    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}
