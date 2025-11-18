package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes2.dex */
final class C7533k extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ zzk f27782j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27783k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7533k(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.f27783k = zzxVar;
        this.f27782j = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27783k.f28411p.getCurrentScreenClass(this.f27782j);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27782j.mo22444J(null);
    }
}
