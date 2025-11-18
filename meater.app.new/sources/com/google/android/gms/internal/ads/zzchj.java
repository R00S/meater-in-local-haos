package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzchj implements zzbal<zzarx, zzcxu> {

    /* renamed from: a */
    private final zzbtg f24321a;

    public zzchj(zzbtg zzbtgVar) {
        this.f24321a = zzbtgVar;
    }

    /* renamed from: c */
    protected abstract zzbbh<zzcxu> mo18792c(zzarx zzarxVar) throws zzcgm;

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh<zzcxu> zzf(zzarx zzarxVar) throws Exception {
        zzarx zzarxVar2 = zzarxVar;
        this.f24321a.mo15437N(zzarxVar2);
        zzbbh<zzcxu> zzbbhVarMo18792c = mo18792c(zzarxVar2);
        zzbar.m17369f(zzbbhVarMo18792c, new C6490aj(this), zzbbm.f22758b);
        return zzbbhVarMo18792c;
    }
}
