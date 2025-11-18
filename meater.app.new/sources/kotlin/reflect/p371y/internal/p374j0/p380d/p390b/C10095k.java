package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10310t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10288e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;
import kotlin.text.C10547v;

/* compiled from: JvmPackagePartSource.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.k */
/* loaded from: classes3.dex */
public final class C10095k implements InterfaceC10289f {

    /* renamed from: b */
    private final C10239d f38456b;

    /* renamed from: c */
    private final C10239d f38457c;

    /* renamed from: d */
    private final C10310t<C10117e> f38458d;

    /* renamed from: e */
    private final boolean f38459e;

    /* renamed from: f */
    private final EnumC10288e f38460f;

    /* renamed from: g */
    private final InterfaceC10101q f38461g;

    /* renamed from: h */
    private final String f38462h;

    public C10095k(C10239d c10239d, C10239d c10239d2, C10133l c10133l, InterfaceC10151c interfaceC10151c, C10310t<C10117e> c10310t, boolean z, EnumC10288e enumC10288e, InterfaceC10101q interfaceC10101q) {
        String string;
        C9801m.m32346f(c10239d, "className");
        C9801m.m32346f(c10133l, "packageProto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(enumC10288e, "abiStability");
        this.f38456b = c10239d;
        this.f38457c = c10239d2;
        this.f38458d = c10310t;
        this.f38459e = z;
        this.f38460f = enumC10288e;
        this.f38461g = interfaceC10101q;
        AbstractC10749h.f<C10133l, Integer> fVar = C10112a.f38503m;
        C9801m.m32345e(fVar, "packageModuleName");
        Integer num = (Integer) C10153e.m35380a(c10133l, fVar);
        this.f38462h = (num == null || (string = interfaceC10151c.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
    /* renamed from: a */
    public InterfaceC10575a1 mo33980a() {
        InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
        C9801m.m32345e(interfaceC10575a1, "NO_SOURCE_FILE");
        return interfaceC10575a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f
    /* renamed from: c */
    public String mo33981c() {
        return "Class '" + m33982d().m35409b().m35420b() + '\'';
    }

    /* renamed from: d */
    public final C10159b m33982d() {
        return new C10159b(m33983e().m36112g(), m33986h());
    }

    /* renamed from: e */
    public C10239d m33983e() {
        return this.f38456b;
    }

    /* renamed from: f */
    public C10239d m33984f() {
        return this.f38457c;
    }

    /* renamed from: g */
    public final InterfaceC10101q m33985g() {
        return this.f38461g;
    }

    /* renamed from: h */
    public final C10163f m33986h() {
        String strM36111f = m33983e().m36111f();
        C9801m.m32345e(strM36111f, "className.internalName");
        C10163f c10163fM35454x = C10163f.m35454x(C10547v.m37537I0(strM36111f, '/', null, 2, null));
        C9801m.m32345e(c10163fM35454x, "identifier(className.int….substringAfterLast('/'))");
        return c10163fM35454x;
    }

    public String toString() {
        return C10095k.class.getSimpleName() + ": " + m33983e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10095k(InterfaceC10101q interfaceC10101q, C10133l c10133l, InterfaceC10151c interfaceC10151c, C10310t<C10117e> c10310t, boolean z, EnumC10288e enumC10288e) {
        C9801m.m32346f(interfaceC10101q, "kotlinClass");
        C9801m.m32346f(c10133l, "packageProto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(enumC10288e, "abiStability");
        C10239d c10239dM36107b = C10239d.m36107b(interfaceC10101q.mo34028e());
        C9801m.m32345e(c10239dM36107b, "byClassId(kotlinClass.classId)");
        String strM33915e = interfaceC10101q.mo34025a().m33915e();
        C10239d c10239dM36109d = null;
        if (strM33915e != null) {
            if (strM33915e.length() > 0) {
                c10239dM36109d = C10239d.m36109d(strM33915e);
            }
        }
        this(c10239dM36107b, c10239dM36109d, c10133l, interfaceC10151c, c10310t, z, enumC10288e, interfaceC10101q);
    }
}
