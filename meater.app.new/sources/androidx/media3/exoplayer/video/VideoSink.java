package androidx.media3.exoplayer.video;

import U1.N;
import U1.s;
import X1.A;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final s f27889B;

        public VideoSinkException(Throwable th, s sVar) {
            super(th);
            this.f27889B = sVar;
        }
    }

    public interface b {
        void a(long j10);

        void b();
    }

    void A(Surface surface, A a10);

    Surface a();

    boolean b();

    void c();

    boolean d();

    void e(s sVar);

    void f();

    void g();

    void h(int i10);

    void i();

    void j(long j10, long j11);

    void k(float f10);

    void m(long j10, long j11, long j12, long j13);

    void n();

    void o(int i10, s sVar);

    void p(boolean z10);

    void q();

    void r(List<Object> list);

    void u(boolean z10);

    boolean v(boolean z10);

    void w(t2.h hVar);

    boolean x(long j10, boolean z10, long j11, long j12, b bVar);

    void y(a aVar, Executor executor);

    void z(boolean z10);

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27890a = new C0382a();

        void a(VideoSink videoSink);

        void b(VideoSink videoSink, N n10);

        void c(VideoSink videoSink);

        /* renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        class C0382a implements a {
            C0382a() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void a(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void c(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void b(VideoSink videoSink, N n10) {
            }
        }
    }
}
