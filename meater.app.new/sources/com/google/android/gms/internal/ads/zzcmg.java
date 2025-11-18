package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcmg implements zzcka<zzbyn, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f24701a;

    /* renamed from: b */
    private final zzbxo f24702b;

    /* renamed from: c */
    private zzang f24703c;

    public zzcmg(Context context, zzbxo zzbxoVar) {
        this.f24701a = context;
        this.f24702b = zzbxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbyn mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws RemoteException, zzcmw {
        if (!zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(6))) {
            throw new zzcmw("Unified must be used for RTB.", 1);
        }
        zzbyt zzbytVarM18507J = zzbyt.m18507J(this.f24703c);
        if (!zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(zzbytVarM18507J.m18552w()))) {
            throw new zzcmw("No corresponding native ad listener", 0);
        }
        zzbyw zzbywVarMo16090b = this.f24702b.mo16090b(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzbzf(zzbytVarM18507J), new zzcag(null, null, this.f24703c));
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbywVarMo16090b.mo14759f());
        return zzbywVarMo16090b.mo14760g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f24422b.mo16813g4(zzcxmVar.f25238K, zzcxmVar.f25261s.toString(), zzcxuVar.f25288a.f25282a.f25293d, ObjectWrapper.m14708E0(this.f24701a), new BinderC6936ml(this, zzcjyVar), (zzamv) zzcjyVar.f24423c);
    }
}
