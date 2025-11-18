package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10734w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.utils.C10772f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10260c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10261d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10388t;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: PropertyDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c0 */
/* loaded from: classes2.dex */
public class C10642c0 extends AbstractC10664n0 implements InterfaceC10729t0 {

    /* renamed from: A */
    private InterfaceC10735w0 f40914A;

    /* renamed from: B */
    private List<InterfaceC10587e1> f40915B;

    /* renamed from: C */
    private C10644d0 f40916C;

    /* renamed from: D */
    private InterfaceC10733v0 f40917D;

    /* renamed from: E */
    private boolean f40918E;

    /* renamed from: F */
    private InterfaceC10734w f40919F;

    /* renamed from: G */
    private InterfaceC10734w f40920G;

    /* renamed from: n */
    private final EnumC10583d0 f40921n;

    /* renamed from: o */
    private AbstractC10730u f40922o;

    /* renamed from: p */
    private Collection<? extends InterfaceC10729t0> f40923p;

    /* renamed from: q */
    private final InterfaceC10729t0 f40924q;

    /* renamed from: r */
    private final InterfaceC10576b.a f40925r;

    /* renamed from: s */
    private final boolean f40926s;

    /* renamed from: t */
    private final boolean f40927t;

    /* renamed from: u */
    private final boolean f40928u;

    /* renamed from: v */
    private final boolean f40929v;

    /* renamed from: w */
    private final boolean f40930w;

    /* renamed from: x */
    private final boolean f40931x;

    /* renamed from: y */
    private List<InterfaceC10735w0> f40932y;

    /* renamed from: z */
    private InterfaceC10735w0 f40933z;

    /* compiled from: PropertyDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c0$a */
    public class a {

        /* renamed from: a */
        private InterfaceC10609m f40934a;

        /* renamed from: b */
        private EnumC10583d0 f40935b;

        /* renamed from: c */
        private AbstractC10730u f40936c;

        /* renamed from: f */
        private InterfaceC10576b.a f40939f;

        /* renamed from: i */
        private InterfaceC10735w0 f40942i;

        /* renamed from: k */
        private C10163f f40944k;

        /* renamed from: l */
        private AbstractC10344e0 f40945l;

        /* renamed from: d */
        private InterfaceC10729t0 f40937d = null;

        /* renamed from: e */
        private boolean f40938e = false;

        /* renamed from: g */
        private AbstractC10360j1 f40940g = AbstractC10360j1.f40132b;

        /* renamed from: h */
        private boolean f40941h = true;

        /* renamed from: j */
        private List<InterfaceC10587e1> f40943j = null;

        public a() {
            this.f40934a = C10642c0.this.mo32876b();
            this.f40935b = C10642c0.this.mo32879j();
            this.f40936c = C10642c0.this.getVisibility();
            this.f40939f = C10642c0.this.mo37030i();
            this.f40942i = C10642c0.this.f40933z;
            this.f40944k = C10642c0.this.getName();
            this.f40945l = C10642c0.this.getType();
        }

