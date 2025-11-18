package kotlin.reflect.p371y.internal.p374j0.p415l.p419w1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;

/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w1.p */
/* loaded from: classes3.dex */
public interface InterfaceC10449p extends InterfaceC10452s {

    /* compiled from: TypeSystemContext.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.w1.p$a */
    public static final class a {
        /* renamed from: a */
        public static List<InterfaceC10444k> m37097a(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
            C9801m.m32346f(interfaceC10444k, "$receiver");
            C9801m.m32346f(interfaceC10447n, "constructor");
            return null;
        }

        /* renamed from: b */
        public static InterfaceC10446m m37098b(InterfaceC10449p interfaceC10449p, InterfaceC10445l interfaceC10445l, int i2) {
            C9801m.m32346f(interfaceC10445l, "$receiver");
            if (interfaceC10445l instanceof InterfaceC10444k) {
                return interfaceC10449p.mo35946g0((InterfaceC10442i) interfaceC10445l, i2);
            }
            if (interfaceC10445l instanceof C10434a) {
                InterfaceC10446m interfaceC10446m = ((C10434a) interfaceC10445l).get(i2);
                C9801m.m32345e(interfaceC10446m, "get(index)");
                return interfaceC10446m;
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC10445l + ", " + C9790g0.m32298b(interfaceC10445l.getClass())).toString());
        }

        /* renamed from: c */
        public static InterfaceC10446m m37099c(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k, int i2) {
            C9801m.m32346f(interfaceC10444k, "$receiver");
            boolean z = false;
            if (i2 >= 0 && i2 < interfaceC10449p.mo35951j(interfaceC10444k)) {
                z = true;
            }
            if (z) {
                return interfaceC10449p.mo35946g0(interfaceC10444k, i2);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m37100d(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            return interfaceC10449p.mo35929W(interfaceC10449p.mo35948h0(interfaceC10442i)) != interfaceC10449p.mo35929W(interfaceC10449p.mo35926T(interfaceC10442i));
        }

        /* renamed from: e */
        public static boolean m37101e(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
            return (interfaceC10444kMo35933a != null ? interfaceC10449p.mo35943f(interfaceC10444kMo35933a) : null) != null;
        }

        /* renamed from: f */
        public static boolean m37102f(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k) {
            C9801m.m32346f(interfaceC10444k, "$receiver");
            return interfaceC10449p.mo35928V(interfaceC10449p.mo35937c(interfaceC10444k));
        }

        /* renamed from: g */
        public static boolean m37103g(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
            return (interfaceC10444kMo35933a != null ? interfaceC10449p.mo35970s0(interfaceC10444kMo35933a) : null) != null;
        }

        /* renamed from: h */
        public static boolean m37104h(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10440g interfaceC10440gMo35919M = interfaceC10449p.mo35919M(interfaceC10442i);
            return (interfaceC10440gMo35919M != null ? interfaceC10449p.mo35982y0(interfaceC10440gMo35919M) : null) != null;
        }

        /* renamed from: i */
        public static boolean m37105i(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k) {
            C9801m.m32346f(interfaceC10444k, "$receiver");
            return interfaceC10449p.mo35966q0(interfaceC10449p.mo35937c(interfaceC10444k));
        }

        /* renamed from: j */
        public static boolean m37106j(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            return (interfaceC10442i instanceof InterfaceC10444k) && interfaceC10449p.mo35929W((InterfaceC10444k) interfaceC10442i);
        }

        /* renamed from: k */
        public static boolean m37107k(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            return interfaceC10449p.mo35963p(interfaceC10449p.mo35977w(interfaceC10442i)) && !interfaceC10449p.mo35964p0(interfaceC10442i);
        }

        /* renamed from: l */
        public static InterfaceC10444k m37108l(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            InterfaceC10444k interfaceC10444kMo35945g;
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10440g interfaceC10440gMo35919M = interfaceC10449p.mo35919M(interfaceC10442i);
            if (interfaceC10440gMo35919M != null && (interfaceC10444kMo35945g = interfaceC10449p.mo35945g(interfaceC10440gMo35919M)) != null) {
                return interfaceC10444kMo35945g;
            }
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
            C9801m.m32343c(interfaceC10444kMo35933a);
            return interfaceC10444kMo35933a;
        }

        /* renamed from: m */
        public static int m37109m(InterfaceC10449p interfaceC10449p, InterfaceC10445l interfaceC10445l) {
            C9801m.m32346f(interfaceC10445l, "$receiver");
            if (interfaceC10445l instanceof InterfaceC10444k) {
                return interfaceC10449p.mo35951j((InterfaceC10442i) interfaceC10445l);
            }
            if (interfaceC10445l instanceof C10434a) {
                return ((C10434a) interfaceC10445l).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC10445l + ", " + C9790g0.m32298b(interfaceC10445l.getClass())).toString());
        }

        /* renamed from: n */
        public static InterfaceC10447n m37110n(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
            if (interfaceC10444kMo35933a == null) {
                interfaceC10444kMo35933a = interfaceC10449p.mo35948h0(interfaceC10442i);
            }
            return interfaceC10449p.mo35937c(interfaceC10444kMo35933a);
        }

        /* renamed from: o */
        public static InterfaceC10444k m37111o(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
            InterfaceC10444k interfaceC10444kMo35941e;
            C9801m.m32346f(interfaceC10442i, "$receiver");
            InterfaceC10440g interfaceC10440gMo35919M = interfaceC10449p.mo35919M(interfaceC10442i);
            if (interfaceC10440gMo35919M != null && (interfaceC10444kMo35941e = interfaceC10449p.mo35941e(interfaceC10440gMo35919M)) != null) {
                return interfaceC10444kMo35941e;
            }
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
            C9801m.m32343c(interfaceC10444kMo35933a);
            return interfaceC10444kMo35933a;
        }
    }

