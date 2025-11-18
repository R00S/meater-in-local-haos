package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class c60 extends h60<zzaab> {

    /* renamed from: b */
    private final /* synthetic */ Context f18410b;

    /* renamed from: c */
    private final /* synthetic */ zzyh f18411c;

    c60(zzyh zzyhVar, Context context) {
        this.f18411c = zzyhVar;
        this.f18410b = context;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzaab mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f18410b), 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzaab mo14746c() {
        zzyh.m20831d(this.f18410b, "mobile_ads_settings");
        return new zzabr();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzaab mo14747d() throws RemoteException {
        return this.f18411c.f27462c.m16326c(this.f18410b);
    }
}
