package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes2.dex */
final class c10 extends b10 {

    /* renamed from: j */
    private final AudioTimestamp f18376j;

    /* renamed from: k */
    private long f18377k;

    /* renamed from: l */
    private long f18378l;

    /* renamed from: m */
    private long f18379m;

    public c10() {
        super(null);
        this.f18376j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: b */
    public final void mo14838b(AudioTrack audioTrack, boolean z) {
        super.mo14838b(audioTrack, z);
        this.f18377k = 0L;
        this.f18378l = 0L;
        this.f18379m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: f */
    public final boolean mo14842f() {
        boolean timestamp = this.f18219a.getTimestamp(this.f18376j);
        if (timestamp) {
            long j2 = this.f18376j.framePosition;
            if (this.f18378l > j2) {
                this.f18377k++;
            }
            this.f18378l = j2;
            this.f18379m = j2 + (this.f18377k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: g */
    public final long mo14843g() {
        return this.f18376j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: h */
    public final long mo14844h() {
        return this.f18379m;
    }
}
