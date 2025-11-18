package androidx.media3.exoplayer.mediacodec;

import X1.C1804a;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* compiled from: BatchBuffer.java */
/* loaded from: classes.dex */
final class f extends DecoderInputBuffer {

    /* renamed from: K, reason: collision with root package name */
    private long f27382K;

    /* renamed from: L, reason: collision with root package name */
    private int f27383L;

    /* renamed from: M, reason: collision with root package name */
    private int f27384M;

    public f() {
        super(2);
        this.f27384M = 32;
    }

    private boolean J(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!N()) {
            return true;
        }
        if (this.f27383L >= this.f27384M) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f26293E;
        return byteBuffer2 == null || (byteBuffer = this.f26293E) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean I(DecoderInputBuffer decoderInputBuffer) {
        C1804a.a(!decoderInputBuffer.F());
        C1804a.a(!decoderInputBuffer.v());
        C1804a.a(!decoderInputBuffer.w());
        if (!J(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f27383L;
        this.f27383L = i10 + 1;
        if (i10 == 0) {
            this.f26295G = decoderInputBuffer.f26295G;
            if (decoderInputBuffer.y()) {
                B(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f26293E;
        if (byteBuffer != null) {
            D(byteBuffer.remaining());
            this.f26293E.put(byteBuffer);
        }
        this.f27382K = decoderInputBuffer.f26295G;
        return true;
    }

    public long K() {
        return this.f26295G;
    }

    public long L() {
        return this.f27382K;
    }

    public int M() {
        return this.f27383L;
    }

    public boolean N() {
        return this.f27383L > 0;
    }

    public void O(int i10) {
        C1804a.a(i10 > 0);
        this.f27384M = i10;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, c2.AbstractC2308a
    public void t() {
        super.t();
        this.f27383L = 0;
    }
}
