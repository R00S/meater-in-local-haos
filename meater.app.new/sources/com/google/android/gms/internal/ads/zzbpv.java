package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbpv implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f */
    private final zzbse f23460f;

    /* renamed from: g */
    private AtomicBoolean f23461g = new AtomicBoolean(false);

    public zzbpv(zzbse zzbseVar) {
        this.f23460f = zzbseVar;
    }

    /* renamed from: a */
    public final boolean m18249a() {
        return this.f23461g.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f23461g.set(true);
        this.f23460f.m18308Y();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f23460f.m18310g0();
    }
}
