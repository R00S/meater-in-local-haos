package ab;

import Hb.D0;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.c0;
import Ra.g0;
import Ra.m0;
import Ra.t0;
import fb.C3362i;
import fb.C3364k;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import tb.C4603o;
import tb.InterfaceC4598j;

/* compiled from: ErasedOverridabilityCondition.kt */
/* renamed from: ab.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1957q implements InterfaceC4598j {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: ab.q$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20266a;

        static {
            int[] iArr = new int[C4603o.i.a.values().length];
            try {
                iArr[C4603o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f20266a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hb.U d(t0 t0Var) {
        return t0Var.a();
    }

    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.b a(InterfaceC1688a superDescriptor, InterfaceC1688a subDescriptor, InterfaceC1692e interfaceC1692e) {
        C3862t.g(superDescriptor, "superDescriptor");
        C3862t.g(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof cb.e) {
            cb.e eVar = (cb.e) subDescriptor;
            List<m0> typeParameters = eVar.getTypeParameters();
            C3862t.f(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                C4603o.i iVarW = C4603o.w(superDescriptor, subDescriptor);
                D0 d02 = null;
                byte b10 = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return InterfaceC4598j.b.UNKNOWN;
                }
                List<t0> listK = eVar.k();
                C3862t.f(listK, "getValueParameters(...)");
                Tb.h hVarA = Tb.k.A(kotlin.collections.r.Z(listK), C1956p.f20265B);
                Hb.U returnType = eVar.getReturnType();
                C3862t.d(returnType);
                Tb.h hVarE = Tb.k.E(hVarA, returnType);
                c0 c0VarJ0 = eVar.j0();
                for (Hb.U u10 : Tb.k.D(hVarE, kotlin.collections.r.q(c0VarJ0 != null ? c0VarJ0.a() : null))) {
                    if (!u10.M0().isEmpty() && !(u10.R0() instanceof C3364k)) {
                        return InterfaceC4598j.b.UNKNOWN;
                    }
                }
                InterfaceC1688a interfaceC1688aD = superDescriptor.d(new C3362i(d02, 1, b10 == true ? 1 : 0).c());
                if (interfaceC1688aD == null) {
                    return InterfaceC4598j.b.UNKNOWN;
                }
                if (interfaceC1688aD instanceof g0) {
                    g0 g0Var = (g0) interfaceC1688aD;
                    List<m0> typeParameters2 = g0Var.getTypeParameters();
                    C3862t.f(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC1688aD = g0Var.v().k(kotlin.collections.r.m()).e();
                        C3862t.d(interfaceC1688aD);
                    }
                }
                C4603o.i.a aVarC = C4603o.f50027f.F(interfaceC1688aD, subDescriptor, false).c();
                C3862t.f(aVarC, "getResult(...)");
                return a.f20266a[aVarC.ordinal()] == 1 ? InterfaceC4598j.b.OVERRIDABLE : InterfaceC4598j.b.UNKNOWN;
            }
        }
        return InterfaceC4598j.b.UNKNOWN;
    }

    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.a b() {
        return InterfaceC4598j.a.SUCCESS_ONLY;
    }
}
