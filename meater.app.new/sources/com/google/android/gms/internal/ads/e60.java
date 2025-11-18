package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class e60 extends h60<zzaer> {

    /* renamed from: b */
    private final /* synthetic */ View f18733b;

    /* renamed from: c */
    private final /* synthetic */ HashMap f18734c;

    /* renamed from: d */
    private final /* synthetic */ HashMap f18735d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f18736e;

    e60(zzyh zzyhVar, View view, HashMap map, HashMap map2) {
        this.f18736e = zzyhVar;
        this.f18733b = view;
        this.f18734c = map;
        this.f18735d = map2;
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: a */
    public final /* synthetic */ zzaer mo14745a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.m14708E0(this.f18733b), ObjectWrapper.m14708E0(this.f18734c), ObjectWrapper.m14708E0(this.f18735d));
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: c */
    protected final /* synthetic */ zzaer mo14746c() {
        zzyh.m20831d(this.f18733b.getContext(), "native_ad_view_holder_delegate");
        return new zzabu();
    }

    @Override // com.google.android.gms.internal.ads.h60
    /* renamed from: d */
    public final /* synthetic */ zzaer mo14747d() throws RemoteException {
        return this.f18736e.f27467h.m16560c(this.f18733b, this.f18734c, this.f18735d);
    }
}
