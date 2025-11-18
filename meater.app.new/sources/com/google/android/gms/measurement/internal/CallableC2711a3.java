package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2711a3 implements Callable<List<R5>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35254a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35255b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f35256c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S2 f35257d;

    CallableC2711a3(S2 s22, String str, String str2, String str3) {
        this.f35254a = str;
        this.f35255b = str2;
        this.f35256c = str3;
        this.f35257d = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<R5> call() {
        this.f35257d.f35164B.N0();
        return this.f35257d.f35164B.x0().N0(this.f35254a, this.f35255b, this.f35256c);
    }
}
