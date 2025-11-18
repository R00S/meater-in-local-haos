package Y2;

import S2.i;
import S2.k;
import S2.r;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.M;
import X1.n;
import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: TtmlParser.java */
/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f19338b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f19339c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f19340d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f19341e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f19342f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f19343g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f19344h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final a f19345i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f19346a;

    /* compiled from: TtmlParser.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final float f19347a;

        /* renamed from: b, reason: collision with root package name */
        final int f19348b;

        /* renamed from: c, reason: collision with root package name */
        final int f19349c;

        a(float f10, int i10, int i11) {
            this.f19347a = f10;
            this.f19348b = i10;
            this.f19349c = i11;
        }
    }

    /* compiled from: TtmlParser.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f19350a;

        /* renamed from: b, reason: collision with root package name */
        final int f19351b;

        b(int i10, int i11) {
            this.f19350a = i10;
            this.f19351b = i11;
        }
    }

    public d() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f19346a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g e(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment g(String str) {
        String strE = C3910c.e(str);
        strE.hashCode();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int h(XmlPullParser xmlPullParser, int i10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f19344h.matcher(attributeValue);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) C1804a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) C1804a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            C1804a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            n.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void i(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2;
        String[] strArrL1 = L.l1(str, "\\s+");
        if (strArrL1.length == 1) {
            matcher = f19340d.matcher(str);
        } else {
            if (strArrL1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrL1.length + ".");
            }
            matcher = f19340d.matcher(strArrL1[1]);
            n.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) C1804a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) C1804a.e(matcher.group(1))));
    }

    private static a j(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            C1804a.b(L.l1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f19345i;
        int i11 = aVar.f19348b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f19349c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map<String, g> k(XmlPullParser xmlPullParser, Map<String, g> map, int i10, b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "style")) {
                String strA = M.a(xmlPullParser, "style");
                g gVarP = p(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : q(strA)) {
                        gVarP.a(map.get(str));
                    }
                }
                String strG = gVarP.g();
                if (strG != null) {
                    map.put(strG, gVarP);
                }
            } else if (M.f(xmlPullParser, "region")) {
                e eVarN = n(xmlPullParser, i10, bVar);
                if (eVarN != null) {
                    map2.put(eVarN.f19352a, eVarN);
                }
            } else if (M.f(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!M.d(xmlPullParser, "head"));
        return map;
    }

    private static void l(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "image") && (strA = M.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!M.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y2.c m(org.xmlpull.v1.XmlPullParser r20, Y2.c r21, java.util.Map<java.lang.String, Y2.e> r22, Y2.d.a r23) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.d.m(org.xmlpull.v1.XmlPullParser, Y2.c, java.util.Map, Y2.d$a):Y2.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y2.e n(org.xmlpull.v1.XmlPullParser r18, int r19, Y2.d.b r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.d.n(org.xmlpull.v1.XmlPullParser, int, Y2.d$b):Y2.e");
    }

    private static float o(String str) {
        Matcher matcher = f19341e.matcher(str);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C1804a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            n.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y2.g p(org.xmlpull.v1.XmlPullParser r13, Y2.g r14) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.d.p(org.xmlpull.v1.XmlPullParser, Y2.g):Y2.g");
    }

    private static String[] q(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : L.l1(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long r(java.lang.String r13, Y2.d.a r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.d.r(java.lang.String, Y2.d$a):long");
    }

    private static b s(XmlPullParser xmlPullParser) {
        String strA = M.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f19343g.matcher(strA);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) C1804a.e(matcher.group(1))), Integer.parseInt((String) C1804a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            n.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // S2.r
    public k a(byte[] bArr, int i10, int i11) throws XmlPullParserException, NumberFormatException, IOException {
        char c10;
        a aVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f19346a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            b bVarS = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVarJ = f19345i;
            h hVar = null;
            int i12 = 0;
            int iH = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarJ = j(xmlPullParserNewPullParser);
                            c10 = 15;
                            iH = h(xmlPullParserNewPullParser, 15);
                            bVarS = s(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        b bVar = bVarS;
                        a aVar2 = aVarJ;
                        int i13 = iH;
                        if (f(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar2;
                                k(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                aVar = aVar2;
                                try {
                                    c cVarM = m(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarM);
                                    if (cVar != null) {
                                        cVar.a(cVarM);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    n.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            aVarJ = aVar;
                            bVarS = bVar;
                            iH = i13;
                        } else {
                            n.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i12++;
                            aVarJ = aVar2;
                            bVarS = bVar;
                            iH = i13;
                        }
                    } else if (eventType == 4) {
                        ((c) C1804a.e(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((c) C1804a.e((c) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) C1804a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<S2.e> interfaceC1811h) {
        i.c(a(bArr, i10, i11), bVar, interfaceC1811h);
    }

    @Override // S2.r
    public int d() {
        return 1;
    }
}
