package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwq implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f */
    private final zzbsv f23649f;

    /* renamed from: g */
    private final zzbuv f23650g;

    public zzbwq(zzbsv zzbsvVar, zzbuv zzbuvVar) {
        this.f23649f = zzbsvVar;
        this.f23650g = zzbuvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        this.f23649f.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        this.f23649f.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f23649f.zzsz();
        this.f23650g.m18384Y();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f23649f.zzta();
        this.f23650g.m18385f0();
    }
}
