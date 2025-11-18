package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcoo implements zzf {

    /* renamed from: a */
    private final zzbri f24821a;

    /* renamed from: b */
    private final zzbrt f24822b;

    /* renamed from: c */
    private final zzbvd f24823c;

    /* renamed from: d */
    private final zzbva f24824d;

    /* renamed from: e */
    private final zzbmn f24825e;

    /* renamed from: f */
    private AtomicBoolean f24826f = new AtomicBoolean(false);

    zzcoo(zzbri zzbriVar, zzbrt zzbrtVar, zzbvd zzbvdVar, zzbva zzbvaVar, zzbmn zzbmnVar) {
        this.f24821a = zzbriVar;
        this.f24822b = zzbrtVar;
        this.f24823c = zzbvdVar;
        this.f24824d = zzbvaVar;
        this.f24825e = zzbmnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzg(View view) {
        if (this.f24826f.compareAndSet(false, true)) {
            this.f24825e.onAdImpression();
            this.f24824d.m18388Y(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzky() {
        if (this.f24826f.get()) {
            this.f24821a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzkz() {
        if (this.f24826f.get()) {
            this.f24822b.m18301Y();
            this.f24823c.m18391Y();
        }
    }
}
