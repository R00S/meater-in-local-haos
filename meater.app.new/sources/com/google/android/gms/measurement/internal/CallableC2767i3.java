package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC2767i3 implements Callable<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ J f35402a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35403b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S2 f35404c;

    CallableC2767i3(S2 s22, J j10, String str) {
        this.f35402a = j10;
        this.f35403b = str;
        this.f35404c = s22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f35404c.f35164B.N0();
        return this.f35404c.f35164B.H0().z(this.f35402a, this.f35403b);
    }
}
