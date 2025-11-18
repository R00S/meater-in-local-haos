package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes2.dex */
final class C7479b extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27688j;

    /* renamed from: k */
    private final /* synthetic */ String f27689k;

    /* renamed from: l */
    private final /* synthetic */ zzk f27690l;

    /* renamed from: m */
    private final /* synthetic */ zzx f27691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7479b(zzx zzxVar, String str, String str2, zzk zzkVar) {
        super(zzxVar);
        this.f27691m = zzxVar;
        this.f27688j = str;
        this.f27689k = str2;
        this.f27690l = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27691m.f28411p.getConditionalUserProperties(this.f27688j, this.f27689k, this.f27690l);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27690l.mo22444J(null);
    }
}
