package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class a10 extends Thread {

    /* renamed from: f */
    private final /* synthetic */ AudioTrack f18069f;

    /* renamed from: g */
    private final /* synthetic */ zzmh f18070g;

    a10(zzmh zzmhVar, AudioTrack audioTrack) {
        this.f18070g = zzmhVar;
        this.f18069f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f18069f.flush();
            this.f18069f.release();
        } finally {
            this.f18070g.f26560f.open();
        }
    }
}
