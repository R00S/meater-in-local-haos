package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.mz */
/* loaded from: classes2.dex */
final class C6950mz extends Thread {

    /* renamed from: f */
    private final /* synthetic */ AudioTrack f19945f;

    /* renamed from: g */
    private final /* synthetic */ zzhq f19946g;

    C6950mz(zzhq zzhqVar, AudioTrack audioTrack) {
        this.f19946g = zzhqVar;
        this.f19945f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f19945f.release();
        } finally {
            this.f19946g.f26217a.open();
        }
    }
}
