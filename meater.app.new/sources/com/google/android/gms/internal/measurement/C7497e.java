package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes2.dex */
final class C7497e extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27715j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27716k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7497e(zzx zzxVar, String str) {
        super(zzxVar);
        this.f27716k = zzxVar;
        this.f27715j = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27716k.f28411p.endAdUnitExposure(this.f27715j, this.f28413g);
    }
}
