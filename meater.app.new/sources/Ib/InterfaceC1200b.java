package Ib;

import Hb.AbstractC1082f0;
import Hb.C1088i0;
import Hb.C1113z;
import Hb.E0;
import Hb.InterfaceC1076c0;
import Hb.InterfaceC1080e0;
import Hb.J0;
import Hb.K;
import Hb.K0;
import Hb.M0;
import Hb.P0;
import Hb.Q0;
import Hb.T;
import Hb.U;
import Hb.X;
import Hb.Y;
import Hb.x0;
import Hb.y0;
import Hb.z0;
import Oa.p;
import Ra.EnumC1693f;
import Ra.F;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.l0;
import Ra.m0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import tb.C4599k;
import ub.C4699a;
import xb.C5087e;

/* compiled from: ClassicTypeSystemContext.kt */
/* renamed from: Ib.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1200b extends K0, Lb.q {

    /* compiled from: ClassicTypeSystemContext.kt */
    /* renamed from: Ib.b$a */
    public static final class a {

        /* compiled from: ClassicTypeSystemContext.kt */
        /* renamed from: Ib.b$a$a, reason: collision with other inner class name */
        public static final class C0143a extends x0.c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1200b f6978a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J0 f6979b;

            C0143a(InterfaceC1200b interfaceC1200b, J0 j02) {
                this.f6978a = interfaceC1200b;
                this.f6979b = j02;
            }

            @Override // Hb.x0.c
            public Lb.j a(x0 state, Lb.i type) {
                C3862t.g(state, "state");
                C3862t.g(type, "type");
                InterfaceC1200b interfaceC1200b = this.f6978a;
                J0 j02 = this.f6979b;
                Lb.i iVarM0 = interfaceC1200b.m0(type);
                C3862t.e(iVarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                U uN = j02.n((U) iVarM0, Q0.f5693F);
                C3862t.f(uN, "safeSubstitute(...)");
                Lb.j jVarC = interfaceC1200b.c(uN);
                C3862t.d(jVarC);
                return jVarC;
            }
        }

        public static Lb.t A(InterfaceC1200b interfaceC1200b, Lb.n receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                Q0 q0P = ((m0) receiver).p();
                C3862t.f(q0P, "getVariance(...)");
                return Lb.p.a(q0P);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean B(InterfaceC1200b interfaceC1200b, Lb.i receiver, qb.c fqName) {
            C3862t.g(receiver, "$receiver");
            C3862t.g(fqName, "fqName");
            if (receiver instanceof U) {
                return ((U) receiver).getAnnotations().P(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean C(InterfaceC1200b interfaceC1200b, Lb.n receiver, Lb.m mVar) {
            C3862t.g(receiver, "$receiver");
            if (!(receiver instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
            }
            m0 m0Var = (m0) receiver;
            if (mVar == null ? true : mVar instanceof y0) {
                return Mb.d.r(m0Var, (y0) mVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + m0Var + ", " + P.b(m0Var.getClass())).toString());
        }

        public static boolean D(InterfaceC1200b interfaceC1200b, Lb.j a10, Lb.j b10) {
            C3862t.g(a10, "a");
            C3862t.g(b10, "b");
            if (!(a10 instanceof AbstractC1082f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + P.b(a10.getClass())).toString());
            }
            if (b10 instanceof AbstractC1082f0) {
                return ((AbstractC1082f0) a10).M0() == ((AbstractC1082f0) b10).M0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + P.b(b10.getClass())).toString());
        }

        public static Lb.i E(InterfaceC1200b interfaceC1200b, Collection<? extends Lb.i> types) {
            C3862t.g(types, "types");
            return C1202d.a(types);
        }

        public static boolean F(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return Oa.j.w0((y0) receiver, p.a.f13443b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean G(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).t() instanceof InterfaceC1692e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean H(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
                return (interfaceC1692e == null || !F.a(interfaceC1692e) || interfaceC1692e.i() == EnumC1693f.f15146F || interfaceC1692e.i() == EnumC1693f.f15147G) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean I(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).u();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean J(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return Y.a((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean K(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
                return (interfaceC1692e != null ? interfaceC1692e.y0() : null) instanceof Ra.A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean L(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return receiver instanceof vb.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean M(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return receiver instanceof T;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean N(InterfaceC1200b interfaceC1200b) {
            return false;
        }

        public static boolean O(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return ((AbstractC1082f0) receiver).P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean P(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            return receiver instanceof InterfaceC1076c0;
        }

        public static boolean Q(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return Oa.j.w0((y0) receiver, p.a.f13445c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean R(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return M0.l((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean S(InterfaceC1200b interfaceC1200b, Lb.d receiver) {
            C3862t.g(receiver, "$receiver");
            return receiver instanceof C4699a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean T(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return Oa.j.s0((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean U(InterfaceC1200b interfaceC1200b, Lb.d receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).a1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean V(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return receiver instanceof InterfaceC1080e0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean W(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC1082f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
            }
            if (!Y.a((U) receiver)) {
                AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) receiver;
                if (!(abstractC1082f0.O0().t() instanceof l0) && (abstractC1082f0.O0().t() != null || (receiver instanceof C4699a) || (receiver instanceof i) || (receiver instanceof C1113z) || (abstractC1082f0.O0() instanceof vb.q) || X(interfaceC1200b, receiver))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean X(InterfaceC1200b interfaceC1200b, Lb.j jVar) {
            return (jVar instanceof C1088i0) && interfaceC1200b.b(((C1088i0) jVar).E0());
        }

        public static boolean Y(InterfaceC1200b interfaceC1200b, Lb.l receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof E0) {
                return ((E0) receiver).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return Mb.d.u((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean a(InterfaceC1200b interfaceC1200b, Lb.m c12, Lb.m c22) {
            C3862t.g(c12, "c1");
            C3862t.g(c22, "c2");
            if (!(c12 instanceof y0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + P.b(c12.getClass())).toString());
            }
            if (c22 instanceof y0) {
                return C3862t.b(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + P.b(c22.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a0(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return Mb.d.v((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static int b(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return ((U) receiver).M0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean b0(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            return (receiver instanceof P0) && (((P0) receiver).O0() instanceof r);
        }

        public static Lb.k c(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return (Lb.k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static boolean c0(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                return interfaceC1695hT != null && Oa.j.B0(interfaceC1695hT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.d d(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                if (receiver instanceof C1088i0) {
                    return interfaceC1200b.f(((C1088i0) receiver).E0());
                }
                if (receiver instanceof i) {
                    return (i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.j d0(InterfaceC1200b interfaceC1200b, Lb.g receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof K) {
                return ((K) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.e e(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                if (receiver instanceof C1113z) {
                    return (C1113z) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i e0(InterfaceC1200b interfaceC1200b, Lb.d receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.f f(InterfaceC1200b interfaceC1200b, Lb.g receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof K) {
                if (receiver instanceof Hb.F) {
                    return (Hb.F) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i f0(InterfaceC1200b interfaceC1200b, Lb.i receiver, boolean z10) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof P0) {
                return C1201c.b((P0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.g g(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                P0 p0R0 = ((U) receiver).R0();
                if (p0R0 instanceof K) {
                    return (K) p0R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static x0 g0(InterfaceC1200b interfaceC1200b, boolean z10, boolean z11) {
            return C1199a.b(z10, z11, interfaceC1200b, null, null, 24, null);
        }

        public static Lb.j h(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                P0 p0R0 = ((U) receiver).R0();
                if (p0R0 instanceof AbstractC1082f0) {
                    return (AbstractC1082f0) p0R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.j h0(InterfaceC1200b interfaceC1200b, Lb.e receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof C1113z) {
                return ((C1113z) receiver).a1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.l i(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return Mb.d.d((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static int i0(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.j j(InterfaceC1200b interfaceC1200b, Lb.j type, Lb.b status) {
            C3862t.g(type, "type");
            C3862t.g(status, "status");
            if (type instanceof AbstractC1082f0) {
                return o.b((AbstractC1082f0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + P.b(type.getClass())).toString());
        }

        public static Collection<Lb.i> j0(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            Lb.m mVarA = interfaceC1200b.a(receiver);
            if (mVarA instanceof vb.q) {
                return ((vb.q) mVarA).g();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.b k(InterfaceC1200b interfaceC1200b, Lb.d receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.l k0(InterfaceC1200b interfaceC1200b, Lb.c receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof n) {
                return ((n) receiver).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i l(InterfaceC1200b interfaceC1200b, Lb.j lowerBound, Lb.j upperBound) {
            C3862t.g(lowerBound, "lowerBound");
            C3862t.g(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC1082f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1200b + ", " + P.b(interfaceC1200b.getClass())).toString());
            }
            if (upperBound instanceof AbstractC1082f0) {
                return X.e((AbstractC1082f0) lowerBound, (AbstractC1082f0) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1200b + ", " + P.b(interfaceC1200b.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static x0.c l0(InterfaceC1200b interfaceC1200b, Lb.j type) {
            C3862t.g(type, "type");
            if (type instanceof AbstractC1082f0) {
                return new C0143a(interfaceC1200b, z0.f5820c.a((U) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + P.b(type.getClass())).toString());
        }

        public static Lb.l m(InterfaceC1200b interfaceC1200b, Lb.i receiver, int i10) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return ((U) receiver).M0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Collection<Lb.i> m0(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                Collection<U> collectionS = ((y0) receiver).s();
                C3862t.f(collectionS, "getSupertypes(...)");
                return collectionS;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static List<Lb.l> n(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return ((U) receiver).M0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.c n0(InterfaceC1200b interfaceC1200b, Lb.d receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static qb.d o(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C5087e.p((InterfaceC1692e) interfaceC1695hT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.m o0(InterfaceC1200b interfaceC1200b, Lb.j receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return ((AbstractC1082f0) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.n p(InterfaceC1200b interfaceC1200b, Lb.m receiver, int i10) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                m0 m0Var = ((y0) receiver).getParameters().get(i10);
                C3862t.f(m0Var, "get(...)");
                return m0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.j p0(InterfaceC1200b interfaceC1200b, Lb.g receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof K) {
                return ((K) receiver).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static List<Lb.n> q(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                List<m0> parameters = ((y0) receiver).getParameters();
                C3862t.f(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i q0(InterfaceC1200b interfaceC1200b, Lb.i receiver, boolean z10) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof Lb.j) {
                return interfaceC1200b.d((Lb.j) receiver, z10);
            }
            if (!(receiver instanceof Lb.g)) {
                throw new IllegalStateException("sealed");
            }
            Lb.g gVar = (Lb.g) receiver;
            return interfaceC1200b.i0(interfaceC1200b.d(interfaceC1200b.g(gVar), z10), interfaceC1200b.d(interfaceC1200b.e(gVar), z10));
        }

        public static Oa.m r(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Oa.j.P((InterfaceC1692e) interfaceC1695hT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.j r0(InterfaceC1200b interfaceC1200b, Lb.j receiver, boolean z10) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof AbstractC1082f0) {
                return ((AbstractC1082f0) receiver).S0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Oa.m s(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Oa.j.S((InterfaceC1692e) interfaceC1695hT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i t(InterfaceC1200b interfaceC1200b, Lb.n receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                return Mb.d.o((m0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i u(InterfaceC1200b interfaceC1200b, Lb.l receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof E0) {
                return ((E0) receiver).a().R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.n v(InterfaceC1200b interfaceC1200b, Lb.s receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof r) {
                return ((r) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.n w(InterfaceC1200b interfaceC1200b, Lb.m receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof y0) {
                InterfaceC1695h interfaceC1695hT = ((y0) receiver).t();
                if (interfaceC1695hT instanceof m0) {
                    return (m0) interfaceC1695hT;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.i x(InterfaceC1200b interfaceC1200b, Lb.i receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof U) {
                return C4599k.k((U) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static List<Lb.i> y(InterfaceC1200b interfaceC1200b, Lb.n receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                List<U> upperBounds = ((m0) receiver).getUpperBounds();
                C3862t.f(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }

        public static Lb.t z(InterfaceC1200b interfaceC1200b, Lb.l receiver) {
            C3862t.g(receiver, "$receiver");
            if (receiver instanceof E0) {
                Q0 q0B = ((E0) receiver).b();
                C3862t.f(q0B, "getProjectionKind(...)");
                return Lb.p.a(q0B);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + P.b(receiver.getClass())).toString());
        }
    }

    @Override // Lb.o
    Lb.m a(Lb.j jVar);

    @Override // Lb.o
    boolean b(Lb.j jVar);

    @Override // Lb.o
    Lb.j c(Lb.i iVar);

    @Override // Lb.o
    Lb.j d(Lb.j jVar, boolean z10);

    @Override // Lb.o
    Lb.j e(Lb.g gVar);

    @Override // Lb.o
    Lb.d f(Lb.j jVar);

    @Override // Lb.o
    Lb.j g(Lb.g gVar);

    Lb.i i0(Lb.j jVar, Lb.j jVar2);
}
