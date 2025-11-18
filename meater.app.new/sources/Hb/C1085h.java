package Hb;

import Hb.x0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: Hb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1085h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1085h f5748a = new C1085h();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5749b;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: Hb.h$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5750a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5751b;

        static {
            int[] iArr = new int[Lb.t.values().length];
            try {
                iArr[Lb.t.f11312E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lb.t.f11311D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lb.t.f11310C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5750a = iArr;
            int[] iArr2 = new int[x0.b.values().length];
            try {
                iArr2[x0.b.f5808B.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[x0.b.f5809C.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x0.b.f5810D.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f5751b = iArr2;
        }
    }

    private C1085h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<Lb.j> A(x0 x0Var, List<? extends Lb.j> list) {
        int i10;
        Lb.o oVarJ = x0Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Lb.k kVarU = oVarJ.u((Lb.j) obj);
            int iZ0 = oVarJ.z0(kVarU);
            while (true) {
                if (i10 >= iZ0) {
                    arrayList.add(obj);
                    break;
                }
                i10 = oVarJ.M(oVarJ.H0(oVarJ.K(kVarU, i10))) == null ? i10 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private final Boolean c(x0 x0Var, Lb.j jVar, Lb.j jVar2) {
        Lb.o oVarJ = x0Var.j();
        if (!oVarJ.w(jVar) && !oVarJ.w(jVar2)) {
            return null;
        }
        if (f(oVarJ, jVar) && f(oVarJ, jVar2)) {
            return Boolean.TRUE;
        }
        if (oVarJ.w(jVar)) {
            if (g(oVarJ, x0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (oVarJ.w(jVar2) && (e(oVarJ, jVar) || g(oVarJ, x0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(Lb.o oVar, Lb.j jVar) {
        if (!(jVar instanceof Lb.d)) {
            return false;
        }
        Lb.l lVarI = oVar.I(oVar.o0((Lb.d) jVar));
        return !oVar.y(lVarI) && oVar.w(oVar.G0(oVar.H0(lVarI)));
    }

    private static final boolean e(Lb.o oVar, Lb.j jVar) {
        Lb.m mVarA = oVar.a(jVar);
        if (mVarA instanceof Lb.h) {
            Collection<Lb.i> collectionA = oVar.A(mVarA);
            if (!(collectionA instanceof Collection) || !collectionA.isEmpty()) {
                Iterator<T> it = collectionA.iterator();
                while (it.hasNext()) {
                    Lb.j jVarC = oVar.c((Lb.i) it.next());
                    if (jVarC != null && oVar.w(jVarC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean f(Lb.o oVar, Lb.j jVar) {
        return oVar.w(jVar) || d(oVar, jVar);
    }

    private static final boolean g(Lb.o oVar, x0 x0Var, Lb.j jVar, Lb.j jVar2, boolean z10) {
        Collection<Lb.i> collectionS = oVar.s(jVar);
        if ((collectionS instanceof Collection) && collectionS.isEmpty()) {
            return false;
        }
        for (Lb.i iVar : collectionS) {
            if (C3862t.b(oVar.d0(iVar), oVar.a(jVar2)) || (z10 && v(f5748a, x0Var, jVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean h(Hb.x0 r15, Lb.j r16, Lb.j r17) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.C1085h.h(Hb.x0, Lb.j, Lb.j):java.lang.Boolean");
    }

    private final List<Lb.j> i(x0 x0Var, Lb.j jVar, Lb.m mVar) {
        x0.c cVarJ0;
        Lb.j jVar2 = jVar;
        Lb.o oVarJ = x0Var.j();
        List<Lb.j> listX = oVarJ.X(jVar2, mVar);
        if (listX != null) {
            return listX;
        }
        if (!oVarJ.E0(mVar) && oVarJ.j(jVar2)) {
            return kotlin.collections.r.m();
        }
        if (oVarJ.v(mVar)) {
            if (!oVarJ.t(oVarJ.a(jVar2), mVar)) {
                return kotlin.collections.r.m();
            }
            Lb.j jVarH = oVarJ.h(jVar2, Lb.b.f11304B);
            if (jVarH != null) {
                jVar2 = jVarH;
            }
            return kotlin.collections.r.e(jVar2);
        }
        Rb.k kVar = new Rb.k();
        x0Var.k();
        ArrayDeque<Lb.j> arrayDequeH = x0Var.h();
        C3862t.d(arrayDequeH);
        Set<Lb.j> setI = x0Var.i();
        C3862t.d(setI);
        arrayDequeH.push(jVar2);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + kotlin.collections.r.s0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Lb.j jVarPop = arrayDequeH.pop();
            C3862t.d(jVarPop);
            if (setI.add(jVarPop)) {
                Lb.j jVarH2 = oVarJ.h(jVarPop, Lb.b.f11304B);
                if (jVarH2 == null) {
                    jVarH2 = jVarPop;
                }
                if (oVarJ.t(oVarJ.a(jVarH2), mVar)) {
                    kVar.add(jVarH2);
                    cVarJ0 = x0.c.C0111c.f5814a;
                } else {
                    cVarJ0 = oVarJ.q(jVarH2) == 0 ? x0.c.b.f5813a : x0Var.j().j0(jVarH2);
                }
                if (C3862t.b(cVarJ0, x0.c.C0111c.f5814a)) {
                    cVarJ0 = null;
                }
                if (cVarJ0 != null) {
                    Lb.o oVarJ2 = x0Var.j();
                    Iterator<Lb.i> it = oVarJ2.A(oVarJ2.a(jVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarJ0.a(x0Var, it.next()));
                    }
                }
            }
        }
        x0Var.e();
        return kVar;
    }

    private final List<Lb.j> j(x0 x0Var, Lb.j jVar, Lb.m mVar) {
        return A(x0Var, i(x0Var, jVar, mVar));
    }

    private final boolean k(x0 x0Var, Lb.i iVar, Lb.i iVar2, boolean z10) {
        Lb.o oVarJ = x0Var.j();
        Lb.i iVarO = x0Var.o(x0Var.p(iVar));
        Lb.i iVarO2 = x0Var.o(x0Var.p(iVar2));
        C1085h c1085h = f5748a;
        Boolean boolH = c1085h.h(x0Var, oVarJ.m0(iVarO), oVarJ.G0(iVarO2));
        if (boolH == null) {
            Boolean boolC = x0Var.c(iVarO, iVarO2, z10);
            return boolC != null ? boolC.booleanValue() : c1085h.w(x0Var, oVarJ.m0(iVarO), oVarJ.G0(iVarO2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        x0Var.c(iVarO, iVarO2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r7.k(r7.d0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Lb.n o(Lb.o r7, Lb.i r8, Lb.i r9) {
        /*
            r6 = this;
            int r0 = r7.q(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            Lb.l r4 = r7.Q(r8, r2)
            boolean r5 = r7.y(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            Lb.i r3 = r7.H0(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            Lb.j r4 = r7.m0(r3)
            Lb.j r4 = r7.x(r4)
            boolean r4 = r7.e0(r4)
            if (r4 == 0) goto L3b
            Lb.j r4 = r7.m0(r9)
            Lb.j r4 = r7.x(r4)
            boolean r4 = r7.e0(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = kotlin.jvm.internal.C3862t.b(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            Lb.m r4 = r7.d0(r3)
            Lb.m r5 = r7.d0(r9)
            boolean r4 = kotlin.jvm.internal.C3862t.b(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            Lb.n r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            Lb.m r8 = r7.d0(r8)
            Lb.n r7 = r7.k(r8, r2)
            return r7
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.C1085h.o(Lb.o, Lb.i, Lb.i):Lb.n");
    }

    private final boolean p(x0 x0Var, Lb.j jVar) {
        Lb.o oVarJ = x0Var.j();
        Lb.m mVarA = oVarJ.a(jVar);
        if (oVarJ.E0(mVarA)) {
            return oVarJ.F(mVarA);
        }
        if (oVarJ.F(oVarJ.a(jVar))) {
            return true;
        }
        x0Var.k();
        ArrayDeque<Lb.j> arrayDequeH = x0Var.h();
        C3862t.d(arrayDequeH);
        Set<Lb.j> setI = x0Var.i();
        C3862t.d(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + kotlin.collections.r.s0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Lb.j jVarPop = arrayDequeH.pop();
            C3862t.d(jVarPop);
            if (setI.add(jVarPop)) {
                x0.c cVar = oVarJ.j(jVarPop) ? x0.c.C0111c.f5814a : x0.c.b.f5813a;
                if (C3862t.b(cVar, x0.c.C0111c.f5814a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Lb.o oVarJ2 = x0Var.j();
                    Iterator<Lb.i> it = oVarJ2.A(oVarJ2.a(jVarPop)).iterator();
                    while (it.hasNext()) {
                        Lb.j jVarA = cVar.a(x0Var, it.next());
                        if (oVarJ.F(oVarJ.a(jVarA))) {
                            x0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        x0Var.e();
        return false;
    }

    private final boolean q(Lb.o oVar, Lb.i iVar) {
        return (!oVar.p0(oVar.d0(iVar)) || oVar.y0(iVar) || oVar.p(iVar) || oVar.R(iVar) || oVar.i(iVar)) ? false : true;
    }

    private final boolean r(Lb.o oVar, Lb.j jVar, Lb.j jVar2) {
        Lb.j jVarV;
        Lb.j jVarV2;
        Lb.e eVarH0 = oVar.h0(jVar);
        if (eVarH0 == null || (jVarV = oVar.V(eVarH0)) == null) {
            jVarV = jVar;
        }
        Lb.e eVarH02 = oVar.h0(jVar2);
        if (eVarH02 == null || (jVarV2 = oVar.V(eVarH02)) == null) {
            jVarV2 = jVar2;
        }
        if (oVar.a(jVarV) != oVar.a(jVarV2)) {
            return false;
        }
        if (oVar.p(jVar) || !oVar.p(jVar2)) {
            return !oVar.B(jVar) || oVar.B(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(C1085h c1085h, x0 x0Var, Lb.i iVar, Lb.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c1085h.u(x0Var, iVar, iVar2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w(Hb.x0 r18, Lb.j r19, Lb.j r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.C1085h.w(Hb.x0, Lb.j, Lb.j):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F x(Collection collection, x0 x0Var, Lb.o oVar, Lb.j jVar, x0.a runForkingPoint) {
        C3862t.g(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C1083g(x0Var, oVar, (Lb.j) it.next(), jVar));
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(x0 x0Var, Lb.o oVar, Lb.j jVar, Lb.j jVar2) {
        return f5748a.s(x0Var, oVar.u(jVar), jVar2);
    }

    private final boolean z(Lb.o oVar, Lb.i iVar, Lb.i iVar2, Lb.m mVar) {
        Lb.n nVarG;
        Lb.j jVarC = oVar.c(iVar);
        if (!(jVarC instanceof Lb.d)) {
            return false;
        }
        Lb.d dVar = (Lb.d) jVarC;
        if (oVar.t0(dVar) || !oVar.y(oVar.I(oVar.o0(dVar))) || oVar.N(dVar) != Lb.b.f11304B) {
            return false;
        }
        Lb.m mVarD0 = oVar.d0(iVar2);
        Lb.s sVar = mVarD0 instanceof Lb.s ? (Lb.s) mVarD0 : null;
        return (sVar == null || (nVarG = oVar.G(sVar)) == null || !oVar.H(nVarG, mVar)) ? false : true;
    }

    public final Lb.t l(Lb.t declared, Lb.t useSite) {
        C3862t.g(declared, "declared");
        C3862t.g(useSite, "useSite");
        Lb.t tVar = Lb.t.f11312E;
        if (declared == tVar) {
            return useSite;
        }
        if (useSite == tVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(x0 state, Lb.i a10, Lb.i b10) {
        C3862t.g(state, "state");
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        Lb.o oVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        C1085h c1085h = f5748a;
        if (c1085h.q(oVarJ, a10) && c1085h.q(oVarJ, b10)) {
            Lb.i iVarO = state.o(state.p(a10));
            Lb.i iVarO2 = state.o(state.p(b10));
            Lb.j jVarM0 = oVarJ.m0(iVarO);
            if (!oVarJ.t(oVarJ.d0(iVarO), oVarJ.d0(iVarO2))) {
                return false;
            }
            if (oVarJ.q(jVarM0) == 0) {
                return oVarJ.P(iVarO) || oVarJ.P(iVarO2) || oVarJ.B(jVarM0) == oVarJ.B(oVarJ.m0(iVarO2));
            }
        }
        return v(c1085h, state, a10, b10, false, 8, null) && v(c1085h, state, b10, a10, false, 8, null);
    }

    public final List<Lb.j> n(x0 state, Lb.j subType, Lb.m superConstructor) {
        x0.c cVar;
        C3862t.g(state, "state");
        C3862t.g(subType, "subType");
        C3862t.g(superConstructor, "superConstructor");
        Lb.o oVarJ = state.j();
        if (oVarJ.j(subType)) {
            return f5748a.j(state, subType, superConstructor);
        }
        if (!oVarJ.E0(superConstructor) && !oVarJ.D(superConstructor)) {
            return f5748a.i(state, subType, superConstructor);
        }
        Rb.k<Lb.j> kVar = new Rb.k();
        state.k();
        ArrayDeque<Lb.j> arrayDequeH = state.h();
        C3862t.d(arrayDequeH);
        Set<Lb.j> setI = state.i();
        C3862t.d(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + kotlin.collections.r.s0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Lb.j jVarPop = arrayDequeH.pop();
            C3862t.d(jVarPop);
            if (setI.add(jVarPop)) {
                if (oVarJ.j(jVarPop)) {
                    kVar.add(jVarPop);
                    cVar = x0.c.C0111c.f5814a;
                } else {
                    cVar = x0.c.b.f5813a;
                }
                if (C3862t.b(cVar, x0.c.C0111c.f5814a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    Lb.o oVarJ2 = state.j();
                    Iterator<Lb.i> it = oVarJ2.A(oVarJ2.a(jVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(state, it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (Lb.j jVar : kVar) {
            C1085h c1085h = f5748a;
            C3862t.d(jVar);
            kotlin.collections.r.D(arrayList, c1085h.j(state, jVar, superConstructor));
        }
        return arrayList;
    }

    public final boolean s(x0 x0Var, Lb.k capturedSubArguments, Lb.j superType) {
        boolean zM;
        C3862t.g(x0Var, "<this>");
        C3862t.g(capturedSubArguments, "capturedSubArguments");
        C3862t.g(superType, "superType");
        Lb.o oVarJ = x0Var.j();
        Lb.m mVarA = oVarJ.a(superType);
        int iZ0 = oVarJ.z0(capturedSubArguments);
        int iU = oVarJ.U(mVarA);
        if (iZ0 != iU || iZ0 != oVarJ.q(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iU; i10++) {
            Lb.l lVarQ = oVarJ.Q(superType, i10);
            if (!oVarJ.y(lVarQ)) {
                Lb.i iVarH0 = oVarJ.H0(lVarQ);
                Lb.l lVarK = oVarJ.K(capturedSubArguments, i10);
                oVarJ.B0(lVarK);
                Lb.t tVar = Lb.t.f11312E;
                Lb.i iVarH02 = oVarJ.H0(lVarK);
                C1085h c1085h = f5748a;
                Lb.t tVarL = c1085h.l(oVarJ.I0(oVarJ.k(mVarA, i10)), oVarJ.B0(lVarQ));
                if (tVarL == null) {
                    return x0Var.m();
                }
                if (tVarL != tVar || (!c1085h.z(oVarJ, iVarH02, iVarH0, mVarA) && !c1085h.z(oVarJ, iVarH0, iVarH02, mVarA))) {
                    if (x0Var.f5803g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarH02).toString());
                    }
                    x0Var.f5803g++;
                    int i11 = a.f5750a[tVarL.ordinal()];
                    if (i11 == 1) {
                        zM = c1085h.m(x0Var, iVarH02, iVarH0);
                    } else if (i11 == 2) {
                        zM = v(c1085h, x0Var, iVarH02, iVarH0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM = v(c1085h, x0Var, iVarH0, iVarH02, false, 8, null);
                    }
                    x0Var.f5803g--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(x0 state, Lb.i subType, Lb.i superType) {
        C3862t.g(state, "state");
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    public final boolean u(x0 state, Lb.i subType, Lb.i superType, boolean z10) {
        C3862t.g(state, "state");
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z10);
        }
        return false;
    }
}
