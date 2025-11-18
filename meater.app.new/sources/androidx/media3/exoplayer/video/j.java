package androidx.media3.exoplayer.video;

import U1.N;
import U1.s;
import X1.C1804a;
import X1.L;
import android.os.Handler;
import android.os.SystemClock;
import d2.C3030b;
import d2.C3031c;

/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f28021a;

        /* renamed from: b, reason: collision with root package name */
        private final j f28022b;

        public a(Handler handler, j jVar) {
            this.f28021a = jVar != null ? (Handler) C1804a.e(handler) : null;
            this.f28022b = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((j) L.i(this.f28022b)).h(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((j) L.i(this.f28022b)).g(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(C3030b c3030b) {
            c3030b.c();
            ((j) L.i(this.f28022b)).j(c3030b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((j) L.i(this.f28022b)).m(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(C3030b c3030b) {
            ((j) L.i(this.f28022b)).y(c3030b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(s sVar, C3031c c3031c) {
            ((j) L.i(this.f28022b)).r(sVar, c3031c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((j) L.i(this.f28022b)).p(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((j) L.i(this.f28022b)).B(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((j) L.i(this.f28022b)).w(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(N n10) {
            ((j) L.i(this.f28022b)).d(n10);
        }

        public void A(final Object obj) {
            if (this.f28021a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f28021a.post(new Runnable() { // from class: t2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49887B.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49890B.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49893B.y(exc);
                    }
                });
            }
        }

        public void D(final N n10) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49882B.z(n10);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49878B.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49902B.r(str);
                    }
                });
            }
        }

        public void m(final C3030b c3030b) {
            c3030b.c();
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49900B.s(c3030b);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49884B.t(i10, j10);
                    }
                });
            }
        }

        public void o(final C3030b c3030b) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49895B.u(c3030b);
                    }
                });
            }
        }

        public void p(final s sVar, final C3031c c3031c) {
            Handler handler = this.f28021a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49897B.v(sVar, c3031c);
                    }
                });
            }
        }
    }

    default void d(N n10) {
    }

    default void g(String str) {
    }

    default void j(C3030b c3030b) {
    }

    default void w(Exception exc) {
    }

    default void y(C3030b c3030b) {
    }

    default void B(long j10, int i10) {
    }

    default void m(int i10, long j10) {
    }

    default void p(Object obj, long j10) {
    }

    default void r(s sVar, C3031c c3031c) {
    }

    default void h(String str, long j10, long j11) {
    }
}
