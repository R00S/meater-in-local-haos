package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class P3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35116B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35117C = null;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35118D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ String f35119E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35120F;

    P3(C2843t3 c2843t3, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f35116B = atomicReference;
        this.f35118D = str2;
        this.f35119E = str3;
        this.f35120F = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35120F.f35457a.N().W(this.f35116B, null, this.f35118D, this.f35119E);
    }
}
