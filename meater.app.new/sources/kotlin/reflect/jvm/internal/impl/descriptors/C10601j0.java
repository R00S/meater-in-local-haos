package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10820v0;
import kotlin.collections.C10822w0;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10649g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10658k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10661m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10364l;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: NotFoundClasses.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0 */
/* loaded from: classes2.dex */
public final class C10601j0 {

    /* renamed from: a */
    private final InterfaceC10330n f40759a;

    /* renamed from: b */
    private final InterfaceC10592g0 f40760b;

    /* renamed from: c */
    private final InterfaceC10323g<C10160c, InterfaceC10604k0> f40761c;

    /* renamed from: d */
    private final InterfaceC10323g<a, InterfaceC10585e> f40762d;

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$a */
    private static final class a {

        /* renamed from: a */
        private final C10159b f40763a;

        /* renamed from: b */
        private final List<Integer> f40764b;

        public a(C10159b c10159b, List<Integer> list) {
            C9801m.m32346f(c10159b, "classId");
            C9801m.m32346f(list, "typeParametersCount");
            this.f40763a = c10159b;
            this.f40764b = list;
        }

        /* renamed from: a */
        public final C10159b m37704a() {
            return this.f40763a;
        }

        /* renamed from: b */
        public final List<Integer> m37705b() {
            return this.f40764b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(this.f40763a, aVar.f40763a) && C9801m.m32341a(this.f40764b, aVar.f40764b);
        }

        public int hashCode() {
            return (this.f40763a.hashCode() * 31) + this.f40764b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f40763a + ", typeParametersCount=" + this.f40764b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$b */
    public static final class b extends AbstractC10649g {

        /* renamed from: n */
        private final boolean f40765n;

        /* renamed from: o */
        private final List<InterfaceC10587e1> f40766o;

        /* renamed from: p */
        private final C10364l f40767p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10330n interfaceC10330n, InterfaceC10609m interfaceC10609m, C10163f c10163f, boolean z, int i2) {
            super(interfaceC10330n, interfaceC10609m, c10163f, InterfaceC10741z0.f41247a, false);
            C9801m.m32346f(interfaceC10330n, "storageManager");
            C9801m.m32346f(interfaceC10609m, "container");
            C9801m.m32346f(c10163f, "name");
            this.f40765n = z;
            IntRange intRangeM32428k = C9848l.m32428k(0, i2);
            ArrayList arrayList = new ArrayList(C10819v.m38911u(intRangeM32428k, 10));
            Iterator<Integer> it = intRangeM32428k.iterator();
            while (it.hasNext()) {
                int iMo32397b = ((IntIterator) it).mo32397b();
                InterfaceC10620g interfaceC10620gM37735b = InterfaceC10620g.f40808c.m37735b();
                EnumC10384r1 enumC10384r1 = EnumC10384r1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(iMo32397b);
                arrayList.add(C10658k0.m37875S0(this, interfaceC10620gM37735b, false, enumC10384r1, C10163f.m35454x(sb.toString()), iMo32397b, interfaceC10330n));
            }
            this.f40766o = arrayList;
            this.f40767p = new C10364l(this, C10590f1.m37685d(this), C10820v0.m38916c(C10235a.m36078l(this).mo37021o().m32791i()), interfaceC10330n);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: A */
        public boolean mo32857A() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: D */
        public boolean mo32858D() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
        /* renamed from: E0 */
        public boolean mo32859E0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: J */
        public Collection<InterfaceC10585e> mo32861J() {
            return C10817u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: J0 */
        public boolean mo32862J0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public InterfaceC10251h.b mo32866S() {
            return InterfaceC10251h.b.f39671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
        /* renamed from: M */
        public boolean mo32863M() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public C10364l mo32877h() {
            return this.f40767p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public InterfaceC10251h.b mo32860H(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            return InterfaceC10251h.b.f39671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: R */
        public InterfaceC10582d mo32864R() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: U */
        public InterfaceC10585e mo32869U() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
        public InterfaceC10620g getAnnotations() {
            return InterfaceC10620g.f40808c.m37735b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
        public AbstractC10730u getVisibility() {
            AbstractC10730u abstractC10730u = C10728t.f41220e;
            C9801m.m32345e(abstractC10730u, Store.PUBLIC_ACCESS);
            return abstractC10730u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: i */
        public EnumC10588f mo32878i() {
            return EnumC10588f.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
        /* renamed from: j */
        public EnumC10583d0 mo32879j() {
            return EnumC10583d0.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: k */
        public Collection<InterfaceC10582d> mo32880k() {
            return C10822w0.m38917d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: l */
        public boolean mo32881l() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
        /* renamed from: m */
        public boolean mo32882m() {
            return this.f40765n;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
        /* renamed from: w */
        public List<InterfaceC10587e1> mo32884w() {
            return this.f40766o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10649g, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
        /* renamed from: z */
        public boolean mo32885z() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
        /* renamed from: z0 */
        public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
            return null;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$c */
    static final class c extends Lambda implements Function1<a, InterfaceC10585e> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10585e invoke(a aVar) {
            InterfaceC10609m interfaceC10609mM37703d;
            C9801m.m32346f(aVar, "<name for destructuring parameter 0>");
            C10159b c10159bM37704a = aVar.m37704a();
            List<Integer> listM37705b = aVar.m37705b();
            if (c10159bM37704a.m35416k()) {
                throw new UnsupportedOperationException("Unresolved local class: " + c10159bM37704a);
            }
            C10159b c10159bM35412g = c10159bM37704a.m35412g();
            if (c10159bM35412g == null || (interfaceC10609mM37703d = C10601j0.this.m37703d(c10159bM35412g, C10782c0.m38581M(listM37705b, 1))) == null) {
                InterfaceC10323g interfaceC10323g = C10601j0.this.f40761c;
                C10160c c10160cM35413h = c10159bM37704a.m35413h();
                C9801m.m32345e(c10160cM35413h, "classId.packageFqName");
                interfaceC10609mM37703d = (InterfaceC10591g) interfaceC10323g.invoke(c10160cM35413h);
            }
            InterfaceC10609m interfaceC10609m = interfaceC10609mM37703d;
            boolean zM35417l = c10159bM37704a.m35417l();
            InterfaceC10330n interfaceC10330n = C10601j0.this.f40759a;
            C10163f c10163fM35415j = c10159bM37704a.m35415j();
            C9801m.m32345e(c10163fM35415j, "classId.shortClassName");
            Integer num = (Integer) C10813s.m38832W(listM37705b);
            return new b(interfaceC10330n, interfaceC10609m, c10163fM35415j, zM35417l, num != null ? num.intValue() : 0);
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$d */
    static final class d extends Lambda implements Function1<C10160c, InterfaceC10604k0> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10604k0 invoke(C10160c c10160c) {
            C9801m.m32346f(c10160c, "fqName");
            return new C10661m(C10601j0.this.f40760b, c10160c);
        }
    }

    public C10601j0(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "module");
        this.f40759a = interfaceC10330n;
        this.f40760b = interfaceC10592g0;
        this.f40761c = interfaceC10330n.mo36520h(new d());
        this.f40762d = interfaceC10330n.mo36520h(new c());
    }

    /* renamed from: d */
    public final InterfaceC10585e m37703d(C10159b c10159b, List<Integer> list) {
        C9801m.m32346f(c10159b, "classId");
        C9801m.m32346f(list, "typeParametersCount");
        return this.f40762d.invoke(new a(c10159b, list));
    }
}
