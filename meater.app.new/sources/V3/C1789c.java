package V3;

import W3.c;
import android.graphics.PointF;

/* compiled from: AnimatableTransformParser.java */
/* renamed from: V3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1789c {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18032a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18033b = c.a.a("k");

    private static boolean a(R3.e eVar) {
        return eVar == null || (eVar.g() && eVar.i().get(0).f19387b.equals(0.0f, 0.0f));
    }

    private static boolean b(R3.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof R3.i) && mVar.g() && mVar.i().get(0).f19387b.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(R3.b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((Y3.a) bVar.i().get(0)).f19387b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(R3.g gVar) {
        return gVar == null || (gVar.g() && ((Y3.d) ((Y3.a) gVar.i().get(0)).f19387b).a(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(R3.b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((Y3.a) bVar.i().get(0)).f19387b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(R3.b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((Y3.a) bVar.i().get(0)).f19387b).floatValue() == 0.0f);
    }

    public static R3.l g(W3.c cVar, L3.i iVar) {
        boolean z10;
        boolean z11 = false;
        boolean z12 = cVar.o() == c.b.BEGIN_OBJECT;
        if (z12) {
            cVar.c();
        }
        R3.b bVar = null;
        R3.e eVarA = null;
        R3.m<PointF, PointF> mVarB = null;
        R3.g gVarJ = null;
        R3.b bVarF = null;
        R3.b bVarF2 = null;
        R3.d dVarH = null;
        R3.b bVarF3 = null;
        R3.b bVarF4 = null;
        while (cVar.f()) {
            switch (cVar.q(f18032a)) {
                case 0:
                    boolean z13 = z11;
                    cVar.c();
                    while (cVar.f()) {
                        if (cVar.q(f18033b) != 0) {
                            cVar.s();
                            cVar.t();
                        } else {
                            eVarA = C1787a.a(cVar, iVar);
                        }
                    }
                    cVar.e();
                    z11 = z13;
                    continue;
                case 1:
                    mVarB = C1787a.b(cVar, iVar);
                    continue;
                case 2:
                    gVarJ = C1790d.j(cVar, iVar);
                    continue;
                case 3:
                    iVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVarH = C1790d.h(cVar, iVar);
                    continue;
                case 6:
                    bVarF3 = C1790d.f(cVar, iVar, z11);
                    continue;
                case 7:
                    bVarF4 = C1790d.f(cVar, iVar, z11);
                    continue;
                case 8:
                    bVarF = C1790d.f(cVar, iVar, z11);
                    continue;
                case 9:
                    bVarF2 = C1790d.f(cVar, iVar, z11);
                    continue;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
            }
            R3.b bVarF5 = C1790d.f(cVar, iVar, z11);
            if (bVarF5.i().isEmpty()) {
                bVarF5.i().add(new Y3.a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iVar.f())));
            } else {
                if (((Y3.a) bVarF5.i().get(0)).f19387b == 0) {
                    z10 = false;
                    bVarF5.i().set(0, new Y3.a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iVar.f())));
                }
                z11 = z10;
                bVar = bVarF5;
            }
            z10 = false;
            z11 = z10;
            bVar = bVarF5;
        }
        if (z12) {
            cVar.e();
        }
        R3.e eVar = a(eVarA) ? null : eVarA;
        R3.m<PointF, PointF> mVar = b(mVarB) ? null : mVarB;
        R3.b bVar2 = c(bVar) ? null : bVar;
        if (d(gVarJ)) {
            gVarJ = null;
        }
        return new R3.l(eVar, mVar, gVarJ, bVar2, dVarH, bVarF3, bVarF4, f(bVarF) ? null : bVarF, e(bVarF2) ? null : bVarF2);
    }
}
