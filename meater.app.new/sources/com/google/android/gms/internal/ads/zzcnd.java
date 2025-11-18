package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcnd implements zzcka<zzcdb, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f24764a;

    /* renamed from: b */
    private final zzcdf f24765b;

    public zzcnd(Context context, zzcdf zzcdfVar) {
        this.f24764a = context;
        this.f24765b = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzcdb mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy zzcjyVar) throws RemoteException, zzcmw {
        final zzcjx zzcjxVar = new zzcjx(zzcxmVar);
        zzcdc zzcdcVarMo15433a = this.f24765b.mo15433a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzcdd(new zzbwz(zzcjyVar, zzcjxVar) { // from class: com.google.android.gms.internal.ads.rl

            /* renamed from: a */
            private final zzcjy f20463a;

            /* renamed from: b */
            private final zzcjx f20464b;

            {
                this.f20463a = zzcjyVar;
                this.f20464b = zzcjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.f20463a;
                zzcjx zzcjxVar2 = this.f20464b;
                try {
                    if (((zzaov) zzcjyVar2.f24422b).mo16811L2(ObjectWrapper.m14708E0(context))) {
                        zzcjxVar2.m18849b();
                    } else {
                        zzbad.m17353i("Can't show rewarded video.");
                    }
                } catch (RemoteException e2) {
                    zzbad.m17348d("Can't show rewarded video.", e2);
                }
            }
        }));
        zzcjxVar.m18848a(zzcdcVarMo15433a.mo14757d());
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzcdcVarMo15433a.mo15509l());
        return zzcdcVarMo15433a.mo15507j();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f24422b.mo16814h5(zzcxmVar.f25238K, zzcxmVar.f25261s.toString(), zzcxuVar.f25288a.f25282a.f25293d, ObjectWrapper.m14708E0(this.f24764a), new BinderC7195tl(this, zzcjyVar), (zzamv) zzcjyVar.f24423c);
    }
}
