package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10059i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.c */
/* loaded from: classes2.dex */
public final class C9948c {

    /* renamed from: a */
    private static final C10160c f37831a = new C10160c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C10160c f37832b = new C10160c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C10160c f37833c = new C10160c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C10160c f37834d = new C10160c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<EnumC9946b> f37835e;

    /* renamed from: f */
    private static final Map<C10160c, C10071q> f37836f;

    /* renamed from: g */
    private static final Map<C10160c, C10071q> f37837g;

    /* renamed from: h */
    private static final Set<C10160c> f37838h;

    static {
        EnumC9946b enumC9946b = EnumC9946b.VALUE_PARAMETER;
        List<EnumC9946b> listM38891m = C10817u.m38891m(EnumC9946b.FIELD, EnumC9946b.METHOD_RETURN_TYPE, enumC9946b, EnumC9946b.TYPE_PARAMETER_BOUNDS, EnumC9946b.TYPE_USE);
        f37835e = listM38891m;
        C10160c c10160cM33054i = C9947b0.m33054i();
        EnumC10058h enumC10058h = EnumC10058h.NOT_NULL;
        Map<C10160c, C10071q> mapM38794f = C10808p0.m38794f(C10773s.m38547a(c10160cM33054i, new C10071q(new C10059i(enumC10058h, false, 2, null), listM38891m, false)));
        f37836f = mapM38794f;
        f37837g = C10810q0.m38802n(C10810q0.m38800l(C10773s.m38547a(new C10160c("javax.annotation.ParametersAreNullableByDefault"), new C10071q(new C10059i(EnumC10058h.NULLABLE, false, 2, null), C10815t.m38883e(enumC9946b), false, 4, null)), C10773s.m38547a(new C10160c("javax.annotation.ParametersAreNonnullByDefault"), new C10071q(new C10059i(enumC10058h, false, 2, null), C10815t.m38883e(enumC9946b), false, 4, null))), mapM38794f);
        f37838h = C10822w0.m38922i(C9947b0.m33051f(), C9947b0.m33050e());
    }

    /* renamed from: a */
    public static final Map<C10160c, C10071q> m33059a() {
        return f37837g;
    }

    /* renamed from: b */
    public static final Set<C10160c> m33060b() {
        return f37838h;
    }

    /* renamed from: c */
    public static final Map<C10160c, C10071q> m33061c() {
        return f37836f;
    }

    /* renamed from: d */
    public static final C10160c m33062d() {
        return f37834d;
    }

    /* renamed from: e */
    public static final C10160c m33063e() {
        return f37833c;
    }

    /* renamed from: f */
    public static final C10160c m33064f() {
        return f37832b;
    }

    /* renamed from: g */
    public static final C10160c m33065g() {
        return f37831a;
    }
}
