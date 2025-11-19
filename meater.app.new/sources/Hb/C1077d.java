package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* renamed from: Hb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1077d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1077d f5730a = new C1077d();

    private C1077d() {
    }

    private final boolean a(Lb.o oVar, Lb.j jVar, Lb.j jVar2) {
        if (oVar.q(jVar) == oVar.q(jVar2) && oVar.B(jVar) == oVar.B(jVar2)) {
            if ((oVar.h0(jVar) == null) == (oVar.h0(jVar2) == null) && oVar.t(oVar.a(jVar), oVar.a(jVar2))) {
                if (oVar.S(jVar, jVar2)) {
                    return true;
                }
                int iQ = oVar.q(jVar);
                for (int i10 = 0; i10 < iQ; i10++) {
                    Lb.l lVarQ = oVar.Q(jVar, i10);
                    Lb.l lVarQ2 = oVar.Q(jVar2, i10);
                    if (oVar.y(lVarQ) != oVar.y(lVarQ2)) {
                        return false;
                    }
                    if (!oVar.y(lVarQ) && (oVar.B0(lVarQ) != oVar.B0(lVarQ2) || !c(oVar, oVar.H0(lVarQ), oVar.H0(lVarQ2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(Lb.o oVar, Lb.i iVar, Lb.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        Lb.j jVarC = oVar.c(iVar);
        Lb.j jVarC2 = oVar.c(iVar2);
        if (jVarC != null && jVarC2 != null) {
            return a(oVar, jVarC, jVarC2);
        }
        Lb.g gVarM = oVar.M(iVar);
        Lb.g gVarM2 = oVar.M(iVar2);
        if (gVarM == null || gVarM2 == null) {
            return false;
        }
        return a(oVar, oVar.g(gVarM), oVar.g(gVarM2)) && a(oVar, oVar.e(gVarM), oVar.e(gVarM2));
    }

    public final boolean b(Lb.o context, Lb.i a10, Lb.i b10) {
        C3862t.g(context, "context");
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        return c(context, a10, b10);
    }
}
