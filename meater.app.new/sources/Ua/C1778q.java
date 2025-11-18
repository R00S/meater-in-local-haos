package Ua;

import Ab.k;
import Hb.AbstractC1082f0;
import Hb.C1109v;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.EnumC1693f;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import Ra.h0;
import Ra.m0;
import Ra.r0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tb.AbstractC4601m;
import tb.C4603o;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* renamed from: Ua.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1778q extends AbstractC1771j {

    /* renamed from: J, reason: collision with root package name */
    private final y0 f17837J;

    /* renamed from: K, reason: collision with root package name */
    private final Ab.k f17838K;

    /* renamed from: L, reason: collision with root package name */
    private final Gb.i<Set<qb.f>> f17839L;

    /* renamed from: M, reason: collision with root package name */
    private final Sa.h f17840M;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    /* renamed from: Ua.q$a */
    private class a extends Ab.l {

        /* renamed from: b, reason: collision with root package name */
        private final Gb.g<qb.f, Collection<? extends g0>> f17841b;

        /* renamed from: c, reason: collision with root package name */
        private final Gb.g<qb.f, Collection<? extends Z>> f17842c;

        /* renamed from: d, reason: collision with root package name */
        private final Gb.i<Collection<InterfaceC1700m>> f17843d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1778q f17844e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: Ua.q$a$a, reason: collision with other inner class name */
        class C0263a implements Ba.l<qb.f, Collection<? extends g0>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1778q f17845B;

            C0263a(C1778q c1778q) {
                this.f17845B = c1778q;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends g0> invoke(qb.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: Ua.q$a$b */
        class b implements Ba.l<qb.f, Collection<? extends Z>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1778q f17847B;

            b(C1778q c1778q) {
                this.f17847B = c1778q;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends Z> invoke(qb.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: Ua.q$a$c */
        class c implements Ba.a<Collection<InterfaceC1700m>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1778q f17849B;

            c(C1778q c1778q) {
                this.f17849B = c1778q;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<InterfaceC1700m> invoke() {
                return a.this.l();
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: Ua.q$a$d */
        class d extends AbstractC4601m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f17851a;

            d(Set set) {
                this.f17851a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // tb.AbstractC4602n
            public void a(InterfaceC1689b interfaceC1689b) {
                if (interfaceC1689b == null) {
                    f(0);
                }
                C4603o.K(interfaceC1689b, null);
                this.f17851a.add(interfaceC1689b);
            }

            @Override // tb.AbstractC4601m
            protected void e(InterfaceC1689b interfaceC1689b, InterfaceC1689b interfaceC1689b2) {
                if (interfaceC1689b == null) {
                    f(1);
                }
                if (interfaceC1689b2 == null) {
                    f(2);
                }
            }
        }

        public a(C1778q c1778q, Gb.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f17844e = c1778q;
            this.f17841b = nVar.h(new C0263a(c1778q));
            this.f17842c = nVar.h(new b(c1778q));
            this.f17843d = nVar.g(new c(c1778q));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ua.C1778q.a.h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<InterfaceC1700m> l() {
            HashSet hashSet = new HashSet();
            for (qb.f fVar : (Set) this.f17844e.f17839L.invoke()) {
                Za.d dVar = Za.d.f19640Q;
                hashSet.addAll(b(fVar, dVar));
                hashSet.addAll(d(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends g0> m(qb.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().b(fVar, Za.d.f19640Q));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends Z> n(qb.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().d(fVar, Za.d.f19640Q));
        }

        private Ab.k o() {
            Ab.k kVarS = this.f17844e.l().s().iterator().next().s();
            if (kVarS == null) {
                h(9);
            }
            return kVarS;
        }

        private <D extends InterfaceC1689b> Collection<? extends D> p(qb.f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C4603o.f50027f.v(fVar, collection, Collections.emptySet(), this.f17844e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> a() {
            Set<qb.f> set = (Set) this.f17844e.f17839L.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // Ab.l, Ab.k
        public Collection<? extends g0> b(qb.f fVar, Za.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection<? extends g0> collectionInvoke = this.f17841b.invoke(fVar);
            if (collectionInvoke == null) {
                h(7);
            }
            return collectionInvoke;
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> c() {
            Set<qb.f> set = (Set) this.f17844e.f17839L.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // Ab.l, Ab.k
        public Collection<? extends Z> d(qb.f fVar, Za.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection<? extends Z> collectionInvoke = this.f17842c.invoke(fVar);
            if (collectionInvoke == null) {
                h(3);
            }
            return collectionInvoke;
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> e() {
            Set<qb.f> setEmptySet = Collections.emptySet();
            if (setEmptySet == null) {
                h(18);
            }
            return setEmptySet;
        }

        @Override // Ab.l, Ab.n
        public Collection<InterfaceC1700m> f(Ab.d dVar, Ba.l<? super qb.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection<InterfaceC1700m> collectionInvoke = this.f17843d.invoke();
            if (collectionInvoke == null) {
                h(15);
            }
            return collectionInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1778q(Gb.n nVar, InterfaceC1692e interfaceC1692e, Hb.U u10, qb.f fVar, Gb.i<Set<qb.f>> iVar, Sa.h hVar, h0 h0Var) {
        super(nVar, interfaceC1692e, fVar, h0Var, false);
        if (nVar == null) {
            E0(6);
        }
        if (interfaceC1692e == null) {
            E0(7);
        }
        if (u10 == null) {
            E0(8);
        }
        if (fVar == null) {
            E0(9);
        }
        if (iVar == null) {
            E0(10);
        }
        if (hVar == null) {
            E0(11);
        }
        if (h0Var == null) {
            E0(12);
        }
        this.f17840M = hVar;
        this.f17837J = new C1109v(this, Collections.emptyList(), Collections.singleton(u10), nVar);
        this.f17838K = new a(this, nVar);
        this.f17839L = iVar;
    }

    private static /* synthetic */ void E0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "annotations";
                break;
            case 5:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "<init>";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C1778q M0(Gb.n nVar, InterfaceC1692e interfaceC1692e, qb.f fVar, Gb.i<Set<qb.f>> iVar, Sa.h hVar, h0 h0Var) {
        if (nVar == null) {
            E0(0);
        }
        if (interfaceC1692e == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (iVar == null) {
            E0(3);
        }
        if (hVar == null) {
            E0(4);
        }
        if (h0Var == null) {
            E0(5);
        }
        return new C1778q(nVar, interfaceC1692e, interfaceC1692e.u(), fVar, iVar, hVar, h0Var);
    }

    @Override // Ra.InterfaceC1692e
    public boolean C() {
        return false;
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1692e> J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(23);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean J0() {
        return false;
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1691d P() {
        return null;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k Q() {
        k.b bVar = k.b.f1150b;
        if (bVar == null) {
            E0(15);
        }
        return bVar;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1692e S() {
        return null;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        Sa.h hVar = this.f17840M;
        if (hVar == null) {
            E0(21);
        }
        return hVar;
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = C1706t.f15170e;
        if (abstractC1707u == null) {
            E0(20);
        }
        return abstractC1707u;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        EnumC1693f enumC1693f = EnumC1693f.f15146F;
        if (enumC1693f == null) {
            E0(18);
        }
        return enumC1693f;
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return false;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        y0 y0Var = this.f17837J;
        if (y0Var == null) {
            E0(17);
        }
        return y0Var;
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public Ra.E m() {
        Ra.E e10 = Ra.E.f15106C;
        if (e10 == null) {
            E0(19);
        }
        return e10;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1691d> n() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(16);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        List<m0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(22);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        return null;
    }

    @Override // Ua.z
    public Ab.k z0(Ib.g gVar) {
        if (gVar == null) {
            E0(13);
        }
        Ab.k kVar = this.f17838K;
        if (kVar == null) {
            E0(14);
        }
        return kVar;
    }
}
