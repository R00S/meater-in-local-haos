package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes2.dex */
final class RunnableC7863x5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28997f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28998g;

    /* renamed from: h */
    private final /* synthetic */ zzik f28999h;

    RunnableC7863x5(zzik zzikVar, AtomicReference atomicReference, zzm zzmVar) {
        this.f28999h = zzikVar;
        this.f28997f = atomicReference;
        this.f28998g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar;
        synchronized (this.f28997f) {
            try {
                try {
                    zzelVar = this.f28999h.f29339d;
                } catch (RemoteException e2) {
                    this.f28999h.mo22836h().m23137H().m23148b("Failed to get app instance id", e2);
                }
                if (zzelVar == null) {
                    this.f28999h.mo22836h().m23137H().m23147a("Failed to get app instance id");
                    return;
                }
                this.f28997f.set(zzelVar.mo23082P4(this.f28998g));
                String str = (String) this.f28997f.get();
                if (str != null) {
                    this.f28999h.mo22794p().m23278O(str);
                    this.f28999h.mo22840m().f28860m.m23160b(str);
                }
                this.f28999h.m23350d0();
                this.f28997f.notify();
            } finally {
                this.f28997f.notify();
            }
        }
    }
}
