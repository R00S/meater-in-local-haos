package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35213B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f35214C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2707a f35215D;

    Y(C2707a c2707a, String str, long j10) {
        this.f35213B = str;
        this.f35214C = j10;
        this.f35215D = c2707a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2707a.A(this.f35215D, this.f35213B, this.f35214C);
    }
}
