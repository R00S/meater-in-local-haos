package androidx.core.content.p003d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p052i.C0922d;

/* compiled from: GradientColorInflaterCompat.java */
/* renamed from: androidx.core.content.d.d */
/* loaded from: classes.dex */
final class C0261d {
    /* renamed from: a */
    private static a m1741a(a aVar, int i2, int i3, boolean z, int i4) {
        return aVar != null ? aVar : z ? new a(i2, i4, i3) : new a(i2, i3);
    }

    /* renamed from: b */
    static Shader m1742b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C0922d.f6279y);
        float fM1775j = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "startX", C0922d.f6248H, 0.0f);
        float fM1775j2 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "startY", C0922d.f6249I, 0.0f);
        float fM1775j3 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "endX", C0922d.f6250J, 0.0f);
        float fM1775j4 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "endY", C0922d.f6251K, 0.0f);
        float fM1775j5 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "centerX", C0922d.f6243C, 0.0f);
        float fM1775j6 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "centerY", C0922d.f6244D, 0.0f);
        int iM1776k = C0264g.m1776k(typedArrayM1784s, xmlPullParser, "type", C0922d.f6242B, 0);
        int iM1771f = C0264g.m1771f(typedArrayM1784s, xmlPullParser, "startColor", C0922d.f6280z, 0);
        boolean zM1783r = C0264g.m1783r(xmlPullParser, "centerColor");
        int iM1771f2 = C0264g.m1771f(typedArrayM1784s, xmlPullParser, "centerColor", C0922d.f6247G, 0);
        int iM1771f3 = C0264g.m1771f(typedArrayM1784s, xmlPullParser, "endColor", C0922d.f6241A, 0);
        int iM1776k2 = C0264g.m1776k(typedArrayM1784s, xmlPullParser, "tileMode", C0922d.f6246F, 0);
        float fM1775j7 = C0264g.m1775j(typedArrayM1784s, xmlPullParser, "gradientRadius", C0922d.f6245E, 0.0f);
        typedArrayM1784s.recycle();
        a aVarM1741a = m1741a(m1743c(resources, xmlPullParser, attributeSet, theme), iM1771f, iM1771f3, zM1783r, iM1771f2);
        if (iM1776k != 1) {
            return iM1776k != 2 ? new LinearGradient(fM1775j, fM1775j2, fM1775j3, fM1775j4, aVarM1741a.f2208a, aVarM1741a.f2209b, m1744d(iM1776k2)) : new SweepGradient(fM1775j5, fM1775j6, aVarM1741a.f2208a, aVarM1741a.f2209b);
        }
        if (fM1775j7 > 0.0f) {
            return new RadialGradient(fM1775j5, fM1775j6, fM1775j7, aVarM1741a.f2208a, aVarM1741a.f2209b, m1744d(iM1776k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.p003d.C0261d.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.p003d.C0261d.a m1743c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p024c.p052i.C0922d.f6252L
            android.content.res.TypedArray r3 = androidx.core.content.p003d.C0264g.m1784s(r9, r12, r11, r3)
            int r5 = p024c.p052i.C0922d.f6253M
            boolean r6 = r3.hasValue(r5)
            int r7 = p024c.p052i.C0922d.f6254N
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.d.d$a r9 = new androidx.core.content.d.d$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0261d.m1743c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.d.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m1744d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    /* renamed from: androidx.core.content.d.d$a */
    static final class a {

        /* renamed from: a */
        final int[] f2208a;

        /* renamed from: b */
        final float[] f2209b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2208a = new int[size];
            this.f2209b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f2208a[i2] = list.get(i2).intValue();
                this.f2209b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3) {
            this.f2208a = new int[]{i2, i3};
            this.f2209b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.f2208a = new int[]{i2, i3, i4};
            this.f2209b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
