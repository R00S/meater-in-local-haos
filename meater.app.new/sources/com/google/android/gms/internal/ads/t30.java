package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* loaded from: classes2.dex */
final class t30 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ zzth f20553a;

    private t30(zzth zzthVar, MediaCodec mediaCodec) {
        this.f20553a = zzthVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        zzth zzthVar = this.f20553a;
        if (this != zzthVar.f27082z0) {
            return;
        }
        zzthVar.m20575l0();
    }
}
