package Hb;

import Hb.t0;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes3.dex */
public final class v0 {
    public static final u0 a(u0 u0Var, Sa.h newAnnotations) {
        u0 u0VarB;
        C3862t.g(u0Var, "<this>");
        C3862t.g(newAnnotations, "newAnnotations");
        if (C1108u.a(u0Var) == newAnnotations) {
            return u0Var;
        }
        C1107t c1107tB = C1108u.b(u0Var);
        if (c1107tB != null && (u0VarB = u0Var.B(c1107tB)) != null) {
            u0Var = u0VarB;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? u0Var.A(new C1107t(newAnnotations)) : u0Var;
    }

    public static final u0 b(Sa.h hVar) {
        C3862t.g(hVar, "<this>");
        return t0.a.a(C1112y.f5816a, hVar, null, null, 6, null);
    }
}
