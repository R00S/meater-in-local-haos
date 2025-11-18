package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes2.dex */
final class s20 implements q20 {

    /* renamed from: a */
    private final int f20495a;

    /* renamed from: b */
    private MediaCodecInfo[] f20496b;

    public s20(boolean z) {
        this.f20495a = z ? 1 : 0;
    }

    /* renamed from: e */
    private final void m15844e() {
        if (this.f20496b == null) {
            this.f20496b = new MediaCodecList(this.f20495a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: a */
    public final MediaCodecInfo mo15799a(int i2) {
        m15844e();
        return this.f20496b[i2];
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: b */
    public final boolean mo15800b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: c */
    public final int mo15801c() {
        m15844e();
        return this.f20496b.length;
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: d */
    public final boolean mo15802d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
