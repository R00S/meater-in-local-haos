package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes2.dex */
final class RunnableC7702f6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28634f;

    /* renamed from: g */
    private final /* synthetic */ boolean f28635g;

    /* renamed from: h */
    private final /* synthetic */ zzv f28636h;

    /* renamed from: i */
    private final /* synthetic */ zzm f28637i;

    /* renamed from: j */
    private final /* synthetic */ zzv f28638j;

    /* renamed from: k */
    private final /* synthetic */ zzik f28639k;

    RunnableC7702f6(zzik zzikVar, boolean z, boolean z2, zzv zzvVar, zzm zzmVar, zzv zzvVar2) {
        this.f28639k = zzikVar;
        this.f28634f = z;
        this.f28635g = z2;
        this.f28636h = zzvVar;
        this.f28637i = zzmVar;
        this.f28638j = zzvVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f28639k.f29339d;
        if (zzelVar == null) {
            this.f28639k.mo22836h().m23137H().m23147a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f28634f) {
            this.f28639k.m23363M(zzelVar, this.f28635g ? null : this.f28636h, this.f28637i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f28638j.f29422f)) {
                    zzelVar.mo23089h2(this.f28636h, this.f28637i);
                } else {
                    zzelVar.mo23083R6(this.f28636h);
                }
            } catch (RemoteException e2) {
                this.f28639k.mo22836h().m23137H().m23148b("Failed to send conditional user property to the service", e2);
            }
        }
        this.f28639k.m23350d0();
    }
}
