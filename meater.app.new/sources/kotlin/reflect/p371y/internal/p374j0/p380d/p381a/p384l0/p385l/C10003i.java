package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10770d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC10026d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;

/* compiled from: LazyJavaPackageScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i */
/* loaded from: classes2.dex */
public final class C10003i extends AbstractC10006l {

    /* renamed from: n */
    private final InterfaceC10044u f38092n;

    /* renamed from: o */
    private final C10002h f38093o;

    /* renamed from: p */
    private final InterfaceC10326j<Set<String>> f38094p;

    /* renamed from: q */
    private final InterfaceC10324h<a, InterfaceC10585e> f38095q;

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$a */
    private static final class a {

        /* renamed from: a */
        private final C10163f f38096a;

        /* renamed from: b */
        private final InterfaceC10030g f38097b;

        public a(C10163f c10163f, InterfaceC10030g interfaceC10030g) {
            C9801m.m32346f(c10163f, "name");
            this.f38096a = c10163f;
            this.f38097b = interfaceC10030g;
        }

        /* renamed from: a */
        public final InterfaceC10030g m33438a() {
            return this.f38097b;
        }

        /* renamed from: b */
        public final C10163f m33439b() {
            return this.f38096a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C9801m.m32341a(this.f38096a, ((a) obj).f38096a);
        }

        public int hashCode() {
            return this.f38096a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final InterfaceC10585e f38098a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC10585e interfaceC10585e) {
                super(null);
                C9801m.m32346f(interfaceC10585e, "descriptor");
                this.f38098a = interfaceC10585e;
            }

            /* renamed from: a */
            public final InterfaceC10585e m33440a() {
                return this.f38098a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$b, reason: collision with other inner class name */
        public static final class C11545b extends b {

            /* renamed from: a */
            public static final C11545b f38099a = new C11545b();

            private C11545b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$c */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f38100a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$c */
    static final class c extends Lambda implements Function1<a, InterfaceC10585e> {

        /* renamed from: g */
        final /* synthetic */ C9990g f38102g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C9990g c9990g) {
            super(1);
            this.f38102g = c9990g;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e invoke(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10003i.a r17) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10003i.c.invoke(kotlin.f0.y.e.j0.d.a.l0.l.i$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$d */
    static final class d extends Lambda implements Function0<Set<? extends String>> {

        /* renamed from: f */
        final /* synthetic */ C9990g f38103f;

        /* renamed from: g */
        final /* synthetic */ C10003i f38104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C9990g c9990g, C10003i c10003i) {
            super(0);
            this.f38103f = c9990g;
            this.f38104g = c10003i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<String> invoke() {
            return this.f38103f.m33282a().m33244d().mo33630b(this.f38104g.mo33398C().mo37712d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10003i(C9990g c9990g, InterfaceC10044u interfaceC10044u, C10002h c10002h) {
        super(c9990g);
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10044u, "jPackage");
        C9801m.m32346f(c10002h, "ownerDescriptor");
        this.f38092n = interfaceC10044u;
        this.f38093o = c10002h;
        this.f38094p = c9990g.m33286e().mo36518f(new d(c9990g, this));
        this.f38095q = c9990g.m33286e().mo36521i(new c(c9990g));
    }

    /* renamed from: N */
    private final InterfaceC10585e m33433N(C10163f c10163f, InterfaceC10030g interfaceC10030g) {
        if (!C10165h.f39265a.m35461a(c10163f)) {
            return null;
        }
        Set<String> setInvoke = this.f38094p.invoke();
        if (interfaceC10030g != null || setInvoke == null || setInvoke.contains(c10163f.m35455k())) {
            return this.f38095q.invoke(new a(c10163f, interfaceC10030g));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final b m33434R(InterfaceC10101q interfaceC10101q) {
        if (interfaceC10101q == null) {
            return b.C11545b.f38099a;
        }
        if (interfaceC10101q.mo34025a().m33913c() != C10086a.a.CLASS) {
            return b.c.f38100a;
        }
        InterfaceC10585e interfaceC10585eM33973k = m33461w().m33282a().m33242b().m33973k(interfaceC10101q);
        return interfaceC10585eM33973k != null ? new b.a(interfaceC10585eM33973k) : b.C11545b.f38099a;
    }

    /* renamed from: O */
    public final InterfaceC10585e m33435O(InterfaceC10030g interfaceC10030g) {
        C9801m.m32346f(interfaceC10030g, "javaClass");
        return m33433N(interfaceC10030g.getName(), interfaceC10030g);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC10585e mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return m33433N(c10163f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C10002h mo33398C() {
        return this.f38093o;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10817u.m38888j();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m> mo33317g(kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.p371y.internal.p374j0.p397f.C10163f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C9801m.m32346f(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C9801m.m32346f(r6, r0)
            kotlin.f0.y.e.j0.i.w.d$a r0 = kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d.f39630a
            int r1 = r0.m36144c()
            int r0 = r0.m36146e()
            r0 = r0 | r1
            boolean r5 = r5.m36137a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.C10813s.m38848j()
            goto L65
        L20:
            kotlin.f0.y.e.j0.k.i r5 = r4.m33460v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
            if (r3 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e) r2
            kotlin.f0.y.e.j0.f.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.C9801m.m32345e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10003i.mo33317g(kotlin.f0.y.e.j0.i.w.d, kotlin.a0.c.l):java.util.Collection");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: l */
    protected Set<C10163f> mo33404l(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        if (!c10247d.m36137a(C10247d.f39630a.m36146e())) {
            return C10822w0.m38917d();
        }
        Set<String> setInvoke = this.f38094p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(C10163f.m35454x((String) it.next()));
            }
            return hashSet;
        }
        InterfaceC10044u interfaceC10044u = this.f38092n;
        if (function1 == null) {
            function1 = C10770d.m38525a();
        }
        Collection<InterfaceC10030g> collectionMo33626q = interfaceC10044u.mo33626q(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10030g interfaceC10030g : collectionMo33626q) {
            C10163f name = interfaceC10030g.mo33591I() == EnumC10026d0.SOURCE ? null : interfaceC10030g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: n */
    protected Set<C10163f> mo33405n(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: p */
    protected InterfaceC9996b mo33407p() {
        return InterfaceC9996b.a.f38018a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: r */
    protected void mo33408r(Collection<InterfaceC10739y0> collection, C10163f c10163f) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(c10163f, "name");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: t */
    protected Set<C10163f> mo33410t(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        return C10822w0.m38917d();
    }
}
