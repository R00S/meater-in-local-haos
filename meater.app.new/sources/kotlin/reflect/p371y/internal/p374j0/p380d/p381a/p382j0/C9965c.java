package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9999e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.c */
/* loaded from: classes2.dex */
public final class C9965c {

    /* renamed from: a */
    public static final C9965c f37907a = new C9965c();

    /* renamed from: b */
    private static final C10163f f37908b;

    /* renamed from: c */
    private static final C10163f f37909c;

    /* renamed from: d */
    private static final C10163f f37910d;

    /* renamed from: e */
    private static final Map<C10160c, C10160c> f37911e;

    static {
        C10163f c10163fM35454x = C10163f.m35454x("message");
        C9801m.m32345e(c10163fM35454x, "identifier(\"message\")");
        f37908b = c10163fM35454x;
        C10163f c10163fM35454x2 = C10163f.m35454x("allowedTargets");
        C9801m.m32345e(c10163fM35454x2, "identifier(\"allowedTargets\")");
        f37909c = c10163fM35454x2;
        C10163f c10163fM35454x3 = C10163f.m35454x("value");
        C9801m.m32345e(c10163fM35454x3, "identifier(\"value\")");
        f37910d = c10163fM35454x3;
        f37911e = C10810q0.m38800l(C10773s.m38547a(C9917k.a.f37538H, C9945a0.f37789d), C10773s.m38547a(C9917k.a.f37545L, C9945a0.f37791f), C10773s.m38547a(C9917k.a.f37549P, C9945a0.f37794i));
    }

    private C9965c() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10616c m33166f(C9965c c9965c, InterfaceC10019a interfaceC10019a, C9990g c9990g, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c9965c.m33171e(interfaceC10019a, c9990g, z);
    }

    /* renamed from: a */
    public final InterfaceC10616c m33167a(C10160c c10160c, InterfaceC10025d interfaceC10025d, C9990g c9990g) {
        InterfaceC10019a interfaceC10019aMo33582l;
        C9801m.m32346f(c10160c, "kotlinName");
        C9801m.m32346f(interfaceC10025d, "annotationOwner");
        C9801m.m32346f(c9990g, "c");
        if (C9801m.m32341a(c10160c, C9917k.a.f37608y)) {
            C10160c c10160c2 = C9945a0.f37793h;
            C9801m.m32345e(c10160c2, "DEPRECATED_ANNOTATION");
            InterfaceC10019a interfaceC10019aMo33582l2 = interfaceC10025d.mo33582l(c10160c2);
            if (interfaceC10019aMo33582l2 != null || interfaceC10025d.mo33583m()) {
                return new C9967e(interfaceC10019aMo33582l2, c9990g);
            }
        }
        C10160c c10160c3 = f37911e.get(c10160c);
        if (c10160c3 == null || (interfaceC10019aMo33582l = interfaceC10025d.mo33582l(c10160c3)) == null) {
            return null;
        }
        return m33166f(f37907a, interfaceC10019aMo33582l, c9990g, false, 4, null);
    }

    /* renamed from: b */
    public final C10163f m33168b() {
        return f37908b;
    }

    /* renamed from: c */
    public final C10163f m33169c() {
        return f37910d;
    }

    /* renamed from: d */
    public final C10163f m33170d() {
        return f37909c;
    }

    /* renamed from: e */
    public final InterfaceC10616c m33171e(InterfaceC10019a interfaceC10019a, C9990g c9990g, boolean z) {
        C9801m.m32346f(interfaceC10019a, "annotation");
        C9801m.m32346f(c9990g, "c");
        C10159b c10159bMo33571e = interfaceC10019a.mo33571e();
        if (C9801m.m32341a(c10159bMo33571e, C10159b.m35408m(C9945a0.f37789d))) {
            return new C9971i(interfaceC10019a, c9990g);
        }
        if (C9801m.m32341a(c10159bMo33571e, C10159b.m35408m(C9945a0.f37791f))) {
            return new C9970h(interfaceC10019a, c9990g);
        }
        if (C9801m.m32341a(c10159bMo33571e, C10159b.m35408m(C9945a0.f37794i))) {
            return new C9964b(c9990g, interfaceC10019a, C9917k.a.f37549P);
        }
        if (C9801m.m32341a(c10159bMo33571e, C10159b.m35408m(C9945a0.f37793h))) {
            return null;
        }
        return new C9999e(c9990g, interfaceC10019a, z);
    }
}
