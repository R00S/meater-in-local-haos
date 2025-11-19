package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2781k3 implements Callable<List<C2797m5>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E5 f35424a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f35425b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S2 f35426c;

    CallableC2781k3(S2 s22, E5 e52, Bundle bundle) {
        this.f35424a = e52;
        this.f35425b = bundle;
        this.f35426c = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2797m5> call() {
        this.f35426c.f35164B.N0();
        return this.f35426c.f35164B.s(this.f35424a, this.f35425b);
    }
}
