package U1;

import U1.G;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: BasePlayer.java */
/* renamed from: U1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1731g implements B {

    /* renamed from: a, reason: collision with root package name */
    protected final G.c f17046a = new G.c();

    protected AbstractC1731g() {
    }

    private int m0() {
        int iW = W();
        if (iW == 1) {
            return 0;
        }
        return iW;
    }

    private void n0(int i10) {
        p0(-1, -9223372036854775807L, i10, false);
    }

    private void o0(int i10) {
        p0(Q(), -9223372036854775807L, i10, true);
    }

    private void q0(long j10, int i10) {
        p0(Q(), j10, i10, false);
    }

    private void r0(int i10, int i11) {
        p0(i10, -9223372036854775807L, i11, false);
    }

    private void s0(int i10) {
        int iG = g();
        if (iG == -1) {
            n0(i10);
        } else if (iG == Q()) {
            o0(i10);
        } else {
            r0(iG, i10);
        }
    }

    private void t0(long j10, int i10) {
        long jI0 = i0() + j10;
        long jB = b();
        if (jB != -9223372036854775807L) {
            jI0 = Math.min(jI0, jB);
        }
        q0(Math.max(jI0, 0L), i10);
    }

    private void u0(int i10) {
        int iL0 = l0();
        if (iL0 == -1) {
            n0(i10);
        } else if (iL0 == Q()) {
            o0(i10);
        } else {
            r0(iL0, i10);
        }
    }

    @Override // U1.B
    public final void B(long j10) {
        q0(j10, 5);
    }

    @Override // U1.B
    public final void D() {
        if (X().q() || k()) {
            n0(7);
            return;
        }
        boolean zX = x();
        if (k0() && !J()) {
            if (zX) {
                u0(7);
                return;
            } else {
                n0(7);
                return;
            }
        }
        if (!zX || i0() > q()) {
            q0(0L, 7);
        } else {
            u0(7);
        }
    }

    @Override // U1.B
    public final boolean J() {
        G gX = X();
        return !gX.q() && gX.n(Q(), this.f17046a).f16851h;
    }

    @Override // U1.B
    public final boolean M() {
        return g() != -1;
    }

    @Override // U1.B
    public final boolean N() {
        return K() == 3 && o() && V() == 0;
    }

    @Override // U1.B
    public final boolean R(int i10) {
        return n().b(i10);
    }

    @Override // U1.B
    public final boolean U() {
        G gX = X();
        return !gX.q() && gX.n(Q(), this.f17046a).f16852i;
    }

    @Override // U1.B
    public final void Z(v vVar) {
        v0(AbstractC4009y.H(vVar));
    }

    @Override // U1.B
    public final void d0() {
        if (X().q() || k()) {
            n0(9);
            return;
        }
        if (M()) {
            s0(9);
        } else if (k0() && U()) {
            r0(Q(), 9);
        } else {
            n0(9);
        }
    }

    @Override // U1.B
    public final void e0() {
        t0(G(), 12);
    }

    @Override // U1.B
    public final void f() {
        F(false);
    }

    public final int g() {
        G gX = X();
        if (gX.q()) {
            return -1;
        }
        return gX.e(Q(), m0(), a0());
    }

    @Override // U1.B
    public final void g0() {
        t0(-j0(), 11);
    }

    @Override // U1.B
    public final void j() {
        F(true);
    }

    @Override // U1.B
    public final boolean k0() {
        G gX = X();
        return !gX.q() && gX.n(Q(), this.f17046a).f();
    }

    public final int l0() {
        G gX = X();
        if (gX.q()) {
            return -1;
        }
        return gX.l(Q(), m0(), a0());
    }

    @Override // U1.B
    public final void m(int i10, long j10) {
        p0(i10, j10, 10, false);
    }

    public abstract void p0(int i10, long j10, int i11, boolean z10);

    @Override // U1.B
    public final long r() {
        G gX = X();
        if (gX.q()) {
            return -9223372036854775807L;
        }
        return gX.n(Q(), this.f17046a).d();
    }

    @Override // U1.B
    public final void v() {
        r0(Q(), 4);
    }

    public final void v0(List<v> list) {
        w(list, true);
    }

    @Override // U1.B
    public final boolean x() {
        return l0() != -1;
    }
}
