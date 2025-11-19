package D2;

import D2.c;
import X1.M;
import X1.n;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.io.StringReader;
import m8.AbstractC4009y;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3368a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f3369b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f3370c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            n.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!M.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        AbstractC4009y<c.a> abstractC4009yG = AbstractC4009y.G();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (M.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                abstractC4009yG = c(xmlPullParserNewPullParser);
            } else if (M.f(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC4009yG = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (M.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC4009yG = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!M.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC4009yG.isEmpty()) {
            return null;
        }
        return new c(jE, abstractC4009yG);
    }

    private static AbstractC4009y<c.a> c(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f3370c) {
            String strA = M.a(xmlPullParser, str);
            if (strA != null) {
                return AbstractC4009y.I(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return AbstractC4009y.G();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f3368a) {
            String strA = M.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f3369b) {
            String strA = M.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static AbstractC4009y<c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (M.f(xmlPullParser, str3)) {
                String strA = M.a(xmlPullParser, str2 + ":Mime");
                String strA2 = M.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = M.a(xmlPullParser, str2 + ":Length");
                String strA4 = M.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return AbstractC4009y.G();
                }
                aVarY.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!M.d(xmlPullParser, str4));
        return aVarY.k();
    }
}
