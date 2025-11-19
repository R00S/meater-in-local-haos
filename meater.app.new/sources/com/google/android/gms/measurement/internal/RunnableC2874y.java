package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2874y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35716B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f35717C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2707a f35718D;

    RunnableC2874y(C2707a c2707a, String str, long j10) {
        this.f35716B = str;
        this.f35717C = j10;
        this.f35718D = c2707a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2707a.E(this.f35718D, this.f35716B, this.f35717C);
    }
}
