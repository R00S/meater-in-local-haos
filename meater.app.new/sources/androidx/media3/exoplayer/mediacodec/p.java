package androidx.media3.exoplayer.mediacodec;

import X1.C1804a;
import X1.F;
import X1.L;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.h;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f27410a;

    /* renamed from: b, reason: collision with root package name */
    private final k2.h f27411b;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    public static class b implements h.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.p$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.h.b
        @android.annotation.SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.media3.exoplayer.mediacodec.h a(androidx.media3.exoplayer.mediacodec.h.a r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.b(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                X1.F.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.f27391d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                androidx.media3.exoplayer.mediacodec.j r3 = r7.f27388a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.f27404k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = X1.L.f18626a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.f27389b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.f27392e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                X1.F.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                X1.F.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                X1.F.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.p r2 = new androidx.media3.exoplayer.mediacodec.p     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                k2.h r7 = r7.f27393f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.p.b.a(androidx.media3.exoplayer.mediacodec.h$a):androidx.media3.exoplayer.mediacodec.h");
        }

        protected MediaCodec b(h.a aVar) throws IOException {
            C1804a.e(aVar.f27388a);
            String str = aVar.f27388a.f27394a;
            F.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            F.b();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, c2.c cVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f27410a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f27410a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c() {
        k2.h hVar;
        k2.h hVar2;
        try {
            int i10 = L.f18626a;
            if (i10 >= 30 && i10 < 33) {
                this.f27410a.stop();
            }
            if (i10 >= 35 && (hVar2 = this.f27411b) != null) {
                hVar2.d(this.f27410a);
            }
            this.f27410a.release();
        } catch (Throwable th) {
            if (L.f18626a >= 35 && (hVar = this.f27411b) != null) {
                hVar.d(this.f27410a);
            }
            this.f27410a.release();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void d(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f27410a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean f() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f27410a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(final h.d dVar, Handler handler) {
        this.f27410a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k2.u
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f43741a.s(dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat h() {
        return this.f27410a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void i() {
        this.f27410a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(int i10, long j10) {
        this.f27410a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int k() {
        return this.f27410a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f27410a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void m(int i10, boolean z10) {
        this.f27410a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void n(int i10) {
        this.f27410a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer o(int i10) {
        return this.f27410a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void p(Surface surface) {
        this.f27410a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer q(int i10) {
        return this.f27410a.getOutputBuffer(i10);
    }

    private p(MediaCodec mediaCodec, k2.h hVar) {
        this.f27410a = mediaCodec;
        this.f27411b = hVar;
        if (L.f18626a < 35 || hVar == null) {
            return;
        }
        hVar.b(mediaCodec);
    }
}
