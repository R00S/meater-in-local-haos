package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class a60 extends h60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f18087b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f18088c;

    /* renamed from: d */
    private final /* synthetic */ String f18089d;

    /* renamed from: e */
    private final /* synthetic */ zzamp f18090e;

    /* renamed from: f */
    private final /* synthetic */ zzyh f18091f;

    a60(zzyh zzyhVar, Context context, zzyd zzydVar, String str, zzamp zzampVar) {
        this.f18091f = zzyhVar;
        this.f18087b = context;
        this.f18088c = zzydVar;
        this.f18089d = str;
        this.f18090e = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzzk mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzb(ObjectWrapper.m14708E0(this.f18087b), this.f18088c, this.f18089d, this.f18090e, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    public final /* synthetic */ zzzk mo14746c() {
        zzyh.m20831d(this.f18087b, "interstitial");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzzk mo14747d() throws RemoteException {
        return this.f18091f.f27460a.m20816c(this.f18087b, this.f18088c, this.f18089d, this.f18090e, 2);
    }
}
