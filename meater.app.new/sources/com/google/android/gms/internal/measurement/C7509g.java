package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes2.dex */
final class C7509g extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ zzk f27726j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27727k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7509g(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.f27727k = zzxVar;
        this.f27726j = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27727k.f28411p.getGmpAppId(this.f27726j);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27726j.mo22444J(null);
    }
}
