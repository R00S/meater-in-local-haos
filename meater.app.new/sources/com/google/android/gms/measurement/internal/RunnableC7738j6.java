package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* loaded from: classes2.dex */
final class RunnableC7738j6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28722f;

    /* renamed from: g */
    private final /* synthetic */ String f28723g;

    /* renamed from: h */
    private final /* synthetic */ boolean f28724h;

    /* renamed from: i */
    private final /* synthetic */ zzm f28725i;

    /* renamed from: j */
    private final /* synthetic */ zzn f28726j;

    /* renamed from: k */
    private final /* synthetic */ zzik f28727k;

    RunnableC7738j6(zzik zzikVar, String str, String str2, boolean z, zzm zzmVar, zzn zznVar) {
        this.f28727k = zzikVar;
        this.f28722f = str;
        this.f28723g = str2;
        this.f28724h = z;
        this.f28725i = zzmVar;
        this.f28726j = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            zzel zzelVar = this.f28727k.f29339d;
            if (zzelVar == null) {
                this.f28727k.mo22836h().m23137H().m23149c("Failed to get user properties", this.f28722f, this.f28723g);
                return;
            }
            Bundle bundleM23496B = zzkk.m23496B(zzelVar.mo23088f3(this.f28722f, this.f28723g, this.f28724h, this.f28725i));
            this.f28727k.m23350d0();
            this.f28727k.mo22839l().m23532O(this.f28726j, bundleM23496B);
        } catch (RemoteException e2) {
            this.f28727k.mo22836h().m23137H().m23149c("Failed to get user properties", this.f28722f, e2);
        } finally {
            this.f28727k.mo22839l().m23532O(this.f28726j, bundle);
        }
    }
}
