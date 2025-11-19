package fb;

import Hb.AbstractC1082f0;
import Hb.D0;
import Hb.E0;
import Hb.InterfaceC1080e0;
import Hb.K;
import Hb.U;
import Hb.u0;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ub.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import sb.w;

/* compiled from: RawType.kt */
/* renamed from: fb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3364k extends K implements InterfaceC1080e0 {
    private C3364k(AbstractC1082f0 abstractC1082f0, AbstractC1082f0 abstractC1082f02, boolean z10) {
        super(abstractC1082f0, abstractC1082f02);
        if (z10) {
            return;
        }
        Ib.e.f6980a.b(abstractC1082f0, abstractC1082f02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c1(String it) {
        C3862t.g(it, "it");
        return "(raw) " + it;
    }

    private static final boolean d1(String str, String str2) {
        return C3862t.b(str, n.p0(str2, "out ")) || C3862t.b(str2, "*");
    }

    private static final List<String> e1(sb.n nVar, U u10) {
        List<E0> listM0 = u10.M0();
        ArrayList arrayList = new ArrayList(r.x(listM0, 10));
        Iterator<T> it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.V((E0) it.next()));
        }
        return arrayList;
    }

    private static final String f1(String str, String str2) {
        if (!n.K(str, '<', false, 2, null)) {
            return str;
        }
        return n.P0(str, '<', null, 2, null) + '<' + str2 + '>' + n.L0(str, '>', null, 2, null);
    }

    @Override // Hb.K
    public AbstractC1082f0 V0() {
        return W0();
    }

    @Override // Hb.K
    public String Y0(sb.n renderer, w options) {
        C3862t.g(renderer, "renderer");
        C3862t.g(options, "options");
        String strU = renderer.U(W0());
        String strU2 = renderer.U(X0());
        if (options.p()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (X0().M0().isEmpty()) {
            return renderer.R(strU, strU2, Mb.d.n(this));
        }
        List<String> listE1 = e1(renderer, W0());
        List<String> listE12 = e1(renderer, X0());
        List<String> list = listE1;
        String strS0 = r.s0(list, ", ", null, null, 0, null, C3363j.f41451B, 30, null);
        List<C4170o> listE13 = r.e1(list, listE12);
        if ((listE13 instanceof Collection) && listE13.isEmpty()) {
            strU2 = f1(strU2, strS0);
        } else {
            for (C4170o c4170o : listE13) {
                if (!d1((String) c4170o.c(), (String) c4170o.d())) {
                    break;
                }
            }
            strU2 = f1(strU2, strS0);
        }
        String strF1 = f1(strU, strS0);
        return C3862t.b(strF1, strU2) ? strF1 : renderer.R(strF1, strU2, Mb.d.n(this));
    }

    @Override // Hb.P0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C3364k S0(boolean z10) {
        return new C3364k(W0().S0(z10), X0().S0(z10));
    }

    @Override // Hb.P0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public K Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(W0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        U uA2 = kotlinTypeRefiner.a(X0());
        C3862t.e(uA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C3364k((AbstractC1082f0) uA, (AbstractC1082f0) uA2, true);
    }

    @Override // Hb.P0
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C3364k U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new C3364k(W0().U0(newAttributes), X0().U0(newAttributes));
    }

    @Override // Hb.K, Hb.U
    public Ab.k s() {
        InterfaceC1695h interfaceC1695hT = O0().t();
        D0 d02 = null;
        byte b10 = 0;
        InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
        if (interfaceC1692e != null) {
            Ab.k kVarH0 = interfaceC1692e.H0(new C3362i(d02, 1, b10 == true ? 1 : 0));
            C3862t.f(kVarH0, "getMemberScope(...)");
            return kVarH0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + O0().t()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3364k(AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
        this(lowerBound, upperBound, false);
        C3862t.g(lowerBound, "lowerBound");
        C3862t.g(upperBound, "upperBound");
    }
}
