package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10380q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0 */
/* loaded from: classes2.dex */
public final class C10656j0 extends AbstractC10666p implements InterfaceC10654i0 {

    /* renamed from: L */
    private final InterfaceC10330n f40990L;

    /* renamed from: M */
    private final InterfaceC10584d1 f40991M;

    /* renamed from: N */
    private final InterfaceC10326j f40992N;

    /* renamed from: O */
    private InterfaceC10582d f40993O;

    /* renamed from: K */
    static final /* synthetic */ KProperty<Object>[] f40989K = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10656j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: J */
    public static final a f40988J = new a(null);

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C10366l1 m37867c(InterfaceC10584d1 interfaceC10584d1) {
            if (interfaceC10584d1.mo36399r() == null) {
                return null;
            }
            return C10366l1.m36746f(interfaceC10584d1.mo36395W());
        }

        /* renamed from: b */
        public final InterfaceC10654i0 m37868b(InterfaceC10330n interfaceC10330n, InterfaceC10584d1 interfaceC10584d1, InterfaceC10582d interfaceC10582d) {
            InterfaceC10582d interfaceC10582dMo36396c;
            List<InterfaceC10735w0> listM38888j;
            C9801m.m32346f(interfaceC10330n, "storageManager");
            C9801m.m32346f(interfaceC10584d1, "typeAliasDescriptor");
            C9801m.m32346f(interfaceC10582d, "constructor");
            C10366l1 c10366l1M37867c = m37867c(interfaceC10584d1);
            if (c10366l1M37867c == null || (interfaceC10582dMo36396c = interfaceC10582d.mo36396c(c10366l1M37867c)) == null) {
                return null;
            }
            InterfaceC10620g annotations = interfaceC10582d.getAnnotations();
            InterfaceC10576b.a aVarMo37030i = interfaceC10582d.mo37030i();
            C9801m.m32345e(aVarMo37030i, "constructor.kind");
            InterfaceC10741z0 interfaceC10741z0Mo32883t = interfaceC10584d1.mo32883t();
            C9801m.m32345e(interfaceC10741z0Mo32883t, "typeAliasDescriptor.source");
            C10656j0 c10656j0 = new C10656j0(interfaceC10330n, interfaceC10584d1, interfaceC10582dMo36396c, null, annotations, aVarMo37030i, interfaceC10741z0Mo32883t, null);
            List<InterfaceC10599i1> listM37913P0 = AbstractC10666p.m37913P0(c10656j0, interfaceC10582d.mo37028f(), c10366l1M37867c);
            if (listM37913P0 == null) {
                return null;
            }
            AbstractC10368m0 abstractC10368m0M36584c = C10335b0.m36584c(interfaceC10582dMo36396c.getReturnType().mo36635R0());
            AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10584d1.mo36400s();
            C9801m.m32345e(abstractC10368m0Mo36400s, "typeAliasDescriptor.defaultType");
            AbstractC10368m0 abstractC10368m0M36816j = C10380q0.m36816j(abstractC10368m0M36584c, abstractC10368m0Mo36400s);
            InterfaceC10735w0 interfaceC10735w0Mo37029f0 = interfaceC10582d.mo37029f0();
            InterfaceC10735w0 interfaceC10735w0M35790h = interfaceC10735w0Mo37029f0 != null ? C10186c.m35790h(c10656j0, c10366l1M37867c.m36758n(interfaceC10735w0Mo37029f0.getType(), EnumC10384r1.INVARIANT), InterfaceC10620g.f40808c.m37735b()) : null;
            InterfaceC10585e interfaceC10585eMo36399r = interfaceC10584d1.mo36399r();
            if (interfaceC10585eMo36399r != null) {
                List<InterfaceC10735w0> listMo37035r0 = interfaceC10582d.mo37035r0();
                C9801m.m32345e(listMo37035r0, "constructor.contextReceiverParameters");
                listM38888j = new ArrayList<>(C10819v.m38911u(listMo37035r0, 10));
                Iterator<T> it = listMo37035r0.iterator();
                while (it.hasNext()) {
                    listM38888j.add(C10186c.m35785c(interfaceC10585eMo36399r, c10366l1M37867c.m36758n(((InterfaceC10735w0) it.next()).getType(), EnumC10384r1.INVARIANT), InterfaceC10620g.f40808c.m37735b()));
                }
            } else {
                listM38888j = C10817u.m38888j();
            }
            c10656j0.mo37850S0(interfaceC10735w0M35790h, null, listM38888j, interfaceC10584d1.mo32884w(), listM37913P0, abstractC10368m0M36816j, EnumC10583d0.FINAL, interfaceC10584d1.getVisibility());
            return c10656j0;
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0$b */
    static final class b extends Lambda implements Function0<C10656j0> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10582d f40995g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC10582d interfaceC10582d) {
            super(0);
            this.f40995g = interfaceC10582d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10656j0 invoke() {
            InterfaceC10330n interfaceC10330nM37859h0 = C10656j0.this.m37859h0();
            InterfaceC10584d1 interfaceC10584d1M37864p1 = C10656j0.this.m37864p1();
            InterfaceC10582d interfaceC10582d = this.f40995g;
            C10656j0 c10656j0 = C10656j0.this;
            InterfaceC10620g annotations = interfaceC10582d.getAnnotations();
            InterfaceC10576b.a aVarMo37030i = this.f40995g.mo37030i();
            C9801m.m32345e(aVarMo37030i, "underlyingConstructorDescriptor.kind");
            InterfaceC10741z0 interfaceC10741z0Mo32883t = C10656j0.this.m37864p1().mo32883t();
            C9801m.m32345e(interfaceC10741z0Mo32883t, "typeAliasDescriptor.source");
            C10656j0 c10656j02 = new C10656j0(interfaceC10330nM37859h0, interfaceC10584d1M37864p1, interfaceC10582d, c10656j0, annotations, aVarMo37030i, interfaceC10741z0Mo32883t, null);
            C10656j0 c10656j03 = C10656j0.this;
            InterfaceC10582d interfaceC10582d2 = this.f40995g;
            C10366l1 c10366l1M37867c = C10656j0.f40988J.m37867c(c10656j03.m37864p1());
            if (c10366l1M37867c == null) {
                return null;
            }
            InterfaceC10735w0 interfaceC10735w0Mo37029f0 = interfaceC10582d2.mo37029f0();
            InterfaceC10735w0 interfaceC10735w0Mo36396c = interfaceC10735w0Mo37029f0 != null ? interfaceC10735w0Mo37029f0.mo36396c(c10366l1M37867c) : null;
            List<InterfaceC10735w0> listMo37035r0 = interfaceC10582d2.mo37035r0();
            C9801m.m32345e(listMo37035r0, "underlyingConstructorDes…contextReceiverParameters");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37035r0, 10));
            Iterator<T> it = listMo37035r0.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10735w0) it.next()).mo36396c(c10366l1M37867c));
            }
            c10656j02.mo37850S0(null, interfaceC10735w0Mo36396c, arrayList, c10656j03.m37864p1().mo32884w(), c10656j03.mo37028f(), c10656j03.getReturnType(), EnumC10583d0.FINAL, c10656j03.m37864p1().getVisibility());
            return c10656j02;
        }
    }

    private C10656j0(InterfaceC10330n interfaceC10330n, InterfaceC10584d1 interfaceC10584d1, InterfaceC10582d interfaceC10582d, InterfaceC10654i0 interfaceC10654i0, InterfaceC10620g interfaceC10620g, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10584d1, interfaceC10654i0, interfaceC10620g, C10165h.f39273i, aVar, interfaceC10741z0);
        this.f40990L = interfaceC10330n;
        this.f40991M = interfaceC10584d1;
        m37922W0(m37864p1().mo32859E0());
        this.f40992N = interfaceC10330n.mo36518f(new b(interfaceC10582d));
        this.f40993O = interfaceC10582d;
    }

    public /* synthetic */ C10656j0(InterfaceC10330n interfaceC10330n, InterfaceC10584d1 interfaceC10584d1, InterfaceC10582d interfaceC10582d, InterfaceC10654i0 interfaceC10654i0, InterfaceC10620g interfaceC10620g, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0, C9789g c9789g) {
        this(interfaceC10330n, interfaceC10584d1, interfaceC10582d, interfaceC10654i0, interfaceC10620g, aVar, interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l
    /* renamed from: B */
    public boolean mo37713B() {
        return mo37856p0().mo37713B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l
    /* renamed from: C */
    public InterfaceC10585e mo37714C() {
        InterfaceC10585e interfaceC10585eMo37714C = mo37856p0().mo37714C();
        C9801m.m32345e(interfaceC10585eMo37714C, "underlyingConstructorDescriptor.constructedClass");
        return interfaceC10585eMo37714C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        AbstractC10344e0 returnType = super.getReturnType();
        C9801m.m32343c(returnType);
        return returnType;
    }

    /* renamed from: h0 */
    public final InterfaceC10330n m37859h0() {
        return this.f40990L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10654i0 mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(enumC10583d0, "modality");
        C9801m.m32346f(abstractC10730u, "visibility");
        C9801m.m32346f(aVar, "kind");
        InterfaceC10738y interfaceC10738yMo36996c = mo36992u().mo37009p(interfaceC10609m).mo36997d(enumC10583d0).mo37008o(abstractC10730u).mo37011r(aVar).mo37003j(z).mo36996c();
        C9801m.m32344d(interfaceC10738yMo36996c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC10654i0) interfaceC10738yMo36996c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C10656j0 mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(interfaceC10741z0, "source");
        InterfaceC10576b.a aVar2 = InterfaceC10576b.a.DECLARATION;
        if (aVar != aVar2) {
            InterfaceC10576b.a aVar3 = InterfaceC10576b.a.SYNTHESIZED;
        }
        return new C10656j0(this.f40990L, m37864p1(), mo37856p0(), this, interfaceC10620g, aVar2, interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10584d1 mo32876b() {
        return m37864p1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10654i0 mo37019a() {
        InterfaceC10738y interfaceC10738yMo37019a = super.mo37019a();
        C9801m.m32344d(interfaceC10738yMo37019a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC10654i0) interfaceC10738yMo37019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10654i0
    /* renamed from: p0 */
    public InterfaceC10582d mo37856p0() {
        return this.f40993O;
    }

    /* renamed from: p1 */
    public InterfaceC10584d1 m37864p1() {
        return this.f40991M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10654i0 mo36396c(C10366l1 c10366l1) {
        C9801m.m32346f(c10366l1, "substitutor");
        InterfaceC10738y interfaceC10738yMo36396c = super.mo36396c(c10366l1);
        C9801m.m32344d(interfaceC10738yMo36396c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C10656j0 c10656j0 = (C10656j0) interfaceC10738yMo36396c;
        C10366l1 c10366l1M36746f = C10366l1.m36746f(c10656j0.getReturnType());
        C9801m.m32345e(c10366l1M36746f, "create(substitutedTypeAliasConstructor.returnType)");
        InterfaceC10582d interfaceC10582dMo36396c = mo37856p0().mo37019a().mo36396c(c10366l1M36746f);
        if (interfaceC10582dMo36396c == null) {
            return null;
        }
        c10656j0.f40993O = interfaceC10582dMo36396c;
        return c10656j0;
    }
}
