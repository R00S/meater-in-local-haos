package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f26051b;

    /* renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f26052c;

    /* renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f26053d;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f26054e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f26055f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f26056g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26057h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f26038a;
        this.f26055f = byteBuffer;
        this.f26056g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26053d = aVar;
        this.f26054e = aVar;
        this.f26051b = aVar;
        this.f26052c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return this.f26054e != AudioProcessor.a.f26040e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void b() {
        flush();
        this.f26055f = AudioProcessor.f26038a;
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26053d = aVar;
        this.f26054e = aVar;
        this.f26051b = aVar;
        this.f26052c = aVar;
        l();
    }

    protected final boolean c() {
        return this.f26056g.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean d() {
        return this.f26057h && this.f26056g == AudioProcessor.f26038a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f26056g;
        this.f26056g = AudioProcessor.f26038a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f26056g = AudioProcessor.f26038a;
        this.f26057h = false;
        this.f26051b = this.f26053d;
        this.f26052c = this.f26054e;
        j();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g() {
        this.f26057h = true;
        k();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a h(AudioProcessor.a aVar) {
        this.f26053d = aVar;
        this.f26054e = i(aVar);
        return a() ? this.f26054e : AudioProcessor.a.f26040e;
    }

    protected abstract AudioProcessor.a i(AudioProcessor.a aVar);

    protected final ByteBuffer m(int i10) {
        if (this.f26055f.capacity() < i10) {
            this.f26055f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f26055f.clear();
        }
        ByteBuffer byteBuffer = this.f26055f;
        this.f26056g = byteBuffer;
        return byteBuffer;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }
}
