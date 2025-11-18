package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.C10550i;
import kotlin.C10773s;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.C10808p0;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.collections.C10820v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g */
/* loaded from: classes2.dex */
public final class C10014g {

    /* renamed from: a */
    private final C10322f f38182a;

    /* renamed from: b */
    private final Lazy f38183b;

    /* renamed from: c */
    private final C10012e f38184c;

    /* renamed from: d */
    private final InterfaceC10323g<a, AbstractC10344e0> f38185d;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$a */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC10587e1 f38186a;

        /* renamed from: b */
        private final boolean f38187b;

        /* renamed from: c */
        private final C10008a f38188c;

        public a(InterfaceC10587e1 interfaceC10587e1, boolean z, C10008a c10008a) {
            C9801m.m32346f(interfaceC10587e1, "typeParameter");
            C9801m.m32346f(c10008a, "typeAttr");
            this.f38186a = interfaceC10587e1;
            this.f38187b = z;
            this.f38188c = c10008a;
        }

        /* renamed from: a */
        public final C10008a m33560a() {
            return this.f38188c;
        }

        /* renamed from: b */
        public final InterfaceC10587e1 m33561b() {
            return this.f38186a;
        }

        /* renamed from: c */
        public final boolean m33562c() {
            return this.f38187b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(aVar.f38186a, this.f38186a) && aVar.f38187b == this.f38187b && aVar.f38188c.m33502d() == this.f38188c.m33502d() && aVar.f38188c.m33503e() == this.f38188c.m33503e() && aVar.f38188c.m33505g() == this.f38188c.m33505g() && C9801m.m32341a(aVar.f38188c.m33501c(), this.f38188c.m33501c());
        }

