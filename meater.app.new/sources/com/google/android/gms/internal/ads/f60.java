package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class f60 extends h60<zzasw> {

    /* renamed from: b */
    private final /* synthetic */ Context f18864b;

    /* renamed from: c */
    private final /* synthetic */ zzamp f18865c;

    /* renamed from: d */
    private final /* synthetic */ zzyh f18866d;

    f60(zzyh zzyhVar, Context context, zzamp zzampVar) {
        this.f18866d = zzyhVar;
        this.f18864b = context;
        this.f18865c = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzasw mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f18864b), this.f18865c, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzasw mo14746c() {
        zzyh.m20831d(this.f18864b, "rewarded_video");
        return new zzabx();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzasw mo14747d() throws RemoteException {
        return this.f18866d.f27464e.m16937c(this.f18864b, this.f18865c);
    }
}
