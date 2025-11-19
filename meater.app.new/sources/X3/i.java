package X3;

import N3.k;
import S3.o;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f18740a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    static int f(float f10, float f11) {
        return g((int) f10, (int) f11);
    }

    private static int g(int i10, int i11) {
        return i10 - (i11 * e(i10, i11));
    }

    public static void h(o oVar, Path path) {
        path.reset();
        PointF pointFB = oVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f18740a.set(pointFB.x, pointFB.y);
        for (int i10 = 0; i10 < oVar.a().size(); i10++) {
            Q3.a aVar = oVar.a().get(i10);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointF = f18740a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
            } else {
                path.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
        }
        if (oVar.d()) {
            path.close();
        }
    }

    public static float i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int j(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static void k(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2, k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
