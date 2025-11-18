package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z4 */
/* loaded from: classes2.dex */
final class C7628z4 extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27951j;

    /* renamed from: k */
    private final /* synthetic */ String f27952k;

    /* renamed from: l */
    private final /* synthetic */ Bundle f27953l;

    /* renamed from: m */
    private final /* synthetic */ zzx f27954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7628z4(zzx zzxVar, String str, String str2, Bundle bundle) {
        super(zzxVar);
        this.f27954m = zzxVar;
        this.f27951j = str;
        this.f27952k = str2;
        this.f27953l = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27954m.f28411p.clearConditionalUserProperty(this.f27951j, this.f27952k, this.f27953l);
    }
}
