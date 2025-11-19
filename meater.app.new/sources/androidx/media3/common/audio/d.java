package androidx.media3.common.audio;

import X1.C1804a;
import X1.L;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes.dex */
public class d implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    private int f26081b;

    /* renamed from: c, reason: collision with root package name */
    private float f26082c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f26083d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f26084e;

    /* renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f26085f;

    /* renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f26086g;

    /* renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f26087h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26088i;

    /* renamed from: j, reason: collision with root package name */
    private c f26089j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f26090k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f26091l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f26092m;

    /* renamed from: n, reason: collision with root package name */
    private long f26093n;

    /* renamed from: o, reason: collision with root package name */
    private long f26094o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26095p;

    public d() {
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26084e = aVar;
        this.f26085f = aVar;
        this.f26086g = aVar;
        this.f26087h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f26038a;
        this.f26090k = byteBuffer;
        this.f26091l = byteBuffer.asShortBuffer();
        this.f26092m = byteBuffer;
        this.f26081b = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean a() {
        return this.f26085f.f26041a != -1 && (Math.abs(this.f26082c - 1.0f) >= 1.0E-4f || Math.abs(this.f26083d - 1.0f) >= 1.0E-4f || this.f26085f.f26041a != this.f26084e.f26041a);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void b() {
        this.f26082c = 1.0f;
        this.f26083d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26084e = aVar;
        this.f26085f = aVar;
        this.f26086g = aVar;
        this.f26087h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f26038a;
        this.f26090k = byteBuffer;
        this.f26091l = byteBuffer.asShortBuffer();
        this.f26092m = byteBuffer;
        this.f26081b = -1;
        this.f26088i = false;
        this.f26089j = null;
        this.f26093n = 0L;
        this.f26094o = 0L;
        this.f26095p = false;
    }

    public final long c(long j10) {
        if (this.f26094o < 1024) {
            return (long) (this.f26082c * j10);
        }
        long jL = this.f26093n - ((c) C1804a.e(this.f26089j)).l();
        int i10 = this.f26087h.f26041a;
        int i11 = this.f26086g.f26041a;
        return i10 == i11 ? L.d1(j10, jL, this.f26094o) : L.d1(j10, jL * i10, this.f26094o * i11);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean d() {
        c cVar;
        return this.f26095p && ((cVar = this.f26089j) == null || cVar.k() == 0);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        int iK;
        c cVar = this.f26089j;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f26090k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f26090k = byteBufferOrder;
                this.f26091l = byteBufferOrder.asShortBuffer();
            } else {
                this.f26090k.clear();
                this.f26091l.clear();
            }
            cVar.j(this.f26091l);
            this.f26094o += iK;
            this.f26090k.limit(iK);
            this.f26092m = this.f26090k;
        }
        ByteBuffer byteBuffer = this.f26092m;
        this.f26092m = AudioProcessor.f26038a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c cVar = (c) C1804a.e(this.f26089j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f26093n += iRemaining;
            cVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f26084e;
            this.f26086g = aVar;
            AudioProcessor.a aVar2 = this.f26085f;
            this.f26087h = aVar2;
            if (this.f26088i) {
                this.f26089j = new c(aVar.f26041a, aVar.f26042b, this.f26082c, this.f26083d, aVar2.f26041a);
            } else {
                c cVar = this.f26089j;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f26092m = AudioProcessor.f26038a;
        this.f26093n = 0L;
        this.f26094o = 0L;
        this.f26095p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g() {
        c cVar = this.f26089j;
        if (cVar != null) {
            cVar.s();
        }
        this.f26095p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f26043c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f26081b;
        if (i10 == -1) {
            i10 = aVar.f26041a;
        }
        this.f26084e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f26042b, 2);
        this.f26085f = aVar2;
        this.f26088i = true;
        return aVar2;
    }

    public final void i(float f10) {
        if (this.f26083d != f10) {
            this.f26083d = f10;
            this.f26088i = true;
        }
    }

    public final void j(float f10) {
        if (this.f26082c != f10) {
            this.f26082c = f10;
            this.f26088i = true;
        }
    }
}
