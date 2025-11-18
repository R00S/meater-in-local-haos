package V3;

import W3.c;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18064a = c.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18065a;

        static {
            int[] iArr = new int[c.b.values().length];
            f18065a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18065a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18065a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(W3.c cVar, float f10) {
        cVar.b();
        float fJ = (float) cVar.j();
        float fJ2 = (float) cVar.j();
        while (cVar.o() != c.b.END_ARRAY) {
            cVar.t();
        }
        cVar.d();
        return new PointF(fJ * f10, fJ2 * f10);
    }

    private static PointF b(W3.c cVar, float f10) {
        float fJ = (float) cVar.j();
        float fJ2 = (float) cVar.j();
        while (cVar.f()) {
            cVar.t();
        }
        return new PointF(fJ * f10, fJ2 * f10);
    }

    private static PointF c(W3.c cVar, float f10) {
        cVar.c();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.f()) {
            int iQ = cVar.q(f18064a);
            if (iQ == 0) {
                fG = g(cVar);
            } else if (iQ != 1) {
                cVar.s();
                cVar.t();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.e();
        return new PointF(fG * f10, fG2 * f10);
    }

    static int d(W3.c cVar) {
        cVar.b();
        int iJ = (int) (cVar.j() * 255.0d);
        int iJ2 = (int) (cVar.j() * 255.0d);
        int iJ3 = (int) (cVar.j() * 255.0d);
        while (cVar.f()) {
            cVar.t();
        }
        cVar.d();
        return Color.argb(255, iJ, iJ2, iJ3);
    }

    static PointF e(W3.c cVar, float f10) {
        int i10 = a.f18065a[cVar.o().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.o());
    }

    static List<PointF> f(W3.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    static float g(W3.c cVar) {
        c.b bVarO = cVar.o();
        int i10 = a.f18065a[bVarO.ordinal()];
        if (i10 == 1) {
            return (float) cVar.j();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarO);
        }
        cVar.b();
        float fJ = (float) cVar.j();
        while (cVar.f()) {
            cVar.t();
        }
        cVar.d();
        return fJ;
    }
}
