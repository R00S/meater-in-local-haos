package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10824x0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10649g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10644d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10646e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10663n;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.jvm.internal.impl.utils.C10772f;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9937a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10072r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10073s;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10080z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9952e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9954f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9957g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9959h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9960i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9961i0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9963a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9972j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9976b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9978d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9980f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9982h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9984a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9988e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10008a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10011d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10029f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10034k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;

/* compiled from: LazyJavaClassMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g */
/* loaded from: classes2.dex */
public final class C10001g extends AbstractC10004j {

    /* renamed from: n */
    private final InterfaceC10585e f38061n;

    /* renamed from: o */
    private final InterfaceC10030g f38062o;

    /* renamed from: p */
    private final boolean f38063p;

    /* renamed from: q */
    private final InterfaceC10325i<List<InterfaceC10582d>> f38064q;

    /* renamed from: r */
    private final InterfaceC10325i<Set<C10163f>> f38065r;

    /* renamed from: s */
    private final InterfaceC10325i<Map<C10163f, InterfaceC10037n>> f38066s;

    /* renamed from: t */
    private final InterfaceC10324h<C10163f, AbstractC10649g> f38067t;

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$a */
    static final class a extends Lambda implements Function1<InterfaceC10040q, Boolean> {

        /* renamed from: f */
        public static final a f38068f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10040q interfaceC10040q) {
            C9801m.m32346f(interfaceC10040q, "it");
            return Boolean.valueOf(!interfaceC10040q.mo33623Q());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$b */
    /* synthetic */ class b extends C9793i implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10001g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "p0");
            return ((C10001g) this.receiver).m33359I0(c10163f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$c */
    /* synthetic */ class c extends C9793i implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10001g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "p0");
            return ((C10001g) this.receiver).m33360J0(c10163f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$d */
    static final class d extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "it");
            return C10001g.this.m33359I0(c10163f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$e */
    static final class e extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "it");
            return C10001g.this.m33360J0(c10163f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$f */
    static final class f extends Lambda implements Function0<List<? extends InterfaceC10582d>> {

        /* renamed from: g */
        final /* synthetic */ C9990g f38072g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C9990g c9990g) {
            super(0);
            this.f38072g = c9990g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d> invoke() {
            /*
                r9 = this;
                kotlin.f0.y.e.j0.d.a.l0.l.g r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.f0.y.e.j0.d.a.n0.g r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33365P(r0)
                java.util.Collection r0 = r0.mo33599k()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                kotlin.f0.y.e.j0.d.a.n0.k r2 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10034k) r2
                kotlin.f0.y.e.j0.d.a.l0.l.g r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.f0.y.e.j0.d.a.k0.b r2 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33367R(r3, r2)
                r1.add(r2)
                goto L17
            L2d:
                kotlin.f0.y.e.j0.d.a.l0.l.g r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.f0.y.e.j0.d.a.n0.g r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33365P(r0)
                boolean r0 = r0.mo33602t()
                if (r0 == 0) goto L81
                kotlin.f0.y.e.j0.d.a.l0.l.g r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33363N(r0)
                r2 = 0
                r3 = 2
                r4 = 0
                java.lang.String r5 = kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v.m34039c(r0, r2, r2, r3, r4)
                boolean r6 = r1.isEmpty()
                r7 = 1
                if (r6 == 0) goto L4f
            L4d:
                r2 = 1
                goto L69
            L4f:
                java.util.Iterator r6 = r1.iterator()
            L53:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L4d
                java.lang.Object r8 = r6.next()
                kotlin.reflect.jvm.internal.impl.descriptors.d r8 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d) r8
                java.lang.String r8 = kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v.m34039c(r8, r2, r2, r3, r4)
                boolean r8 = kotlin.jvm.internal.C9801m.m32341a(r8, r5)
                if (r8 == 0) goto L53
            L69:
                if (r2 == 0) goto L81
                r1.add(r0)
                kotlin.f0.y.e.j0.d.a.l0.g r2 = r9.f38072g
                kotlin.f0.y.e.j0.d.a.l0.b r2 = r2.m33282a()
                kotlin.f0.y.e.j0.d.a.j0.g r2 = r2.m33248h()
                kotlin.f0.y.e.j0.d.a.l0.l.g r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.f0.y.e.j0.d.a.n0.g r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33365P(r3)
                r2.mo33179b(r3, r0)
            L81:
                kotlin.f0.y.e.j0.d.a.l0.g r0 = r9.f38072g
                kotlin.f0.y.e.j0.d.a.l0.b r0 = r0.m33282a()
                kotlin.f0.y.e.j0.i.u.f r0 = r0.m33263w()
                kotlin.f0.y.e.j0.d.a.l0.l.g r2 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo33398C()
                r0.mo36095c(r2, r1)
                kotlin.f0.y.e.j0.d.a.l0.g r0 = r9.f38072g
                kotlin.f0.y.e.j0.d.a.l0.b r0 = r0.m33282a()
                kotlin.f0.y.e.j0.d.a.o0.l r0 = r0.m33258r()
                kotlin.f0.y.e.j0.d.a.l0.g r2 = r9.f38072g
                kotlin.f0.y.e.j0.d.a.l0.l.g r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.this
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto Lb0
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33362M(r3)
                java.util.List r1 = kotlin.collections.C10813s.m38856n(r1)
            Lb0:
                java.util.Collection r0 = r0.m33745g(r2, r1)
                java.util.List r0 = kotlin.collections.C10813s.m38813E0(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.f.invoke():java.util.List");
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$g */
    static final class g extends Lambda implements Function0<Map<C10163f, ? extends InterfaceC10037n>> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10163f, InterfaceC10037n> invoke() {
            Collection<InterfaceC10037n> collectionMo33589D = C10001g.this.f38062o.mo33589D();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionMo33589D) {
                if (((InterfaceC10037n) obj).mo33613G()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InterfaceC10037n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$h */
    static final class h extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10739y0 f38074f;

        /* renamed from: g */
        final /* synthetic */ C10001g f38075g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC10739y0 interfaceC10739y0, C10001g c10001g) {
            super(1);
            this.f38074f = interfaceC10739y0;
            this.f38075g = c10001g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "accessorName");
            return C9801m.m32341a(this.f38074f.getName(), c10163f) ? C10815t.m38883e(this.f38074f) : C10782c0.m38609o0(this.f38075g.m33359I0(c10163f), this.f38075g.m33360J0(c10163f));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$i */
    static final class i extends Lambda implements Function0<Set<? extends C10163f>> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            return C10782c0.m38574I0(C10001g.this.f38062o.mo33592K());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$j */
    static final class j extends Lambda implements Function1<C10163f, AbstractC10649g> {

        /* renamed from: g */
        final /* synthetic */ C9990g f38078g;

        /* compiled from: LazyJavaClassMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$j$a */
        static final class a extends Lambda implements Function0<Set<? extends C10163f>> {

            /* renamed from: f */
            final /* synthetic */ C10001g f38079f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10001g c10001g) {
                super(0);
                this.f38079f = c10001g;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                return C10824x0.m38925l(this.f38079f.mo33312b(), this.f38079f.mo33314d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C9990g c9990g) {
            super(1);
            this.f38078g = c9990g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10649g invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            if (!((Set) C10001g.this.f38065r.invoke()).contains(c10163f)) {
                InterfaceC10037n interfaceC10037n = (InterfaceC10037n) ((Map) C10001g.this.f38066s.invoke()).get(c10163f);
                if (interfaceC10037n == null) {
                    return null;
                }
                return C10663n.m37894M0(this.f38078g.m33286e(), C10001g.this.mo33398C(), c10163f, this.f38078g.m33286e().mo36516d(new a(C10001g.this)), C9988e.m33273a(this.f38078g, interfaceC10037n), this.f38078g.m33282a().m33260t().mo33569a(interfaceC10037n));
            }
            InterfaceC10050o interfaceC10050oM33244d = this.f38078g.m33282a().m33244d();
            C10159b c10159bM36073g = C10235a.m36073g(C10001g.this.mo33398C());
            C9801m.m32343c(c10159bM36073g);
            C10159b c10159bM35411d = c10159bM36073g.m35411d(c10163f);
            C9801m.m32345e(c10159bM35411d, "ownerDescriptor.classId!…createNestedClassId(name)");
            InterfaceC10030g interfaceC10030gMo33629a = interfaceC10050oM33244d.mo33629a(new InterfaceC10050o.b(c10159bM35411d, null, C10001g.this.f38062o, 2, null));
            if (interfaceC10030gMo33629a == null) {
                return null;
            }
            C9990g c9990g = this.f38078g;
            C10000f c10000f = new C10000f(c9990g, C10001g.this.mo33398C(), interfaceC10030gMo33629a, null, 8, null);
            c9990g.m33282a().m33245e().mo33782a(c10000f);
            return c10000f;
        }
    }

    public /* synthetic */ C10001g(C9990g c9990g, InterfaceC10585e interfaceC10585e, InterfaceC10030g interfaceC10030g, boolean z, C10001g c10001g, int i2, C9789g c9789g) {
        this(c9990g, interfaceC10585e, interfaceC10030g, z, (i2 & 16) != 0 ? null : c10001g);
    }

    /* renamed from: A0 */
    private final boolean m33352A0(InterfaceC10739y0 interfaceC10739y0, InterfaceC10738y interfaceC10738y) {
        String strM34039c = C10106v.m34039c(interfaceC10739y0, false, false, 2, null);
        InterfaceC10738y interfaceC10738yMo37019a = interfaceC10738y.mo37019a();
        C9801m.m32345e(interfaceC10738yMo37019a, "builtinWithErasedParameters.original");
        return C9801m.m32341a(strM34039c, C10106v.m34039c(interfaceC10738yMo37019a, false, false, 2, null)) && !m33388o0(interfaceC10739y0, interfaceC10738y);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:8:0x001f->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:1: B:16:0x003f->B:50:?, LOOP_END, SYNTHETIC] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m33353B0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0 r7) {
        /*
            r6 = this;
            kotlin.f0.y.e.j0.f.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.util.List r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9953e0.m33079a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = 0
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            kotlin.f0.y.e.j0.f.f r1 = (kotlin.reflect.p371y.internal.p374j0.p397f.C10163f) r1
            java.util.Set r1 = r6.m33397z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = 0
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0) r4
            kotlin.f0.y.e.j0.d.a.l0.l.g$h r5 = new kotlin.f0.y.e.j0.d.a.l0.l.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.m33387n0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.mo37031j0()
            if (r4 != 0) goto L6f
            kotlin.f0.y.e.j0.f.f r4 = r7.getName()
            java.lang.String r4 = r4.m35455k()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.C9801m.m32345e(r4, r5)
            boolean r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10080z.m33831d(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = 1
            goto L72
        L71:
            r4 = 0
        L72:
            if (r4 == 0) goto L3f
            r1 = 1
        L75:
            if (r1 == 0) goto L1f
            r0 = 1
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.m33389p0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.m33361K0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.m33391r0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = 0
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33353B0(kotlin.reflect.jvm.internal.impl.descriptors.y0):boolean");
    }

    /* renamed from: C0 */
    private final InterfaceC10739y0 m33354C0(InterfaceC10739y0 interfaceC10739y0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1, Collection<? extends InterfaceC10739y0> collection) {
        InterfaceC10739y0 interfaceC10739y0M33380g0;
        InterfaceC10738y interfaceC10738yM33087k = C9954f.m33087k(interfaceC10739y0);
        if (interfaceC10738yM33087k == null || (interfaceC10739y0M33380g0 = m33380g0(interfaceC10738yM33087k, function1)) == null) {
            return null;
        }
        if (!m33353B0(interfaceC10739y0M33380g0)) {
            interfaceC10739y0M33380g0 = null;
        }
        if (interfaceC10739y0M33380g0 != null) {
            return m33379f0(interfaceC10739y0M33380g0, interfaceC10738yM33087k, collection);
        }
        return null;
    }

    /* renamed from: D0 */
    private final InterfaceC10739y0 m33355D0(InterfaceC10739y0 interfaceC10739y0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1, C10163f c10163f, Collection<? extends InterfaceC10739y0> collection) {
        InterfaceC10739y0 interfaceC10739y02 = (InterfaceC10739y0) C9957g0.m33103d(interfaceC10739y0);
        if (interfaceC10739y02 == null) {
            return null;
        }
        String strM33101b = C9957g0.m33101b(interfaceC10739y02);
        C9801m.m32343c(strM33101b);
        C10163f c10163fM35454x = C10163f.m35454x(strM33101b);
        C9801m.m32345e(c10163fM35454x, "identifier(nameInJava)");
        Iterator<? extends InterfaceC10739y0> it = function1.invoke(c10163fM35454x).iterator();
        while (it.hasNext()) {
            InterfaceC10739y0 interfaceC10739y0M33385l0 = m33385l0(it.next(), c10163f);
            if (m33390q0(interfaceC10739y02, interfaceC10739y0M33385l0)) {
                return m33379f0(interfaceC10739y0M33385l0, interfaceC10739y02, collection);
            }
        }
        return null;
    }

    /* renamed from: E0 */
    private final InterfaceC10739y0 m33356E0(InterfaceC10739y0 interfaceC10739y0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        if (!interfaceC10739y0.isSuspend()) {
            return null;
        }
        C10163f name = interfaceC10739y0.getName();
        C9801m.m32345e(name, "descriptor.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            InterfaceC10739y0 interfaceC10739y0M33386m0 = m33386m0((InterfaceC10739y0) it.next());
            if (interfaceC10739y0M33386m0 == null || !m33388o0(interfaceC10739y0M33386m0, interfaceC10739y0)) {
                interfaceC10739y0M33386m0 = null;
            }
            if (interfaceC10739y0M33386m0 != null) {
                return interfaceC10739y0M33386m0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public final C9976b m33357G0(InterfaceC10034k interfaceC10034k) {
        InterfaceC10585e interfaceC10585eMo33398C = mo33398C();
        C9976b c9976bM33202u1 = C9976b.m33202u1(interfaceC10585eMo33398C, C9988e.m33273a(m33461w(), interfaceC10034k), false, m33461w().m33282a().m33260t().mo33569a(interfaceC10034k));
        C9801m.m32345e(c9976bM33202u1, "createJavaConstructor(\n …ce(constructor)\n        )");
        C9990g c9990gM33234e = C9984a.m33234e(m33461w(), c9976bM33202u1, interfaceC10034k, interfaceC10585eMo33398C.mo32884w().size());
        AbstractC10004j.b bVarM33457K = m33457K(c9990gM33234e, c9976bM33202u1, interfaceC10034k.mo33610f());
        List<InterfaceC10587e1> listMo32884w = interfaceC10585eMo33398C.mo32884w();
        C9801m.m32345e(listMo32884w, "classDescriptor.declaredTypeParameters");
        List<InterfaceC10048y> typeParameters = interfaceC10034k.getTypeParameters();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC10587e1 interfaceC10587e1Mo33293a = c9990gM33234e.m33287f().mo33293a((InterfaceC10048y) it.next());
            C9801m.m32343c(interfaceC10587e1Mo33293a);
            arrayList.add(interfaceC10587e1Mo33293a);
        }
        c9976bM33202u1.m37845s1(bVarM33457K.m33469a(), C9961i0.m33146c(interfaceC10034k.getVisibility()), C10782c0.m38609o0(listMo32884w, arrayList));
        c9976bM33202u1.mo33206Z0(false);
        c9976bM33202u1.mo33207a1(bVarM33457K.m33470b());
        c9976bM33202u1.m37928h1(interfaceC10585eMo33398C.mo36400s());
        c9990gM33234e.m33282a().m33248h().mo33179b(interfaceC10034k, c9976bM33202u1);
        return c9976bM33202u1;
    }

    /* renamed from: H0 */
    private final C9979e m33358H0(InterfaceC10046w interfaceC10046w) {
        C9979e c9979eM33212q1 = C9979e.m33212q1(mo33398C(), C9988e.m33273a(m33461w(), interfaceC10046w), interfaceC10046w.getName(), m33461w().m33282a().m33260t().mo33569a(interfaceC10046w), true);
        C9801m.m32345e(c9979eM33212q1, "createJavaMethod(\n      …omponent), true\n        )");
        c9979eM33212q1.mo33214p1(null, mo33413z(), C10817u.m38888j(), C10817u.m38888j(), C10817u.m38888j(), m33461w().m33288g().m33525o(interfaceC10046w.getType(), C10011d.m33530d(EnumC9973k.COMMON, false, null, 2, null)), EnumC10583d0.f40738f.m37676a(false, false, true), C10728t.f41220e, null);
        c9979eM33212q1.m33217t1(false, false);
        m33461w().m33282a().m33248h().mo33182e(interfaceC10046w, c9979eM33212q1);
        return c9979eM33212q1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final Collection<InterfaceC10739y0> m33359I0(C10163f c10163f) {
        Collection<InterfaceC10041r> collectionMo33304f = m33462y().invoke().mo33304f(c10163f);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo33304f, 10));
        Iterator<T> it = collectionMo33304f.iterator();
        while (it.hasNext()) {
            arrayList.add(m33456I((InterfaceC10041r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public final Collection<InterfaceC10739y0> m33360J0(C10163f c10163f) {
        Set<InterfaceC10739y0> setM33396x0 = m33396x0(c10163f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM33396x0) {
            InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) obj;
            if (!(C9957g0.m33100a(interfaceC10739y0) || C9954f.m33087k(interfaceC10739y0) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: K0 */
    private final boolean m33361K0(InterfaceC10739y0 interfaceC10739y0) {
        C9954f c9954f = C9954f.f37848n;
        C10163f name = interfaceC10739y0.getName();
        C9801m.m32345e(name, "name");
        if (!c9954f.m33089l(name)) {
            return false;
        }
        C10163f name2 = interfaceC10739y0.getName();
        C9801m.m32345e(name2, "name");
        Set<InterfaceC10739y0> setM33396x0 = m33396x0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setM33396x0.iterator();
        while (it.hasNext()) {
            InterfaceC10738y interfaceC10738yM33087k = C9954f.m33087k((InterfaceC10739y0) it.next());
            if (interfaceC10738yM33087k != null) {
                arrayList.add(interfaceC10738yM33087k);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (m33352A0(interfaceC10739y0, (InterfaceC10738y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    private final void m33370U(List<InterfaceC10599i1> list, InterfaceC10606l interfaceC10606l, int i2, InterfaceC10041r interfaceC10041r, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        InterfaceC10620g interfaceC10620gM37735b = InterfaceC10620g.f40808c.m37735b();
        C10163f name = interfaceC10041r.getName();
        AbstractC10344e0 abstractC10344e0M36781n = C10372n1.m36781n(abstractC10344e0);
        C9801m.m32345e(abstractC10344e0M36781n, "makeNotNullable(returnType)");
        list.add(new C10660l0(interfaceC10606l, null, i2, interfaceC10620gM37735b, name, abstractC10344e0M36781n, interfaceC10041r.mo33619L(), false, false, abstractC10344e02 != null ? C10372n1.m36781n(abstractC10344e02) : null, m33461w().m33282a().m33260t().mo33569a(interfaceC10041r)));
    }

    /* renamed from: V */
    private final void m33371V(Collection<InterfaceC10739y0> collection, C10163f c10163f, Collection<? extends InterfaceC10739y0> collection2, boolean z) {
        Collection<? extends InterfaceC10739y0> collectionM33151d = C9963a.m33151d(c10163f, collection2, collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9801m.m32345e(collectionM33151d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(collectionM33151d);
            return;
        }
        List listM38609o0 = C10782c0.m38609o0(collection, collectionM33151d);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionM33151d, 10));
        for (InterfaceC10739y0 interfaceC10739y0M33379f0 : collectionM33151d) {
            InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) C9957g0.m33104e(interfaceC10739y0M33379f0);
            if (interfaceC10739y0 == null) {
                C9801m.m32345e(interfaceC10739y0M33379f0, "resolvedOverride");
            } else {
                C9801m.m32345e(interfaceC10739y0M33379f0, "resolvedOverride");
                interfaceC10739y0M33379f0 = m33379f0(interfaceC10739y0M33379f0, interfaceC10739y0, listM38609o0);
            }
            arrayList.add(interfaceC10739y0M33379f0);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: W */
    private final void m33372W(C10163f c10163f, Collection<? extends InterfaceC10739y0> collection, Collection<? extends InterfaceC10739y0> collection2, Collection<InterfaceC10739y0> collection3, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        for (InterfaceC10739y0 interfaceC10739y0 : collection2) {
            C10767a.m38508a(collection3, m33355D0(interfaceC10739y0, function1, c10163f, collection));
            C10767a.m38508a(collection3, m33354C0(interfaceC10739y0, function1, collection));
            C10767a.m38508a(collection3, m33356E0(interfaceC10739y0, function1));
        }
    }

    /* renamed from: X */
    private final void m33373X(Set<? extends InterfaceC10729t0> set, Collection<InterfaceC10729t0> collection, Set<InterfaceC10729t0> set2, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        for (InterfaceC10729t0 interfaceC10729t0 : set) {
            C9980f c9980fM33381h0 = m33381h0(interfaceC10729t0, function1);
            if (c9980fM33381h0 != null) {
                collection.add(c9980fM33381h0);
                if (set2 != null) {
                    set2.add(interfaceC10729t0);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Y */
    private final void m33374Y(C10163f c10163f, Collection<InterfaceC10729t0> collection) {
        InterfaceC10041r interfaceC10041r = (InterfaceC10041r) C10813s.m38868t0(m33462y().invoke().mo33304f(c10163f));
        if (interfaceC10041r == null) {
            return;
        }
        collection.add(m33383j0(this, interfaceC10041r, null, EnumC10583d0.FINAL, 2, null));
    }

    /* renamed from: b0 */
    private final Collection<AbstractC10344e0> m33375b0() {
        if (!this.f38063p) {
            return m33461w().m33282a().m33251k().mo36949c().mo36929g(mo33398C());
        }
        Collection<AbstractC10344e0> collectionMo35998a = mo33398C().mo32877h().mo35998a();
        C9801m.m32345e(collectionMo35998a, "ownerDescriptor.typeConstructor.supertypes");
        return collectionMo35998a;
    }

    /* renamed from: c0 */
    private final List<InterfaceC10599i1> m33376c0(C10647f c10647f) {
        Pair pair;
        Collection<InterfaceC10041r> collectionMo33593M = this.f38062o.mo33593M();
        ArrayList arrayList = new ArrayList(collectionMo33593M.size());
        C10008a c10008aM33530d = C10011d.m33530d(EnumC9973k.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionMo33593M) {
            if (C9801m.m32341a(((InterfaceC10041r) obj).getName(), C9945a0.f37788c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.m37646a();
        List<InterfaceC10041r> list2 = (List) pair2.m37647b();
        list.size();
        InterfaceC10041r interfaceC10041r = (InterfaceC10041r) C10813s.m38832W(list);
        if (interfaceC10041r != null) {
            InterfaceC10047x returnType = interfaceC10041r.getReturnType();
            if (returnType instanceof InterfaceC10029f) {
                InterfaceC10029f interfaceC10029f = (InterfaceC10029f) returnType;
                pair = new Pair(m33461w().m33288g().m33524k(interfaceC10029f, c10008aM33530d, true), m33461w().m33288g().m33525o(interfaceC10029f.mo33587n(), c10008aM33530d));
            } else {
                pair = new Pair(m33461w().m33288g().m33525o(returnType, c10008aM33530d), null);
            }
            m33370U(arrayList, c10647f, 0, interfaceC10041r, (AbstractC10344e0) pair.m37646a(), (AbstractC10344e0) pair.m37647b());
        }
        int i2 = 0;
        int i3 = interfaceC10041r == null ? 0 : 1;
        for (InterfaceC10041r interfaceC10041r2 : list2) {
            m33370U(arrayList, c10647f, i2 + i3, interfaceC10041r2, m33461w().m33288g().m33525o(interfaceC10041r2.getReturnType(), c10008aM33530d), null);
            i2++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final InterfaceC10582d m33377d0() {
        boolean zMo33601r = this.f38062o.mo33601r();
        if ((this.f38062o.mo33590H() || !this.f38062o.mo33603u()) && !zMo33601r) {
            return null;
        }
        InterfaceC10585e interfaceC10585eMo33398C = mo33398C();
        C9976b c9976bM33202u1 = C9976b.m33202u1(interfaceC10585eMo33398C, InterfaceC10620g.f40808c.m37735b(), true, m33461w().m33282a().m33260t().mo33569a(this.f38062o));
        C9801m.m32345e(c9976bM33202u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<InterfaceC10599i1> listM33376c0 = zMo33601r ? m33376c0(c9976bM33202u1) : Collections.emptyList();
        c9976bM33202u1.mo33207a1(false);
        c9976bM33202u1.m37844r1(listM33376c0, m33395v0(interfaceC10585eMo33398C));
        c9976bM33202u1.mo33206Z0(true);
        c9976bM33202u1.m37928h1(interfaceC10585eMo33398C.mo36400s());
        m33461w().m33282a().m33248h().mo33179b(this.f38062o, c9976bM33202u1);
        return c9976bM33202u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final InterfaceC10582d m33378e0() {
        InterfaceC10585e interfaceC10585eMo33398C = mo33398C();
        C9976b c9976bM33202u1 = C9976b.m33202u1(interfaceC10585eMo33398C, InterfaceC10620g.f40808c.m37735b(), true, m33461w().m33282a().m33260t().mo33569a(this.f38062o));
        C9801m.m32345e(c9976bM33202u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<InterfaceC10599i1> listM33384k0 = m33384k0(c9976bM33202u1);
        c9976bM33202u1.mo33207a1(false);
        c9976bM33202u1.m37844r1(listM33384k0, m33395v0(interfaceC10585eMo33398C));
        c9976bM33202u1.mo33206Z0(false);
        c9976bM33202u1.m37928h1(interfaceC10585eMo33398C.mo36400s());
        return c9976bM33202u1;
    }

    /* renamed from: f0 */
    private final InterfaceC10739y0 m33379f0(InterfaceC10739y0 interfaceC10739y0, InterfaceC10573a interfaceC10573a, Collection<? extends InterfaceC10739y0> collection) {
        boolean z = false;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            z = true;
        } else {
            for (InterfaceC10739y0 interfaceC10739y02 : collection) {
                if (!C9801m.m32341a(interfaceC10739y0, interfaceC10739y02) && interfaceC10739y02.mo37774d0() == null && m33388o0(interfaceC10739y02, interfaceC10573a)) {
                    break;
                }
            }
            z = true;
        }
        if (z) {
            return interfaceC10739y0;
        }
        InterfaceC10738y interfaceC10738yMo36996c = interfaceC10739y0.mo36992u().mo37010q().mo36996c();
        C9801m.m32343c(interfaceC10738yMo36996c);
        return (InterfaceC10739y0) interfaceC10738yMo36996c;
    }

    /* renamed from: g0 */
    private final InterfaceC10739y0 m33380g0(InterfaceC10738y interfaceC10738y, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        Object next;
        C10163f name = interfaceC10738y.getName();
        C9801m.m32345e(name, "overridden.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m33352A0((InterfaceC10739y0) next, interfaceC10738y)) {
                break;
            }
        }
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) next;
        if (interfaceC10739y0 == null) {
            return null;
        }
        InterfaceC10738y.a<? extends InterfaceC10739y0> aVarMo36992u = interfaceC10739y0.mo36992u();
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
        C9801m.m32345e(listMo37028f, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37028f, 10));
        Iterator<T> it2 = listMo37028f.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC10599i1) it2.next()).getType());
        }
        List<InterfaceC10599i1> listMo37028f2 = interfaceC10739y0.mo37028f();
        C9801m.m32345e(listMo37028f2, "override.valueParameters");
        aVarMo36992u.mo36995b(C9982h.m33225a(arrayList, listMo37028f2, interfaceC10738y));
        aVarMo36992u.mo37014u();
        aVarMo36992u.mo36999f();
        aVarMo36992u.mo37007n(C9979e.f37943K, Boolean.TRUE);
        return (InterfaceC10739y0) aVarMo36992u.mo36996c();
    }

    /* renamed from: h0 */
    private final C9980f m33381h0(InterfaceC10729t0 interfaceC10729t0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        InterfaceC10739y0 interfaceC10739y0M33394u0;
        C10646e0 c10646e0M35794l = null;
        if (!m33387n0(interfaceC10729t0, function1)) {
            return null;
        }
        InterfaceC10739y0 interfaceC10739y0M33393t0 = m33393t0(interfaceC10729t0, function1);
        C9801m.m32343c(interfaceC10739y0M33393t0);
        if (interfaceC10729t0.mo37031j0()) {
            interfaceC10739y0M33394u0 = m33394u0(interfaceC10729t0, function1);
            C9801m.m32343c(interfaceC10739y0M33394u0);
        } else {
            interfaceC10739y0M33394u0 = null;
        }
        if (interfaceC10739y0M33394u0 != null) {
            interfaceC10739y0M33394u0.mo32879j();
            interfaceC10739y0M33393t0.mo32879j();
        }
        C9978d c9978d = new C9978d(mo33398C(), interfaceC10739y0M33393t0, interfaceC10739y0M33394u0, interfaceC10729t0);
        AbstractC10344e0 returnType = interfaceC10739y0M33393t0.getReturnType();
        C9801m.m32343c(returnType);
        c9978d.m37794c1(returnType, C10817u.m38888j(), mo33413z(), null, C10817u.m38888j());
        C10644d0 c10644d0M35792j = C10186c.m35792j(c9978d, interfaceC10739y0M33393t0.getAnnotations(), false, false, false, interfaceC10739y0M33393t0.mo32883t());
        c10644d0M35792j.m37770O0(interfaceC10739y0M33393t0);
        c10644d0M35792j.m37828R0(c9978d.getType());
        C9801m.m32345e(c10644d0M35792j, "createGetter(\n          …escriptor.type)\n        }");
        if (interfaceC10739y0M33394u0 != null) {
            List<InterfaceC10599i1> listMo37028f = interfaceC10739y0M33394u0.mo37028f();
            C9801m.m32345e(listMo37028f, "setterMethod.valueParameters");
            InterfaceC10599i1 interfaceC10599i1 = (InterfaceC10599i1) C10813s.m38832W(listMo37028f);
            if (interfaceC10599i1 == null) {
                throw new AssertionError("No parameter found for " + interfaceC10739y0M33394u0);
            }
            c10646e0M35794l = C10186c.m35794l(c9978d, interfaceC10739y0M33394u0.getAnnotations(), interfaceC10599i1.getAnnotations(), false, false, false, interfaceC10739y0M33394u0.getVisibility(), interfaceC10739y0M33394u0.mo32883t());
            c10646e0M35794l.m37770O0(interfaceC10739y0M33394u0);
        }
        c9978d.m37789V0(c10644d0M35792j, c10646e0M35794l);
        return c9978d;
    }

    /* renamed from: i0 */
    private final C9980f m33382i0(InterfaceC10041r interfaceC10041r, AbstractC10344e0 abstractC10344e0, EnumC10583d0 enumC10583d0) {
        C9980f c9980fM33220g1 = C9980f.m33220g1(mo33398C(), C9988e.m33273a(m33461w(), interfaceC10041r), enumC10583d0, C9961i0.m33146c(interfaceC10041r.getVisibility()), false, interfaceC10041r.getName(), m33461w().m33282a().m33260t().mo33569a(interfaceC10041r), false);
        C9801m.m32345e(c9980fM33220g1, "create(\n            owne…inal = */ false\n        )");
        C10644d0 c10644d0M35786d = C10186c.m35786d(c9980fM33220g1, InterfaceC10620g.f40808c.m37735b());
        C9801m.m32345e(c10644d0M35786d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        c9980fM33220g1.m37789V0(c10644d0M35786d, null);
        AbstractC10344e0 abstractC10344e0M33459q = abstractC10344e0 == null ? m33459q(interfaceC10041r, C9984a.m33235f(m33461w(), c9980fM33220g1, interfaceC10041r, 0, 4, null)) : abstractC10344e0;
        c9980fM33220g1.m37794c1(abstractC10344e0M33459q, C10817u.m38888j(), mo33413z(), null, C10817u.m38888j());
        c10644d0M35786d.m37828R0(abstractC10344e0M33459q);
        return c9980fM33220g1;
    }

    /* renamed from: j0 */
    static /* synthetic */ C9980f m33383j0(C10001g c10001g, InterfaceC10041r interfaceC10041r, AbstractC10344e0 abstractC10344e0, EnumC10583d0 enumC10583d0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            abstractC10344e0 = null;
        }
        return c10001g.m33382i0(interfaceC10041r, abstractC10344e0, enumC10583d0);
    }

    /* renamed from: k0 */
    private final List<InterfaceC10599i1> m33384k0(C10647f c10647f) {
        Collection<InterfaceC10046w> collectionMo33598j = this.f38062o.mo33598j();
        ArrayList arrayList = new ArrayList(collectionMo33598j.size());
        AbstractC10344e0 abstractC10344e0 = null;
        C10008a c10008aM33530d = C10011d.m33530d(EnumC9973k.COMMON, false, null, 2, null);
        int i2 = 0;
        for (InterfaceC10046w interfaceC10046w : collectionMo33598j) {
            int i3 = i2 + 1;
            AbstractC10344e0 abstractC10344e0M33525o = m33461w().m33288g().m33525o(interfaceC10046w.getType(), c10008aM33530d);
            arrayList.add(new C10660l0(c10647f, null, i2, InterfaceC10620g.f40808c.m37735b(), interfaceC10046w.getName(), abstractC10344e0M33525o, false, false, false, interfaceC10046w.mo33627h() ? m33461w().m33282a().m33253m().mo37021o().m32793k(abstractC10344e0M33525o) : abstractC10344e0, m33461w().m33282a().m33260t().mo33569a(interfaceC10046w)));
            i2 = i3;
            abstractC10344e0 = null;
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private final InterfaceC10739y0 m33385l0(InterfaceC10739y0 interfaceC10739y0, C10163f c10163f) {
        InterfaceC10738y.a<? extends InterfaceC10739y0> aVarMo36992u = interfaceC10739y0.mo36992u();
        aVarMo36992u.mo37013t(c10163f);
        aVarMo36992u.mo37014u();
        aVarMo36992u.mo36999f();
        InterfaceC10738y interfaceC10738yMo36996c = aVarMo36992u.mo36996c();
        C9801m.m32343c(interfaceC10738yMo36996c);
        return (InterfaceC10739y0) interfaceC10738yMo36996c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0 m33386m0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo37028f()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.Object r0 = kotlin.collections.C10813s.m38847i0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1) r0
            r2 = 0
            if (r0 == 0) goto L7e
            kotlin.f0.y.e.j0.l.e0 r3 = r0.getType()
            kotlin.f0.y.e.j0.l.e1 r3 = r3.mo35993O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.mo32891w()
            if (r3 == 0) goto L35
            kotlin.f0.y.e.j0.f.d r3 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36075i(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.m35435f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.f0.y.e.j0.f.c r3 = r3.m35441l()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.f0.y.e.j0.f.c r4 = kotlin.reflect.p371y.internal.p374j0.p375b.C9917k.f37512m
            boolean r3 = kotlin.jvm.internal.C9801m.m32341a(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r6.mo36992u()
            java.util.List r6 = r6.mo37028f()
            kotlin.jvm.internal.C9801m.m32345e(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.C10813s.m38826N(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r2.mo36995b(r6)
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            java.util.List r0 = r0.mo35991M0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.f0.y.e.j0.l.g1 r0 = (kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1) r0
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r6.mo37000g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r6.mo36996c()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.p1.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0) r0
            if (r0 != 0) goto L7a
            goto L7d
        L7a:
            r0.m37929i1(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.m33386m0(kotlin.reflect.jvm.internal.impl.descriptors.y0):kotlin.reflect.jvm.internal.impl.descriptors.y0");
    }

    /* renamed from: n0 */
    private final boolean m33387n0(InterfaceC10729t0 interfaceC10729t0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        if (C9997c.m33307a(interfaceC10729t0)) {
            return false;
        }
        InterfaceC10739y0 interfaceC10739y0M33393t0 = m33393t0(interfaceC10729t0, function1);
        InterfaceC10739y0 interfaceC10739y0M33394u0 = m33394u0(interfaceC10729t0, function1);
        if (interfaceC10739y0M33393t0 == null) {
            return false;
        }
        if (interfaceC10729t0.mo37031j0()) {
            return interfaceC10739y0M33394u0 != null && interfaceC10739y0M33394u0.mo32879j() == interfaceC10739y0M33393t0.mo32879j();
        }
        return true;
    }

    /* renamed from: o0 */
    private final boolean m33388o0(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
        C10193j.i.a aVarM35898c = C10193j.f39520b.m35885F(interfaceC10573a2, interfaceC10573a, true).m35898c();
        C9801m.m32345e(aVarM35898c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return aVarM35898c == C10193j.i.a.OVERRIDABLE && !C10073s.f38306a.m33802a(interfaceC10573a2, interfaceC10573a);
    }

    /* renamed from: p0 */
    private final boolean m33389p0(InterfaceC10739y0 interfaceC10739y0) {
        C9959h0.a aVar = C9959h0.f37865a;
        C10163f name = interfaceC10739y0.getName();
        C9801m.m32345e(name, "name");
        C10163f c10163fM33125b = aVar.m33125b(name);
        if (c10163fM33125b == null) {
            return false;
        }
        Set<InterfaceC10739y0> setM33396x0 = m33396x0(c10163fM33125b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM33396x0) {
            if (C9957g0.m33100a((InterfaceC10739y0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        InterfaceC10739y0 interfaceC10739y0M33385l0 = m33385l0(interfaceC10739y0, c10163fM33125b);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m33390q0((InterfaceC10739y0) it.next(), interfaceC10739y0M33385l0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    private final boolean m33390q0(InterfaceC10739y0 interfaceC10739y0, InterfaceC10738y interfaceC10738y) {
        if (C9952e.f37846n.m33077k(interfaceC10739y0)) {
            interfaceC10738y = interfaceC10738y.mo37019a();
        }
        C9801m.m32345e(interfaceC10738y, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m33388o0(interfaceC10738y, interfaceC10739y0);
    }

    /* renamed from: r0 */
    private final boolean m33391r0(InterfaceC10739y0 interfaceC10739y0) {
        InterfaceC10739y0 interfaceC10739y0M33386m0 = m33386m0(interfaceC10739y0);
        if (interfaceC10739y0M33386m0 == null) {
            return false;
        }
        C10163f name = interfaceC10739y0.getName();
        C9801m.m32345e(name, "name");
        Set<InterfaceC10739y0> setM33396x0 = m33396x0(name);
        if ((setM33396x0 instanceof Collection) && setM33396x0.isEmpty()) {
            return false;
        }
        for (InterfaceC10739y0 interfaceC10739y02 : setM33396x0) {
            if (interfaceC10739y02.isSuspend() && m33388o0(interfaceC10739y0M33386m0, interfaceC10739y02)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    private final InterfaceC10739y0 m33392s0(InterfaceC10729t0 interfaceC10729t0, String str, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        InterfaceC10739y0 interfaceC10739y0;
        C10163f c10163fM35454x = C10163f.m35454x(str);
        C9801m.m32345e(c10163fM35454x, "identifier(getterName)");
        Iterator<T> it = function1.invoke(c10163fM35454x).iterator();
        do {
            interfaceC10739y0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC10739y0 interfaceC10739y02 = (InterfaceC10739y0) it.next();
            if (interfaceC10739y02.mo37028f().size() == 0) {
                InterfaceC10394e interfaceC10394e = InterfaceC10394e.f40181a;
                AbstractC10344e0 returnType = interfaceC10739y02.getReturnType();
                if (returnType == null ? false : interfaceC10394e.mo36920d(returnType, interfaceC10729t0.getType())) {
                    interfaceC10739y0 = interfaceC10739y02;
                }
            }
        } while (interfaceC10739y0 == null);
        return interfaceC10739y0;
    }

    /* renamed from: t0 */
    private final InterfaceC10739y0 m33393t0(InterfaceC10729t0 interfaceC10729t0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        InterfaceC10731u0 getter = interfaceC10729t0.getGetter();
        InterfaceC10731u0 interfaceC10731u0 = getter != null ? (InterfaceC10731u0) C9957g0.m33103d(getter) : null;
        String strM33141a = interfaceC10731u0 != null ? C9960i.f37892a.m33141a(interfaceC10731u0) : null;
        if (strM33141a != null && !C9957g0.m33105f(mo33398C(), interfaceC10731u0)) {
            return m33392s0(interfaceC10729t0, strM33141a, function1);
        }
        String strM35455k = interfaceC10729t0.getName().m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        return m33392s0(interfaceC10729t0, C10080z.m33829b(strM35455k), function1);
    }

    /* renamed from: u0 */
    private final InterfaceC10739y0 m33394u0(InterfaceC10729t0 interfaceC10729t0, Function1<? super C10163f, ? extends Collection<? extends InterfaceC10739y0>> function1) {
        InterfaceC10739y0 interfaceC10739y0;
        AbstractC10344e0 returnType;
        String strM35455k = interfaceC10729t0.getName().m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        C10163f c10163fM35454x = C10163f.m35454x(C10080z.m33832e(strM35455k));
        C9801m.m32345e(c10163fM35454x, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = function1.invoke(c10163fM35454x).iterator();
        do {
            interfaceC10739y0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC10739y0 interfaceC10739y02 = (InterfaceC10739y0) it.next();
            if (interfaceC10739y02.mo37028f().size() == 1 && (returnType = interfaceC10739y02.getReturnType()) != null && AbstractC9914h.m32727B0(returnType)) {
                InterfaceC10394e interfaceC10394e = InterfaceC10394e.f40181a;
                List<InterfaceC10599i1> listMo37028f = interfaceC10739y02.mo37028f();
                C9801m.m32345e(listMo37028f, "descriptor.valueParameters");
                if (interfaceC10394e.mo36919b(((InterfaceC10599i1) C10813s.m38866s0(listMo37028f)).getType(), interfaceC10729t0.getType())) {
                    interfaceC10739y0 = interfaceC10739y02;
                }
            }
        } while (interfaceC10739y0 == null);
        return interfaceC10739y0;
    }

    /* renamed from: v0 */
    private final AbstractC10730u m33395v0(InterfaceC10585e interfaceC10585e) {
        AbstractC10730u visibility = interfaceC10585e.getVisibility();
        C9801m.m32345e(visibility, "classDescriptor.visibility");
        if (!C9801m.m32341a(visibility, C10072r.f38303b)) {
            return visibility;
        }
        AbstractC10730u abstractC10730u = C10072r.f38304c;
        C9801m.m32345e(abstractC10730u, "PROTECTED_AND_PACKAGE");
        return abstractC10730u;
    }

    /* renamed from: x0 */
    private final Set<InterfaceC10739y0> m33396x0(C10163f c10163f) {
        Collection<AbstractC10344e0> collectionM33375b0 = m33375b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionM33375b0.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(linkedHashSet, ((AbstractC10344e0) it.next()).mo33553q().mo33311a(c10163f, EnumC9941d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: z0 */
    private final Set<InterfaceC10729t0> m33397z0(C10163f c10163f) {
        Collection<AbstractC10344e0> collectionM33375b0 = m33375b0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionM33375b0.iterator();
        while (it.hasNext()) {
            Collection<? extends InterfaceC10729t0> collectionMo33313c = ((AbstractC10344e0) it.next()).mo33553q().mo33313c(c10163f, EnumC9941d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(collectionMo33313c, 10));
            Iterator<T> it2 = collectionMo33313c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC10729t0) it2.next());
            }
            C10827z.m38933z(arrayList, arrayList2);
        }
        return C10782c0.m38574I0(arrayList);
    }

    /* renamed from: F0 */
    public void m33399F0(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        C9937a.m33013a(m33461w().m33282a().m33252l(), interfaceC9939b, mo33398C(), c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: G */
    protected boolean mo33400G(C9979e c9979e) {
        C9801m.m32346f(c9979e, "<this>");
        if (this.f38062o.mo33601r()) {
            return false;
        }
        return m33353B0(c9979e);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: H */
    protected AbstractC10004j.a mo33401H(InterfaceC10041r interfaceC10041r, List<? extends InterfaceC10587e1> list, AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10599i1> list2) {
        C9801m.m32346f(interfaceC10041r, "method");
        C9801m.m32346f(list, "methodTypeParameters");
        C9801m.m32346f(abstractC10344e0, "returnType");
        C9801m.m32346f(list2, "valueParameters");
        InterfaceC9972j.b bVarMo33186a = m33461w().m33282a().m33259s().mo33186a(interfaceC10041r, mo33398C(), abstractC10344e0, null, list2, list);
        C9801m.m32345e(bVarMo33186a, "c.components.signaturePr…dTypeParameters\n        )");
        AbstractC10344e0 abstractC10344e0M33192d = bVarMo33186a.m33192d();
        C9801m.m32345e(abstractC10344e0M33192d, "propagated.returnType");
        AbstractC10344e0 abstractC10344e0M33191c = bVarMo33186a.m33191c();
        List<InterfaceC10599i1> listM33194f = bVarMo33186a.m33194f();
        C9801m.m32345e(listM33194f, "propagated.valueParameters");
        List<InterfaceC10587e1> listM33193e = bVarMo33186a.m33193e();
        C9801m.m32345e(listM33193e, "propagated.typeParameters");
        boolean zM33195g = bVarMo33186a.m33195g();
        List<String> listM33190b = bVarMo33186a.m33190b();
        C9801m.m32345e(listM33190b, "propagated.errors");
        return new AbstractC10004j.a(abstractC10344e0M33192d, abstractC10344e0M33191c, listM33194f, listM33193e, zM33195g, listM33190b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<C10163f> mo33405n(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        Collection<AbstractC10344e0> collectionMo35998a = mo33398C().mo32877h().mo35998a();
        C9801m.m32345e(collectionMo35998a, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<C10163f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionMo35998a.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(linkedHashSet, ((AbstractC10344e0) it.next()).mo33553q().mo33312b());
        }
        linkedHashSet.addAll(m33462y().invoke().mo33299a());
        linkedHashSet.addAll(m33462y().invoke().mo33302d());
        linkedHashSet.addAll(mo33404l(c10247d, function1));
        linkedHashSet.addAll(m33461w().m33282a().m33263w().mo36096d(mo33398C()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33399F0(c10163f, interfaceC9939b);
        return super.mo33311a(c10163f, interfaceC9939b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C9995a mo33407p() {
        return new C9995a(this.f38062o, a.f38068f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33399F0(c10163f, interfaceC9939b);
        return super.mo33313c(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        InterfaceC10324h<C10163f, AbstractC10649g> interfaceC10324h;
        AbstractC10649g abstractC10649gInvoke;
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33399F0(c10163f, interfaceC9939b);
        C10001g c10001g = (C10001g) m33455B();
        return (c10001g == null || (interfaceC10324h = c10001g.f38067t) == null || (abstractC10649gInvoke = interfaceC10324h.invoke(c10163f)) == null) ? this.f38067t.invoke(c10163f) : abstractC10649gInvoke;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: l */
    protected Set<C10163f> mo33404l(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        return C10824x0.m38925l(this.f38065r.invoke(), this.f38066s.invoke().keySet());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10739y0> collection, C10163f c10163f) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(c10163f, "name");
        if (this.f38062o.mo33602t() && m33462y().invoke().mo33300b(c10163f) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC10739y0) it.next()).mo37028f().isEmpty()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                InterfaceC10046w interfaceC10046wMo33300b = m33462y().invoke().mo33300b(c10163f);
                C9801m.m32343c(interfaceC10046wMo33300b);
                collection.add(m33358H0(interfaceC10046wMo33300b));
            }
        }
        m33461w().m33282a().m33263w().mo36094b(mo33398C(), c10163f, collection);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo33408r(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0> r11, kotlin.reflect.p371y.internal.p374j0.p397f.C10163f r12) {
        /*
            r10 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C9801m.m32346f(r11, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C9801m.m32346f(r12, r0)
            java.util.Set r6 = r10.m33396x0(r12)
            kotlin.f0.y.e.j0.d.a.h0$a r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9959h0.f37865a
            boolean r0 = r0.m33134k(r12)
            r7 = 1
            if (r0 != 0) goto L69
            kotlin.f0.y.e.j0.d.a.f r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9954f.f37848n
            boolean r0 = r0.m33089l(r12)
            if (r0 != 0) goto L69
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L2c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            goto L43
        L2c:
            java.util.Iterator r0 = r6.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y) r2
            boolean r2 = r2.isSuspend()
            if (r2 == 0) goto L30
            r0 = 0
        L43:
            if (r0 == 0) goto L69
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r6.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0) r4
            boolean r4 = r10.m33353B0(r4)
            if (r4 == 0) goto L4e
            r0.add(r3)
            goto L4e
        L65:
            r10.m33371V(r11, r12, r0, r1)
            return
        L69:
            kotlin.reflect.jvm.internal.impl.utils.f$b r0 = kotlin.reflect.jvm.internal.impl.utils.C10772f.f41432f
            kotlin.reflect.jvm.internal.impl.utils.f r8 = r0.m38544a()
            java.util.List r2 = kotlin.collections.C10813s.m38848j()
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = r10.mo33398C()
            kotlin.f0.y.e.j0.j.b.r r4 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r.f39954a
            kotlin.f0.y.e.j0.d.a.l0.g r0 = r10.m33461w()
            kotlin.f0.y.e.j0.d.a.l0.b r0 = r0.m33282a()
            kotlin.f0.y.e.j0.l.t1.l r0 = r0.m33251k()
            kotlin.f0.y.e.j0.i.j r5 = r0.mo36948a()
            r0 = r12
            r1 = r6
            java.util.Collection r9 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9963a.m33151d(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "resolveOverridesForNonSt….overridingUtil\n        )"
            kotlin.jvm.internal.C9801m.m32345e(r9, r0)
            kotlin.f0.y.e.j0.d.a.l0.l.g$b r5 = new kotlin.f0.y.e.j0.d.a.l0.l.g$b
            r5.<init>(r10)
            r0 = r10
            r1 = r12
            r2 = r11
            r3 = r9
            r4 = r11
            r0.m33372W(r1, r2, r3, r4, r5)
            kotlin.f0.y.e.j0.d.a.l0.l.g$c r5 = new kotlin.f0.y.e.j0.d.a.l0.l.g$c
            r5.<init>(r10)
            r4 = r8
            r0.m33372W(r1, r2, r3, r4, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        Lb3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r1.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0) r3
            boolean r3 = r10.m33353B0(r3)
            if (r3 == 0) goto Lb3
            r0.add(r2)
            goto Lb3
        Lca:
            java.util.List r0 = kotlin.collections.C10813s.m38859o0(r0, r8)
            r10.m33371V(r11, r12, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10001g.mo33408r(java.util.Collection, kotlin.f0.y.e.j0.f.f):void");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: s */
    protected void mo33409s(C10163f c10163f, Collection<InterfaceC10729t0> collection) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(collection, "result");
        if (this.f38062o.mo33601r()) {
            m33374Y(c10163f, collection);
        }
        Set<InterfaceC10729t0> setM33397z0 = m33397z0(c10163f);
        if (setM33397z0.isEmpty()) {
            return;
        }
        C10772f.b bVar = C10772f.f41432f;
        C10772f c10772fM38544a = bVar.m38544a();
        C10772f c10772fM38544a2 = bVar.m38544a();
        m33373X(setM33397z0, collection, c10772fM38544a, new d());
        m33373X(C10824x0.m38923j(setM33397z0, c10772fM38544a), c10772fM38544a2, null, new e());
        Collection<? extends InterfaceC10729t0> collectionM33151d = C9963a.m33151d(c10163f, C10824x0.m38925l(setM33397z0, c10772fM38544a2), collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9801m.m32345e(collectionM33151d, "resolveOverridesForNonSt…rridingUtil\n            )");
        collection.addAll(collectionM33151d);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: t */
    protected Set<C10163f> mo33410t(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        if (this.f38062o.mo33601r()) {
            return mo33312b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m33462y().invoke().mo33303e());
        Collection<AbstractC10344e0> collectionMo35998a = mo33398C().mo32877h().mo35998a();
        C9801m.m32345e(collectionMo35998a, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = collectionMo35998a.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(linkedHashSet, ((AbstractC10344e0) it.next()).mo33553q().mo33314d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    public String toString() {
        return "Lazy Java member scope for " + this.f38062o.mo33596d();
    }

    /* renamed from: w0 */
    public final InterfaceC10325i<List<InterfaceC10582d>> m33411w0() {
        return this.f38064q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10585e mo33398C() {
        return this.f38061n;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: z */
    protected InterfaceC10735w0 mo33413z() {
        return C10187d.m35824l(mo33398C());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10001g(C9990g c9990g, InterfaceC10585e interfaceC10585e, InterfaceC10030g interfaceC10030g, boolean z, C10001g c10001g) {
        super(c9990g, c10001g);
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10585e, "ownerDescriptor");
        C9801m.m32346f(interfaceC10030g, "jClass");
        this.f38061n = interfaceC10585e;
        this.f38062o = interfaceC10030g;
        this.f38063p = z;
        this.f38064q = c9990g.m33286e().mo36516d(new f(c9990g));
        this.f38065r = c9990g.m33286e().mo36516d(new i());
        this.f38066s = c9990g.m33286e().mo36516d(new g());
        this.f38067t = c9990g.m33286e().mo36521i(new j(c9990g));
    }
}
