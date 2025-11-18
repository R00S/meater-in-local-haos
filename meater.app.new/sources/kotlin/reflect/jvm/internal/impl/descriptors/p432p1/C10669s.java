package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10256m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10364l;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10373o;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10388t;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s */
/* loaded from: classes2.dex */
public class C10669s extends AbstractC10670t {

    /* renamed from: g */
    private final AbstractC10670t f41095g;

    /* renamed from: h */
    private final C10366l1 f41096h;

    /* renamed from: i */
    private C10366l1 f41097i;

    /* renamed from: j */
    private List<InterfaceC10587e1> f41098j;

    /* renamed from: k */
    private List<InterfaceC10587e1> f41099k;

    /* renamed from: l */
    private InterfaceC10345e1 f41100l;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s$a */
    class a implements Function1<InterfaceC10587e1, Boolean> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10587e1 interfaceC10587e1) {
            return Boolean.valueOf(!interfaceC10587e1.mo37673o0());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s$b */
    class b implements Function1<AbstractC10368m0, AbstractC10368m0> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10368m0 invoke(AbstractC10368m0 abstractC10368m0) {
            return C10669s.this.m37971N0(abstractC10368m0);
        }
    }

    public C10669s(AbstractC10670t abstractC10670t, C10366l1 c10366l1) {
        this.f41095g = abstractC10670t;
        this.f41096h = c10366l1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m37969K(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10669s.m37969K(int):void");
    }

    /* renamed from: L0 */
    private C10366l1 m37970L0() {
        if (this.f41097i == null) {
            if (this.f41096h.m36756k()) {
                this.f41097i = this.f41096h;
            } else {
                List<InterfaceC10587e1> parameters = this.f41095g.mo32877h().getParameters();
                this.f41098j = new ArrayList(parameters.size());
                this.f41097i = C10388t.m36825b(parameters, this.f41096h.m36755j(), this, this.f41098j);
                this.f41099k = C10782c0.m38585Q(this.f41098j, new a());
            }
        }
        return this.f41097i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public AbstractC10368m0 m37971N0(AbstractC10368m0 abstractC10368m0) {
        return (abstractC10368m0 == null || this.f41096h.m36756k()) ? abstractC10368m0 : (AbstractC10368m0) m37970L0().m36759p(abstractC10368m0, EnumC10384r1.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: A */
    public boolean mo32857A() {
        return this.f41095g.mo32857A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D */
    public boolean mo32858D() {
        return this.f41095g.mo32858D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D0 */
    public InterfaceC10251h mo33340D0() {
        InterfaceC10251h interfaceC10251hMo32860H = mo32860H(C10235a.m36077k(C10187d.m35819g(this.f41095g)));
        if (interfaceC10251hMo32860H == null) {
            m37969K(12);
        }
        return interfaceC10251hMo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f41095g.mo32859E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: F0 */
    public List<InterfaceC10735w0> mo36281F0() {
        List<InterfaceC10735w0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37969K(17);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: H */
    public InterfaceC10251h mo32860H(AbstractC10396g abstractC10396g) {
        if (abstractC10396g == null) {
            m37969K(13);
        }
        InterfaceC10251h interfaceC10251hMo32860H = this.f41095g.mo32860H(abstractC10396g);
        if (!this.f41096h.m36756k()) {
            return new C10256m(interfaceC10251hMo32860H, m37970L0());
        }
        if (interfaceC10251hMo32860H == null) {
            m37969K(14);
        }
        return interfaceC10251hMo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J */
    public Collection<InterfaceC10585e> mo32861J() {
        Collection<InterfaceC10585e> collectionMo32861J = this.f41095g.mo32861J();
        if (collectionMo32861J == null) {
            m37969K(31);
        }
        return collectionMo32861J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return this.f41095g.mo32862J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: K0 */
    public InterfaceC10735w0 mo37677K0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35674a(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f41095g.mo32863M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10585e mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37969K(23);
        }
        return c10366l1.m36756k() ? this : new C10669s(this, C10366l1.m36748h(c10366l1.m36755j(), m37970L0().m36755j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public InterfaceC10582d mo32864R() {
        return this.f41095g.mo32864R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: S */
    public InterfaceC10251h mo32866S() {
        InterfaceC10251h interfaceC10251hMo32866S = this.f41095g.mo32866S();
        if (interfaceC10251hMo32866S == null) {
            m37969K(15);
        }
        return interfaceC10251hMo32866S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public InterfaceC10585e mo32869U() {
        return this.f41095g.mo32869U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: a0 */
    public InterfaceC10251h mo37678a0(AbstractC10360j1 abstractC10360j1) {
        if (abstractC10360j1 == null) {
            m37969K(10);
        }
        InterfaceC10251h interfaceC10251hMo36986v = mo36986v(abstractC10360j1, C10235a.m36077k(C10187d.m35819g(this)));
        if (interfaceC10251hMo36986v == null) {
            m37969K(11);
        }
        return interfaceC10251hMo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        InterfaceC10609m interfaceC10609mMo32876b = this.f41095g.mo32876b();
        if (interfaceC10609mMo32876b == null) {
            m37969K(22);
        }
        return interfaceC10609mMo32876b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        InterfaceC10620g annotations = this.f41095g.getAnnotations();
        if (annotations == null) {
            m37969K(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10598i0
    public C10163f getName() {
        C10163f name = this.f41095g.getName();
        if (name == null) {
            m37969K(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u visibility = this.f41095g.getVisibility();
        if (visibility == null) {
            m37969K(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        InterfaceC10345e1 interfaceC10345e1Mo32877h = this.f41095g.mo32877h();
        if (this.f41096h.m36756k()) {
            if (interfaceC10345e1Mo32877h == null) {
                m37969K(0);
            }
            return interfaceC10345e1Mo32877h;
        }
        if (this.f41100l == null) {
            C10366l1 c10366l1M37970L0 = m37970L0();
            Collection<AbstractC10344e0> collectionMo35998a = interfaceC10345e1Mo32877h.mo35998a();
            ArrayList arrayList = new ArrayList(collectionMo35998a.size());
            Iterator<AbstractC10344e0> it = collectionMo35998a.iterator();
            while (it.hasNext()) {
                arrayList.add(c10366l1M37970L0.m36759p(it.next(), EnumC10384r1.INVARIANT));
            }
            this.f41100l = new C10364l(this, this.f41098j, arrayList, C10322f.f40008b);
        }
        InterfaceC10345e1 interfaceC10345e1 = this.f41100l;
        if (interfaceC10345e1 == null) {
            m37969K(1);
        }
        return interfaceC10345e1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        EnumC10588f enumC10588fMo32878i = this.f41095g.mo32878i();
        if (enumC10588fMo32878i == null) {
            m37969K(25);
        }
        return enumC10588fMo32878i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        return this.f41095g.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        EnumC10583d0 enumC10583d0Mo32879j = this.f41095g.mo32879j();
        if (enumC10583d0Mo32879j == null) {
            m37969K(26);
        }
        return enumC10583d0Mo32879j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: k */
    public Collection<InterfaceC10582d> mo32880k() {
        Collection<InterfaceC10582d> collectionMo32880k = this.f41095g.mo32880k();
        ArrayList arrayList = new ArrayList(collectionMo32880k.size());
        for (InterfaceC10582d interfaceC10582d : collectionMo32880k) {
            arrayList.add(((InterfaceC10582d) interfaceC10582d.mo36992u().mo37001h(interfaceC10582d.mo37019a()).mo36997d(interfaceC10582d.mo32879j()).mo37008o(interfaceC10582d.getVisibility()).mo37011r(interfaceC10582d.mo37030i()).mo37003j(false).mo36996c()).mo36396c(m37970L0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        return this.f41095g.mo32881l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return this.f41095g.mo32882m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: s */
    public AbstractC10368m0 mo36400s() {
        AbstractC10368m0 abstractC10368m0M36670j = C10347f0.m36670j(C10373o.f40157a.mo36792a(getAnnotations(), null, null), mo32877h(), C10372n1.m36774g(mo32877h().getParameters()), false, mo33340D0());
        if (abstractC10368m0M36670j == null) {
            m37969K(16);
        }
        return abstractC10368m0M36670j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        if (interfaceC10741z0 == null) {
            m37969K(29);
        }
        return interfaceC10741z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: v */
    public InterfaceC10251h mo36986v(AbstractC10360j1 abstractC10360j1, AbstractC10396g abstractC10396g) {
        if (abstractC10360j1 == null) {
            m37969K(5);
        }
        if (abstractC10396g == null) {
            m37969K(6);
        }
        InterfaceC10251h interfaceC10251hMo36986v = this.f41095g.mo36986v(abstractC10360j1, abstractC10396g);
        if (!this.f41096h.m36756k()) {
            return new C10256m(interfaceC10251hMo36986v, m37970L0());
        }
        if (interfaceC10251hMo36986v == null) {
            m37969K(7);
        }
        return interfaceC10251hMo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        m37970L0();
        List<InterfaceC10587e1> list = this.f41099k;
        if (list == null) {
            m37969K(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: y0 */
    public InterfaceC10251h mo33348y0() {
        InterfaceC10251h interfaceC10251hMo33348y0 = this.f41095g.mo33348y0();
        if (interfaceC10251hMo33348y0 == null) {
            m37969K(28);
        }
        return interfaceC10251hMo33348y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return this.f41095g.mo32885z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        AbstractC10593g1<AbstractC10368m0> abstractC10593g1Mo32886z0 = this.f41095g.mo32886z0();
        if (abstractC10593g1Mo32886z0 == null) {
            return null;
        }
        return abstractC10593g1Mo32886z0.m37692b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10585e mo37019a() {
        InterfaceC10585e interfaceC10585eMo37019a = this.f41095g.mo37019a();
        if (interfaceC10585eMo37019a == null) {
            m37969K(21);
        }
        return interfaceC10585eMo37019a;
    }
}
