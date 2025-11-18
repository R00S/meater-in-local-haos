package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzard
/* loaded from: classes2.dex */
public final class zzadr extends zzadp {

    /* renamed from: f */
    private final OnCustomRenderedAdLoadedListener f21940f;

    public zzadr(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f21940f = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    /* renamed from: O2 */
    public final void mo16456O2(zzadl zzadlVar) {
        this.f21940f.onCustomRenderedAdLoaded(new zzadk(zzadlVar));
    }
}
