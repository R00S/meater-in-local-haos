package Ib;

import Hb.AbstractC1082f0;
import Hb.C1090j0;
import Hb.C1100o0;
import Hb.C1113z;
import Hb.N;
import Hb.P0;
import Hb.T;
import Hb.U;
import Hb.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: IntersectionType.kt */
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f6969a = new B();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    private static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6970B = new c("START", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f6971C = new C0142a("ACCEPT_NULL", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f6972D = new d("UNKNOWN", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final a f6973E = new b("NOT_NULL", 3);

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ a[] f6974F;

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f6975G;

        /* compiled from: IntersectionType.kt */
        /* renamed from: Ib.B$a$a, reason: collision with other inner class name */
        static final class C0142a extends a {
            C0142a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ib.B.a
            public a j(P0 nextType) {
                C3862t.g(nextType, "nextType");
                return n(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ib.B.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b j(P0 nextType) {
                C3862t.g(nextType, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ib.B.a
            public a j(P0 nextType) {
                C3862t.g(nextType, "nextType");
                return n(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ib.B.a
            public a j(P0 nextType) {
                C3862t.g(nextType, "nextType");
                a aVarN = n(nextType);
                return aVarN == a.f6971C ? this : aVarN;
            }
        }

        static {
            a[] aVarArrC = c();
            f6974F = aVarArrC;
            f6975G = C4929b.a(aVarArrC);
        }

        public /* synthetic */ a(String str, int i10, C3854k c3854k) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f6970B, f6971C, f6972D, f6973E};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6974F.clone();
        }

        public abstract a j(P0 p02);

        protected final a n(P0 p02) {
            C3862t.g(p02, "<this>");
            return p02.P0() ? f6971C : ((p02 instanceof C1113z) && (((C1113z) p02).a1() instanceof C1100o0)) ? f6973E : p02 instanceof C1100o0 ? f6972D : s.f7006a.a(p02) ? f6973E : f6972D;
        }

        private a(String str, int i10) {
        }
    }

    /* compiled from: IntersectionType.kt */
    /* synthetic */ class b extends C3859p implements Ba.p<U, U, Boolean> {
        b(Object obj) {
            super(2, obj);
        }

        @Override // Ba.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(U p02, U p12) {
            C3862t.g(p02, "p0");
            C3862t.g(p12, "p1");
            return Boolean.valueOf(((B) this.receiver).g(p02, p12));
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(B.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* compiled from: IntersectionType.kt */
    /* synthetic */ class c extends C3859p implements Ba.p<U, U, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // Ba.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(U p02, U p12) {
            C3862t.g(p02, "p0");
            C3862t.g(p12, "p1");
            return Boolean.valueOf(((q) this.receiver).c(p02, p12));
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(q.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private B() {
    }

    private final Collection<AbstractC1082f0> c(Collection<? extends AbstractC1082f0> collection, Ba.p<? super AbstractC1082f0, ? super AbstractC1082f0, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC1082f0 abstractC1082f02 = (AbstractC1082f0) it2.next();
                    if (abstractC1082f02 != abstractC1082f0) {
                        C3862t.d(abstractC1082f02);
                        C3862t.d(abstractC1082f0);
                        if (pVar.invoke(abstractC1082f02, abstractC1082f0).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final AbstractC1082f0 e(Set<? extends AbstractC1082f0> set) {
        if (set.size() == 1) {
            return (AbstractC1082f0) kotlin.collections.r.I0(set);
        }
        new A(set);
        Set<? extends AbstractC1082f0> set2 = set;
        Collection<AbstractC1082f0> collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        AbstractC1082f0 abstractC1082f0B = vb.q.f51608f.b(collectionC);
        if (abstractC1082f0B != null) {
            return abstractC1082f0B;
        }
        Collection<AbstractC1082f0> collectionC2 = c(collectionC, new c(p.f7000b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (AbstractC1082f0) kotlin.collections.r.I0(collectionC2) : new T(set2).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + kotlin.collections.r.s0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(U u10, U u11) {
        q qVarA = p.f7000b.a();
        return qVarA.b(u10, u11) && !qVarA.b(u11, u10);
    }

    public final AbstractC1082f0 d(List<? extends AbstractC1082f0> types) {
        C3862t.g(types, "types");
        types.size();
        ArrayList<AbstractC1082f0> arrayList = new ArrayList();
        for (AbstractC1082f0 abstractC1082f0 : types) {
            if (abstractC1082f0.O0() instanceof T) {
                Collection<U> collectionS = abstractC1082f0.O0().s();
                C3862t.f(collectionS, "getSupertypes(...)");
                Collection<U> collection = collectionS;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(collection, 10));
                for (U u10 : collection) {
                    C3862t.d(u10);
                    AbstractC1082f0 abstractC1082f0D = N.d(u10);
                    if (abstractC1082f0.P0()) {
                        abstractC1082f0D = abstractC1082f0D.S0(true);
                    }
                    arrayList2.add(abstractC1082f0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC1082f0);
            }
        }
        a aVarJ = a.f6970B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarJ = aVarJ.j((P0) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC1082f0 abstractC1082f0I : arrayList) {
            if (aVarJ == a.f6973E) {
                if (abstractC1082f0I instanceof i) {
                    abstractC1082f0I = C1090j0.k((i) abstractC1082f0I);
                }
                abstractC1082f0I = C1090j0.i(abstractC1082f0I, false, 1, null);
            }
            linkedHashSet.add(abstractC1082f0I);
        }
        List<? extends AbstractC1082f0> list = types;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AbstractC1082f0) it2.next()).N0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((u0) next).z((u0) it3.next());
        }
        return e(linkedHashSet).U0((u0) next);
    }
}
