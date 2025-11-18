package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.w4 */
/* loaded from: classes2.dex */
final class C7289w4 extends zzawv {

    /* renamed from: a */
    private final /* synthetic */ zzawm f20831a;

    C7289w4(zzawm zzawmVar) {
        this.f20831a = zzawmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        zzacx zzacxVar = new zzacx(this.f20831a.f22598f, this.f20831a.f22599g.f22750f);
        synchronized (this.f20831a.f22593a) {
            try {
                zzk.zzlp();
                zzada.m16439a(this.f20831a.f22600h, zzacxVar);
            } catch (IllegalArgumentException e2) {
                zzbad.m17348d("Cannot config CSI reporter.", e2);
            }
        }
    }
}
