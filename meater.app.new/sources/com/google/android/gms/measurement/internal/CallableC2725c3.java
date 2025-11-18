package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2725c3 implements Callable<List<C2749g>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35306a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35307b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f35308c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S2 f35309d;

    CallableC2725c3(S2 s22, String str, String str2, String str3) {
        this.f35306a = str;
        this.f35307b = str2;
        this.f35308c = str3;
        this.f35309d = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2749g> call() {
        this.f35309d.f35164B.N0();
        return this.f35309d.f35164B.x0().V(this.f35306a, this.f35307b, this.f35308c);
    }
}
