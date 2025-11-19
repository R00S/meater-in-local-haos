package androidx.media3.exoplayer.mediacodec;

import X1.C1804a;
import X1.C1810g;
import X1.L;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
class c implements i {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f27351g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f27352h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f27353a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f27354b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f27355c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f27356d;

    /* renamed from: e, reason: collision with root package name */
    private final C1810g f27357e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27358f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws MediaCodec.CryptoException {
            c.this.j(message);
        }
    }

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f27360a;

        /* renamed from: b, reason: collision with root package name */
        public int f27361b;

        /* renamed from: c, reason: collision with root package name */
        public int f27362c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f27363d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f27364e;

        /* renamed from: f, reason: collision with root package name */
        public int f27365f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f27360a = i10;
            this.f27361b = i11;
            this.f27362c = i12;
            this.f27364e = j10;
            this.f27365f = i13;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1810g());
    }

    private void f() {
        this.f27357e.c();
        ((Handler) C1804a.e(this.f27355c)).obtainMessage(3).sendToTarget();
        this.f27357e.a();
    }

    private static void g(c2.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f30922f;
        cryptoInfo.numBytesOfClearData = i(cVar.f30920d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f30921e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C1804a.e(h(cVar.f30918b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C1804a.e(h(cVar.f30917a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f30919c;
        if (L.f18626a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f30923g, cVar.f30924h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Message message) throws MediaCodec.CryptoException {
        b bVar;
        int i10 = message.what;
        if (i10 == 1) {
            bVar = (b) message.obj;
            k(bVar.f27360a, bVar.f27361b, bVar.f27362c, bVar.f27364e, bVar.f27365f);
        } else if (i10 != 2) {
            bVar = null;
            if (i10 == 3) {
                this.f27357e.e();
            } else if (i10 != 4) {
                C4734X.a(this.f27356d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m((Bundle) message.obj);
            }
        } else {
            bVar = (b) message.obj;
            l(bVar.f27360a, bVar.f27361b, bVar.f27363d, bVar.f27364e, bVar.f27365f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    private void k(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        try {
            this.f27353a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            C4734X.a(this.f27356d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f27352h) {
                this.f27353a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            C4734X.a(this.f27356d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f27353a.setParameters(bundle);
        } catch (RuntimeException e10) {
            C4734X.a(this.f27356d, null, e10);
        }
    }

    private void n() {
        ((Handler) C1804a.e(this.f27355c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = f27351g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f27351g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, c2.c cVar, long j10, int i12) {
        c();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        g(cVar, bVarO.f27363d);
        ((Handler) L.i(this.f27355c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        c();
        ((Handler) L.i(this.f27355c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c() {
        RuntimeException andSet = this.f27356d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void d(int i10, int i11, int i12, long j10, int i13) {
        c();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) L.i(this.f27355c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
        if (this.f27358f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
        if (this.f27358f) {
            flush();
            this.f27354b.quit();
        }
        this.f27358f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
        if (this.f27358f) {
            return;
        }
        this.f27354b.start();
        this.f27355c = new a(this.f27354b.getLooper());
        this.f27358f = true;
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, C1810g c1810g) {
        this.f27353a = mediaCodec;
        this.f27354b = handlerThread;
        this.f27357e = c1810g;
        this.f27356d = new AtomicReference<>();
    }
}
