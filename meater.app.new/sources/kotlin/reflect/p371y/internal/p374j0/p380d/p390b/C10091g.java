package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10118f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10283g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10310t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10292i;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10288e;

/* compiled from: DeserializedDescriptorResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.g */
/* loaded from: classes3.dex */
public final class C10091g {

    /* renamed from: a */
    public static final a f38445a = new a(null);

    /* renamed from: b */
    private static final Set<C10086a.a> f38446b = C10820v0.m38916c(C10086a.a.CLASS);

    /* renamed from: c */
    private static final Set<C10086a.a> f38447c = C10822w0.m38922i(C10086a.a.FILE_FACADE, C10086a.a.MULTIFILE_CLASS_PART);

    /* renamed from: d */
    private static final C10117e f38448d = new C10117e(1, 1, 2);

    /* renamed from: e */
    private static final C10117e f38449e = new C10117e(1, 1, 11);

    /* renamed from: f */
    private static final C10117e f38450f = new C10117e(1, 1, 13);

    /* renamed from: g */
    public C10301k f38451g;

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10117e m33976a() {
            return C10091g.f38450f;
        }
    }

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.g$b */
    static final class b extends Lambda implements Function0<Collection<? extends C10163f>> {

        /* renamed from: f */
        public static final b f38452f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10163f> invoke() {
            return C10817u.m38888j();
        }
    }

    /* renamed from: c */
    private final EnumC10288e m33964c(InterfaceC10101q interfaceC10101q) {
        return m33971d().m36422g().mo36439b() ? EnumC10288e.STABLE : interfaceC10101q.mo34025a().m33919j() ? EnumC10288e.FIR_UNSTABLE : interfaceC10101q.mo34025a().m33920k() ? EnumC10288e.IR_UNSTABLE : EnumC10288e.STABLE;
    }

    /* renamed from: e */
    private final C10310t<C10117e> m33965e(InterfaceC10101q interfaceC10101q) {
        if (m33966f() || interfaceC10101q.mo34025a().m33914d().m34252h()) {
            return null;
        }
        return new C10310t<>(interfaceC10101q.mo34025a().m33914d(), C10117e.f38595h, interfaceC10101q.getLocation(), interfaceC10101q.mo34028e());
    }

    /* renamed from: f */
    private final boolean m33966f() {
        return m33971d().m36422g().mo36441d();
    }

    /* renamed from: g */
    private final boolean m33967g(InterfaceC10101q interfaceC10101q) {
        return !m33971d().m36422g().mo36440c() && interfaceC10101q.mo34025a().m33918i() && C9801m.m32341a(interfaceC10101q.mo34025a().m33914d(), f38449e);
    }

    /* renamed from: h */
    private final boolean m33968h(InterfaceC10101q interfaceC10101q) {
        return (m33971d().m36422g().mo36442e() && (interfaceC10101q.mo34025a().m33918i() || C9801m.m32341a(interfaceC10101q.mo34025a().m33914d(), f38448d))) || m33967g(interfaceC10101q);
    }

    /* renamed from: j */
    private final String[] m33969j(InterfaceC10101q interfaceC10101q, Set<? extends C10086a.a> set) {
        C10086a c10086aMo34025a = interfaceC10101q.mo34025a();
        String[] strArrM33911a = c10086aMo34025a.m33911a();
        if (strArrM33911a == null) {
            strArrM33911a = c10086aMo34025a.m33912b();
        }
        if (strArrM33911a == null || !set.contains(c10086aMo34025a.m33913c())) {
            return null;
        }
        return strArrM33911a;
    }

    /* renamed from: b */
    public final InterfaceC10251h m33970b(InterfaceC10604k0 interfaceC10604k0, InterfaceC10101q interfaceC10101q) {
        String[] strArrM33917g;
        Pair<C10118f, C10133l> pairM34264m;
        C9801m.m32346f(interfaceC10604k0, "descriptor");
        C9801m.m32346f(interfaceC10101q, "kotlinClass");
        String[] strArrM33969j = m33969j(interfaceC10101q, f38447c);
        if (strArrM33969j == null || (strArrM33917g = interfaceC10101q.mo34025a().m33917g()) == null) {
            return null;
        }
        try {
            try {
                pairM34264m = C10121i.m34264m(strArrM33969j, strArrM33917g);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10101q.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (m33966f() || interfaceC10101q.mo34025a().m33914d().m34252h()) {
                throw th;
            }
            pairM34264m = null;
        }
        if (pairM34264m == null) {
            return null;
        }
        C10118f c10118fM37646a = pairM34264m.m37646a();
        C10133l c10133lM37647b = pairM34264m.m37647b();
        C10095k c10095k = new C10095k(interfaceC10101q, c10133lM37647b, c10118fM37646a, m33965e(interfaceC10101q), m33968h(interfaceC10101q), m33964c(interfaceC10101q));
        return new C10292i(interfaceC10604k0, c10133lM37647b, c10118fM37646a, interfaceC10101q.mo34025a().m33914d(), c10095k, m33971d(), "scope for " + c10095k + " in " + interfaceC10604k0, b.f38452f);
    }

    /* renamed from: d */
    public final C10301k m33971d() {
        C10301k c10301k = this.f38451g;
        if (c10301k != null) {
            return c10301k;
        }
        C9801m.m32363w("components");
        return null;
    }

    /* renamed from: i */
    public final C10283g m33972i(InterfaceC10101q interfaceC10101q) {
        String[] strArrM33917g;
        Pair<C10118f, C10124c> pairM34260i;
        C9801m.m32346f(interfaceC10101q, "kotlinClass");
        String[] strArrM33969j = m33969j(interfaceC10101q, f38446b);
        if (strArrM33969j == null || (strArrM33917g = interfaceC10101q.mo34025a().m33917g()) == null) {
            return null;
        }
        try {
            try {
                pairM34260i = C10121i.m34260i(strArrM33969j, strArrM33917g);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10101q.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (m33966f() || interfaceC10101q.mo34025a().m33914d().m34252h()) {
                throw th;
            }
            pairM34260i = null;
        }
        if (pairM34260i == null) {
            return null;
        }
        return new C10283g(pairM34260i.m37646a(), pairM34260i.m37647b(), interfaceC10101q.mo34025a().m33914d(), new C10103s(interfaceC10101q, m33965e(interfaceC10101q), m33968h(interfaceC10101q), m33964c(interfaceC10101q)));
    }

    /* renamed from: k */
    public final InterfaceC10585e m33973k(InterfaceC10101q interfaceC10101q) {
        C9801m.m32346f(interfaceC10101q, "kotlinClass");
        C10283g c10283gM33972i = m33972i(interfaceC10101q);
        if (c10283gM33972i == null) {
            return null;
        }
        return m33971d().m36421f().m36409d(interfaceC10101q.mo34028e(), c10283gM33972i);
    }

    /* renamed from: l */
    public final void m33974l(C10089e c10089e) {
        C9801m.m32346f(c10089e, "components");
        m33975m(c10089e.m33956a());
    }

    /* renamed from: m */
    public final void m33975m(C10301k c10301k) {
        C9801m.m32346f(c10301k, "<set-?>");
        this.f38451g = c10301k;
    }
}
