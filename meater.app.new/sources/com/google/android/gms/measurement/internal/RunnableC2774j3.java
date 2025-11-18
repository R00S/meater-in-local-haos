package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2774j3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ J f35413B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35414C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ S2 f35415D;

    RunnableC2774j3(S2 s22, J j10, String str) {
        this.f35413B = j10;
        this.f35414C = str;
        this.f35415D = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35415D.f35164B.N0();
        this.f35415D.f35164B.z(this.f35413B, this.f35414C);
    }
}
