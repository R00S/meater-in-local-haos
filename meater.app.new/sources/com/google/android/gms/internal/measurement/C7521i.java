package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes2.dex */
final class C7521i extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ zzk f27763j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27764k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7521i(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.f27764k = zzxVar;
        this.f27763j = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27764k.f28411p.generateEventId(this.f27763j);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27763j.mo22444J(null);
    }
}
