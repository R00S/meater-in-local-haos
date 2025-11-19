package androidx.media3.exoplayer;

import X1.C1804a;
import X1.InterfaceC1807d;
import d2.InterfaceC3027E;

/* compiled from: DefaultMediaClock.java */
/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2126h implements InterfaceC3027E {

    /* renamed from: B, reason: collision with root package name */
    private final d2.J f27208B;

    /* renamed from: C, reason: collision with root package name */
    private final a f27209C;

    /* renamed from: D, reason: collision with root package name */
    private t0 f27210D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC3027E f27211E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f27212F = true;

    /* renamed from: G, reason: collision with root package name */
    private boolean f27213G;

    /* compiled from: DefaultMediaClock.java */
    /* renamed from: androidx.media3.exoplayer.h$a */
    public interface a {
        void x(U1.A a10);
    }

    public C2126h(a aVar, InterfaceC1807d interfaceC1807d) {
        this.f27209C = aVar;
        this.f27208B = new d2.J(interfaceC1807d);
    }

    private boolean d(boolean z10) {
        t0 t0Var = this.f27210D;
        return t0Var == null || t0Var.d() || (z10 && this.f27210D.getState() != 2) || (!this.f27210D.f() && (z10 || this.f27210D.p()));
    }

    private void j(boolean z10) {
        if (d(z10)) {
            this.f27212F = true;
            if (this.f27213G) {
                this.f27208B.b();
                return;
            }
            return;
        }
        InterfaceC3027E interfaceC3027E = (InterfaceC3027E) C1804a.e(this.f27211E);
        long jC = interfaceC3027E.C();
        if (this.f27212F) {
            if (jC < this.f27208B.C()) {
                this.f27208B.c();
                return;
            } else {
                this.f27212F = false;
                if (this.f27213G) {
                    this.f27208B.b();
                }
            }
        }
        this.f27208B.a(jC);
        U1.A aH = interfaceC3027E.h();
        if (aH.equals(this.f27208B.h())) {
            return;
        }
        this.f27208B.e(aH);
        this.f27209C.x(aH);
    }

    @Override // d2.InterfaceC3027E
    public long C() {
        return this.f27212F ? this.f27208B.C() : ((InterfaceC3027E) C1804a.e(this.f27211E)).C();
    }

    @Override // d2.InterfaceC3027E
    public boolean H() {
        return this.f27212F ? this.f27208B.H() : ((InterfaceC3027E) C1804a.e(this.f27211E)).H();
    }

    public void a(t0 t0Var) {
        if (t0Var == this.f27210D) {
            this.f27211E = null;
            this.f27210D = null;
            this.f27212F = true;
        }
    }

    public void b(t0 t0Var) throws ExoPlaybackException {
        InterfaceC3027E interfaceC3027E;
        InterfaceC3027E interfaceC3027ER = t0Var.R();
        if (interfaceC3027ER == null || interfaceC3027ER == (interfaceC3027E = this.f27211E)) {
            return;
        }
        if (interfaceC3027E != null) {
            throw ExoPlaybackException.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f27211E = interfaceC3027ER;
        this.f27210D = t0Var;
        interfaceC3027ER.e(this.f27208B.h());
    }

    public void c(long j10) {
        this.f27208B.a(j10);
    }

    @Override // d2.InterfaceC3027E
    public void e(U1.A a10) {
        InterfaceC3027E interfaceC3027E = this.f27211E;
        if (interfaceC3027E != null) {
            interfaceC3027E.e(a10);
            a10 = this.f27211E.h();
        }
        this.f27208B.e(a10);
    }

    public void f() {
        this.f27213G = true;
        this.f27208B.b();
    }

    public void g() {
        this.f27213G = false;
        this.f27208B.c();
    }

    @Override // d2.InterfaceC3027E
    public U1.A h() {
        InterfaceC3027E interfaceC3027E = this.f27211E;
        return interfaceC3027E != null ? interfaceC3027E.h() : this.f27208B.h();
    }

    public long i(boolean z10) {
        j(z10);
        return C();
    }
}
