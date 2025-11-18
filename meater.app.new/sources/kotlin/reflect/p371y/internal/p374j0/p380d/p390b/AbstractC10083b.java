package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import kotlin.reflect.p371y.internal.p374j0.C9906a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b.a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10104t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10128g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10114b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10154f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.EnumC10270b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f;
import kotlin.text.C10546u;
import kotlin.text.C10547v;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10083b<A, S extends a<? extends A>> implements InterfaceC10278f<A> {

    /* renamed from: a */
    private final InterfaceC10099o f38371a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$a */
    public static abstract class a<A> {
        /* renamed from: a */
        public abstract Map<C10104t, List<A>> mo33845a();
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$b */
    private enum b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38376a;

        static {
            int[] iArr = new int[EnumC10270b.values().length];
            iArr[EnumC10270b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[EnumC10270b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[EnumC10270b.PROPERTY.ordinal()] = 3;
            f38376a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$d */
    public static final class d implements InterfaceC10101q.c {

        /* renamed from: a */
        final /* synthetic */ AbstractC10083b<A, S> f38377a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f38378b;

        d(AbstractC10083b<A, S> abstractC10083b, ArrayList<A> arrayList) {
            this.f38377a = abstractC10083b;
            this.f38378b = arrayList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
        /* renamed from: a */
        public void mo32695a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
        /* renamed from: b */
        public InterfaceC10101q.a mo32696b(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0) {
            C9801m.m32346f(c10159b, "classId");
            C9801m.m32346f(interfaceC10741z0, "source");
            return this.f38377a.m33886y(c10159b, interfaceC10741z0, this.f38378b);
        }
    }

    public AbstractC10083b(InterfaceC10099o interfaceC10099o) {
        C9801m.m32346f(interfaceC10099o, "kotlinClassFinder");
        this.f38371a = interfaceC10099o;
    }

    /* renamed from: B */
    private final InterfaceC10101q m33862B(AbstractC10316z.a aVar) {
        InterfaceC10741z0 interfaceC10741z0M36499c = aVar.m36499c();
        C10103s c10103s = interfaceC10741z0M36499c instanceof C10103s ? (C10103s) interfaceC10741z0M36499c : null;
        if (c10103s != null) {
            return c10103s.m34029d();
        }
        return null;
    }

    /* renamed from: l */
    private final int m33863l(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o) {
        if (interfaceC10756o instanceof C10130i) {
            if (C10154f.m35385d((C10130i) interfaceC10756o)) {
                return 1;
            }
        } else if (interfaceC10756o instanceof C10135n) {
            if (C10154f.m35386e((C10135n) interfaceC10756o)) {
                return 1;
            }
        } else {
            if (!(interfaceC10756o instanceof C10125d)) {
                throw new UnsupportedOperationException("Unsupported message: " + interfaceC10756o.getClass());
            }
            C9801m.m32344d(abstractC10316z, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC10316z.a aVar = (AbstractC10316z.a) abstractC10316z;
            if (aVar.m36503g() == C10124c.c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.m36505i()) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: m */
    private final List<A> m33864m(AbstractC10316z abstractC10316z, C10104t c10104t, boolean z, boolean z2, Boolean bool, boolean z3) {
        InterfaceC10101q interfaceC10101qM33879o = m33879o(abstractC10316z, m33883v(abstractC10316z, z, z2, bool, z3));
        if (interfaceC10101qM33879o == null) {
            return C10817u.m38888j();
        }
        List<A> list = mo33844p(interfaceC10101qM33879o).mo33845a().get(c10104t);
        return list == null ? C10817u.m38888j() : list;
    }

    /* renamed from: n */
    static /* synthetic */ List m33865n(AbstractC10083b abstractC10083b, AbstractC10316z abstractC10316z, C10104t c10104t, boolean z, boolean z2, Boolean bool, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return abstractC10083b.m33864m(abstractC10316z, c10104t, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ C10104t m33866s(AbstractC10083b abstractC10083b, InterfaceC10756o interfaceC10756o, InterfaceC10151c interfaceC10151c, C10155g c10155g, EnumC10270b enumC10270b, boolean z, int i2, Object obj) {
        if (obj == null) {
            return abstractC10083b.m33881r(interfaceC10756o, interfaceC10151c, c10155g, enumC10270b, (i2 & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: u */
    public static /* synthetic */ C10104t m33867u(AbstractC10083b abstractC10083b, C10135n c10135n, InterfaceC10151c interfaceC10151c, C10155g c10155g, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return abstractC10083b.m33882t(c10135n, interfaceC10151c, c10155g, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: z */
    private final List<A> m33868z(AbstractC10316z abstractC10316z, C10135n c10135n, b bVar) {
        Boolean boolMo35368d = C10150b.f39189A.mo35368d(c10135n.m34885b0());
        C9801m.m32345e(boolMo35368d, "IS_CONST.get(proto.flags)");
        boolean zBooleanValue = boolMo35368d.booleanValue();
        boolean zM34257f = C10121i.m34257f(c10135n);
        if (bVar == b.PROPERTY) {
            C10104t c10104tM33867u = m33867u(this, c10135n, abstractC10316z.m36498b(), abstractC10316z.m36500d(), false, true, false, 40, null);
            return c10104tM33867u == null ? C10817u.m38888j() : m33865n(this, abstractC10316z, c10104tM33867u, true, false, Boolean.valueOf(zBooleanValue), zM34257f, 8, null);
        }
        C10104t c10104tM33867u2 = m33867u(this, c10135n, abstractC10316z.m36498b(), abstractC10316z.m36500d(), true, false, false, 48, null);
        if (c10104tM33867u2 == null) {
            return C10817u.m38888j();
        }
        return C10547v.m37538J(c10104tM33867u2.m34030a(), "$delegate", false, 2, null) != (bVar == b.DELEGATE_FIELD) ? C10817u.m38888j() : m33864m(abstractC10316z, c10104tM33867u2, true, true, Boolean.valueOf(zBooleanValue), zM34257f);
    }

    /* renamed from: A */
    protected abstract A mo33869A(C10123b c10123b, InterfaceC10151c interfaceC10151c);

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: a */
    public List<A> mo33870a(C10140s c10140s, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10140s, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        Object objM38401u = c10140s.m38401u(C10112a.f38498h);
        C9801m.m32345e(objM38401u, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C10123b> iterable = (Iterable) objM38401u;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterable, 10));
        for (C10123b c10123b : iterable) {
            C9801m.m32345e(c10123b, "it");
            arrayList.add(mo33869A(c10123b, interfaceC10151c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: b */
    public List<A> mo33871b(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b, int i2, C10142u c10142u) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "callableProto");
        C9801m.m32346f(enumC10270b, "kind");
        C9801m.m32346f(c10142u, "proto");
        C10104t c10104tM33866s = m33866s(this, interfaceC10756o, abstractC10316z.m36498b(), abstractC10316z.m36500d(), enumC10270b, false, 16, null);
        if (c10104tM33866s == null) {
            return C10817u.m38888j();
        }
        return m33865n(this, abstractC10316z, C10104t.f38485a.m34035e(c10104tM33866s, i2 + m33863l(abstractC10316z, interfaceC10756o)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: c */
    public List<A> mo33872c(AbstractC10316z.a aVar) {
        C9801m.m32346f(aVar, "container");
        InterfaceC10101q interfaceC10101qM33862B = m33862B(aVar);
        if (interfaceC10101qM33862B != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC10101qM33862B.mo34026b(new d(this, arrayList), m33880q(interfaceC10101qM33862B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo36497a()).toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: d */
    public List<A> mo33873d(C10138q c10138q, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10138q, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        Object objM38401u = c10138q.m38401u(C10112a.f38496f);
        C9801m.m32345e(objM38401u, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C10123b> iterable = (Iterable) objM38401u;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterable, 10));
        for (C10123b c10123b : iterable) {
            C9801m.m32345e(c10123b, "it");
            arrayList.add(mo33869A(c10123b, interfaceC10151c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: f */
    public List<A> mo33874f(AbstractC10316z abstractC10316z, C10128g c10128g) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10128g, "proto");
        C10104t.a aVar = C10104t.f38485a;
        String string = abstractC10316z.m36498b().getString(c10128g.m34624F());
        String strM35410c = ((AbstractC10316z.a) abstractC10316z).m36501e().m35410c();
        C9801m.m32345e(strM35410c, "container as ProtoContai…Class).classId.asString()");
        return m33865n(this, abstractC10316z, aVar.m34031a(string, C10114b.m34245b(strM35410c)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: g */
    public List<A> mo33875g(AbstractC10316z abstractC10316z, C10135n c10135n) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        return m33868z(abstractC10316z, c10135n, b.BACKING_FIELD);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: h */
    public List<A> mo33876h(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "proto");
        C9801m.m32346f(enumC10270b, "kind");
        C10104t c10104tM33866s = m33866s(this, interfaceC10756o, abstractC10316z.m36498b(), abstractC10316z.m36500d(), enumC10270b, false, 16, null);
        return c10104tM33866s != null ? m33865n(this, abstractC10316z, C10104t.f38485a.m34035e(c10104tM33866s, 0), false, false, null, false, 60, null) : C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: i */
    public List<A> mo33877i(AbstractC10316z abstractC10316z, C10135n c10135n) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        return m33868z(abstractC10316z, c10135n, b.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: j */
    public List<A> mo33878j(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "proto");
        C9801m.m32346f(enumC10270b, "kind");
        if (enumC10270b == EnumC10270b.PROPERTY) {
            return m33868z(abstractC10316z, (C10135n) interfaceC10756o, b.PROPERTY);
        }
        C10104t c10104tM33866s = m33866s(this, interfaceC10756o, abstractC10316z.m36498b(), abstractC10316z.m36500d(), enumC10270b, false, 16, null);
        return c10104tM33866s == null ? C10817u.m38888j() : m33865n(this, abstractC10316z, c10104tM33866s, false, false, null, false, 60, null);
    }

    /* renamed from: o */
    protected final InterfaceC10101q m33879o(AbstractC10316z abstractC10316z, InterfaceC10101q interfaceC10101q) {
        C9801m.m32346f(abstractC10316z, "container");
        if (interfaceC10101q != null) {
            return interfaceC10101q;
        }
        if (abstractC10316z instanceof AbstractC10316z.a) {
            return m33862B((AbstractC10316z.a) abstractC10316z);
        }
        return null;
    }

    /* renamed from: p */
    protected abstract S mo33844p(InterfaceC10101q interfaceC10101q);

    /* renamed from: q */
    protected byte[] m33880q(InterfaceC10101q interfaceC10101q) {
        C9801m.m32346f(interfaceC10101q, "kotlinClass");
        return null;
    }

    /* renamed from: r */
    protected final C10104t m33881r(InterfaceC10756o interfaceC10756o, InterfaceC10151c interfaceC10151c, C10155g c10155g, EnumC10270b enumC10270b, boolean z) {
        C9801m.m32346f(interfaceC10756o, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(enumC10270b, "kind");
        if (interfaceC10756o instanceof C10125d) {
            C10104t.a aVar = C10104t.f38485a;
            AbstractC10116d.b bVarM34266b = C10121i.f38607a.m34266b((C10125d) interfaceC10756o, interfaceC10151c, c10155g);
            if (bVarM34266b == null) {
                return null;
            }
            return aVar.m34032b(bVarM34266b);
        }
        if (interfaceC10756o instanceof C10130i) {
            C10104t.a aVar2 = C10104t.f38485a;
            AbstractC10116d.b bVarM34268e = C10121i.f38607a.m34268e((C10130i) interfaceC10756o, interfaceC10151c, c10155g);
            if (bVarM34268e == null) {
                return null;
            }
            return aVar2.m34032b(bVarM34268e);
        }
        if (!(interfaceC10756o instanceof C10135n)) {
            return null;
        }
        AbstractC10749h.f<C10135n, C10112a.d> fVar = C10112a.f38494d;
        C9801m.m32345e(fVar, "propertySignature");
        C10112a.d dVar = (C10112a.d) C10153e.m35380a((AbstractC10749h.d) interfaceC10756o, fVar);
        if (dVar == null) {
            return null;
        }
        int i2 = c.f38376a[enumC10270b.ordinal()];
        if (i2 == 1) {
            if (!dVar.m34145G()) {
                return null;
            }
            C10104t.a aVar3 = C10104t.f38485a;
            C10112a.c cVarM34140B = dVar.m34140B();
            C9801m.m32345e(cVarM34140B, "signature.getter");
            return aVar3.m34033c(interfaceC10151c, cVarM34140B);
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return m33882t((C10135n) interfaceC10756o, interfaceC10151c, c10155g, true, true, z);
        }
        if (!dVar.m34146H()) {
            return null;
        }
        C10104t.a aVar4 = C10104t.f38485a;
        C10112a.c cVarM34141C = dVar.m34141C();
        C9801m.m32345e(cVarM34141C, "signature.setter");
        return aVar4.m34033c(interfaceC10151c, cVarM34141C);
    }

    /* renamed from: t */
    protected final C10104t m33882t(C10135n c10135n, InterfaceC10151c interfaceC10151c, C10155g c10155g, boolean z, boolean z2, boolean z3) {
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        AbstractC10749h.f<C10135n, C10112a.d> fVar = C10112a.f38494d;
        C9801m.m32345e(fVar, "propertySignature");
        C10112a.d dVar = (C10112a.d) C10153e.m35380a(c10135n, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            AbstractC10116d.a aVarM34267c = C10121i.f38607a.m34267c(c10135n, interfaceC10151c, c10155g, z3);
            if (aVarM34267c == null) {
                return null;
            }
            return C10104t.f38485a.m34032b(aVarM34267c);
        }
        if (!z2 || !dVar.m34147I()) {
            return null;
        }
        C10104t.a aVar = C10104t.f38485a;
        C10112a.c cVarM34142D = dVar.m34142D();
        C9801m.m32345e(cVarM34142D, "signature.syntheticMethod");
        return aVar.m34033c(interfaceC10151c, cVarM34142D);
    }

    /* renamed from: v */
    protected final InterfaceC10101q m33883v(AbstractC10316z abstractC10316z, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC10316z.a aVarM36504h;
        C9801m.m32346f(abstractC10316z, "container");
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC10316z + ')').toString());
            }
            if (abstractC10316z instanceof AbstractC10316z.a) {
                AbstractC10316z.a aVar = (AbstractC10316z.a) abstractC10316z;
                if (aVar.m36503g() == C10124c.c.INTERFACE) {
                    InterfaceC10099o interfaceC10099o = this.f38371a;
                    C10159b c10159bM35411d = aVar.m36501e().m35411d(C10163f.m35454x("DefaultImpls"));
                    C9801m.m32345e(c10159bM35411d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return C10100p.m34024b(interfaceC10099o, c10159bM35411d);
                }
            }
            if (bool.booleanValue() && (abstractC10316z instanceof AbstractC10316z.b)) {
                InterfaceC10741z0 interfaceC10741z0M36499c = abstractC10316z.m36499c();
                C10095k c10095k = interfaceC10741z0M36499c instanceof C10095k ? (C10095k) interfaceC10741z0M36499c : null;
                C10239d c10239dM33984f = c10095k != null ? c10095k.m33984f() : null;
                if (c10239dM33984f != null) {
                    InterfaceC10099o interfaceC10099o2 = this.f38371a;
                    String strM36111f = c10239dM33984f.m36111f();
                    C9801m.m32345e(strM36111f, "facadeClassName.internalName");
                    C10159b c10159bM35408m = C10159b.m35408m(new C10160c(C10546u.m37524z(strM36111f, '/', '.', false, 4, null)));
                    C9801m.m32345e(c10159bM35408m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                    return C10100p.m34024b(interfaceC10099o2, c10159bM35408m);
                }
            }
        }
        if (z2 && (abstractC10316z instanceof AbstractC10316z.a)) {
            AbstractC10316z.a aVar2 = (AbstractC10316z.a) abstractC10316z;
            if (aVar2.m36503g() == C10124c.c.COMPANION_OBJECT && (aVarM36504h = aVar2.m36504h()) != null && (aVarM36504h.m36503g() == C10124c.c.CLASS || aVarM36504h.m36503g() == C10124c.c.ENUM_CLASS || (z3 && (aVarM36504h.m36503g() == C10124c.c.INTERFACE || aVarM36504h.m36503g() == C10124c.c.ANNOTATION_CLASS)))) {
                return m33862B(aVarM36504h);
            }
        }
        if (!(abstractC10316z instanceof AbstractC10316z.b) || !(abstractC10316z.m36499c() instanceof C10095k)) {
            return null;
        }
        InterfaceC10741z0 interfaceC10741z0M36499c2 = abstractC10316z.m36499c();
        C9801m.m32344d(interfaceC10741z0M36499c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C10095k c10095k2 = (C10095k) interfaceC10741z0M36499c2;
        InterfaceC10101q interfaceC10101qM33985g = c10095k2.m33985g();
        return interfaceC10101qM33985g == null ? C10100p.m34024b(this.f38371a, c10095k2.m33982d()) : interfaceC10101qM33985g;
    }

    /* renamed from: w */
    protected final boolean m33884w(C10159b c10159b) {
        InterfaceC10101q interfaceC10101qM34024b;
        C9801m.m32346f(c10159b, "classId");
        return c10159b.m35412g() != null && C9801m.m32341a(c10159b.m35415j().m35455k(), "Container") && (interfaceC10101qM34024b = C10100p.m34024b(this.f38371a, c10159b)) != null && C9906a.f37442a.m32694c(interfaceC10101qM34024b);
    }

    /* renamed from: x */
    protected abstract InterfaceC10101q.a mo33885x(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0, List<A> list);

    /* renamed from: y */
    protected final InterfaceC10101q.a m33886y(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0, List<A> list) {
        C9801m.m32346f(c10159b, "annotationClassId");
        C9801m.m32346f(interfaceC10741z0, "source");
        C9801m.m32346f(list, "result");
        if (C9906a.f37442a.m32693b().contains(c10159b)) {
            return null;
        }
        return mo33885x(c10159b, interfaceC10741z0, list);
    }
}
