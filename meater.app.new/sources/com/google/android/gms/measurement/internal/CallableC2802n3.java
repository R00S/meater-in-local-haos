package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2802n3 implements Callable<List<C2797m5>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E5 f35472a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f35473b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S2 f35474c;

    CallableC2802n3(S2 s22, E5 e52, Bundle bundle) {
        this.f35472a = e52;
        this.f35473b = bundle;
        this.f35474c = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2797m5> call() {
        this.f35474c.f35164B.N0();
        return this.f35474c.f35164B.s(this.f35472a, this.f35473b);
    }
}
