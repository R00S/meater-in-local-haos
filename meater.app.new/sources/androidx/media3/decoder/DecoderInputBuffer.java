package androidx.media3.decoder;

import U1.s;
import U1.w;
import c2.AbstractC2308a;
import c2.c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends AbstractC2308a {

    /* renamed from: C, reason: collision with root package name */
    public s f26291C;

    /* renamed from: D, reason: collision with root package name */
    public final c f26292D;

    /* renamed from: E, reason: collision with root package name */
    public ByteBuffer f26293E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26294F;

    /* renamed from: G, reason: collision with root package name */
    public long f26295G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f26296H;

    /* renamed from: I, reason: collision with root package name */
    private final int f26297I;

    /* renamed from: J, reason: collision with root package name */
    private final int f26298J;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* renamed from: B, reason: collision with root package name */
        public final int f26299B;

        /* renamed from: C, reason: collision with root package name */
        public final int f26300C;

        public InsufficientCapacityException(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f26299B = i10;
            this.f26300C = i11;
        }
    }

    static {
        w.a("media3.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    private ByteBuffer C(int i10) {
        int i11 = this.f26297I;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f26293E;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer G() {
        return new DecoderInputBuffer(0);
    }

    public void D(int i10) {
        int i11 = i10 + this.f26298J;
        ByteBuffer byteBuffer = this.f26293E;
        if (byteBuffer == null) {
            this.f26293E = C(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f26293E = byteBuffer;
            return;
        }
        ByteBuffer byteBufferC = C(i12);
        byteBufferC.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferC.put(byteBuffer);
        }
        this.f26293E = byteBufferC;
    }

    public final void E() {
        ByteBuffer byteBuffer = this.f26293E;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26296H;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean F() {
        return u(1073741824);
    }

    public void H(int i10) {
        ByteBuffer byteBuffer = this.f26296H;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f26296H = ByteBuffer.allocate(i10);
        } else {
            this.f26296H.clear();
        }
    }

    @Override // c2.AbstractC2308a
    public void t() {
        super.t();
        ByteBuffer byteBuffer = this.f26293E;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26296H;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26294F = false;
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f26292D = new c();
        this.f26297I = i10;
        this.f26298J = i11;
    }
}
