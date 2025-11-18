package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes2.dex */
final class C7515h extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ zzk f27752j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27753k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7515h(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.f27753k = zzxVar;
        this.f27752j = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27753k.f28411p.getCurrentScreenName(this.f27752j);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27752j.mo22444J(null);
    }
}
