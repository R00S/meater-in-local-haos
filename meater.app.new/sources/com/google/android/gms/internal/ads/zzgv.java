package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgv extends Exception {

    /* renamed from: f */
    private final String f26165f;

    /* renamed from: g */
    private final String f26166g;

    public zzgv(zzhj zzhjVar, Throwable th, int i2) {
        String strValueOf = String.valueOf(zzhjVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f26165f = null;
        String str = i2 < 0 ? "neg_" : HttpUrl.FRAGMENT_ENCODE_SET;
        int iAbs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append("com.google.android.gms.ads.exoplayer1.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(iAbs);
        this.f26166g = sb2.toString();
    }

    public zzgv(zzhj zzhjVar, Throwable th, String str) {
        String strValueOf = String.valueOf(zzhjVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f26165f = str;
        String diagnosticInfo = null;
        if (zzkq.f26428a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f26166g = diagnosticInfo;
    }
}
