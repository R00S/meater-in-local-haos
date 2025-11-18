package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes2.dex */
final class RunnableC7880z5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzm f29055f;

    /* renamed from: g */
    private final /* synthetic */ boolean f29056g;

    /* renamed from: h */
    private final /* synthetic */ zzik f29057h;

    RunnableC7880z5(zzik zzikVar, zzm zzmVar, boolean z) {
        this.f29057h = zzikVar;
        this.f29055f = zzmVar;
        this.f29056g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f29057h.f29339d;
        if (zzelVar == null) {
            this.f29057h.mo22836h().m23137H().m23147a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzelVar.mo23094s6(this.f29055f);
            if (this.f29056g) {
                this.f29057h.mo22798t().m23107K();
            }
            this.f29057h.m23363M(zzelVar, null, this.f29055f);
            this.f29057h.m23350d0();
        } catch (RemoteException e2) {
            this.f29057h.mo22836h().m23137H().m23148b("Failed to send app launch to the service", e2);
        }
    }
}
