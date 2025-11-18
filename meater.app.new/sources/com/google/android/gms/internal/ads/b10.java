package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: classes2.dex */
class b10 {

    /* renamed from: a */
    protected AudioTrack f18219a;

    /* renamed from: b */
    private boolean f18220b;

    /* renamed from: c */
    private int f18221c;

    /* renamed from: d */
    private long f18222d;

    /* renamed from: e */
    private long f18223e;

    /* renamed from: f */
    private long f18224f;

    /* renamed from: g */
    private long f18225g;

    /* renamed from: h */
    private long f18226h;

    /* renamed from: i */
    private long f18227i;

    private b10() {
    }

    /* renamed from: a */
    public final void m14837a() {
        if (this.f18225g != -9223372036854775807L) {
            return;
        }
        this.f18219a.pause();
    }

    /* renamed from: b */
    public void mo14838b(AudioTrack audioTrack, boolean z) {
        this.f18219a = audioTrack;
        this.f18220b = z;
        this.f18225g = -9223372036854775807L;
        this.f18222d = 0L;
        this.f18223e = 0L;
        this.f18224f = 0L;
        if (audioTrack != null) {
            this.f18221c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: c */
    public final long m14839c() {
        return (m14841e() * 1000000) / this.f18221c;
    }

    /* renamed from: d */
    public final void m14840d(long j2) {
        this.f18226h = m14841e();
        this.f18225g = SystemClock.elapsedRealtime() * 1000;
        this.f18227i = j2;
        this.f18219a.stop();
    }

    /* renamed from: e */
    public final long m14841e() {
        if (this.f18225g != -9223372036854775807L) {
            return Math.min(this.f18227i, this.f18226h + ((((SystemClock.elapsedRealtime() * 1000) - this.f18225g) * this.f18221c) / 1000000));
        }
        int playState = this.f18219a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.f18219a.getPlaybackHeadPosition();
        if (this.f18220b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18224f = this.f18222d;
            }
            playbackHeadPosition += this.f18224f;
        }
        if (this.f18222d > playbackHeadPosition) {
            this.f18223e++;
        }
        this.f18222d = playbackHeadPosition;
        return playbackHeadPosition + (this.f18223e << 32);
    }

    /* renamed from: f */
    public boolean mo14842f() {
        return false;
    }

    /* renamed from: g */
    public long mo14843g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public long mo14844h() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ b10(a10 a10Var) {
        this();
    }
}
