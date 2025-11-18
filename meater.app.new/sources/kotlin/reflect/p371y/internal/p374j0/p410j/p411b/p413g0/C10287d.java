package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10824x0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10590f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10595h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10732v;
import kotlin.reflect.jvm.internal.impl.descriptors.C10737x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10740z;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10648f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10663n;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9937a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10128g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10139r;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10144w;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10154f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10184a;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10255l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10259b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10269a0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10271b0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10275d0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10303m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10313w;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10314x;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import okhttp3.HttpUrl;

/* compiled from: DeserializedClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.d */
/* loaded from: classes3.dex */
public final class C10287d extends AbstractC10637a implements InterfaceC10609m {

    /* renamed from: A */
    private final InterfaceC10325i<Collection<InterfaceC10585e>> f39769A;

    /* renamed from: B */
    private final InterfaceC10326j<AbstractC10593g1<AbstractC10368m0>> f39770B;

    /* renamed from: C */
    private final AbstractC10316z.a f39771C;

    /* renamed from: D */
    private final InterfaceC10620g f39772D;

    /* renamed from: k */
    private final C10124c f39773k;

    /* renamed from: l */
    private final AbstractC10149a f39774l;

    /* renamed from: m */
    private final InterfaceC10741z0 f39775m;

    /* renamed from: n */
    private final C10159b f39776n;

    /* renamed from: o */
    private final EnumC10583d0 f39777o;

    /* renamed from: p */
    private final AbstractC10730u f39778p;

    /* renamed from: q */
    private final EnumC10588f f39779q;

    /* renamed from: r */
    private final C10303m f39780r;

    /* renamed from: s */
    private final AbstractC10252i f39781s;

    /* renamed from: t */
    private final b f39782t;

    /* renamed from: u */
    private final C10737x0<a> f39783u;

    /* renamed from: v */
    private final c f39784v;

    /* renamed from: w */
    private final InterfaceC10609m f39785w;

    /* renamed from: x */
    private final InterfaceC10326j<InterfaceC10582d> f39786x;

    /* renamed from: y */
    private final InterfaceC10325i<Collection<InterfaceC10582d>> f39787y;

    /* renamed from: z */
    private final InterfaceC10326j<InterfaceC10585e> f39788z;

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a */
    private final class a extends AbstractC10291h {

        /* renamed from: g */
        private final AbstractC10396g f39789g;

        /* renamed from: h */
        private final InterfaceC10325i<Collection<InterfaceC10609m>> f39790h;

        /* renamed from: i */
        private final InterfaceC10325i<Collection<AbstractC10344e0>> f39791i;

        /* renamed from: j */
        final /* synthetic */ C10287d f39792j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$a, reason: collision with other inner class name */
        static final class C11564a extends Lambda implements Function0<List<? extends C10163f>> {

