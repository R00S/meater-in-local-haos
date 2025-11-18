package ub;

import Gb.f;
import Gb.n;
import Hb.A;
import Hb.C1072a0;
import Hb.E0;
import Hb.G0;
import Hb.H0;
import Hb.O;
import Hb.Q0;
import Hb.U;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: ub.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4703e {

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: ub.e$a */
    public static final class a extends A {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f50529d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H0 h02, boolean z10) {
            super(h02);
            this.f50529d = z10;
        }

        @Override // Hb.H0
        public boolean b() {
            return this.f50529d;
        }

        @Override // Hb.A, Hb.H0
        public E0 e(U key) {
            C3862t.g(key, "key");
            E0 e0E = super.e(key);
            if (e0E == null) {
                return null;
            }
            InterfaceC1695h interfaceC1695hT = key.O0().t();
            return C4703e.c(e0E, interfaceC1695hT instanceof m0 ? (m0) interfaceC1695hT : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E0 c(E0 e02, m0 m0Var) {
        if (m0Var == null || e02.b() == Q0.f5693F) {
            return e02;
        }
        if (m0Var.p() != e02.b()) {
            return new G0(e(e02));
        }
        if (!e02.c()) {
            return new G0(e02.a());
        }
        n NO_LOCKS = f.f4998e;
        C3862t.f(NO_LOCKS, "NO_LOCKS");
        return new G0(new C1072a0(NO_LOCKS, new C4702d(e02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U d(E0 e02) {
        U uA = e02.a();
        C3862t.f(uA, "getType(...)");
        return uA;
    }

    public static final U e(E0 typeProjection) {
        C3862t.g(typeProjection, "typeProjection");
        return new C4699a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(U u10) {
        C3862t.g(u10, "<this>");
        return u10.O0() instanceof InterfaceC4700b;
    }

    public static final H0 g(H0 h02, boolean z10) {
        C3862t.g(h02, "<this>");
        if (!(h02 instanceof O)) {
            return new a(h02, z10);
        }
        O o10 = (O) h02;
        m0[] m0VarArrJ = o10.j();
        List<C4170o> listX0 = C3831l.X0(o10.i(), o10.j());
        ArrayList arrayList = new ArrayList(r.x(listX0, 10));
        for (C4170o c4170o : listX0) {
            arrayList.add(c((E0) c4170o.c(), (m0) c4170o.d()));
        }
        return new O(m0VarArrJ, (E0[]) arrayList.toArray(new E0[0]), z10);
    }

    public static /* synthetic */ H0 h(H0 h02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(h02, z10);
    }
}
