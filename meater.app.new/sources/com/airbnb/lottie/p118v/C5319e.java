package com.airbnb.lottie.p118v;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p108q.p109a.InterfaceC5202j;
import com.airbnb.lottie.p112s.C5229a;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5262l;
import java.util.List;

/* compiled from: MiscUtils.java */
/* renamed from: com.airbnb.lottie.v.e */
/* loaded from: classes.dex */
public class C5319e {
    /* renamed from: a */
    public static PointF m9871a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m9872b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    /* renamed from: c */
    public static int m9873c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    /* renamed from: d */
    public static boolean m9874d(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }

    /* renamed from: e */
    private static int m9875e(int i2, int i3) {
        int i4 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i4 : i4 - 1;
    }

    /* renamed from: f */
    static int m9876f(float f2, float f3) {
        return m9877g((int) f2, (int) f3);
    }

    /* renamed from: g */
    private static int m9877g(int i2, int i3) {
        return i2 - (i3 * m9875e(i2, i3));
    }

    /* renamed from: h */
    public static void m9878h(C5262l c5262l, Path path) {
        path.reset();
        PointF pointFM9681b = c5262l.m9681b();
        path.moveTo(pointFM9681b.x, pointFM9681b.y);
        PointF pointF = new PointF(pointFM9681b.x, pointFM9681b.y);
        for (int i2 = 0; i2 < c5262l.m9680a().size(); i2++) {
            C5229a c5229a = c5262l.m9680a().get(i2);
            PointF pointFM9591a = c5229a.m9591a();
            PointF pointFM9592b = c5229a.m9592b();
            PointF pointFM9593c = c5229a.m9593c();
            if (pointFM9591a.equals(pointF) && pointFM9592b.equals(pointFM9593c)) {
                path.lineTo(pointFM9593c.x, pointFM9593c.y);
            } else {
                path.cubicTo(pointFM9591a.x, pointFM9591a.y, pointFM9592b.x, pointFM9592b.y, pointFM9593c.x, pointFM9593c.y);
            }
            pointF.set(pointFM9593c.x, pointFM9593c.y);
        }
        if (c5262l.m9683d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static double m9879i(double d2, double d3, double d4) {
        return d2 + (d4 * (d3 - d2));
    }

    /* renamed from: j */
    public static float m9880j(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    /* renamed from: k */
    public static int m9881k(int i2, int i3, float f2) {
        return (int) (i2 + (f2 * (i3 - i2)));
    }

    /* renamed from: l */
    public static void m9882l(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2, InterfaceC5202j interfaceC5202j) {
        if (c5233e.m9606c(interfaceC5202j.getName(), i2)) {
            list.add(c5233e2.m9605a(interfaceC5202j.getName()).m9611i(interfaceC5202j));
        }
    }
}
