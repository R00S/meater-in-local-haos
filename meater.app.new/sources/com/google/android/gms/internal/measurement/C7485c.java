package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes2.dex */
final class C7485c extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27700j;

    /* renamed from: k */
    private final /* synthetic */ String f27701k;

    /* renamed from: l */
    private final /* synthetic */ String f27702l;

    /* renamed from: m */
    private final /* synthetic */ zzx f27703m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7485c(zzx zzxVar, Activity activity, String str, String str2) {
        super(zzxVar);
        this.f27703m = zzxVar;
        this.f27700j = activity;
        this.f27701k = str;
        this.f27702l = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27703m.f28411p.setCurrentScreen(ObjectWrapper.m14708E0(this.f27700j), this.f27701k, this.f27702l, this.f28412f);
    }
}
