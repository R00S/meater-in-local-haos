package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.comparisons.C10839b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10590f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10737x0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10649g;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9936j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10072r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9961i0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9977c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9984a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9988e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10008a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10011d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10162e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10226v;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10249f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: LazyJavaClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f */
/* loaded from: classes2.dex */
public final class C10000f extends AbstractC10649g implements InterfaceC9977c {

    /* renamed from: n */
    public static final a f38037n = new a(null);

    /* renamed from: o */
    private static final Set<String> f38038o = C10822w0.m38922i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: A */
    private final C10737x0<C10001g> f38039A;

    /* renamed from: B */
    private final C10249f f38040B;

    /* renamed from: C */
    private final C10005k f38041C;

    /* renamed from: D */
    private final InterfaceC10620g f38042D;

    /* renamed from: E */
    private final InterfaceC10325i<List<InterfaceC10587e1>> f38043E;

    /* renamed from: p */
    private final C9990g f38044p;

    /* renamed from: q */
    private final InterfaceC10030g f38045q;

    /* renamed from: r */
    private final InterfaceC10585e f38046r;

    /* renamed from: s */
    private final C9990g f38047s;

    /* renamed from: t */
    private final Lazy f38048t;

    /* renamed from: u */
    private final EnumC10588f f38049u;

    /* renamed from: v */
    private final EnumC10583d0 f38050v;

    /* renamed from: w */
    private final AbstractC10611m1 f38051w;

    /* renamed from: x */
    private final boolean f38052x;

    /* renamed from: y */
    private final b f38053y;

    /* renamed from: z */
    private final C10001g f38054z;

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$b */
    private final class b extends AbstractC10334b {

        /* renamed from: d */
        private final InterfaceC10325i<List<InterfaceC10587e1>> f38055d;

        /* compiled from: LazyJavaClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10587e1>> {

            /* renamed from: f */
            final /* synthetic */ C10000f f38057f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10000f c10000f) {
                super(0);
                this.f38057f = c10000f;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10587e1> invoke() {
                return C10590f1.m37685d(this.f38057f);
            }
        }

