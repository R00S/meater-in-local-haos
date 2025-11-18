package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* loaded from: classes2.dex */
final class RunnableC7664b4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzm f28557f;

    /* renamed from: g */
    private final /* synthetic */ zzgc f28558g;

    RunnableC7664b4(zzgc zzgcVar, zzm zzmVar) {
        this.f28558g = zzgcVar;
        this.f28557f = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28558g.f29304f.m23453e0();
        zzkc zzkcVar = this.f28558g.f29304f;
        zzm zzmVar = this.f28557f;
        zzkcVar.mo22835g().mo22792d();
        zzkcVar.m23451c0();
        Preconditions.m14368g(zzmVar.f29401f);
        zzkcVar.m23442T(zzmVar);
    }
}