        /* renamed from: a */
        private static /* synthetic */ void m37796a(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 5 && i2 != 7 && i2 != 9 && i2 != 11 && i2 != 19 && i2 != 13 && i2 != 14 && i2 != 16 && i2 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* renamed from: n */
        public InterfaceC10729t0 m37809n() {
            return C10642c0.this.m37787R0(this);
        }

        /* renamed from: o */
        InterfaceC10731u0 m37810o() {
            InterfaceC10729t0 interfaceC10729t0 = this.f40937d;
            if (interfaceC10729t0 == null) {
                return null;
            }
            return interfaceC10729t0.getGetter();
        }

        /* renamed from: p */
        InterfaceC10733v0 m37811p() {
            InterfaceC10729t0 interfaceC10729t0 = this.f40937d;
            if (interfaceC10729t0 == null) {
                return null;
            }
            return interfaceC10729t0.getSetter();
        }

        /* renamed from: q */
        public a m37812q(boolean z) {
            this.f40941h = z;
            return this;
        }

        /* renamed from: r */
        public a m37813r(InterfaceC10576b.a aVar) {
            if (aVar == null) {
                m37796a(10);
            }
            this.f40939f = aVar;
            return this;
        }

        /* renamed from: s */
        public a m37814s(EnumC10583d0 enumC10583d0) {
            if (enumC10583d0 == null) {
                m37796a(6);
            }
            this.f40935b = enumC10583d0;
            return this;
        }

        /* renamed from: t */
        public a m37815t(InterfaceC10576b interfaceC10576b) {
            this.f40937d = (InterfaceC10729t0) interfaceC10576b;
            return this;
        }

        /* renamed from: u */
        public a m37816u(InterfaceC10609m interfaceC10609m) {
            if (interfaceC10609m == null) {
                m37796a(0);
            }
            this.f40934a = interfaceC10609m;
            return this;
        }

        /* renamed from: v */
        public a m37817v(AbstractC10360j1 abstractC10360j1) {
            if (abstractC10360j1 == null) {
                m37796a(15);
            }
            this.f40940g = abstractC10360j1;
            return this;
        }

        /* renamed from: w */
        public a m37818w(AbstractC10730u abstractC10730u) {
            if (abstractC10730u == null) {
                m37796a(8);
            }
            this.f40936c = abstractC10730u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10642c0(InterfaceC10609m interfaceC10609m, InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, C10163f c10163f, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC10609m, interfaceC10620g, c10163f, null, z, interfaceC10741z0);
        if (interfaceC10609m == null) {
            m37785v(0);
        }
        if (interfaceC10620g == null) {
            m37785v(1);
        }
        if (enumC10583d0 == null) {
            m37785v(2);
        }
        if (abstractC10730u == null) {
            m37785v(3);
        }
        if (c10163f == null) {
            m37785v(4);
        }
        if (aVar == null) {
            m37785v(5);
        }
        if (interfaceC10741z0 == null) {
            m37785v(6);
        }
        this.f40923p = null;
        this.f40932y = Collections.emptyList();
        this.f40921n = enumC10583d0;
        this.f40922o = abstractC10730u;
        this.f40924q = interfaceC10729t0 == null ? this : interfaceC10729t0;
        this.f40925r = aVar;
        this.f40926s = z2;
        this.f40927t = z3;
        this.f40928u = z4;
        this.f40929v = z5;
        this.f40930w = z6;
        this.f40931x = z7;
    }

    /* renamed from: P0 */
    public static C10642c0 m37779P0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, C10163f c10163f, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (interfaceC10609m == null) {
            m37785v(7);
        }
        if (interfaceC10620g == null) {
            m37785v(8);
        }
        if (enumC10583d0 == null) {
            m37785v(9);
        }
        if (abstractC10730u == null) {
            m37785v(10);
        }
        if (c10163f == null) {
            m37785v(11);
        }
        if (aVar == null) {
            m37785v(12);
        }
        if (interfaceC10741z0 == null) {
            m37785v(13);
        }
        return new C10642c0(interfaceC10609m, null, interfaceC10620g, enumC10583d0, abstractC10730u, z, c10163f, aVar, interfaceC10741z0, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: T0 */
    private InterfaceC10741z0 m37780T0(boolean z, InterfaceC10729t0 interfaceC10729t0) {
        InterfaceC10741z0 interfaceC10741z0Mo32883t;
        if (z) {
            if (interfaceC10729t0 == null) {
                interfaceC10729t0 = mo37019a();
            }
            interfaceC10741z0Mo32883t = interfaceC10729t0.mo32883t();
        } else {
            interfaceC10741z0Mo32883t = InterfaceC10741z0.f41247a;
        }
        if (interfaceC10741z0Mo32883t == null) {
            m37785v(28);
        }
        return interfaceC10741z0Mo32883t;
    }

    /* renamed from: U0 */
    private static InterfaceC10738y m37781U0(C10366l1 c10366l1, InterfaceC10727s0 interfaceC10727s0) {
        if (c10366l1 == null) {
            m37785v(30);
        }
        if (interfaceC10727s0 == null) {
            m37785v(31);
        }
        if (interfaceC10727s0.mo37774d0() != null) {
            return interfaceC10727s0.mo37774d0().mo36396c(c10366l1);
        }
        return null;
    }

    /* renamed from: Z0 */
    private static AbstractC10730u m37782Z0(AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar) {
        return (aVar == InterfaceC10576b.a.FAKE_OVERRIDE && C10728t.m38132g(abstractC10730u.mo38009f())) ? C10728t.f41223h : abstractC10730u;
    }

    /* renamed from: e1 */
    private static InterfaceC10735w0 m37783e1(C10366l1 c10366l1, InterfaceC10729t0 interfaceC10729t0, InterfaceC10735w0 interfaceC10735w0) {
        AbstractC10344e0 abstractC10344e0M36759p = c10366l1.m36759p(interfaceC10735w0.getType(), EnumC10384r1.IN_VARIANCE);
        if (abstractC10344e0M36759p == null) {
            return null;
        }
        return new C10648f0(interfaceC10729t0, new C10260c(interfaceC10729t0, abstractC10344e0M36759p, interfaceC10735w0.getValue()), interfaceC10735w0.getAnnotations());
    }

    /* renamed from: f1 */
    private static InterfaceC10735w0 m37784f1(C10366l1 c10366l1, InterfaceC10729t0 interfaceC10729t0, InterfaceC10735w0 interfaceC10735w0) {
        AbstractC10344e0 abstractC10344e0M36759p = c10366l1.m36759p(interfaceC10735w0.getType(), EnumC10384r1.IN_VARIANCE);
        if (abstractC10344e0M36759p == null) {
            return null;
        }
        return new C10648f0(interfaceC10729t0, new C10261d(interfaceC10729t0, abstractC10344e0M36759p, interfaceC10735w0.getValue()), interfaceC10735w0.getAnnotations());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m37785v(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0.m37785v(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f40929v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo32473d(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f40928u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10605k1
    /* renamed from: O */
    public boolean mo37025O() {
        return this.f40931x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10729t0 mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        InterfaceC10729t0 interfaceC10729t0M37809n = m37792Y0().m37816u(interfaceC10609m).m37815t(null).m37814s(enumC10583d0).m37818w(abstractC10730u).m37813r(aVar).m37812q(z).m37809n();
        if (interfaceC10729t0M37809n == null) {
            m37785v(42);
        }
        return interfaceC10729t0M37809n;
    }

    /* renamed from: Q0 */
    protected C10642c0 mo33222Q0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10729t0 interfaceC10729t0, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m37785v(32);
        }
        if (enumC10583d0 == null) {
            m37785v(33);
        }
        if (abstractC10730u == null) {
            m37785v(34);
        }
        if (aVar == null) {
            m37785v(35);
        }
        if (c10163f == null) {
            m37785v(36);
        }
        if (interfaceC10741z0 == null) {
            m37785v(37);
        }
        return new C10642c0(interfaceC10609m, interfaceC10729t0, getAnnotations(), enumC10583d0, abstractC10730u, mo37031j0(), c10163f, aVar, interfaceC10741z0, mo37036s0(), isConst(), mo32863M(), mo32859E0(), mo32885z(), mo37025O());
    }

    /* renamed from: R0 */
    protected InterfaceC10729t0 m37787R0(a aVar) {
        InterfaceC10735w0 interfaceC10735w0;
        Function0<InterfaceC10326j<AbstractC10211g<?>>> function0;
        if (aVar == null) {
            m37785v(29);
        }
        C10642c0 c10642c0Mo33222Q0 = mo33222Q0(aVar.f40934a, aVar.f40935b, aVar.f40936c, aVar.f40937d, aVar.f40939f, aVar.f40944k, m37780T0(aVar.f40938e, aVar.f40937d));
        List<InterfaceC10587e1> typeParameters = aVar.f40943j == null ? getTypeParameters() : aVar.f40943j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C10366l1 c10366l1M36825b = C10388t.m36825b(typeParameters, aVar.f40940g, c10642c0Mo33222Q0, arrayList);
        AbstractC10344e0 abstractC10344e0 = aVar.f40945l;
        AbstractC10344e0 abstractC10344e0M36759p = c10366l1M36825b.m36759p(abstractC10344e0, EnumC10384r1.OUT_VARIANCE);
        if (abstractC10344e0M36759p == null) {
            return null;
        }
        AbstractC10344e0 abstractC10344e0M36759p2 = c10366l1M36825b.m36759p(abstractC10344e0, EnumC10384r1.IN_VARIANCE);
        if (abstractC10344e0M36759p2 != null) {
            c10642c0Mo33222Q0.mo33223a1(abstractC10344e0M36759p2);
        }
        InterfaceC10735w0 interfaceC10735w02 = aVar.f40942i;
        if (interfaceC10735w02 != null) {
            InterfaceC10735w0 interfaceC10735w0Mo36396c = interfaceC10735w02.mo36396c(c10366l1M36825b);
            if (interfaceC10735w0Mo36396c == null) {
                return null;
            }
            interfaceC10735w0 = interfaceC10735w0Mo36396c;
        } else {
            interfaceC10735w0 = null;
        }
        InterfaceC10735w0 interfaceC10735w03 = this.f40914A;
        InterfaceC10735w0 interfaceC10735w0M37784f1 = interfaceC10735w03 != null ? m37784f1(c10366l1M36825b, c10642c0Mo33222Q0, interfaceC10735w03) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC10735w0> it = this.f40932y.iterator();
        while (it.hasNext()) {
            InterfaceC10735w0 interfaceC10735w0M37783e1 = m37783e1(c10366l1M36825b, c10642c0Mo33222Q0, it.next());
            if (interfaceC10735w0M37783e1 != null) {
                arrayList2.add(interfaceC10735w0M37783e1);
            }
        }
        c10642c0Mo33222Q0.m37794c1(abstractC10344e0M36759p, arrayList, interfaceC10735w0, interfaceC10735w0M37784f1, arrayList2);
        C10644d0 c10644d0 = this.f40916C == null ? null : new C10644d0(c10642c0Mo33222Q0, this.f40916C.getAnnotations(), aVar.f40935b, m37782Z0(this.f40916C.getVisibility(), aVar.f40939f), this.f40916C.mo37773V(), this.f40916C.mo32885z(), this.f40916C.isInline(), aVar.f40939f, aVar.m37810o(), InterfaceC10741z0.f41247a);
        if (c10644d0 != null) {
            AbstractC10344e0 returnType = this.f40916C.getReturnType();
            c10644d0.m37770O0(m37781U0(c10366l1M36825b, this.f40916C));
            c10644d0.m37828R0(returnType != null ? c10366l1M36825b.m36759p(returnType, EnumC10384r1.OUT_VARIANCE) : null);
        }
        C10646e0 c10646e0 = this.f40917D == null ? null : new C10646e0(c10642c0Mo33222Q0, this.f40917D.getAnnotations(), aVar.f40935b, m37782Z0(this.f40917D.getVisibility(), aVar.f40939f), this.f40917D.mo37773V(), this.f40917D.mo32885z(), this.f40917D.isInline(), aVar.f40939f, aVar.m37811p(), InterfaceC10741z0.f41247a);
        if (c10646e0 != null) {
            List<InterfaceC10599i1> listM37914Q0 = AbstractC10666p.m37914Q0(c10646e0, this.f40917D.mo37028f(), c10366l1M36825b, false, false, null);
            if (listM37914Q0 == null) {
                c10642c0Mo33222Q0.m37793b1(true);
                listM37914Q0 = Collections.singletonList(C10646e0.m37834Q0(c10646e0, C10235a.m36072f(aVar.f40934a).m32773H(), this.f40917D.mo37028f().get(0).getAnnotations()));
            }
            if (listM37914Q0.size() != 1) {
                throw new IllegalStateException();
            }
            c10646e0.m37770O0(m37781U0(c10366l1M36825b, this.f40917D));
            c10646e0.m37837S0(listM37914Q0.get(0));
        }
        InterfaceC10734w interfaceC10734w = this.f40919F;
        C10665o c10665o = interfaceC10734w == null ? null : new C10665o(interfaceC10734w.getAnnotations(), c10642c0Mo33222Q0);
        InterfaceC10734w interfaceC10734w2 = this.f40920G;
        c10642c0Mo33222Q0.m37790W0(c10644d0, c10646e0, c10665o, interfaceC10734w2 != null ? new C10665o(interfaceC10734w2.getAnnotations(), c10642c0Mo33222Q0) : null);
        if (aVar.f40941h) {
            C10772f c10772fM38540c = C10772f.m38540c();
            Iterator<? extends InterfaceC10729t0> it2 = mo37027e().iterator();
            while (it2.hasNext()) {
                c10772fM38540c.add(it2.next().mo36396c(c10366l1M36825b));
            }
            c10642c0Mo33222Q0.mo36993x0(c10772fM38540c);
        }
        if (isConst() && (function0 = this.f41029m) != null) {
            c10642c0Mo33222Q0.m37909L0(this.f41028l, function0);
        }
        return c10642c0Mo33222Q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C10644d0 getGetter() {
        return this.f40916C;
    }

    /* renamed from: V0 */
    public void m37789V0(C10644d0 c10644d0, InterfaceC10733v0 interfaceC10733v0) {
        m37790W0(c10644d0, interfaceC10733v0, null, null);
    }

    /* renamed from: W0 */
    public void m37790W0(C10644d0 c10644d0, InterfaceC10733v0 interfaceC10733v0, InterfaceC10734w interfaceC10734w, InterfaceC10734w interfaceC10734w2) {
        this.f40916C = c10644d0;
        this.f40917D = interfaceC10733v0;
        this.f40919F = interfaceC10734w;
        this.f40920G = interfaceC10734w2;
    }

    /* renamed from: X0 */
    public boolean m37791X0() {
        return this.f40918E;
    }

    /* renamed from: Y0 */
    public a m37792Y0() {
        return new a();
    }

    /* renamed from: a1 */
    public void mo33223a1(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m37785v(14);
        }
    }

    /* renamed from: b1 */
    public void m37793b1(boolean z) {
        this.f40918E = z;
    }

    /* renamed from: c1 */
    public void m37794c1(AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10587e1> list, InterfaceC10735w0 interfaceC10735w0, InterfaceC10735w0 interfaceC10735w02, List<InterfaceC10735w0> list2) {
        if (abstractC10344e0 == null) {
            m37785v(17);
        }
        if (list == null) {
            m37785v(18);
        }
        if (list2 == null) {
            m37785v(19);
        }
        m37891A0(abstractC10344e0);
        this.f40915B = new ArrayList(list);
        this.f40914A = interfaceC10735w02;
        this.f40933z = interfaceC10735w0;
        this.f40932y = list2;
    }

    /* renamed from: d1 */
    public void m37795d1(AbstractC10730u abstractC10730u) {
        if (abstractC10730u == null) {
            m37785v(20);
        }
        this.f40922o = abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10729t0> mo37027e() {
        Collection<? extends InterfaceC10729t0> collectionEmptyList = this.f40923p;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            m37785v(41);
        }
        return collectionEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10662m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f0 */
    public InterfaceC10735w0 mo37029f0() {
        return this.f40933z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10662m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        AbstractC10344e0 type = getType();
        if (type == null) {
            m37785v(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    public InterfaceC10733v0 getSetter() {
        return this.f40917D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10662m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public List<InterfaceC10587e1> getTypeParameters() {
        List<InterfaceC10587e1> list = this.f40915B;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = this.f40922o;
        if (abstractC10730u == null) {
            m37785v(25);
        }
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: i */
    public InterfaceC10576b.a mo37030i() {
        InterfaceC10576b.a aVar = this.f40925r;
        if (aVar == null) {
            m37785v(39);
        }
        return aVar;
    }

    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10573a.a<V> aVar) {
        return null;
    }

    public boolean isConst() {
        return this.f40927t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        EnumC10583d0 enumC10583d0 = this.f40921n;
        if (enumC10583d0 == null) {
            m37785v(24);
        }
        return enumC10583d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10662m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: m0 */
    public InterfaceC10735w0 mo37032m0() {
        return this.f40914A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: n0 */
    public InterfaceC10734w mo37033n0() {
        return this.f40920G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: q0 */
    public InterfaceC10734w mo37034q0() {
        return this.f40919F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: r0 */
    public List<InterfaceC10735w0> mo37035r0() {
        List<InterfaceC10735w0> list = this.f40932y;
        if (list == null) {
            m37785v(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: s0 */
    public boolean mo37036s0() {
        return this.f40926s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: x */
    public List<InterfaceC10727s0> mo37037x() {
        ArrayList arrayList = new ArrayList(2);
        C10644d0 c10644d0 = this.f40916C;
        if (c10644d0 != null) {
            arrayList.add(c10644d0);
        }
        InterfaceC10733v0 interfaceC10733v0 = this.f40917D;
        if (interfaceC10733v0 != null) {
            arrayList.add(interfaceC10733v0);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10576b> collection) {
        if (collection == 0) {
            m37785v(40);
        }
        this.f40923p = collection;
    }

    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40930w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: c */
    public InterfaceC10729t0 mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37785v(27);
        }
        return c10366l1.m36756k() ? this : m37792Y0().m37817v(c10366l1.m36755j()).m37815t(mo37019a()).m37809n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10729t0 mo37019a() {
        InterfaceC10729t0 interfaceC10729t0 = this.f40924q;
        InterfaceC10729t0 interfaceC10729t0Mo37019a = interfaceC10729t0 == this ? this : interfaceC10729t0.mo37019a();
        if (interfaceC10729t0Mo37019a == null) {
            m37785v(38);
        }
        return interfaceC10729t0Mo37019a;
    }
}
