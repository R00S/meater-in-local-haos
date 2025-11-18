package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzpf extends Exception {

    /* renamed from: f */
    private final String f26804f;

    /* renamed from: g */
    private final boolean f26805g;

    /* renamed from: h */
    private final String f26806h;

    /* renamed from: i */
    private final String f26807i;

    public zzpf(zzlh zzlhVar, Throwable th, boolean z, int i2) {
        String strValueOf = String.valueOf(zzlhVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f26804f = zzlhVar.f26470k;
        this.f26805g = false;
        this.f26806h = null;
        String str = i2 < 0 ? "neg_" : HttpUrl.FRAGMENT_ENCODE_SET;
        int iAbs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(iAbs);
        this.f26807i = sb2.toString();
    }

    public zzpf(zzlh zzlhVar, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(zzlhVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f26804f = zzlhVar.f26470k;
        this.f26805g = false;
        this.f26806h = str;
        String diagnosticInfo = null;
        if (zzsy.f27024a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f26807i = diagnosticInfo;
    }
}