            /* renamed from: f */
            final /* synthetic */ List<C10163f> f39793f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11564a(List<C10163f> list) {
                super(0);
                this.f39793f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C10163f> invoke() {
                return this.f39793f;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$b */
        static final class b extends Lambda implements Function0<Collection<? extends InterfaceC10609m>> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10609m> invoke() {
                return a.this.m36324j(C10247d.f39642m, InterfaceC10251h.f39667a.m36159a(), EnumC9941d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$c */
        public static final class c extends AbstractC10191h {

            /* renamed from: a */
            final /* synthetic */ List<D> f39795a;

            c(List<D> list) {
                this.f39795a = list;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10192i
            /* renamed from: a */
            public void mo33154a(InterfaceC10576b interfaceC10576b) {
                C9801m.m32346f(interfaceC10576b, "fakeOverride");
                C10193j.m35856K(interfaceC10576b, null);
                this.f39795a.add(interfaceC10576b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h
            /* renamed from: e */
            protected void mo33156e(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2) {
                C9801m.m32346f(interfaceC10576b, "fromSuper");
                C9801m.m32346f(interfaceC10576b2, "fromCurrent");
                if (interfaceC10576b2 instanceof AbstractC10666p) {
                    ((AbstractC10666p) interfaceC10576b2).m37921V0(C10732v.f41233a, interfaceC10576b);
                }
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$d */
        static final class d extends Lambda implements Function0<Collection<? extends AbstractC10344e0>> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<AbstractC10344e0> invoke() {
                return a.this.f39789g.mo36929g(a.this.m36289B());
            }
        }

        public a(C10287d c10287d, AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            this.f39792j = c10287d;
            C10303m c10303mM36282b1 = c10287d.m36282b1();
            List<C10130i> listM34442I0 = c10287d.m36283c1().m34442I0();
            C9801m.m32345e(listM34442I0, "classProto.functionList");
            List<C10135n> listM34456W0 = c10287d.m36283c1().m34456W0();
            C9801m.m32345e(listM34456W0, "classProto.propertyList");
            List<C10139r> listM34465e1 = c10287d.m36283c1().m34465e1();
            C9801m.m32345e(listM34465e1, "classProto.typeAliasList");
            List<Integer> listM34453T0 = c10287d.m36283c1().m34453T0();
            C9801m.m32345e(listM34453T0, "classProto.nestedClassNameList");
            InterfaceC10151c interfaceC10151cM36456g = c10287d.m36282b1().m36456g();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34453T0, 10));
            Iterator<T> it = listM34453T0.iterator();
            while (it.hasNext()) {
                arrayList.add(C10314x.m36495b(interfaceC10151cM36456g, ((Number) it.next()).intValue()));
            }
            super(c10303mM36282b1, listM34442I0, listM34456W0, listM34465e1, new C11564a(arrayList));
            this.f39789g = abstractC10396g;
            this.f39790h = m36325p().m36457h().mo36516d(new b());
            this.f39791i = m36325p().m36457h().mo36516d(new d());
        }

        /* renamed from: A */
        private final <D extends InterfaceC10576b> void m36288A(C10163f c10163f, Collection<? extends D> collection, List<D> list) {
            m36325p().m36452c().m36428m().mo36948a().m35886v(c10163f, collection, new ArrayList(list), m36289B(), new c(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final C10287d m36289B() {
            return this.f39792j;
        }

        /* renamed from: C */
        public void m36292C(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            C9937a.m33013a(m36325p().m36452c().m36430o(), interfaceC9939b, m36289B(), c10163f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: a */
        public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            m36292C(c10163f, interfaceC9939b);
            return super.mo33311a(c10163f, interfaceC9939b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: c */
        public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            m36292C(c10163f, interfaceC9939b);
            return super.mo33313c(c10163f, interfaceC9939b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
        /* renamed from: f */
        public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            InterfaceC10585e interfaceC10585eM36309f;
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            m36292C(c10163f, interfaceC9939b);
            c cVar = m36289B().f39784v;
            return (cVar == null || (interfaceC10585eM36309f = cVar.m36309f(c10163f)) == null) ? super.mo33316f(c10163f, interfaceC9939b) : interfaceC10585eM36309f;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
        /* renamed from: g */
        public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
            C9801m.m32346f(c10247d, "kindFilter");
            C9801m.m32346f(function1, "nameFilter");
            return this.f39790h.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: i */
        protected void mo36293i(Collection<InterfaceC10609m> collection, Function1<? super C10163f, Boolean> function1) {
            C9801m.m32346f(collection, "result");
            C9801m.m32346f(function1, "nameFilter");
            c cVar = m36289B().f39784v;
            Collection<InterfaceC10585e> collectionM36308d = cVar != null ? cVar.m36308d() : null;
            if (collectionM36308d == null) {
                collectionM36308d = C10817u.m38888j();
            }
            collection.addAll(collectionM36308d);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: k */
        protected void mo36294k(C10163f c10163f, List<InterfaceC10739y0> list) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(list, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10344e0> it = this.f39791i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo33553q().mo33311a(c10163f, EnumC9941d.FOR_ALREADY_TRACKED));
            }
            list.addAll(m36325p().m36452c().m36418c().mo32980b(c10163f, this.f39792j));
            m36288A(c10163f, arrayList, list);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: l */
        protected void mo36295l(C10163f c10163f, List<InterfaceC10729t0> list) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10344e0> it = this.f39791i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo33553q().mo33313c(c10163f, EnumC9941d.FOR_ALREADY_TRACKED));
            }
            m36288A(c10163f, arrayList, list);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: m */
        protected C10159b mo36296m(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            C10159b c10159bM35411d = this.f39792j.f39776n.m35411d(c10163f);
            C9801m.m32345e(c10159bM35411d, "classId.createNestedClassId(name)");
            return c10159bM35411d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: s */
        protected Set<C10163f> mo36297s() {
            List<AbstractC10344e0> listMo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo35998a.iterator();
            while (it.hasNext()) {
                Set<C10163f> setMo33315e = ((AbstractC10344e0) it.next()).mo33553q().mo33315e();
                if (setMo33315e == null) {
                    return null;
                }
                C10827z.m38933z(linkedHashSet, setMo33315e);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: t */
        protected Set<C10163f> mo36298t() {
            List<AbstractC10344e0> listMo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo35998a.iterator();
            while (it.hasNext()) {
                C10827z.m38933z(linkedHashSet, ((AbstractC10344e0) it.next()).mo33553q().mo33312b());
            }
            linkedHashSet.addAll(m36325p().m36452c().m36418c().mo32983e(this.f39792j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: u */
        protected Set<C10163f> mo36299u() {
            List<AbstractC10344e0> listMo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo35998a.iterator();
            while (it.hasNext()) {
                C10827z.m38933z(linkedHashSet, ((AbstractC10344e0) it.next()).mo33553q().mo33314d());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
        /* renamed from: x */
        protected boolean mo36300x(InterfaceC10739y0 interfaceC10739y0) {
            C9801m.m32346f(interfaceC10739y0, "function");
            return m36325p().m36452c().m36434s().mo32981c(this.f39792j, interfaceC10739y0);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$b */
    private final class b extends AbstractC10334b {

        /* renamed from: d */
        private final InterfaceC10325i<List<InterfaceC10587e1>> f39797d;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10587e1>> {

            /* renamed from: f */
            final /* synthetic */ C10287d f39799f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10287d c10287d) {
                super(0);
                this.f39799f = c10287d;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10587e1> invoke() {
                return C10590f1.m37685d(this.f39799f);
            }
        }

        public b() {
            super(C10287d.this.m36282b1().m36457h());
            this.f39797d = C10287d.this.m36282b1().m36457h().mo36516d(new a(C10287d.this));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            return this.f39797d.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: l */
        protected Collection<AbstractC10344e0> mo32889l() {
            String strM35455k;
            C10160c c10160cM35409b;
            List<C10138q> listM35393l = C10154f.m35393l(C10287d.this.m36283c1(), C10287d.this.m36282b1().m36459j());
            C10287d c10287d = C10287d.this;
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM35393l, 10));
            Iterator<T> it = listM35393l.iterator();
            while (it.hasNext()) {
                arrayList.add(c10287d.m36282b1().m36458i().m36231q((C10138q) it.next()));
            }
            List listM38609o0 = C10782c0.m38609o0(arrayList, C10287d.this.m36282b1().m36452c().m36418c().mo32982d(C10287d.this));
            ArrayList<C10601j0.b> arrayList2 = new ArrayList();
            Iterator it2 = listM38609o0.iterator();
            while (it2.hasNext()) {
                InterfaceC10594h interfaceC10594hMo32891w = ((AbstractC10344e0) it2.next()).mo35993O0().mo32891w();
                C10601j0.b bVar = interfaceC10594hMo32891w instanceof C10601j0.b ? (C10601j0.b) interfaceC10594hMo32891w : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC10308r interfaceC10308rM36424i = C10287d.this.m36282b1().m36452c().m36424i();
                C10287d c10287d2 = C10287d.this;
                ArrayList arrayList3 = new ArrayList(C10819v.m38911u(arrayList2, 10));
                for (C10601j0.b bVar2 : arrayList2) {
                    C10159b c10159bM36073g = C10235a.m36073g(bVar2);
                    if (c10159bM36073g == null || (c10160cM35409b = c10159bM36073g.m35409b()) == null || (strM35455k = c10160cM35409b.m35420b()) == null) {
                        strM35455k = bVar2.getName().m35455k();
                    }
                    arrayList3.add(strM35455k);
                }
                interfaceC10308rM36424i.mo36471b(c10287d2, arrayList3);
            }
            return C10782c0.m38569E0(listM38609o0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: q */
        protected InterfaceC10581c1 mo32890q() {
            return InterfaceC10581c1.a.f40737a;
        }

        public String toString() {
            String string = C10287d.this.getName().toString();
            C9801m.m32345e(string, "name.toString()");
            return string;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b
        /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C10287d mo32891w() {
            return C10287d.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c */
    private final class c {

        /* renamed from: a */
        private final Map<C10163f, C10128g> f39800a;

        /* renamed from: b */
        private final InterfaceC10324h<C10163f, InterfaceC10585e> f39801b;

        /* renamed from: c */
        private final InterfaceC10325i<Set<C10163f>> f39802c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$a */
        static final class a extends Lambda implements Function1<C10163f, InterfaceC10585e> {

            /* renamed from: g */
            final /* synthetic */ C10287d f39805g;

            /* compiled from: DeserializedClassDescriptor.kt */
            /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$a$a, reason: collision with other inner class name */
            static final class C11565a extends Lambda implements Function0<List<? extends InterfaceC10616c>> {

                /* renamed from: f */
                final /* synthetic */ C10287d f39806f;

                /* renamed from: g */
                final /* synthetic */ C10128g f39807g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11565a(C10287d c10287d, C10128g c10128g) {
                    super(0);
                    this.f39806f = c10287d;
                    this.f39807g = c10128g;
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends InterfaceC10616c> invoke() {
                    return C10782c0.m38569E0(this.f39806f.m36282b1().m36452c().m36419d().mo33874f(this.f39806f.m36286g1(), this.f39807g));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10287d c10287d) {
                super(1);
                this.f39805g = c10287d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10585e invoke(C10163f c10163f) {
                C9801m.m32346f(c10163f, "name");
                C10128g c10128g = (C10128g) c.this.f39800a.get(c10163f);
                if (c10128g == null) {
                    return null;
                }
                C10287d c10287d = this.f39805g;
                return C10663n.m37894M0(c10287d.m36282b1().m36457h(), c10287d, c10163f, c.this.f39802c, new C10284a(c10287d.m36282b1().m36457h(), new C11565a(c10287d, c10128g)), InterfaceC10741z0.f41247a);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$b */
        static final class b extends Lambda implements Function0<Set<? extends C10163f>> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                return c.this.m36307e();
            }
        }

        public c() {
            List<C10128g> listM34437D0 = C10287d.this.m36283c1().m34437D0();
            C9801m.m32345e(listM34437D0, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(listM34437D0, 10)), 16));
            for (Object obj : listM34437D0) {
                linkedHashMap.put(C10314x.m36495b(C10287d.this.m36282b1().m36456g(), ((C10128g) obj).m34624F()), obj);
            }
            this.f39800a = linkedHashMap;
            this.f39801b = C10287d.this.m36282b1().m36457h().mo36521i(new a(C10287d.this));
            this.f39802c = C10287d.this.m36282b1().m36457h().mo36516d(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final Set<C10163f> m36307e() {
            HashSet hashSet = new HashSet();
            Iterator<AbstractC10344e0> it = C10287d.this.mo32877h().mo35998a().iterator();
            while (it.hasNext()) {
                for (InterfaceC10609m interfaceC10609m : InterfaceC10254k.a.m36162a(it.next().mo33553q(), null, null, 3, null)) {
                    if ((interfaceC10609m instanceof InterfaceC10739y0) || (interfaceC10609m instanceof InterfaceC10729t0)) {
                        hashSet.add(interfaceC10609m.getName());
                    }
                }
            }
            List<C10130i> listM34442I0 = C10287d.this.m36283c1().m34442I0();
            C9801m.m32345e(listM34442I0, "classProto.functionList");
            C10287d c10287d = C10287d.this;
            Iterator<T> it2 = listM34442I0.iterator();
            while (it2.hasNext()) {
                hashSet.add(C10314x.m36495b(c10287d.m36282b1().m36456g(), ((C10130i) it2.next()).m34723e0()));
            }
            List<C10135n> listM34456W0 = C10287d.this.m36283c1().m34456W0();
            C9801m.m32345e(listM34456W0, "classProto.propertyList");
            C10287d c10287d2 = C10287d.this;
            Iterator<T> it3 = listM34456W0.iterator();
            while (it3.hasNext()) {
                hashSet.add(C10314x.m36495b(c10287d2.m36282b1().m36456g(), ((C10135n) it3.next()).m34887d0()));
            }
            return C10824x0.m38925l(hashSet, hashSet);
        }

        /* renamed from: d */
        public final Collection<InterfaceC10585e> m36308d() {
            Set<C10163f> setKeySet = this.f39800a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC10585e interfaceC10585eM36309f = m36309f((C10163f) it.next());
                if (interfaceC10585eM36309f != null) {
                    arrayList.add(interfaceC10585eM36309f);
                }
            }
            return arrayList;
        }

        /* renamed from: f */
        public final InterfaceC10585e m36309f(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            return this.f39801b.invoke(c10163f);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$d */
    static final class d extends Lambda implements Function0<List<? extends InterfaceC10616c>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10616c> invoke() {
            return C10782c0.m38569E0(C10287d.this.m36282b1().m36452c().m36419d().mo33872c(C10287d.this.m36286g1()));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$e */
    static final class e extends Lambda implements Function0<InterfaceC10585e> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10585e invoke() {
            return C10287d.this.m36272T0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$f */
    static final class f extends Lambda implements Function0<Collection<? extends InterfaceC10582d>> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10582d> invoke() {
            return C10287d.this.m36273U0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$g */
    /* synthetic */ class g extends C9793i implements Function1<AbstractC10396g, a> {
        g(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final a invoke(AbstractC10396g abstractC10396g) {
            C9801m.m32346f(abstractC10396g, "p0");
            return new a((C10287d) this.receiver, abstractC10396g);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$h */
    static final class h extends Lambda implements Function0<InterfaceC10582d> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10582d invoke() {
            return C10287d.this.m36276X0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$i */
    static final class i extends Lambda implements Function0<Collection<? extends InterfaceC10585e>> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10585e> invoke() {
            return C10287d.this.m36278Z0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$j */
    static final class j extends Lambda implements Function0<AbstractC10593g1<AbstractC10368m0>> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10593g1<AbstractC10368m0> invoke() {
            return C10287d.this.m36279a1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10287d(C10303m c10303m, C10124c c10124c, InterfaceC10151c interfaceC10151c, AbstractC10149a abstractC10149a, InterfaceC10741z0 interfaceC10741z0) {
        super(c10303m.m36457h(), C10314x.m36494a(interfaceC10151c, c10124c.m34439F0()).m35415j());
        C9801m.m32346f(c10303m, "outerContext");
        C9801m.m32346f(c10124c, "classProto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(interfaceC10741z0, "sourceElement");
        this.f39773k = c10124c;
        this.f39774l = abstractC10149a;
        this.f39775m = interfaceC10741z0;
        this.f39776n = C10314x.m36494a(interfaceC10151c, c10124c.m34439F0());
        C10269a0 c10269a0 = C10269a0.f39714a;
        this.f39777o = c10269a0.m36205b(C10150b.f39208e.mo35368d(c10124c.m34438E0()));
        this.f39778p = C10271b0.m36208a(c10269a0, C10150b.f39207d.mo35368d(c10124c.m34438E0()));
        EnumC10588f enumC10588fM36204a = c10269a0.m36204a(C10150b.f39209f.mo35368d(c10124c.m34438E0()));
        this.f39779q = enumC10588fM36204a;
        List<C10140s> listM34468h1 = c10124c.m34468h1();
        C9801m.m32345e(listM34468h1, "classProto.typeParameterList");
        C10141t c10141tM34469i1 = c10124c.m34469i1();
        C9801m.m32345e(c10141tM34469i1, "classProto.typeTable");
        C10155g c10155g = new C10155g(c10141tM34469i1);
        C10156h.a aVar = C10156h.f39237a;
        C10144w c10144wM34471k1 = c10124c.m34471k1();
        C9801m.m32345e(c10144wM34471k1, "classProto.versionRequirementTable");
        C10303m c10303mM36451a = c10303m.m36451a(this, listM34468h1, interfaceC10151c, c10155g, aVar.m35401a(c10144wM34471k1), abstractC10149a);
        this.f39780r = c10303mM36451a;
        EnumC10588f enumC10588f = EnumC10588f.ENUM_CLASS;
        this.f39781s = enumC10588fM36204a == enumC10588f ? new C10255l(c10303mM36451a.m36457h(), this) : InterfaceC10251h.b.f39671b;
        this.f39782t = new b();
        this.f39783u = C10737x0.f41236a.m38159a(this, c10303mM36451a.m36457h(), c10303mM36451a.m36452c().m36428m().mo36949c(), new g(this));
        this.f39784v = enumC10588fM36204a == enumC10588f ? new c() : null;
        InterfaceC10609m interfaceC10609mM36454e = c10303m.m36454e();
        this.f39785w = interfaceC10609mM36454e;
        this.f39786x = c10303mM36451a.m36457h().mo36518f(new h());
        this.f39787y = c10303mM36451a.m36457h().mo36516d(new f());
        this.f39788z = c10303mM36451a.m36457h().mo36518f(new e());
        this.f39769A = c10303mM36451a.m36457h().mo36516d(new i());
        this.f39770B = c10303mM36451a.m36457h().mo36518f(new j());
        InterfaceC10151c interfaceC10151cM36456g = c10303mM36451a.m36456g();
        C10155g c10155gM36459j = c10303mM36451a.m36459j();
        C10287d c10287d = interfaceC10609mM36454e instanceof C10287d ? (C10287d) interfaceC10609mM36454e : null;
        this.f39771C = new AbstractC10316z.a(c10124c, interfaceC10151cM36456g, c10155gM36459j, interfaceC10741z0, c10287d != null ? c10287d.f39771C : null);
        this.f39772D = !C10150b.f39206c.mo35368d(c10124c.m34438E0()).booleanValue() ? InterfaceC10620g.f40808c.m37735b() : new C10297n(c10303mM36451a.m36457h(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public final InterfaceC10585e m36272T0() {
        if (!this.f39773k.m34472l1()) {
            return null;
        }
        InterfaceC10594h interfaceC10594hMo33316f = m36280d1().mo33316f(C10314x.m36495b(this.f39780r.m36456g(), this.f39773k.m34478r0()), EnumC9941d.FROM_DESERIALIZATION);
        if (interfaceC10594hMo33316f instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo33316f;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final Collection<InterfaceC10582d> m36273U0() {
        return C10782c0.m38609o0(C10782c0.m38609o0(m36277Y0(), C10817u.m38892n(mo32864R())), this.f39780r.m36452c().m36418c().mo32979a(this));
    }

    /* renamed from: V0 */
    private final C10740z<AbstractC10368m0> m36274V0() {
        C10163f name;
        AbstractC10368m0 abstractC10368m0M36223n;
        Object obj = null;
        if (!isInline() && !mo32881l()) {
            return null;
        }
        if (mo32881l() && !this.f39773k.m34475o1() && !this.f39773k.m34476p1() && !this.f39773k.m34477q1() && this.f39773k.m34446M0() > 0) {
            return null;
        }
        if (this.f39773k.m34475o1()) {
            name = C10314x.m36495b(this.f39780r.m36456g(), this.f39773k.m34443J0());
        } else {
            if (this.f39774l.m35360c(1, 5, 1)) {
                throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + this).toString());
            }
            InterfaceC10582d interfaceC10582dMo32864R = mo32864R();
            if (interfaceC10582dMo32864R == null) {
                throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
            }
            List<InterfaceC10599i1> listMo37028f = interfaceC10582dMo32864R.mo37028f();
            C9801m.m32345e(listMo37028f, "constructor.valueParameters");
            name = ((InterfaceC10599i1) C10813s.m38830U(listMo37028f)).getName();
            C9801m.m32345e(name, "{\n                // Bef…irst().name\n            }");
        }
        C10138q c10138qM35387f = C10154f.m35387f(this.f39773k, this.f39780r.m36459j());
        if (c10138qM35387f == null || (abstractC10368m0M36223n = C10275d0.m36223n(this.f39780r.m36458i(), c10138qM35387f, false, 2, null)) == null) {
            Iterator<T> it = m36280d1().mo33313c(name, EnumC9941d.FROM_DESERIALIZATION).iterator();
            Object obj2 = null;
            boolean z = false;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((InterfaceC10729t0) next).mo37032m0() == null) {
                        if (z) {
                            break;
                        }
                        obj2 = next;
                        z = true;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            InterfaceC10729t0 interfaceC10729t0 = (InterfaceC10729t0) obj;
            if (interfaceC10729t0 == null) {
                throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
            }
            AbstractC10344e0 type = interfaceC10729t0.getType();
            C9801m.m32344d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            abstractC10368m0M36223n = (AbstractC10368m0) type;
        }
        return new C10740z<>(name, abstractC10368m0M36223n);
    }

    /* renamed from: W0 */
    private final C10595h0<AbstractC10368m0> m36275W0() {
        List<C10138q> listM34452S0;
        List<Integer> listM34447N0 = this.f39773k.m34447N0();
        C9801m.m32345e(listM34447N0, "classProto.multiFieldValueClassUnderlyingNameList");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34447N0, 10));
        for (Integer num : listM34447N0) {
            InterfaceC10151c interfaceC10151cM36456g = this.f39780r.m36456g();
            C9801m.m32345e(num, "it");
            arrayList.add(C10314x.m36495b(interfaceC10151cM36456g, num.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (!mo32881l()) {
            throw new IllegalArgumentException(("Not a value class: " + this).toString());
        }
        Pair pairM38547a = C10773s.m38547a(Integer.valueOf(this.f39773k.m34450Q0()), Integer.valueOf(this.f39773k.m34449P0()));
        if (C9801m.m32341a(pairM38547a, C10773s.m38547a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listM34451R0 = this.f39773k.m34451R0();
            C9801m.m32345e(listM34451R0, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
            listM34452S0 = new ArrayList<>(C10819v.m38911u(listM34451R0, 10));
            for (Integer num2 : listM34451R0) {
                C10155g c10155gM36459j = this.f39780r.m36459j();
                C9801m.m32345e(num2, "it");
                listM34452S0.add(c10155gM36459j.m35399a(num2.intValue()));
            }
        } else {
            if (!C9801m.m32341a(pairM38547a, C10773s.m38547a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
            }
            listM34452S0 = this.f39773k.m34452S0();
        }
        C9801m.m32345e(listM34452S0, "when (typeIdCount to typ…tation: $this\")\n        }");
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(listM34452S0, 10));
        for (C10138q c10138q : listM34452S0) {
            C10275d0 c10275d0M36458i = this.f39780r.m36458i();
            C9801m.m32345e(c10138q, "it");
            arrayList2.add(C10275d0.m36223n(c10275d0M36458i, c10138q, false, 2, null));
        }
        return new C10595h0<>(C10782c0.m38580L0(arrayList, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final InterfaceC10582d m36276X0() {
        Object next;
        if (this.f39779q.m37681k()) {
            C10647f c10647fM35793k = C10186c.m35793k(this, InterfaceC10741z0.f41247a);
            c10647fM35793k.m37928h1(mo36400s());
            return c10647fM35793k;
        }
        List<C10125d> listM34483u0 = this.f39773k.m34483u0();
        C9801m.m32345e(listM34483u0, "classProto.constructorList");
        Iterator<T> it = listM34483u0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!C10150b.f39216m.mo35368d(((C10125d) next).m34537J()).booleanValue()) {
                break;
            }
        }
        C10125d c10125d = (C10125d) next;
        if (c10125d != null) {
            return this.f39780r.m36455f().m36486i(c10125d, true);
        }
        return null;
    }

    /* renamed from: Y0 */
    private final List<InterfaceC10582d> m36277Y0() {
        List<C10125d> listM34483u0 = this.f39773k.m34483u0();
        C9801m.m32345e(listM34483u0, "classProto.constructorList");
        ArrayList<C10125d> arrayList = new ArrayList();
        for (Object obj : listM34483u0) {
            Boolean boolMo35368d = C10150b.f39216m.mo35368d(((C10125d) obj).m34537J());
            C9801m.m32345e(boolMo35368d, "IS_SECONDARY.get(it.flags)");
            if (boolMo35368d.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
        for (C10125d c10125d : arrayList) {
            C10313w c10313wM36455f = this.f39780r.m36455f();
            C9801m.m32345e(c10125d, "it");
            arrayList2.add(c10313wM36455f.m36486i(c10125d, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public final Collection<InterfaceC10585e> m36278Z0() {
        if (this.f39777o != EnumC10583d0.SEALED) {
            return C10817u.m38888j();
        }
        List<Integer> listM34457X0 = this.f39773k.m34457X0();
        C9801m.m32345e(listM34457X0, "fqNames");
        if (!(!listM34457X0.isEmpty())) {
            return C10184a.f39497a.m35768a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listM34457X0) {
            C10301k c10301kM36452c = this.f39780r.m36452c();
            InterfaceC10151c interfaceC10151cM36456g = this.f39780r.m36456g();
            C9801m.m32345e(num, "index");
            InterfaceC10585e interfaceC10585eM36417b = c10301kM36452c.m36417b(C10314x.m36494a(interfaceC10151cM36456g, num.intValue()));
            if (interfaceC10585eM36417b != null) {
                arrayList.add(interfaceC10585eM36417b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final AbstractC10593g1<AbstractC10368m0> m36279a1() {
        C10740z<AbstractC10368m0> c10740zM36274V0 = m36274V0();
        C10595h0<AbstractC10368m0> c10595h0M36275W0 = m36275W0();
        if (c10740zM36274V0 != null && c10595h0M36275W0 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        }
        if ((!mo32881l() && !isInline()) || c10740zM36274V0 != null || c10595h0M36275W0 != null) {
            return c10740zM36274V0 != null ? c10740zM36274V0 : c10595h0M36275W0;
        }
        throw new IllegalArgumentException("Value class has no value class representation: " + this);
    }

    /* renamed from: d1 */
    private final a m36280d1() {
        return (a) this.f39783u.m38158c(this.f39780r.m36452c().m36428m().mo36949c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: A */
    public boolean mo32857A() {
        return C10150b.f39209f.mo35368d(this.f39773k.m34438E0()) == C10124c.c.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D */
    public boolean mo32858D() {
        Boolean boolMo35368d = C10150b.f39215l.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_FUN_INTERFACE.get(classProto.flags)");
        return boolMo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: F0 */
    public List<InterfaceC10735w0> mo36281F0() {
        List<C10138q> listM34488y0 = this.f39773k.m34488y0();
        C9801m.m32345e(listM34488y0, "classProto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34488y0, 10));
        for (C10138q c10138q : listM34488y0) {
            C10275d0 c10275d0M36458i = this.f39780r.m36458i();
            C9801m.m32345e(c10138q, "it");
            arrayList.add(new C10648f0(mo37677K0(), new C10259b(this, c10275d0M36458i.m36231q(c10138q), null), InterfaceC10620g.f40808c.m37735b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: H */
    protected InterfaceC10251h mo32860H(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this.f39783u.m38158c(abstractC10396g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J */
    public Collection<InterfaceC10585e> mo32861J() {
        return this.f39769A.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        Boolean boolMo35368d = C10150b.f39211h.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_DATA.get(classProto.flags)");
        return boolMo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        Boolean boolMo35368d = C10150b.f39213j.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_EXPECT_CLASS.get(classProto.flags)");
        return boolMo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public InterfaceC10582d mo32864R() {
        return this.f39786x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public InterfaceC10585e mo32869U() {
        return this.f39788z.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        return this.f39785w;
    }

    /* renamed from: b1 */
    public final C10303m m36282b1() {
        return this.f39780r;
    }

    /* renamed from: c1 */
    public final C10124c m36283c1() {
        return this.f39773k;
    }

    /* renamed from: e1 */
    public final AbstractC10149a m36284e1() {
        return this.f39774l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public AbstractC10252i mo32866S() {
        return this.f39781s;
    }

    /* renamed from: g1 */
    public final AbstractC10316z.a m36286g1() {
        return this.f39771C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return this.f39772D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        return this.f39778p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        return this.f39782t;
    }

    /* renamed from: h1 */
    public final boolean m36287h1(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return m36280d1().m36326q().contains(c10163f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        return this.f39779q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        Boolean boolMo35368d = C10150b.f39214k.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolMo35368d.booleanValue() && this.f39774l.m35362e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        return this.f39777o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: k */
    public Collection<InterfaceC10582d> mo32880k() {
        return this.f39787y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        Boolean boolMo35368d = C10150b.f39214k.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolMo35368d.booleanValue() && this.f39774l.m35360c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        Boolean boolMo35368d = C10150b.f39210g.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_INNER.get(classProto.flags)");
        return boolMo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        return this.f39775m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(mo32863M() ? "expect " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        return this.f39780r.m36458i().m36229j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        Boolean boolMo35368d = C10150b.f39212i.mo35368d(this.f39773k.m34438E0());
        C9801m.m32345e(boolMo35368d, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return boolMo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        return this.f39770B.invoke();
    }
}
