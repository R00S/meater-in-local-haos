package androidx.media3.exoplayer.mediacodec;

import U1.C1733i;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d2.C3031c;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f27394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27395b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27396c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f27397d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27398e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27399f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27400g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27401h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27402i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27403j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27404k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f27405l;

    j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f27394a = (String) C1804a.e(str);
        this.f27395b = str2;
        this.f27396c = str3;
        this.f27397d = codecCapabilities;
        this.f27401h = z10;
        this.f27402i = z11;
        this.f27403j = z12;
        this.f27398e = z13;
        this.f27399f = z14;
        this.f27400g = z15;
        this.f27404k = z16;
        this.f27405l = z.s(str2);
    }

    private static boolean A(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(L.f18627b)) ? false : true;
    }

    public static j B(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new j(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || y(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && r(codecCapabilities)), l(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((L.f18626a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        X1.n.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(L.k(i10, widthAlignment) * widthAlignment, L.k(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i10 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean k(s sVar, boolean z10) {
        Pair<Integer, Integer> pairH = MediaCodecUtil.h(sVar);
        String str = sVar.f17162o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strT = z.t(this.f27396c);
            if (strT.equals("video/mv-hevc")) {
                return true;
            }
            if (strT.equals("video/hevc")) {
                pairH = MediaCodecUtil.o(sVar);
            }
        }
        if (pairH == null) {
            return true;
        }
        int iIntValue = ((Integer) pairH.first).intValue();
        int iIntValue2 = ((Integer) pairH.second).intValue();
        if ("video/dolby-vision".equals(sVar.f17162o)) {
            if (!"video/avc".equals(this.f27395b)) {
                iIntValue = "video/hevc".equals(this.f27395b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f27405l && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (L.f18626a <= 23 && "video/x-vnd.on2.vp9".equals(this.f27395b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.f27397d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !z(this.f27395b, iIntValue))) {
                return true;
            }
        }
        v("codec.profileLevel, " + sVar.f17158k + ", " + this.f27396c);
        return false;
    }

    private static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return L.f18626a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface");
    }

    private boolean p(s sVar) {
        return this.f27395b.equals(sVar.f17162o) || this.f27395b.equals(MediaCodecUtil.e(sVar));
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String str) {
        X1.n.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f27394a + ", " + this.f27395b + "] [" + L.f18630e + "]");
    }

    private void v(String str) {
        X1.n.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f27394a + ", " + this.f27395b + "] [" + L.f18630e + "]");
    }

    private static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean x(String str) {
        return L.f18629d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean y(String str) {
        if (L.f18626a <= 22) {
            String str2 = L.f18629d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean z(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = L.f18627b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27397d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C3031c e(s sVar, s sVar2) {
        int i10 = !L.d(sVar.f17162o, sVar2.f17162o) ? 8 : 0;
        if (this.f27405l) {
            if (sVar.f17172y != sVar2.f17172y) {
                i10 |= 1024;
            }
            if (!this.f27398e && (sVar.f17169v != sVar2.f17169v || sVar.f17170w != sVar2.f17170w)) {
                i10 |= 512;
            }
            if ((!C1733i.h(sVar.f17136C) || !C1733i.h(sVar2.f17136C)) && !L.d(sVar.f17136C, sVar2.f17136C)) {
                i10 |= 2048;
            }
            if (x(this.f27394a) && !sVar.f(sVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C3031c(this.f27394a, sVar, sVar2, sVar.f(sVar2) ? 3 : 2, 0);
            }
        } else {
            if (sVar.f17137D != sVar2.f17137D) {
                i10 |= 4096;
            }
            if (sVar.f17138E != sVar2.f17138E) {
                i10 |= 8192;
            }
            if (sVar.f17139F != sVar2.f17139F) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f27395b)) {
                Pair<Integer, Integer> pairH = MediaCodecUtil.h(sVar);
                Pair<Integer, Integer> pairH2 = MediaCodecUtil.h(sVar2);
                if (pairH != null && pairH2 != null) {
                    int iIntValue = ((Integer) pairH.first).intValue();
                    int iIntValue2 = ((Integer) pairH2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C3031c(this.f27394a, sVar, sVar2, 3, 0);
                    }
                }
            }
            if (!sVar.f(sVar2)) {
                i10 |= 32;
            }
            if (w(this.f27395b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C3031c(this.f27394a, sVar, sVar2, 1, 0);
            }
        }
        return new C3031c(this.f27394a, sVar, sVar2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27397d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27397d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        }
        if (a(this.f27394a, this.f27395b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        v("channelCount.support, " + i10);
        return false;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27397d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        v("sampleRate.support, " + i10);
        return false;
    }

    public boolean m(s sVar) {
        return p(sVar) && k(sVar, false);
    }

    public boolean n(s sVar) {
        int i10;
        if (!p(sVar) || !k(sVar, true)) {
            return false;
        }
        if (this.f27405l) {
            int i11 = sVar.f17169v;
            if (i11 <= 0 || (i10 = sVar.f17170w) <= 0) {
                return true;
            }
            return t(i11, i10, sVar.f17171x);
        }
        int i12 = sVar.f17138E;
        if (i12 != -1 && !j(i12)) {
            return false;
        }
        int i13 = sVar.f17137D;
        return i13 == -1 || i(i13);
    }

    public boolean o() {
        if (L.f18626a >= 29 && "video/x-vnd.on2.vp9".equals(this.f27395b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(s sVar) {
        if (this.f27405l) {
            return this.f27398e;
        }
        Pair<Integer, Integer> pairH = MediaCodecUtil.h(sVar);
        return pairH != null && ((Integer) pairH.first).intValue() == 42;
    }

    public boolean t(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27397d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (L.f18626a >= 29) {
            int iC = k.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                v("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !A(this.f27394a) || !d(videoCapabilities, i11, i10, d10)) {
                v("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            u("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }

    public String toString() {
        return this.f27394a;
    }
}
