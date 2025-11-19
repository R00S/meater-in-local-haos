package Ua;

import Hb.J0;
import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: ClassConstructorDescriptorImpl.java */
/* renamed from: Ua.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1770i extends AbstractC1779s implements InterfaceC1691d {

    /* renamed from: f0, reason: collision with root package name */
    protected final boolean f17822f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C1770i(InterfaceC1692e interfaceC1692e, InterfaceC1699l interfaceC1699l, Sa.h hVar, boolean z10, InterfaceC1689b.a aVar, h0 h0Var) {
        super(interfaceC1692e, interfaceC1699l, hVar, qb.h.f48207j, aVar, h0Var);
        if (interfaceC1692e == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (aVar == null) {
            H(2);
        }
        if (h0Var == null) {
            H(3);
        }
        this.f17822f0 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void H(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.C1770i.H(int):void");
    }

    private List<c0> l1() {
        InterfaceC1692e interfaceC1692eC = c();
        if (interfaceC1692eC.G0().isEmpty()) {
            List<c0> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                H(16);
            }
            return listEmptyList;
        }
        List<c0> listG0 = interfaceC1692eC.G0();
        if (listG0 == null) {
            H(15);
        }
        return listG0;
    }

    public static C1770i o1(InterfaceC1692e interfaceC1692e, Sa.h hVar, boolean z10, h0 h0Var) {
        if (interfaceC1692e == null) {
            H(4);
        }
        if (hVar == null) {
            H(5);
        }
        if (h0Var == null) {
            H(6);
        }
        return new C1770i(interfaceC1692e, null, hVar, z10, InterfaceC1689b.a.DECLARATION, h0Var);
    }

    @Override // Ra.InterfaceC1699l
    public boolean A() {
        return this.f17822f0;
    }

    @Override // Ra.InterfaceC1699l
    public InterfaceC1692e B() {
        InterfaceC1692e interfaceC1692eC = c();
        if (interfaceC1692eC == null) {
            H(18);
        }
        return interfaceC1692eC;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z, Ra.InterfaceC1689b, Ra.InterfaceC1688a
    public Collection<? extends InterfaceC1712z> g() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            H(21);
        }
        return setEmptySet;
    }

    public c0 m1() {
        InterfaceC1692e interfaceC1692eC = c();
        if (!interfaceC1692eC.L()) {
            return null;
        }
        InterfaceC1700m interfaceC1700mC = interfaceC1692eC.c();
        if (interfaceC1700mC instanceof InterfaceC1692e) {
            return ((InterfaceC1692e) interfaceC1700mC).K0();
        }
        return null;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1689b
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1691d a0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        InterfaceC1691d interfaceC1691d = (InterfaceC1691d) super.a0(interfaceC1700m, e10, abstractC1707u, aVar, z10);
        if (interfaceC1691d == null) {
            H(27);
        }
        return interfaceC1691d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.AbstractC1779s
    public C1770i p1(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a aVar, qb.f fVar, Sa.h hVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(23);
        }
        if (aVar == null) {
            H(24);
        }
        if (hVar == null) {
            H(25);
        }
        if (h0Var == null) {
            H(26);
        }
        InterfaceC1689b.a aVar2 = InterfaceC1689b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC1689b.a.SYNTHESIZED) {
            return new C1770i((InterfaceC1692e) interfaceC1700m, this, hVar, this.f17822f0, aVar2, h0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1700m + "\nkind: " + aVar);
    }

    @Override // Ua.AbstractC1775n, Ra.InterfaceC1700m
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e c() {
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) super.c();
        if (interfaceC1692e == null) {
            H(17);
        }
        return interfaceC1692e;
    }

    public C1770i r1(List<t0> list, AbstractC1707u abstractC1707u) {
        if (list == null) {
            H(13);
        }
        if (abstractC1707u == null) {
            H(14);
        }
        s1(list, abstractC1707u, c().w());
        return this;
    }

    public C1770i s1(List<t0> list, AbstractC1707u abstractC1707u, List<m0> list2) {
        if (list == null) {
            H(10);
        }
        if (abstractC1707u == null) {
            H(11);
        }
        if (list2 == null) {
            H(12);
        }
        super.S0(null, m1(), l1(), list2, list, null, Ra.E.f15106C, abstractC1707u);
        return this;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.i(this, d10);
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1689b
    public void w0(Collection<? extends InterfaceC1689b> collection) {
        if (collection == null) {
            H(22);
        }
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z, Ra.j0
    public InterfaceC1691d d(J0 j02) {
        if (j02 == null) {
            H(20);
        }
        return (InterfaceC1691d) super.d(j02);
    }

    @Override // Ua.AbstractC1779s, Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: b */
    public InterfaceC1691d L0() {
        InterfaceC1691d interfaceC1691d = (InterfaceC1691d) super.L0();
        if (interfaceC1691d == null) {
            H(19);
        }
        return interfaceC1691d;
    }
}
