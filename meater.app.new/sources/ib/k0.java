package ib;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import ab.C1928I;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Sa.h f43282a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3672f f43283b;

    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43284a;

        static {
            int[] iArr = new int[EnumC3677k.values().length];
            try {
                iArr[EnumC3677k.f43278C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3677k.f43279D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43284a = iArr;
        }
    }

    static {
        qb.c ENHANCED_NULLABILITY_ANNOTATION = C1928I.f20160v;
        C3862t.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f43282a = new C3672f(ENHANCED_NULLABILITY_ANNOTATION);
        qb.c ENHANCED_MUTABILITY_ANNOTATION = C1928I.f20161w;
        C3862t.f(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f43283b = new C3672f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sa.h e(List<? extends Sa.h> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new Sa.o((List<? extends Sa.h>) kotlin.collections.r.W0(list)) : (Sa.h) kotlin.collections.r.J0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1695h f(InterfaceC1695h interfaceC1695h, C3674h c3674h, h0 h0Var) {
        Qa.d dVar = Qa.d.f14596a;
        if (!i0.a(h0Var) || !(interfaceC1695h instanceof InterfaceC1692e)) {
            return null;
        }
        if (c3674h.e() == EnumC3675i.f43271B && h0Var == h0.f43266B) {
            InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1695h;
            if (dVar.c(interfaceC1692e)) {
                return dVar.a(interfaceC1692e);
            }
        }
        if (c3674h.e() != EnumC3675i.f43272C || h0Var != h0.f43267C) {
            return null;
        }
        InterfaceC1692e interfaceC1692e2 = (InterfaceC1692e) interfaceC1695h;
        if (dVar.d(interfaceC1692e2)) {
            return dVar.b(interfaceC1692e2);
        }
        return null;
    }

    public static final Sa.h g() {
        return f43282a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(C3674h c3674h, h0 h0Var) {
        if (!i0.a(h0Var)) {
            return null;
        }
        EnumC3677k enumC3677kF = c3674h.f();
        int i10 = enumC3677kF == null ? -1 : a.f43284a[enumC3677kF.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(Hb.U u10) {
        C3862t.g(u10, "<this>");
        return l0.c(Ib.u.f7008a, u10);
    }
}
