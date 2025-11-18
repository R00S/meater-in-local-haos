package ib;

import Hb.InterfaceC1080e0;
import Hb.M0;
import Hb.P0;
import Ra.C1705s;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1695h;
import Ra.m0;
import Ra.t0;
import ab.EnumC1943c;
import db.C3088c;
import db.C3096k;
import eb.C3278j;
import eb.C3282n;
import hb.InterfaceC3508a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3673g f43239a;

    public e0(C3673g typeEnhancement) {
        C3862t.g(typeEnhancement, "typeEnhancement");
        this.f43239a = typeEnhancement;
    }

    private final boolean f(Hb.U u10) {
        return M0.c(u10, d0.f43237B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(P0 p02) {
        InterfaceC1695h interfaceC1695hT = p02.O0().t();
        if (interfaceC1695hT == null) {
            return Boolean.FALSE;
        }
        qb.f name = interfaceC1695hT.getName();
        Qa.c cVar = Qa.c.f14576a;
        return Boolean.valueOf(C3862t.b(name, cVar.h().g()) && C3862t.b(C5087e.k(interfaceC1695hT), cVar.h()));
    }

    private final Hb.U h(InterfaceC1689b interfaceC1689b, Sa.a aVar, boolean z10, C3096k c3096k, EnumC1943c enumC1943c, j0 j0Var, boolean z11, Ba.l<? super InterfaceC1689b, ? extends Hb.U> lVar) {
        g0 g0Var = new g0(aVar, z10, c3096k, enumC1943c, false, 16, null);
        Hb.U uInvoke = lVar.invoke(interfaceC1689b);
        Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1689b> collection = collectionG;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        for (InterfaceC1689b interfaceC1689b2 : collection) {
            C3862t.d(interfaceC1689b2);
            arrayList.add(lVar.invoke(interfaceC1689b2));
        }
        return i(g0Var, uInvoke, arrayList, j0Var, z11);
    }

    private final Hb.U i(g0 g0Var, Hb.U u10, List<? extends Hb.U> list, j0 j0Var, boolean z10) {
        return this.f43239a.a(u10, g0Var.d(u10, list, j0Var, z10), g0Var.z());
    }

    static /* synthetic */ Hb.U j(e0 e0Var, InterfaceC1689b interfaceC1689b, Sa.a aVar, boolean z10, C3096k c3096k, EnumC1943c enumC1943c, j0 j0Var, boolean z11, Ba.l lVar, int i10, Object obj) {
        return e0Var.h(interfaceC1689b, aVar, z10, c3096k, enumC1943c, j0Var, (i10 & 32) != 0 ? false : z11, lVar);
    }

    static /* synthetic */ Hb.U k(e0 e0Var, g0 g0Var, Hb.U u10, List list, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j0Var = null;
        }
        j0 j0Var2 = j0Var;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return e0Var.i(g0Var, u10, list, j0Var2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends Ra.InterfaceC1689b> D l(D r22, db.C3096k r23) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.e0.l(Ra.b, db.k):Ra.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hb.U m(InterfaceC1689b it) {
        C3862t.g(it, "it");
        Hb.U returnType = it.getReturnType();
        C3862t.d(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hb.U n(InterfaceC1689b it) {
        C3862t.g(it, "it");
        Ra.c0 c0VarJ0 = it.j0();
        C3862t.d(c0VarJ0);
        Hb.U uA = c0VarJ0.a();
        C3862t.f(uA, "getType(...)");
        return uA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hb.U o(t0 t0Var, InterfaceC1689b it) {
        C3862t.g(it, "it");
        Hb.U uA = it.k().get(t0Var.getIndex()).a();
        C3862t.f(uA, "getType(...)");
        return uA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(P0 it) {
        C3862t.g(it, "it");
        return it instanceof InterfaceC1080e0;
    }

    private final Hb.U t(InterfaceC1689b interfaceC1689b, t0 t0Var, C3096k c3096k, j0 j0Var, boolean z10, Ba.l<? super InterfaceC1689b, ? extends Hb.U> lVar) {
        C3096k c3096kK;
        return h(interfaceC1689b, t0Var, false, (t0Var == null || (c3096kK = C3088c.k(c3096k, t0Var.getAnnotations())) == null) ? c3096k : c3096kK, EnumC1943c.f20243D, j0Var, z10, lVar);
    }

    private final <D extends InterfaceC1689b> Sa.h u(D d10, C3096k c3096k) {
        InterfaceC1695h interfaceC1695hA = C1705s.a(d10);
        if (interfaceC1695hA == null) {
            return d10.getAnnotations();
        }
        C3282n c3282n = interfaceC1695hA instanceof C3282n ? (C3282n) interfaceC1695hA : null;
        List<InterfaceC3508a> listU0 = c3282n != null ? c3282n.U0() : null;
        List<InterfaceC3508a> list = listU0;
        if (list == null || list.isEmpty()) {
            return d10.getAnnotations();
        }
        List<InterfaceC3508a> list2 = listU0;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3278j(c3096k, (InterfaceC3508a) it.next(), true));
        }
        return Sa.h.f15630e.a(kotlin.collections.r.D0(d10.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends InterfaceC1689b> Collection<D> p(C3096k c10, Collection<? extends D> platformSignatures) {
        C3862t.g(c10, "c");
        C3862t.g(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((InterfaceC1689b) it.next(), c10));
        }
        return arrayList;
    }

    public final Hb.U q(Hb.U type, C3096k context) {
        C3862t.g(type, "type");
        C3862t.g(context, "context");
        Hb.U uK = k(this, new g0(null, false, context, EnumC1943c.f20245F, true), type, kotlin.collections.r.m(), null, false, 12, null);
        return uK == null ? type : uK;
    }

    public final List<Hb.U> r(m0 typeParameter, List<? extends Hb.U> bounds, C3096k context) {
        C3862t.g(typeParameter, "typeParameter");
        C3862t.g(bounds, "bounds");
        C3862t.g(context, "context");
        List<? extends Hb.U> list = bounds;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        for (Hb.U u10 : list) {
            if (!Mb.d.e(u10, c0.f43233B)) {
                Hb.U uK = k(this, new g0(typeParameter, false, context, EnumC1943c.f20246G, false, 16, null), u10, kotlin.collections.r.m(), null, false, 12, null);
                if (uK != null) {
                    u10 = uK;
                }
            }
            arrayList.add(u10);
        }
        return arrayList;
    }
}
