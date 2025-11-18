package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0215c {

    /* renamed from: a */
    private final ConstraintLayout f1518a;

    /* renamed from: b */
    int f1519b = -1;

    /* renamed from: c */
    int f1520c = -1;

    /* renamed from: d */
    private SparseArray<a> f1521d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0216d> f1522e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$a */
    static class a {

        /* renamed from: a */
        int f1523a;

        /* renamed from: b */
        ArrayList<b> f1524b = new ArrayList<>();

        /* renamed from: c */
        int f1525c;

        /* renamed from: d */
        C0216d f1526d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1525c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0221i.f1686F4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1692G4) {
                    this.f1523a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1523a);
                } else if (index == C0221i.f1698H4) {
                    this.f1525c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1525c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1525c);
                    context.getResources().getResourceName(this.f1525c);
                    if ("layout".equals(resourceTypeName)) {
                        C0216d c0216d = new C0216d();
                        this.f1526d = c0216d;
                        c0216d.m1368e(context, this.f1525c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m1357a(b bVar) {
            this.f1524b.add(bVar);
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    static class b {

        /* renamed from: a */
        float f1527a;

        /* renamed from: b */
        float f1528b;

        /* renamed from: c */
        float f1529c;

        /* renamed from: d */
        float f1530d;

        /* renamed from: e */
        int f1531e;

        /* renamed from: f */
        C0216d f1532f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1527a = Float.NaN;
            this.f1528b = Float.NaN;
            this.f1529c = Float.NaN;
            this.f1530d = Float.NaN;
            this.f1531e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0221i.f1820b5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1827c5) {
                    this.f1531e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1531e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1531e);
                    context.getResources().getResourceName(this.f1531e);
                    if ("layout".equals(resourceTypeName)) {
                        C0216d c0216d = new C0216d();
                        this.f1532f = c0216d;
                        c0216d.m1368e(context, this.f1531e);
                    }
                } else if (index == C0221i.f1834d5) {
                    this.f1530d = typedArrayObtainStyledAttributes.getDimension(index, this.f1530d);
                } else if (index == C0221i.f1841e5) {
                    this.f1528b = typedArrayObtainStyledAttributes.getDimension(index, this.f1528b);
                } else if (index == C0221i.f1848f5) {
                    this.f1529c = typedArrayObtainStyledAttributes.getDimension(index, this.f1529c);
                } else if (index == C0221i.f1855g5) {
                    this.f1527a = typedArrayObtainStyledAttributes.getDimension(index, this.f1527a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    C0215c(Context context, ConstraintLayout constraintLayout, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f1518a = constraintLayout;
        m1354a(context, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    private void m1354a(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f1521d.put(aVar.f1523a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.m1357a(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m1355b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1355b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        C0216d c0216d = new C0216d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (DeepLinkIntentReceiver.DeepLinksKeys.f7163ID.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0216d.m1373m(context, xmlPullParser);
                this.f1522e.put(identifier, c0216d);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m1356c(AbstractC0218f abstractC0218f) {
    }
}
