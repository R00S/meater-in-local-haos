package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10364l;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n */
/* loaded from: classes2.dex */
public class C10663n extends AbstractC10649g {

    /* renamed from: n */
    private final InterfaceC10345e1 f41011n;

    /* renamed from: o */
    private final InterfaceC10251h f41012o;

    /* renamed from: p */
    private final InterfaceC10325i<Set<C10163f>> f41013p;

    /* renamed from: q */
    private final InterfaceC10620g f41014q;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a */
    private class a extends AbstractC10252i {

        /* renamed from: b */
        private final InterfaceC10323g<C10163f, Collection<? extends InterfaceC10739y0>> f41015b;

        /* renamed from: c */
        private final InterfaceC10323g<C10163f, Collection<? extends InterfaceC10729t0>> f41016c;

        /* renamed from: d */
        private final InterfaceC10325i<Collection<InterfaceC10609m>> f41017d;

        /* renamed from: e */
        final /* synthetic */ C10663n f41018e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$a, reason: collision with other inner class name */
        class C11580a implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {

            /* renamed from: f */
            final /* synthetic */ C10663n f41019f;

            C11580a(C10663n c10663n) {
                this.f41019f = c10663n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<? extends InterfaceC10739y0> invoke(C10163f c10163f) {
                return a.this.m37900m(c10163f);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$b */
        class b implements Function1<C10163f, Collection<? extends InterfaceC10729t0>> {

            /* renamed from: f */
            final /* synthetic */ C10663n f41021f;

            b(C10663n c10663n) {
                this.f41021f = c10663n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<? extends InterfaceC10729t0> invoke(C10163f c10163f) {
                return a.this.m37901n(c10163f);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$c */
        class c implements Function0<Collection<InterfaceC10609m>> {

            /* renamed from: f */
            final /* synthetic */ C10663n f41023f;

            c(C10663n c10663n) {
                this.f41023f = c10663n;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<InterfaceC10609m> invoke() {
                return a.this.m37899l();
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$d */
        class d extends AbstractC10191h {

            /* renamed from: a */
            final /* synthetic */ Set f41025a;

            d(Set set) {
                this.f41025a = set;
            }

            /* renamed from: f */
            private static /* synthetic */ void m37907f(int i2) {
                Object[] objArr = new Object[3];
                if (i2 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i2 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i2 == 1 || i2 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10192i
            /* renamed from: a */
            public void mo33154a(InterfaceC10576b interfaceC10576b) {
                if (interfaceC10576b == null) {
                    m37907f(0);
                }
                C10193j.m35856K(interfaceC10576b, null);
                this.f41025a.add(interfaceC10576b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h
            /* renamed from: e */
            protected void mo33156e(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2) {
                if (interfaceC10576b == null) {
                    m37907f(1);
                }
                if (interfaceC10576b2 == null) {
                    m37907f(2);
                }
            }
        }

        public a(C10663n c10663n, InterfaceC10330n interfaceC10330n) {
            if (interfaceC10330n == null) {
                m37895h(0);
            }
            this.f41018e = c10663n;
            this.f41015b = interfaceC10330n.mo36520h(new C11580a(c10663n));
            this.f41016c = interfaceC10330n.mo36520h(new b(c10663n));
            this.f41017d = interfaceC10330n.mo36516d(new c(c10663n));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m37895h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10663n.a.m37895h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public Collection<InterfaceC10609m> m37899l() {
            HashSet hashSet = new HashSet();
            for (C10163f c10163f : (Set) this.f41018e.f41013p.invoke()) {
                EnumC9941d enumC9941d = EnumC9941d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo33311a(c10163f, enumC9941d));
                hashSet.addAll(mo33313c(c10163f, enumC9941d));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public Collection<? extends InterfaceC10739y0> m37900m(C10163f c10163f) {
            if (c10163f == null) {
                m37895h(8);
            }
            return m37903p(c10163f, m37902o().mo33311a(c10163f, EnumC9941d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public Collection<? extends InterfaceC10729t0> m37901n(C10163f c10163f) {
            if (c10163f == null) {
                m37895h(4);
            }
            return m37903p(c10163f, m37902o().mo33313c(c10163f, EnumC9941d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        private InterfaceC10251h m37902o() {
            InterfaceC10251h interfaceC10251hMo33553q = this.f41018e.mo32877h().mo35998a().iterator().next().mo33553q();
            if (interfaceC10251hMo33553q == null) {
                m37895h(9);
            }
            return interfaceC10251hMo33553q;
        }

        /* renamed from: p */
        private <D extends InterfaceC10576b> Collection<? extends D> m37903p(C10163f c10163f, Collection<? extends D> collection) {
            if (c10163f == null) {
                m37895h(10);
            }
            if (collection == null) {
                m37895h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C10193j.f39520b.m35886v(c10163f, collection, Collections.emptySet(), this.f41018e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: a */
        public Collection<? extends InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            if (c10163f == null) {
                m37895h(5);
            }
            if (interfaceC9939b == null) {
                m37895h(6);
            }
            Collection<? extends InterfaceC10739y0> collectionInvoke = this.f41015b.invoke(c10163f);
            if (collectionInvoke == null) {
                m37895h(7);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: b */
        public Set<C10163f> mo33312b() {
            Set<C10163f> set = (Set) this.f41018e.f41013p.invoke();
            if (set == null) {
                m37895h(17);
            }
            return set;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: c */
        public Collection<? extends InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            if (c10163f == null) {
                m37895h(1);
            }
            if (interfaceC9939b == null) {
                m37895h(2);
            }
            Collection<? extends InterfaceC10729t0> collectionInvoke = this.f41016c.invoke(c10163f);
            if (collectionInvoke == null) {
                m37895h(3);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: d */
        public Set<C10163f> mo33314d() {
            Set<C10163f> set = (Set) this.f41018e.f41013p.invoke();
            if (set == null) {
                m37895h(19);
            }
            return set;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: e */
        public Set<C10163f> mo33315e() {
            Set<C10163f> setEmptySet = Collections.emptySet();
            if (setEmptySet == null) {
                m37895h(18);
            }
            return setEmptySet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
        /* renamed from: g */
        public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
            if (c10247d == null) {
                m37895h(13);
            }
            if (function1 == null) {
                m37895h(14);
            }
            Collection<InterfaceC10609m> collectionInvoke = this.f41017d.invoke();
            if (collectionInvoke == null) {
                m37895h(15);
            }
            return collectionInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10663n(InterfaceC10330n interfaceC10330n, InterfaceC10585e interfaceC10585e, AbstractC10344e0 abstractC10344e0, C10163f c10163f, InterfaceC10325i<Set<C10163f>> interfaceC10325i, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10330n, interfaceC10585e, c10163f, interfaceC10741z0, false);
        if (interfaceC10330n == null) {
            m37892K(6);
        }
        if (interfaceC10585e == null) {
            m37892K(7);
        }
        if (abstractC10344e0 == null) {
            m37892K(8);
        }
        if (c10163f == null) {
            m37892K(9);
        }
        if (interfaceC10325i == null) {
            m37892K(10);
        }
        if (interfaceC10620g == null) {
            m37892K(11);
        }
        if (interfaceC10741z0 == null) {
            m37892K(12);
        }
        this.f41014q = interfaceC10620g;
        this.f41011n = new C10364l(this, Collections.emptyList(), Collections.singleton(abstractC10344e0), interfaceC10330n);
        this.f41012o = new a(this, interfaceC10330n);
        this.f41013p = interfaceC10325i;
    }

    /* renamed from: K */
    private static /* synthetic */ void m37892K(int i2) {
        String str;
        int i3;
        switch (i2) {
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
        switch (i2) {
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
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
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
            case 13:
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
        switch (i2) {
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
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
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
        switch (i2) {
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

    /* renamed from: M0 */
    public static C10663n m37894M0(InterfaceC10330n interfaceC10330n, InterfaceC10585e interfaceC10585e, C10163f c10163f, InterfaceC10325i<Set<C10163f>> interfaceC10325i, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10330n == null) {
            m37892K(0);
        }
        if (interfaceC10585e == null) {
            m37892K(1);
        }
        if (c10163f == null) {
            m37892K(2);
        }
        if (interfaceC10325i == null) {
            m37892K(3);
        }
        if (interfaceC10620g == null) {
            m37892K(4);
        }
        if (interfaceC10741z0 == null) {
            m37892K(5);
        }
        return new C10663n(interfaceC10330n, interfaceC10585e, interfaceC10585e.mo36400s(), c10163f, interfaceC10325i, interfaceC10620g, interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: A */
    public boolean mo32857A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D */
    public boolean mo32858D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: H */
    public InterfaceC10251h mo32860H(AbstractC10396g abstractC10396g) {
        if (abstractC10396g == null) {
            m37892K(13);
        }
        InterfaceC10251h interfaceC10251h = this.f41012o;
        if (interfaceC10251h == null) {
            m37892K(14);
        }
        return interfaceC10251h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J */
    public Collection<InterfaceC10585e> mo32861J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37892K(23);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public InterfaceC10582d mo32864R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: S */
    public InterfaceC10251h mo32866S() {
        InterfaceC10251h.b bVar = InterfaceC10251h.b.f39671b;
        if (bVar == null) {
            m37892K(15);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public InterfaceC10585e mo32869U() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        InterfaceC10620g interfaceC10620g = this.f41014q;
        if (interfaceC10620g == null) {
            m37892K(21);
        }
        return interfaceC10620g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = C10728t.f41220e;
        if (abstractC10730u == null) {
            m37892K(20);
        }
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        InterfaceC10345e1 interfaceC10345e1 = this.f41011n;
        if (interfaceC10345e1 == null) {
            m37892K(17);
        }
        return interfaceC10345e1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        EnumC10588f enumC10588f = EnumC10588f.ENUM_ENTRY;
        if (enumC10588f == null) {
            m37892K(18);
        }
        return enumC10588f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        EnumC10583d0 enumC10583d0 = EnumC10583d0.FINAL;
        if (enumC10583d0 == null) {
            m37892K(19);
        }
        return enumC10583d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: k */
    public Collection<InterfaceC10582d> mo32880k() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37892K(16);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        List<InterfaceC10587e1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37892K(22);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        return null;
    }
}
