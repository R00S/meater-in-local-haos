package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class T3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35174B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35175C = null;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35176D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ String f35177E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f35178F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35179G;

    T3(C2843t3 c2843t3, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f35174B = atomicReference;
        this.f35176D = str2;
        this.f35177E = str3;
        this.f35178F = z10;
        this.f35179G = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35179G.f35457a.N().X(this.f35174B, null, this.f35176D, this.f35177E, this.f35178F);
    }
}
