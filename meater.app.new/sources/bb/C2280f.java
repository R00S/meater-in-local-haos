package bb;

import Hb.U;
import Oa.p;
import Ra.H;
import Ra.t0;
import Sa.q;
import Sa.r;
import hb.InterfaceC3509b;
import hb.InterfaceC3520m;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.M;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import oa.v;
import vb.AbstractC4943g;
import vb.C4938b;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: bb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2280f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2280f f30719a = new C2280f();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, EnumSet<r>> f30720b = M.k(v.a("PACKAGE", EnumSet.noneOf(r.class)), v.a("TYPE", EnumSet.of(r.f15681U, r.f15694h0)), v.a("ANNOTATION_TYPE", EnumSet.of(r.f15682V)), v.a("TYPE_PARAMETER", EnumSet.of(r.f15683W)), v.a("FIELD", EnumSet.of(r.f15685Y)), v.a("LOCAL_VARIABLE", EnumSet.of(r.f15686Z)), v.a("PARAMETER", EnumSet.of(r.f15687a0)), v.a("CONSTRUCTOR", EnumSet.of(r.f15688b0)), v.a("METHOD", EnumSet.of(r.f15689c0, r.f15690d0, r.f15691e0)), v.a("TYPE_USE", EnumSet.of(r.f15692f0)));

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, q> f30721c = M.k(v.a("RUNTIME", q.f15646B), v.a("CLASS", q.f15647C), v.a("SOURCE", q.f15648D));

    private C2280f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U e(H module) {
        U uA;
        C3862t.g(module, "module");
        t0 t0VarB = C2275a.b(C2278d.f30713a.d(), module.q().o(p.a.f13414H));
        return (t0VarB == null || (uA = t0VarB.a()) == null) ? Jb.l.d(Jb.k.f7761e1, new String[0]) : uA;
    }

    public final AbstractC4943g<?> b(InterfaceC3509b interfaceC3509b) {
        InterfaceC3520m interfaceC3520m = interfaceC3509b instanceof InterfaceC3520m ? (InterfaceC3520m) interfaceC3509b : null;
        if (interfaceC3520m == null) {
            return null;
        }
        Map<String, q> map = f30721c;
        qb.f fVarD = interfaceC3520m.d();
        q qVar = map.get(fVarD != null ? fVarD.j() : null);
        if (qVar == null) {
            return null;
        }
        qb.b bVarC = qb.b.f48178d.c(p.a.f13420K);
        qb.f fVarT = qb.f.t(qVar.name());
        C3862t.f(fVarT, "identifier(...)");
        return new vb.k(bVarC, fVarT);
    }

    public final Set<r> c(String str) {
        EnumSet<r> enumSet = f30720b.get(str);
        return enumSet != null ? enumSet : V.d();
    }

    public final AbstractC4943g<?> d(List<? extends InterfaceC3509b> arguments) {
        C3862t.g(arguments, "arguments");
        ArrayList<InterfaceC3520m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC3520m) {
                arrayList.add(obj);
            }
        }
        ArrayList<r> arrayList2 = new ArrayList();
        for (InterfaceC3520m interfaceC3520m : arrayList) {
            C2280f c2280f = f30719a;
            qb.f fVarD = interfaceC3520m.d();
            kotlin.collections.r.D(arrayList2, c2280f.c(fVarD != null ? fVarD.j() : null));
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(arrayList2, 10));
        for (r rVar : arrayList2) {
            qb.b bVarC = qb.b.f48178d.c(p.a.f13418J);
            qb.f fVarT = qb.f.t(rVar.name());
            C3862t.f(fVarT, "identifier(...)");
            arrayList3.add(new vb.k(bVarC, fVarT));
        }
        return new C4938b(arrayList3, C2279e.f30718B);
    }
}
