package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes2.dex */
final class RunnableC7684d6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzm f28606f;

    /* renamed from: g */
    private final /* synthetic */ zzik f28607g;

    RunnableC7684d6(zzik zzikVar, zzm zzmVar) {
        this.f28607g = zzikVar;
        this.f28606f = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f28607g.f29339d;
        if (zzelVar == null) {
            this.f28607g.mo22836h().m23137H().m23147a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzelVar.mo23085U3(this.f28606f);
            this.f28607g.m23350d0();
        } catch (RemoteException e2) {
            this.f28607g.mo22836h().m23137H().m23148b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
