package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: TypeAliasExpander.kt */
/* renamed from: kotlin.f0.y.e.j0.l.v0 */
/* loaded from: classes3.dex */
public final class C10430v0 {

    /* renamed from: a */
    public static final a f40363a = new a(null);

    /* renamed from: b */
    private static final C10430v0 f40364b = new C10430v0(InterfaceC10456x0.a.f40383a, false);

    /* renamed from: c */
    private final InterfaceC10456x0 f40365c;

    /* renamed from: d */
    private final boolean f40366d;

    /* compiled from: TypeAliasExpander.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.v0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m37083b(int i2, InterfaceC10584d1 interfaceC10584d1) {
            if (i2 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + interfaceC10584d1.getName());
        }
    }

    public C10430v0(InterfaceC10456x0 interfaceC10456x0, boolean z) {
        C9801m.m32346f(interfaceC10456x0, "reportStrategy");
        this.f40365c = interfaceC10456x0;
        this.f40366d = z;
    }

    /* renamed from: a */
    private final void m37069a(InterfaceC10620g interfaceC10620g, InterfaceC10620g interfaceC10620g2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10616c> it = interfaceC10620g.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo33162d());
        }
        for (InterfaceC10616c interfaceC10616c : interfaceC10620g2) {
            if (hashSet.contains(interfaceC10616c.mo33162d())) {
                this.f40365c.mo37131a(interfaceC10616c);
            }
        }
    }

    /* renamed from: b */
    private final void m37070b(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C10366l1 c10366l1M36746f = C10366l1.m36746f(abstractC10344e02);
        C9801m.m32345e(c10366l1M36746f, "create(substitutedType)");
        int i2 = 0;
        for (Object obj : abstractC10344e02.mo35991M0()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10817u.m38898t();
            }
            InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) obj;
            if (!interfaceC10351g1.mo36710c()) {
                AbstractC10344e0 type = interfaceC10351g1.getType();
                C9801m.m32345e(type, "substitutedArgument.type");
                if (!C10457a.m37138d(type)) {
                    InterfaceC10351g1 interfaceC10351g12 = abstractC10344e0.mo35991M0().get(i2);
                    InterfaceC10587e1 interfaceC10587e1 = abstractC10344e0.mo35993O0().getParameters().get(i2);
                    if (this.f40366d) {
                        InterfaceC10456x0 interfaceC10456x0 = this.f40365c;
                        AbstractC10344e0 type2 = interfaceC10351g12.getType();
                        C9801m.m32345e(type2, "unsubstitutedArgument.type");
                        AbstractC10344e0 type3 = interfaceC10351g1.getType();
                        C9801m.m32345e(type3, "substitutedArgument.type");
                        C9801m.m32345e(interfaceC10587e1, "typeParameter");
                        interfaceC10456x0.mo37133c(c10366l1M36746f, type2, type3, interfaceC10587e1);
                    }
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: c */
    private final C10429v m37071c(C10429v c10429v, C10333a1 c10333a1) {
        return c10429v.mo33547U0(m37076h(c10429v, c10333a1));
    }

    /* renamed from: d */
    private final AbstractC10368m0 m37072d(AbstractC10368m0 abstractC10368m0, C10333a1 c10333a1) {
        return C10350g0.m36706a(abstractC10368m0) ? abstractC10368m0 : C10363k1.m36739f(abstractC10368m0, null, m37076h(abstractC10368m0, c10333a1), 1, null);
    }

    /* renamed from: e */
    private final AbstractC10368m0 m37073e(AbstractC10368m0 abstractC10368m0, AbstractC10344e0 abstractC10344e0) {
        AbstractC10368m0 abstractC10368m0M36785r = C10372n1.m36785r(abstractC10368m0, abstractC10344e0.mo33691P0());
        C9801m.m32345e(abstractC10368m0M36785r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return abstractC10368m0M36785r;
    }

    /* renamed from: f */
    private final AbstractC10368m0 m37074f(AbstractC10368m0 abstractC10368m0, AbstractC10344e0 abstractC10344e0) {
        return m37072d(m37073e(abstractC10368m0, abstractC10344e0), abstractC10344e0.mo35992N0());
    }

    /* renamed from: g */
    private final AbstractC10368m0 m37075g(C10433w0 c10433w0, C10333a1 c10333a1, boolean z) {
        InterfaceC10345e1 interfaceC10345e1Mo32877h = c10433w0.m37087b().mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "descriptor.typeConstructor");
        return C10347f0.m36670j(c10333a1, interfaceC10345e1Mo32877h, c10433w0.m37086a(), z, InterfaceC10251h.b.f39671b);
    }

    /* renamed from: h */
    private final C10333a1 m37076h(AbstractC10344e0 abstractC10344e0, C10333a1 c10333a1) {
        return C10350g0.m36706a(abstractC10344e0) ? abstractC10344e0.mo35992N0() : c10333a1.m36569n(abstractC10344e0.mo35992N0());
    }

    /* renamed from: j */
    private final InterfaceC10351g1 m37077j(InterfaceC10351g1 interfaceC10351g1, C10433w0 c10433w0, int i2) {
        AbstractC10381q1 abstractC10381q1Mo36635R0 = interfaceC10351g1.getType().mo36635R0();
        if (C10432w.m37085a(abstractC10381q1Mo36635R0)) {
            return interfaceC10351g1;
        }
        AbstractC10368m0 abstractC10368m0M36734a = C10363k1.m36734a(abstractC10381q1Mo36635R0);
        if (C10350g0.m36706a(abstractC10368m0M36734a) || !C10457a.m37158x(abstractC10368m0M36734a)) {
            return interfaceC10351g1;
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10368m0M36734a.mo35993O0();
        InterfaceC10594h interfaceC10594hMo32891w = interfaceC10345e1Mo35993O0.mo32891w();
        interfaceC10345e1Mo35993O0.getParameters().size();
        abstractC10368m0M36734a.mo35991M0().size();
        if (interfaceC10594hMo32891w instanceof InterfaceC10587e1) {
            return interfaceC10351g1;
        }
        if (!(interfaceC10594hMo32891w instanceof InterfaceC10584d1)) {
            AbstractC10368m0 abstractC10368m0M37080m = m37080m(abstractC10368m0M36734a, c10433w0, i2);
            m37070b(abstractC10368m0M36734a, abstractC10368m0M37080m);
            return new C10357i1(interfaceC10351g1.mo36708a(), abstractC10368m0M37080m);
        }
        InterfaceC10584d1 interfaceC10584d1 = (InterfaceC10584d1) interfaceC10594hMo32891w;
        int i3 = 0;
        if (c10433w0.m37089d(interfaceC10584d1)) {
            this.f40365c.mo37134d(interfaceC10584d1);
            EnumC10384r1 enumC10384r1 = EnumC10384r1.INVARIANT;
            EnumC10426j enumC10426j = EnumC10426j.f40343v;
            String string = interfaceC10584d1.getName().toString();
            C9801m.m32345e(string, "typeDescriptor.name.toString()");
            return new C10357i1(enumC10384r1, C10427k.m37053d(enumC10426j, string));
        }
        List<InterfaceC10351g1> listMo35991M0 = abstractC10368m0M36734a.mo35991M0();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo35991M0, 10));
        for (Object obj : listMo35991M0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C10817u.m38898t();
            }
            arrayList.add(m37079l((InterfaceC10351g1) obj, c10433w0, interfaceC10345e1Mo35993O0.getParameters().get(i3), i2 + 1));
            i3 = i4;
        }
        AbstractC10368m0 abstractC10368m0M37078k = m37078k(C10433w0.f40368a.m37090a(c10433w0, interfaceC10584d1, arrayList), abstractC10368m0M36734a.mo35992N0(), abstractC10368m0M36734a.mo33691P0(), i2 + 1, false);
        AbstractC10368m0 abstractC10368m0M37080m2 = m37080m(abstractC10368m0M36734a, c10433w0, i2);
        if (!C10432w.m37085a(abstractC10368m0M37078k)) {
            abstractC10368m0M37078k = C10380q0.m36816j(abstractC10368m0M37078k, abstractC10368m0M37080m2);
        }
        return new C10357i1(interfaceC10351g1.mo36708a(), abstractC10368m0M37078k);
    }

    /* renamed from: k */
    private final AbstractC10368m0 m37078k(C10433w0 c10433w0, C10333a1 c10333a1, boolean z, int i2, boolean z2) {
        InterfaceC10351g1 interfaceC10351g1M37079l = m37079l(new C10357i1(EnumC10384r1.INVARIANT, c10433w0.m37087b().mo36397g0()), c10433w0, null, i2);
        AbstractC10344e0 type = interfaceC10351g1M37079l.getType();
        C9801m.m32345e(type, "expandedProjection.type");
        AbstractC10368m0 abstractC10368m0M36734a = C10363k1.m36734a(type);
        if (C10350g0.m36706a(abstractC10368m0M36734a)) {
            return abstractC10368m0M36734a;
        }
        interfaceC10351g1M37079l.mo36708a();
        m37069a(abstractC10368m0M36734a.getAnnotations(), C10361k.m36731a(c10333a1));
        AbstractC10368m0 abstractC10368m0M36785r = C10372n1.m36785r(m37072d(abstractC10368m0M36734a, c10333a1), z);
        C9801m.m32345e(abstractC10368m0M36785r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z2 ? C10380q0.m36816j(abstractC10368m0M36785r, m37075g(c10433w0, c10333a1, z)) : abstractC10368m0M36785r;
    }

    /* renamed from: l */
    private final InterfaceC10351g1 m37079l(InterfaceC10351g1 interfaceC10351g1, C10433w0 c10433w0, InterfaceC10587e1 interfaceC10587e1, int i2) {
        EnumC10384r1 enumC10384r1Mo37672n;
        EnumC10384r1 enumC10384r1;
        EnumC10384r1 enumC10384r12;
        f40363a.m37083b(i2, c10433w0.m37087b());
        if (interfaceC10351g1.mo36710c()) {
            C9801m.m32343c(interfaceC10587e1);
            InterfaceC10351g1 interfaceC10351g1M36786s = C10372n1.m36786s(interfaceC10587e1);
            C9801m.m32345e(interfaceC10351g1M36786s, "makeStarProjection(typeParameterDescriptor!!)");
            return interfaceC10351g1M36786s;
        }
        AbstractC10344e0 type = interfaceC10351g1.getType();
        C9801m.m32345e(type, "underlyingProjection.type");
        InterfaceC10351g1 interfaceC10351g1M37088c = c10433w0.m37088c(type.mo35993O0());
        if (interfaceC10351g1M37088c == null) {
            return m37077j(interfaceC10351g1, c10433w0, i2);
        }
        if (interfaceC10351g1M37088c.mo36710c()) {
            C9801m.m32343c(interfaceC10587e1);
            InterfaceC10351g1 interfaceC10351g1M36786s2 = C10372n1.m36786s(interfaceC10587e1);
            C9801m.m32345e(interfaceC10351g1M36786s2, "makeStarProjection(typeParameterDescriptor!!)");
            return interfaceC10351g1M36786s2;
        }
        AbstractC10381q1 abstractC10381q1Mo36635R0 = interfaceC10351g1M37088c.getType().mo36635R0();
        EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1M37088c.mo36708a();
        C9801m.m32345e(enumC10384r1Mo36708a, "argument.projectionKind");
        EnumC10384r1 enumC10384r1Mo36708a2 = interfaceC10351g1.mo36708a();
        C9801m.m32345e(enumC10384r1Mo36708a2, "underlyingProjection.projectionKind");
        if (enumC10384r1Mo36708a2 != enumC10384r1Mo36708a && enumC10384r1Mo36708a2 != (enumC10384r12 = EnumC10384r1.INVARIANT)) {
            if (enumC10384r1Mo36708a == enumC10384r12) {
                enumC10384r1Mo36708a = enumC10384r1Mo36708a2;
            } else {
                this.f40365c.mo37132b(c10433w0.m37087b(), interfaceC10587e1, abstractC10381q1Mo36635R0);
            }
        }
        if (interfaceC10587e1 == null || (enumC10384r1Mo37672n = interfaceC10587e1.mo37672n()) == null) {
            enumC10384r1Mo37672n = EnumC10384r1.INVARIANT;
        }
        C9801m.m32345e(enumC10384r1Mo37672n, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (enumC10384r1Mo37672n != enumC10384r1Mo36708a && enumC10384r1Mo37672n != (enumC10384r1 = EnumC10384r1.INVARIANT)) {
            if (enumC10384r1Mo36708a == enumC10384r1) {
                enumC10384r1Mo36708a = enumC10384r1;
            } else {
                this.f40365c.mo37132b(c10433w0.m37087b(), interfaceC10587e1, abstractC10381q1Mo36635R0);
            }
        }
        m37069a(type.getAnnotations(), abstractC10381q1Mo36635R0.getAnnotations());
        return new C10357i1(enumC10384r1Mo36708a, abstractC10381q1Mo36635R0 instanceof C10429v ? m37071c((C10429v) abstractC10381q1Mo36635R0, type.mo35992N0()) : m37074f(C10363k1.m36734a(abstractC10381q1Mo36635R0), type));
    }

    /* renamed from: m */
    private final AbstractC10368m0 m37080m(AbstractC10368m0 abstractC10368m0, C10433w0 c10433w0, int i2) {
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10368m0.mo35993O0();
        List<InterfaceC10351g1> listMo35991M0 = abstractC10368m0.mo35991M0();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo35991M0, 10));
        int i3 = 0;
        for (Object obj : listMo35991M0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C10817u.m38898t();
            }
            InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) obj;
            InterfaceC10351g1 interfaceC10351g1M37079l = m37079l(interfaceC10351g1, c10433w0, interfaceC10345e1Mo35993O0.getParameters().get(i3), i2 + 1);
            if (!interfaceC10351g1M37079l.mo36710c()) {
                interfaceC10351g1M37079l = new C10357i1(interfaceC10351g1M37079l.mo36708a(), C10372n1.m36784q(interfaceC10351g1M37079l.getType(), interfaceC10351g1.getType().mo33691P0()));
            }
            arrayList.add(interfaceC10351g1M37079l);
            i3 = i4;
        }
        return C10363k1.m36739f(abstractC10368m0, arrayList, null, 2, null);
    }

    /* renamed from: i */
    public final AbstractC10368m0 m37081i(C10433w0 c10433w0, C10333a1 c10333a1) {
        C9801m.m32346f(c10433w0, "typeAliasExpansion");
        C9801m.m32346f(c10333a1, "attributes");
        return m37078k(c10433w0, c10333a1, false, 0, true);
    }
}
