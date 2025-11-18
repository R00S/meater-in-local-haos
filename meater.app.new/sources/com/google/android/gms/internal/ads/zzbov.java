package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbov implements zzbsr, zzue {

    /* renamed from: f */
    private final zzcxm f23385f;

    /* renamed from: g */
    private final zzbrt f23386g;

    /* renamed from: h */
    private final AtomicBoolean f23387h = new AtomicBoolean();

    public zzbov(zzcxm zzcxmVar, zzbrt zzbrtVar) {
        this.f23385f = zzcxmVar;
        this.f23386g = zzbrtVar;
    }

    /* renamed from: j */
    private final void m17936j() {
        if (this.f23387h.compareAndSet(false, true)) {
            this.f23386g.m18301Y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f23385f.f25247e != 1) {
            m17936j();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        if (this.f23385f.f25247e == 1 && zzudVar.f27144m) {
            m17936j();
        }
    }
}
