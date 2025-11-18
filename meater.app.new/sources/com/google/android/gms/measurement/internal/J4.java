package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class J4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34904B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34905C;

    J4(C2837s4 c2837s4, E5 e52) {
        this.f34904B = e52;
        this.f34905C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f34905C.f35632d;
        if (interfaceC4906h == null) {
            this.f34905C.k().H().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C3445p.k(this.f34904B);
            interfaceC4906h.F0(this.f34904B);
            this.f34905C.r0();
        } catch (RemoteException e10) {
            this.f34905C.k().H().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
