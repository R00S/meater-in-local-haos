package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* loaded from: classes.dex */
interface e0 {
    void A(List<Float> list);

    int B();

    boolean C();

    int D();

    void E(List<AbstractC2062h> list);

    void F(List<Double> list);

    long G();

    String H();

    void I(List<Long> list);

    <T> T J(f0<T> f0Var, C2069o c2069o);

    <T> T K(Class<T> cls, C2069o c2069o);

    @Deprecated
    <T> T L(Class<T> cls, C2069o c2069o);

    <K, V> void M(Map<K, V> map, I.a<K, V> aVar, C2069o c2069o);

    @Deprecated
    <T> void N(List<T> list, f0<T> f0Var, C2069o c2069o);

    <T> void O(List<T> list, f0<T> f0Var, C2069o c2069o);

    @Deprecated
    <T> T P(f0<T> f0Var, C2069o c2069o);

    int a();

    void b(List<Integer> list);

    long c();

    long d();

    void e(List<Integer> list);

    void f(List<Long> list);

    void g(List<Integer> list);

    int h();

    boolean i();

    long j();

    void k(List<Long> list);

    int l();

    void m(List<Long> list);

    void n(List<Long> list);

    void o(List<Integer> list);

    void p(List<Integer> list);

    int q();

    void r(List<Integer> list);

    double readDouble();

    float readFloat();

    int s();

    long t();

    void u(List<Boolean> list);

    String v();

    int w();

    void x(List<String> list);

    void y(List<String> list);

    AbstractC2062h z();
}
