package Hb;

import Hb.x0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: Hb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1075c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1075c f5729a = new C1075c();

    private C1075c() {
    }

    private final boolean c(x0 x0Var, Lb.j jVar, Lb.m mVar) {
        Lb.o oVarJ = x0Var.j();
        if (oVarJ.W(jVar)) {
            return true;
        }
        if (oVarJ.B(jVar)) {
            return false;
        }
        if (x0Var.n() && oVarJ.c0(jVar)) {
            return true;
        }
        return oVarJ.t(oVarJ.a(jVar), mVar);
    }

    private final boolean e(x0 x0Var, Lb.j jVar, Lb.j jVar2) {
        Lb.o oVarJ = x0Var.j();
        if (C1085h.f5749b) {
            if (!oVarJ.b(jVar) && !oVarJ.O(oVarJ.a(jVar))) {
                x0Var.l(jVar);
            }
            if (!oVarJ.b(jVar2)) {
                x0Var.l(jVar2);
            }
        }
        if (oVarJ.B(jVar2) || oVarJ.p(jVar) || oVarJ.R(jVar)) {
            return true;
        }
        if ((jVar instanceof Lb.d) && oVarJ.r((Lb.d) jVar)) {
            return true;
        }
        C1075c c1075c = f5729a;
        if (c1075c.a(x0Var, jVar, x0.c.b.f5813a)) {
            return true;
        }
        if (oVarJ.p(jVar2) || c1075c.a(x0Var, jVar2, x0.c.d.f5815a) || oVarJ.j(jVar)) {
            return false;
        }
        return c1075c.b(x0Var, jVar, oVarJ.a(jVar2));
    }

    public final boolean a(x0 x0Var, Lb.j type, x0.c supertypesPolicy) {
        C3862t.g(x0Var, "<this>");
        C3862t.g(type, "type");
        C3862t.g(supertypesPolicy, "supertypesPolicy");
        Lb.o oVarJ = x0Var.j();
        if ((oVarJ.j(type) && !oVarJ.B(type)) || oVarJ.p(type)) {
            return true;
        }
        x0Var.k();
        ArrayDeque<Lb.j> arrayDequeH = x0Var.h();
        C3862t.d(arrayDequeH);
        Set<Lb.j> setI = x0Var.i();
        C3862t.d(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + kotlin.collections.r.s0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Lb.j jVarPop = arrayDequeH.pop();
            C3862t.d(jVarPop);
            if (setI.add(jVarPop)) {
                x0.c cVar = oVarJ.B(jVarPop) ? x0.c.C0111c.f5814a : supertypesPolicy;
                if (C3862t.b(cVar, x0.c.C0111c.f5814a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Lb.o oVarJ2 = x0Var.j();
                    Iterator<Lb.i> it = oVarJ2.A(oVarJ2.a(jVarPop)).iterator();
                    while (it.hasNext()) {
                        Lb.j jVarA = cVar.a(x0Var, it.next());
                        if ((oVarJ.j(jVarA) && !oVarJ.B(jVarA)) || oVarJ.p(jVarA)) {
                            x0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        x0Var.e();
        return false;
    }

    public final boolean b(x0 state, Lb.j start, Lb.m end) {
        C3862t.g(state, "state");
        C3862t.g(start, "start");
        C3862t.g(end, "end");
        Lb.o oVarJ = state.j();
        if (f5729a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque<Lb.j> arrayDequeH = state.h();
        C3862t.d(arrayDequeH);
        Set<Lb.j> setI = state.i();
        C3862t.d(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + kotlin.collections.r.s0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Lb.j jVarPop = arrayDequeH.pop();
            C3862t.d(jVarPop);
            if (setI.add(jVarPop)) {
                x0.c cVar = oVarJ.B(jVarPop) ? x0.c.C0111c.f5814a : x0.c.b.f5813a;
                if (C3862t.b(cVar, x0.c.C0111c.f5814a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Lb.o oVarJ2 = state.j();
                    Iterator<Lb.i> it = oVarJ2.A(oVarJ2.a(jVarPop)).iterator();
                    while (it.hasNext()) {
                        Lb.j jVarA = cVar.a(state, it.next());
                        if (f5729a.c(state, jVarA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(x0 state, Lb.j subType, Lb.j superType) {
        C3862t.g(state, "state");
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return e(state, subType, superType);
    }
}
