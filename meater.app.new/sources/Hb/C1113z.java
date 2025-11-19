package Hb;

import Ra.InterfaceC1695h;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpecialTypes.kt */
/* renamed from: Hb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1113z extends B implements InterfaceC1111x, Lb.e {

    /* renamed from: E, reason: collision with root package name */
    public static final a f5817E = new a(null);

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f5818C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f5819D;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: Hb.z$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private final boolean a(P0 p02) {
            return (p02.O0() instanceof Ib.r) || (p02.O0().t() instanceof Ra.m0) || (p02 instanceof Ib.i) || (p02 instanceof C1100o0);
        }

        public static /* synthetic */ C1113z c(a aVar, P0 p02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(p02, z10, z11);
        }

        private final boolean d(P0 p02, boolean z10) {
            if (!a(p02)) {
                return false;
            }
            if (p02 instanceof C1100o0) {
                return M0.l(p02);
            }
            InterfaceC1695h interfaceC1695hT = p02.O0().t();
            Ua.U u10 = interfaceC1695hT instanceof Ua.U ? (Ua.U) interfaceC1695hT : null;
            if (u10 == null || u10.U0()) {
                return (z10 && (p02.O0().t() instanceof Ra.m0)) ? M0.l(p02) : !Ib.s.f7006a.a(p02);
            }
            return true;
        }

        public final C1113z b(P0 type, boolean z10, boolean z11) {
            C3862t.g(type, "type");
            if (type instanceof C1113z) {
                return (C1113z) type;
            }
            C3854k c3854k = null;
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof K) {
                K k10 = (K) type;
                C3862t.b(k10.W0().O0(), k10.X0().O0());
            }
            return new C1113z(N.c(type).S0(false), z10, c3854k);
        }

        private a() {
        }
    }

    public /* synthetic */ C1113z(AbstractC1082f0 abstractC1082f0, boolean z10, C3854k c3854k) {
        this(abstractC1082f0, z10);
    }

    @Override // Hb.InterfaceC1111x
    public U F0(U replacement) {
        C3862t.g(replacement, "replacement");
        return C1090j0.e(replacement.R0(), this.f5819D);
    }

    @Override // Hb.B, Hb.U
    public boolean P0() {
        return false;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        return z10 ? X0().S0(z10) : this;
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new C1113z(X0().U0(newAttributes), this.f5819D);
    }

    @Override // Hb.B
    protected AbstractC1082f0 X0() {
        return this.f5818C;
    }

    public final AbstractC1082f0 a1() {
        return this.f5818C;
    }

    @Override // Hb.B
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C1113z Z0(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        return new C1113z(delegate, this.f5819D);
    }

    @Override // Hb.AbstractC1082f0
    public String toString() {
        return X0() + " & Any";
    }

    @Override // Hb.InterfaceC1111x
    public boolean z0() {
        return (X0().O0() instanceof Ib.r) || (X0().O0().t() instanceof Ra.m0);
    }

    private C1113z(AbstractC1082f0 abstractC1082f0, boolean z10) {
        this.f5818C = abstractC1082f0;
        this.f5819D = z10;
    }
}
