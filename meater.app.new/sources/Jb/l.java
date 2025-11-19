package Jb;

import Hb.E0;
import Hb.U;
import Hb.y0;
import Ra.H;
import Ra.InterfaceC1700m;
import Ra.Z;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7791a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final H f7792b = e.f7671B;

    /* renamed from: c, reason: collision with root package name */
    private static final a f7793c;

    /* renamed from: d, reason: collision with root package name */
    private static final U f7794d;

    /* renamed from: e, reason: collision with root package name */
    private static final U f7795e;

    /* renamed from: f, reason: collision with root package name */
    private static final Z f7796f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<Z> f7797g;

    static {
        String str = String.format(b.f7659C.j(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C3862t.f(str, "format(...)");
        qb.f fVarW = qb.f.w(str);
        C3862t.f(fVarW, "special(...)");
        f7793c = new a(fVarW);
        f7794d = d(k.f7744W, new String[0]);
        f7795e = d(k.f7739T0, new String[0]);
        f fVar = new f();
        f7796f = fVar;
        f7797g = V.c(fVar);
    }

    private l() {
    }

    public static final g a(h kind, boolean z10, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        return z10 ? new m(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final g b(h kind, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final i d(k kind, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        return f7791a.g(kind, r.m(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m != null) {
            l lVar = f7791a;
            if (lVar.n(interfaceC1700m) || lVar.n(interfaceC1700m.c()) || interfaceC1700m == f7792b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(InterfaceC1700m interfaceC1700m) {
        return interfaceC1700m instanceof a;
    }

    public static final boolean o(U u10) {
        if (u10 == null) {
            return false;
        }
        y0 y0VarO0 = u10.O0();
        return (y0VarO0 instanceof j) && ((j) y0VarO0).c() == k.f7750Z;
    }

    public final i c(k kind, y0 typeConstructor, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(typeConstructor, "typeConstructor");
        C3862t.g(formatParams, "formatParams");
        return f(kind, r.m(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final j e(k kind, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i f(k kind, List<? extends E0> arguments, y0 typeConstructor, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(arguments, "arguments");
        C3862t.g(typeConstructor, "typeConstructor");
        C3862t.g(formatParams, "formatParams");
        return new i(typeConstructor, b(h.f7686I, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i g(k kind, List<? extends E0> arguments, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(arguments, "arguments");
        C3862t.g(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final a h() {
        return f7793c;
    }

    public final H i() {
        return f7792b;
    }

    public final Set<Z> j() {
        return f7797g;
    }

    public final U k() {
        return f7795e;
    }

    public final U l() {
        return f7794d;
    }

    public final String p(U type) {
        C3862t.g(type, "type");
        Mb.d.z(type);
        y0 y0VarO0 = type.O0();
        C3862t.e(y0VarO0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) y0VarO0).d(0);
    }
}
