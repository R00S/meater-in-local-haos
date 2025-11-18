package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes2.dex */
final class C7563p extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ boolean f27867j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27868k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7563p(zzx zzxVar, boolean z) {
        super(zzxVar);
        this.f27868k = zzxVar;
        this.f27867j = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27868k.f28411p.setDataCollectionEnabled(this.f27867j);
    }
}
