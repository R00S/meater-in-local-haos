package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes2.dex */
final class C7491d extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27712j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27713k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7491d(zzx zzxVar, String str) {
        super(zzxVar);
        this.f27713k = zzxVar;
        this.f27712j = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27713k.f28411p.beginAdUnitExposure(this.f27712j, this.f28413g);
    }
}
