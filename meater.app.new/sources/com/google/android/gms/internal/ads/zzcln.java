package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcln implements zzcka<zzbvx, zzams, zzcla> {

    /* renamed from: a */
    private final Context f24680a;

    /* renamed from: b */
    private final zzbws f24681b;

    /* renamed from: c */
    private final zzbai f24682c;

    public zzcln(Context context, zzbai zzbaiVar, zzbws zzbwsVar) {
        this.f24680a = context;
        this.f24682c = zzbaiVar;
        this.f24681b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbvx mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy zzcjyVar) throws RemoteException, zzcmw {
        zzbvy zzbvyVarMo15300a = this.f24681b.mo15300a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzbvz(new zzbwz(zzcjyVar) { // from class: com.google.android.gms.internal.ads.bl

            /* renamed from: a */
            private final zzcjy f18346a;

            {
                this.f18346a = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.f18346a;
                try {
                    ((zzams) zzcjyVar2.f24422b).setImmersiveMode(z);
                    ((zzams) zzcjyVar2.f24422b).showInterstitial();
                } catch (RemoteException unused) {
                    zzbad.m17352h("Cannot show interstitial.");
                }
            }
        }));
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbvyVarMo15300a.mo14759f());
        return zzbvyVarMo15300a.mo15337h();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        if (this.f24682c.f22752h < 4100000) {
            zzcjyVar.f24422b.mo16703Y2(ObjectWrapper.m14708E0(this.f24680a), zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString(), (zzamv) zzcjyVar.f24423c);
        } else {
            zzcjyVar.f24422b.mo16706c6(ObjectWrapper.m14708E0(this.f24680a), zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString(), zzazc.m17259a(zzcxmVar.f25258p), (zzamv) zzcjyVar.f24423c);
        }
    }
}
