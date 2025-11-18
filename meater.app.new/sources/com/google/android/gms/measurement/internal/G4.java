package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class G4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34859B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Bundle f34860C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34861D;

    G4(C2837s4 c2837s4, E5 e52, Bundle bundle) {
        this.f34859B = e52;
        this.f34860C = bundle;
        this.f34861D = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f34861D.f35632d;
        if (interfaceC4906h == null) {
            this.f34861D.k().H().a("Failed to send default event parameters to service");
            return;
        }
        try {
            C3445p.k(this.f34859B);
            interfaceC4906h.n(this.f34860C, this.f34859B);
        } catch (RemoteException e10) {
            this.f34861D.k().H().b("Failed to send default event parameters to service", e10);
        }
    }
}
