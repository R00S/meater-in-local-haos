package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.C10773s;
import kotlin.KotlinVersion;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10076v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.u */
/* loaded from: classes2.dex */
public final class C10075u {

    /* renamed from: a */
    private static final C10160c f38307a;

    /* renamed from: b */
    private static final C10160c f38308b;

    /* renamed from: c */
    private static final InterfaceC9949c0<C10076v> f38309c;

    /* renamed from: d */
    private static final C10076v f38310d;

    static {
        C10160c c10160c = new C10160c("org.jspecify.nullness");
        f38307a = c10160c;
        C10160c c10160c2 = new C10160c("org.checkerframework.checker.nullness.compatqual");
        f38308b = c10160c2;
        C10160c c10160c3 = new C10160c("org.jetbrains.annotations");
        C10076v.a aVar = C10076v.f38311a;
        C10160c c10160c4 = new C10160c("androidx.annotation.RecentlyNullable");
        EnumC9955f0 enumC9955f0 = EnumC9955f0.WARN;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 8);
        EnumC9955f0 enumC9955f02 = EnumC9955f0.STRICT;
        f38309c = new C9951d0(C10810q0.m38800l(C10773s.m38547a(c10160c3, aVar.m33815a()), C10773s.m38547a(new C10160c("androidx.annotation"), aVar.m33815a()), C10773s.m38547a(new C10160c("android.support.annotation"), aVar.m33815a()), C10773s.m38547a(new C10160c("android.annotation"), aVar.m33815a()), C10773s.m38547a(new C10160c("com.android.annotations"), aVar.m33815a()), C10773s.m38547a(new C10160c("org.eclipse.jdt.annotation"), aVar.m33815a()), C10773s.m38547a(new C10160c("org.checkerframework.checker.nullness.qual"), aVar.m33815a()), C10773s.m38547a(c10160c2, aVar.m33815a()), C10773s.m38547a(new C10160c("javax.annotation"), aVar.m33815a()), C10773s.m38547a(new C10160c("edu.umd.cs.findbugs.annotations"), aVar.m33815a()), C10773s.m38547a(new C10160c("io.reactivex.annotations"), aVar.m33815a()), C10773s.m38547a(c10160c4, new C10076v(enumC9955f0, null, null, 4, null)), C10773s.m38547a(new C10160c("androidx.annotation.RecentlyNonNull"), new C10076v(enumC9955f0, null, null, 4, null)), C10773s.m38547a(new C10160c("lombok"), aVar.m33815a()), C10773s.m38547a(c10160c, new C10076v(enumC9955f0, kotlinVersion, enumC9955f02)), C10773s.m38547a(new C10160c("io.reactivex.rxjava3.annotations"), new C10076v(enumC9955f0, new KotlinVersion(1, 8), enumC9955f02))));
        f38310d = new C10076v(enumC9955f0, null, null, 4, null);
    }

    /* renamed from: a */
    public static final C10079y m33804a(KotlinVersion kotlinVersion) {
        C9801m.m32346f(kotlinVersion, "configuredKotlinVersion");
        C10076v c10076v = f38310d;
        EnumC9955f0 enumC9955f0M33813c = (c10076v.m33814d() == null || c10076v.m33814d().compareTo(kotlinVersion) > 0) ? c10076v.m33813c() : c10076v.m33812b();
        return new C10079y(enumC9955f0M33813c, m33806c(enumC9955f0M33813c), null, 4, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C10079y m33805b(KotlinVersion kotlinVersion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kotlinVersion = KotlinVersion.f37199g;
        }
        return m33804a(kotlinVersion);
    }

    /* renamed from: c */
    public static final EnumC9955f0 m33806c(EnumC9955f0 enumC9955f0) {
        C9801m.m32346f(enumC9955f0, "globalReportLevel");
        if (enumC9955f0 == EnumC9955f0.WARN) {
            return null;
        }
        return enumC9955f0;
    }

    /* renamed from: d */
    public static final EnumC9955f0 m33807d(C10160c c10160c) {
        C9801m.m32346f(c10160c, "annotationFqName");
        return m33810g(c10160c, InterfaceC9949c0.f37839a.m33067a(), null, 4, null);
    }

    /* renamed from: e */
    public static final C10160c m33808e() {
        return f38307a;
    }

    /* renamed from: f */
    public static final EnumC9955f0 m33809f(C10160c c10160c, InterfaceC9949c0<? extends EnumC9955f0> interfaceC9949c0, KotlinVersion kotlinVersion) {
        C9801m.m32346f(c10160c, "annotation");
        C9801m.m32346f(interfaceC9949c0, "configuredReportLevels");
        C9801m.m32346f(kotlinVersion, "configuredKotlinVersion");
        EnumC9955f0 enumC9955f0Mo33066a = interfaceC9949c0.mo33066a(c10160c);
        if (enumC9955f0Mo33066a != null) {
            return enumC9955f0Mo33066a;
        }
        C10076v c10076vMo33066a = f38309c.mo33066a(c10160c);
        return c10076vMo33066a == null ? EnumC9955f0.IGNORE : (c10076vMo33066a.m33814d() == null || c10076vMo33066a.m33814d().compareTo(kotlinVersion) > 0) ? c10076vMo33066a.m33813c() : c10076vMo33066a.m33812b();
    }

    /* renamed from: g */
    public static /* synthetic */ EnumC9955f0 m33810g(C10160c c10160c, InterfaceC9949c0 interfaceC9949c0, KotlinVersion kotlinVersion, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 0);
        }
        return m33809f(c10160c, interfaceC9949c0, kotlinVersion);
    }
}
