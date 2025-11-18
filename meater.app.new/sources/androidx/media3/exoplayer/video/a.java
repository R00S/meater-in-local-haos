package androidx.media3.exoplayer.video;

import U1.s;
import X1.A;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: DefaultVideoSink.java */
/* loaded from: classes.dex */
final class a implements VideoSink {

    /* renamed from: a, reason: collision with root package name */
    private final h f27891a;

    /* renamed from: b, reason: collision with root package name */
    private final i f27892b;

    /* renamed from: c, reason: collision with root package name */
    private s f27893c = new s.b().M();

    public a(h hVar, i iVar) {
        this.f27891a = hVar;
        this.f27892b = iVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void A(Surface surface, A a10) {
        this.f27891a.q(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface a() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean d() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void f() {
        this.f27891a.k();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void g() {
        this.f27891a.g();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void h(int i10) {
        this.f27891a.n(i10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void i() {
        this.f27891a.a();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void j(long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void k(float f10) {
        this.f27891a.r(f10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void m(long j10, long j11, long j12, long j13) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void n() {
        this.f27891a.q(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void o(int i10, s sVar) {
        int i11 = sVar.f17169v;
        s sVar2 = this.f27893c;
        if (i11 != sVar2.f17169v || sVar.f17170w != sVar2.f17170w) {
            this.f27892b.g(i11, sVar.f17170w);
        }
        this.f27893c = sVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void p(boolean z10) {
        if (z10) {
            this.f27891a.m();
        }
        this.f27892b.b();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void q() {
        this.f27891a.l();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void r(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void u(boolean z10) {
        this.f27891a.e(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean v(boolean z10) {
        return this.f27891a.d(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void w(t2.h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean x(long j10, boolean z10, long j11, long j12, VideoSink.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void y(VideoSink.a aVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void z(boolean z10) {
        this.f27891a.h(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void c() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void e(s sVar) {
    }
}
