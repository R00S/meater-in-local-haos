package ub;

import Ab.k;
import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.u0;
import Ib.g;
import Jb.h;
import Jb.l;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: ub.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4699a extends AbstractC1082f0 implements Lb.d {

    /* renamed from: C, reason: collision with root package name */
    private final E0 f50522C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4700b f50523D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f50524E;

    /* renamed from: F, reason: collision with root package name */
    private final u0 f50525F;

    public /* synthetic */ C4699a(E0 e02, InterfaceC4700b interfaceC4700b, boolean z10, u0 u0Var, int i10, C3854k c3854k) {
        this(e02, (i10 & 2) != 0 ? new C4701c(e02) : interfaceC4700b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? u0.f5791C.j() : u0Var);
    }

    @Override // Hb.U
    public List<E0> M0() {
        return r.m();
    }

    @Override // Hb.U
    public u0 N0() {
        return this.f50525F;
    }

    @Override // Hb.U
    public boolean P0() {
        return this.f50524E;
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new C4699a(this.f50522C, O0(), P0(), newAttributes);
    }

    @Override // Hb.U
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4700b O0() {
        return this.f50523D;
    }

    @Override // Hb.AbstractC1082f0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C4699a S0(boolean z10) {
        return z10 == P0() ? this : new C4699a(this.f50522C, O0(), z10, N0());
    }

    @Override // Hb.P0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C4699a Y0(g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        E0 e0R = this.f50522C.r(kotlinTypeRefiner);
        C3862t.f(e0R, "refine(...)");
        return new C4699a(e0R, O0(), P0(), N0());
    }

    @Override // Hb.U
    public k s() {
        return l.a(h.f7680C, true, new String[0]);
    }

    @Override // Hb.AbstractC1082f0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f50522C);
        sb2.append(')');
        sb2.append(P0() ? "?" : "");
        return sb2.toString();
    }

    public C4699a(E0 typeProjection, InterfaceC4700b constructor, boolean z10, u0 attributes) {
        C3862t.g(typeProjection, "typeProjection");
        C3862t.g(constructor, "constructor");
        C3862t.g(attributes, "attributes");
        this.f50522C = typeProjection;
        this.f50523D = constructor;
        this.f50524E = z10;
        this.f50525F = attributes;
    }
}
