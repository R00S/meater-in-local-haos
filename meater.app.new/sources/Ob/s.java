package Ob;

import Hb.U;
import Ob.A;
import Ob.k;
import Ob.v;
import Ra.C1711y;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.l0;
import Ra.t0;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public final class s extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final s f13558a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final List<h> f13559b;

    static {
        qb.f fVar = t.f13606k;
        k.b bVar = k.b.f13547b;
        h hVar = new h(fVar, new f[]{bVar, new A.a(1)}, (Ba.l) null, 4, (C3854k) null);
        h hVar2 = new h(t.f13607l, new f[]{bVar, new A.a(2)}, p.f13555B);
        qb.f fVar2 = t.f13588b;
        m mVar = m.f13549a;
        A.a aVar = new A.a(2);
        j jVar = j.f13543a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (Ba.l) null, 4, (C3854k) null);
        h hVar4 = new h(t.f13590c, new f[]{bVar, mVar, new A.a(3), jVar}, (Ba.l) null, 4, (C3854k) null);
        h hVar5 = new h(t.f13592d, new f[]{bVar, mVar, new A.b(2), jVar}, (Ba.l) null, 4, (C3854k) null);
        h hVar6 = new h(t.f13602i, new f[]{bVar}, (Ba.l) null, 4, (C3854k) null);
        qb.f fVar3 = t.f13600h;
        A.d dVar = A.d.f13522b;
        v.a aVar2 = v.a.f13626d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (Ba.l) null, 4, (C3854k) null);
        qb.f fVar4 = t.f13604j;
        A.c cVar = A.c.f13521b;
        f13559b = kotlin.collections.r.p(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13608m, new f[]{bVar, cVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13609n, new f[]{bVar, cVar, aVar2}, (Ba.l) null, 4, (C3854k) null), new h(t.f13568I, new f[]{bVar, dVar, mVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13569J, new f[]{bVar, dVar, mVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13594e, new f[]{k.a.f13546b}, q.f13556B), new h(t.f13598g, new f[]{bVar, v.b.f13627d, dVar, mVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13585Z, new f[]{bVar, dVar, mVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13584Y, new f[]{bVar, cVar}, (Ba.l) null, 4, (C3854k) null), new h(kotlin.collections.r.p(t.f13619x, t.f13620y), new f[]{bVar}, r.f13557B), new h(t.f13595e0, new f[]{bVar, v.c.f13628d, dVar, mVar}, (Ba.l) null, 4, (C3854k) null), new h(t.f13611p, new f[]{bVar, cVar}, (Ba.l) null, 4, (C3854k) null));
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC1712z Checks) {
        C3862t.g(Checks, "$this$Checks");
        List<t0> listK = Checks.k();
        C3862t.f(listK, "getValueParameters(...)");
        t0 t0Var = (t0) kotlin.collections.r.w0(listK);
        boolean z10 = false;
        if (t0Var != null && !C5087e.f(t0Var) && t0Var.i0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[EDGE_INSN: B:26:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:8:0x002d->B:27:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(Ra.InterfaceC1712z r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.C3862t.g(r3, r0)
            Ra.m r0 = r3.c()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C3862t.f(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.g()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.C3862t.f(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            Ra.z r2 = (Ra.InterfaceC1712z) r2
            Ra.m r2 = r2.c()
            kotlin.jvm.internal.C3862t.f(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = Ra.C1705s.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            Ra.m r2 = r3.c()
            kotlin.jvm.internal.C3862t.f(r2, r1)
            boolean r1 = tb.C4599k.g(r2)
            if (r1 == 0) goto La1
            sb.n r1 = sb.n.f49598j
            Ra.m r3 = r3.c()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C3862t.e(r3, r2)
            Ra.e r3 = (Ra.InterfaceC1692e) r3
            Hb.f0 r3 = r3.u()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.C3862t.f(r3, r2)
            Hb.U r3 = Mb.d.D(r3)
            java.lang.String r3 = r1.U(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.C3862t.f(r3, r0)
            goto Lac
        Lab:
            r3 = 0
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.s.g(Ra.z):java.lang.String");
    }

    private static final boolean h(InterfaceC1700m interfaceC1700m) {
        return (interfaceC1700m instanceof InterfaceC1692e) && Oa.j.a0((InterfaceC1692e) interfaceC1700m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC1712z Checks) {
        boolean zW;
        C3862t.g(Checks, "$this$Checks");
        c0 c0VarD0 = Checks.d0();
        if (c0VarD0 == null) {
            c0VarD0 = Checks.j0();
        }
        s sVar = f13558a;
        boolean z10 = false;
        if (c0VarD0 != null) {
            U returnType = Checks.getReturnType();
            if (returnType != null) {
                U uA = c0VarD0.a();
                C3862t.f(uA, "getType(...)");
                zW = Mb.d.w(returnType, uA);
            } else {
                zW = false;
            }
            if (zW || sVar.j(Checks, c0VarD0)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(InterfaceC1712z interfaceC1712z, c0 c0Var) {
        qb.b bVarN;
        U returnType;
        Bb.g value = c0Var.getValue();
        C3862t.f(value, "getValue(...)");
        if (!(value instanceof Bb.e)) {
            return false;
        }
        InterfaceC1692e interfaceC1692eT = ((Bb.e) value).t();
        if (!interfaceC1692eT.K() || (bVarN = C5087e.n(interfaceC1692eT)) == null) {
            return false;
        }
        InterfaceC1695h interfaceC1695hC = C1711y.c(C5087e.s(interfaceC1692eT), bVarN);
        l0 l0Var = interfaceC1695hC instanceof l0 ? (l0) interfaceC1695hC : null;
        if (l0Var == null || (returnType = interfaceC1712z.getReturnType()) == null) {
            return false;
        }
        return Mb.d.w(returnType, l0Var.U());
    }

    @Override // Ob.b
    public List<h> b() {
        return f13559b;
    }
}
