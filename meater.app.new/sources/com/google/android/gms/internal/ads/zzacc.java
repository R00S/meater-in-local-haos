package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzacc extends zzaav {

    /* renamed from: f */
    private final VideoController.VideoLifecycleCallbacks f21573f;

    public zzacc(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f21573f = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    /* renamed from: T0 */
    public final void mo16202T0(boolean z) {
        this.f21573f.onVideoMute(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    /* renamed from: n0 */
    public final void mo16203n0() {
        this.f21573f.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPause() {
        this.f21573f.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPlay() {
        this.f21573f.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoStart() {
        this.f21573f.onVideoStart();
    }
}
