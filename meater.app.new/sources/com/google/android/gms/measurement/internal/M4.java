package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class M4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f35051B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35052C;

    M4(C2837s4 c2837s4, E5 e52) {
        this.f35051B = e52;
        this.f35052C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f35052C.f35632d;
        if (interfaceC4906h == null) {
            this.f35052C.k().H().a("Failed to send consent settings to service");
            return;
        }
        try {
            C3445p.k(this.f35051B);
            interfaceC4906h.U0(this.f35051B);
            this.f35052C.r0();
        } catch (RemoteException e10) {
            this.f35052C.k().H().b("Failed to send consent settings to the service", e10);
        }
    }
}
