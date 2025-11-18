package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class d60 extends h60<zzaem> {

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f18495b;

    /* renamed from: c */
    private final /* synthetic */ FrameLayout f18496c;

    /* renamed from: d */
    private final /* synthetic */ Context f18497d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f18498e;

    d60(zzyh zzyhVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f18498e = zzyhVar;
        this.f18495b = frameLayout;
        this.f18496c = frameLayout2;
        this.f18497d = context;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzaem mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzc(ObjectWrapper.m14708E0(this.f18495b), ObjectWrapper.m14708E0(this.f18496c));
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzaem mo14746c() {
        zzyh.m20831d(this.f18497d, "native_ad_view_delegate");
        return new zzabt();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzaem mo14747d() throws RemoteException {
        return this.f18498e.f27463d.m16559c(this.f18497d, this.f18495b, this.f18496c);
    }
}
