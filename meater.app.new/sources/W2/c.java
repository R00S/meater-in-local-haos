package W2;

import X1.C1804a;
import X1.L;
import X1.n;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.f;

/* compiled from: SsaStyle.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f18367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18368b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18369c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18370d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18371e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18372f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18373g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18374h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18375i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18376j;

    /* compiled from: SsaStyle.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18377a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18378b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18379c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18380d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18381e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18382f;

        /* renamed from: g, reason: collision with root package name */
        public final int f18383g;

        /* renamed from: h, reason: collision with root package name */
        public final int f18384h;

        /* renamed from: i, reason: collision with root package name */
        public final int f18385i;

        /* renamed from: j, reason: collision with root package name */
        public final int f18386j;

        /* renamed from: k, reason: collision with root package name */
        public final int f18387k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f18377a = i10;
            this.f18378b = i11;
            this.f18379c = i12;
            this.f18380d = i13;
            this.f18381e = i14;
            this.f18382f = i15;
            this.f18383g = i16;
            this.f18384h = i17;
            this.f18385i = i18;
            this.f18386j = i19;
            this.f18387k = i20;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static W2.c.a a(java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.c.a.a(java.lang.String):W2.c$a");
        }
    }

    /* compiled from: SsaStyle.java */
    static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f18388c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f18389d = Pattern.compile(L.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f18390e = Pattern.compile(L.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f18391f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f18392a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f18393b;

        private b(int i10, PointF pointF) {
            this.f18392a = i10;
            this.f18393b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f18391f.matcher(str);
            if (matcher.find()) {
                return c.e((String) C1804a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f18388c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) C1804a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f18389d.matcher(str);
            Matcher matcher2 = f18390e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    n.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C1804a.e(strGroup)).trim()), Float.parseFloat(((String) C1804a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f18388c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f18367a = str;
        this.f18368b = i10;
        this.f18369c = num;
        this.f18370d = num2;
        this.f18371e = f10;
        this.f18372f = z10;
        this.f18373g = z11;
        this.f18374h = z12;
        this.f18375i = z13;
        this.f18376j = i11;
    }

    public static c b(String str, a aVar) {
        C1804a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f18387k;
        if (length != i10) {
            n.h("SsaStyle", L.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f18377a].trim();
            int i11 = aVar.f18378b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f18379c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f18380d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f18381e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f18382f;
            boolean z10 = i15 != -1 && f(strArrSplit[i15].trim());
            int i16 = aVar.f18383g;
            boolean z11 = i16 != -1 && f(strArrSplit[i16].trim());
            int i17 = aVar.f18384h;
            boolean z12 = i17 != -1 && f(strArrSplit[i17].trim());
            int i18 = aVar.f18385i;
            boolean z13 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f18386j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z12, z13, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            n.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        n.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            n.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        n.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C1804a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((j10 >> 24) & 255) ^ 255), f.d(j10 & 255), f.d((j10 >> 8) & 255), f.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            n.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            n.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
