package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.iz */
/* loaded from: classes2.dex */
final class C6802iz implements InterfaceC6728gz {

    /* renamed from: a */
    private final int f19406a;

    /* renamed from: b */
    private MediaCodecInfo[] f19407b;

    public C6802iz(boolean z) {
        this.f19406a = z ? 1 : 0;
    }

    /* renamed from: e */
    private final void m15358e() {
        if (this.f19407b == null) {
            this.f19407b = new MediaCodecList(this.f19406a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: a */
    public final MediaCodecInfo mo15240a(int i2) {
        m15358e();
        return this.f19407b[i2];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: b */
    public final boolean mo15241b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: c */
    public final int mo15242c() {
        m15358e();
        return this.f19407b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6728gz
    /* renamed from: d */
    public final boolean mo15243d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
