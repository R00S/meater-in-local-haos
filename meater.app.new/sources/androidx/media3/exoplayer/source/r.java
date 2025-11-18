package androidx.media3.exoplayer.source;

import S2.r;
import android.os.Handler;
import e2.v1;
import r2.e;

/* compiled from: MediaSource.java */
/* loaded from: classes.dex */
public interface r {

    /* compiled from: MediaSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f27812a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27813b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27814c;

        /* renamed from: d, reason: collision with root package name */
        public final long f27815d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27816e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f27812a.equals(obj) ? this : new b(obj, this.f27813b, this.f27814c, this.f27815d, this.f27816e);
        }

        public boolean b() {
            return this.f27813b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f27812a.equals(bVar.f27812a) && this.f27813b == bVar.f27813b && this.f27814c == bVar.f27814c && this.f27815d == bVar.f27815d && this.f27816e == bVar.f27816e;
        }

        public int hashCode() {
            return ((((((((527 + this.f27812a.hashCode()) * 31) + this.f27813b) * 31) + this.f27814c) * 31) + ((int) this.f27815d)) * 31) + this.f27816e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f27812a = obj;
            this.f27813b = i10;
            this.f27814c = i11;
            this.f27815d = j10;
            this.f27816e = i12;
        }
    }

    /* compiled from: MediaSource.java */
    public interface c {
        void a(r rVar, U1.G g10);
    }

    q a(b bVar, r2.b bVar2, long j10);

    void b(Handler handler, s sVar);

    void c(c cVar);

    void d(s sVar);

    void e(c cVar);

    void f(c cVar);

    U1.v h();

    void i();

    default boolean k() {
        return true;
    }

    default U1.G l() {
        return null;
    }

    void m(c cVar, a2.n nVar, v1 v1Var);

    void n(Handler handler, androidx.media3.exoplayer.drm.h hVar);

    void o(androidx.media3.exoplayer.drm.h hVar);

    void p(q qVar);

    /* compiled from: MediaSource.java */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27811a = t.f27822b;

        r c(U1.v vVar);

        a d(androidx.media3.exoplayer.upstream.b bVar);

        a e(i2.k kVar);

        default a a(r.a aVar) {
            return this;
        }

        @Deprecated
        default a b(boolean z10) {
            return this;
        }

        default a f(e.a aVar) {
            return this;
        }
    }

    default void j(U1.v vVar) {
    }
}
