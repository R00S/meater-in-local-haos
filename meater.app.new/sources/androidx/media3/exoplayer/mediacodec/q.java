package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: SynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
class q implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f27412a;

    public q(MediaCodec mediaCodec) {
        this.f27412a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, c2.c cVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f27412a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        this.f27412a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void d(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f27412a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
    }
}
