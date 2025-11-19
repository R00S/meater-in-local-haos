package bb;

import Oa.p;
import ab.C1928I;
import db.C3096k;
import eb.C3278j;
import hb.InterfaceC3508a;
import hb.InterfaceC3511d;
import java.util.Map;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import oa.v;
import qb.b;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: bb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2278d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2278d f30713a = new C2278d();

    /* renamed from: b, reason: collision with root package name */
    private static final qb.f f30714b;

    /* renamed from: c, reason: collision with root package name */
    private static final qb.f f30715c;

    /* renamed from: d, reason: collision with root package name */
    private static final qb.f f30716d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<qb.c, qb.c> f30717e;

    static {
        qb.f fVarT = qb.f.t("message");
        C3862t.f(fVarT, "identifier(...)");
        f30714b = fVarT;
        qb.f fVarT2 = qb.f.t("allowedTargets");
        C3862t.f(fVarT2, "identifier(...)");
        f30715c = fVarT2;
        qb.f fVarT3 = qb.f.t("value");
        C3862t.f(fVarT3, "identifier(...)");
        f30716d = fVarT3;
        f30717e = M.k(v.a(p.a.f13414H, C1928I.f20142d), v.a(p.a.f13422L, C1928I.f20144f), v.a(p.a.f13430P, C1928I.f20147i));
    }

    private C2278d() {
    }

    public static /* synthetic */ Sa.c f(C2278d c2278d, InterfaceC3508a interfaceC3508a, C3096k c3096k, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c2278d.e(interfaceC3508a, c3096k, z10);
    }

    public final Sa.c a(qb.c kotlinName, InterfaceC3511d annotationOwner, C3096k c10) {
        InterfaceC3508a interfaceC3508aO;
        C3862t.g(kotlinName, "kotlinName");
        C3862t.g(annotationOwner, "annotationOwner");
        C3862t.g(c10, "c");
        if (C3862t.b(kotlinName, p.a.f13489y)) {
            qb.c DEPRECATED_ANNOTATION = C1928I.f20146h;
            C3862t.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC3508a interfaceC3508aO2 = annotationOwner.o(DEPRECATED_ANNOTATION);
            if (interfaceC3508aO2 != null || annotationOwner.l()) {
                return new C2282h(interfaceC3508aO2, c10);
            }
        }
        qb.c cVar = f30717e.get(kotlinName);
        if (cVar == null || (interfaceC3508aO = annotationOwner.o(cVar)) == null) {
            return null;
        }
        return f(f30713a, interfaceC3508aO, c10, false, 4, null);
    }

    public final qb.f b() {
        return f30714b;
    }

    public final qb.f c() {
        return f30716d;
    }

    public final qb.f d() {
        return f30715c;
    }

    public final Sa.c e(InterfaceC3508a annotation, C3096k c10, boolean z10) {
        C3862t.g(annotation, "annotation");
        C3862t.g(c10, "c");
        qb.b bVarC = annotation.c();
        b.a aVar = qb.b.f48178d;
        qb.c TARGET_ANNOTATION = C1928I.f20142d;
        C3862t.f(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (C3862t.b(bVarC, aVar.c(TARGET_ANNOTATION))) {
            return new n(annotation, c10);
        }
        qb.c RETENTION_ANNOTATION = C1928I.f20144f;
        C3862t.f(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (C3862t.b(bVarC, aVar.c(RETENTION_ANNOTATION))) {
            return new l(annotation, c10);
        }
        qb.c DOCUMENTED_ANNOTATION = C1928I.f20147i;
        C3862t.f(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (C3862t.b(bVarC, aVar.c(DOCUMENTED_ANNOTATION))) {
            return new C2277c(c10, annotation, p.a.f13430P);
        }
        qb.c DEPRECATED_ANNOTATION = C1928I.f20146h;
        C3862t.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (C3862t.b(bVarC, aVar.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C3278j(c10, annotation, z10);
    }
}
