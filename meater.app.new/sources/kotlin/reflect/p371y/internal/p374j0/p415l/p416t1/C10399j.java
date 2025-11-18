package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10201b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.j */
/* loaded from: classes3.dex */
public final class C10399j implements InterfaceC10201b {

    /* renamed from: a */
    private final InterfaceC10351g1 f40191a;

    /* renamed from: b */
    private Function0<? extends List<? extends AbstractC10381q1>> f40192b;

    /* renamed from: c */
    private final C10399j f40193c;

    /* renamed from: d */
    private final InterfaceC10587e1 f40194d;

    /* renamed from: e */
    private final Lazy f40195e;

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$a */
    static final class a extends Lambda implements Function0<List<? extends AbstractC10381q1>> {

        /* renamed from: f */
        final /* synthetic */ List<AbstractC10381q1> f40196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends AbstractC10381q1> list) {
            super(0);
            this.f40196f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10381q1> invoke() {
            return this.f40196f;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$b */
    static final class b extends Lambda implements Function0<List<? extends AbstractC10381q1>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10381q1> invoke() {
            Function0 function0 = C10399j.this.f40192b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$c */
    static final class c extends Lambda implements Function0<List<? extends AbstractC10381q1>> {

        /* renamed from: f */
        final /* synthetic */ List<AbstractC10381q1> f40198f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends AbstractC10381q1> list) {
            super(0);
            this.f40198f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10381q1> invoke() {
            return this.f40198f;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$d */
    static final class d extends Lambda implements Function0<List<? extends AbstractC10381q1>> {

        /* renamed from: g */
        final /* synthetic */ AbstractC10396g f40200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC10396g abstractC10396g) {
            super(0);
            this.f40200g = abstractC10396g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10381q1> invoke() {
            List<AbstractC10381q1> listMo35998a = C10399j.this.mo35998a();
            AbstractC10396g abstractC10396g = this.f40200g;
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo35998a, 10));
            Iterator<T> it = listMo35998a.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC10381q1) it.next()).mo36558Y0(abstractC10396g));
            }
            return arrayList;
        }
    }

    public C10399j(InterfaceC10351g1 interfaceC10351g1, Function0<? extends List<? extends AbstractC10381q1>> function0, C10399j c10399j, InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(interfaceC10351g1, "projection");
        this.f40191a = interfaceC10351g1;
        this.f40192b = function0;
        this.f40193c = c10399j;
        this.f40194d = interfaceC10587e1;
        this.f40195e = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new b());
    }

    /* renamed from: i */
    private final List<AbstractC10381q1> m36941i() {
        return (List) this.f40195e.getValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public InterfaceC10594h mo32891w() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9801m.m32341a(C10399j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9801m.m32344d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C10399j c10399j = (C10399j) obj;
        C10399j c10399j2 = this.f40193c;
        if (c10399j2 == null) {
            c10399j2 = this;
        }
        C10399j c10399j3 = c10399j.f40193c;
        if (c10399j3 != null) {
            c10399j = c10399j3;
        }
        return c10399j2 == c10399j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10201b
    /* renamed from: f */
    public InterfaceC10351g1 mo35997f() {
        return this.f40191a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<AbstractC10381q1> mo35998a() {
        List<AbstractC10381q1> listM36941i = m36941i();
        return listM36941i == null ? C10817u.m38888j() : listM36941i;
    }

    public int hashCode() {
        C10399j c10399j = this.f40193c;
        return c10399j != null ? c10399j.hashCode() : super.hashCode();
    }

    /* renamed from: j */
    public final void m36943j(List<? extends AbstractC10381q1> list) {
        C9801m.m32346f(list, "supertypes");
        Function0<? extends List<? extends AbstractC10381q1>> function0 = this.f40192b;
        this.f40192b = new c(list);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C10399j mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        InterfaceC10351g1 interfaceC10351g1Mo36709b = mo35997f().mo36709b(abstractC10396g);
        C9801m.m32345e(interfaceC10351g1Mo36709b, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f40192b != null ? new d(abstractC10396g) : null;
        C10399j c10399j = this.f40193c;
        if (c10399j == null) {
            c10399j = this;
        }
        return new C10399j(interfaceC10351g1Mo36709b, dVar, c10399j, this.f40194d);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        AbstractC10344e0 type = mo35997f().getType();
        C9801m.m32345e(type, "projection.type");
        return C10457a.m37142h(type);
    }

    public String toString() {
        return "CapturedType(" + mo35997f() + ')';
    }

    public /* synthetic */ C10399j(InterfaceC10351g1 interfaceC10351g1, Function0 function0, C10399j c10399j, InterfaceC10587e1 interfaceC10587e1, int i2, C9789g c9789g) {
        this(interfaceC10351g1, (i2 & 2) != 0 ? null : function0, (i2 & 4) != 0 ? null : c10399j, (i2 & 8) != 0 ? null : interfaceC10587e1);
    }

    public /* synthetic */ C10399j(InterfaceC10351g1 interfaceC10351g1, List list, C10399j c10399j, int i2, C9789g c9789g) {
        this(interfaceC10351g1, list, (i2 & 4) != 0 ? null : c10399j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10399j(InterfaceC10351g1 interfaceC10351g1, List<? extends AbstractC10381q1> list, C10399j c10399j) {
        this(interfaceC10351g1, new a(list), c10399j, null, 8, null);
        C9801m.m32346f(interfaceC10351g1, "projection");
        C9801m.m32346f(list, "supertypes");
    }
}
