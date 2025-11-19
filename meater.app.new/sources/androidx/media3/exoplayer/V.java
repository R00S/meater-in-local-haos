package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import e2.v1;

/* compiled from: LoadControl.java */
/* loaded from: classes.dex */
public interface V {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final r.b f26544a = new r.b(new Object());

    /* compiled from: LoadControl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final v1 f26545a;

        /* renamed from: b, reason: collision with root package name */
        public final U1.G f26546b;

        /* renamed from: c, reason: collision with root package name */
        public final r.b f26547c;

        /* renamed from: d, reason: collision with root package name */
        public final long f26548d;

        /* renamed from: e, reason: collision with root package name */
        public final long f26549e;

        /* renamed from: f, reason: collision with root package name */
        public final float f26550f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f26551g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f26552h;

        /* renamed from: i, reason: collision with root package name */
        public final long f26553i;

        public a(v1 v1Var, U1.G g10, r.b bVar, long j10, long j11, float f10, boolean z10, boolean z11, long j12) {
            this.f26545a = v1Var;
            this.f26546b = g10;
            this.f26547c = bVar;
            this.f26548d = j10;
            this.f26549e = j11;
            this.f26550f = f10;
            this.f26551g = z10;
            this.f26552h = z11;
            this.f26553i = j12;
        }
    }

    default boolean a(a aVar) {
        return b(aVar.f26546b, aVar.f26547c, aVar.f26549e, aVar.f26550f, aVar.f26552h, aVar.f26553i);
    }

    @Deprecated
    default boolean b(U1.G g10, r.b bVar, long j10, float f10, boolean z10, long j11) {
        return l(j10, f10, z10, j11);
    }

    @Deprecated
    default boolean c() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean d(a aVar) {
        return m(aVar.f26548d, aVar.f26549e, aVar.f26550f);
    }

    default void e(a aVar, n2.x xVar, q2.x[] xVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean f(U1.G g10, r.b bVar, long j10) {
        X1.n.h("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void g(v1 v1Var) {
        k();
    }

    @Deprecated
    default long h() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void i(v1 v1Var) {
        p();
    }

    @Deprecated
    default void j() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void k() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default boolean l(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default boolean m(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default long n(v1 v1Var) {
        return h();
    }

    r2.b o();

    @Deprecated
    default void p() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void q(v1 v1Var) {
        j();
    }

    default boolean r(v1 v1Var) {
        return c();
    }
}
