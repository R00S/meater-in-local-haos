package Qa;

import Ra.C1706t;
import Ra.E;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1712z;
import Ra.h0;
import Ua.O;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes3.dex */
public final class a extends Ab.f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0215a f14572e = new C0215a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final qb.f f14573f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: Qa.a$a, reason: collision with other inner class name */
    public static final class C0215a {
        public /* synthetic */ C0215a(C3854k c3854k) {
            this();
        }

        public final qb.f a() {
            return a.f14573f;
        }

        private C0215a() {
        }
    }

    static {
        qb.f fVarT = qb.f.t("clone");
        C3862t.f(fVarT, "identifier(...)");
        f14573f = fVarT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Gb.n storageManager, InterfaceC1692e containingClass) {
        super(storageManager, containingClass);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingClass, "containingClass");
    }

    @Override // Ab.f
    protected List<InterfaceC1712z> j() {
        O oM1 = O.m1(m(), Sa.h.f15630e.b(), f14573f, InterfaceC1689b.a.DECLARATION, h0.f15158a);
        oM1.S0(null, m().K0(), kotlin.collections.r.m(), kotlin.collections.r.m(), kotlin.collections.r.m(), C5087e.m(m()).i(), E.f15108E, C1706t.f15168c);
        return kotlin.collections.r.e(oM1);
    }
}
