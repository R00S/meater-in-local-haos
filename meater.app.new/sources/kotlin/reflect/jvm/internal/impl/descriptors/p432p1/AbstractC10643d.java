package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10656j0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d */
/* loaded from: classes2.dex */
public abstract class AbstractC10643d extends AbstractC10657k implements InterfaceC10584d1 {

    /* renamed from: j */
    private final AbstractC10730u f40947j;

    /* renamed from: k */
    private List<? extends InterfaceC10587e1> f40948k;

    /* renamed from: l */
    private final c f40949l;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$a */
    static final class a extends Lambda implements Function1<AbstractC10396g, AbstractC10368m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
            InterfaceC10594h interfaceC10594hMo36928f = abstractC10396g.mo36928f(AbstractC10643d.this);
            if (interfaceC10594hMo36928f != null) {
                return interfaceC10594hMo36928f.mo36400s();
            }
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$b */
    static final class b extends Lambda implements Function1<AbstractC10381q1, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.C9801m.m32345e(r5, r0)
                boolean r0 = kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0.m36706a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                kotlin.reflect.jvm.internal.impl.descriptors.p1.d r0 = kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643d.this
                kotlin.f0.y.e.j0.l.e1 r5 = r5.mo35993O0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.mo32891w()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
                if (r3 == 0) goto L29
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1) r5
                kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo32876b()
                boolean r5 = kotlin.jvm.internal.C9801m.m32341a(r5, r0)
                if (r5 != 0) goto L29
                r5 = 1
                goto L2a
            L29:
                r5 = 0
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = 0
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643d.b.invoke(kotlin.f0.y.e.j0.l.q1):java.lang.Boolean");
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$c */
    public static final class c implements InterfaceC10345e1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: a */
        public Collection<AbstractC10344e0> mo35998a() {
            Collection<AbstractC10344e0> collectionMo35998a = mo32891w().mo36397g0().mo35993O0().mo35998a();
            C9801m.m32345e(collectionMo35998a, "declarationDescriptor.un…pe.constructor.supertypes");
            return collectionMo35998a;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: b */
        public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            return this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC10584d1 mo32891w() {
            return AbstractC10643d.this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            return AbstractC10643d.this.mo36390N0();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: o */
        public AbstractC9914h mo36004o() {
            return C10235a.m36072f(mo32891w());
        }

        public String toString() {
            return "[typealias " + mo32891w().getName().m35455k() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10643d(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, AbstractC10730u abstractC10730u) {
        super(interfaceC10609m, interfaceC10620g, c10163f, interfaceC10741z0);
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC10741z0, "sourceElement");
        C9801m.m32346f(abstractC10730u, "visibilityImpl");
        this.f40947j = abstractC10730u;
        this.f40949l = new c();
    }

    /* renamed from: A0 */
    protected final AbstractC10368m0 m37819A0() {
        InterfaceC10251h interfaceC10251hMo33340D0;
        InterfaceC10585e interfaceC10585eMo36399r = mo36399r();
        if (interfaceC10585eMo36399r == null || (interfaceC10251hMo33340D0 = interfaceC10585eMo36399r.mo33340D0()) == null) {
            interfaceC10251hMo33340D0 = InterfaceC10251h.b.f39671b;
        }
        AbstractC10368m0 abstractC10368m0M36787t = C10372n1.m36787t(this, interfaceC10251hMo33340D0, new a());
        C9801m.m32345e(abstractC10368m0M36787t, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return abstractC10368m0M36787t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        C9801m.m32346f(interfaceC10628o, "visitor");
        return interfaceC10628o.mo35677e(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10584d1 mo37019a() {
        InterfaceC10635p interfaceC10635pMo37019a = super.mo37019a();
        C9801m.m32344d(interfaceC10635pMo37019a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (InterfaceC10584d1) interfaceC10635pMo37019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    /* renamed from: M0 */
    public final Collection<InterfaceC10654i0> m37821M0() {
        InterfaceC10585e interfaceC10585eMo36399r = mo36399r();
        if (interfaceC10585eMo36399r == null) {
            return C10817u.m38888j();
        }
        Collection<InterfaceC10582d> collectionMo32880k = interfaceC10585eMo36399r.mo32880k();
        C9801m.m32345e(collectionMo32880k, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10582d interfaceC10582d : collectionMo32880k) {
            C10656j0.a aVar = C10656j0.f40988J;
            InterfaceC10330n interfaceC10330nMo36398h0 = mo36398h0();
            C9801m.m32345e(interfaceC10582d, "it");
            InterfaceC10654i0 interfaceC10654i0M37868b = aVar.m37868b(interfaceC10330nMo36398h0, this, interfaceC10582d);
            if (interfaceC10654i0M37868b != null) {
                arrayList.add(interfaceC10654i0M37868b);
            }
        }
        return arrayList;
    }

    /* renamed from: N0 */
    protected abstract List<InterfaceC10587e1> mo36390N0();

    /* renamed from: O0 */
    public final void m37822O0(List<? extends InterfaceC10587e1> list) {
        C9801m.m32346f(list, "declaredTypeParameters");
        this.f40948k = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        return this.f40947j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        return this.f40949l;
    }

    /* renamed from: h0 */
    protected abstract InterfaceC10330n mo36398h0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return C10372n1.m36770c(mo36397g0(), new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j
    public String toString() {
        return "typealias " + getName().m35455k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        List list = this.f40948k;
        if (list != null) {
            return list;
        }
        C9801m.m32363w("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }
}
