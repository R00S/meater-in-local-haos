package kotlin.reflect.p371y.internal.p374j0.p400i.p405t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10740z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.utils.C10768b;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10413x;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10397h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10405p;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;

/* compiled from: DescriptorUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.t.a */
/* loaded from: classes3.dex */
public final class C10235a {

    /* renamed from: a */
    private static final C10163f f39590a;

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$a */
    static final class a<N> implements C10768b.c {

        /* renamed from: a */
        public static final a<N> f39591a = new a<>();

        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10599i1> mo32992a(InterfaceC10599i1 interfaceC10599i1) {
            Collection<InterfaceC10599i1> collectionMo37027e = interfaceC10599i1.mo37027e();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo37027e, 10));
            Iterator<T> it = collectionMo37027e.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10599i1) it.next()).mo37019a());
            }
            return arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$b */
    /* synthetic */ class b extends C9793i implements Function1<InterfaceC10599i1, Boolean> {

        /* renamed from: h */
        public static final b f39592h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(InterfaceC10599i1.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10599i1 interfaceC10599i1) {
            C9801m.m32346f(interfaceC10599i1, "p0");
            return Boolean.valueOf(interfaceC10599i1.mo37698u0());
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$c */
    static final class c<N> implements C10768b.c {

        /* renamed from: a */
        final /* synthetic */ boolean f39593a;

        c(boolean z) {
            this.f39593a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10576b> mo32992a(InterfaceC10576b interfaceC10576b) {
            if (this.f39593a) {
                interfaceC10576b = interfaceC10576b != null ? interfaceC10576b.mo37019a() : null;
            }
            Collection<? extends InterfaceC10576b> collectionMo37027e = interfaceC10576b != null ? interfaceC10576b.mo37027e() : null;
            return collectionMo37027e == null ? C10817u.m38888j() : collectionMo37027e;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$d */
    public static final class d extends C10768b.b<InterfaceC10576b, InterfaceC10576b> {

        /* renamed from: a */
        final /* synthetic */ C9788f0<InterfaceC10576b> f39594a;

        /* renamed from: b */
        final /* synthetic */ Function1<InterfaceC10576b, Boolean> f39595b;

        /* JADX WARN: Multi-variable type inference failed */
        d(C9788f0<InterfaceC10576b> c9788f0, Function1<? super InterfaceC10576b, Boolean> function1) {
            this.f39594a = c9788f0;
            this.f39595b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.b, kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo36088b(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "current");
            if (this.f39594a.f37179f == null && this.f39595b.invoke(interfaceC10576b).booleanValue()) {
                this.f39594a.f37179f = interfaceC10576b;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo32995c(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "current");
            return this.f39594a.f37179f == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC10576b mo32994a() {
            return this.f39594a.f37179f;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$e */
    static final class e extends Lambda implements Function1<InterfaceC10609m, InterfaceC10609m> {

        /* renamed from: f */
        public static final e f39596f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10609m invoke(InterfaceC10609m interfaceC10609m) {
            C9801m.m32346f(interfaceC10609m, "it");
            return interfaceC10609m.mo32876b();
        }
    }

    static {
        C10163f c10163fM35454x = C10163f.m35454x("value");
        C9801m.m32345e(c10163fM35454x, "identifier(\"value\")");
        f39590a = c10163fM35454x;
    }

    /* renamed from: a */
    public static final boolean m36067a(InterfaceC10599i1 interfaceC10599i1) {
        C9801m.m32346f(interfaceC10599i1, "<this>");
        Boolean boolM38519e = C10768b.m38519e(C10815t.m38883e(interfaceC10599i1), a.f39591a, b.f39592h);
        C9801m.m32345e(boolM38519e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolM38519e.booleanValue();
    }

    /* renamed from: b */
    public static final InterfaceC10576b m36068b(InterfaceC10576b interfaceC10576b, boolean z, Function1<? super InterfaceC10576b, Boolean> function1) {
        C9801m.m32346f(interfaceC10576b, "<this>");
        C9801m.m32346f(function1, "predicate");
        return (InterfaceC10576b) C10768b.m38516b(C10815t.m38883e(interfaceC10576b), new c(z), new d(new C9788f0(), function1));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10576b m36069c(InterfaceC10576b interfaceC10576b, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36068b(interfaceC10576b, z, function1);
    }

    /* renamed from: d */
    public static final C10160c m36070d(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        C10161d c10161dM36075i = m36075i(interfaceC10609m);
        if (!c10161dM36075i.m35435f()) {
            c10161dM36075i = null;
        }
        if (c10161dM36075i != null) {
            return c10161dM36075i.m35441l();
        }
        return null;
    }

    /* renamed from: e */
    public static final InterfaceC10585e m36071e(InterfaceC10616c interfaceC10616c) {
        C9801m.m32346f(interfaceC10616c, "<this>");
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10616c.getType().mo35993O0().mo32891w();
        if (interfaceC10594hMo32887c instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo32887c;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC9914h m36072f(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return m36078l(interfaceC10609m).mo37021o();
    }

    /* renamed from: g */
    public static final C10159b m36073g(InterfaceC10594h interfaceC10594h) {
        InterfaceC10609m interfaceC10609mMo32876b;
        C10159b c10159bM36073g;
        if (interfaceC10594h == null || (interfaceC10609mMo32876b = interfaceC10594h.mo32876b()) == null) {
            return null;
        }
        if (interfaceC10609mMo32876b instanceof InterfaceC10604k0) {
            return new C10159b(((InterfaceC10604k0) interfaceC10609mMo32876b).mo37712d(), interfaceC10594h.getName());
        }
        if (!(interfaceC10609mMo32876b instanceof InterfaceC10597i) || (c10159bM36073g = m36073g((InterfaceC10594h) interfaceC10609mMo32876b)) == null) {
            return null;
        }
        return c10159bM36073g.m35411d(interfaceC10594h.getName());
    }

    /* renamed from: h */
    public static final C10160c m36074h(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        C10160c c10160cM35826n = C10187d.m35826n(interfaceC10609m);
        C9801m.m32345e(c10160cM35826n, "getFqNameSafe(this)");
        return c10160cM35826n;
    }

    /* renamed from: i */
    public static final C10161d m36075i(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        C10161d c10161dM35825m = C10187d.m35825m(interfaceC10609m);
        C9801m.m32345e(c10161dM35825m, "getFqName(this)");
        return c10161dM35825m;
    }

    /* renamed from: j */
    public static final C10740z<AbstractC10368m0> m36076j(InterfaceC10585e interfaceC10585e) {
        AbstractC10593g1<AbstractC10368m0> abstractC10593g1Mo32886z0 = interfaceC10585e != null ? interfaceC10585e.mo32886z0() : null;
        if (abstractC10593g1Mo32886z0 instanceof C10740z) {
            return (C10740z) abstractC10593g1Mo32886z0;
        }
        return null;
    }

    /* renamed from: k */
    public static final AbstractC10396g m36077k(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C10405p c10405p = (C10405p) interfaceC10592g0.mo37016I0(C10397h.m36932a());
        AbstractC10413x abstractC10413x = c10405p != null ? (AbstractC10413x) c10405p.m36956a() : null;
        return abstractC10413x instanceof AbstractC10413x.a ? ((AbstractC10413x.a) abstractC10413x).m36978b() : AbstractC10396g.a.f40183a;
    }

    /* renamed from: l */
    public static final InterfaceC10592g0 m36078l(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        InterfaceC10592g0 interfaceC10592g0M35819g = C10187d.m35819g(interfaceC10609m);
        C9801m.m32345e(interfaceC10592g0M35819g, "getContainingModule(this)");
        return interfaceC10592g0M35819g;
    }

    /* renamed from: m */
    public static final Sequence<InterfaceC10609m> m36079m(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return C10522n.m37381k(m36080n(interfaceC10609m), 1);
    }

    /* renamed from: n */
    public static final Sequence<InterfaceC10609m> m36080n(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return C10520l.m37373f(interfaceC10609m, e.f39596f);
    }

    /* renamed from: o */
    public static final InterfaceC10576b m36081o(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "<this>");
        if (!(interfaceC10576b instanceof InterfaceC10727s0)) {
            return interfaceC10576b;
        }
        InterfaceC10729t0 interfaceC10729t0Mo37763B0 = ((InterfaceC10727s0) interfaceC10576b).mo37763B0();
        C9801m.m32345e(interfaceC10729t0Mo37763B0, "correspondingProperty");
        return interfaceC10729t0Mo37763B0;
    }

    /* renamed from: p */
    public static final InterfaceC10585e m36082p(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "<this>");
        for (AbstractC10344e0 abstractC10344e0 : interfaceC10585e.mo36400s().mo35993O0().mo35998a()) {
            if (!AbstractC9914h.m32736b0(abstractC10344e0)) {
                InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w();
                if (C10187d.m35835w(interfaceC10594hMo32887c)) {
                    C9801m.m32344d(interfaceC10594hMo32887c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC10585e) interfaceC10594hMo32887c;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final boolean m36083q(InterfaceC10592g0 interfaceC10592g0) {
        AbstractC10413x abstractC10413x;
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C10405p c10405p = (C10405p) interfaceC10592g0.mo37016I0(C10397h.m36932a());
        return (c10405p == null || (abstractC10413x = (AbstractC10413x) c10405p.m36956a()) == null || !abstractC10413x.m36977a()) ? false : true;
    }

    /* renamed from: r */
    public static final InterfaceC10585e m36084r(InterfaceC10592g0 interfaceC10592g0, C10160c c10160c, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C9801m.m32346f(c10160c, "topLevelClassFqName");
        C9801m.m32346f(interfaceC9939b, "location");
        c10160c.m35422d();
        C10160c c10160cM35423e = c10160c.m35423e();
        C9801m.m32345e(c10160cM35423e, "topLevelClassFqName.parent()");
        InterfaceC10251h interfaceC10251hMo37751q = interfaceC10592g0.mo37018N(c10160cM35423e).mo37751q();
        C10163f c10163fM35425g = c10160c.m35425g();
        C9801m.m32345e(c10163fM35425g, "topLevelClassFqName.shortName()");
        InterfaceC10594h interfaceC10594hMo33316f = interfaceC10251hMo37751q.mo33316f(c10163fM35425g, interfaceC9939b);
        if (interfaceC10594hMo33316f instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo33316f;
        }
        return null;
    }
}
