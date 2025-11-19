package com.google.android.gms.measurement.internal;

import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2879y4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f35726B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f35727C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ P5 f35728D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35729E;

    RunnableC2879y4(C2837s4 c2837s4, E5 e52, boolean z10, P5 p52) {
        this.f35726B = e52;
        this.f35727C = z10;
        this.f35728D = p52;
        this.f35729E = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4906h interfaceC4906h = this.f35729E.f35632d;
        if (interfaceC4906h == null) {
            this.f35729E.k().H().a("Discarding data. Failed to set user property");
            return;
        }
        C3445p.k(this.f35726B);
        this.f35729E.a0(interfaceC4906h, this.f35727C ? null : this.f35728D, this.f35726B);
        this.f35729E.r0();
    }
}
