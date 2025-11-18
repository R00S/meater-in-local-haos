package kotlin.reflect.p371y.internal.p374j0.p415l.p420x1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10343e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10336b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10363k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10376p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10378p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10386s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10416u0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;

/* compiled from: TypeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x1.a */
/* loaded from: classes3.dex */
public final class C10457a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x1.a$a */
    static final class a extends Lambda implements Function1<AbstractC10381q1, Boolean> {

        /* renamed from: f */
        public static final a f40384f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10381q1 abstractC10381q1) {
            C9801m.m32346f(abstractC10381q1, "it");
            InterfaceC10594h interfaceC10594hMo32887c = abstractC10381q1.mo35993O0().mo32891w();
            return Boolean.valueOf(interfaceC10594hMo32887c != null ? C10457a.m37150p(interfaceC10594hMo32887c) : false);
        }
    }

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x1.a$b */
    static final class b extends Lambda implements Function1<AbstractC10381q1, Boolean> {

        /* renamed from: f */
        public static final b f40385f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10381q1 abstractC10381q1) {
            C9801m.m32346f(abstractC10381q1, "it");
            InterfaceC10594h interfaceC10594hMo32887c = abstractC10381q1.mo35993O0().mo32891w();
            boolean z = false;
            if (interfaceC10594hMo32887c != null && ((interfaceC10594hMo32887c instanceof InterfaceC10584d1) || (interfaceC10594hMo32887c instanceof InterfaceC10587e1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final InterfaceC10351g1 m37135a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return new C10357i1(abstractC10344e0);
    }

    /* renamed from: b */
    public static final boolean m37136b(AbstractC10344e0 abstractC10344e0, Function1<? super AbstractC10381q1, Boolean> function1) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(function1, "predicate");
        return C10372n1.m36770c(abstractC10344e0, function1);
    }

    /* renamed from: c */
    private static final boolean m37137c(AbstractC10344e0 abstractC10344e0, InterfaceC10345e1 interfaceC10345e1, Set<? extends InterfaceC10587e1> set) {
        boolean zM37137c;
        if (C9801m.m32341a(abstractC10344e0.mo35993O0(), interfaceC10345e1)) {
            return true;
        }
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w();
        InterfaceC10597i interfaceC10597i = interfaceC10594hMo32887c instanceof InterfaceC10597i ? (InterfaceC10597i) interfaceC10594hMo32887c : null;
        List<InterfaceC10587e1> listMo32884w = interfaceC10597i != null ? interfaceC10597i.mo32884w() : null;
        Iterable<IndexedValue> iterableM38578K0 = C10782c0.m38578K0(abstractC10344e0.mo35991M0());
        if (!(iterableM38578K0 instanceof Collection) || !((Collection) iterableM38578K0).isEmpty()) {
            for (IndexedValue indexedValue : iterableM38578K0) {
                int index = indexedValue.getIndex();
                InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) indexedValue.m38648b();
                InterfaceC10587e1 interfaceC10587e1 = listMo32884w != null ? (InterfaceC10587e1) C10813s.m38833X(listMo32884w, index) : null;
                if (((interfaceC10587e1 == null || set == null || !set.contains(interfaceC10587e1)) ? false : true) || interfaceC10351g1.mo36710c()) {
                    zM37137c = false;
                } else {
                    AbstractC10344e0 type = interfaceC10351g1.getType();
                    C9801m.m32345e(type, "argument.type");
                    zM37137c = m37137c(type, interfaceC10345e1, set);
                }
                if (zM37137c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m37138d(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return m37136b(abstractC10344e0, a.f40384f);
    }

    /* renamed from: e */
    public static final InterfaceC10351g1 m37139e(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1, InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(abstractC10344e0, "type");
        C9801m.m32346f(enumC10384r1, "projectionKind");
        if ((interfaceC10587e1 != null ? interfaceC10587e1.mo37672n() : null) == enumC10384r1) {
            enumC10384r1 = EnumC10384r1.INVARIANT;
        }
        return new C10357i1(enumC10384r1, abstractC10344e0);
    }

    /* renamed from: f */
    public static final Set<InterfaceC10587e1> m37140f(AbstractC10344e0 abstractC10344e0, Set<? extends InterfaceC10587e1> set) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m37141g(abstractC10344e0, abstractC10344e0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private static final void m37141g(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, Set<InterfaceC10587e1> set, Set<? extends InterfaceC10587e1> set2) {
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w();
        if (interfaceC10594hMo32887c instanceof InterfaceC10587e1) {
            if (!C9801m.m32341a(abstractC10344e0.mo35993O0(), abstractC10344e02.mo35993O0())) {
                set.add(interfaceC10594hMo32887c);
                return;
            }
            for (AbstractC10344e0 abstractC10344e03 : ((InterfaceC10587e1) interfaceC10594hMo32887c).getUpperBounds()) {
                C9801m.m32345e(abstractC10344e03, "upperBound");
                m37141g(abstractC10344e03, abstractC10344e02, set, set2);
            }
            return;
        }
        InterfaceC10594h interfaceC10594hMo32887c2 = abstractC10344e0.mo35993O0().mo32891w();
        InterfaceC10597i interfaceC10597i = interfaceC10594hMo32887c2 instanceof InterfaceC10597i ? (InterfaceC10597i) interfaceC10594hMo32887c2 : null;
        List<InterfaceC10587e1> listMo32884w = interfaceC10597i != null ? interfaceC10597i.mo32884w() : null;
        int i2 = 0;
        for (InterfaceC10351g1 interfaceC10351g1 : abstractC10344e0.mo35991M0()) {
            int i3 = i2 + 1;
            InterfaceC10587e1 interfaceC10587e1 = listMo32884w != null ? (InterfaceC10587e1) C10813s.m38833X(listMo32884w, i2) : null;
            if (!((interfaceC10587e1 == null || set2 == null || !set2.contains(interfaceC10587e1)) ? false : true) && !interfaceC10351g1.mo36710c() && !C10782c0.m38577K(set, interfaceC10351g1.getType().mo35993O0().mo32891w()) && !C9801m.m32341a(interfaceC10351g1.getType().mo35993O0(), abstractC10344e02.mo35993O0())) {
                AbstractC10344e0 type = interfaceC10351g1.getType();
                C9801m.m32345e(type, "argument.type");
                m37141g(type, abstractC10344e02, set, set2);
            }
            i2 = i3;
        }
    }

    /* renamed from: h */
    public static final AbstractC9914h m37142h(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC9914h abstractC9914hMo36004o = abstractC10344e0.mo35993O0().mo36004o();
        C9801m.m32345e(abstractC9914hMo36004o, "constructor.builtIns");
        return abstractC9914hMo36004o;
    }

    /* renamed from: i */
    public static final AbstractC10344e0 m37143i(InterfaceC10587e1 interfaceC10587e1) {
        Object obj;
        C9801m.m32346f(interfaceC10587e1, "<this>");
        List<AbstractC10344e0> upperBounds = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<AbstractC10344e0> upperBounds2 = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10594h interfaceC10594hMo32887c = ((AbstractC10344e0) next).mo35993O0().mo32891w();
            InterfaceC10585e interfaceC10585e = interfaceC10594hMo32887c instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32887c : null;
            boolean z = false;
            if (interfaceC10585e != null && interfaceC10585e.mo32878i() != EnumC10588f.INTERFACE && interfaceC10585e.mo32878i() != EnumC10588f.ANNOTATION_CLASS) {
                z = true;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) obj;
        if (abstractC10344e0 != null) {
            return abstractC10344e0;
        }
        List<AbstractC10344e0> upperBounds3 = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds3, "upperBounds");
        Object objM38830U = C10813s.m38830U(upperBounds3);
        C9801m.m32345e(objM38830U, "upperBounds.first()");
        return (AbstractC10344e0) objM38830U;
    }

    /* renamed from: j */
    public static final boolean m37144j(InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        return m37146l(interfaceC10587e1, null, null, 6, null);
    }

    /* renamed from: k */
    public static final boolean m37145k(InterfaceC10587e1 interfaceC10587e1, InterfaceC10345e1 interfaceC10345e1, Set<? extends InterfaceC10587e1> set) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        List<AbstractC10344e0> upperBounds = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (AbstractC10344e0 abstractC10344e0 : upperBounds) {
                C9801m.m32345e(abstractC10344e0, "upperBound");
                if (m37137c(abstractC10344e0, interfaceC10587e1.mo36400s().mo35993O0(), set) && (interfaceC10345e1 == null || C9801m.m32341a(abstractC10344e0.mo35993O0(), interfaceC10345e1))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m37146l(InterfaceC10587e1 interfaceC10587e1, InterfaceC10345e1 interfaceC10345e1, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC10345e1 = null;
        }
        if ((i2 & 4) != 0) {
            set = null;
        }
        return m37145k(interfaceC10587e1, interfaceC10345e1, set);
    }

    /* renamed from: m */
    public static final boolean m37147m(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        if (!(abstractC10344e0 instanceof AbstractC10343e)) {
            if (!((abstractC10344e0 instanceof C10376p) && (((C10376p) abstractC10344e0).m36794a1() instanceof AbstractC10343e))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m37148n(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        if (!(abstractC10344e0 instanceof C10416u0)) {
            if (!((abstractC10344e0 instanceof C10376p) && (((C10376p) abstractC10344e0).m36794a1() instanceof C10416u0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m37149o(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(abstractC10344e02, "superType");
        return InterfaceC10394e.f40181a.mo36920d(abstractC10344e0, abstractC10344e02);
    }

    /* renamed from: p */
    public static final boolean m37150p(InterfaceC10594h interfaceC10594h) {
        C9801m.m32346f(interfaceC10594h, "<this>");
        return (interfaceC10594h instanceof InterfaceC10587e1) && (((InterfaceC10587e1) interfaceC10594h).mo32876b() instanceof InterfaceC10584d1);
    }

    /* renamed from: q */
    public static final boolean m37151q(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return C10372n1.m36780m(abstractC10344e0);
    }

    /* renamed from: r */
    public static final boolean m37152r(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
        return (abstractC10344e0 instanceof C10424h) && ((C10424h) abstractC10344e0).m37044Y0().m37050q();
    }

    /* renamed from: s */
    public static final AbstractC10344e0 m37153s(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10344e0 abstractC10344e0M36781n = C10372n1.m36781n(abstractC10344e0);
        C9801m.m32345e(abstractC10344e0M36781n, "makeNotNullable(this)");
        return abstractC10344e0M36781n;
    }

    /* renamed from: t */
    public static final AbstractC10344e0 m37154t(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10344e0 abstractC10344e0M36782o = C10372n1.m36782o(abstractC10344e0);
        C9801m.m32345e(abstractC10344e0M36782o, "makeNullable(this)");
        return abstractC10344e0M36782o;
    }

    /* renamed from: u */
    public static final AbstractC10344e0 m37155u(AbstractC10344e0 abstractC10344e0, InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(interfaceC10620g, "newAnnotations");
        return (abstractC10344e0.getAnnotations().isEmpty() && interfaceC10620g.isEmpty()) ? abstractC10344e0 : abstractC10344e0.mo36635R0().mo33547U0(C10336b1.m36586a(abstractC10344e0.mo35992N0(), interfaceC10620g));
    }

    /* renamed from: v */
    public static final AbstractC10344e0 m37156v(AbstractC10344e0 abstractC10344e0, C10366l1 c10366l1, Map<InterfaceC10345e1, ? extends InterfaceC10351g1> map, EnumC10384r1 enumC10384r1, Set<? extends InterfaceC10587e1> set) {
        AbstractC10381q1 abstractC10381q1M36739f;
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(c10366l1, "substitutor");
        C9801m.m32346f(map, "substitutionMap");
        C9801m.m32346f(enumC10384r1, "variance");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1Mo36635R0;
            AbstractC10368m0 abstractC10368m0M37161W0 = abstractC10458y.m37161W0();
            if (!abstractC10368m0M37161W0.mo35993O0().getParameters().isEmpty() && abstractC10368m0M37161W0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10587e1> parameters = abstractC10368m0M37161W0.mo35993O0().getParameters();
                C9801m.m32345e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
                for (InterfaceC10587e1 interfaceC10587e1 : parameters) {
                    InterfaceC10351g1 c10386s0 = (InterfaceC10351g1) C10813s.m38833X(abstractC10344e0.mo35991M0(), interfaceC10587e1.mo37670g());
                    if ((set != null && set.contains(interfaceC10587e1)) || c10386s0 == null || !map.containsKey(c10386s0.getType().mo35993O0())) {
                        c10386s0 = new C10386s0(interfaceC10587e1);
                    }
                    arrayList.add(c10386s0);
                }
                abstractC10368m0M37161W0 = C10363k1.m36739f(abstractC10368m0M37161W0, arrayList, null, 2, null);
            }
            AbstractC10368m0 abstractC10368m0M37162X0 = abstractC10458y.m37162X0();
            if (!abstractC10368m0M37162X0.mo35993O0().getParameters().isEmpty() && abstractC10368m0M37162X0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10587e1> parameters2 = abstractC10368m0M37162X0.mo35993O0().getParameters();
                C9801m.m32345e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(parameters2, 10));
                for (InterfaceC10587e1 interfaceC10587e12 : parameters2) {
                    InterfaceC10351g1 c10386s02 = (InterfaceC10351g1) C10813s.m38833X(abstractC10344e0.mo35991M0(), interfaceC10587e12.mo37670g());
                    if ((set != null && set.contains(interfaceC10587e12)) || c10386s02 == null || !map.containsKey(c10386s02.getType().mo35993O0())) {
                        c10386s02 = new C10386s0(interfaceC10587e12);
                    }
                    arrayList2.add(c10386s02);
                }
                abstractC10368m0M37162X0 = C10363k1.m36739f(abstractC10368m0M37162X0, arrayList2, null, 2, null);
            }
            abstractC10381q1M36739f = C10347f0.m36664d(abstractC10368m0M37161W0, abstractC10368m0M37162X0);
        } else {
            if (!(abstractC10381q1Mo36635R0 instanceof AbstractC10368m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10368m0 abstractC10368m0 = (AbstractC10368m0) abstractC10381q1Mo36635R0;
            if (abstractC10368m0.mo35993O0().getParameters().isEmpty() || abstractC10368m0.mo35993O0().mo32891w() == null) {
                abstractC10381q1M36739f = abstractC10368m0;
            } else {
                List<InterfaceC10587e1> parameters3 = abstractC10368m0.mo35993O0().getParameters();
                C9801m.m32345e(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C10819v.m38911u(parameters3, 10));
                for (InterfaceC10587e1 interfaceC10587e13 : parameters3) {
                    InterfaceC10351g1 c10386s03 = (InterfaceC10351g1) C10813s.m38833X(abstractC10344e0.mo35991M0(), interfaceC10587e13.mo37670g());
                    if ((set != null && set.contains(interfaceC10587e13)) || c10386s03 == null || !map.containsKey(c10386s03.getType().mo35993O0())) {
                        c10386s03 = new C10386s0(interfaceC10587e13);
                    }
                    arrayList3.add(c10386s03);
                }
                abstractC10381q1M36739f = C10363k1.m36739f(abstractC10368m0, arrayList3, null, 2, null);
            }
        }
        AbstractC10344e0 abstractC10344e0M36758n = c10366l1.m36758n(C10378p1.m36804b(abstractC10381q1M36739f, abstractC10381q1Mo36635R0), enumC10384r1);
        C9801m.m32345e(abstractC10344e0M36758n, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return abstractC10344e0M36758n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.f0.y.e.j0.l.q1] */
    /* renamed from: w */
    public static final AbstractC10344e0 m37157w(AbstractC10344e0 abstractC10344e0) {
        AbstractC10368m0 abstractC10368m0M36739f;
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1Mo36635R0;
            AbstractC10368m0 abstractC10368m0M37161W0 = abstractC10458y.m37161W0();
            if (!abstractC10368m0M37161W0.mo35993O0().getParameters().isEmpty() && abstractC10368m0M37161W0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10587e1> parameters = abstractC10368m0M37161W0.mo35993O0().getParameters();
                C9801m.m32345e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C10386s0((InterfaceC10587e1) it.next()));
                }
                abstractC10368m0M37161W0 = C10363k1.m36739f(abstractC10368m0M37161W0, arrayList, null, 2, null);
            }
            AbstractC10368m0 abstractC10368m0M37162X0 = abstractC10458y.m37162X0();
            if (!abstractC10368m0M37162X0.mo35993O0().getParameters().isEmpty() && abstractC10368m0M37162X0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10587e1> parameters2 = abstractC10368m0M37162X0.mo35993O0().getParameters();
                C9801m.m32345e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C10386s0((InterfaceC10587e1) it2.next()));
                }
                abstractC10368m0M37162X0 = C10363k1.m36739f(abstractC10368m0M37162X0, arrayList2, null, 2, null);
            }
            abstractC10368m0M36739f = C10347f0.m36664d(abstractC10368m0M37161W0, abstractC10368m0M37162X0);
        } else {
            if (!(abstractC10381q1Mo36635R0 instanceof AbstractC10368m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10368m0 abstractC10368m0 = (AbstractC10368m0) abstractC10381q1Mo36635R0;
            boolean zIsEmpty = abstractC10368m0.mo35993O0().getParameters().isEmpty();
            abstractC10368m0M36739f = abstractC10368m0;
            if (!zIsEmpty) {
                InterfaceC10594h interfaceC10594hMo32887c = abstractC10368m0.mo35993O0().mo32891w();
                abstractC10368m0M36739f = abstractC10368m0;
                if (interfaceC10594hMo32887c != null) {
                    List<InterfaceC10587e1> parameters3 = abstractC10368m0.mo35993O0().getParameters();
                    C9801m.m32345e(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C10819v.m38911u(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C10386s0((InterfaceC10587e1) it3.next()));
                    }
                    abstractC10368m0M36739f = C10363k1.m36739f(abstractC10368m0, arrayList3, null, 2, null);
                }
            }
        }
        return C10378p1.m36804b(abstractC10368m0M36739f, abstractC10381q1Mo36635R0);
    }

    /* renamed from: x */
    public static final boolean m37158x(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return m37136b(abstractC10344e0, b.f40385f);
    }
}
