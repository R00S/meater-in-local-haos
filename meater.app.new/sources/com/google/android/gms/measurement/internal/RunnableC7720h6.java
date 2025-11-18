package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzn;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes2.dex */
final class RunnableC7720h6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28688f;

    /* renamed from: g */
    private final /* synthetic */ String f28689g;

    /* renamed from: h */
    private final /* synthetic */ zzm f28690h;

    /* renamed from: i */
    private final /* synthetic */ zzn f28691i;

    /* renamed from: j */
    private final /* synthetic */ zzik f28692j;

    RunnableC7720h6(zzik zzikVar, String str, String str2, zzm zzmVar, zzn zznVar) {
        this.f28692j = zzikVar;
        this.f28688f = str;
        this.f28689g = str2;
        this.f28690h = zzmVar;
        this.f28691i = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzel zzelVar = this.f28692j.f29339d;
            if (zzelVar == null) {
                this.f28692j.mo22836h().m23137H().m23149c("Failed to get conditional properties", this.f28688f, this.f28689g);
                return;
            }
            ArrayList<Bundle> arrayListM23511l0 = zzkk.m23511l0(zzelVar.mo23079A2(this.f28688f, this.f28689g, this.f28690h));
            this.f28692j.m23350d0();
            this.f28692j.mo22839l().m23534Q(this.f28691i, arrayListM23511l0);
        } catch (RemoteException e2) {
            this.f28692j.mo22836h().m23137H().m23150d("Failed to get conditional properties", this.f28688f, this.f28689g, e2);
        } finally {
            this.f28692j.mo22839l().m23534Q(this.f28691i, arrayList);
        }
    }
}
