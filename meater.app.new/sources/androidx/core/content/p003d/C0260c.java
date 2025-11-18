package androidx.core.content.p003d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p052i.C0922d;
import p024c.p052i.p057h.C0941d;

/* compiled from: FontResourcesParserCompat.java */
/* renamed from: androidx.core.content.d.c */
/* loaded from: classes.dex */
public class C0260c {

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.d.c$a */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.d.c$b */
    public static final class b implements a {

        /* renamed from: a */
        private final c[] f2197a;

        public b(c[] cVarArr) {
            this.f2197a = cVarArr;
        }

        /* renamed from: a */
        public c[] m1730a() {
            return this.f2197a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.d.c$c */
    public static final class c {

        /* renamed from: a */
        private final String f2198a;

        /* renamed from: b */
        private int f2199b;

        /* renamed from: c */
        private boolean f2200c;

        /* renamed from: d */
        private String f2201d;

        /* renamed from: e */
        private int f2202e;

        /* renamed from: f */
        private int f2203f;

        public c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.f2198a = str;
            this.f2199b = i2;
            this.f2200c = z;
            this.f2201d = str2;
            this.f2202e = i3;
            this.f2203f = i4;
        }

        /* renamed from: a */
        public String m1731a() {
            return this.f2198a;
        }

        /* renamed from: b */
        public int m1732b() {
            return this.f2203f;
        }

        /* renamed from: c */
        public int m1733c() {
            return this.f2202e;
        }

        /* renamed from: d */
        public String m1734d() {
            return this.f2201d;
        }

        /* renamed from: e */
        public int m1735e() {
            return this.f2199b;
        }

        /* renamed from: f */
        public boolean m1736f() {
            return this.f2200c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.d.c$d */
    public static final class d implements a {

        /* renamed from: a */
        private final C0941d f2204a;

        /* renamed from: b */
        private final int f2205b;

        /* renamed from: c */
        private final int f2206c;

        /* renamed from: d */
        private final String f2207d;

        public d(C0941d c0941d, int i2, int i3, String str) {
            this.f2204a = c0941d;
            this.f2206c = i2;
            this.f2205b = i3;
            this.f2207d = str;
        }

        /* renamed from: a */
        public int m1737a() {
            return this.f2206c;
        }

        /* renamed from: b */
        public C0941d m1738b() {
            return this.f2204a;
        }

        /* renamed from: c */
        public String m1739c() {
            return this.f2207d;
        }

        /* renamed from: d */
        public int m1740d() {
            return this.f2205b;
        }
    }

    /* renamed from: a */
    private static int m1722a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static a m1723b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1725d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m1724c(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1722a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1729h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1729h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static a m1725d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1726e(xmlPullParser, resources);
        }
        m1728g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static a m1726e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0922d.f6260f);
        String string = typedArrayObtainAttributes.getString(C0922d.f6261g);
        String string2 = typedArrayObtainAttributes.getString(C0922d.f6265k);
        String string3 = typedArrayObtainAttributes.getString(C0922d.f6266l);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0922d.f6262h, 0);
        int integer = typedArrayObtainAttributes.getInteger(C0922d.f6263i, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C0922d.f6264j, 500);
        String string4 = typedArrayObtainAttributes.getString(C0922d.f6267m);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m1728g(xmlPullParser);
            }
            return new d(new C0941d(string, string2, string3, m1724c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m1727f(xmlPullParser, resources));
                } else {
                    m1728g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: f */
    private static c m1727f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0922d.f6268n);
        int i2 = C0922d.f6277w;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = C0922d.f6270p;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = C0922d.f6275u;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = C0922d.f6271q;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = C0922d.f6278x;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = C0922d.f6272r;
        }
        int i6 = C0922d.f6276v;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = C0922d.f6273s;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = C0922d.f6274t;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = C0922d.f6269o;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1728g(xmlPullParser);
        }
        return new c(string2, i3, z, string, i7, resourceId);
    }

    /* renamed from: g */
    private static void m1728g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m1729h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
