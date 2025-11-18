package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class E4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34804B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34805C;

    E4(C2837s4 c2837s4, E5 e52) {
        this.f34804B = e52;
        this.f34805C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f34805C.f35632d;
        if (interfaceC4906h == null) {
            this.f34805C.k().M().a("Failed to send app backgrounded");
            return;
        }
        try {
            C3445p.k(this.f34804B);
            interfaceC4906h.r(this.f34804B);
            this.f34805C.r0();
        } catch (RemoteException e10) {
            this.f34805C.k().H().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
