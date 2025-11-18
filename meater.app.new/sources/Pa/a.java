package Pa;

import Gb.n;
import Oa.h;
import Pa.g;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes3.dex */
public final class a implements Ta.b {

    /* renamed from: a, reason: collision with root package name */
    private final n f14138a;

    /* renamed from: b, reason: collision with root package name */
    private final H f14139b;

    public a(n storageManager, H module) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(module, "module");
        this.f14138a = storageManager;
        this.f14139b = module;
    }

    @Override // Ta.b
    public InterfaceC1692e a(qb.b classId) {
        qb.c cVarF;
        g.b bVarC;
        C3862t.g(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String strB = classId.g().b();
        C3862t.f(strB, "asString(...)");
        if (!Ub.n.L(strB, "Function", false, 2, null) || (bVarC = g.f14169c.a().c((cVarF = classId.f()), strB)) == null) {
            return null;
        }
        f fVarA = bVarC.a();
        int iB = bVarC.b();
        List<N> listI = this.f14139b.G(cVarF).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (obj instanceof Oa.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof h) {
                arrayList2.add(obj2);
            }
        }
        N n10 = (h) r.l0(arrayList2);
        if (n10 == null) {
            n10 = (Oa.c) r.j0(arrayList);
        }
        return new b(this.f14138a, n10, fVarA, iB);
    }

    @Override // Ta.b
    public Collection<InterfaceC1692e> b(qb.c packageFqName) {
        C3862t.g(packageFqName, "packageFqName");
        return V.d();
    }

    @Override // Ta.b
    public boolean c(qb.c packageFqName, qb.f name) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(name, "name");
        String strJ = name.j();
        C3862t.f(strJ, "asString(...)");
        return (Ub.n.G(strJ, "Function", false, 2, null) || Ub.n.G(strJ, "KFunction", false, 2, null) || Ub.n.G(strJ, "SuspendFunction", false, 2, null) || Ub.n.G(strJ, "KSuspendFunction", false, 2, null)) && g.f14169c.a().c(packageFqName, strJ) != null;
    }
}
