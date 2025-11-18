package com.airbnb.lottie.p118v;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.p108q.p109a.C5210r;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: Utils.java */
/* renamed from: com.airbnb.lottie.v.f */
/* loaded from: classes.dex */
public final class C5320f {

    /* renamed from: a */
    private static final PathMeasure f12925a = new PathMeasure();

    /* renamed from: b */
    private static final Path f12926b = new Path();

    /* renamed from: c */
    private static final Path f12927c = new Path();

    /* renamed from: d */
    private static final float[] f12928d = new float[4];

    /* renamed from: e */
    private static final float f12929e = (float) Math.sqrt(2.0d);

    /* renamed from: f */
    private static float f12930f = -1.0f;

    /* renamed from: a */
    public static void m9883a(Path path, float f2, float f3, float f4) {
        C5179c.m9391a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f12925a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            C5179c.m9393c("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            C5179c.m9393c("applyTrimPathIfNeeded");
            return;
        }
        float f5 = f2 * length;
        float f6 = f3 * length;
        float f7 = f4 * length;
        float fMin = Math.min(f5, f6) + f7;
        float fMax = Math.max(f5, f6) + f7;
        if (fMin >= length && fMax >= length) {
            fMin = C5319e.m9876f(fMin, length);
            fMax = C5319e.m9876f(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = C5319e.m9876f(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = C5319e.m9876f(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            C5179c.m9393c("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        Path path2 = f12926b;
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            Path path3 = f12927c;
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            Path path4 = f12927c;
            path4.reset();
            pathMeasure.getSegment(fMin + length, length, path4, true);
            path2.addPath(path4);
        }
        path.set(path2);
        C5179c.m9393c("applyTrimPathIfNeeded");
    }

    /* renamed from: b */
    public static void m9884b(Path path, C5210r c5210r) {
        if (c5210r == null) {
            return;
        }
        m9883a(path, c5210r.m9543i().mo9552h().floatValue() / 100.0f, c5210r.m9541e().mo9552h().floatValue() / 100.0f, c5210r.m9542h().mo9552h().floatValue() / 360.0f);
    }

    /* renamed from: c */
    public static void m9885c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m9886d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f3 = pointF.y + pointF3.y;
            float f4 = pointF2.x;
            float f5 = f4 + pointF4.x;
            float f6 = pointF2.y;
            path.cubicTo(f2, f3, f5, f6 + pointF4.y, f4, f6);
        }
        return path;
    }

    /* renamed from: e */
    public static float m9887e() {
        if (f12930f == -1.0f) {
            f12930f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f12930f;
    }

    /* renamed from: f */
    public static float m9888f(Matrix matrix) {
        float[] fArr = f12928d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f12929e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1])) / 2.0f;
    }

    /* renamed from: g */
    public static int m9889g(float f2, float f3, float f4, float f5) {
        int i2 = f2 != 0.0f ? (int) (527 * f2) : 17;
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        if (f4 != 0.0f) {
            i2 = (int) (i2 * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i2 * 31 * f5) : i2;
    }

    /* renamed from: h */
    public static boolean m9890h(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 < i6) {
            return false;
        }
        return i3 > i6 || i4 >= i7;
    }
}
