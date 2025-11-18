package db;

import Ra.InterfaceC1694g;
import Ra.InterfaceC1700m;
import ab.C1924E;
import hb.InterfaceC3533z;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: context.kt */
/* renamed from: db.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3088c {
    private static final C3096k c(C3096k c3096k, InterfaceC1700m interfaceC1700m, InterfaceC3533z interfaceC3533z, int i10, InterfaceC4164i<C1924E> interfaceC4164i) {
        return new C3096k(c3096k.a(), interfaceC3533z != null ? new C3098m(c3096k, interfaceC1700m, interfaceC3533z, i10) : c3096k.f(), interfaceC4164i);
    }

    public static final C3096k d(C3096k c3096k, InterfaceC3101p typeParameterResolver) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(typeParameterResolver, "typeParameterResolver");
        return new C3096k(c3096k.a(), typeParameterResolver, c3096k.c());
    }

    public static final C3096k e(C3096k c3096k, InterfaceC1694g containingDeclaration, InterfaceC3533z interfaceC3533z, int i10) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(containingDeclaration, "containingDeclaration");
        return c(c3096k, containingDeclaration, interfaceC3533z, i10, C4165j.b(EnumC4168m.f46628D, new C3086a(c3096k, containingDeclaration)));
    }

    public static /* synthetic */ C3096k f(C3096k c3096k, InterfaceC1694g interfaceC1694g, InterfaceC3533z interfaceC3533z, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC3533z = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(c3096k, interfaceC1694g, interfaceC3533z, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1924E g(C3096k c3096k, InterfaceC1694g interfaceC1694g) {
        return j(c3096k, interfaceC1694g.getAnnotations());
    }

    public static final C3096k h(C3096k c3096k, InterfaceC1700m containingDeclaration, InterfaceC3533z typeParameterOwner, int i10) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(typeParameterOwner, "typeParameterOwner");
        return c(c3096k, containingDeclaration, typeParameterOwner, i10, c3096k.c());
    }

    public static /* synthetic */ C3096k i(C3096k c3096k, InterfaceC1700m interfaceC1700m, InterfaceC3533z interfaceC3533z, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(c3096k, interfaceC1700m, interfaceC3533z, i10);
    }

    public static final C1924E j(C3096k c3096k, Sa.h additionalAnnotations) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(additionalAnnotations, "additionalAnnotations");
        return c3096k.a().a().d(c3096k.b(), additionalAnnotations);
    }

    public static final C3096k k(C3096k c3096k, Sa.h additionalAnnotations) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? c3096k : new C3096k(c3096k.a(), c3096k.f(), C4165j.b(EnumC4168m.f46628D, new C3087b(c3096k, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1924E l(C3096k c3096k, Sa.h hVar) {
        return j(c3096k, hVar);
    }

    public static final C3096k m(C3096k c3096k, C3089d components) {
        C3862t.g(c3096k, "<this>");
        C3862t.g(components, "components");
        return new C3096k(components, c3096k.f(), c3096k.c());
    }
}
