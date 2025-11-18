package j2;

import U1.s;
import X1.C1804a;
import X1.F;
import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC2123e;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.u0;
import com.apptionlabs.meater_app.data.Config;
import d2.C3025C;
import j2.InterfaceC3733c;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: ImageRenderer.java */
/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3735e extends AbstractC2123e {

    /* renamed from: S, reason: collision with root package name */
    private final InterfaceC3733c.a f43481S;

    /* renamed from: T, reason: collision with root package name */
    private final DecoderInputBuffer f43482T;

    /* renamed from: U, reason: collision with root package name */
    private final ArrayDeque<a> f43483U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f43484V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f43485W;

    /* renamed from: X, reason: collision with root package name */
    private a f43486X;

    /* renamed from: Y, reason: collision with root package name */
    private long f43487Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f43488Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f43489a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f43490b0;

    /* renamed from: c0, reason: collision with root package name */
    private s f43491c0;

    /* renamed from: d0, reason: collision with root package name */
    private InterfaceC3733c f43492d0;

    /* renamed from: e0, reason: collision with root package name */
    private DecoderInputBuffer f43493e0;

    /* renamed from: f0, reason: collision with root package name */
    private ImageOutput f43494f0;

    /* renamed from: g0, reason: collision with root package name */
    private Bitmap f43495g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f43496h0;

    /* renamed from: i0, reason: collision with root package name */
    private b f43497i0;

    /* renamed from: j0, reason: collision with root package name */
    private b f43498j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f43499k0;

    /* compiled from: ImageRenderer.java */
    /* renamed from: j2.e$a */
    private static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f43500c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f43501a;

        /* renamed from: b, reason: collision with root package name */
        public final long f43502b;

        public a(long j10, long j11) {
            this.f43501a = j10;
            this.f43502b = j11;
        }
    }

    /* compiled from: ImageRenderer.java */
    /* renamed from: j2.e$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f43503a;

        /* renamed from: b, reason: collision with root package name */
        private final long f43504b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f43505c;

        public b(int i10, long j10) {
            this.f43503a = i10;
            this.f43504b = j10;
        }

        public long a() {
            return this.f43504b;
        }

        public Bitmap b() {
            return this.f43505c;
        }

        public int c() {
            return this.f43503a;
        }

        public boolean d() {
            return this.f43505c != null;
        }

        public void e(Bitmap bitmap) {
            this.f43505c = bitmap;
        }
    }

    public C3735e(InterfaceC3733c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f43481S = aVar;
        this.f43494f0 = y0(imageOutput);
        this.f43482T = DecoderInputBuffer.G();
        this.f43486X = a.f43500c;
        this.f43483U = new ArrayDeque<>();
        this.f43488Z = -9223372036854775807L;
        this.f43487Y = -9223372036854775807L;
        this.f43489a0 = 0;
        this.f43490b0 = 1;
    }

    private boolean A0(b bVar) {
        return ((s) C1804a.i(this.f43491c0)).f17144K == -1 || this.f43491c0.f17145L == -1 || bVar.c() == (((s) C1804a.i(this.f43491c0)).f17145L * this.f43491c0.f17144K) - 1;
    }

    private void B0(int i10) {
        this.f43490b0 = Math.min(this.f43490b0, i10);
    }

    private void C0(long j10, DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = true;
        if (decoderInputBuffer.w()) {
            this.f43496h0 = true;
            return;
        }
        b bVar = new b(this.f43499k0, decoderInputBuffer.f26295G);
        this.f43498j0 = bVar;
        this.f43499k0++;
        if (!this.f43496h0) {
            long jA = bVar.a();
            boolean z11 = jA - Config.MC_STATS_INTERVAL <= j10 && j10 <= Config.MC_STATS_INTERVAL + jA;
            b bVar2 = this.f43497i0;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zA0 = A0((b) C1804a.i(this.f43498j0));
            if (!z11 && !z12 && !zA0) {
                z10 = false;
            }
            this.f43496h0 = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f43497i0 = this.f43498j0;
        this.f43498j0 = null;
    }

    private void D0(long j10) {
        this.f43487Y = j10;
        while (!this.f43483U.isEmpty() && j10 >= this.f43483U.peek().f43501a) {
            this.f43486X = this.f43483U.removeFirst();
        }
    }

    private void F0() {
        this.f43493e0 = null;
        this.f43489a0 = 0;
        this.f43488Z = -9223372036854775807L;
        InterfaceC3733c interfaceC3733c = this.f43492d0;
        if (interfaceC3733c != null) {
            interfaceC3733c.c();
            this.f43492d0 = null;
        }
    }

    private void G0(ImageOutput imageOutput) {
        this.f43494f0 = y0(imageOutput);
    }

    private boolean H0() {
        boolean z10 = getState() == 2;
        int i10 = this.f43490b0;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean u0(s sVar) {
        int iA = this.f43481S.a(sVar);
        return iA == u0.G(4) || iA == u0.G(3);
    }

    private Bitmap v0(int i10) {
        C1804a.i(this.f43495g0);
        int width = this.f43495g0.getWidth() / ((s) C1804a.i(this.f43491c0)).f17144K;
        int height = this.f43495g0.getHeight() / ((s) C1804a.i(this.f43491c0)).f17145L;
        int i11 = this.f43491c0.f17144K;
        return Bitmap.createBitmap(this.f43495g0, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean w0(long j10, long j11) throws ExoPlaybackException {
        if (this.f43495g0 != null && this.f43497i0 == null) {
            return false;
        }
        if (this.f43490b0 == 0 && getState() != 2) {
            return false;
        }
        if (this.f43495g0 == null) {
            C1804a.i(this.f43492d0);
            AbstractC3734d abstractC3734dA = this.f43492d0.a();
            if (abstractC3734dA == null) {
                return false;
            }
            if (((AbstractC3734d) C1804a.i(abstractC3734dA)).w()) {
                if (this.f43489a0 == 3) {
                    F0();
                    C1804a.i(this.f43491c0);
                    z0();
                } else {
                    ((AbstractC3734d) C1804a.i(abstractC3734dA)).C();
                    if (this.f43483U.isEmpty()) {
                        this.f43485W = true;
                    }
                }
                return false;
            }
            C1804a.j(abstractC3734dA.f43480F, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f43495g0 = abstractC3734dA.f43480F;
            ((AbstractC3734d) C1804a.i(abstractC3734dA)).C();
        }
        if (!this.f43496h0 || this.f43495g0 == null || this.f43497i0 == null) {
            return false;
        }
        C1804a.i(this.f43491c0);
        s sVar = this.f43491c0;
        int i10 = sVar.f17144K;
        boolean z10 = ((i10 == 1 && sVar.f17145L == 1) || i10 == -1 || sVar.f17145L == -1) ? false : true;
        if (!this.f43497i0.d()) {
            b bVar = this.f43497i0;
            bVar.e(z10 ? v0(bVar.c()) : (Bitmap) C1804a.i(this.f43495g0));
        }
        if (!E0(j10, j11, (Bitmap) C1804a.i(this.f43497i0.b()), this.f43497i0.a())) {
            return false;
        }
        D0(((b) C1804a.i(this.f43497i0)).a());
        this.f43490b0 = 3;
        if (!z10 || ((b) C1804a.i(this.f43497i0)).c() == (((s) C1804a.i(this.f43491c0)).f17145L * ((s) C1804a.i(this.f43491c0)).f17144K) - 1) {
            this.f43495g0 = null;
        }
        this.f43497i0 = this.f43498j0;
        this.f43498j0 = null;
        return true;
    }

    private boolean x0(long j10) {
        if (this.f43496h0 && this.f43497i0 != null) {
            return false;
        }
        C3025C c3025cY = Y();
        InterfaceC3733c interfaceC3733c = this.f43492d0;
        if (interfaceC3733c == null || this.f43489a0 == 3 || this.f43484V) {
            return false;
        }
        if (this.f43493e0 == null) {
            DecoderInputBuffer decoderInputBufferE = interfaceC3733c.e();
            this.f43493e0 = decoderInputBufferE;
            if (decoderInputBufferE == null) {
                return false;
            }
        }
        if (this.f43489a0 == 2) {
            C1804a.i(this.f43493e0);
            this.f43493e0.B(4);
            ((InterfaceC3733c) C1804a.i(this.f43492d0)).f(this.f43493e0);
            this.f43493e0 = null;
            this.f43489a0 = 3;
            return false;
        }
        int iR0 = r0(c3025cY, this.f43493e0, 0);
        if (iR0 == -5) {
            this.f43491c0 = (s) C1804a.i(c3025cY.f39668b);
            this.f43489a0 = 2;
            return true;
        }
        if (iR0 != -4) {
            if (iR0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f43493e0.E();
        ByteBuffer byteBuffer = this.f43493e0.f26293E;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) C1804a.i(this.f43493e0)).w();
        if (z10) {
            ((InterfaceC3733c) C1804a.i(this.f43492d0)).f((DecoderInputBuffer) C1804a.i(this.f43493e0));
            this.f43499k0 = 0;
        }
        C0(j10, (DecoderInputBuffer) C1804a.i(this.f43493e0));
        if (((DecoderInputBuffer) C1804a.i(this.f43493e0)).w()) {
            this.f43484V = true;
            this.f43493e0 = null;
            return false;
        }
        this.f43488Z = Math.max(this.f43488Z, ((DecoderInputBuffer) C1804a.i(this.f43493e0)).f26295G);
        if (z10) {
            this.f43493e0 = null;
        } else {
            ((DecoderInputBuffer) C1804a.i(this.f43493e0)).t();
        }
        return !this.f43496h0;
    }

    private static ImageOutput y0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f27232a : imageOutput;
    }

    private void z0() throws ExoPlaybackException {
        if (!u0(this.f43491c0)) {
            throw U(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f43491c0, 4005);
        }
        InterfaceC3733c interfaceC3733c = this.f43492d0;
        if (interfaceC3733c != null) {
            interfaceC3733c.c();
        }
        this.f43492d0 = this.f43481S.b();
    }

    protected boolean E0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!H0() && j13 >= Config.MC_STATS_INTERVAL) {
            return false;
        }
        this.f43494f0.onImageAvailable(j12 - this.f43486X.f43502b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) {
        if (i10 != 15) {
            super.J(i10, obj);
        } else {
            G0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public int a(s sVar) {
        return this.f43481S.a(sVar);
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean d() {
        return this.f43485W;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean f() {
        int i10 = this.f43490b0;
        return i10 == 3 || (i10 == 0 && this.f43496h0);
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        this.f43491c0 = null;
        this.f43486X = a.f43500c;
        this.f43483U.clear();
        F0();
        this.f43494f0.a();
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void h0(boolean z10, boolean z11) {
        this.f43490b0 = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.t0
    public void j(long j10, long j11) throws ExoPlaybackException {
        if (this.f43485W) {
            return;
        }
        if (this.f43491c0 == null) {
            C3025C c3025cY = Y();
            this.f43482T.t();
            int iR0 = r0(c3025cY, this.f43482T, 2);
            if (iR0 != -5) {
                if (iR0 == -4) {
                    C1804a.g(this.f43482T.w());
                    this.f43484V = true;
                    this.f43485W = true;
                    return;
                }
                return;
            }
            this.f43491c0 = (s) C1804a.i(c3025cY.f39668b);
            z0();
        }
        try {
            F.a("drainAndFeedDecoder");
            while (w0(j10, j11)) {
            }
            while (x0(j10)) {
            }
            F.b();
        } catch (ImageDecoderException e10) {
            throw U(e10, null, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) {
        B0(1);
        this.f43485W = false;
        this.f43484V = false;
        this.f43495g0 = null;
        this.f43497i0 = null;
        this.f43498j0 = null;
        this.f43496h0 = false;
        this.f43493e0 = null;
        InterfaceC3733c interfaceC3733c = this.f43492d0;
        if (interfaceC3733c != null) {
            interfaceC3733c.flush();
        }
        this.f43483U.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void k0() {
        F0();
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void m0() {
        F0();
        B0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // androidx.media3.exoplayer.AbstractC2123e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void p0(U1.s[] r5, long r6, long r8, androidx.media3.exoplayer.source.r.b r10) {
        /*
            r4 = this;
            super.p0(r5, r6, r8, r10)
            j2.e$a r5 = r4.f43486X
            long r5 = r5.f43502b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque<j2.e$a> r5 = r4.f43483U
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f43488Z
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f43487Y
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque<j2.e$a> r5 = r4.f43483U
            j2.e$a r6 = new j2.e$a
            long r0 = r4.f43488Z
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            j2.e$a r5 = new j2.e$a
            r5.<init>(r0, r8)
            r4.f43486X = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C3735e.p0(U1.s[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }
}
