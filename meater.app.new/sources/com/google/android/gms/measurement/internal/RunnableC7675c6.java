package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes2.dex */
final class RunnableC7675c6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzig f28589f;

    /* renamed from: g */
    private final /* synthetic */ zzik f28590g;

    RunnableC7675c6(zzik zzikVar, zzig zzigVar) {
        this.f28590g = zzikVar;
        this.f28589f = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f28590g.f29339d;
        if (zzelVar == null) {
            this.f28590g.mo22836h().m23137H().m23147a("Failed to send current screen to service");
            return;
        }
        try {
            zzig zzigVar = this.f28589f;
            if (zzigVar == null) {
                zzelVar.mo23090j3(0L, null, null, this.f28590g.mo22834f().getPackageName());
            } else {
                zzelVar.mo23090j3(zzigVar.f29336c, zzigVar.f29334a, zzigVar.f29335b, this.f28590g.mo22834f().getPackageName());
            }
            this.f28590g.m23350d0();
        } catch (RemoteException e2) {
            this.f28590g.mo22836h().m23137H().m23148b("Failed to send current screen to the service", e2);
        }
    }
}
