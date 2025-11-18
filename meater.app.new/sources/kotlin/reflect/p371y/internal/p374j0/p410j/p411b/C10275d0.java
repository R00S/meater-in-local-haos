package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9913g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10154f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10284a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10376p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10380q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10383r0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10386s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10464z0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;
import okhttp3.HttpUrl;

/* compiled from: TypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.d0 */
/* loaded from: classes3.dex */
public final class C10275d0 {

    /* renamed from: a */
    private final C10303m f39736a;

    /* renamed from: b */
    private final C10275d0 f39737b;

    /* renamed from: c */
    private final String f39738c;

    /* renamed from: d */
    private final String f39739d;

    /* renamed from: e */
    private final Function1<Integer, InterfaceC10594h> f39740e;

    /* renamed from: f */
    private final Function1<Integer, InterfaceC10594h> f39741f;

    /* renamed from: g */
    private final Map<Integer, InterfaceC10587e1> f39742g;

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$a */
    static final class a extends Lambda implements Function1<Integer, InterfaceC10594h> {
        a() {
            super(1);
        }

        /* renamed from: b */
        public final InterfaceC10594h m36232b(int i2) {
            return C10275d0.this.m36215d(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC10594h invoke(Integer num) {
            return m36232b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$b */
    static final class b extends Lambda implements Function0<List<? extends InterfaceC10616c>> {

        /* renamed from: g */
        final /* synthetic */ C10138q f39745g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10138q c10138q) {
            super(0);
            this.f39745g = c10138q;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10616c> invoke() {
            return C10275d0.this.f39736a.m36452c().m36419d().mo33873d(this.f39745g, C10275d0.this.f39736a.m36456g());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$c */
    static final class c extends Lambda implements Function1<Integer, InterfaceC10594h> {
        c() {
            super(1);
        }

        /* renamed from: b */
        public final InterfaceC10594h m36233b(int i2) {
            return C10275d0.this.m36217f(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC10594h invoke(Integer num) {
            return m36233b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$d */
    /* synthetic */ class d extends C9793i implements Function1<C10159b, C10159b> {

        /* renamed from: h */
        public static final d f39747h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10159b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10159b invoke(C10159b c10159b) {
            C9801m.m32346f(c10159b, "p0");
            return c10159b.m35412g();
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$e */
    static final class e extends Lambda implements Function1<C10138q, C10138q> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10138q invoke(C10138q c10138q) {
            C9801m.m32346f(c10138q, "it");
            return C10154f.m35388g(c10138q, C10275d0.this.f39736a.m36459j());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$f */
    static final class f extends Lambda implements Function1<C10138q, Integer> {

        /* renamed from: f */
        public static final f f39749f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C10138q c10138q) {
            C9801m.m32346f(c10138q, "it");
            return Integer.valueOf(c10138q.m35031U());
        }
    }

    public C10275d0(C10303m c10303m, C10275d0 c10275d0, List<C10140s> list, String str, String str2) {
        Map<Integer, InterfaceC10587e1> linkedHashMap;
        C9801m.m32346f(c10303m, "c");
        C9801m.m32346f(list, "typeParameterProtos");
        C9801m.m32346f(str, "debugName");
        C9801m.m32346f(str2, "containerPresentableName");
        this.f39736a = c10303m;
        this.f39737b = c10275d0;
        this.f39738c = str;
        this.f39739d = str2;
        this.f39740e = c10303m.m36457h().mo36521i(new a());
        this.f39741f = c10303m.m36457h().mo36521i(new c());
        if (list.isEmpty()) {
            linkedHashMap = C10810q0.m38797i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i2 = 0;
            for (C10140s c10140s : list) {
                linkedHashMap.put(Integer.valueOf(c10140s.m35186M()), new C10296m(this.f39736a, c10140s, i2));
                i2++;
            }
        }
        this.f39742g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final InterfaceC10594h m36215d(int i2) {
        C10159b c10159bM36494a = C10314x.m36494a(this.f39736a.m36456g(), i2);
        return c10159bM36494a.m35416k() ? this.f39736a.m36452c().m36417b(c10159bM36494a) : C10736x.m38150b(this.f39736a.m36452c().m36431p(), c10159bM36494a);
    }

    /* renamed from: e */
    private final AbstractC10368m0 m36216e(int i2) {
        if (C10314x.m36494a(this.f39736a.m36456g(), i2).m35416k()) {
            return this.f39736a.m36452c().m36429n().mo36474a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final InterfaceC10594h m36217f(int i2) {
        C10159b c10159bM36494a = C10314x.m36494a(this.f39736a.m36456g(), i2);
        if (c10159bM36494a.m35416k()) {
            return null;
        }
        return C10736x.m38152d(this.f39736a.m36452c().m36431p(), c10159bM36494a);
    }

    /* renamed from: g */
    private final AbstractC10368m0 m36218g(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        AbstractC9914h abstractC9914hM37142h = C10457a.m37142h(abstractC10344e0);
        InterfaceC10620g annotations = abstractC10344e0.getAnnotations();
        AbstractC10344e0 abstractC10344e0M32714j = C9913g.m32714j(abstractC10344e0);
        List<AbstractC10344e0> listM32709e = C9913g.m32709e(abstractC10344e0);
        List listM38582N = C10782c0.m38582N(C9913g.m32716l(abstractC10344e0), 1);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38582N, 10));
        Iterator it = listM38582N.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10351g1) it.next()).getType());
        }
        return C9913g.m32706b(abstractC9914hM37142h, annotations, abstractC10344e0M32714j, listM32709e, arrayList, null, abstractC10344e02, true).mo33545S0(abstractC10344e0.mo33691P0());
    }

    /* renamed from: h */
    private final AbstractC10368m0 m36219h(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z) {
        int size;
        int size2 = interfaceC10345e1.getParameters().size() - list.size();
        AbstractC10368m0 abstractC10368m0M36220i = null;
        if (size2 == 0) {
            abstractC10368m0M36220i = m36220i(c10333a1, interfaceC10345e1, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            InterfaceC10345e1 interfaceC10345e1Mo32877h = interfaceC10345e1.mo36004o().m32785X(size).mo32877h();
            C9801m.m32345e(interfaceC10345e1Mo32877h, "functionTypeConstructor.…on(arity).typeConstructor");
            abstractC10368m0M36220i = C10347f0.m36669i(c10333a1, interfaceC10345e1Mo32877h, list, z, null, 16, null);
        }
        return abstractC10368m0M36220i == null ? C10427k.f40355a.m37059f(EnumC10426j.f40298S, list, interfaceC10345e1, new String[0]) : abstractC10368m0M36220i;
    }

    /* renamed from: i */
    private final AbstractC10368m0 m36220i(C10333a1 c10333a1, InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z) {
        AbstractC10368m0 abstractC10368m0M36669i = C10347f0.m36669i(c10333a1, interfaceC10345e1, list, z, null, 16, null);
        if (C9913g.m32720p(abstractC10368m0M36669i)) {
            return m36225p(abstractC10368m0M36669i);
        }
        return null;
    }

    /* renamed from: k */
    private final InterfaceC10587e1 m36221k(int i2) {
        InterfaceC10587e1 interfaceC10587e1 = this.f39742g.get(Integer.valueOf(i2));
        if (interfaceC10587e1 != null) {
            return interfaceC10587e1;
        }
        C10275d0 c10275d0 = this.f39737b;
        if (c10275d0 != null) {
            return c10275d0.m36221k(i2);
        }
        return null;
    }

    /* renamed from: m */
    private static final List<C10138q.b> m36222m(C10138q c10138q, C10275d0 c10275d0) {
        List<C10138q.b> listM35032V = c10138q.m35032V();
        C9801m.m32345e(listM35032V, "argumentList");
        C10138q c10138qM35388g = C10154f.m35388g(c10138q, c10275d0.f39736a.m36459j());
        List<C10138q.b> listM36222m = c10138qM35388g != null ? m36222m(c10138qM35388g, c10275d0) : null;
        if (listM36222m == null) {
            listM36222m = C10817u.m38888j();
        }
        return C10782c0.m38609o0(listM35032V, listM36222m);
    }

    /* renamed from: n */
    public static /* synthetic */ AbstractC10368m0 m36223n(C10275d0 c10275d0, C10138q c10138q, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return c10275d0.m36230l(c10138q, z);
    }

    /* renamed from: o */
    private final C10333a1 m36224o(List<? extends InterfaceC10464z0> list, InterfaceC10620g interfaceC10620g, InterfaceC10345e1 interfaceC10345e1, InterfaceC10609m interfaceC10609m) {
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10464z0) it.next()).mo36792a(interfaceC10620g, interfaceC10345e1, interfaceC10609m));
        }
        return C10333a1.f40041g.m36576g(C10819v.m38913w(arrayList));
    }

    /* renamed from: p */
    private final AbstractC10368m0 m36225p(AbstractC10344e0 abstractC10344e0) {
        AbstractC10344e0 type;
        InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) C10813s.m38847i0(C9913g.m32716l(abstractC10344e0));
        if (interfaceC10351g1 == null || (type = interfaceC10351g1.getType()) == null) {
            return null;
        }
        InterfaceC10594h interfaceC10594hMo32887c = type.mo35993O0().mo32891w();
        C10160c c10160cM36074h = interfaceC10594hMo32887c != null ? C10235a.m36074h(interfaceC10594hMo32887c) : null;
        if (type.mo35991M0().size() != 1 || (!C9801m.m32341a(c10160cM36074h, C9917k.f37512m) && !C9801m.m32341a(c10160cM36074h, C10277e0.f39753a))) {
            return (AbstractC10368m0) abstractC10344e0;
        }
        AbstractC10344e0 type2 = ((InterfaceC10351g1) C10813s.m38866s0(type.mo35991M0())).getType();
        C9801m.m32345e(type2, "continuationArgumentType.arguments.single().type");
        InterfaceC10609m interfaceC10609mM36454e = this.f39736a.m36454e();
        if (!(interfaceC10609mM36454e instanceof InterfaceC10573a)) {
            interfaceC10609mM36454e = null;
        }
        InterfaceC10573a interfaceC10573a = (InterfaceC10573a) interfaceC10609mM36454e;
        return C9801m.m32341a(interfaceC10573a != null ? C10235a.m36070d(interfaceC10573a) : null, C10273c0.f39731a) ? m36218g(abstractC10344e0, type2) : m36218g(abstractC10344e0, type2);
    }

    /* renamed from: r */
    private final InterfaceC10351g1 m36226r(InterfaceC10587e1 interfaceC10587e1, C10138q.b bVar) {
        if (bVar.m35073x() == C10138q.b.c.STAR) {
            return interfaceC10587e1 == null ? new C10383r0(this.f39736a.m36452c().m36431p().mo37021o()) : new C10386s0(interfaceC10587e1);
        }
        C10269a0 c10269a0 = C10269a0.f39714a;
        C10138q.b.c cVarM35073x = bVar.m35073x();
        C9801m.m32345e(cVarM35073x, "typeArgumentProto.projection");
        EnumC10384r1 enumC10384r1M36206c = c10269a0.m36206c(cVarM35073x);
        C10138q c10138qM35394m = C10154f.m35394m(bVar, this.f39736a.m36459j());
        return c10138qM35394m == null ? new C10357i1(C10427k.m37053d(EnumC10426j.f40273C0, bVar.toString())) : new C10357i1(enumC10384r1M36206c, m36231q(c10138qM35394m));
    }

    /* renamed from: s */
    private final InterfaceC10345e1 m36227s(C10138q c10138q) {
        InterfaceC10594h interfaceC10594hInvoke;
        Object next;
        if (c10138q.m35047m0()) {
            interfaceC10594hInvoke = this.f39740e.invoke(Integer.valueOf(c10138q.m35033X()));
            if (interfaceC10594hInvoke == null) {
                interfaceC10594hInvoke = m36228t(this, c10138q, c10138q.m35033X());
            }
        } else if (c10138q.m35056v0()) {
            interfaceC10594hInvoke = m36221k(c10138q.m35043i0());
            if (interfaceC10594hInvoke == null) {
                return C10427k.f40355a.m37058e(EnumC10426j.f40296Q, String.valueOf(c10138q.m35043i0()), this.f39739d);
            }
        } else if (c10138q.m35057w0()) {
            String string = this.f39736a.m36456g().getString(c10138q.m35044j0());
            Iterator<T> it = m36229j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C9801m.m32341a(((InterfaceC10587e1) next).getName().m35455k(), string)) {
                    break;
                }
            }
            interfaceC10594hInvoke = (InterfaceC10587e1) next;
            if (interfaceC10594hInvoke == null) {
                return C10427k.f40355a.m37058e(EnumC10426j.f40297R, string, this.f39736a.m36454e().toString());
            }
        } else {
            if (!c10138q.m35055u0()) {
                return C10427k.f40355a.m37058e(EnumC10426j.f40300U, new String[0]);
            }
            interfaceC10594hInvoke = this.f39741f.invoke(Integer.valueOf(c10138q.m35042h0()));
            if (interfaceC10594hInvoke == null) {
                interfaceC10594hInvoke = m36228t(this, c10138q, c10138q.m35042h0());
            }
        }
        InterfaceC10345e1 interfaceC10345e1Mo32877h = interfaceC10594hInvoke.mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "classifier.typeConstructor");
        return interfaceC10345e1Mo32877h;
    }

    /* renamed from: t */
    private static final InterfaceC10585e m36228t(C10275d0 c10275d0, C10138q c10138q, int i2) {
        C10159b c10159bM36494a = C10314x.m36494a(c10275d0.f39736a.m36456g(), i2);
        List<Integer> listM37378B = C10522n.m37378B(C10522n.m37391u(C10520l.m37373f(c10138q, c10275d0.new e()), f.f39749f));
        int iM37380j = C10522n.m37380j(C10520l.m37373f(c10159bM36494a, d.f39747h));
        while (listM37378B.size() < iM37380j) {
            listM37378B.add(0);
        }
        return c10275d0.f39736a.m36452c().m36432q().m37703d(c10159bM36494a, listM37378B);
    }

    /* renamed from: j */
    public final List<InterfaceC10587e1> m36229j() {
        return C10782c0.m38569E0(this.f39742g.values());
    }

    /* renamed from: l */
    public final AbstractC10368m0 m36230l(C10138q c10138q, boolean z) {
        AbstractC10368m0 abstractC10368m0M36669i;
        AbstractC10368m0 abstractC10368m0M36816j;
        C9801m.m32346f(c10138q, "proto");
        AbstractC10368m0 abstractC10368m0M36216e = c10138q.m35047m0() ? m36216e(c10138q.m35033X()) : c10138q.m35055u0() ? m36216e(c10138q.m35042h0()) : null;
        if (abstractC10368m0M36216e != null) {
            return abstractC10368m0M36216e;
        }
        InterfaceC10345e1 interfaceC10345e1M36227s = m36227s(c10138q);
        boolean z2 = true;
        if (C10427k.m37054m(interfaceC10345e1M36227s.mo32891w())) {
            return C10427k.f40355a.m37057c(EnumC10426j.f40348x0, interfaceC10345e1M36227s, interfaceC10345e1M36227s.toString());
        }
        C10284a c10284a = new C10284a(this.f39736a.m36457h(), new b(c10138q));
        C10333a1 c10333a1M36224o = m36224o(this.f39736a.m36452c().m36437v(), c10284a, interfaceC10345e1M36227s, this.f39736a.m36454e());
        List<C10138q.b> listM36222m = m36222m(c10138q, this);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM36222m, 10));
        int i2 = 0;
        for (Object obj : listM36222m) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10817u.m38898t();
            }
            List<InterfaceC10587e1> parameters = interfaceC10345e1M36227s.getParameters();
            C9801m.m32345e(parameters, "constructor.parameters");
            arrayList.add(m36226r((InterfaceC10587e1) C10813s.m38833X(parameters, i2), (C10138q.b) obj));
            i2 = i3;
        }
        List<? extends InterfaceC10351g1> listM38569E0 = C10782c0.m38569E0(arrayList);
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1M36227s.mo32891w();
        if (z && (interfaceC10594hMo32887c instanceof InterfaceC10584d1)) {
            C10347f0 c10347f0 = C10347f0.f40090a;
            AbstractC10368m0 abstractC10368m0M36662b = C10347f0.m36662b((InterfaceC10584d1) interfaceC10594hMo32887c, listM38569E0);
            C10333a1 c10333a1M36224o2 = m36224o(this.f39736a.m36452c().m36437v(), InterfaceC10620g.f40808c.m37734a(C10782c0.m38607m0(c10284a, abstractC10368m0M36662b.getAnnotations())), interfaceC10345e1M36227s, this.f39736a.m36454e());
            if (!C10350g0.m36707b(abstractC10368m0M36662b) && !c10138q.m35039e0()) {
                z2 = false;
            }
            abstractC10368m0M36669i = abstractC10368m0M36662b.mo33545S0(z2).mo33547U0(c10333a1M36224o2);
        } else {
            Boolean boolMo35368d = C10150b.f39204a.mo35368d(c10138q.m35035a0());
            C9801m.m32345e(boolMo35368d, "SUSPEND_TYPE.get(proto.flags)");
            if (boolMo35368d.booleanValue()) {
                abstractC10368m0M36669i = m36219h(c10333a1M36224o, interfaceC10345e1M36227s, listM38569E0, c10138q.m35039e0());
            } else {
                abstractC10368m0M36669i = C10347f0.m36669i(c10333a1M36224o, interfaceC10345e1M36227s, listM38569E0, c10138q.m35039e0(), null, 16, null);
                Boolean boolMo35368d2 = C10150b.f39205b.mo35368d(c10138q.m35035a0());
                C9801m.m32345e(boolMo35368d2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (boolMo35368d2.booleanValue()) {
                    C10376p c10376pM36797c = C10376p.a.m36797c(C10376p.f40159g, abstractC10368m0M36669i, false, 2, null);
                    if (c10376pM36797c == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC10368m0M36669i + '\'').toString());
                    }
                    abstractC10368m0M36669i = c10376pM36797c;
                }
            }
        }
        C10138q c10138qM35382a = C10154f.m35382a(c10138q, this.f39736a.m36459j());
        if (c10138qM35382a != null && (abstractC10368m0M36816j = C10380q0.m36816j(abstractC10368m0M36669i, m36230l(c10138qM35382a, false))) != null) {
            abstractC10368m0M36669i = abstractC10368m0M36816j;
        }
        return c10138q.m35047m0() ? this.f39736a.m36452c().m36435t().mo37748a(C10314x.m36494a(this.f39736a.m36456g(), c10138q.m35033X()), abstractC10368m0M36669i) : abstractC10368m0M36669i;
    }

    /* renamed from: q */
    public final AbstractC10344e0 m36231q(C10138q c10138q) {
        C9801m.m32346f(c10138q, "proto");
        if (!c10138q.m35049o0()) {
            return m36230l(c10138q, true);
        }
        String string = this.f39736a.m36456g().getString(c10138q.m35036b0());
        AbstractC10368m0 abstractC10368m0M36223n = m36223n(this, c10138q, false, 2, null);
        C10138q c10138qM35384c = C10154f.m35384c(c10138q, this.f39736a.m36459j());
        C9801m.m32343c(c10138qM35384c);
        return this.f39736a.m36452c().m36427l().mo33979a(c10138q, string, abstractC10368m0M36223n, m36223n(this, c10138qM35384c, false, 2, null));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39738c);
        if (this.f39737b == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ". Child of " + this.f39737b.f39738c;
        }
        sb.append(str);
        return sb.toString();
    }
}
