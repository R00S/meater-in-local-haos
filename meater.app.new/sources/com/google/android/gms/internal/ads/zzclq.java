package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzclq implements zzcka<zzbvx, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f24686a;

    /* renamed from: b */
    private final zzbws f24687b;

    public zzclq(Context context, zzbws zzbwsVar) {
        this.f24686a = context;
        this.f24687b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbvx mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy zzcjyVar) throws RemoteException, zzcmw {
        final zzcjx zzcjxVar = new zzcjx(zzcxmVar);
        zzbvy zzbvyVarMo15300a = this.f24687b.mo15300a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzbvz(new zzbwz(zzcjyVar, zzcjxVar) { // from class: com.google.android.gms.internal.ads.cl

            /* renamed from: a */
            private final zzcjy f18457a;

            /* renamed from: b */
            private final zzcjx f18458b;

            {
                this.f18457a = zzcjyVar;
                this.f18458b = zzcjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.f18457a;
                zzcjx zzcjxVar2 = this.f18458b;
                try {
                    if (((zzaov) zzcjyVar2.f24422b).mo16819x2(ObjectWrapper.m14708E0(context))) {
                        zzcjxVar2.m18849b();
                    } else {
                        zzbad.m17353i("Cannot show interstitial.");
                    }
                } catch (RemoteException e2) {
                    zzbad.m17348d("Cannot show interstitial.", e2);
                }
            }
        }));
        zzcjxVar.m18848a(zzbvyVarMo15300a.mo14757d());
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbvyVarMo15300a.mo14759f());
        return zzbvyVarMo15300a.mo15337h();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f24422b.mo16820y6(zzcxmVar.f25238K, zzcxmVar.f25261s.toString(), zzcxuVar.f25288a.f25282a.f25293d, ObjectWrapper.m14708E0(this.f24686a), new BinderC6640el(this, zzcjyVar), (zzamv) zzcjyVar.f24423c);
    }
}
