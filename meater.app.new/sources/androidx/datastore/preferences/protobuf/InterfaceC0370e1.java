package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0384j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* renamed from: androidx.datastore.preferences.protobuf.e1 */
/* loaded from: classes.dex */
interface InterfaceC0370e1 {
    /* renamed from: A */
    int mo2626A() throws IOException;

    /* renamed from: B */
    void mo2627B(List<String> list) throws IOException;

    /* renamed from: C */
    AbstractC0377h mo2628C() throws IOException;

    /* renamed from: D */
    void mo2629D(List<Float> list) throws IOException;

    /* renamed from: E */
    int mo2630E() throws IOException;

    @Deprecated
    /* renamed from: F */
    <T> void mo2631F(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException;

    /* renamed from: G */
    boolean mo2632G() throws IOException;

    /* renamed from: H */
    int mo2633H() throws IOException;

    /* renamed from: I */
    void mo2634I(List<AbstractC0377h> list) throws IOException;

    /* renamed from: J */
    void mo2635J(List<Double> list) throws IOException;

    /* renamed from: K */
    <T> void mo2636K(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException;

    /* renamed from: L */
    long mo2637L() throws IOException;

    /* renamed from: M */
    String mo2638M() throws IOException;

    /* renamed from: N */
    void mo2639N(List<Long> list) throws IOException;

    @Deprecated
    /* renamed from: O */
    <T> T mo2640O(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException;

    /* renamed from: a */
    String mo2642a() throws IOException;

    /* renamed from: b */
    void mo2644b(List<String> list) throws IOException;

    /* renamed from: c */
    <T> T mo2645c(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException;

    /* renamed from: d */
    void mo2647d(List<Integer> list) throws IOException;

    /* renamed from: e */
    long mo2648e() throws IOException;

    /* renamed from: f */
    long mo2649f() throws IOException;

    /* renamed from: g */
    <T> T mo2650g(Class<T> cls, C0401p c0401p) throws IOException;

    int getTag();

    /* renamed from: h */
    void mo2651h(List<Integer> list) throws IOException;

    /* renamed from: i */
    void mo2652i(List<Long> list) throws IOException;

    /* renamed from: j */
    void mo2653j(List<Integer> list) throws IOException;

    /* renamed from: k */
    int mo2654k() throws IOException;

    /* renamed from: l */
    boolean mo2655l() throws IOException;

    /* renamed from: m */
    long mo2656m() throws IOException;

    /* renamed from: n */
    void mo2657n(List<Long> list) throws IOException;

    @Deprecated
    /* renamed from: o */
    <T> T mo2658o(Class<T> cls, C0401p c0401p) throws IOException;

    /* renamed from: p */
    int mo2659p() throws IOException;

    /* renamed from: q */
    void mo2660q(List<Long> list) throws IOException;

    /* renamed from: r */
    void mo2661r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* renamed from: s */
    void mo2662s(List<Integer> list) throws IOException;

    /* renamed from: t */
    void mo2663t(List<Integer> list) throws IOException;

    /* renamed from: u */
    <K, V> void mo2664u(Map<K, V> map, C0384j0.a<K, V> aVar, C0401p c0401p) throws IOException;

    /* renamed from: v */
    int mo2665v() throws IOException;

    /* renamed from: w */
    void mo2666w(List<Integer> list) throws IOException;

    /* renamed from: x */
    int mo2667x() throws IOException;

    /* renamed from: y */
    long mo2668y() throws IOException;

    /* renamed from: z */
    void mo2669z(List<Boolean> list) throws IOException;
}
