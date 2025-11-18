package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class D4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f34792B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f34793C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34794D;

    D4(C2837s4 c2837s4, E5 e52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f34792B = e52;
        this.f34793C = u02;
        this.f34794D = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.f34794D.h().N().x()) {
                this.f34794D.k().N().a("Analytics storage consent denied; will not get app instance id");
                this.f34794D.s().Y0(null);
                this.f34794D.h().f35603i.b(null);
                return;
            }
            InterfaceC4906h interfaceC4906h = this.f34794D.f35632d;
            if (interfaceC4906h == null) {
                this.f34794D.k().H().a("Failed to get app instance id");
                return;
            }
            C3445p.k(this.f34792B);
            String strJ0 = interfaceC4906h.j0(this.f34792B);
            if (strJ0 != null) {
                this.f34794D.s().Y0(strJ0);
                this.f34794D.h().f35603i.b(strJ0);
            }
            this.f34794D.r0();
            this.f34794D.j().T(this.f34793C, strJ0);
        } catch (RemoteException e10) {
            this.f34794D.k().H().b("Failed to get app instance id", e10);
        } finally {
            this.f34794D.j().T(this.f34793C, null);
        }
    }
}