        public b() {
            super(C10000f.this.f38047s.m33286e());
            this.f38055d = C10000f.this.f38047s.m33286e().mo36516d(new a(C10000f.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0 m33349x() {
            /*
                r8 = this;
                kotlin.f0.y.e.j0.f.c r0 = r8.m33350y()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.m35422d()
                if (r3 != 0) goto L18
                kotlin.f0.y.e.j0.f.f r3 = kotlin.reflect.p371y.internal.p374j0.p375b.C9917k.f37516q
                boolean r3 = r0.m35427i(r3)
                if (r3 == 0) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                kotlin.f0.y.e.j0.d.a.m r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10015m.f38191a
                kotlin.f0.y.e.j0.d.a.l0.l.f r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f.this
                kotlin.f0.y.e.j0.f.c r4 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36074h(r4)
                kotlin.f0.y.e.j0.f.c r3 = r3.m33567b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                kotlin.f0.y.e.j0.d.a.l0.l.f r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f.this
                kotlin.f0.y.e.j0.d.a.l0.g r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f.m33338M0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.g0 r4 = r4.m33285d()
                kotlin.f0.y.e.j0.c.b.d r5 = kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.descriptors.e r3 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36084r(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                kotlin.f0.y.e.j0.l.e1 r4 = r3.mo32877h()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.f0.y.e.j0.d.a.l0.l.f r5 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f.this
                kotlin.f0.y.e.j0.l.e1 r5 = r5.mo32877h()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.C9801m.m32345e(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L8d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.C10813s.m38869u(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1) r2
                kotlin.f0.y.e.j0.l.i1 r4 = new kotlin.f0.y.e.j0.l.i1
                kotlin.f0.y.e.j0.l.r1 r5 = kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1.INVARIANT
                kotlin.f0.y.e.j0.l.m0 r2 = r2.mo36400s()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                kotlin.f0.y.e.j0.l.i1 r0 = new kotlin.f0.y.e.j0.l.i1
                kotlin.f0.y.e.j0.l.r1 r2 = kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1.INVARIANT
                java.lang.Object r5 = kotlin.collections.C10813s.m38866s0(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1) r5
                kotlin.f0.y.e.j0.l.m0 r5 = r5.mo36400s()
                r0.<init>(r2, r5)
                kotlin.e0.f r2 = new kotlin.e0.f
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.C10813s.m38869u(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                kotlin.w.k0 r4 = (kotlin.collections.IntIterator) r4
                r4.mo32397b()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                kotlin.f0.y.e.j0.l.a1$a r1 = kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1.f40041g
                kotlin.f0.y.e.j0.l.a1 r1 = r1.m36577h()
                kotlin.f0.y.e.j0.l.m0 r0 = kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0.m36667g(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f.b.m33349x():kotlin.f0.y.e.j0.l.e0");
        }

        /* renamed from: y */
        private final C10160c m33350y() {
            String strMo36023b;
            InterfaceC10620g annotations = C10000f.this.getAnnotations();
            C10160c c10160c = C9945a0.f37802q;
            C9801m.m32345e(c10160c, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC10616c interfaceC10616cMo33271l = annotations.mo33271l(c10160c);
            if (interfaceC10616cMo33271l == null) {
                return null;
            }
            Object objM38868t0 = C10813s.m38868t0(interfaceC10616cMo33271l.mo33159a().values());
            C10226v c10226v = objM38868t0 instanceof C10226v ? (C10226v) objM38868t0 : null;
            if (c10226v == null || (strMo36023b = c10226v.mo36023b()) == null || !C10162e.m35447e(strMo36023b)) {
                return null;
            }
            return new C10160c(strMo36023b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            return this.f38055d.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: l */
        protected Collection<AbstractC10344e0> mo32889l() {
            Collection<InterfaceC10033j> collectionMo33595a = C10000f.this.m33343Q0().mo33595a();
            ArrayList arrayList = new ArrayList(collectionMo33595a.size());
            ArrayList<InterfaceC10047x> arrayList2 = new ArrayList(0);
            AbstractC10344e0 abstractC10344e0M33349x = m33349x();
            Iterator<InterfaceC10033j> it = collectionMo33595a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC10033j next = it.next();
                AbstractC10344e0 abstractC10344e0M33746h = C10000f.this.f38047s.m33282a().m33258r().m33746h(C10000f.this.f38047s.m33288g().m33525o(next, C10011d.m33530d(EnumC9973k.SUPERTYPE, false, null, 3, null)), C10000f.this.f38047s);
                if (abstractC10344e0M33746h.mo35993O0().mo32891w() instanceof C10601j0.b) {
                    arrayList2.add(next);
                }
                if (!C9801m.m32341a(abstractC10344e0M33746h.mo35993O0(), abstractC10344e0M33349x != null ? abstractC10344e0M33349x.mo35993O0() : null) && !AbstractC9914h.m32736b0(abstractC10344e0M33746h)) {
                    arrayList.add(abstractC10344e0M33746h);
                }
            }
            InterfaceC10585e interfaceC10585e = C10000f.this.f38046r;
            C10767a.m38508a(arrayList, interfaceC10585e != null ? C9936j.m33012a(interfaceC10585e, C10000f.this).m36726c().m36759p(interfaceC10585e.mo36400s(), EnumC10384r1.INVARIANT) : null);
            C10767a.m38508a(arrayList, abstractC10344e0M33349x);
            if (!arrayList2.isEmpty()) {
                InterfaceC10308r interfaceC10308rM33243c = C10000f.this.f38047s.m33282a().m33243c();
                InterfaceC10585e interfaceC10585eMo32891w = mo32891w();
                ArrayList arrayList3 = new ArrayList(C10819v.m38911u(arrayList2, 10));
                for (InterfaceC10047x interfaceC10047x : arrayList2) {
                    C9801m.m32344d(interfaceC10047x, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((InterfaceC10033j) interfaceC10047x).mo33607p());
                }
                interfaceC10308rM33243c.mo36471b(interfaceC10585eMo32891w, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? C10782c0.m38569E0(arrayList) : C10815t.m38883e(C10000f.this.f38047s.m33285d().mo37021o().m32791i());
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: q */
        protected InterfaceC10581c1 mo32890q() {
            return C10000f.this.f38047s.m33282a().m33262v();
        }

        public String toString() {
            String strM35455k = C10000f.this.getName().m35455k();
            C9801m.m32345e(strM35455k, "name.asString()");
            return strM35455k;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10367m, kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: w */
        public InterfaceC10585e mo32891w() {
            return C10000f.this;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$c */
    static final class c extends Lambda implements Function0<List<? extends InterfaceC10587e1>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10587e1> invoke() {
            List<InterfaceC10048y> typeParameters = C10000f.this.m33343Q0().getTypeParameters();
            C10000f c10000f = C10000f.this;
            ArrayList arrayList = new ArrayList(C10819v.m38911u(typeParameters, 10));
            for (InterfaceC10048y interfaceC10048y : typeParameters) {
                InterfaceC10587e1 interfaceC10587e1Mo33293a = c10000f.f38047s.m33287f().mo33293a(interfaceC10048y);
                if (interfaceC10587e1Mo33293a == null) {
                    throw new AssertionError("Parameter " + interfaceC10048y + " surely belongs to class " + c10000f.m33343Q0() + ", so it must be resolved");
                }
                arrayList.add(interfaceC10587e1Mo33293a);
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$d */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C10839b.m39017a(C10235a.m36074h((InterfaceC10585e) t).m35420b(), C10235a.m36074h((InterfaceC10585e) t2).m35420b());
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$e */
    static final class e extends Lambda implements Function0<List<? extends InterfaceC10019a>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10019a> invoke() {
            C10159b c10159bM36073g = C10235a.m36073g(C10000f.this);
            if (c10159bM36073g != null) {
                return C10000f.this.m33345S0().m33282a().m33246f().mo33803a(c10159bM36073g);
            }
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.f$f */
    static final class f extends Lambda implements Function1<AbstractC10396g, C10001g> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10001g invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "it");
            C9990g c9990g = C10000f.this.f38047s;
            C10000f c10000f = C10000f.this;
            return new C10001g(c9990g, c10000f, c10000f.m33343Q0(), C10000f.this.f38046r != null, C10000f.this.f38054z);
        }
    }

    public /* synthetic */ C10000f(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10030g interfaceC10030g, InterfaceC10585e interfaceC10585e, int i2, C9789g c9789g) {
        this(c9990g, interfaceC10609m, interfaceC10030g, (i2 & 8) != 0 ? null : interfaceC10585e);
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J */
    public Collection<InterfaceC10585e> mo32861J() {
        if (this.f38050v != EnumC10583d0.SEALED) {
            return C10817u.m38888j();
        }
        C10008a c10008aM33530d = C10011d.m33530d(EnumC9973k.COMMON, false, null, 3, null);
        Collection<InterfaceC10033j> collectionMo33594N = this.f38045q.mo33594N();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo33594N.iterator();
        while (it.hasNext()) {
            InterfaceC10594h interfaceC10594hMo32891w = this.f38047s.m33288g().m33525o((InterfaceC10033j) it.next(), c10008aM33530d).mo35993O0().mo32891w();
            InterfaceC10585e interfaceC10585e = interfaceC10594hMo32891w instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32891w : null;
            if (interfaceC10585e != null) {
                arrayList.add(interfaceC10585e);
            }
        }
        return C10782c0.m38618x0(arrayList, new d());
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

    /* renamed from: O0 */
    public final C10000f m33341O0(InterfaceC9969g interfaceC9969g, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC9969g, "javaResolverCache");
        C9990g c9990g = this.f38047s;
        C9990g c9990gM33238i = C9984a.m33238i(c9990g, c9990g.m33282a().m33264x(interfaceC9969g));
        InterfaceC10609m interfaceC10609mMo32876b = mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "containingDeclaration");
        return new C10000f(c9990gM33238i, interfaceC10609mMo32876b, this.f38045q, interfaceC10585e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10582d> mo32880k() {
        return this.f38054z.m33411w0().invoke();
    }

    /* renamed from: Q0 */
    public final InterfaceC10030g m33343Q0() {
        return this.f38045q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public InterfaceC10582d mo32864R() {
        return null;
    }

    /* renamed from: R0 */
    public final List<InterfaceC10019a> m33344R0() {
        return (List) this.f38048t.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: S */
    public InterfaceC10251h mo32866S() {
        return this.f38041C;
    }

    /* renamed from: S0 */
    public final C9990g m33345S0() {
        return this.f38044p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C10001g mo33340D0() {
        InterfaceC10251h interfaceC10251hMo33340D0 = super.mo33340D0();
        C9801m.m32344d(interfaceC10251hMo33340D0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C10001g) interfaceC10251hMo33340D0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public InterfaceC10585e mo32869U() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C10001g mo32860H(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return (C10001g) this.f38039A.m38158c(abstractC10396g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return this.f38042D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        if (!C9801m.m32341a(this.f38051w, C10728t.f41216a) || this.f38045q.mo33597i() != null) {
            return C9961i0.m33146c(this.f38051w);
        }
        AbstractC10730u abstractC10730u = C10072r.f38302a;
        C9801m.m32345e(abstractC10730u, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        return this.f38053y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        return this.f38049u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        return this.f38050v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return this.f38052x;
    }

    public String toString() {
        return "Lazy Java class " + C10235a.m36075i(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        return this.f38043E.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: y0 */
    public InterfaceC10251h mo33348y0() {
        return this.f38040B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10000f(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10030g interfaceC10030g, InterfaceC10585e interfaceC10585e) {
        EnumC10583d0 enumC10583d0M37676a;
        super(c9990g.m33286e(), interfaceC10609m, interfaceC10030g.getName(), c9990g.m33282a().m33260t().mo33569a(interfaceC10030g), false);
        C9801m.m32346f(c9990g, "outerContext");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10030g, "jClass");
        this.f38044p = c9990g;
        this.f38045q = interfaceC10030g;
        this.f38046r = interfaceC10585e;
        C9990g c9990gM33233d = C9984a.m33233d(c9990g, this, interfaceC10030g, 0, 4, null);
        this.f38047s = c9990gM33233d;
        c9990gM33233d.m33282a().m33248h().mo33180c(interfaceC10030g, this);
        interfaceC10030g.mo33591I();
        this.f38048t = C10550i.m37594b(new e());
        this.f38049u = interfaceC10030g.mo33601r() ? EnumC10588f.ANNOTATION_CLASS : interfaceC10030g.mo33590H() ? EnumC10588f.INTERFACE : interfaceC10030g.mo33588B() ? EnumC10588f.ENUM_CLASS : EnumC10588f.CLASS;
        if (interfaceC10030g.mo33601r() || interfaceC10030g.mo33588B()) {
            enumC10583d0M37676a = EnumC10583d0.FINAL;
        } else {
            enumC10583d0M37676a = EnumC10583d0.f40738f.m37676a(interfaceC10030g.mo33600o(), interfaceC10030g.mo33600o() || interfaceC10030g.isAbstract() || interfaceC10030g.mo33590H(), !interfaceC10030g.isFinal());
        }
        this.f38050v = enumC10583d0M37676a;
        this.f38051w = interfaceC10030g.getVisibility();
        this.f38052x = (interfaceC10030g.mo33597i() == null || interfaceC10030g.mo33623Q()) ? false : true;
        this.f38053y = new b();
        C10001g c10001g = new C10001g(c9990gM33233d, this, interfaceC10030g, interfaceC10585e != null, null, 16, null);
        this.f38054z = c10001g;
        this.f38039A = C10737x0.f41236a.m38159a(this, c9990gM33233d.m33286e(), c9990gM33233d.m33282a().m33251k().mo36949c(), new f());
        this.f38040B = new C10249f(c10001g);
        this.f38041C = new C10005k(c9990gM33233d, interfaceC10030g, this);
        this.f38042D = C9988e.m33273a(c9990gM33233d, interfaceC10030g);
        this.f38043E = c9990gM33233d.m33286e().mo36516d(new c());
    }
}
