package androidx.core.content.p003d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* renamed from: androidx.core.content.d.g */
/* loaded from: classes.dex */
public class C0264g {
    /* renamed from: a */
    public static int m1766a(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    /* renamed from: b */
    public static boolean m1767b(TypedArray typedArray, int i2, int i3, boolean z) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z));
    }

    /* renamed from: c */
    public static Drawable m1768c(TypedArray typedArray, int i2, int i3) {
        Drawable drawable = typedArray.getDrawable(i2);
        return drawable == null ? typedArray.getDrawable(i3) : drawable;
    }

    /* renamed from: d */
    public static int m1769d(TypedArray typedArray, int i2, int i3, int i4) {
        return typedArray.getInt(i2, typedArray.getInt(i3, i4));
    }

    /* renamed from: e */
    public static boolean m1770e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, boolean z) {
        return !m1783r(xmlPullParser, str) ? z : typedArray.getBoolean(i2, z);
    }

    /* renamed from: f */
    public static int m1771f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !m1783r(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    /* renamed from: g */
    public static ColorStateList m1772g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        if (!m1783r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        int i3 = typedValue.type;
        if (i3 != 2) {
            return (i3 < 28 || i3 > 31) ? C0258a.m1705d(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme) : m1773h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i2 + ": " + typedValue);
    }

    /* renamed from: h */
    private static ColorStateList m1773h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C0259b m1774i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        if (m1783r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return C0259b.m1711b(typedValue.data);
            }
            C0259b c0259bM1714g = C0259b.m1714g(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            if (c0259bM1714g != null) {
                return c0259bM1714g;
            }
        }
        return C0259b.m1711b(i3);
    }

    /* renamed from: j */
    public static float m1775j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        return !m1783r(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    /* renamed from: k */
    public static int m1776k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !m1783r(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    /* renamed from: l */
    public static int m1777l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !m1783r(xmlPullParser, str) ? i3 : typedArray.getResourceId(i2, i3);
    }

    /* renamed from: m */
    public static String m1778m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (m1783r(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    /* renamed from: n */
    public static int m1779n(TypedArray typedArray, int i2, int i3, int i4) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i4));
    }

    /* renamed from: o */
    public static String m1780o(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    /* renamed from: p */
    public static CharSequence m1781p(TypedArray typedArray, int i2, int i3) {
        CharSequence text = typedArray.getText(i2);
        return text == null ? typedArray.getText(i3) : text;
    }

    /* renamed from: q */
    public static CharSequence[] m1782q(TypedArray typedArray, int i2, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        return textArray == null ? typedArray.getTextArray(i3) : textArray;
    }

    /* renamed from: r */
    public static boolean m1783r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: s */
    public static TypedArray m1784s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: t */
    public static TypedValue m1785t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (m1783r(xmlPullParser, str)) {
            return typedArray.peekValue(i2);
        }
        return null;
    }
}
