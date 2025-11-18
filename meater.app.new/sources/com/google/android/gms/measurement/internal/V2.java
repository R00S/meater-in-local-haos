package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class V2 implements Callable<List<R5>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35189a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S2 f35190b;

    V2(S2 s22, String str) {
        this.f35189a = str;
        this.f35190b = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<R5> call() {
        this.f35190b.f35164B.N0();
        return this.f35190b.f35164B.x0().i1(this.f35189a);
    }
}
