package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class H4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f34867B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34868C;

    H4(C2837s4 c2837s4, C2782k4 c2782k4) {
        this.f34867B = c2782k4;
        this.f34868C = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h = this.f34868C.f35632d;
        if (interfaceC4906h == null) {
            this.f34868C.k().H().a("Failed to send current screen to service");
            return;
        }
        try {
            C2782k4 c2782k4 = this.f34867B;
            if (c2782k4 == null) {
                interfaceC4906h.g0(0L, null, null, this.f34868C.a().getPackageName());
            } else {
                interfaceC4906h.g0(c2782k4.f35429c, c2782k4.f35427a, c2782k4.f35428b, this.f34868C.a().getPackageName());
            }
            this.f34868C.r0();
        } catch (RemoteException e10) {
            this.f34868C.k().H().b("Failed to send current screen to the service", e10);
        }
    }
}