        public int hashCode() {
            int iHashCode = this.f38186a.hashCode();
            int i2 = iHashCode + (iHashCode * 31) + (this.f38187b ? 1 : 0);
            int iHashCode2 = i2 + (i2 * 31) + this.f38188c.m33502d().hashCode();
            int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f38188c.m33503e().hashCode();
            int i3 = iHashCode3 + (iHashCode3 * 31) + (this.f38188c.m33505g() ? 1 : 0);
            int i4 = i3 * 31;
            AbstractC10368m0 abstractC10368m0M33501c = this.f38188c.m33501c();
            return i3 + i4 + (abstractC10368m0M33501c != null ? abstractC10368m0M33501c.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f38186a + ", isRaw=" + this.f38187b + ", typeAttr=" + this.f38188c + ')';
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$b */
    static final class b extends Lambda implements Function0<C10424h> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10424h invoke() {
            return C10427k.m37053d(EnumC10426j.f40352z0, C10014g.this.toString());
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$c */
    static final class c extends Lambda implements Function1<a, AbstractC10344e0> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(a aVar) {
            return C10014g.this.m33557d(aVar.m33561b(), aVar.m33562c(), aVar.m33560a());
        }
    }

    public C10014g(C10012e c10012e) {
        C10322f c10322f = new C10322f("Type parameter upper bound erasion results");
        this.f38182a = c10322f;
        this.f38183b = C10550i.m37594b(new b());
        this.f38184c = c10012e == null ? new C10012e(this) : c10012e;
        InterfaceC10323g<a, AbstractC10344e0> interfaceC10323gMo36520h = c10322f.mo36520h(new c());
        C9801m.m32345e(interfaceC10323gMo36520h, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f38185d = interfaceC10323gMo36520h;
    }

    /* renamed from: b */
    private final AbstractC10344e0 m33556b(C10008a c10008a) {
        AbstractC10344e0 abstractC10344e0M37157w;
        AbstractC10368m0 abstractC10368m0M33501c = c10008a.m33501c();
        return (abstractC10368m0M33501c == null || (abstractC10344e0M37157w = C10457a.m37157w(abstractC10368m0M33501c)) == null) ? m33558e() : abstractC10344e0M37157w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final AbstractC10344e0 m33557d(InterfaceC10587e1 interfaceC10587e1, boolean z, C10008a c10008a) {
        InterfaceC10351g1 interfaceC10351g1M33538j;
        Set<InterfaceC10587e1> setM33504f = c10008a.m33504f();
        if (setM33504f != null && setM33504f.contains(interfaceC10587e1.mo37019a())) {
            return m33556b(c10008a);
        }
        AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10587e1.mo36400s();
        C9801m.m32345e(abstractC10368m0Mo36400s, "typeParameter.defaultType");
        Set<InterfaceC10587e1> setM37140f = C10457a.m37140f(abstractC10368m0Mo36400s, setM33504f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(setM37140f, 10)), 16));
        for (InterfaceC10587e1 interfaceC10587e12 : setM37140f) {
            if (setM33504f == null || !setM33504f.contains(interfaceC10587e12)) {
                C10012e c10012e = this.f38184c;
                C10008a c10008aM33507i = z ? c10008a : c10008a.m33507i(EnumC10009b.INFLEXIBLE);
                AbstractC10344e0 abstractC10344e0M33559c = m33559c(interfaceC10587e12, z, c10008a.m33508j(interfaceC10587e1));
                C9801m.m32345e(abstractC10344e0M33559c, "getErasedUpperBound(it, …Parameter(typeParameter))");
                interfaceC10351g1M33538j = c10012e.m33538j(interfaceC10587e12, c10008aM33507i, abstractC10344e0M33559c);
            } else {
                interfaceC10351g1M33538j = C10011d.m33528b(interfaceC10587e12, c10008a);
            }
            Pair pairM38547a = C10773s.m38547a(interfaceC10587e12.mo32877h(), interfaceC10351g1M33538j);
            linkedHashMap.put(pairM38547a.m37648c(), pairM38547a.m37649d());
        }
        C10366l1 c10366l1M36747g = C10366l1.m36747g(AbstractC10348f1.a.m36680e(AbstractC10348f1.f40104c, linkedHashMap, false, 2, null));
        C9801m.m32345e(c10366l1M36747g, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<AbstractC10344e0> upperBounds = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds, "typeParameter.upperBounds");
        AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) C10813s.m38830U(upperBounds);
        if (abstractC10344e0.mo35993O0().mo32891w() instanceof InterfaceC10585e) {
            C9801m.m32345e(abstractC10344e0, "firstUpperBound");
            return C10457a.m37156v(abstractC10344e0, c10366l1M36747g, linkedHashMap, EnumC10384r1.OUT_VARIANCE, c10008a.m33504f());
        }
        Set<InterfaceC10587e1> setM33504f2 = c10008a.m33504f();
        if (setM33504f2 == null) {
            setM33504f2 = C10820v0.m38916c(this);
        }
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        C9801m.m32344d(interfaceC10594hMo32891w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            InterfaceC10587e1 interfaceC10587e13 = (InterfaceC10587e1) interfaceC10594hMo32891w;
            if (setM33504f2.contains(interfaceC10587e13)) {
                return m33556b(c10008a);
            }
            List<AbstractC10344e0> upperBounds2 = interfaceC10587e13.getUpperBounds();
            C9801m.m32345e(upperBounds2, "current.upperBounds");
            AbstractC10344e0 abstractC10344e02 = (AbstractC10344e0) C10813s.m38830U(upperBounds2);
            if (abstractC10344e02.mo35993O0().mo32891w() instanceof InterfaceC10585e) {
                C9801m.m32345e(abstractC10344e02, "nextUpperBound");
                return C10457a.m37156v(abstractC10344e02, c10366l1M36747g, linkedHashMap, EnumC10384r1.OUT_VARIANCE, c10008a.m33504f());
            }
            interfaceC10594hMo32891w = abstractC10344e02.mo35993O0().mo32891w();
            C9801m.m32344d(interfaceC10594hMo32891w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: e */
    private final C10424h m33558e() {
        return (C10424h) this.f38183b.getValue();
    }

    /* renamed from: c */
    public final AbstractC10344e0 m33559c(InterfaceC10587e1 interfaceC10587e1, boolean z, C10008a c10008a) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        C9801m.m32346f(c10008a, "typeAttr");
        return this.f38185d.invoke(new a(interfaceC10587e1, z, c10008a));
    }

    public /* synthetic */ C10014g(C10012e c10012e, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : c10012e);
    }
}
