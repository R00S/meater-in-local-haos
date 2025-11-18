package U1;

import U1.q;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;
import l8.C3918k;

/* compiled from: Player.java */
/* loaded from: classes.dex */
public interface B {

    /* compiled from: Player.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f16778b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        private static final String f16779c = X1.L.B0(0);

        /* renamed from: a, reason: collision with root package name */
        private final q f16780a;

        /* compiled from: Player.java */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            private static final int[] f16781b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            private final q.b f16782a = new q.b();

            public a a(int i10) {
                this.f16782a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f16782a.b(bVar.f16780a);
                return this;
            }

            public a c(int... iArr) {
                this.f16782a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f16782a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f16782a.e());
            }
        }

        public boolean b(int i10) {
            return this.f16780a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f16780a.equals(((b) obj).f16780a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16780a.hashCode();
        }

        private b(q qVar) {
            this.f16780a = qVar;
        }
    }

    /* compiled from: Player.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final q f16783a;

        public c(q qVar) {
            this.f16783a = qVar;
        }

        public boolean a(int... iArr) {
            return this.f16783a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f16783a.equals(((c) obj).f16783a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16783a.hashCode();
        }
    }

    /* compiled from: Player.java */
    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        static final String f16784k = X1.L.B0(0);

        /* renamed from: l, reason: collision with root package name */
        private static final String f16785l = X1.L.B0(1);

        /* renamed from: m, reason: collision with root package name */
        static final String f16786m = X1.L.B0(2);

        /* renamed from: n, reason: collision with root package name */
        static final String f16787n = X1.L.B0(3);

        /* renamed from: o, reason: collision with root package name */
        static final String f16788o = X1.L.B0(4);

        /* renamed from: p, reason: collision with root package name */
        private static final String f16789p = X1.L.B0(5);

        /* renamed from: q, reason: collision with root package name */
        private static final String f16790q = X1.L.B0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f16791a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f16792b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16793c;

        /* renamed from: d, reason: collision with root package name */
        public final v f16794d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f16795e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16796f;

        /* renamed from: g, reason: collision with root package name */
        public final long f16797g;

        /* renamed from: h, reason: collision with root package name */
        public final long f16798h;

        /* renamed from: i, reason: collision with root package name */
        public final int f16799i;

        /* renamed from: j, reason: collision with root package name */
        public final int f16800j;

        public e(Object obj, int i10, v vVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f16791a = obj;
            this.f16792b = i10;
            this.f16793c = i10;
            this.f16794d = vVar;
            this.f16795e = obj2;
            this.f16796f = i11;
            this.f16797g = j10;
            this.f16798h = j11;
            this.f16799i = i12;
            this.f16800j = i13;
        }

        public boolean a(e eVar) {
            return this.f16793c == eVar.f16793c && this.f16796f == eVar.f16796f && this.f16797g == eVar.f16797g && this.f16798h == eVar.f16798h && this.f16799i == eVar.f16799i && this.f16800j == eVar.f16800j && C3918k.a(this.f16794d, eVar.f16794d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return a(eVar) && C3918k.a(this.f16791a, eVar.f16791a) && C3918k.a(this.f16795e, eVar.f16795e);
        }

        public int hashCode() {
            return C3918k.b(this.f16791a, Integer.valueOf(this.f16793c), this.f16794d, this.f16795e, Integer.valueOf(this.f16796f), Long.valueOf(this.f16797g), Long.valueOf(this.f16798h), Integer.valueOf(this.f16799i), Integer.valueOf(this.f16800j));
        }
    }

    void A(J j10);

    void B(long j10);

    void C(d dVar);

    void D();

    PlaybackException E();

    void F(boolean z10);

    long G();

    void H(d dVar);

    long I();

    boolean J();

    int K();

    K L();

    boolean M();

    boolean N();

    W1.b O();

    int P();

    int Q();

    boolean R(int i10);

    void S(int i10);

    void T(SurfaceView surfaceView);

    boolean U();

    int V();

    int W();

    G X();

    Looper Y();

    void Z(v vVar);

    boolean a0();

    long b();

    J b0();

    void c();

    long c0();

    void d0();

    void e(A a10);

    void e0();

    void f();

    void f0(TextureView textureView);

    void g0();

    A h();

    x h0();

    void i();

    long i0();

    void j();

    long j0();

    boolean k();

    boolean k0();

    long l();

    void m(int i10, long j10);

    b n();

    boolean o();

    void p(boolean z10);

    long q();

    long r();

    int s();

    void stop();

    void t(TextureView textureView);

    N u();

    void v();

    void w(List<v> list, boolean z10);

    boolean x();

    int y();

    void z(SurfaceView surfaceView);

    /* compiled from: Player.java */
    public interface d {
        default void d0() {
        }

        default void C(int i10) {
        }

        @Deprecated
        default void E(boolean z10) {
        }

        @Deprecated
        default void F(int i10) {
        }

        default void J(boolean z10) {
        }

        default void K(K k10) {
        }

        default void N(int i10) {
        }

        default void S(boolean z10) {
        }

        default void W(b bVar) {
        }

        default void Z(x xVar) {
        }

        default void b0(J j10) {
        }

        default void d(N n10) {
        }

        default void e(boolean z10) {
        }

        default void f0(PlaybackException playbackException) {
        }

        default void i(W1.b bVar) {
        }

        default void j0(PlaybackException playbackException) {
        }

        default void p0(boolean z10) {
        }

        default void q(int i10) {
        }

        @Deprecated
        default void s(List<W1.a> list) {
        }

        default void x(A a10) {
        }

        default void z(y yVar) {
        }

        default void H(G g10, int i10) {
        }

        default void X(int i10, boolean z10) {
        }

        @Deprecated
        default void Y(boolean z10, int i10) {
        }

        default void a0(v vVar, int i10) {
        }

        default void g0(boolean z10, int i10) {
        }

        default void k0(int i10, int i11) {
        }

        default void o0(B b10, c cVar) {
        }

        default void U(e eVar, e eVar2, int i10) {
        }
    }
}
