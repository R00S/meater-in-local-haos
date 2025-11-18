package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class z50 extends h60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f21368b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f21369c;

    /* renamed from: d */
    private final /* synthetic */ String f21370d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f21371e;

    z50(zzyh zzyhVar, Context context, zzyd zzydVar, String str) {
        this.f21371e = zzyhVar;
        this.f21368b = context;
        this.f21369c = zzydVar;
        this.f21370d = str;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzzk mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f21368b), this.f21369c, this.f21370d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    public final /* synthetic */ zzzk mo14746c() {
        zzyh.m20831d(this.f21368b, "search");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzzk mo14747d() throws RemoteException {
        return this.f21371e.f27460a.m20816c(this.f21368b, this.f21369c, this.f21370d, null, 3);
    }
}
