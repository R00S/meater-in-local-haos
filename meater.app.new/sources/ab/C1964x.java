package ab;

import ib.C3678l;
import ib.EnumC3677k;
import java.util.List;
import java.util.Map;

/* compiled from: JavaDefaultQualifiers.kt */
/* renamed from: ab.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1964x {

    /* renamed from: a, reason: collision with root package name */
    private static final List<EnumC1943c> f20277a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<EnumC1943c> f20278b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<qb.c, C1963w> f20279c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<qb.c, C1963w> f20280d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<qb.c, C1963w> f20281e;

    static {
        EnumC1943c enumC1943c = EnumC1943c.f20244E;
        EnumC1943c enumC1943c2 = EnumC1943c.f20242C;
        EnumC1943c enumC1943c3 = EnumC1943c.f20243D;
        List<EnumC1943c> listP = kotlin.collections.r.p(enumC1943c, enumC1943c2, enumC1943c3, EnumC1943c.f20246G, EnumC1943c.f20245F);
        f20277a = listP;
        List<EnumC1943c> listE = kotlin.collections.r.e(enumC1943c3);
        f20278b = listE;
        qb.c cVarK = C1929J.k();
        EnumC3677k enumC3677k = EnumC3677k.f43279D;
        Map<qb.c, C1963w> mapK = kotlin.collections.M.k(oa.v.a(cVarK, new C1963w(new C3678l(enumC3677k, false, 2, null), listP, false)), oa.v.a(C1929J.i(), new C1963w(new C3678l(enumC3677k, false, 2, null), listP, false)), oa.v.a(C1929J.j(), new C1963w(new C3678l(EnumC3677k.f43277B, false, 2, null), listP, false, 4, null)));
        f20279c = mapK;
        Map<qb.c, C1963w> mapK2 = kotlin.collections.M.k(oa.v.a(C1929J.d(), new C1963w(new C3678l(enumC3677k, false, 2, null), listE, false, 4, null)), oa.v.a(C1929J.e(), new C1963w(new C3678l(EnumC3677k.f43278C, false, 2, null), listE, false, 4, null)));
        f20280d = mapK2;
        f20281e = kotlin.collections.M.m(mapK, mapK2);
    }

    public static final Map<qb.c, C1963w> a() {
        return f20281e;
    }

    public static final Map<qb.c, C1963w> b() {
        return f20279c;
    }
}
