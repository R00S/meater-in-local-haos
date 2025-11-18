package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.hz */
/* loaded from: classes2.dex */
final class C6765hz implements InterfaceC6728gz {
    private C6765hz() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: a */
    public final MediaCodecInfo mo15240a(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: b */
    public final boolean mo15241b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: c */
    public final int mo15242c() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: d */
    public final boolean mo15243d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
