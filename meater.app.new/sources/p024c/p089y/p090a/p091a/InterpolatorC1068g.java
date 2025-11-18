package p024c.p089y.p090a.p091a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p003d.C0264g;
import org.xmlpull.v1.XmlPullParser;
import p024c.p052i.p053e.C0925c;

/* compiled from: PathInterpolatorCompat.java */
/* renamed from: c.y.a.a.g */
/* loaded from: classes.dex */
public class InterpolatorC1068g implements Interpolator {

    /* renamed from: a */
    private float[] f6981a;

    /* renamed from: b */
    private float[] f6982b;

    public InterpolatorC1068g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m6721a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        m6722b(path);
    }

    /* renamed from: b */
    private void m6722b(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f6981a = new float[iMin];
        this.f6982b = new float[iMin];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < iMin; i3++) {
            pathMeasure.getPosTan((i3 * length) / (iMin - 1), fArr, null);
            this.f6981a[i3] = fArr[0];
            this.f6982b[i3] = fArr[1];
        }
        if (Math.abs(this.f6981a[0]) <= 1.0E-5d && Math.abs(this.f6982b[0]) <= 1.0E-5d) {
            int i4 = iMin - 1;
            if (Math.abs(this.f6981a[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f6982b[i4] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i5 = 0;
                while (i2 < iMin) {
                    float[] fArr2 = this.f6981a;
                    int i6 = i5 + 1;
                    float f3 = fArr2[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f6981a[0]);
        sb.append(",");
        sb.append(this.f6982b[0]);
        sb.append(" end:");
        int i7 = iMin - 1;
        sb.append(this.f6981a[i7]);
        sb.append(",");
        sb.append(this.f6982b[i7]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private void m6723c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        m6722b(path);
    }

    /* renamed from: d */
    private void m6724d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0264g.m1783r(xmlPullParser, "pathData")) {
            String strM1778m = C0264g.m1778m(typedArray, xmlPullParser, "pathData", 4);
            Path pathM5897e = C0925c.m5897e(strM1778m);
            if (pathM5897e != null) {
                m6722b(pathM5897e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM1778m);
        }
        if (!C0264g.m1783r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C0264g.m1783r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fM1775j = C0264g.m1775j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fM1775j2 = C0264g.m1775j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zM1783r = C0264g.m1783r(xmlPullParser, "controlX2");
        if (zM1783r != C0264g.m1783r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zM1783r) {
            m6721a(fM1775j, fM1775j2, C0264g.m1775j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0264g.m1775j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m6723c(fM1775j, fM1775j2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f6981a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f6981a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f6981a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f6982b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f6982b;
        float f5 = fArr2[i2];
        return f5 + (f4 * (fArr2[length] - f5));
    }

    public InterpolatorC1068g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6965l);
        m6724d(typedArrayM1784s, xmlPullParser);
        typedArrayM1784s.recycle();
    }
}
