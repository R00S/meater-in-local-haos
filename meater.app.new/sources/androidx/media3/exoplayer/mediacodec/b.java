package androidx.media3.exoplayer.mediacodec;

import U1.z;
import X1.F;
import X1.L;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.h;
import java.nio.ByteBuffer;
import l8.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f27342a;

    /* renamed from: b, reason: collision with root package name */
    private final e f27343b;

    /* renamed from: c, reason: collision with root package name */
    private final i f27344c;

    /* renamed from: d, reason: collision with root package name */
    private final k2.h f27345d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27346e;

    /* renamed from: f, reason: collision with root package name */
    private int f27347f;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: androidx.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C0379b implements h.b {

        /* renamed from: a, reason: collision with root package name */
        private final s<HandlerThread> f27348a;

        /* renamed from: b, reason: collision with root package name */
        private final s<HandlerThread> f27349b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27350c;

        public C0379b(final int i10) {
            this(new s() { // from class: k2.b
                @Override // l8.s
                public final Object get() {
                    return b.C0379b.f(i10);
                }
            }, new s() { // from class: k2.c
                @Override // l8.s
                public final Object get() {
                    return b.C0379b.g(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.v(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread g(int i10) {
            return new HandlerThread(b.w(i10));
        }

        private static boolean h(U1.s sVar) {
            int i10 = L.f18626a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || z.s(sVar.f17162o);
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(h.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            i cVar;
            int i10;
            int i11;
            b bVar;
            String str = aVar.f27388a.f27394a;
            b bVar2 = null;
            try {
                F.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f27350c && h(aVar.f27390c)) {
                        cVar = new q(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        cVar = new c(mediaCodecCreateByCodecName, this.f27349b.get());
                        i10 = 0;
                    }
                    i iVar = cVar;
                    i11 = i10;
                    bVar = new b(mediaCodecCreateByCodecName, this.f27348a.get(), iVar, aVar.f27393f);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                F.b();
                Surface surface = aVar.f27391d;
                if (surface == null && aVar.f27388a.f27404k && L.f18626a >= 35) {
                    i11 |= 8;
                }
                bVar.y(aVar.f27389b, surface, aVar.f27392e, i11);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.c();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        public void e(boolean z10) {
            this.f27350c = z10;
        }

        C0379b(s<HandlerThread> sVar, s<HandlerThread> sVar2) {
            this.f27348a = sVar;
            this.f27349b = sVar2;
            this.f27350c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return x(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(int i10) {
        return x(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String x(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        k2.h hVar;
        this.f27343b.h(this.f27342a);
        F.a("configureCodec");
        this.f27342a.configure(mediaFormat, surface, mediaCrypto, i10);
        F.b();
        this.f27344c.start();
        F.a("startCodec");
        this.f27342a.start();
        F.b();
        if (L.f18626a >= 35 && (hVar = this.f27345d) != null) {
            hVar.b(this.f27342a);
        }
        this.f27347f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, c2.c cVar, long j10, int i12) {
        this.f27344c.a(i10, i11, cVar, j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f27344c.b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c() {
        k2.h hVar;
        k2.h hVar2;
        try {
            if (this.f27347f == 1) {
                this.f27344c.shutdown();
                this.f27343b.q();
            }
            this.f27347f = 2;
            if (this.f27346e) {
                return;
            }
            try {
                int i10 = L.f18626a;
                if (i10 >= 30 && i10 < 33) {
                    this.f27342a.stop();
                }
                if (i10 >= 35 && (hVar2 = this.f27345d) != null) {
                    hVar2.d(this.f27342a);
                }
                this.f27342a.release();
                this.f27346e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f27346e) {
                try {
                    int i11 = L.f18626a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f27342a.stop();
                    }
                    if (i11 >= 35 && (hVar = this.f27345d) != null) {
                        hVar.d(this.f27342a);
                    }
                    this.f27342a.release();
                    this.f27346e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void d(int i10, int i11, int i12, long j10, int i13) {
        this.f27344c.d(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean e(h.c cVar) {
        this.f27343b.p(cVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean f() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f27344c.flush();
        this.f27342a.flush();
        this.f27343b.e();
        this.f27342a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(final h.d dVar, Handler handler) {
        this.f27342a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f27340a.z(dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat h() {
        return this.f27343b.g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void i() {
        this.f27342a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(int i10, long j10) {
        this.f27342a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int k() {
        this.f27344c.c();
        return this.f27343b.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.f27344c.c();
        return this.f27343b.d(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void m(int i10, boolean z10) {
        this.f27342a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void n(int i10) {
        this.f27342a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer o(int i10) {
        return this.f27342a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void p(Surface surface) {
        this.f27342a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer q(int i10) {
        return this.f27342a.getOutputBuffer(i10);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, i iVar, k2.h hVar) {
        this.f27342a = mediaCodec;
        this.f27343b = new e(handlerThread);
        this.f27344c = iVar;
        this.f27345d = hVar;
        this.f27347f = 0;
    }
}
