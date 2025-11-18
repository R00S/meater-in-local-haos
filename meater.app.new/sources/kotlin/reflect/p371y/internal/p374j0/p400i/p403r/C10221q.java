package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.q */
/* loaded from: classes3.dex */
public final class C10221q extends AbstractC10211g<b> {

    /* renamed from: b */
    public static final a f39582b = new a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10211g<?> m36053a(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "argumentType");
            if (C10350g0.m36706a(abstractC10344e0)) {
                return null;
            }
            AbstractC10344e0 type = abstractC10344e0;
            int i2 = 0;
            while (AbstractC9914h.m32738c0(type)) {
                type = ((InterfaceC10351g1) C10813s.m38866s0(type.mo35991M0())).getType();
                C9801m.m32345e(type, "type.arguments.single().type");
                i2++;
            }
            InterfaceC10594h interfaceC10594hMo32891w = type.mo35993O0().mo32891w();
            if (interfaceC10594hMo32891w instanceof InterfaceC10585e) {
                C10159b c10159bM36073g = C10235a.m36073g(interfaceC10594hMo32891w);
                return c10159bM36073g == null ? new C10221q(new b.a(abstractC10344e0)) : new C10221q(c10159bM36073g, i2);
            }
            if (!(interfaceC10594hMo32891w instanceof InterfaceC10587e1)) {
                return null;
            }
            C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37562b.m35441l());
            C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.any.toSafe())");
            return new C10221q(c10159bM35408m, 0);
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.q$b */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.q$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final AbstractC10344e0 f39583a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC10344e0 abstractC10344e0) {
                super(null);
                C9801m.m32346f(abstractC10344e0, "type");
                this.f39583a = abstractC10344e0;
            }

            /* renamed from: a */
            public final AbstractC10344e0 m36054a() {
                return this.f39583a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C9801m.m32341a(this.f39583a, ((a) obj).f39583a);
            }

            public int hashCode() {
                return this.f39583a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f39583a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.q$b$b, reason: collision with other inner class name */
        public static final class C11561b extends b {

            /* renamed from: a */
            private final C10210f f39584a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11561b(C10210f c10210f) {
                super(null);
                C9801m.m32346f(c10210f, "value");
                this.f39584a = c10210f;
            }

            /* renamed from: a */
            public final int m36055a() {
                return this.f39584a.m36021c();
            }

            /* renamed from: b */
            public final C10159b m36056b() {
                return this.f39584a.m36022d();
            }

            /* renamed from: c */
            public final C10210f m36057c() {
                return this.f39584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11561b) && C9801m.m32341a(this.f39584a, ((C11561b) obj).f39584a);
            }

            public int hashCode() {
                return this.f39584a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f39584a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10221q(b bVar) {
        super(bVar);
        C9801m.m32346f(bVar, "value");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: a */
    public AbstractC10344e0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        C10333a1 c10333a1M36577h = C10333a1.f40041g.m36577h();
        InterfaceC10585e interfaceC10585eM32770E = interfaceC10592g0.mo37021o().m32770E();
        C9801m.m32345e(interfaceC10585eM32770E, "module.builtIns.kClass");
        return C10347f0.m36667g(c10333a1M36577h, interfaceC10585eM32770E, C10815t.m38883e(new C10357i1(m36052c(interfaceC10592g0))));
    }

    /* renamed from: c */
    public final AbstractC10344e0 m36052c(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        b bVarMo36023b = mo36023b();
        if (bVarMo36023b instanceof b.a) {
            return ((b.a) mo36023b()).m36054a();
        }
        if (!(bVarMo36023b instanceof b.C11561b)) {
            throw new NoWhenBranchMatchedException();
        }
        C10210f c10210fM36057c = ((b.C11561b) mo36023b()).m36057c();
        C10159b c10159bM36019a = c10210fM36057c.m36019a();
        int iM36020b = c10210fM36057c.m36020b();
        InterfaceC10585e interfaceC10585eM38149a = C10736x.m38149a(interfaceC10592g0, c10159bM36019a);
        if (interfaceC10585eM38149a == null) {
            EnumC10426j enumC10426j = EnumC10426j.f40321k;
            String string = c10159bM36019a.toString();
            C9801m.m32345e(string, "classId.toString()");
            return C10427k.m37053d(enumC10426j, string, String.valueOf(iM36020b));
        }
        AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10585eM38149a.mo36400s();
        C9801m.m32345e(abstractC10368m0Mo36400s, "descriptor.defaultType");
        AbstractC10344e0 abstractC10344e0M37157w = C10457a.m37157w(abstractC10368m0Mo36400s);
        for (int i2 = 0; i2 < iM36020b; i2++) {
            abstractC10344e0M37157w = interfaceC10592g0.mo37021o().m32794l(EnumC10384r1.INVARIANT, abstractC10344e0M37157w);
            C9801m.m32345e(abstractC10344e0M37157w, "module.builtIns.getArray…Variance.INVARIANT, type)");
        }
        return abstractC10344e0M37157w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10221q(C10210f c10210f) {
        this(new b.C11561b(c10210f));
        C9801m.m32346f(c10210f, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10221q(C10159b c10159b, int i2) {
        this(new C10210f(c10159b, i2));
        C9801m.m32346f(c10159b, "classId");
    }
}
