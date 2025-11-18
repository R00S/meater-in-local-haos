package androidx.media3.exoplayer.mediacodec;

import U1.s;
import U1.z;
import X1.C1808e;
import X1.L;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l8.C3910c;
import m8.AbstractC4009y;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<b, List<j>> f27333a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static int f27334b = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f27335a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27336b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27337c;

        public b(String str, boolean z10, boolean z11) {
            this.f27335a = str;
            this.f27336b = z10;
            this.f27337c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f27335a, bVar.f27335a) && this.f27336b == bVar.f27336b && this.f27337c == bVar.f27337c;
        }

        public int hashCode() {
            return ((((this.f27335a.hashCode() + 31) * 31) + (this.f27336b ? 1231 : 1237)) * 31) + (this.f27337c ? 1231 : 1237);
        }
    }

    private interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f27338a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f27339b;

        public e(boolean z10, boolean z11) {
            this.f27338a = (z10 || z11) ? 1 : 0;
        }

        private void f() {
            if (this.f27339b == null) {
                this.f27339b = new MediaCodecList(this.f27338a).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            f();
            return this.f27339b[i10];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f27339b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int A(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static <T> void B(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.A(fVar, obj, obj2);
            }
        });
    }

    private static void d(String str, List<j> list) {
        if ("audio/raw".equals(str)) {
            if (L.f18626a < 26 && L.f18627b.equals("R9") && list.size() == 1 && list.get(0).f27394a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(j.B("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            B(list, new f() { // from class: androidx.media3.exoplayer.mediacodec.m
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.y((j) obj);
                }
            });
        }
        if (L.f18626a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f27394a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static String e(s sVar) {
        Pair<Integer, Integer> pairH;
        if ("audio/eac3-joc".equals(sVar.f17162o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(sVar.f17162o) && (pairH = h(sVar)) != null) {
            int iIntValue = ((Integer) pairH.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(sVar.f17162o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<j> f(l lVar, s sVar, boolean z10, boolean z11) {
        String strE = e(sVar);
        return strE == null ? AbstractC4009y.G() : lVar.a(strE, z10, z11);
    }

    private static String g(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> h(s sVar) {
        return C1808e.n(sVar);
    }

    public static j i(String str, boolean z10, boolean z11) {
        List<j> listJ = j(str, z10, z11);
        if (listJ.isEmpty()) {
            return null;
        }
        return listJ.get(0);
    }

    public static synchronized List<j> j(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<j>> map = f27333a;
            List<j> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<j> arrayListK = k(bVar, new e(z10, z11));
            if (z10 && arrayListK.isEmpty() && L.f18626a <= 23) {
                arrayListK = k(bVar, new d());
                if (!arrayListK.isEmpty()) {
                    X1.n.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListK.get(0).f27394a);
                }
            }
            d(str, arrayListK);
            AbstractC4009y abstractC4009yB = AbstractC4009y.B(arrayListK);
            map.put(bVar, abstractC4009yB);
            return abstractC4009yB;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0124, B:8:0x002d, B:11:0x0038, B:55:0x00fd, B:58:0x0105, B:60:0x010b, B:64:0x0130, B:65:0x0153), top: B:71:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.j> k(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b r24, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.k(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    public static List<j> l(l lVar, s sVar, boolean z10, boolean z11) {
        List<j> listA = lVar.a(sVar.f17162o, z10, z11);
        return AbstractC4009y.y().j(listA).j(f(lVar, sVar, z10, z11)).k();
    }

    public static List<j> m(List<j> list, final s sVar) {
        ArrayList arrayList = new ArrayList(list);
        B(arrayList, new f() { // from class: androidx.media3.exoplayer.mediacodec.n
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.z(sVar, (j) obj);
            }
        });
        return arrayList;
    }

    public static j n() {
        return i("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> o(s sVar) {
        String strH = Y1.e.h(sVar.f17165r);
        if (strH == null) {
            return null;
        }
        return C1808e.q(strH, L.l1(strH.trim(), "\\."), sVar.f17136C);
    }

    private static boolean p(MediaCodecInfo mediaCodecInfo) {
        return L.f18626a >= 29 && q(mediaCodecInfo);
    }

    private static boolean q(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = L.f18626a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(L.f18628c))) {
            String str3 = L.f18627b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo, String str) {
        return L.f18626a >= 29 ? t(mediaCodecInfo) : !u(mediaCodecInfo, str);
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        if (L.f18626a >= 29) {
            return v(mediaCodecInfo);
        }
        if (z.o(str)) {
            return true;
        }
        String strE = C3910c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        if (strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) {
            return true;
        }
        return (strE.startsWith("omx.") || strE.startsWith("c2.")) ? false : true;
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        if (L.f18626a >= 29) {
            return x(mediaCodecInfo);
        }
        String strE = C3910c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int y(j jVar) {
        String str = jVar.f27394a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (L.f18626a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int z(s sVar, j jVar) {
        return jVar.m(sVar) ? 1 : 0;
    }
}
