package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;

/* compiled from: ClassConstructorDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.f */
/* loaded from: classes2.dex */
public class C10647f extends AbstractC10666p implements InterfaceC10582d {

    /* renamed from: J */
    protected final boolean f40971J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10647f(InterfaceC10585e interfaceC10585e, InterfaceC10606l interfaceC10606l, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10585e, interfaceC10606l, interfaceC10620g, C10165h.f39273i, aVar, interfaceC10741z0);
        if (interfaceC10585e == null) {
            m37840v(0);
        }
        if (interfaceC10620g == null) {
            m37840v(1);
        }
        if (aVar == null) {
            m37840v(2);
        }
        if (interfaceC10741z0 == null) {
            m37840v(3);
        }
        this.f40971J = z;
    }

    /* renamed from: l1 */
    private List<InterfaceC10735w0> m37838l1() {
        InterfaceC10585e interfaceC10585eMo32876b = mo32876b();
        if (interfaceC10585eMo32876b.mo36281F0().isEmpty()) {
            List<InterfaceC10735w0> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                m37840v(16);
            }
            return listEmptyList;
        }
        List<InterfaceC10735w0> listMo36281F0 = interfaceC10585eMo32876b.mo36281F0();
        if (listMo36281F0 == null) {
            m37840v(15);
        }
        return listMo36281F0;
    }

    /* renamed from: o1 */
    public static C10647f m37839o1(InterfaceC10585e interfaceC10585e, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10585e == null) {
            m37840v(4);
        }
        if (interfaceC10620g == null) {
            m37840v(5);
        }
        if (interfaceC10741z0 == null) {
            m37840v(6);
        }
        return new C10647f(interfaceC10585e, null, interfaceC10620g, z, InterfaceC10576b.a.DECLARATION, interfaceC10741z0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m37840v(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f.m37840v(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l
    /* renamed from: B */
    public boolean mo37713B() {
        return this.f40971J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l
    /* renamed from: C */
    public InterfaceC10585e mo37714C() {
        InterfaceC10585e interfaceC10585eMo32876b = mo32876b();
        if (interfaceC10585eMo32876b == null) {
            m37840v(18);
        }
        return interfaceC10585eMo32876b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo32635h(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10738y> mo37027e() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            m37840v(21);
        }
        return setEmptySet;
    }

    /* renamed from: m1 */
    public InterfaceC10735w0 m37841m1() {
        InterfaceC10585e interfaceC10585eMo32876b = mo32876b();
        if (!interfaceC10585eMo32876b.mo32882m()) {
            return null;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10585eMo32876b.mo32876b();
        if (interfaceC10609mMo32876b instanceof InterfaceC10585e) {
            return ((InterfaceC10585e) interfaceC10609mMo32876b).mo37677K0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10582d mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        InterfaceC10582d interfaceC10582d = (InterfaceC10582d) super.mo36990k0(interfaceC10609m, enumC10583d0, abstractC10730u, aVar, z);
        if (interfaceC10582d == null) {
            m37840v(27);
        }
        return interfaceC10582d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C10647f mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m37840v(23);
        }
        if (aVar == null) {
            m37840v(24);
        }
        if (interfaceC10620g == null) {
            m37840v(25);
        }
        if (interfaceC10741z0 == null) {
            m37840v(26);
        }
        InterfaceC10576b.a aVar2 = InterfaceC10576b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC10576b.a.SYNTHESIZED) {
            return new C10647f((InterfaceC10585e) interfaceC10609m, this, interfaceC10620g, this.f40971J, aVar2, interfaceC10741z0);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC10609m + "\nkind: " + aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10585e mo32876b() {
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) super.mo32876b();
        if (interfaceC10585e == null) {
            m37840v(17);
        }
        return interfaceC10585e;
    }

    /* renamed from: r1 */
    public C10647f m37844r1(List<InterfaceC10599i1> list, AbstractC10730u abstractC10730u) {
        if (list == null) {
            m37840v(13);
        }
        if (abstractC10730u == null) {
            m37840v(14);
        }
        m37845s1(list, abstractC10730u, mo32876b().mo32884w());
        return this;
    }

    /* renamed from: s1 */
    public C10647f m37845s1(List<InterfaceC10599i1> list, AbstractC10730u abstractC10730u, List<InterfaceC10587e1> list2) {
        if (list == null) {
            m37840v(10);
        }
        if (abstractC10730u == null) {
            m37840v(11);
        }
        if (list2 == null) {
            m37840v(12);
        }
        super.mo37850S0(null, m37841m1(), m37838l1(), list2, list, null, EnumC10583d0.FINAL, abstractC10730u);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10576b> collection) {
        if (collection == null) {
            m37840v(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: c */
    public InterfaceC10582d mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37840v(20);
        }
        return (InterfaceC10582d) super.mo36396c(c10366l1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10582d mo37019a() {
        InterfaceC10582d interfaceC10582d = (InterfaceC10582d) super.mo37019a();
        if (interfaceC10582d == null) {
            m37840v(19);
        }
        return interfaceC10582d;
    }
}
