package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes2.dex */
final class C7581s extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Bundle f27887j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27888k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7581s(zzx zzxVar, Bundle bundle) {
        super(zzxVar);
        this.f27888k = zzxVar;
        this.f27887j = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27888k.f28411p.setConditionalUserProperty(this.f27887j, this.f28412f);
    }
}
