package h2;

import U1.C1732h;
import U1.C1738n;
import U1.s;
import U1.u;
import U1.z;
import X1.C1804a;
import X1.G;
import X1.L;
import X1.M;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.c;
import h2.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;
import m8.AbstractC4009y;
import m8.H;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DashManifestParser.java */
/* loaded from: classes.dex */
public class d extends DefaultHandler implements c.a<c> {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f42230b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f42231c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f42232d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f42233e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f42234a;

    /* compiled from: DashManifestParser.java */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s f42235a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC4009y<C3486b> f42236b;

        /* renamed from: c, reason: collision with root package name */
        public final k f42237c;

        /* renamed from: d, reason: collision with root package name */
        public final String f42238d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList<C1738n.b> f42239e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f42240f;

        /* renamed from: g, reason: collision with root package name */
        public final long f42241g;

        /* renamed from: h, reason: collision with root package name */
        public final List<e> f42242h;

        /* renamed from: i, reason: collision with root package name */
        public final List<e> f42243i;

        public a(s sVar, List<C3486b> list, k kVar, String str, ArrayList<C1738n.b> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f42235a = sVar;
            this.f42236b = AbstractC4009y.B(list);
            this.f42237c = kVar;
            this.f42238d = str;
            this.f42239e = arrayList;
            this.f42240f = arrayList2;
            this.f42242h = list2;
            this.f42243i = list3;
            this.f42241g = j10;
        }
    }

    public d() {
        try {
            this.f42234a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f42244a) && (str = eVar.f42245b) != null) {
                Matcher matcher = f42231c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                X1.n.h("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f42245b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f42244a) && (str = eVar.f42245b) != null) {
                Matcher matcher = f42232d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                X1.n.h("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f42245b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : L.X0(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", null);
        String strR03 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!M.d(xmlPullParser, str));
        return new e(strR0, strR02, strR03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            r2 = -1
            if (r4 != 0) goto Ld
            return r2
        Ld:
            java.lang.String r4 = l8.C3910c.e(r4)
            r4.hashCode()
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L49;
                case 2937391: goto L3e;
                case 3094034: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = r2
            goto L53
        L1d:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 4
            goto L53
        L28:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = 3
            goto L53
        L33:
            java.lang.String r3 = "f800"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = r0
            goto L53
        L3e:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = r1
            goto L53
        L49:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L52
            goto L1b
        L52:
            r4 = 0
        L53:
            switch(r4) {
                case 0: goto L5f;
                case 1: goto L5e;
                case 2: goto L5c;
                case 3: goto L5a;
                case 4: goto L57;
                default: goto L56;
            }
        L56:
            return r2
        L57:
            r4 = 8
            return r4
        L5a:
            r4 = 6
            return r4
        L5c:
            r4 = 5
            return r4
        L5e:
            return r0
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.J(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int iU = U(xmlPullParser, "value", -1);
        if (iU <= 0 || iU >= 33) {
            return -1;
        }
        return iU;
    }

    protected static int L(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static long M(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : L.Y0(attributeValue);
    }

    protected static String N(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f42244a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f42245b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f42245b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float R(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float S(XmlPullParser xmlPullParser, float f10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f42230b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int i10 = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i10 / Integer.parseInt(r2) : i10;
    }

    protected static int U(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long W(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (C3910c.a("http://dashif.org/guidelines/last-segment-number", eVar.f42244a)) {
                return Long.parseLong(eVar.f42245b);
            }
        }
        return -1L;
    }

    protected static long X(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int Z(XmlPullParser xmlPullParser) {
        int iU = U(xmlPullParser, "value", -1);
        if (iU < 0) {
            return -1;
        }
        int[] iArr = f42233e;
        if (iU < iArr.length) {
            return iArr[iU];
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int iL = i10 >= 0 ? i10 + 1 : (int) L.l(j12 - j10, j11);
        for (int i11 = 0; i11 < iL; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        C1804a.g(i10 == i11);
        return i10;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C1804a.g(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<C1738n.b> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            C1738n.b bVar = arrayList.get(i10);
            if (C1732h.f17049c.equals(bVar.f17092C) && (str = bVar.f17093D) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C1738n.b bVar2 = arrayList.get(i11);
            if (C1732h.f17048b.equals(bVar2.f17092C) && bVar2.f17093D == null) {
                arrayList.set(i11, new C1738n.b(C1732h.f17049c, str, bVar2.f17094E, bVar2.f17095F));
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void s(ArrayList<C1738n.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1738n.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!M.d(xmlPullParser, str));
        return text;
    }

    private static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String u(String str, String str2) {
        if (z.o(str)) {
            return z.c(str2);
        }
        if (z.s(str)) {
            return z.n(str2);
        }
        if (z.r(str) || z.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = z.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (M.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (M.e(xmlPullParser)) {
                    i10++;
                } else if (M.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int A(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r0(r4, r0, r1)
            r0.hashCode()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128649360: goto L56;
                case -1352850286: goto L4b;
                case -1138141449: goto L40;
                case -986633423: goto L35;
                case -79006963: goto L2a;
                case 312179081: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = r1
            goto L60
        L14:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 6
            goto L60
        L1f:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 5
            goto L60
        L2a:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 3
            goto L60
        L40:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L49
            goto L12
        L49:
            r0 = 2
            goto L60
        L4b:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L54
            goto L12
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6e;
                case 3: goto L69;
                case 4: goto L7a;
                case 5: goto L64;
                case 6: goto L6e;
                default: goto L63;
            }
        L63:
            goto L7e
        L64:
            int r1 = L(r4)
            goto L7e
        L69:
            int r1 = Z(r4)
            goto L7e
        L6e:
            int r1 = J(r4)
            goto L7e
        L73:
            java.lang.String r0 = "value"
            int r1 = U(r4, r0, r1)
            goto L7e
        L7a:
            int r1 = K(r4)
        L7e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = X1.M.d(r4, r0)
            if (r0 == 0) goto L7e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.A(org.xmlpull.v1.XmlPullParser):int");
    }

    protected long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List<C3486b> C(XmlPullParser xmlPullParser, List<C3486b> list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strS0 = s0(xmlPullParser, "BaseURL");
        if (G.c(strS0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strS0;
            }
            return H.j(new C3486b(strS0, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            C3486b c3486b = list.get(i12);
            String strE = G.e(c3486b.f42213a, strS0);
            String str = attributeValue3 == null ? strE : attributeValue3;
            if (z10) {
                i10 = c3486b.f42215c;
                i11 = c3486b.f42216d;
                str = c3486b.f42214b;
            }
            arrayList.add(new C3486b(strE, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, U1.C1738n.b> F(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    protected Pair<Long, G2.a> O(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long jX = X(xmlPullParser, "id", 0L);
        long jX2 = X(xmlPullParser, "duration", -9223372036854775807L);
        long jX3 = X(xmlPullParser, "presentationTime", 0L);
        long jD1 = L.d1(jX2, 1000L, j10);
        long jD12 = L.d1(jX3 - j11, 1000000L, j10);
        String strR0 = r0(xmlPullParser, "messageData", null);
        byte[] bArrP = P(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jD12);
        if (strR0 != null) {
            bArrP = L.t0(strR0);
        }
        return Pair.create(lValueOf, d(str, str2, jX, jD1, bArrP));
    }

    protected byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!M.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList;
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", "");
        long jX = X(xmlPullParser, "timescale", 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j11 = jX2;
                j10 = jX2;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, strR0, strR02, jX, j11, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j10 = jX2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (M.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jX2 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        G2.a[] aVarArr = new G2.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (G2.a) pair.second;
        }
        return e(strR0, strR02, jX, jArr, aVarArr);
    }

    protected i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    protected u V(XmlPullParser xmlPullParser) {
        return new u(xmlPullParser.getAttributeValue(null, "lang"), s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6 A[LOOP:0: B:24:0x00a2->B:81:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected h2.c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):h2.c");
    }

    protected Pair<g, Long> a0(XmlPullParser xmlPullParser, List<C3486b> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException, NumberFormatException {
        long j14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j15;
        k kVarL0;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jM = M(xmlPullParser2, "start", j10);
        long j16 = -9223372036854775807L;
        long j17 = j12 != -9223372036854775807L ? j12 + jM : -9223372036854775807L;
        long jM2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jB = j11;
        boolean z11 = false;
        long j18 = -9223372036854775807L;
        k kVarJ0 = null;
        e eVarI = null;
        while (true) {
            xmlPullParser.next();
            if (M.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    jB = dVar.B(xmlPullParser2, jB);
                    z11 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z10));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j15 = j16;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (M.f(xmlPullParser2, "AdaptationSet")) {
                    j14 = jB;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVarJ0, jM2, jB, j18, j17, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j14 = jB;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (M.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (M.f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        kVarJ0 = j0(xmlPullParser2, null);
                        obj = null;
                        jB = j14;
                        j15 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (M.f(xmlPullParser2, "SegmentList")) {
                            long jB2 = B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            kVarL0 = k0(xmlPullParser, null, j17, jM2, j14, jB2, j13);
                            j18 = jB2;
                            jB = j14;
                            j15 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (M.f(xmlPullParser2, "SegmentTemplate")) {
                                long jB3 = B(xmlPullParser2, -9223372036854775807L);
                                j15 = -9223372036854775807L;
                                kVarL0 = l0(xmlPullParser, null, AbstractC4009y.G(), j17, jM2, j14, jB3, j13);
                                j18 = jB3;
                                jB = j14;
                            } else {
                                j15 = -9223372036854775807L;
                                if (M.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVarI = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser);
                                }
                                jB = j14;
                            }
                        }
                        kVarJ0 = kVarL0;
                    }
                }
                obj = null;
                j15 = -9223372036854775807L;
                jB = j14;
            }
            if (M.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, jM, arrayList2, arrayList3, eVarI), Long.valueOf(jM2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j16 = j15;
            dVar = this;
        }
    }

    protected String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected C3485a c(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new C3485a(j10, i10, list, list2, list3, list4);
    }

    protected h c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strR0 = r0(xmlPullParser, "moreInformationURL", null);
        String strR02 = r0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (M.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (M.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str = strNextText3;
            if (M.d(xmlPullParser, "ProgramInformation")) {
                return new h(strNextText, strNextText2, str, strR0, strR02);
            }
            strNextText3 = str;
        }
    }

    protected G2.a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new G2.a(str, str2, j11, j10, bArr);
    }

    protected i d0(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return i(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return i(attributeValue, j10, j11);
    }

    protected f e(String str, String str2, long j10, long[] jArr, G2.a[] aVarArr) {
        return new f(str, str2, j10, jArr, aVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected h2.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<h2.C3486b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<h2.e> r46, java.util.List<h2.e> r47, java.util.List<h2.e> r48, java.util.List<h2.e> r49, h2.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, h2.k, long, long, long, long, long, boolean):h2.d$a");
    }

    protected s f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String strU = u(str2, str5);
        if ("audio/eac3".equals(strU)) {
            strU = N(list4);
            if ("audio/eac3-joc".equals(strU)) {
                str5 = "ec+3";
            }
        }
        int iP0 = p0(list);
        int iI0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair<Integer, Integer> pairT0 = t0(list3);
        s.b bVarI0 = new s.b().e0(str).T(str2).s0(strU).R(str5).n0(i14).u0(iP0).q0(iI0).i0(str3);
        int iE = -1;
        s.b bVarY0 = bVarI0.x0(pairT0 != null ? ((Integer) pairT0.first).intValue() : -1).y0(pairT0 != null ? ((Integer) pairT0.second).intValue() : -1);
        if (z.s(strU)) {
            bVarY0.z0(i10).c0(i11).a0(f10);
        } else if (z.o(strU)) {
            bVarY0.Q(i12).t0(i13);
        } else if (z.r(strU)) {
            if ("application/cea-608".equals(strU)) {
                iE = D(list2);
            } else if ("application/cea-708".equals(strU)) {
                iE = E(list2);
            }
            bVarY0.N(iE);
        } else if (z.p(strU)) {
            bVarY0.z0(i10).c0(i11);
        }
        return bVarY0.M();
    }

    protected int f0(List<e> list) {
        int iU0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (C3910c.a("urn:mpeg:dash:role:2011", eVar.f42244a)) {
                iU0 = g0(eVar.f42245b);
            } else if (C3910c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f42244a)) {
                iU0 = u0(eVar.f42245b);
            }
            i10 |= iU0;
        }
        return i10;
    }

    protected c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected g h(String str, long j10, List<C3485a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    protected int h0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (C3910c.a("http://dashif.org/guidelines/trickmode", list.get(i11).f42244a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    protected i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected int i0(List<e> list) {
        int iG0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (C3910c.a("urn:mpeg:dash:role:2011", eVar.f42244a)) {
                iG0 |= g0(eVar.f42245b);
            }
        }
        return iG0;
    }

    protected j j(a aVar, String str, List<u> list, String str2, ArrayList<C1738n.b> arrayList, ArrayList<e> arrayList2) {
        s.b bVarB = aVar.f42235a.b();
        if (str == null || !list.isEmpty()) {
            bVarB.h0(list);
        } else {
            bVarB.g0(str);
        }
        String str3 = aVar.f42238d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<C1738n.b> arrayList3 = aVar.f42239e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            bVarB.X(new C1738n(str3, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f42240f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f42241g, bVarB.M(), aVar.f42236b, aVar.f42237c, arrayList4, aVar.f42242h, aVar.f42243i, null);
    }

    protected k.e j0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j10;
        long j11;
        long jX = X(xmlPullParser, "timescale", eVar != null ? eVar.f42281b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f42282c : 0L);
        long j12 = eVar != null ? eVar.f42295d : 0L;
        long j13 = eVar != null ? eVar.f42296e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVarT = eVar != null ? eVar.f42280a : null;
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!M.d(xmlPullParser, "SegmentBase"));
        return n(iVarT, jX, jX2, j11, j10);
    }

    protected k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, L.Q0(j15), L.Q0(j16));
    }

    protected k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jX = X(xmlPullParser, "timescale", bVar != null ? bVar.f42281b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f42282c : 0L);
        long jX3 = X(xmlPullParser, "duration", bVar != null ? bVar.f42284e : -9223372036854775807L);
        long jX4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f42283d : 1L);
        long jT = t(j12, j13);
        List<k.d> listM0 = null;
        List<i> arrayList = null;
        i iVarT = null;
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else if (M.f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jX, j11);
            } else if (M.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!M.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarT == null) {
                iVarT = bVar.f42280a;
            }
            if (listM0 == null) {
                listM0 = bVar.f42285f;
            }
            if (arrayList == null) {
                arrayList = bVar.f42289j;
            }
        }
        return k(iVarT, jX, jX2, jX4, jX3, listM0, jT, arrayList, j14, j10);
    }

    protected k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, L.Q0(j16), L.Q0(j17));
    }

    protected k.c l0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jX = X(xmlPullParser, "timescale", cVar != null ? cVar.f42281b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f42282c : 0L);
        long jX3 = X(xmlPullParser, "duration", cVar != null ? cVar.f42284e : -9223372036854775807L);
        long jX4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f42283d : 1L);
        long jW = W(list);
        long jT = t(j12, j13);
        List<k.d> listM0 = null;
        n nVarV0 = v0(xmlPullParser, "media", cVar != null ? cVar.f42291k : null);
        n nVarV02 = v0(xmlPullParser, "initialization", cVar != null ? cVar.f42290j : null);
        i iVarT = null;
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else if (M.f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jX, j11);
            } else {
                w(xmlPullParser);
            }
        } while (!M.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarT == null) {
                iVarT = cVar.f42280a;
            }
            if (listM0 == null) {
                listM0 = cVar.f42285f;
            }
        }
        return l(iVarT, jX, jX2, jX4, jW, jX3, listM0, jT, nVarV02, nVarV0, j14, j10);
    }

    protected k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected List<k.d> m0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jX = -9223372036854775807L;
        boolean z10 = false;
        int iU = 0;
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "S")) {
                long jX2 = X(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    jB = b(arrayList, jB, jX, iU, jX2);
                }
                if (jX2 == -9223372036854775807L) {
                    jX2 = jB;
                }
                jX = X(xmlPullParser, "d", -9223372036854775807L);
                iU = U(xmlPullParser, "r", 0);
                z10 = true;
                jB = jX2;
            } else {
                w(xmlPullParser);
            }
        } while (!M.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, jB, jX, iU, L.d1(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int p0(List<e> list) {
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (C3910c.a("urn:mpeg:dash:role:2011", eVar.f42244a)) {
                iO0 |= o0(eVar.f42245b);
            }
        }
        return iO0;
    }

    protected l q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jX = -9223372036854775807L;
        long jX2 = -9223372036854775807L;
        long jX3 = -9223372036854775807L;
        float fR = -3.4028235E38f;
        float fR2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (M.f(xmlPullParser, "Latency")) {
                jX = X(xmlPullParser, "target", -9223372036854775807L);
                jX2 = X(xmlPullParser, "min", -9223372036854775807L);
                jX3 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (M.f(xmlPullParser, "PlaybackRate")) {
                fR = R(xmlPullParser, "min", -3.4028235E38f);
                fR2 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = jX;
            long j11 = jX2;
            long j12 = jX3;
            float f10 = fR;
            float f11 = fR2;
            if (M.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f10, f11);
            }
            jX = j10;
            jX2 = j11;
            jX3 = j12;
            fR = f10;
            fR2 = f11;
        }
    }

    protected Pair<Integer, Integer> t0(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ((C3910c.a("http://dashif.org/thumbnail_tile", eVar.f42244a) || C3910c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f42244a)) && (str = eVar.f42245b) != null) {
                String[] strArrL1 = L.l1(str, "x");
                if (strArrL1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrL1[0])), Integer.valueOf(Integer.parseInt(strArrL1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    protected int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws XmlPullParserException, ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f42234a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return Y(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.c(null, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0352 A[LOOP:0: B:3:0x007f->B:74:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0310 A[EDGE_INSN: B:75:0x0310->B:68:0x0310 BREAK  A[LOOP:0: B:3:0x007f->B:74:0x0352], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected h2.C3485a y(org.xmlpull.v1.XmlPullParser r57, java.util.List<h2.C3486b> r58, h2.k r59, long r60, long r62, long r64, long r66, long r68, boolean r70) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, h2.k, long, long, long, long, long, boolean):h2.a");
    }

    protected void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }
}
