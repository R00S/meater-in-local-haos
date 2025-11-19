package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class L3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35030B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35031C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ Object f35032D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ long f35033E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35034F;

    L3(C2843t3 c2843t3, String str, String str2, Object obj, long j10) {
        this.f35030B = str;
        this.f35031C = str2;
        this.f35032D = obj;
        this.f35033E = j10;
        this.f35034F = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35034F.o0(this.f35030B, this.f35031C, this.f35032D, this.f35033E);
    }
}
