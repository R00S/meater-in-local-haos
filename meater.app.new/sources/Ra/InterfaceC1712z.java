package Ra;

import Hb.H0;
import Hb.J0;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import java.util.Collection;
import java.util.List;

/* compiled from: FunctionDescriptor.java */
/* renamed from: Ra.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1712z extends InterfaceC1689b {

    /* compiled from: FunctionDescriptor.java */
    /* renamed from: Ra.z$a */
    public interface a<D extends InterfaceC1712z> {
        a<D> a();

        a<D> b(qb.f fVar);

        a<D> c(List<t0> list);

        a<D> d();

        D e();

        a<D> f();

        a<D> g(boolean z10);

        a<D> h(AbstractC1707u abstractC1707u);

        <V> a<D> i(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a, V v10);

        a<D> j(InterfaceC1689b interfaceC1689b);

        a<D> k(List<m0> list);

        a<D> l();

        a<D> m(E e10);

        a<D> n(InterfaceC1689b.a aVar);

        a<D> o(InterfaceC1700m interfaceC1700m);

        a<D> p(c0 c0Var);

        a<D> q(Sa.h hVar);

        a<D> r(H0 h02);

        a<D> s(Hb.U u10);

        a<D> t();

        a<D> u(c0 c0Var);
    }

    boolean B0();

    boolean O();

    @Override // Ra.InterfaceC1689b, Ra.InterfaceC1688a, Ra.InterfaceC1700m
    InterfaceC1712z b();

    @Override // Ra.InterfaceC1701n, Ra.InterfaceC1700m
    InterfaceC1700m c();

    InterfaceC1712z c0();

    InterfaceC1712z d(J0 j02);

    @Override // Ra.InterfaceC1689b, Ra.InterfaceC1688a
    Collection<? extends InterfaceC1712z> g();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean u0();

    a<? extends InterfaceC1712z> v();
}
