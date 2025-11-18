package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes2.dex */
final class C7539l extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Bundle f27816j;

    /* renamed from: k */
    private final /* synthetic */ zzk f27817k;

    /* renamed from: l */
    private final /* synthetic */ zzx f27818l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7539l(zzx zzxVar, Bundle bundle, zzk zzkVar) {
        super(zzxVar);
        this.f27818l = zzxVar;
        this.f27816j = bundle;
        this.f27817k = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27818l.f28411p.performAction(this.f27816j, this.f27817k, this.f28412f);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27817k.mo22444J(null);
    }
}
