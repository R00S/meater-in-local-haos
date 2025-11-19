package nb;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import lb.C3929i;
import lb.C3934n;
import lb.C3937q;
import lb.C3938r;
import lb.C3939s;
import lb.u;

/* compiled from: protoTypeTableUtil.kt */
/* loaded from: classes3.dex */
public final class f {
    public static final C3937q a(C3937q c3937q, g typeTable) {
        C3862t.g(c3937q, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3937q.l0()) {
            return c3937q.S();
        }
        if (c3937q.m0()) {
            return typeTable.a(c3937q.T());
        }
        return null;
    }

    public static final List<C3937q> b(C3923c c3923c, g typeTable) {
        C3862t.g(c3923c, "<this>");
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listZ0 = c3923c.z0();
        if (listZ0.isEmpty()) {
            listZ0 = null;
        }
        if (listZ0 == null) {
            List<Integer> listY0 = c3923c.y0();
            C3862t.f(listY0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listY0;
            listZ0 = new ArrayList<>(r.x(list, 10));
            for (Integer num : list) {
                C3862t.d(num);
                listZ0.add(typeTable.a(num.intValue()));
            }
        }
        return listZ0;
    }

    public static final List<C3937q> c(C3929i c3929i, g typeTable) {
        C3862t.g(c3929i, "<this>");
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listZ = c3929i.Z();
        if (listZ.isEmpty()) {
            listZ = null;
        }
        if (listZ == null) {
            List<Integer> listY = c3929i.Y();
            C3862t.f(listY, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listY;
            listZ = new ArrayList<>(r.x(list, 10));
            for (Integer num : list) {
                C3862t.d(num);
                listZ.add(typeTable.a(num.intValue()));
            }
        }
        return listZ;
    }

    public static final List<C3937q> d(C3934n c3934n, g typeTable) {
        C3862t.g(c3934n, "<this>");
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listY = c3934n.Y();
        if (listY.isEmpty()) {
            listY = null;
        }
        if (listY == null) {
            List<Integer> listX = c3934n.X();
            C3862t.f(listX, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listX;
            listY = new ArrayList<>(r.x(list, 10));
            for (Integer num : list) {
                C3862t.d(num);
                listY.add(typeTable.a(num.intValue()));
            }
        }
        return listY;
    }

    public static final C3937q e(C3938r c3938r, g typeTable) {
        C3862t.g(c3938r, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3938r.e0()) {
            C3937q c3937qU = c3938r.U();
            C3862t.f(c3937qU, "getExpandedType(...)");
            return c3937qU;
        }
        if (c3938r.f0()) {
            return typeTable.a(c3938r.V());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final C3937q f(C3937q c3937q, g typeTable) {
        C3862t.g(c3937q, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3937q.q0()) {
            return c3937q.c0();
        }
        if (c3937q.r0()) {
            return typeTable.a(c3937q.d0());
        }
        return null;
    }

    public static final boolean g(C3929i c3929i) {
        C3862t.g(c3929i, "<this>");
        return c3929i.x0() || c3929i.y0();
    }

    public static final boolean h(C3934n c3934n) {
        C3862t.g(c3934n, "<this>");
        return c3934n.u0() || c3934n.v0();
    }

    public static final C3937q i(C3923c c3923c, g typeTable) {
        C3862t.g(c3923c, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3923c.q1()) {
            return c3923c.L0();
        }
        if (c3923c.r1()) {
            return typeTable.a(c3923c.M0());
        }
        return null;
    }

    public static final C3937q j(C3937q c3937q, g typeTable) {
        C3862t.g(c3937q, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3937q.t0()) {
            return c3937q.f0();
        }
        if (c3937q.u0()) {
            return typeTable.a(c3937q.g0());
        }
        return null;
    }

    public static final C3937q k(C3929i c3929i, g typeTable) {
        C3862t.g(c3929i, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3929i.x0()) {
            return c3929i.g0();
        }
        if (c3929i.y0()) {
            return typeTable.a(c3929i.i0());
        }
        return null;
    }

    public static final C3937q l(C3934n c3934n, g typeTable) {
        C3862t.g(c3934n, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3934n.u0()) {
            return c3934n.f0();
        }
        if (c3934n.v0()) {
            return typeTable.a(c3934n.g0());
        }
        return null;
    }

    public static final C3937q m(C3929i c3929i, g typeTable) {
        C3862t.g(c3929i, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3929i.z0()) {
            C3937q c3937qJ0 = c3929i.j0();
            C3862t.f(c3937qJ0, "getReturnType(...)");
            return c3937qJ0;
        }
        if (c3929i.A0()) {
            return typeTable.a(c3929i.k0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final C3937q n(C3934n c3934n, g typeTable) {
        C3862t.g(c3934n, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3934n.w0()) {
            C3937q c3937qI0 = c3934n.i0();
            C3862t.f(c3937qI0, "getReturnType(...)");
            return c3937qI0;
        }
        if (c3934n.x0()) {
            return typeTable.a(c3934n.j0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List<C3937q> o(C3923c c3923c, g typeTable) {
        C3862t.g(c3923c, "<this>");
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listC1 = c3923c.c1();
        if (listC1.isEmpty()) {
            listC1 = null;
        }
        if (listC1 == null) {
            List<Integer> listB1 = c3923c.b1();
            C3862t.f(listB1, "getSupertypeIdList(...)");
            List<Integer> list = listB1;
            listC1 = new ArrayList<>(r.x(list, 10));
            for (Integer num : list) {
                C3862t.d(num);
                listC1.add(typeTable.a(num.intValue()));
            }
        }
        return listC1;
    }

    public static final C3937q p(C3937q.b bVar, g typeTable) {
        C3862t.g(bVar, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (bVar.C()) {
            return bVar.z();
        }
        if (bVar.D()) {
            return typeTable.a(bVar.A());
        }
        return null;
    }

    public static final C3937q q(u uVar, g typeTable) {
        C3862t.g(uVar, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (uVar.T()) {
            C3937q c3937qN = uVar.N();
            C3862t.f(c3937qN, "getType(...)");
            return c3937qN;
        }
        if (uVar.U()) {
            return typeTable.a(uVar.O());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final C3937q r(C3938r c3938r, g typeTable) {
        C3862t.g(c3938r, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (c3938r.j0()) {
            C3937q c3937qB0 = c3938r.b0();
            C3862t.f(c3937qB0, "getUnderlyingType(...)");
            return c3937qB0;
        }
        if (c3938r.k0()) {
            return typeTable.a(c3938r.c0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<C3937q> s(C3939s c3939s, g typeTable) {
        C3862t.g(c3939s, "<this>");
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listT = c3939s.T();
        if (listT.isEmpty()) {
            listT = null;
        }
        if (listT == null) {
            List<Integer> listS = c3939s.S();
            C3862t.f(listS, "getUpperBoundIdList(...)");
            List<Integer> list = listS;
            listT = new ArrayList<>(r.x(list, 10));
            for (Integer num : list) {
                C3862t.d(num);
                listT.add(typeTable.a(num.intValue()));
            }
        }
        return listT;
    }

    public static final C3937q t(u uVar, g typeTable) {
        C3862t.g(uVar, "<this>");
        C3862t.g(typeTable, "typeTable");
        if (uVar.V()) {
            return uVar.P();
        }
        if (uVar.W()) {
            return typeTable.a(uVar.Q());
        }
        return null;
    }
}
