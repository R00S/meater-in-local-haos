package Hb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public abstract class z0 extends H0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5820c = new a(null);

    /* compiled from: TypeSubstitution.kt */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: Hb.z0$a$a, reason: collision with other inner class name */
        public static final class C0112a extends z0 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<y0, E0> f5821d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f5822e;

            /* JADX WARN: Multi-variable type inference failed */
            C0112a(Map<y0, ? extends E0> map, boolean z10) {
                this.f5821d = map;
                this.f5822e = z10;
            }

            @Override // Hb.H0
            public boolean a() {
                return this.f5822e;
            }

            @Override // Hb.H0
            public boolean f() {
                return this.f5821d.isEmpty();
            }

            @Override // Hb.z0
            public E0 k(y0 key) {
                C3862t.g(key, "key");
                return this.f5821d.get(key);
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ z0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final H0 a(U kotlinType) {
            C3862t.g(kotlinType, "kotlinType");
            return b(kotlinType.O0(), kotlinType.M0());
        }

        public final H0 b(y0 typeConstructor, List<? extends E0> arguments) {
            C3862t.g(typeConstructor, "typeConstructor");
            C3862t.g(arguments, "arguments");
            List<Ra.m0> parameters = typeConstructor.getParameters();
            C3862t.f(parameters, "getParameters(...)");
            Ra.m0 m0Var = (Ra.m0) kotlin.collections.r.w0(parameters);
            if (m0Var == null || !m0Var.l0()) {
                return new O(parameters, arguments);
            }
            List<Ra.m0> parameters2 = typeConstructor.getParameters();
            C3862t.f(parameters2, "getParameters(...)");
            List<Ra.m0> list = parameters2;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Ra.m0) it.next()).l());
            }
            return e(this, kotlin.collections.M.p(kotlin.collections.r.e1(arrayList, arguments)), false, 2, null);
        }

        public final z0 c(Map<y0, ? extends E0> map) {
            C3862t.g(map, "map");
            return e(this, map, false, 2, null);
        }

        public final z0 d(Map<y0, ? extends E0> map, boolean z10) {
            C3862t.g(map, "map");
            return new C0112a(map, z10);
        }

        private a() {
        }
    }

    public static final H0 i(y0 y0Var, List<? extends E0> list) {
        return f5820c.b(y0Var, list);
    }

    public static final z0 j(Map<y0, ? extends E0> map) {
        return f5820c.c(map);
    }

    @Override // Hb.H0
    public E0 e(U key) {
        C3862t.g(key, "key");
        return k(key.O0());
    }

    public abstract E0 k(y0 y0Var);
}
