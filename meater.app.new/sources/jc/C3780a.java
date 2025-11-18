package jc;

import Vb.a;
import ic.InterfaceC3693a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3847d;
import kotlin.jvm.internal.C3848e;
import kotlin.jvm.internal.C3850g;
import kotlin.jvm.internal.C3855l;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3861s;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.C3865w;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.V;
import mc.C4024d;
import mc.C4025e;
import mc.C4026f;
import mc.C4027g;
import mc.C4029i;
import mc.C4030j;
import mc.C4032l;
import mc.C4033m;
import mc.C4034n;
import mc.C4037q;
import mc.C4041v;
import mc.C4042w;
import mc.C4044y;
import mc.C4045z;
import mc.D;
import mc.O;
import mc.P;
import mc.Q;
import mc.S;
import mc.U;
import mc.W;
import mc.X;
import mc.Y;
import mc.Z;
import mc.a0;
import mc.r;
import oa.C4148A;
import oa.C4149B;
import oa.C4151D;
import oa.C4152E;
import oa.C4153F;
import oa.w;
import oa.x;
import oa.y;
import oa.z;

/* compiled from: BuiltinSerializers.kt */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001¢\u0006\u0004\b\u001d\u0010\u0007\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\u0007\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0001*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001¢\u0006\u0004\b%\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0001H\u0007¢\u0006\u0004\b'\u0010\u0007\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0001¢\u0006\u0004\b-\u0010\u0007\u001a\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0001¢\u0006\u0004\b3\u0010\u0007\u001a\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000204¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0001¢\u0006\u0004\b9\u0010\u0007\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020:¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0001*\u00020=¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0001*\u00020A¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u0001*\u00020E¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u0001*\u00020I¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0001*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u0001H\u0007¢\u0006\u0004\bV\u0010\u0007¨\u0006W"}, d2 = {"Lkotlin/Char$Companion;", "Lic/a;", "", "q", "(Lkotlin/jvm/internal/g;)Lic/a;", "", "c", "()Lic/a;", "Lkotlin/Byte$Companion;", "", "p", "(Lkotlin/jvm/internal/e;)Lic/a;", "", "b", "Loa/x;", "j", "Lkotlin/Short$Companion;", "", "v", "(Lkotlin/jvm/internal/T;)Lic/a;", "", "i", "Loa/E;", "m", "Lkotlin/Int$Companion;", "", "t", "(Lkotlin/jvm/internal/s;)Lic/a;", "", "f", "Loa/z;", "k", "Lkotlin/Long$Companion;", "", "u", "(Lkotlin/jvm/internal/w;)Lic/a;", "", "g", "Loa/B;", "l", "Lkotlin/Float$Companion;", "", "s", "(Lkotlin/jvm/internal/m;)Lic/a;", "", "e", "Lkotlin/Double$Companion;", "", "r", "(Lkotlin/jvm/internal/l;)Lic/a;", "", "d", "Lkotlin/Boolean$Companion;", "", "o", "(Lkotlin/jvm/internal/d;)Lic/a;", "", "a", "Loa/F;", "B", "(Loa/F;)Lic/a;", "Lkotlin/String$Companion;", "", "w", "(Lkotlin/jvm/internal/V;)Lic/a;", "Loa/y$a;", "Loa/y;", "y", "(Loa/y$a;)Lic/a;", "Loa/A$a;", "Loa/A;", "z", "(Loa/A$a;)Lic/a;", "Loa/w$a;", "Loa/w;", "x", "(Loa/w$a;)Lic/a;", "Loa/D$a;", "Loa/D;", "A", "(Loa/D$a;)Lic/a;", "LVb/a$a;", "LVb/a;", "n", "(LVb/a$a;)Lic/a;", "", "h", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: jc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3780a {
    public static final InterfaceC3693a<C4151D> A(C4151D.Companion companion) {
        C3862t.g(companion, "<this>");
        return Z.f45487a;
    }

    public static final InterfaceC3693a<C4153F> B(C4153F c4153f) {
        C3862t.g(c4153f, "<this>");
        return a0.f45489b;
    }

    public static final InterfaceC3693a<boolean[]> a() {
        return C4024d.f45491c;
    }

    public static final InterfaceC3693a<byte[]> b() {
        return C4026f.f45494c;
    }

    public static final InterfaceC3693a<char[]> c() {
        return C4029i.f45497c;
    }

    public static final InterfaceC3693a<double[]> d() {
        return C4032l.f45501c;
    }

    public static final InterfaceC3693a<float[]> e() {
        return C4037q.f45516c;
    }

    public static final InterfaceC3693a<int[]> f() {
        return C4041v.f45521c;
    }

    public static final InterfaceC3693a<long[]> g() {
        return C4044y.f45526c;
    }

    public static final InterfaceC3693a h() {
        return D.f45442a;
    }

    public static final InterfaceC3693a<short[]> i() {
        return O.f45472c;
    }

    public static final InterfaceC3693a<x> j() {
        return S.f45477c;
    }

    public static final InterfaceC3693a<z> k() {
        return U.f45480c;
    }

    public static final InterfaceC3693a<C4149B> l() {
        return W.f45483c;
    }

    public static final InterfaceC3693a<C4152E> m() {
        return Y.f45486c;
    }

    public static final InterfaceC3693a<Vb.a> n(a.Companion companion) {
        C3862t.g(companion, "<this>");
        return C4034n.f45504a;
    }

    public static final InterfaceC3693a<Boolean> o(C3847d c3847d) {
        C3862t.g(c3847d, "<this>");
        return C4025e.f45492a;
    }

    public static final InterfaceC3693a<Byte> p(C3848e c3848e) {
        C3862t.g(c3848e, "<this>");
        return C4027g.f45495a;
    }

    public static final InterfaceC3693a<Character> q(C3850g c3850g) {
        C3862t.g(c3850g, "<this>");
        return C4030j.f45498a;
    }

    public static final InterfaceC3693a<Double> r(C3855l c3855l) {
        C3862t.g(c3855l, "<this>");
        return C4033m.f45502a;
    }

    public static final InterfaceC3693a<Float> s(C3856m c3856m) {
        C3862t.g(c3856m, "<this>");
        return r.f45517a;
    }

    public static final InterfaceC3693a<Integer> t(C3861s c3861s) {
        C3862t.g(c3861s, "<this>");
        return C4042w.f45522a;
    }

    public static final InterfaceC3693a<Long> u(C3865w c3865w) {
        C3862t.g(c3865w, "<this>");
        return C4045z.f45527a;
    }

    public static final InterfaceC3693a<Short> v(T t10) {
        C3862t.g(t10, "<this>");
        return P.f45473a;
    }

    public static final InterfaceC3693a<String> w(V v10) {
        C3862t.g(v10, "<this>");
        return Q.f45475a;
    }

    public static final InterfaceC3693a<w> x(w.Companion companion) {
        C3862t.g(companion, "<this>");
        return mc.T.f45478a;
    }

    public static final InterfaceC3693a<y> y(y.Companion companion) {
        C3862t.g(companion, "<this>");
        return mc.V.f45481a;
    }

    public static final InterfaceC3693a<C4148A> z(C4148A.Companion companion) {
        C3862t.g(companion, "<this>");
        return X.f45484a;
    }
}
