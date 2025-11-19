package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class B4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34756B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34757C;

    B4(C2837s4 c2837s4, E5 e52) {
        this.f34756B = e52;
        this.f34757C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f34757C.f35632d;
        if (interfaceC4906h == null) {
            this.f34757C.k().H().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C3445p.k(this.f34756B);
            interfaceC4906h.I(this.f34756B);
        } catch (RemoteException e10) {
            this.f34757C.k().H().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f34757C.r0();
    }
}
