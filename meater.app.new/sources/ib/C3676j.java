package ib;

import Hb.AbstractC1082f0;
import Hb.InterfaceC1076c0;
import Hb.M0;
import Hb.O0;
import Hb.P0;
import Hb.u0;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeEnhancement.kt */
/* renamed from: ib.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3676j extends Hb.B implements InterfaceC1076c0 {

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f43275C;

    public C3676j(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        this.f43275C = delegate;
    }

    private final AbstractC1082f0 a1(AbstractC1082f0 abstractC1082f0) {
        AbstractC1082f0 abstractC1082f0S0 = abstractC1082f0.S0(false);
        return !Mb.d.y(abstractC1082f0) ? abstractC1082f0S0 : new C3676j(abstractC1082f0S0);
    }

    @Override // Hb.InterfaceC1111x
    public Hb.U F0(Hb.U replacement) {
        C3862t.g(replacement, "replacement");
        P0 p0R0 = replacement.R0();
        if (!Mb.d.y(p0R0) && !M0.l(p0R0)) {
            return p0R0;
        }
        if (p0R0 instanceof AbstractC1082f0) {
            return a1((AbstractC1082f0) p0R0);
        }
        if (p0R0 instanceof Hb.K) {
            Hb.K k10 = (Hb.K) p0R0;
            return O0.d(Hb.X.e(a1(k10.W0()), a1(k10.X0())), O0.a(p0R0));
        }
        throw new IllegalStateException(("Incorrect type: " + p0R0).toString());
    }

    @Override // Hb.B, Hb.U
    public boolean P0() {
        return false;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        return z10 ? X0().S0(true) : this;
    }

    @Override // Hb.B
    protected AbstractC1082f0 X0() {
        return this.f43275C;
    }

    @Override // Hb.AbstractC1082f0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3676j U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new C3676j(X0().U0(newAttributes));
    }

    @Override // Hb.B
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C3676j Z0(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        return new C3676j(delegate);
    }

    @Override // Hb.InterfaceC1111x
    public boolean z0() {
        return true;
    }
}
