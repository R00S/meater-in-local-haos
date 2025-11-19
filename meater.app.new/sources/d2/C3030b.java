package d2;

import X1.L;

/* compiled from: DecoderCounters.java */
/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3030b {

    /* renamed from: a, reason: collision with root package name */
    public int f39691a;

    /* renamed from: b, reason: collision with root package name */
    public int f39692b;

    /* renamed from: c, reason: collision with root package name */
    public int f39693c;

    /* renamed from: d, reason: collision with root package name */
    public int f39694d;

    /* renamed from: e, reason: collision with root package name */
    public int f39695e;

    /* renamed from: f, reason: collision with root package name */
    public int f39696f;

    /* renamed from: g, reason: collision with root package name */
    public int f39697g;

    /* renamed from: h, reason: collision with root package name */
    public int f39698h;

    /* renamed from: i, reason: collision with root package name */
    public int f39699i;

    /* renamed from: j, reason: collision with root package name */
    public int f39700j;

    /* renamed from: k, reason: collision with root package name */
    public long f39701k;

    /* renamed from: l, reason: collision with root package name */
    public int f39702l;

    private void b(long j10, int i10) {
        this.f39701k += j10;
        this.f39702l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return L.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f39691a), Integer.valueOf(this.f39692b), Integer.valueOf(this.f39693c), Integer.valueOf(this.f39694d), Integer.valueOf(this.f39695e), Integer.valueOf(this.f39696f), Integer.valueOf(this.f39697g), Integer.valueOf(this.f39698h), Integer.valueOf(this.f39699i), Integer.valueOf(this.f39700j), Long.valueOf(this.f39701k), Integer.valueOf(this.f39702l));
    }
}
