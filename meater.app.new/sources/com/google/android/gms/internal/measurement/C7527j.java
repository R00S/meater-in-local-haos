package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes2.dex */
final class C7527j extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27772j;

    /* renamed from: k */
    private final /* synthetic */ String f27773k;

    /* renamed from: l */
    private final /* synthetic */ boolean f27774l;

    /* renamed from: m */
    private final /* synthetic */ zzk f27775m;

    /* renamed from: n */
    private final /* synthetic */ zzx f27776n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7527j(zzx zzxVar, String str, String str2, boolean z, zzk zzkVar) {
        super(zzxVar);
        this.f27776n = zzxVar;
        this.f27772j = str;
        this.f27773k = str2;
        this.f27774l = z;
        this.f27775m = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27776n.f28411p.getUserProperties(this.f27772j, this.f27773k, this.f27774l, this.f27775m);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27775m.mo22444J(null);
    }
}
