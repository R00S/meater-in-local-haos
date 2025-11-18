package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class x50 extends h60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f20944b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f20945c;

    /* renamed from: d */
    private final /* synthetic */ String f20946d;

    /* renamed from: e */
    private final /* synthetic */ zzamp f20947e;

    /* renamed from: f */
    private final /* synthetic */ zzyh f20948f;

    x50(zzyh zzyhVar, Context context, zzyd zzydVar, String str, zzamp zzampVar) {
        this.f20948f = zzyhVar;
        this.f20944b = context;
        this.f20945c = zzydVar;
        this.f20946d = str;
        this.f20947e = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzzk mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f20944b), this.f20945c, this.f20946d, this.f20947e, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    public final /* synthetic */ zzzk mo14746c() {
        zzyh.m20831d(this.f20944b, "banner");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzzk mo14747d() throws RemoteException {
        return this.f20948f.f27460a.m20816c(this.f20944b, this.f20945c, this.f20946d, this.f20947e, 1);
    }
}
