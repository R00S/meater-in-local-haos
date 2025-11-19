package androidx.media3.exoplayer.mediacodec;

import U1.s;
import X1.L;
import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f27406a;

    /* compiled from: MediaCodecPerformancePointCoverageProvider.java */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            k2.k.a();
            int iC = c(supportedPerformancePoints, k2.j.a(i10, i11, (int) d10));
            if (iC == 1 && k.f27406a == null) {
                Boolean unused = k.f27406a = Boolean.valueOf(d());
                if (k.f27406a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z10) {
            List supportedPerformancePoints;
            try {
                s sVarM = new s.b().s0("video/avc").M();
                if (sVarM.f17162o != null) {
                    List<j> listL = MediaCodecUtil.l(l.f27407a, sVarM, z10, false);
                    for (int i10 = 0; i10 < listL.size(); i10++) {
                        if (listL.get(i10).f27397d != null && listL.get(i10).f27397d.getVideoCapabilities() != null && (supportedPerformancePoints = listL.get(i10).f27397d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            k2.k.a();
                            return c(supportedPerformancePoints, k2.j.a(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (k2.m.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (L.f18626a >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            return iB2 == 0 ? iB != 2 : (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (L.f18626a < 29) {
            return 0;
        }
        Boolean bool = f27406a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
