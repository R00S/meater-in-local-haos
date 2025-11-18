package i1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.apptionlabs.meater_app.data.Temperature;
import e1.C3125g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public class e {

    /* compiled from: FontResourcesParserCompat.java */
    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f43000a;

        public c(d[] dVarArr) {
            this.f43000a = dVarArr;
        }

        public d[] a() {
            return this.f43000a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f43001a;

        /* renamed from: b, reason: collision with root package name */
        private final int f43002b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f43003c;

        /* renamed from: d, reason: collision with root package name */
        private final String f43004d;

        /* renamed from: e, reason: collision with root package name */
        private final int f43005e;

        /* renamed from: f, reason: collision with root package name */
        private final int f43006f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f43001a = str;
            this.f43002b = i10;
            this.f43003c = z10;
            this.f43004d = str2;
            this.f43005e = i11;
            this.f43006f = i12;
        }

        public String a() {
            return this.f43001a;
        }

        public int b() {
            return this.f43006f;
        }

        public int c() {
            return this.f43005e;
        }

        public String d() {
            return this.f43004d;
        }

        public int e() {
            return this.f43002b;
        }

        public boolean f() {
            return this.f43003c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: i1.e$e, reason: collision with other inner class name */
    public static final class C0544e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final o1.e f43007a;

        /* renamed from: b, reason: collision with root package name */
        private final o1.e f43008b;

        /* renamed from: c, reason: collision with root package name */
        private final int f43009c;

        /* renamed from: d, reason: collision with root package name */
        private final int f43010d;

        /* renamed from: e, reason: collision with root package name */
        private final String f43011e;

        public C0544e(o1.e eVar, o1.e eVar2, int i10, int i11, String str) {
            this.f43007a = eVar;
            this.f43008b = eVar2;
            this.f43010d = i10;
            this.f43009c = i11;
            this.f43011e = str;
        }

        public o1.e a() {
            return this.f43008b;
        }

        public int b() {
            return this.f43010d;
        }

        public o1.e c() {
            return this.f43007a;
        }

        public String d() {
            return this.f43011e;
        }

        public int e() {
            return this.f43009c;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3125g.f40050h);
        String string = typedArrayObtainAttributes.getString(C3125g.f40051i);
        String string2 = typedArrayObtainAttributes.getString(C3125g.f40056n);
        String string3 = typedArrayObtainAttributes.getString(C3125g.f40057o);
        String string4 = typedArrayObtainAttributes.getString(C3125g.f40053k);
        int resourceId = typedArrayObtainAttributes.getResourceId(C3125g.f40052j, 0);
        int integer = typedArrayObtainAttributes.getInteger(C3125g.f40054l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C3125g.f40055m, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
        String string5 = typedArrayObtainAttributes.getString(C3125g.f40058p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C0544e(new o1.e(string, string2, string3, listC), string4 != null ? new o1.e(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3125g.f40059q);
        int i10 = C3125g.f40068z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = C3125g.f40061s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = C3125g.f40066x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = C3125g.f40062t;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = C3125g.f40026A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = C3125g.f40063u;
        }
        int i14 = C3125g.f40067y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = C3125g.f40064v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = C3125g.f40065w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = C3125g.f40060r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
