package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzckm implements zzcka<zzbnf, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f24442a;

    /* renamed from: b */
    private final zzboc f24443b;

    /* renamed from: c */
    private View f24444c;

    public zzckm(Context context, zzboc zzbocVar) {
        this.f24442a = context;
        this.f24443b = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbnf mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws RemoteException, zzcmw {
        zzboc zzbocVar = this.f24443b;
        zzbpr zzbprVar = new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a);
        View view = this.f24444c;
        zzaov zzaovVar = (zzaov) zzcjyVar.f24422b;
        zzaovVar.getClass();
        zzbng zzbngVarMo15068a = zzbocVar.mo15068a(zzbprVar, new zzbnk(view, null, C6935mk.m15554a(zzaovVar), zzcxmVar.f25260r.get(0)));
        zzbngVarMo15068a.mo15108i().m18388Y(this.f24444c);
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbngVarMo15068a.mo14759f());
        return zzbngVarMo15068a.mo15106g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f24422b.mo16810K4(zzcxmVar.f25238K, zzcxmVar.f25261s.toString(), zzcxuVar.f25288a.f25282a.f25293d, ObjectWrapper.m14708E0(this.f24442a), new BinderC7009ok(this, zzcjyVar), (zzamv) zzcjyVar.f24423c, zzcxuVar.f25288a.f25282a.f25294e);
    }
}
