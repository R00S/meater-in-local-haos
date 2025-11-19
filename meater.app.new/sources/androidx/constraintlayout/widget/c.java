package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f24057a;

    /* renamed from: b, reason: collision with root package name */
    d f24058b;

    /* renamed from: c, reason: collision with root package name */
    int f24059c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f24060d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f24061e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f24062f = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f24063a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f24064b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f24065c;

        /* renamed from: d, reason: collision with root package name */
        d f24066d;

        a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f24065c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f24351P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24359Q6) {
                    this.f24063a = typedArrayObtainStyledAttributes.getResourceId(index, this.f24063a);
                } else if (index == i.f24367R6) {
                    this.f24065c = typedArrayObtainStyledAttributes.getResourceId(index, this.f24065c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f24065c);
                    context.getResources().getResourceName(this.f24065c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f24066d = dVar;
                        dVar.e(context, this.f24065c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f24064b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f24064b.size(); i10++) {
                if (this.f24064b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f24067a;

        /* renamed from: b, reason: collision with root package name */
        float f24068b;

        /* renamed from: c, reason: collision with root package name */
        float f24069c;

        /* renamed from: d, reason: collision with root package name */
        float f24070d;

        /* renamed from: e, reason: collision with root package name */
        int f24071e;

        /* renamed from: f, reason: collision with root package name */
        d f24072f;

        b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f24067a = Float.NaN;
            this.f24068b = Float.NaN;
            this.f24069c = Float.NaN;
            this.f24070d = Float.NaN;
            this.f24071e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f24512i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24521j7) {
                    this.f24071e = typedArrayObtainStyledAttributes.getResourceId(index, this.f24071e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f24071e);
                    context.getResources().getResourceName(this.f24071e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f24072f = dVar;
                        dVar.e(context, this.f24071e);
                    }
                } else if (index == i.f24530k7) {
                    this.f24070d = typedArrayObtainStyledAttributes.getDimension(index, this.f24070d);
                } else if (index == i.f24539l7) {
                    this.f24068b = typedArrayObtainStyledAttributes.getDimension(index, this.f24068b);
                } else if (index == i.f24548m7) {
                    this.f24069c = typedArrayObtainStyledAttributes.getDimension(index, this.f24069c);
                } else if (index == i.f24557n7) {
                    this.f24067a = typedArrayObtainStyledAttributes.getDimension(index, this.f24067a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f24067a) && f10 < this.f24067a) {
                return false;
            }
            if (!Float.isNaN(this.f24068b) && f11 < this.f24068b) {
                return false;
            }
            if (Float.isNaN(this.f24069c) || f10 <= this.f24069c) {
                return Float.isNaN(this.f24070d) || f11 <= this.f24070d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f24057a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r11, int r12) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r12)
            int r3 = r2.getEventType()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = 0
        L11:
            r5 = 1
            if (r3 == r5) goto Lab
            r6 = 2
            if (r3 == r6) goto L19
            goto L81
        L19:
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r7 = r3.hashCode()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L40;
                case 1657696882: goto L36;
                case 1901439077: goto L27;
                default: goto L26;
            }     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
        L26:
            goto L5d
        L27:
            java.lang.String r5 = "Variant"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r9
            goto L5e
        L31:
            r11 = move-exception
            goto L86
        L33:
            r11 = move-exception
            goto L99
        L36:
            java.lang.String r5 = "layoutDescription"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = 0
            goto L5e
        L40:
            java.lang.String r7 = "StateSet"
            boolean r3 = r3.equals(r7)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            goto L5e
        L49:
            java.lang.String r5 = "State"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r6
            goto L5e
        L53:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = -1
        L5e:
            if (r5 == r6) goto L74
            if (r5 == r9) goto L69
            if (r5 == r8) goto L65
            goto L81
        L65:
            r10.b(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L69:
            androidx.constraintlayout.widget.c$b r3 = new androidx.constraintlayout.widget.c$b     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r4 == 0) goto L81
            r4.a(r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L74:
            androidx.constraintlayout.widget.c$a r3 = new androidx.constraintlayout.widget.c$a     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            android.util.SparseArray<androidx.constraintlayout.widget.c$a> r4 = r10.f24061e     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r5 = r3.f24063a     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4.put(r5, r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = r3
        L81:
            int r3 = r2.next()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L11
        L86:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
            goto Lab
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f24062f.put(identifier, dVar);
                return;
            }
        }
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f24059c;
        if (i11 == i10) {
            a aVarValueAt = i10 == -1 ? this.f24061e.valueAt(0) : this.f24061e.get(i11);
            int i12 = this.f24060d;
            if ((i12 == -1 || !aVarValueAt.f24064b.get(i12).a(f10, f11)) && this.f24060d != (iB = aVarValueAt.b(f10, f11))) {
                d dVar = iB == -1 ? this.f24058b : aVarValueAt.f24064b.get(iB).f24072f;
                if (iB != -1) {
                    int i13 = aVarValueAt.f24064b.get(iB).f24071e;
                }
                if (dVar == null) {
                    return;
                }
                this.f24060d = iB;
                dVar.c(this.f24057a);
                return;
            }
            return;
        }
        this.f24059c = i10;
        a aVar = this.f24061e.get(i10);
        int iB2 = aVar.b(f10, f11);
        d dVar2 = iB2 == -1 ? aVar.f24066d : aVar.f24064b.get(iB2).f24072f;
        if (iB2 != -1) {
            int i14 = aVar.f24064b.get(iB2).f24071e;
        }
        if (dVar2 != null) {
            this.f24060d = iB2;
            dVar2.c(this.f24057a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }

    public void c(f fVar) {
    }
}
