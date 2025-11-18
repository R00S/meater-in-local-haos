package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes2.dex */
final class RunnableC7711g6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28651f;

    /* renamed from: g */
    private final /* synthetic */ boolean f28652g;

    /* renamed from: h */
    private final /* synthetic */ zzan f28653h;

    /* renamed from: i */
    private final /* synthetic */ zzm f28654i;

    /* renamed from: j */
    private final /* synthetic */ String f28655j;

    /* renamed from: k */
    private final /* synthetic */ zzik f28656k;

    RunnableC7711g6(zzik zzikVar, boolean z, boolean z2, zzan zzanVar, zzm zzmVar, String str) {
        this.f28656k = zzikVar;
        this.f28651f = z;
        this.f28652g = z2;
        this.f28653h = zzanVar;
        this.f28654i = zzmVar;
        this.f28655j = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f28656k.f29339d;
        if (zzelVar == null) {
            this.f28656k.mo22836h().m23137H().m23147a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f28651f) {
            this.f28656k.m23363M(zzelVar, this.f28652g ? null : this.f28653h, this.f28654i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f28655j)) {
                    zzelVar.mo23086Z5(this.f28653h, this.f28654i);
                } else {
                    zzelVar.mo23091j6(this.f28653h, this.f28655j, this.f28656k.mo22836h().m23146Q());
                }
            } catch (RemoteException e2) {
                this.f28656k.mo22836h().m23137H().m23148b("Failed to send event to the service", e2);
            }
        }
        this.f28656k.m23350d0();
    }
}
