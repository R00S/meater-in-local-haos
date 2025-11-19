package androidx.media3.exoplayer.mediacodec;

import X1.C1804a;
import X1.L;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.h;
import java.util.ArrayDeque;
import s.C4395e;

/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes.dex */
final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f27368b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f27369c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f27374h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f27375i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f27376j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f27377k;

    /* renamed from: l, reason: collision with root package name */
    private long f27378l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27379m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f27380n;

    /* renamed from: o, reason: collision with root package name */
    private h.c f27381o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27367a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C4395e f27370d = new C4395e();

    /* renamed from: e, reason: collision with root package name */
    private final C4395e f27371e = new C4395e();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f27372f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f27373g = new ArrayDeque<>();

    e(HandlerThread handlerThread) {
        this.f27368b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f27371e.a(-2);
        this.f27373g.add(mediaFormat);
    }

    private void f() {
        if (!this.f27373g.isEmpty()) {
            this.f27375i = this.f27373g.getLast();
        }
        this.f27370d.b();
        this.f27371e.b();
        this.f27372f.clear();
        this.f27373g.clear();
    }

    private boolean i() {
        return this.f27378l > 0 || this.f27379m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f27380n;
        if (illegalStateException == null) {
            return;
        }
        this.f27380n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f27377k;
        if (cryptoException == null) {
            return;
        }
        this.f27377k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f27376j;
        if (codecException == null) {
            return;
        }
        this.f27376j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f27367a) {
            try {
                if (this.f27379m) {
                    return;
                }
                long j10 = this.f27378l - 1;
                this.f27378l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f27367a) {
            this.f27380n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f27367a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f27370d.d()) {
                    iE = this.f27370d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f27367a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f27371e.d()) {
                    return -1;
                }
                int iE = this.f27371e.e();
                if (iE >= 0) {
                    C1804a.i(this.f27374h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f27372f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f27374h = this.f27373g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f27367a) {
            this.f27378l++;
            ((Handler) L.i(this.f27369c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27366B.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f27367a) {
            try {
                mediaFormat = this.f27374h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        C1804a.g(this.f27369c == null);
        this.f27368b.start();
        Handler handler = new Handler(this.f27368b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f27369c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f27367a) {
            this.f27377k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f27367a) {
            this.f27376j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f27367a) {
            try {
                this.f27370d.a(i10);
                h.c cVar = this.f27381o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f27367a) {
            try {
                MediaFormat mediaFormat = this.f27375i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f27375i = null;
                }
                this.f27371e.a(i10);
                this.f27372f.add(bufferInfo);
                h.c cVar = this.f27381o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f27367a) {
            b(mediaFormat);
            this.f27375i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f27367a) {
            this.f27381o = cVar;
        }
    }

    public void q() {
        synchronized (this.f27367a) {
            this.f27379m = true;
            this.f27368b.quit();
            f();
        }
    }
}
