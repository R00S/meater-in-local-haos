package ab;

import ab.C1922C;
import kotlin.jvm.internal.C3862t;
import oa.C4162g;
import oa.C4170o;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: ab.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1921B {

    /* renamed from: a, reason: collision with root package name */
    private static final qb.c f20108a;

    /* renamed from: b, reason: collision with root package name */
    private static final qb.c f20109b;

    /* renamed from: c, reason: collision with root package name */
    private static final qb.c f20110c;

    /* renamed from: d, reason: collision with root package name */
    private static final qb.c f20111d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f20112e;

    /* renamed from: f, reason: collision with root package name */
    private static final qb.c[] f20113f;

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC1930K<C1922C> f20114g;

    /* renamed from: h, reason: collision with root package name */
    private static final C1922C f20115h;

    static {
        qb.c cVar = new qb.c("org.jspecify.nullness");
        f20108a = cVar;
        qb.c cVar2 = new qb.c("org.jspecify.annotations");
        f20109b = cVar2;
        qb.c cVar3 = new qb.c("io.reactivex.rxjava3.annotations");
        f20110c = cVar3;
        qb.c cVar4 = new qb.c("org.checkerframework.checker.nullness.compatqual");
        f20111d = cVar4;
        String strB = cVar3.b();
        C3862t.f(strB, "asString(...)");
        f20112e = strB;
        f20113f = new qb.c[]{new qb.c(strB + ".Nullable"), new qb.c(strB + ".NonNull")};
        qb.c cVar5 = new qb.c("org.jetbrains.annotations");
        C1922C.a aVar = C1922C.f20116d;
        C4170o c4170oA = oa.v.a(cVar5, aVar.a());
        C4170o c4170oA2 = oa.v.a(new qb.c("androidx.annotation"), aVar.a());
        C4170o c4170oA3 = oa.v.a(new qb.c("android.support.annotation"), aVar.a());
        C4170o c4170oA4 = oa.v.a(new qb.c("android.annotation"), aVar.a());
        C4170o c4170oA5 = oa.v.a(new qb.c("com.android.annotations"), aVar.a());
        C4170o c4170oA6 = oa.v.a(new qb.c("org.eclipse.jdt.annotation"), aVar.a());
        C4170o c4170oA7 = oa.v.a(new qb.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        C4170o c4170oA8 = oa.v.a(cVar4, aVar.a());
        C4170o c4170oA9 = oa.v.a(new qb.c("javax.annotation"), aVar.a());
        C4170o c4170oA10 = oa.v.a(new qb.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        C4170o c4170oA11 = oa.v.a(new qb.c("io.reactivex.annotations"), aVar.a());
        qb.c cVar6 = new qb.c("androidx.annotation.RecentlyNullable");
        EnumC1934O enumC1934O = EnumC1934O.f20196E;
        C4170o c4170oA12 = oa.v.a(cVar6, new C1922C(enumC1934O, null, null, 4, null));
        C4170o c4170oA13 = oa.v.a(new qb.c("androidx.annotation.RecentlyNonNull"), new C1922C(enumC1934O, null, null, 4, null));
        C4170o c4170oA14 = oa.v.a(new qb.c("lombok"), aVar.a());
        C4162g c4162g = new C4162g(2, 1);
        EnumC1934O enumC1934O2 = EnumC1934O.f20197F;
        f20114g = new C1932M(kotlin.collections.M.k(c4170oA, c4170oA2, c4170oA3, c4170oA4, c4170oA5, c4170oA6, c4170oA7, c4170oA8, c4170oA9, c4170oA10, c4170oA11, c4170oA12, c4170oA13, c4170oA14, oa.v.a(cVar, new C1922C(enumC1934O, c4162g, enumC1934O2)), oa.v.a(cVar2, new C1922C(enumC1934O, new C4162g(2, 1), enumC1934O2)), oa.v.a(cVar3, new C1922C(enumC1934O, new C4162g(1, 8), enumC1934O2))));
        f20115h = new C1922C(enumC1934O, null, null, 4, null);
    }

    public static final C1926G a(C4162g configuredKotlinVersion) {
        C3862t.g(configuredKotlinVersion, "configuredKotlinVersion");
        C1922C c1922c = f20115h;
        EnumC1934O enumC1934OC = (c1922c.d() == null || c1922c.d().compareTo(configuredKotlinVersion) > 0) ? c1922c.c() : c1922c.b();
        return new C1926G(enumC1934OC, c(enumC1934OC), null, 4, null);
    }

    public static /* synthetic */ C1926G b(C4162g c4162g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4162g = C4162g.f46619G;
        }
        return a(c4162g);
    }

    public static final EnumC1934O c(EnumC1934O globalReportLevel) {
        C3862t.g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == EnumC1934O.f20196E) {
            return null;
        }
        return globalReportLevel;
    }

    public static final EnumC1934O d(qb.c annotationFqName) {
        C3862t.g(annotationFqName, "annotationFqName");
        return h(annotationFqName, InterfaceC1930K.f20187a.a(), null, 4, null);
    }

    public static final qb.c e() {
        return f20109b;
    }

    public static final qb.c[] f() {
        return f20113f;
    }

    public static final EnumC1934O g(qb.c annotation, InterfaceC1930K<? extends EnumC1934O> configuredReportLevels, C4162g configuredKotlinVersion) {
        C3862t.g(annotation, "annotation");
        C3862t.g(configuredReportLevels, "configuredReportLevels");
        C3862t.g(configuredKotlinVersion, "configuredKotlinVersion");
        EnumC1934O enumC1934OA = configuredReportLevels.a(annotation);
        if (enumC1934OA != null) {
            return enumC1934OA;
        }
        C1922C c1922cA = f20114g.a(annotation);
        return c1922cA == null ? EnumC1934O.f20195D : (c1922cA.d() == null || c1922cA.d().compareTo(configuredKotlinVersion) > 0) ? c1922cA.c() : c1922cA.b();
    }

    public static /* synthetic */ EnumC1934O h(qb.c cVar, InterfaceC1930K interfaceC1930K, C4162g c4162g, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c4162g = new C4162g(1, 7, 20);
        }
        return g(cVar, interfaceC1930K, c4162g);
    }
}
