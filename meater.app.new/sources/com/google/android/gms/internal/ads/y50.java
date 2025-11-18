package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class y50 extends h60<zzaqg> {

    /* renamed from: b */
    private final /* synthetic */ Activity f21103b;

    /* renamed from: c */
    private final /* synthetic */ zzyh f21104c;

    y50(zzyh zzyhVar, Activity activity) {
        this.f21104c = zzyhVar;
        this.f21103b = activity;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzaqg mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzf(ObjectWrapper.m14708E0(this.f21103b));
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzaqg mo14746c() {
        zzyh.m20831d(this.f21103b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzaqg mo14747d() throws RemoteException {
        return this.f21104c.f27466g.m16876c(this.f21103b);
    }
}