    /* renamed from: A */
    C10342d1.c mo35901A(InterfaceC10444k interfaceC10444k);

    /* renamed from: A0 */
    boolean mo35902A0(InterfaceC10447n interfaceC10447n, InterfaceC10447n interfaceC10447n2);

    /* renamed from: B */
    boolean mo35903B(InterfaceC10442i interfaceC10442i);

    /* renamed from: B0 */
    List<InterfaceC10442i> mo35904B0(InterfaceC10448o interfaceC10448o);

    /* renamed from: C */
    boolean mo35905C(InterfaceC10442i interfaceC10442i);

    /* renamed from: D */
    InterfaceC10448o mo35907D(InterfaceC10447n interfaceC10447n, int i2);

    /* renamed from: D0 */
    InterfaceC10446m mo35908D0(InterfaceC10444k interfaceC10444k, int i2);

    /* renamed from: E0 */
    boolean mo35910E0(InterfaceC10444k interfaceC10444k);

    /* renamed from: F */
    InterfaceC10448o mo35911F(InterfaceC10447n interfaceC10447n);

    /* renamed from: G */
    InterfaceC10442i mo35912G(InterfaceC10442i interfaceC10442i, boolean z);

    /* renamed from: H */
    InterfaceC10444k mo35913H(InterfaceC10438e interfaceC10438e);

    /* renamed from: I */
    boolean mo35915I(InterfaceC10442i interfaceC10442i);

    /* renamed from: J */
    boolean mo35916J(InterfaceC10444k interfaceC10444k);

    /* renamed from: L */
    boolean mo35918L(InterfaceC10446m interfaceC10446m);

    /* renamed from: M */
    InterfaceC10440g mo35919M(InterfaceC10442i interfaceC10442i);

    /* renamed from: N */
    EnumC10454u mo35920N(InterfaceC10448o interfaceC10448o);

    /* renamed from: O */
    InterfaceC10442i mo35921O(List<? extends InterfaceC10442i> list);

    /* renamed from: P */
    EnumC10435b mo35922P(InterfaceC10437d interfaceC10437d);

    /* renamed from: Q */
    InterfaceC10442i mo35923Q(InterfaceC10442i interfaceC10442i);

    /* renamed from: R */
    int mo35924R(InterfaceC10445l interfaceC10445l);

    /* renamed from: S */
    InterfaceC10446m mo35925S(InterfaceC10436c interfaceC10436c);

    /* renamed from: T */
    InterfaceC10444k mo35926T(InterfaceC10442i interfaceC10442i);

    /* renamed from: U */
    InterfaceC10442i mo35927U(InterfaceC10437d interfaceC10437d);

    /* renamed from: V */
    boolean mo35928V(InterfaceC10447n interfaceC10447n);

    /* renamed from: W */
    boolean mo35929W(InterfaceC10444k interfaceC10444k);

    /* renamed from: X */
    List<InterfaceC10446m> mo35930X(InterfaceC10442i interfaceC10442i);

    /* renamed from: Y */
    boolean mo35931Y(InterfaceC10442i interfaceC10442i);

    /* renamed from: Z */
    boolean mo35932Z(InterfaceC10447n interfaceC10447n);

    /* renamed from: a */
    InterfaceC10444k mo35933a(InterfaceC10442i interfaceC10442i);

    /* renamed from: b */
    boolean mo35935b(InterfaceC10444k interfaceC10444k);

    /* renamed from: c */
    InterfaceC10447n mo35937c(InterfaceC10444k interfaceC10444k);

