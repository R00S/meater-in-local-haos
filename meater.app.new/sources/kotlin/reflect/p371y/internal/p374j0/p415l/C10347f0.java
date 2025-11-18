package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10671u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10218n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10423g;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f0 */
/* loaded from: classes3.dex */
public final class C10347f0 {

    /* renamed from: a */
    public static final C10347f0 f40090a = new C10347f0();

    /* renamed from: b */
    private static final Function1<AbstractC10396g, AbstractC10368m0> f40091b = a.f40092f;

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$a */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f */
        public static final a f40092f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "<anonymous parameter 0>");
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$b */
    private static final class b {

        /* renamed from: a */
        private final AbstractC10368m0 f40093a;

        /* renamed from: b */
        private final InterfaceC10345e1 f40094b;

        public b(AbstractC10368m0 abstractC10368m0, InterfaceC10345e1 interfaceC10345e1) {
            this.f40093a = abstractC10368m0;
            this.f40094b = interfaceC10345e1;
        }

        /* renamed from: a */
        public final AbstractC10368m0 m36673a() {
            return this.f40093a;
        }

        /* renamed from: b */
        public final InterfaceC10345e1 m36674b() {
            return this.f40094b;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$c */
    static final class c extends Lambda implements Function1<AbstractC10396g, AbstractC10368m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10345e1 f40095f;

        /* renamed from: g */
        final /* synthetic */ List<InterfaceC10351g1> f40096g;

        /* renamed from: h */
        final /* synthetic */ C10333a1 f40097h;

        /* renamed from: i */
        final /* synthetic */ boolean f40098i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, C10333a1 c10333a1, boolean z) {
            super(1);
            this.f40095f = interfaceC10345e1;
            this.f40096g = list;
            this.f40097h = c10333a1;
            this.f40098i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "refiner");
            b bVarM36666f = C10347f0.f40090a.m36666f(this.f40095f, abstractC10396g, this.f40096g);
            if (bVarM36666f == null) {
                return null;
            }
            AbstractC10368m0 abstractC10368m0M36673a = bVarM36666f.m36673a();
            if (abstractC10368m0M36673a != null) {
                return abstractC10368m0M36673a;
            }
            C10333a1 c10333a1 = this.f40097h;
            InterfaceC10345e1 interfaceC10345e1M36674b = bVarM36666f.m36674b();
            C9801m.m32343c(interfaceC10345e1M36674b);
            return C10347f0.m36668h(c10333a1, interfaceC10345e1M36674b, this.f40096g, this.f40098i, abstractC10396g);
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$d */
    static final class d extends Lambda implements Function1<AbstractC10396g, AbstractC10368m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10345e1 f40099f;

        /* renamed from: g */
        final /* synthetic */ List<InterfaceC10351g1> f40100g;

        /* renamed from: h */
        final /* synthetic */ C10333a1 f40101h;

        /* renamed from: i */
        final /* synthetic */ boolean f40102i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC10251h f40103j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, C10333a1 c10333a1, boolean z, InterfaceC10251h interfaceC10251h) {
            super(1);
            this.f40099f = interfaceC10345e1;
            this.f40100g = list;
            this.f40101h = c10333a1;
            this.f40102i = z;
            this.f40103j = interfaceC10251h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            b bVarM36666f = C10347f0.f40090a.m36666f(this.f40099f, abstractC10396g, this.f40100g);
            if (bVarM36666f == null) {
                return null;
            }
            AbstractC10368m0 abstractC10368m0M36673a = bVarM36666f.m36673a();
            if (abstractC10368m0M36673a != null) {
                return abstractC10368m0M36673a;
            }
            C10333a1 c10333a1 = this.f40101h;
            InterfaceC10345e1 interfaceC10345e1M36674b = bVarM36666f.m36674b();
            C9801m.m32343c(interfaceC10345e1M36674b);
            return C10347f0.m36670j(c10333a1, interfaceC10345e1M36674b, this.f40100g, this.f40102i, this.f40103j);
        }
    }

    private C10347f0() {
    }

    /* renamed from: b */
    public static final AbstractC10368m0 m36662b(InterfaceC10584d1 interfaceC10584d1, List<? extends InterfaceC10351g1> list) {
        C9801m.m32346f(interfaceC10584d1, "<this>");
        C9801m.m32346f(list, "arguments");
        return new C10430v0(InterfaceC10456x0.a.f40383a, false).m37081i(C10433w0.f40368a.m37090a(null, interfaceC10584d1, list), C10333a1.f40041g.m36577h());
    }

    /* renamed from: c */
    private final InterfaceC10251h m36663c(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, AbstractC10396g abstractC10396g) {
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32891w();
        if (interfaceC10594hMo32887c instanceof InterfaceC10587e1) {
            return ((InterfaceC10587e1) interfaceC10594hMo32887c).mo36400s().mo33553q();
        }
        if (interfaceC10594hMo32887c instanceof InterfaceC10585e) {
            if (abstractC10396g == null) {
                abstractC10396g = C10235a.m36077k(C10235a.m36078l(interfaceC10594hMo32887c));
            }
            return list.isEmpty() ? C10671u.m37978b((InterfaceC10585e) interfaceC10594hMo32887c, abstractC10396g) : C10671u.m37977a((InterfaceC10585e) interfaceC10594hMo32887c, AbstractC10348f1.f40104c.m36682b(interfaceC10345e1, list), abstractC10396g);
        }
        if (interfaceC10594hMo32887c instanceof InterfaceC10584d1) {
            EnumC10423g enumC10423g = EnumC10423g.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((InterfaceC10584d1) interfaceC10594hMo32887c).getName().toString();
            C9801m.m32345e(string, "descriptor.name.toString()");
            return C10427k.m37051a(enumC10423g, true, string);
        }
        if (interfaceC10345e1 instanceof C10341d0) {
            return ((C10341d0) interfaceC10345e1).m36601g();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC10594hMo32887c + " for constructor: " + interfaceC10345e1);
    }

    /* renamed from: d */
    public static final AbstractC10381q1 m36664d(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        C9801m.m32346f(abstractC10368m0, "lowerBound");
        C9801m.m32346f(abstractC10368m02, "upperBound");
        return C9801m.m32341a(abstractC10368m0, abstractC10368m02) ? abstractC10368m0 : new C10463z(abstractC10368m0, abstractC10368m02);
    }

    /* renamed from: e */
    public static final AbstractC10368m0 m36665e(C10333a1 c10333a1, C10218n c10218n, boolean z) {
        C9801m.m32346f(c10333a1, "attributes");
        C9801m.m32346f(c10218n, "constructor");
        return m36670j(c10333a1, c10218n, C10817u.m38888j(), z, C10427k.m37051a(EnumC10423g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final b m36666f(InterfaceC10345e1 interfaceC10345e1, AbstractC10396g abstractC10396g, List<? extends InterfaceC10351g1> list) {
        InterfaceC10594h interfaceC10594hMo36928f;
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32891w();
        if (interfaceC10594hMo32887c == null || (interfaceC10594hMo36928f = abstractC10396g.mo36928f(interfaceC10594hMo32887c)) == null) {
            return null;
        }
        if (interfaceC10594hMo36928f instanceof InterfaceC10584d1) {
            return new b(m36662b((InterfaceC10584d1) interfaceC10594hMo36928f, list), null);
        }
        InterfaceC10345e1 interfaceC10345e1Mo35999b = interfaceC10594hMo36928f.mo32877h().mo35999b(abstractC10396g);
        C9801m.m32345e(interfaceC10345e1Mo35999b, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, interfaceC10345e1Mo35999b);
    }

    /* renamed from: g */
    public static final AbstractC10368m0 m36667g(C10333a1 c10333a1, InterfaceC10585e interfaceC10585e, List<? extends InterfaceC10351g1> list) {
        C9801m.m32346f(c10333a1, "attributes");
        C9801m.m32346f(interfaceC10585e, "descriptor");
        C9801m.m32346f(list, "arguments");
        InterfaceC10345e1 interfaceC10345e1Mo32877h = interfaceC10585e.mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "descriptor.typeConstructor");
        return m36669i(c10333a1, interfaceC10345e1Mo32877h, list, false, null, 16, null);
    }

    /* renamed from: h */
    public static final AbstractC10368m0 m36668h(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z, AbstractC10396g abstractC10396g) {
        C9801m.m32346f(c10333a1, "attributes");
        C9801m.m32346f(interfaceC10345e1, "constructor");
        C9801m.m32346f(list, "arguments");
        if (!c10333a1.isEmpty() || !list.isEmpty() || z || interfaceC10345e1.mo32891w() == null) {
            return m36671k(c10333a1, interfaceC10345e1, list, z, f40090a.m36663c(interfaceC10345e1, list, abstractC10396g), new c(interfaceC10345e1, list, c10333a1, z));
        }
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32891w();
        C9801m.m32343c(interfaceC10594hMo32887c);
        AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10594hMo32887c.mo36400s();
        C9801m.m32345e(abstractC10368m0Mo36400s, "constructor.declarationDescriptor!!.defaultType");
        return abstractC10368m0Mo36400s;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC10368m0 m36669i(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List list, boolean z, AbstractC10396g abstractC10396g, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            abstractC10396g = null;
        }
        return m36668h(c10333a1, interfaceC10345e1, list, z, abstractC10396g);
    }

    /* renamed from: j */
    public static final AbstractC10368m0 m36670j(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z, InterfaceC10251h interfaceC10251h) {
        C9801m.m32346f(c10333a1, "attributes");
        C9801m.m32346f(interfaceC10345e1, "constructor");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(interfaceC10251h, "memberScope");
        C10371n0 c10371n0 = new C10371n0(interfaceC10345e1, list, z, interfaceC10251h, new d(interfaceC10345e1, list, c10333a1, z, interfaceC10251h));
        return c10333a1.isEmpty() ? c10371n0 : new C10374o0(c10371n0, c10333a1);
    }

    /* renamed from: k */
    public static final AbstractC10368m0 m36671k(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z, InterfaceC10251h interfaceC10251h, Function1<? super AbstractC10396g, ? extends AbstractC10368m0> function1) {
        C9801m.m32346f(c10333a1, "attributes");
        C9801m.m32346f(interfaceC10345e1, "constructor");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(interfaceC10251h, "memberScope");
        C9801m.m32346f(function1, "refinedTypeFactory");
        C10371n0 c10371n0 = new C10371n0(interfaceC10345e1, list, z, interfaceC10251h, function1);
        return c10333a1.isEmpty() ? c10371n0 : new C10374o0(c10371n0, c10333a1);
    }
}
