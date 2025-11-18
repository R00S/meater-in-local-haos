package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes2.dex */
final class RunnableC7657a6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzm f28547f;

    /* renamed from: g */
    private final /* synthetic */ zzn f28548g;

    /* renamed from: h */
    private final /* synthetic */ zzik f28549h;

    RunnableC7657a6(zzik zzikVar, zzm zzmVar, zzn zznVar) {
        this.f28549h = zzikVar;
        this.f28547f = zzmVar;
        this.f28548g = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzel zzelVar = this.f28549h.f29339d;
            if (zzelVar == null) {
                this.f28549h.mo22836h().m23137H().m23147a("Failed to get app instance id");
                return;
            }
            String strMo23082P4 = zzelVar.mo23082P4(this.f28547f);
            if (strMo23082P4 != null) {
                this.f28549h.mo22794p().m23278O(strMo23082P4);
                this.f28549h.mo22840m().f28860m.m23160b(strMo23082P4);
            }
            this.f28549h.m23350d0();
            this.f28549h.mo22839l().m23533P(this.f28548g, strMo23082P4);
        } catch (RemoteException e2) {
            this.f28549h.mo22836h().m23137H().m23148b("Failed to get app instance id", e2);
        } finally {
            this.f28549h.mo22839l().m23533P(this.f28548g, null);
        }
    }
}