    /* renamed from: c0 */
    InterfaceC10446m mo35938c0(InterfaceC10442i interfaceC10442i);

    /* renamed from: d */
    InterfaceC10444k mo35939d(InterfaceC10444k interfaceC10444k, boolean z);

    /* renamed from: d0 */
    InterfaceC10436c mo35940d0(InterfaceC10437d interfaceC10437d);

    /* renamed from: e */
    InterfaceC10444k mo35941e(InterfaceC10440g interfaceC10440g);

    /* renamed from: e0 */
    List<InterfaceC10448o> mo35942e0(InterfaceC10447n interfaceC10447n);

    /* renamed from: f */
    InterfaceC10437d mo35943f(InterfaceC10444k interfaceC10444k);

    /* renamed from: f0 */
    boolean mo35944f0(InterfaceC10442i interfaceC10442i);

    /* renamed from: g */
    InterfaceC10444k mo35945g(InterfaceC10440g interfaceC10440g);

    /* renamed from: g0 */
    InterfaceC10446m mo35946g0(InterfaceC10442i interfaceC10442i, int i2);

    /* renamed from: h */
    int mo35947h(InterfaceC10447n interfaceC10447n);

    /* renamed from: h0 */
    InterfaceC10444k mo35948h0(InterfaceC10442i interfaceC10442i);

    /* renamed from: j */
    int mo35951j(InterfaceC10442i interfaceC10442i);

    /* renamed from: j0 */
    EnumC10454u mo35952j0(InterfaceC10446m interfaceC10446m);

    /* renamed from: k */
    boolean mo35953k(InterfaceC10437d interfaceC10437d);

    /* renamed from: k0 */
    boolean mo35954k0(InterfaceC10447n interfaceC10447n);

    /* renamed from: m0 */
    InterfaceC10448o mo35958m0(InterfaceC10453t interfaceC10453t);

    /* renamed from: n */
    List<InterfaceC10444k> mo35959n(InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n);

    /* renamed from: n0 */
    boolean mo35960n0(InterfaceC10444k interfaceC10444k);

    /* renamed from: o */
    boolean mo35961o(InterfaceC10448o interfaceC10448o, InterfaceC10447n interfaceC10447n);

    /* renamed from: o0 */
    boolean mo35962o0(InterfaceC10442i interfaceC10442i);

    /* renamed from: p */
    boolean mo35963p(InterfaceC10447n interfaceC10447n);

    /* renamed from: p0 */
    boolean mo35964p0(InterfaceC10442i interfaceC10442i);

    /* renamed from: q */
    boolean mo35965q(InterfaceC10437d interfaceC10437d);

    /* renamed from: q0 */
    boolean mo35966q0(InterfaceC10447n interfaceC10447n);

    /* renamed from: r */
    InterfaceC10445l mo35967r(InterfaceC10444k interfaceC10444k);

    /* renamed from: r0 */
    InterfaceC10444k mo35968r0(InterfaceC10444k interfaceC10444k, EnumC10435b enumC10435b);

    /* renamed from: s */
    boolean mo35969s(InterfaceC10442i interfaceC10442i);

    /* renamed from: s0 */
    InterfaceC10438e mo35970s0(InterfaceC10444k interfaceC10444k);

    /* renamed from: t */
    Collection<InterfaceC10442i> mo35971t(InterfaceC10447n interfaceC10447n);

    /* renamed from: u */
    InterfaceC10446m mo35973u(InterfaceC10445l interfaceC10445l, int i2);

    /* renamed from: u0 */
    boolean mo35974u0(InterfaceC10447n interfaceC10447n);

    /* renamed from: v */
    Collection<InterfaceC10442i> mo35975v(InterfaceC10444k interfaceC10444k);

    /* renamed from: v0 */
    boolean mo35976v0(InterfaceC10444k interfaceC10444k);

    /* renamed from: w */
    InterfaceC10447n mo35977w(InterfaceC10442i interfaceC10442i);

    /* renamed from: w0 */
    boolean mo35978w0(InterfaceC10444k interfaceC10444k);

    /* renamed from: x */
    boolean mo35979x(InterfaceC10447n interfaceC10447n);

    /* renamed from: x0 */
    InterfaceC10442i mo35980x0(InterfaceC10446m interfaceC10446m);

    /* renamed from: y */
    InterfaceC10443j mo35981y(InterfaceC10440g interfaceC10440g);

    /* renamed from: y0 */
    InterfaceC10439f mo35982y0(InterfaceC10440g interfaceC10440g);

    /* renamed from: z */
    boolean mo35983z(InterfaceC10442i interfaceC10442i);

    /* renamed from: z0 */
    boolean mo35984z0(InterfaceC10442i interfaceC10442i);
}
