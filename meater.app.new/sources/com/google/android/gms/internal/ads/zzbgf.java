package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzbgf extends zzbft {
    public zzbgf(zzbdf zzbdfVar) {
        super(zzbdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    public final boolean mo17640y(String str) {
        zzbdf zzbdfVar = this.f22972h.get();
        if (zzbdfVar != null) {
            zzbdfVar.mo14909g(mo17641z(str), this);
        }
        zzbad.m17353i("VideoStreamNoopCache is doing nothing.");
        m17633q(str, mo17641z(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
