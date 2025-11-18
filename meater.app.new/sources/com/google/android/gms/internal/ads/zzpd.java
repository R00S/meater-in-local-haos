package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzpd {

    /* renamed from: a */
    public final String f26759a;

    /* renamed from: b */
    public final boolean f26760b;

    /* renamed from: c */
    public final boolean f26761c;

    /* renamed from: d */
    public final boolean f26762d;

    /* renamed from: e */
    private final String f26763e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f26764f;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzpd(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzsk.m20480d(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f26759a = r2
            r1.f26763e = r3
            r1.f26764f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r5 = com.google.android.gms.internal.ads.zzsy.f27024a
            r0 = 19
            if (r5 < r0) goto L25
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            r1.f26760b = r5
            r5 = 21
            if (r4 == 0) goto L44
            int r0 = com.google.android.gms.internal.ads.zzsy.f27024a
            if (r0 < r5) goto L3f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r1.f26761c = r0
            if (r6 != 0) goto L5e
            if (r4 == 0) goto L5d
            int r6 = com.google.android.gms.internal.ads.zzsy.f27024a
            if (r6 < r5) goto L59
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L59
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            r1.f26762d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    /* renamed from: a */
    public static zzpd m20359a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzpd(str, str2, codecCapabilities, z, z2);
    }

    @TargetApi(21)
    /* renamed from: c */
    private static boolean m20360c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i2, i3) : videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
    }

    /* renamed from: g */
    public static zzpd m20361g(String str) {
        return new zzpd(str, null, null, false, false);
    }

    /* renamed from: h */
    private final void m20362h(String str) {
        String str2 = this.f26759a;
        String str3 = this.f26763e;
        String str4 = zzsy.f27028e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    /* renamed from: b */
    public final boolean m20363b(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26764f;
        if (codecCapabilities == null) {
            m20362h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m20362h("sizeAndRate.vCaps");
            return false;
        }
        if (m20360c(videoCapabilities, i2, i3, d2)) {
            return true;
        }
        if (i2 >= i3 || !m20360c(videoCapabilities, i3, i2, d2)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.support, ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("x");
            sb.append(d2);
            m20362h(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.rotated, ");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(i3);
        sb2.append("x");
        sb2.append(d2);
        String string = sb2.toString();
        String str = this.f26759a;
        String str2 = this.f26763e;
        String str3 = zzsy.f27028e;
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("AssumedSupport [");
        sb3.append(string);
        sb3.append("] [");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append("] [");
        sb3.append(str3);
        sb3.append("]");
        Log.d("MediaCodecInfo", sb3.toString());
        return true;
    }

    /* renamed from: d */
    public final boolean m20364d(String str) {
        if (str == null || this.f26763e == null) {
            return true;
        }
        String strTrim = str.trim();
        String str2 = (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) ? "video/avc" : (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) ? "video/hevc" : strTrim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : strTrim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : strTrim.startsWith("mp4a") ? "audio/mp4a-latm" : (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) ? "audio/ac3" : (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) ? "audio/eac3" : (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) ? "audio/vnd.dts" : (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strTrim.startsWith("opus") ? "audio/opus" : strTrim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str2 == null) {
            return true;
        }
        if (!this.f26763e.equals(str2)) {
            StringBuilder sb = new StringBuilder(str.length() + 13 + str2.length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            m20362h(sb.toString());
            return false;
        }
        Pair<Integer, Integer> pairM20382c = zzpi.m20382c(str);
        if (pairM20382c == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m20368j()) {
            if (codecProfileLevel.profile == ((Integer) pairM20382c.first).intValue() && codecProfileLevel.level >= ((Integer) pairM20382c.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        m20362h(sb2.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public final boolean m20365e(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26764f;
        if (codecCapabilities == null) {
            m20362h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m20362h("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i2);
        m20362h(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: f */
    public final boolean m20366f(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26764f;
        if (codecCapabilities == null) {
            m20362h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m20362h("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i2) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i2);
        m20362h(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: i */
    public final Point m20367i(int i2, int i3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26764f;
        if (codecCapabilities == null) {
            m20362h("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m20362h("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzsy.m20546j(i2, widthAlignment) * widthAlignment, zzsy.m20546j(i3, heightAlignment) * heightAlignment);
    }

    /* renamed from: j */
    public final MediaCodecInfo.CodecProfileLevel[] m20368j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26764f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
