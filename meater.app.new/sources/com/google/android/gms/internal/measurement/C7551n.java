package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes2.dex */
final class C7551n extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27842j;

    /* renamed from: k */
    private final /* synthetic */ zzk f27843k;

    /* renamed from: l */
    private final /* synthetic */ zzx f27844l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7551n(zzx zzxVar, String str, zzk zzkVar) {
        super(zzxVar);
        this.f27844l = zzxVar;
        this.f27842j = str;
        this.f27843k = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27844l.f28411p.getMaxUserProperties(this.f27842j, this.f27843k);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27843k.mo22444J(null);
    }
}
