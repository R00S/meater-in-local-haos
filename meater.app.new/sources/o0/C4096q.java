package o0;

import androidx.compose.ui.platform.C2013e0;
import h0.C3482m;
import h0.C3483n;
import i0.C3604u0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aD\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lo0/d;", "image", "Lo0/p;", "g", "(Lo0/d;LO/l;I)Lo0/p;", "LU0/d;", "LU0/h;", "defaultWidth", "defaultHeight", "Lh0/m;", "e", "(LU0/d;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "f", "(JFF)J", "Li0/t0;", "tintColor", "Li0/b0;", "tintBlendMode", "Li0/u0;", "b", "(JI)Li0/u0;", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "a", "(Lo0/p;JJLjava/lang/String;Li0/u0;Z)Lo0/p;", "density", "imageVector", "Lo0/c;", "root", "d", "(LU0/d;Lo0/d;Lo0/c;)Lo0/p;", "Lo0/m;", "currentGroup", "c", "(Lo0/c;Lo0/m;)Lo0/c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4096q {
    public static final C4095p a(C4095p c4095p, long j10, long j11, String str, C3604u0 c3604u0, boolean z10) {
        c4095p.u(j10);
        c4095p.q(z10);
        c4095p.r(c3604u0);
        c4095p.v(j11);
        c4095p.t(str);
        return c4095p;
    }

    private static final C3604u0 b(long j10, int i10) {
        if (j10 != 16) {
            return C3604u0.INSTANCE.a(j10, i10);
        }
        return null;
    }

    public static final C4082c c(C4082c c4082c, C4092m c4092m) {
        int iB = c4092m.B();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC4094o abstractC4094oH = c4092m.h(i10);
            if (abstractC4094oH instanceof C4097r) {
                C4085f c4085f = new C4085f();
                C4097r c4097r = (C4097r) abstractC4094oH;
                c4085f.k(c4097r.j());
                c4085f.l(c4097r.getPathFillType());
                c4085f.j(c4097r.getName());
                c4085f.h(c4097r.getFill());
                c4085f.i(c4097r.getFillAlpha());
                c4085f.m(c4097r.getStroke());
                c4085f.n(c4097r.getStrokeAlpha());
                c4085f.r(c4097r.getStrokeLineWidth());
                c4085f.o(c4097r.getStrokeLineCap());
                c4085f.p(c4097r.getStrokeLineJoin());
                c4085f.q(c4097r.getStrokeLineMiter());
                c4085f.u(c4097r.getTrimPathStart());
                c4085f.s(c4097r.getTrimPathEnd());
                c4085f.t(c4097r.getTrimPathOffset());
                c4082c.i(i10, c4085f);
            } else if (abstractC4094oH instanceof C4092m) {
                C4082c c4082c2 = new C4082c();
                C4092m c4092m2 = (C4092m) abstractC4094oH;
                c4082c2.p(c4092m2.getName());
                c4082c2.s(c4092m2.getRotation());
                c4082c2.t(c4092m2.getScaleX());
                c4082c2.u(c4092m2.getScaleY());
                c4082c2.v(c4092m2.getTranslationX());
                c4082c2.w(c4092m2.getTranslationY());
                c4082c2.q(c4092m2.getPivotX());
                c4082c2.r(c4092m2.getPivotY());
                c4082c2.o(c4092m2.i());
                c(c4082c2, c4092m2);
                c4082c.i(i10, c4082c2);
            }
        }
        return c4082c;
    }

    public static final C4095p d(U0.d dVar, C4083d c4083d, C4082c c4082c) {
        long jE = e(dVar, c4083d.getDefaultWidth(), c4083d.getDefaultHeight());
        return a(new C4095p(c4082c), jE, f(jE, c4083d.getViewportWidth(), c4083d.getViewportHeight()), c4083d.getName(), b(c4083d.getTintColor(), c4083d.getTintBlendMode()), c4083d.getAutoMirror());
    }

    private static final long e(U0.d dVar, float f10, float f11) {
        return C3483n.a(dVar.X0(f10), dVar.X0(f11));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = C3482m.i(j10);
        }
        if (Float.isNaN(f11)) {
            f11 = C3482m.g(j10);
        }
        return C3483n.a(f10, f11);
    }

    public static final C4095p g(C4083d c4083d, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        U0.d dVar = (U0.d) interfaceC1554l.o(C2013e0.d());
        float genId = c4083d.getGenId();
        float density = dVar.getDensity();
        boolean zI = interfaceC1554l.i((Float.floatToRawIntBits(density) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objF = interfaceC1554l.f();
        if (zI || objF == InterfaceC1554l.INSTANCE.a()) {
            C4082c c4082c = new C4082c();
            c(c4082c, c4083d.getRoot());
            C4153F c4153f = C4153F.f46609a;
            objF = d(dVar, c4083d, c4082c);
            interfaceC1554l.J(objF);
        }
        C4095p c4095p = (C4095p) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c4095p;
    }
}
