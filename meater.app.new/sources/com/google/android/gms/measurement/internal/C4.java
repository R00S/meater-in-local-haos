package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class C4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34778B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34779C;

    C4(C2837s4 c2837s4, E5 e52) {
        this.f34778B = e52;
        this.f34779C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4906h interfaceC4906h = this.f34779C.f35632d;
        if (interfaceC4906h == null) {
            this.f34779C.k().H().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C3445p.k(this.f34778B);
            interfaceC4906h.G(this.f34778B);
            this.f34779C.r().L();
            this.f34779C.a0(interfaceC4906h, null, this.f34778B);
            this.f34779C.r0();
        } catch (RemoteException e10) {
            this.f34779C.k().H().b("Failed to send app launch to the service", e10);
        }
    }
}
