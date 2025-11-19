package Ib;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.P0;
import Hb.u0;
import Ra.m0;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class i extends AbstractC1082f0 implements Lb.d {

    /* renamed from: C, reason: collision with root package name */
    private final Lb.b f6984C;

    /* renamed from: D, reason: collision with root package name */
    private final n f6985D;

    /* renamed from: E, reason: collision with root package name */
    private final P0 f6986E;

    /* renamed from: F, reason: collision with root package name */
    private final u0 f6987F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f6988G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f6989H;

    public /* synthetic */ i(Lb.b bVar, n nVar, P0 p02, u0 u0Var, boolean z10, boolean z11, int i10, C3854k c3854k) {
        this(bVar, nVar, p02, (i10 & 8) != 0 ? u0.f5791C.j() : u0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // Hb.U
    public List<E0> M0() {
        return kotlin.collections.r.m();
    }

    @Override // Hb.U
    public u0 N0() {
        return this.f6987F;
    }

    @Override // Hb.U
    public boolean P0() {
        return this.f6988G;
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new i(this.f6984C, O0(), this.f6986E, newAttributes, P0(), this.f6989H);
    }

    public final Lb.b X0() {
        return this.f6984C;
    }

    @Override // Hb.U
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public n O0() {
        return this.f6985D;
    }

    public final P0 Z0() {
        return this.f6986E;
    }

    public final boolean a1() {
        return this.f6989H;
    }

    @Override // Hb.AbstractC1082f0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public i S0(boolean z10) {
        return new i(this.f6984C, O0(), this.f6986E, N0(), z10, false, 32, null);
    }

    @Override // Hb.P0
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public i Y0(g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Lb.b bVar = this.f6984C;
        n nVarR = O0().r(kotlinTypeRefiner);
        P0 p02 = this.f6986E;
        return new i(bVar, nVarR, p02 != null ? kotlinTypeRefiner.a(p02).R0() : null, N0(), P0(), false, 32, null);
    }

    @Override // Hb.U
    public Ab.k s() {
        return Jb.l.a(Jb.h.f7680C, true, new String[0]);
    }

    public i(Lb.b captureStatus, n constructor, P0 p02, u0 attributes, boolean z10, boolean z11) {
        C3862t.g(captureStatus, "captureStatus");
        C3862t.g(constructor, "constructor");
        C3862t.g(attributes, "attributes");
        this.f6984C = captureStatus;
        this.f6985D = constructor;
        this.f6986E = p02;
        this.f6987F = attributes;
        this.f6988G = z10;
        this.f6989H = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Lb.b captureStatus, P0 p02, E0 projection, m0 typeParameter) {
        this(captureStatus, new n(projection, null, null, typeParameter, 6, null), p02, null, false, false, 56, null);
        C3862t.g(captureStatus, "captureStatus");
        C3862t.g(projection, "projection");
        C3862t.g(typeParameter, "typeParameter");
    }
}
