package androidx.core.content.p003d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p052i.C0919a;
import p024c.p052i.C0922d;

/* compiled from: ColorStateListInflaterCompat.java */
/* renamed from: androidx.core.content.d.a */
/* loaded from: classes.dex */
public final class C0258a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2193a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m1702a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1703b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m1703b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m1706e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m1704c() {
        ThreadLocal<TypedValue> threadLocal = f2193a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m1705d(Resources resources, int i2, Resources.Theme theme) {
        try {
            return m1702a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    /* renamed from: e */
    private static ColorStateList m1706e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM1745a = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM1709h = m1709h(resources, theme, attributeSet, C0922d.f6256b);
                int i4 = C0922d.f6257c;
                int resourceId = typedArrayM1709h.getResourceId(i4, -1);
                if (resourceId == -1 || m1707f(resources, resourceId)) {
                    color = typedArrayM1709h.getColor(i4, -65281);
                } else {
                    try {
                        color = m1702a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM1709h.getColor(C0922d.f6257c, -65281);
                    }
                }
                float f2 = 1.0f;
                int i5 = C0922d.f6258d;
                if (typedArrayM1709h.hasValue(i5)) {
                    f2 = typedArrayM1709h.getFloat(i5, 1.0f);
                } else {
                    int i6 = C0922d.f6259e;
                    if (typedArrayM1709h.hasValue(i6)) {
                        f2 = typedArrayM1709h.getFloat(i6, 1.0f);
                    }
                }
                typedArrayM1709h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C0919a.f6193a) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i7);
                iArrM1745a = C0262e.m1745a(iArrM1745a, i3, m1708g(color, f2));
                iArr = (int[][]) C0262e.m1746b(iArr, i3, iArrTrimStateSet);
                i3++;
            }
            i2 = 1;
        }
        int[] iArr3 = new int[i3];
        int[][] iArr4 = new int[i3][];
        System.arraycopy(iArrM1745a, 0, iArr3, 0, i3);
        System.arraycopy(iArr, 0, iArr4, 0, i3);
        return new ColorStateList(iArr4, iArr3);
    }

    /* renamed from: f */
    private static boolean m1707f(Resources resources, int i2) throws Resources.NotFoundException {
        TypedValue typedValueM1704c = m1704c();
        resources.getValue(i2, typedValueM1704c, true);
        int i3 = typedValueM1704c.type;
        return i3 >= 28 && i3 <= 31;
    }

    /* renamed from: g */
    private static int m1708g(int i2, float f2) {
        return (i2 & 16777215) | (Math.round(Color.alpha(i2) * f2) << 24);
    }

    /* renamed from: h */
    private static TypedArray m1709h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
