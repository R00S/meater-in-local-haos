package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcna implements zzcka<zzcdb, zzams, zzcla> {

    /* renamed from: a */
    private final Context f24758a;

    /* renamed from: b */
    private final Executor f24759b;

    /* renamed from: c */
    private final zzcdf f24760c;

    public zzcna(Context context, Executor executor, zzcdf zzcdfVar) {
        this.f24758a = context;
        this.f24759b = executor;
        this.f24760c = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzcdb mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy zzcjyVar) throws RemoteException, zzcmw {
        zzcdc zzcdcVarMo15433a = this.f24760c.mo15433a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzcdd(new zzbwz(zzcjyVar) { // from class: com.google.android.gms.internal.ads.ql

            /* renamed from: a */
            private final zzcjy f20399a;

            {
                this.f20399a = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.f20399a;
                try {
                    ((zzams) zzcjyVar2.f24422b).setImmersiveMode(z);
                    ((zzams) zzcjyVar2.f24422b).mo16704a4(ObjectWrapper.m14708E0(context));
                } catch (RemoteException e2) {
                    zzbad.m17348d("Cannot show rewarded .", e2);
                }
            }
        }));
        zzcdcVarMo15433a.mo14754a().m18332V(new zzccy((zzams) zzcjyVar.f24422b), this.f24759b);
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzcdcVarMo15433a.mo15509l());
        return zzcdcVarMo15433a.mo15507j();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        try {
            zzcjyVar.f24422b.mo16708f2(ObjectWrapper.m14708E0(this.f24758a), zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString(), (zzamv) zzcjyVar.f24423c);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(zzcjyVar.f24421a);
            zzbad.m17348d(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }
}
