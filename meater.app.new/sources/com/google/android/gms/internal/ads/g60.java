package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class g60 extends h60<zzatt> {

    /* renamed from: b */
    private final /* synthetic */ Context f18950b;

    /* renamed from: c */
    private final /* synthetic */ String f18951c;

    /* renamed from: d */
    private final /* synthetic */ zzamp f18952d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f18953e;

    g60(zzyh zzyhVar, Context context, String str, zzamp zzampVar) {
        this.f18953e = zzyhVar;
        this.f18950b = context;
        this.f18951c = str;
        this.f18952d = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzatt mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzb(ObjectWrapper.m14708E0(this.f18950b), this.f18951c, this.f18952d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzatt mo14746c() {
        zzyh.m20831d(this.f18950b, "rewarded");
        return new zzabv();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzatt mo14747d() throws RemoteException {
        return zzauj.m16962a(this.f18950b, this.f18951c, this.f18952d);
    }
}
