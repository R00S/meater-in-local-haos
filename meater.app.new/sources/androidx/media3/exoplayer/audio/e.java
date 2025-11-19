package androidx.media3.exoplayer.audio;

import U1.s;
import X1.C1804a;
import X1.L;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink;
import d2.C3030b;
import d2.C3031c;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26769a;

        /* renamed from: b, reason: collision with root package name */
        private final e f26770b;

        public a(Handler handler, e eVar) {
            this.f26769a = eVar != null ? (Handler) C1804a.e(handler) : null;
            this.f26770b = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(String str) {
            ((e) L.i(this.f26770b)).k(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void B(C3030b c3030b) {
            c3030b.c();
            ((e) L.i(this.f26770b)).o(c3030b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void C(C3030b c3030b) {
            ((e) L.i(this.f26770b)).n(c3030b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void D(s sVar, C3031c c3031c) {
            ((e) L.i(this.f26770b)).u(sVar, c3031c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void E(long j10) {
            ((e) L.i(this.f26770b)).t(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F(boolean z10) {
            ((e) L.i(this.f26770b)).e(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void G(int i10, long j10, long j11) {
            ((e) L.i(this.f26770b)).A(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(Exception exc) {
            ((e) L.i(this.f26770b)).v(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Exception exc) {
            ((e) L.i(this.f26770b)).f(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(AudioSink.a aVar) {
            ((e) L.i(this.f26770b)).a(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(AudioSink.a aVar) {
            ((e) L.i(this.f26770b)).b(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(String str, long j10, long j11) {
            ((e) L.i(this.f26770b)).l(str, j10, j11);
        }

        public void H(final long j10) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41254B.E(j10);
                    }
                });
            }
        }

        public void I(final boolean z10) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41260B.F(z10);
                    }
                });
            }
        }

        public void J(final int i10, final long j10, final long j11) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41256B.G(i10, j10, j11);
                    }
                });
            }
        }

        public void m(final Exception exc) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41239B.v(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41241B.w(exc);
                    }
                });
            }
        }

        public void o(final AudioSink.a aVar) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41235B.x(aVar);
                    }
                });
            }
        }

        public void p(final AudioSink.a aVar) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41237B.y(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41246B.z(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41250B.A(str);
                    }
                });
            }
        }

        public void s(final C3030b c3030b) {
            c3030b.c();
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41252B.B(c3030b);
                    }
                });
            }
        }

        public void t(final C3030b c3030b) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41233B.C(c3030b);
                    }
                });
            }
        }

        public void u(final s sVar, final C3031c c3031c) {
            Handler handler = this.f26769a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41243B.D(sVar, c3031c);
                    }
                });
            }
        }
    }

    default void a(AudioSink.a aVar) {
    }

    default void b(AudioSink.a aVar) {
    }

    default void e(boolean z10) {
    }

    default void f(Exception exc) {
    }

    default void k(String str) {
    }

    default void n(C3030b c3030b) {
    }

    default void o(C3030b c3030b) {
    }

    default void t(long j10) {
    }

    default void v(Exception exc) {
    }

    default void u(s sVar, C3031c c3031c) {
    }

    default void A(int i10, long j10, long j11) {
    }

    default void l(String str, long j10, long j11) {
    }
}
