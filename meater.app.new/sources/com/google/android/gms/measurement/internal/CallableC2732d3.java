package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2732d3 implements Callable<List<C2749g>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35320a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35321b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f35322c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S2 f35323d;

    CallableC2732d3(S2 s22, String str, String str2, String str3) {
        this.f35320a = str;
        this.f35321b = str2;
        this.f35322c = str3;
        this.f35323d = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2749g> call() {
        this.f35323d.f35164B.N0();
        return this.f35323d.f35164B.x0().V(this.f35320a, this.f35321b, this.f35322c);
    }
}
