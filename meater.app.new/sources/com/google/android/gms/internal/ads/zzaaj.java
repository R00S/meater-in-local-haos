package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes2.dex */
public final class zzaaj extends zzaah {

    /* renamed from: f */
    private final MuteThisAdListener f21489f;

    public zzaaj(MuteThisAdListener muteThisAdListener) {
        this.f21489f = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void onAdMuted() {
        this.f21489f.onAdMuted();
    }
}
