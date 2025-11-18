package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10218n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10341d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10376p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10380q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10416u0;

/* compiled from: IntersectionType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.w */
/* loaded from: classes3.dex */
public final class C10412w {

    /* renamed from: a */
    public static final C10412w f40213a = new C10412w();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.w$a */
    private static final class a {

        /* renamed from: f */
        public static final a f40214f = new c("START", 0);

        /* renamed from: g */
        public static final a f40215g = new C11574a("ACCEPT_NULL", 1);

        /* renamed from: h */
        public static final a f40216h = new d("UNKNOWN", 2);

        /* renamed from: i */
        public static final a f40217i = new b("NOT_NULL", 3);

        /* renamed from: j */
        private static final /* synthetic */ a[] f40218j = m36971g();

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.t1.w$a$a, reason: collision with other inner class name */
        static final class C11574a extends a {
            C11574a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10412w.a
            /* renamed from: k */
            public a mo36972k(AbstractC10381q1 abstractC10381q1) {
                C9801m.m32346f(abstractC10381q1, "nextType");
                return m36973q(abstractC10381q1);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.t1.w$a$b */
        static final class b extends a {
            b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10412w.a
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo36972k(AbstractC10381q1 abstractC10381q1) {
                C9801m.m32346f(abstractC10381q1, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.t1.w$a$c */
        static final class c extends a {
            c(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10412w.a
            /* renamed from: k */
            public a mo36972k(AbstractC10381q1 abstractC10381q1) {
                C9801m.m32346f(abstractC10381q1, "nextType");
                return m36973q(abstractC10381q1);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.t1.w$a$d */
        static final class d extends a {
            d(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10412w.a
            /* renamed from: k */
            public a mo36972k(AbstractC10381q1 abstractC10381q1) {
                C9801m.m32346f(abstractC10381q1, "nextType");
                a aVarM36973q = m36973q(abstractC10381q1);
                return aVarM36973q == a.f40215g ? this : aVarM36973q;
            }
        }

        private a(String str, int i2) {
        }

        public /* synthetic */ a(String str, int i2, C9789g c9789g) {
            this(str, i2);
        }

        /* renamed from: g */
        private static final /* synthetic */ a[] m36971g() {
            return new a[]{f40214f, f40215g, f40216h, f40217i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40218j.clone();
        }

        /* renamed from: k */
        public abstract a mo36972k(AbstractC10381q1 abstractC10381q1);

        /* renamed from: q */
        protected final a m36973q(AbstractC10381q1 abstractC10381q1) {
            C9801m.m32346f(abstractC10381q1, "<this>");
            return abstractC10381q1.mo33691P0() ? f40215g : ((abstractC10381q1 instanceof C10376p) && (((C10376p) abstractC10381q1).m36794a1() instanceof C10416u0)) ? f40217i : abstractC10381q1 instanceof C10416u0 ? f40216h : C10404o.f40207a.m36955a(abstractC10381q1) ? f40217i : f40216h;
        }
    }

    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.w$b */
    static final class b extends Lambda implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Set<AbstractC10368m0> f40219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends AbstractC10368m0> set) {
            super(0);
            this.f40219f = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "This collections cannot be empty! input types: " + C10782c0.m38599e0(this.f40219f, null, null, null, 0, null, null, 63, null);
        }
    }

    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.w$c */
    /* synthetic */ class c extends C9793i implements Function2<AbstractC10344e0, AbstractC10344e0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10412w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
            C9801m.m32346f(abstractC10344e0, "p0");
            C9801m.m32346f(abstractC10344e02, "p1");
            return Boolean.valueOf(((C10412w) this.receiver).m36969e(abstractC10344e0, abstractC10344e02));
        }
    }

    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.w$d */
    /* synthetic */ class d extends C9793i implements Function2<AbstractC10344e0, AbstractC10344e0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10402m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
            C9801m.m32346f(abstractC10344e0, "p0");
            C9801m.m32346f(abstractC10344e02, "p1");
            return Boolean.valueOf(((C10402m) this.receiver).mo36919b(abstractC10344e0, abstractC10344e02));
        }
    }

    private C10412w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection<kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0> m36967b(java.util.Collection<? extends kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0> r8, kotlin.jvm.functions.Function2<? super kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0, ? super kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.C9801m.m32345e(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            kotlin.f0.y.e.j0.l.m0 r1 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
        L22:
            r3 = 0
            goto L51
        L24:
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            kotlin.f0.y.e.j0.l.m0 r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0) r5
            if (r5 == r1) goto L4e
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.C9801m.m32345e(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.C9801m.m32345e(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r5 == 0) goto L28
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10412w.m36967b(java.util.Collection, kotlin.a0.c.p):java.util.Collection");
    }

    /* renamed from: d */
    private final AbstractC10368m0 m36968d(Set<? extends AbstractC10368m0> set) {
        if (set.size() == 1) {
            return (AbstractC10368m0) C10813s.m38864r0(set);
        }
        new b(set);
        Collection<AbstractC10368m0> collectionM36967b = m36967b(set, new c(this));
        collectionM36967b.isEmpty();
        AbstractC10368m0 abstractC10368m0M36048b = C10218n.f39567a.m36048b(collectionM36967b);
        if (abstractC10368m0M36048b != null) {
            return abstractC10368m0M36048b;
        }
        Collection<AbstractC10368m0> collectionM36967b2 = m36967b(collectionM36967b, new d(InterfaceC10401l.f40201b.m36950a()));
        collectionM36967b2.isEmpty();
        return collectionM36967b2.size() < 2 ? (AbstractC10368m0) C10813s.m38864r0(collectionM36967b2) : new C10341d0(set).m36602h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m36969e(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C10402m c10402mM36950a = InterfaceC10401l.f40201b.m36950a();
        return c10402mM36950a.mo36920d(abstractC10344e0, abstractC10344e02) && !c10402mM36950a.mo36920d(abstractC10344e02, abstractC10344e0);
    }

    /* renamed from: c */
    public final AbstractC10368m0 m36970c(List<? extends AbstractC10368m0> list) {
        C9801m.m32346f(list, "types");
        list.size();
        ArrayList<AbstractC10368m0> arrayList = new ArrayList();
        for (AbstractC10368m0 abstractC10368m0 : list) {
            if (abstractC10368m0.mo35993O0() instanceof C10341d0) {
                Collection<AbstractC10344e0> collectionMo35998a = abstractC10368m0.mo35993O0().mo35998a();
                C9801m.m32345e(collectionMo35998a, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(collectionMo35998a, 10));
                for (AbstractC10344e0 abstractC10344e0 : collectionMo35998a) {
                    C9801m.m32345e(abstractC10344e0, "it");
                    AbstractC10368m0 abstractC10368m0M36585d = C10335b0.m36585d(abstractC10344e0);
                    if (abstractC10368m0.mo33691P0()) {
                        abstractC10368m0M36585d = abstractC10368m0M36585d.mo33545S0(true);
                    }
                    arrayList2.add(abstractC10368m0M36585d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC10368m0);
            }
        }
        a aVarMo36972k = a.f40214f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarMo36972k = aVarMo36972k.mo36972k((AbstractC10381q1) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC10368m0 abstractC10368m0M36815i : arrayList) {
            if (aVarMo36972k == a.f40217i) {
                if (abstractC10368m0M36815i instanceof C10398i) {
                    abstractC10368m0M36815i = C10380q0.m36817k((C10398i) abstractC10368m0M36815i);
                }
                abstractC10368m0M36815i = C10380q0.m36815i(abstractC10368m0M36815i, false, 1, null);
            }
            linkedHashSet.add(abstractC10368m0M36815i);
        }
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AbstractC10368m0) it2.next()).mo35992N0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((C10333a1) next).m36571q((C10333a1) it3.next());
        }
        return m36968d(linkedHashSet).mo33547U0((C10333a1) next);
    }
}
