package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.comparisons.C10839b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10257n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10441h;

/* compiled from: IntersectionTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.d0 */
/* loaded from: classes3.dex */
public final class C10341d0 implements InterfaceC10345e1, InterfaceC10441h {

    /* renamed from: a */
    private AbstractC10344e0 f40048a;

    /* renamed from: b */
    private final LinkedHashSet<AbstractC10344e0> f40049b;

    /* renamed from: c */
    private final int f40050c;

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$a */
    static final class a extends Lambda implements Function1<AbstractC10396g, AbstractC10368m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            return C10341d0.this.mo35999b(abstractC10396g).m36602h();
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$b */
    public static final class b<T> implements Comparator {

        /* renamed from: f */
        final /* synthetic */ Function1 f40052f;

        public b(Function1 function1) {
            this.f40052f = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) t;
            Function1 function1 = this.f40052f;
            C9801m.m32345e(abstractC10344e0, "it");
            String string = function1.invoke(abstractC10344e0).toString();
            AbstractC10344e0 abstractC10344e02 = (AbstractC10344e0) t2;
            Function1 function12 = this.f40052f;
            C9801m.m32345e(abstractC10344e02, "it");
            return C10839b.m39017a(string, function12.invoke(abstractC10344e02).toString());
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$c */
    static final class c extends Lambda implements Function1<AbstractC10344e0, String> {

        /* renamed from: f */
        public static final c f40053f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "it");
            return abstractC10344e0.toString();
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$d */
    static final class d extends Lambda implements Function1<AbstractC10344e0, CharSequence> {

        /* renamed from: f */
        final /* synthetic */ Function1<AbstractC10344e0, Object> f40054f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super AbstractC10344e0, ? extends Object> function1) {
            super(1);
            this.f40054f = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10344e0 abstractC10344e0) {
            Function1<AbstractC10344e0, Object> function1 = this.f40054f;
            C9801m.m32345e(abstractC10344e0, "it");
            return function1.invoke(abstractC10344e0).toString();
        }
    }

    public C10341d0(Collection<? extends AbstractC10344e0> collection) {
        C9801m.m32346f(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<AbstractC10344e0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f40049b = linkedHashSet;
        this.f40050c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static /* synthetic */ String m36600k(C10341d0 c10341d0, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = c.f40053f;
        }
        return c10341d0.m36604j(function1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: a */
    public Collection<AbstractC10344e0> mo35998a() {
        return this.f40049b;
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
        if (obj instanceof C10341d0) {
            return C9801m.m32341a(this.f40049b, ((C10341d0) obj).f40049b);
        }
        return false;
    }

    /* renamed from: g */
    public final InterfaceC10251h m36601g() {
        return C10257n.f39681b.m36175a("member scope for intersection type", this.f40049b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    /* renamed from: h */
    public final AbstractC10368m0 m36602h() {
        return C10347f0.m36671k(C10333a1.f40041g.m36577h(), this, C10817u.m38888j(), false, m36601g(), new a());
    }

    public int hashCode() {
        return this.f40050c;
    }

    /* renamed from: i */
    public final AbstractC10344e0 m36603i() {
        return this.f40048a;
    }

    /* renamed from: j */
    public final String m36604j(Function1<? super AbstractC10344e0, ? extends Object> function1) {
        C9801m.m32346f(function1, "getProperTypeRelatedToStringify");
        return C10782c0.m38599e0(C10782c0.m38618x0(this.f40049b, new b(function1)), " & ", "{", "}", 0, null, new d(function1), 24, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C10341d0 mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        Collection<AbstractC10344e0> collectionMo35998a = mo35998a();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo35998a, 10));
        Iterator<T> it = collectionMo35998a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC10344e0) it.next()).mo36558Y0(abstractC10396g));
            z = true;
        }
        C10341d0 c10341d0M36606m = null;
        if (z) {
            AbstractC10344e0 abstractC10344e0M36603i = m36603i();
            c10341d0M36606m = new C10341d0(arrayList).m36606m(abstractC10344e0M36603i != null ? abstractC10344e0M36603i.mo36558Y0(abstractC10396g) : null);
        }
        return c10341d0M36606m == null ? this : c10341d0M36606m;
    }

    /* renamed from: m */
    public final C10341d0 m36606m(AbstractC10344e0 abstractC10344e0) {
        return new C10341d0(this.f40049b, abstractC10344e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        AbstractC9914h abstractC9914hMo36004o = this.f40049b.iterator().next().mo35993O0().mo36004o();
        C9801m.m32345e(abstractC9914hMo36004o, "intersectedTypes.iterato…xt().constructor.builtIns");
        return abstractC9914hMo36004o;
    }

    public String toString() {
        return m36600k(this, null, 1, null);
    }

    private C10341d0(Collection<? extends AbstractC10344e0> collection, AbstractC10344e0 abstractC10344e0) {
        this(collection);
        this.f40048a = abstractC10344e0;
    }
}
