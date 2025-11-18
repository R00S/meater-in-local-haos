package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10398i;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.q0 */
/* loaded from: classes3.dex */
public final class C10380q0 {
    /* renamed from: a */
    public static final C10331a m36807a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof C10331a) {
            return (C10331a) abstractC10381q1Mo36635R0;
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC10368m0 m36808b(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C10331a c10331aM36807a = m36807a(abstractC10344e0);
        if (c10331aM36807a != null) {
            return c10331aM36807a.m36559a1();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m36809c(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return abstractC10344e0.mo36635R0() instanceof C10376p;
    }

    /* renamed from: d */
    private static final C10341d0 m36810d(C10341d0 c10341d0) {
        AbstractC10344e0 abstractC10344e0;
        Collection<AbstractC10344e0> collectionMo35998a = c10341d0.mo35998a();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo35998a, 10));
        Iterator<T> it = collectionMo35998a.iterator();
        boolean z = false;
        while (true) {
            abstractC10344e0 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC10344e0 abstractC10344e0M36812f = (AbstractC10344e0) it.next();
            if (C10372n1.m36779l(abstractC10344e0M36812f)) {
                abstractC10344e0M36812f = m36812f(abstractC10344e0M36812f.mo36635R0(), false, 1, null);
                z = true;
            }
            arrayList.add(abstractC10344e0M36812f);
        }
        if (!z) {
            return null;
        }
        AbstractC10344e0 abstractC10344e0M36603i = c10341d0.m36603i();
        if (abstractC10344e0M36603i != null) {
            if (C10372n1.m36779l(abstractC10344e0M36603i)) {
                abstractC10344e0M36603i = m36812f(abstractC10344e0M36603i.mo36635R0(), false, 1, null);
            }
            abstractC10344e0 = abstractC10344e0M36603i;
        }
        return new C10341d0(arrayList).m36606m(abstractC10344e0);
    }

    /* renamed from: e */
    public static final AbstractC10381q1 m36811e(AbstractC10381q1 abstractC10381q1, boolean z) {
        C9801m.m32346f(abstractC10381q1, "<this>");
        C10376p c10376pM36799b = C10376p.f40159g.m36799b(abstractC10381q1, z);
        if (c10376pM36799b != null) {
            return c10376pM36799b;
        }
        AbstractC10368m0 abstractC10368m0M36813g = m36813g(abstractC10381q1);
        return abstractC10368m0M36813g != null ? abstractC10368m0M36813g : abstractC10381q1.mo33545S0(false);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10381q1 m36812f(AbstractC10381q1 abstractC10381q1, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36811e(abstractC10381q1, z);
    }

    /* renamed from: g */
    private static final AbstractC10368m0 m36813g(AbstractC10344e0 abstractC10344e0) {
        C10341d0 c10341d0M36810d;
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        C10341d0 c10341d0 = interfaceC10345e1Mo35993O0 instanceof C10341d0 ? (C10341d0) interfaceC10345e1Mo35993O0 : null;
        if (c10341d0 == null || (c10341d0M36810d = m36810d(c10341d0)) == null) {
            return null;
        }
        return c10341d0M36810d.m36602h();
    }

    /* renamed from: h */
    public static final AbstractC10368m0 m36814h(AbstractC10368m0 abstractC10368m0, boolean z) {
        C9801m.m32346f(abstractC10368m0, "<this>");
        C10376p c10376pM36799b = C10376p.f40159g.m36799b(abstractC10368m0, z);
        if (c10376pM36799b != null) {
            return c10376pM36799b;
        }
        AbstractC10368m0 abstractC10368m0M36813g = m36813g(abstractC10368m0);
        return abstractC10368m0M36813g == null ? abstractC10368m0.mo33545S0(false) : abstractC10368m0M36813g;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC10368m0 m36815i(AbstractC10368m0 abstractC10368m0, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36814h(abstractC10368m0, z);
    }

    /* renamed from: j */
    public static final AbstractC10368m0 m36816j(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        C9801m.m32346f(abstractC10368m0, "<this>");
        C9801m.m32346f(abstractC10368m02, "abbreviatedType");
        return C10350g0.m36706a(abstractC10368m0) ? abstractC10368m0 : new C10331a(abstractC10368m0, abstractC10368m02);
    }

    /* renamed from: k */
    public static final C10398i m36817k(C10398i c10398i) {
        C9801m.m32346f(c10398i, "<this>");
        return new C10398i(c10398i.m36934X0(), c10398i.mo35993O0(), c10398i.m36936Z0(), c10398i.mo35992N0(), c10398i.mo33691P0(), true);
    }
}
