package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.g3 */
/* loaded from: classes2.dex */
final class RunnableC6696g3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AdOverlayInfoParcel f18938f;

    /* renamed from: g */
    private final /* synthetic */ zzapl f18939g;

    RunnableC6696g3(zzapl zzaplVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f18939g = zzaplVar;
        this.f18938f = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzk.zzlf();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.f18939g.f22220a, this.f18938f, true);
    }
}
