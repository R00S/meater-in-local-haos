package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import v7.C4901c;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2760h3 implements Callable<C4901c> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E5 f35383a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S2 f35384b;

    CallableC2760h3(S2 s22, E5 e52) {
        this.f35383a = e52;
        this.f35384b = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C4901c call() {
        this.f35384b.f35164B.N0();
        return new C4901c(this.f35384b.f35164B.e(this.f35383a.f34806B));
    }
}
