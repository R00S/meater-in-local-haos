package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes2.dex */
final class r20 implements q20 {
    private r20() {
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: a */
    public final MediaCodecInfo mo15799a(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: b */
    public final boolean mo15800b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: c */
    public final int mo15801c() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.q20
    /* renamed from: d */
    public final boolean mo15802d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
