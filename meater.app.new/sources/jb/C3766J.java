package jb;

import Hb.K0;
import Qa.c;
import ib.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import yb.C5148d;
import yb.EnumC5149e;

/* compiled from: typeSignatureMapping.kt */
/* renamed from: jb.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3766J {
    public static final <T> T a(t<T> tVar, T possiblyPrimitiveType, boolean z10) {
        C3862t.g(tVar, "<this>");
        C3862t.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? tVar.e(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final <T> T b(K0 k02, Lb.i type, t<T> typeFactory, C3765I mode) {
        C3862t.g(k02, "<this>");
        C3862t.g(type, "type");
        C3862t.g(typeFactory, "typeFactory");
        C3862t.g(mode, "mode");
        Lb.m mVarD0 = k02.d0(type);
        if (!k02.E0(mVarD0)) {
            return null;
        }
        Oa.m mVarC = k02.C(mVarD0);
        if (mVarC != null) {
            return (T) a(typeFactory, typeFactory.d(mVarC), k02.l(type) || l0.c(k02, type));
        }
        Oa.m mVarB0 = k02.b0(mVarD0);
        if (mVarB0 != null) {
            return typeFactory.b('[' + EnumC5149e.j(mVarB0).p());
        }
        if (k02.q0(mVarD0)) {
            qb.d dVarL = k02.L(mVarD0);
            qb.b bVarN = dVarL != null ? Qa.c.f14576a.n(dVarL) : null;
            if (bVarN != null) {
                if (!mode.a()) {
                    List<c.a> listI = Qa.c.f14576a.i();
                    if (!(listI instanceof Collection) || !listI.isEmpty()) {
                        Iterator<T> it = listI.iterator();
                        while (it.hasNext()) {
                            if (C3862t.b(((c.a) it.next()).d(), bVarN)) {
                                return null;
                            }
                        }
                    }
                }
                String strH = C5148d.h(bVarN);
                C3862t.f(strH, "internalNameByClassId(...)");
                return typeFactory.c(strH);
            }
        }
        return null;
    }
}
