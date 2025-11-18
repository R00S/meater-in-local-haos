package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzckj implements zzcka<zzbnf, zzams, zzcla> {

    /* renamed from: a */
    private final Context f24436a;

    /* renamed from: b */
    private final zzbai f24437b;

    /* renamed from: c */
    private final zzboc f24438c;

    public zzckj(Context context, zzbai zzbaiVar, zzboc zzbocVar) {
        this.f24436a = context;
        this.f24437b = zzbaiVar;
        this.f24438c = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbnf mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws RemoteException, zzcmw {
        zzboc zzbocVar = this.f24438c;
        zzbpr zzbprVar = new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a);
        View view = (View) ObjectWrapper.m14709k0(((zzams) zzcjyVar.f24422b).mo16714x1());
        zzams zzamsVar = (zzams) zzcjyVar.f24422b;
        zzamsVar.getClass();
        zzbng zzbngVarMo15068a = zzbocVar.mo15068a(zzbprVar, new zzbnk(view, null, C6898lk.m15510a(zzamsVar), zzcxmVar.f25260r.get(0)));
        zzbngVarMo15068a.mo15108i().m18388Y((View) ObjectWrapper.m14709k0(((zzams) zzcjyVar.f24422b).mo16714x1()));
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbngVarMo15068a.mo14759f());
        return zzbngVarMo15068a.mo15106g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        zzyd zzydVarM19058a = zzcxy.m19058a(this.f24436a, zzcxmVar.f25260r);
        if (this.f24437b.f22752h < 4100000) {
            zzcjyVar.f24422b.mo16716y2(ObjectWrapper.m14708E0(this.f24436a), zzydVarM19058a, zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString(), (zzamv) zzcjyVar.f24423c);
        } else {
            zzcjyVar.f24422b.mo16712s4(ObjectWrapper.m14708E0(this.f24436a), zzydVarM19058a, zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString(), zzazc.m17259a(zzcxmVar.f25258p), (zzamv) zzcjyVar.f24423c);
        }
    }
}
