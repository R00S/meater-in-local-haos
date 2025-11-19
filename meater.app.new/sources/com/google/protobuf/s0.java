package com.google.protobuf;

import com.google.protobuf.I;
import java.util.List;
import java.util.Map;

/* compiled from: Writer.java */
/* loaded from: classes2.dex */
interface s0 {

    /* compiled from: Writer.java */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, float f10);

    @Deprecated
    void B(int i10);

    void C(int i10, List<Integer> list, boolean z10);

    void D(int i10, int i11);

    void E(int i10, List<Long> list, boolean z10);

    void F(int i10, List<Integer> list, boolean z10);

    void G(int i10, List<Double> list, boolean z10);

    void H(int i10, int i11);

    void I(int i10, List<AbstractC2947g> list);

    void J(int i10, List<?> list, f0 f0Var);

    @Deprecated
    void K(int i10, List<?> list, f0 f0Var);

    void L(int i10, Object obj, f0 f0Var);

    @Deprecated
    void M(int i10, Object obj, f0 f0Var);

    void N(int i10, AbstractC2947g abstractC2947g);

    <K, V> void O(int i10, I.a<K, V> aVar, Map<K, V> map);

    void a(int i10, List<Float> list, boolean z10);

    void b(int i10, int i11);

    void c(int i10, Object obj);

    void d(int i10, int i11);

    void e(int i10, double d10);

    void f(int i10, List<Long> list, boolean z10);

    void g(int i10, List<Long> list, boolean z10);

    void h(int i10, long j10);

    a i();

    void j(int i10, List<String> list);

    void k(int i10, String str);

    void l(int i10, long j10);

    void m(int i10, List<Integer> list, boolean z10);

    void n(int i10, long j10);

    void o(int i10, boolean z10);

    void p(int i10, int i11);

    @Deprecated
    void q(int i10);

    void r(int i10, int i11);

    void s(int i10, List<Long> list, boolean z10);

    void t(int i10, List<Integer> list, boolean z10);

    void u(int i10, long j10);

    void v(int i10, List<Integer> list, boolean z10);

    void w(int i10, List<Boolean> list, boolean z10);

    void x(int i10, List<Integer> list, boolean z10);

    void y(int i10, List<Long> list, boolean z10);

    void z(int i10, long j10);
}
