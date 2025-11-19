package Hb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes3.dex */
public final class L extends K implements InterfaceC1111x {

    /* renamed from: F, reason: collision with root package name */
    public static final a f5674F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    public static boolean f5675G;

    /* renamed from: E, reason: collision with root package name */
    private boolean f5676E;

    /* compiled from: flexibleTypes.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
        super(lowerBound, upperBound);
        C3862t.g(lowerBound, "lowerBound");
        C3862t.g(upperBound, "upperBound");
    }

    private final void a1() {
        if (!f5675G || this.f5676E) {
            return;
        }
        this.f5676E = true;
        N.b(W0());
        N.b(X0());
        C3862t.b(W0(), X0());
        Ib.e.f6980a.b(W0(), X0());
    }

    @Override // Hb.InterfaceC1111x
    public U F0(U replacement) {
        P0 p0E;
        C3862t.g(replacement, "replacement");
        P0 p0R0 = replacement.R0();
        if (p0R0 instanceof K) {
            p0E = p0R0;
        } else {
            if (!(p0R0 instanceof AbstractC1082f0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) p0R0;
            p0E = X.e(abstractC1082f0, abstractC1082f0.S0(true));
        }
        return O0.b(p0E, p0R0);
    }

    @Override // Hb.P0
    public P0 S0(boolean z10) {
        return X.e(W0().S0(z10), X0().S0(z10));
    }

    @Override // Hb.P0
    public P0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return X.e(W0().U0(newAttributes), X0().U0(newAttributes));
    }

    @Override // Hb.K
    public AbstractC1082f0 V0() {
        a1();
        return W0();
    }

    @Override // Hb.K
    public String Y0(sb.n renderer, sb.w options) {
        C3862t.g(renderer, "renderer");
        C3862t.g(options, "options");
        if (!options.p()) {
            return renderer.R(renderer.U(W0()), renderer.U(X0()), Mb.d.n(this));
        }
        return '(' + renderer.U(W0()) + ".." + renderer.U(X0()) + ')';
    }

    @Override // Hb.P0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public K Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(W0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        U uA2 = kotlinTypeRefiner.a(X0());
        C3862t.e(uA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new L((AbstractC1082f0) uA, (AbstractC1082f0) uA2);
    }

    @Override // Hb.K
    public String toString() {
        return '(' + W0() + ".." + X0() + ')';
    }

    @Override // Hb.InterfaceC1111x
    public boolean z0() {
        return (W0().O0().t() instanceof Ra.m0) && C3862t.b(W0().O0(), X0().O0());
    }
}
