package Oa;

import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrimitiveType.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: F, reason: collision with root package name */
    public static final a f13336F;

    /* renamed from: G, reason: collision with root package name */
    public static final Set<m> f13337G;

    /* renamed from: H, reason: collision with root package name */
    public static final m f13338H = new m("BOOLEAN", 0, "Boolean");

    /* renamed from: I, reason: collision with root package name */
    public static final m f13339I;

    /* renamed from: J, reason: collision with root package name */
    public static final m f13340J;

    /* renamed from: K, reason: collision with root package name */
    public static final m f13341K;

    /* renamed from: L, reason: collision with root package name */
    public static final m f13342L;

    /* renamed from: M, reason: collision with root package name */
    public static final m f13343M;

    /* renamed from: N, reason: collision with root package name */
    public static final m f13344N;

    /* renamed from: O, reason: collision with root package name */
    public static final m f13345O;

    /* renamed from: P, reason: collision with root package name */
    private static final /* synthetic */ m[] f13346P;

    /* renamed from: Q, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f13347Q;

    /* renamed from: B, reason: collision with root package name */
    private final qb.f f13348B;

    /* renamed from: C, reason: collision with root package name */
    private final qb.f f13349C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4164i f13350D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC4164i f13351E;

    /* compiled from: PrimitiveType.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        m mVar = new m("CHAR", 1, "Char");
        f13339I = mVar;
        m mVar2 = new m("BYTE", 2, "Byte");
        f13340J = mVar2;
        m mVar3 = new m("SHORT", 3, "Short");
        f13341K = mVar3;
        m mVar4 = new m("INT", 4, "Int");
        f13342L = mVar4;
        m mVar5 = new m("FLOAT", 5, "Float");
        f13343M = mVar5;
        m mVar6 = new m("LONG", 6, "Long");
        f13344N = mVar6;
        m mVar7 = new m("DOUBLE", 7, "Double");
        f13345O = mVar7;
        m[] mVarArrC = c();
        f13346P = mVarArrC;
        f13347Q = C4929b.a(mVarArrC);
        f13336F = new a(null);
        f13337G = V.g(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7);
    }

    private m(String str, int i10, String str2) {
        qb.f fVarT = qb.f.t(str2);
        C3862t.f(fVarT, "identifier(...)");
        this.f13348B = fVarT;
        qb.f fVarT2 = qb.f.t(str2 + "Array");
        C3862t.f(fVarT2, "identifier(...)");
        this.f13349C = fVarT2;
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this.f13350D = C4165j.b(enumC4168m, new k(this));
        this.f13351E = C4165j.b(enumC4168m, new l(this));
    }

    private static final /* synthetic */ m[] c() {
        return new m[]{f13338H, f13339I, f13340J, f13341K, f13342L, f13343M, f13344N, f13345O};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb.c p(m mVar) {
        qb.c cVarC = p.f13366A.c(mVar.f13349C);
        C3862t.f(cVarC, "child(...)");
        return cVarC;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f13346P.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb.c w(m mVar) {
        qb.c cVarC = p.f13366A.c(mVar.f13348B);
        C3862t.f(cVarC, "child(...)");
        return cVarC;
    }

    public final qb.c s() {
        return (qb.c) this.f13351E.getValue();
    }

    public final qb.f t() {
        return this.f13349C;
    }

    public final qb.c u() {
        return (qb.c) this.f13350D.getValue();
    }

    public final qb.f v() {
        return this.f13348B;
    }
}
