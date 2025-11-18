package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcme implements zzcka<zzbyn, zzams, zzcla> {

    /* renamed from: a */
    private final Context f24697a;

    /* renamed from: b */
    private final zzbxo f24698b;

    public zzcme(Context context, zzbxo zzbxoVar) {
        this.f24697a = context;
        this.f24698b = zzbxoVar;
    }

    /* renamed from: c */
    private static boolean m18877c(zzcxu zzcxuVar, int i2) {
        return zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbyn mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws RemoteException, zzcmw {
        zzbyt zzbytVarM18512r;
        zzana zzanaVarMo16705b7 = ((zzams) zzcjyVar.f24422b).mo16705b7();
        zzand zzandVarMo16707e6 = ((zzams) zzcjyVar.f24422b).mo16707e6();
        zzang zzangVarMo16701P1 = ((zzams) zzcjyVar.f24422b).mo16701P1();
        if (zzangVarMo16701P1 != null && m18877c(zzcxuVar, 6)) {
            zzbytVarM18512r = zzbyt.m18507J(zzangVarMo16701P1);
        } else if (zzanaVarMo16705b7 != null && m18877c(zzcxuVar, 6)) {
            zzbytVarM18512r = zzbyt.m18505H(zzanaVarMo16705b7);
        } else if (zzanaVarMo16705b7 != null && m18877c(zzcxuVar, 2)) {
            zzbytVarM18512r = zzbyt.m18511q(zzanaVarMo16705b7);
        } else if (zzandVarMo16707e6 != null && m18877c(zzcxuVar, 6)) {
            zzbytVarM18512r = zzbyt.m18506I(zzandVarMo16707e6);
        } else {
            if (zzandVarMo16707e6 == null || !m18877c(zzcxuVar, 1)) {
                throw new zzcmw("No native ad mappers", 0);
            }
            zzbytVarM18512r = zzbyt.m18512r(zzandVarMo16707e6);
        }
        if (!zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(zzbytVarM18512r.m18552w()))) {
            throw new zzcmw("No corresponding native ad listener", 0);
        }
        zzbyw zzbywVarMo16090b = this.f24698b.mo16090b(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzbzf(zzbytVarM18512r), new zzcag(zzandVarMo16707e6, zzanaVarMo16705b7, zzangVarMo16701P1));
        ((zzcla) zzcjyVar.f24423c).m18861i7(zzbywVarMo16090b.mo14759f());
        return zzbywVarMo16090b.mo14760g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        zzams zzamsVar = zzcjyVar.f24422b;
        IObjectWrapper iObjectWrapperM14708E0 = ObjectWrapper.m14708E0(this.f24697a);
        zzxz zzxzVar = zzcxuVar.f25288a.f25282a.f25293d;
        String string = zzcxmVar.f25261s.toString();
        String strM17259a = zzazc.m17259a(zzcxmVar.f25258p);
        zzamv zzamvVar = (zzamv) zzcjyVar.f24423c;
        zzcxv zzcxvVar = zzcxuVar.f25288a.f25282a;
        zzamsVar.mo16700M3(iObjectWrapperM14708E0, zzxzVar, string, strM17259a, zzamvVar, zzcxvVar.f25298i, zzcxvVar.f25296g);
    }
}
