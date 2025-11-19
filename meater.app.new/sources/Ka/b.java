package Ka;

import Ia.f;
import Ia.q;
import Ia.r;
import La.U0;
import La.Y0;
import Ra.EnumC1693f;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: KTypesJvm.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LIa/q;", "LIa/d;", "b", "(LIa/q;)LIa/d;", "getJvmErasure$annotations", "(LIa/q;)V", "jvmErasure", "LIa/f;", "a", "(LIa/f;)LIa/d;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Ia.d<?> a(f fVar) {
        InterfaceC1692e interfaceC1692e;
        Ia.d<?> dVarB;
        C3862t.g(fVar, "<this>");
        if (fVar instanceof Ia.d) {
            return (Ia.d) fVar;
        }
        if (!(fVar instanceof r)) {
            throw new Y0("Cannot calculate JVM erasure for type: " + fVar);
        }
        List<q> upperBounds = ((r) fVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q qVar = (q) next;
            C3862t.e(qVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC1695h interfaceC1695hT = ((U0) qVar).getType().O0().t();
            interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            if (interfaceC1692e != null && interfaceC1692e.i() != EnumC1693f.f15144D && interfaceC1692e.i() != EnumC1693f.f15147G) {
                interfaceC1692e = next;
                break;
            }
        }
        q qVar2 = (q) interfaceC1692e;
        if (qVar2 == null) {
            qVar2 = (q) kotlin.collections.r.l0(upperBounds);
        }
        return (qVar2 == null || (dVarB = b(qVar2)) == null) ? P.b(Object.class) : dVarB;
    }

    public static final Ia.d<?> b(q qVar) {
        Ia.d<?> dVarA;
        C3862t.g(qVar, "<this>");
        f fVarD = qVar.d();
        if (fVarD != null && (dVarA = a(fVarD)) != null) {
            return dVarA;
        }
        throw new Y0("Cannot calculate JVM erasure for type: " + qVar);
    }
}
