package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.oz */
/* loaded from: classes2.dex */
final class C7024oz extends C6987nz {

    /* renamed from: g */
    private final AudioTimestamp f20227g;

    /* renamed from: h */
    private long f20228h;

    /* renamed from: i */
    private long f20229i;

    /* renamed from: j */
    private long f20230j;

    public C7024oz() {
        super(null);
        this.f20227g = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.C6987nz
    /* renamed from: a */
    public final void mo15657a(AudioTrack audioTrack, boolean z) {
        super.mo15657a(audioTrack, z);
        this.f20228h = 0L;
        this.f20229i = 0L;
        this.f20230j = 0L;
    }

    @Override // com.google.android.gms.internal.ads.C6987nz
    /* renamed from: e */
    public final boolean mo15661e() {
        boolean timestamp = this.f20112a.getTimestamp(this.f20227g);
        if (timestamp) {
            long j2 = this.f20227g.framePosition;
            if (this.f20229i > j2) {
                this.f20228h++;
            }
            this.f20229i = j2;
            this.f20230j = j2 + (this.f20228h << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.C6987nz
    /* renamed from: f */
    public final long mo15662f() {
        return this.f20227g.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.C6987nz
    /* renamed from: g */
    public final long mo15663g() {
        return this.f20230j;
    }
}
