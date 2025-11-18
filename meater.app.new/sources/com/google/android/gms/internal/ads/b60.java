package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class b60 extends h60<zzzf> {

    /* renamed from: b */
    private final /* synthetic */ Context f18250b;

    /* renamed from: c */
    private final /* synthetic */ String f18251c;

    /* renamed from: d */
    private final /* synthetic */ zzamp f18252d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f18253e;

    b60(zzyh zzyhVar, Context context, String str, zzamp zzampVar) {
        this.f18253e = zzyhVar;
        this.f18250b = context;
        this.f18251c = str;
        this.f18252d = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzzf mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f18250b), this.f18251c, this.f18252d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzzf mo14746c() {
        zzyh.m20831d(this.f18250b, "native_ad");
        return new zzabl();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzzf mo14747d() throws RemoteException {
        return this.f18253e.f27461b.m20815c(this.f18250b, this.f18251c, this.f18252d);
    }
}
