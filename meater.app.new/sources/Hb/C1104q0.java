package Hb;

import Ra.InterfaceC1695h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeAliasExpansion.kt */
/* renamed from: Hb.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1104q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f5782e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C1104q0 f5783a;

    /* renamed from: b, reason: collision with root package name */
    private final Ra.l0 f5784b;

    /* renamed from: c, reason: collision with root package name */
    private final List<E0> f5785c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Ra.m0, E0> f5786d;

    /* compiled from: TypeAliasExpansion.kt */
    /* renamed from: Hb.q0$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C1104q0 a(C1104q0 c1104q0, Ra.l0 typeAliasDescriptor, List<? extends E0> arguments) {
            C3862t.g(typeAliasDescriptor, "typeAliasDescriptor");
            C3862t.g(arguments, "arguments");
            List<Ra.m0> parameters = typeAliasDescriptor.l().getParameters();
            C3862t.f(parameters, "getParameters(...)");
            List<Ra.m0> list = parameters;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Ra.m0) it.next()).b());
            }
            return new C1104q0(c1104q0, typeAliasDescriptor, arguments, kotlin.collections.M.p(kotlin.collections.r.e1(arrayList, arguments)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C1104q0(C1104q0 c1104q0, Ra.l0 l0Var, List list, Map map, C3854k c3854k) {
        this(c1104q0, l0Var, list, map);
    }

    public final List<E0> a() {
        return this.f5785c;
    }

    public final Ra.l0 b() {
        return this.f5784b;
    }

    public final E0 c(y0 constructor) {
        C3862t.g(constructor, "constructor");
        InterfaceC1695h interfaceC1695hT = constructor.t();
        if (interfaceC1695hT instanceof Ra.m0) {
            return this.f5786d.get(interfaceC1695hT);
        }
        return null;
    }

    public final boolean d(Ra.l0 descriptor) {
        C3862t.g(descriptor, "descriptor");
        if (!C3862t.b(this.f5784b, descriptor)) {
            C1104q0 c1104q0 = this.f5783a;
            if (!(c1104q0 != null ? c1104q0.d(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C1104q0(C1104q0 c1104q0, Ra.l0 l0Var, List<? extends E0> list, Map<Ra.m0, ? extends E0> map) {
        this.f5783a = c1104q0;
        this.f5784b = l0Var;
        this.f5785c = list;
        this.f5786d = map;
    }
}
