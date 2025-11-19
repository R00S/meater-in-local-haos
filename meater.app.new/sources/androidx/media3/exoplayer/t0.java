package androidx.media3.exoplayer;

import X1.InterfaceC1807d;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.source.r;
import d2.InterfaceC3027E;
import e2.v1;

/* compiled from: Renderer.java */
/* loaded from: classes.dex */
public interface t0 extends r0.b {

    /* compiled from: Renderer.java */
    public interface a {
        void a();

        void b();
    }

    u0 A();

    void K();

    long L();

    void M(U1.s[] sVarArr, n2.s sVar, long j10, long j11, r.b bVar);

    void P(long j10);

    boolean Q();

    InterfaceC3027E R();

    void S(U1.G g10);

    void b();

    boolean d();

    boolean f();

    void g();

    String getName();

    int getState();

    void j(long j10, long j11);

    n2.s k();

    int l();

    boolean p();

    default long r(long j10, long j11) {
        return 10000L;
    }

    void start();

    void stop();

    void t(d2.G g10, U1.s[] sVarArr, n2.s sVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar);

    void u(int i10, v1 v1Var, InterfaceC1807d interfaceC1807d);

    void v();

    default void c() {
    }

    default void i() {
    }

    default void D(float f10, float f11) {
    }
}
