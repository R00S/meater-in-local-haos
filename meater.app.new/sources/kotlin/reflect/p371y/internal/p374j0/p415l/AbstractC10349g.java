package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Collection;
import java.util.List;
import kotlin.C10550i;
import kotlin.C10775u;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10397h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;

/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10349g extends AbstractC10367m {

    /* renamed from: b */
    private final InterfaceC10325i<b> f40107b;

    /* renamed from: c */
    private final boolean f40108c;

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$a */
    private final class a implements InterfaceC10345e1 {

        /* renamed from: a */
        private final AbstractC10396g f40109a;

        /* renamed from: b */
        private final Lazy f40110b;

        /* renamed from: c */
        final /* synthetic */ AbstractC10349g f40111c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$a$a, reason: collision with other inner class name */
        static final class C11572a extends Lambda implements Function0<List<? extends AbstractC10344e0>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10349g f40113g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11572a(AbstractC10349g abstractC10349g) {
                super(0);
                this.f40113g = abstractC10349g;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC10344e0> invoke() {
                return C10397h.m36933b(a.this.f40109a, this.f40113g.mo35998a());
            }
        }

        public a(AbstractC10349g abstractC10349g, AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            this.f40111c = abstractC10349g;
            this.f40109a = abstractC10396g;
            this.f40110b = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new C11572a(abstractC10349g));
        }

        /* renamed from: h */
        private final List<AbstractC10344e0> m36694h() {
            return (List) this.f40110b.getValue();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: b */
        public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            return this.f40111c.mo35999b(abstractC10396g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: c */
        public InterfaceC10594h mo32891w() {
            return this.f40111c.mo32891w();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return this.f40111c.mo32888e();
        }

        public boolean equals(Object obj) {
            return this.f40111c.equals(obj);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            List<InterfaceC10587e1> parameters = this.f40111c.getParameters();
            C9801m.m32345e(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f40111c.hashCode();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<AbstractC10344e0> mo35998a() {
            return m36694h();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: o */
        public AbstractC9914h mo36004o() {
            AbstractC9914h abstractC9914hMo36004o = this.f40111c.mo36004o();
            C9801m.m32345e(abstractC9914hMo36004o, "this@AbstractTypeConstructor.builtIns");
            return abstractC9914hMo36004o;
        }

        public String toString() {
            return this.f40111c.toString();
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$b */
    private static final class b {

        /* renamed from: a */
        private final Collection<AbstractC10344e0> f40114a;

        /* renamed from: b */
        private List<? extends AbstractC10344e0> f40115b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends AbstractC10344e0> collection) {
            C9801m.m32346f(collection, "allSupertypes");
            this.f40114a = collection;
            this.f40115b = C10815t.m38883e(C10427k.f40355a.m37065l());
        }

        /* renamed from: a */
        public final Collection<AbstractC10344e0> m36696a() {
            return this.f40114a;
        }

        /* renamed from: b */
        public final List<AbstractC10344e0> m36697b() {
            return this.f40115b;
        }

        /* renamed from: c */
        public final void m36698c(List<? extends AbstractC10344e0> list) {
            C9801m.m32346f(list, "<set-?>");
            this.f40115b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$c */
    static final class c extends Lambda implements Function0<b> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(AbstractC10349g.this.mo32889l());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$d */
    static final class d extends Lambda implements Function1<Boolean, b> {

        /* renamed from: f */
        public static final d f40117f = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final b m36700b(boolean z) {
            return new b(C10815t.m38883e(C10427k.f40355a.m37065l()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return m36700b(bool.booleanValue());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$e */
    static final class e extends Lambda implements Function1<b, C10775u> {

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$a */
        static final class a extends Lambda implements Function1<InterfaceC10345e1, Iterable<? extends AbstractC10344e0>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10349g f40119f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC10349g abstractC10349g) {
                super(1);
                this.f40119f = abstractC10349g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<AbstractC10344e0> invoke(InterfaceC10345e1 interfaceC10345e1) {
                C9801m.m32346f(interfaceC10345e1, "it");
                return this.f40119f.m36687k(interfaceC10345e1, true);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$b */
        static final class b extends Lambda implements Function1<AbstractC10344e0, C10775u> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10349g f40120f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC10349g abstractC10349g) {
                super(1);
                this.f40120f = abstractC10349g;
            }

            /* renamed from: b */
            public final void m36703b(AbstractC10344e0 abstractC10344e0) {
                C9801m.m32346f(abstractC10344e0, "it");
                this.f40120f.m36691t(abstractC10344e0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10775u invoke(AbstractC10344e0 abstractC10344e0) {
                m36703b(abstractC10344e0);
                return C10775u.f41439a;
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$c */
        static final class c extends Lambda implements Function1<InterfaceC10345e1, Iterable<? extends AbstractC10344e0>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10349g f40121f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC10349g abstractC10349g) {
                super(1);
                this.f40121f = abstractC10349g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<AbstractC10344e0> invoke(InterfaceC10345e1 interfaceC10345e1) {
                C9801m.m32346f(interfaceC10345e1, "it");
                return this.f40121f.m36687k(interfaceC10345e1, false);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$d */
        static final class d extends Lambda implements Function1<AbstractC10344e0, C10775u> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10349g f40122f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC10349g abstractC10349g) {
                super(1);
                this.f40122f = abstractC10349g;
            }

            /* renamed from: b */
            public final void m36705b(AbstractC10344e0 abstractC10344e0) {
                C9801m.m32346f(abstractC10344e0, "it");
                this.f40122f.mo36692u(abstractC10344e0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10775u invoke(AbstractC10344e0 abstractC10344e0) {
                m36705b(abstractC10344e0);
                return C10775u.f41439a;
            }
        }

        e() {
            super(1);
        }

        /* renamed from: b */
        public final void m36701b(b bVar) {
            C9801m.m32346f(bVar, "supertypes");
            Collection<AbstractC10344e0> collectionMo37674a = AbstractC10349g.this.mo32890q().mo37674a(AbstractC10349g.this, bVar.m36696a(), new c(AbstractC10349g.this), new d(AbstractC10349g.this));
            if (collectionMo37674a.isEmpty()) {
                AbstractC10344e0 abstractC10344e0Mo36580m = AbstractC10349g.this.mo36580m();
                collectionMo37674a = abstractC10344e0Mo36580m != null ? C10815t.m38883e(abstractC10344e0Mo36580m) : null;
                if (collectionMo37674a == null) {
                    collectionMo37674a = C10817u.m38888j();
                }
            }
            if (AbstractC10349g.this.m36688p()) {
                InterfaceC10581c1 interfaceC10581c1Mo32890q = AbstractC10349g.this.mo32890q();
                AbstractC10349g abstractC10349g = AbstractC10349g.this;
                interfaceC10581c1Mo32890q.mo37674a(abstractC10349g, collectionMo37674a, new a(abstractC10349g), new b(AbstractC10349g.this));
            }
            AbstractC10349g abstractC10349g2 = AbstractC10349g.this;
            List<AbstractC10344e0> listM38569E0 = collectionMo37674a instanceof List ? (List) collectionMo37674a : null;
            if (listM38569E0 == null) {
                listM38569E0 = C10782c0.m38569E0(collectionMo37674a);
            }
            bVar.m36698c(abstractC10349g2.mo36690s(listM38569E0));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(b bVar) {
            m36701b(bVar);
            return C10775u.f41439a;
        }
    }

    public AbstractC10349g(InterfaceC10330n interfaceC10330n) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        this.f40107b = interfaceC10330n.mo36519g(new c(), d.f40117f, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final Collection<AbstractC10344e0> m36687k(InterfaceC10345e1 interfaceC10345e1, boolean z) {
        List listM38609o0;
        AbstractC10349g abstractC10349g = interfaceC10345e1 instanceof AbstractC10349g ? (AbstractC10349g) interfaceC10345e1 : null;
        if (abstractC10349g != null && (listM38609o0 = C10782c0.m38609o0(abstractC10349g.f40107b.invoke().m36696a(), abstractC10349g.mo36581n(z))) != null) {
            return listM38609o0;
        }
        Collection<AbstractC10344e0> collectionMo35998a = interfaceC10345e1.mo35998a();
        C9801m.m32345e(collectionMo35998a, "supertypes");
        return collectionMo35998a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: b */
    public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return new a(this, abstractC10396g);
    }

    /* renamed from: l */
    protected abstract Collection<AbstractC10344e0> mo32889l();

    /* renamed from: m */
    protected AbstractC10344e0 mo36580m() {
        return null;
    }

    /* renamed from: n */
    protected Collection<AbstractC10344e0> mo36581n(boolean z) {
        return C10817u.m38888j();
    }

    /* renamed from: p */
    protected boolean m36688p() {
        return this.f40108c;
    }

    /* renamed from: q */
    protected abstract InterfaceC10581c1 mo32890q();

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public List<AbstractC10344e0> mo35998a() {
        return this.f40107b.invoke().m36697b();
    }

    /* renamed from: s */
    protected List<AbstractC10344e0> mo36690s(List<AbstractC10344e0> list) {
        C9801m.m32346f(list, "supertypes");
        return list;
    }

    /* renamed from: t */
    protected void m36691t(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
    }

    /* renamed from: u */
    protected void mo36692u(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
    }
}
