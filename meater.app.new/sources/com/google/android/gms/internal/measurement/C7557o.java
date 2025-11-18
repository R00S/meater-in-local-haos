package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzha;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes2.dex */
final class C7557o extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ zzha f27855j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27856k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7557o(zzx zzxVar, zzha zzhaVar) {
        super(zzxVar);
        this.f27856k = zzxVar;
        this.f27855j = zzhaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        for (int i2 = 0; i2 < this.f27856k.f28407l.size(); i2++) {
            if (this.f27855j.equals(((Pair) this.f27856k.f28407l.get(i2)).first)) {
                Log.w(this.f27856k.f28403h, "OnEventListener already registered.");
                return;
            }
        }
        zzx.BinderC7634b binderC7634b = new zzx.BinderC7634b(this.f27855j);
        this.f27856k.f28407l.add(new Pair(this.f27855j, binderC7634b));
        this.f27856k.f28411p.registerOnMeasurementEventListener(binderC7634b);
    }
}
