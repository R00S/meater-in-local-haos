package U1;

import X1.C1804a;
import android.text.TextUtils;
import com.apptionlabs.meater_app.data.Temperature;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;

/* compiled from: MimeTypes.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f17473a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f17474b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f17475a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17476b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17477c;
    }

    /* compiled from: MimeTypes.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17478a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17479b;

        public b(int i10, int i11) {
            this.f17478a = i10;
            this.f17479b = i11;
        }

        public int a() {
            int i10 = this.f17479b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarI;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarI = i(str2)) != null) {
                    int iA = bVarI.a();
                    if (iA == 0 || iA == 16) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : X1.L.n1(str)) {
            String strG = g(str2);
            if (strG != null && o(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrN1 = X1.L.n1(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : strArrN1) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f17473a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f17473a.get(i10);
            if (str.startsWith(aVar.f17476b)) {
                return aVar.f17475a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b bVarI;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return bVarI.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b bVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strE = C3910c.e(str.trim());
        if (strE.startsWith("avc1") || strE.startsWith("avc3")) {
            return "video/avc";
        }
        if (strE.startsWith("hev1") || strE.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strE.startsWith("dvav") || strE.startsWith("dva1") || strE.startsWith("dvhe") || strE.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strE.startsWith("av01")) {
            return "video/av01";
        }
        if (strE.startsWith("vp9") || strE.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strE.startsWith("vp8") || strE.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strE.startsWith("mp4a")) {
            return strE.startsWith("mha1") ? "audio/mha1" : strE.startsWith("mhm1") ? "audio/mhm1" : (strE.startsWith("ac-3") || strE.startsWith("dac3")) ? "audio/ac3" : (strE.startsWith("ec-3") || strE.startsWith("dec3")) ? "audio/eac3" : strE.startsWith("ec+3") ? "audio/eac3-joc" : (strE.startsWith("ac-4") || strE.startsWith("dac4")) ? "audio/ac4" : strE.startsWith("dtsc") ? "audio/vnd.dts" : strE.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strE.startsWith("dtsh") || strE.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strE.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strE.startsWith("opus") ? "audio/opus" : strE.startsWith("vorbis") ? "audio/vorbis" : strE.startsWith("flac") ? "audio/flac" : strE.startsWith("stpp") ? "application/ttml+xml" : strE.startsWith("wvtt") ? "text/vtt" : strE.contains("cea708") ? "application/cea-708" : (strE.contains("eia608") || strE.contains("cea608")) ? "application/cea-608" : e(strE);
        }
        if (strE.startsWith("mp4a.") && (bVarI = i(strE)) != null) {
            strH = h(bVarI.f17478a);
        }
        return strH == null ? "audio/mp4a-latm" : strH;
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case Temperature.MAX_INTERNAL_PROBE /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case Temperature.MAX_INTERNAL_SECOND_GEN_PROBE /* 105 */:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b i(String str) {
        Matcher matcher = f17474b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C1804a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String j(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if (p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    private static int l(String str) {
        int size = f17473a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f17473a.get(i10);
            if (str.equals(aVar.f17475a)) {
                return aVar.f17477c;
            }
        }
        return -1;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : X1.L.n1(str)) {
            String strG = g(str2);
            if (strG != null && s(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(j(str));
    }

    public static String t(String str) {
        String strE;
        if (str == null) {
            return null;
        }
        strE = C3910c.e(str);
        strE.hashCode();
        switch (strE) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strE;
        }
    }
}
