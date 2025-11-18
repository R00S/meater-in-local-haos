package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes2.dex */
final class RunnableC7666b6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzan f28564f;

    /* renamed from: g */
    private final /* synthetic */ String f28565g;

    /* renamed from: h */
    private final /* synthetic */ zzn f28566h;

    /* renamed from: i */
    private final /* synthetic */ zzik f28567i;

    RunnableC7666b6(zzik zzikVar, zzan zzanVar, String str, zzn zznVar) {
        this.f28567i = zzikVar;
        this.f28564f = zzanVar;
        this.f28565g = str;
        this.f28566h = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzel zzelVar = this.f28567i.f29339d;
            if (zzelVar == null) {
                this.f28567i.mo22836h().m23137H().m23147a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrMo23084T1 = zzelVar.mo23084T1(this.f28564f, this.f28565g);
            this.f28567i.m23350d0();
            this.f28567i.mo22839l().m23536S(this.f28566h, bArrMo23084T1);
        } catch (RemoteException e2) {
            this.f28567i.mo22836h().m23137H().m23148b("Failed to send event to the service to bundle", e2);
        } finally {
            this.f28567i.mo22839l().m23536S(this.f28566h, null);
        }
    }
}
