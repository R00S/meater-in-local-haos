package Ra;

import kotlin.jvm.internal.C3862t;

/* compiled from: findClassInModule.kt */
/* renamed from: Ra.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1711y {
    public static final InterfaceC1692e b(H h10, qb.b classId) {
        C3862t.g(h10, "<this>");
        C3862t.g(classId, "classId");
        InterfaceC1695h interfaceC1695hC = c(h10, classId);
        if (interfaceC1695hC instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hC;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ra.InterfaceC1695h c(Ra.H r8, qb.b r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.C1711y.c(Ra.H, qb.b):Ra.h");
    }

    public static final InterfaceC1692e d(H h10, qb.b classId, M notFoundClasses) {
        C3862t.g(h10, "<this>");
        C3862t.g(classId, "classId");
        C3862t.g(notFoundClasses, "notFoundClasses");
        InterfaceC1692e interfaceC1692eB = b(h10, classId);
        return interfaceC1692eB != null ? interfaceC1692eB : notFoundClasses.d(classId, Tb.k.H(Tb.k.A(Tb.k.i(classId, new kotlin.jvm.internal.F() { // from class: Ra.y.a
            @Override // Ia.o
            public Object get(Object obj) {
                return ((qb.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC3849f
            public Ia.g getOwner() {
                return kotlin.jvm.internal.P.b(qb.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC3849f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), C1710x.f15196B)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(qb.b it) {
        C3862t.g(it, "it");
        return 0;
    }

    public static final l0 f(H h10, qb.b classId) {
        C3862t.g(h10, "<this>");
        C3862t.g(classId, "classId");
        InterfaceC1695h interfaceC1695hC = c(h10, classId);
        if (interfaceC1695hC instanceof l0) {
            return (l0) interfaceC1695hC;
        }
        return null;
    }
}
