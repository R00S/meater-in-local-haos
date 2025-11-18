package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.nz */
/* loaded from: classes2.dex */
class C6987nz {

    /* renamed from: a */
    protected AudioTrack f20112a;

    /* renamed from: b */
    private boolean f20113b;

    /* renamed from: c */
    private int f20114c;

    /* renamed from: d */
    private long f20115d;

    /* renamed from: e */
    private long f20116e;

    /* renamed from: f */
    private long f20117f;

    private C6987nz() {
    }

    /* renamed from: a */
    public void mo15657a(AudioTrack audioTrack, boolean z) {
        this.f20112a = audioTrack;
        this.f20113b = z;
        this.f20115d = 0L;
        this.f20116e = 0L;
        this.f20117f = 0L;
        if (audioTrack != null) {
            this.f20114c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: b */
    public final boolean m15658b() {
        return zzkq.f26428a <= 22 && this.f20113b && this.f20112a.getPlayState() == 2 && this.f20112a.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: c */
    public final long m15659c() {
        long playbackHeadPosition = this.f20112a.getPlaybackHeadPosition() & 4294967295L;
        if (zzkq.f26428a <= 22 && this.f20113b) {
            if (this.f20112a.getPlayState() == 1) {
                this.f20115d = playbackHeadPosition;
            } else if (this.f20112a.getPlayState() == 2 && playbackHeadPosition == 0) {
                this.f20117f = this.f20115d;
            }
            playbackHeadPosition += this.f20117f;
        }
        if (this.f20115d > playbackHeadPosition) {
            this.f20116e++;
        }
        this.f20115d = playbackHeadPosition;
        return playbackHeadPosition + (this.f20116e << 32);
    }

    /* renamed from: d */
    public final long m15660d() {
        return (m15659c() * 1000000) / this.f20114c;
    }

    /* renamed from: e */
    public boolean mo15661e() {
        return false;
    }

    /* renamed from: f */
    public long mo15662f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public long mo15663g() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C6987nz(C6950mz c6950mz) {
        this();
    }
}
