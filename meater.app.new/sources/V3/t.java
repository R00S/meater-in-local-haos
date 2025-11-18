package V3;

import L3.C1360e;
import W3.c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import s.Y;
import u1.C4661a;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
class t {

    /* renamed from: b, reason: collision with root package name */
    private static Y<WeakReference<Interpolator>> f18067b;

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f18066a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static c.a f18068c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static c.a f18069d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceG;
        synchronized (t.class) {
            weakReferenceG = g().g(i10);
        }
        return weakReferenceG;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = X3.i.b(pointF.x, -1.0f, 1.0f);
        pointF.y = X3.i.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = X3.i.b(pointF2.x, -1.0f, 1.0f);
        float fB = X3.i.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = X3.j.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = C1360e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorA = C4661a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? C4661a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorA;
            if (!C1360e.e()) {
                try {
                    h(i10, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    static <T> Y3.a<T> c(W3.c cVar, L3.i iVar, float f10, N<T> n10, boolean z10, boolean z11) {
        return (z10 && z11) ? e(iVar, cVar, f10, n10) : z10 ? d(iVar, cVar, f10, n10) : f(cVar, f10, n10);
    }

    private static <T> Y3.a<T> d(L3.i iVar, W3.c cVar, float f10, N<T> n10) {
        Interpolator interpolatorB;
        T t10;
        cVar.c();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fJ = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (cVar.f()) {
            switch (cVar.q(f18068c)) {
                case 0:
                    fJ = (float) cVar.j();
                    break;
                case 1:
                    tA2 = n10.a(cVar, f10);
                    break;
                case 2:
                    tA = n10.a(cVar, f10);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.k() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointFE2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        if (z10) {
            interpolatorB = f18066a;
            t10 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f18066a : b(pointFE, pointFE4);
            t10 = tA;
        }
        Y3.a<T> aVar = new Y3.a<>(iVar, tA2, t10, interpolatorB, fJ, null);
        aVar.f19400o = pointFE2;
        aVar.f19401p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> Y3.a<T> e(L3.i r21, W3.c r22, float r23, V3.N<T> r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.t.e(L3.i, W3.c, float, V3.N):Y3.a");
    }

    private static <T> Y3.a<T> f(W3.c cVar, float f10, N<T> n10) {
        return new Y3.a<>(n10.a(cVar, f10));
    }

    private static Y<WeakReference<Interpolator>> g() {
        if (f18067b == null) {
            f18067b = new Y<>();
        }
        return f18067b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f18067b.n(i10, weakReference);
        }
    }
}
