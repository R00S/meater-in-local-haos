package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes2.dex */
final class RunnableC7872y5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzm f29010f;

    /* renamed from: g */
    private final /* synthetic */ zzik f29011g;

    RunnableC7872y5(zzik zzikVar, zzm zzmVar) {
        this.f29011g = zzikVar;
        this.f29010f = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f29011g.f29339d;
        if (zzelVar == null) {
            this.f29011g.mo22836h().m23137H().m23147a("Failed to reset data on the service; null service");
            return;
        }
        try {
            zzelVar.mo23092r2(this.f29010f);
        } catch (RemoteException e2) {
            this.f29011g.mo22836h().m23137H().m23148b("Failed to reset data on the service", e2);
        }
        this.f29011g.m23350d0();
    }
}
