package androidx.media3.exoplayer.source;

import U1.s;
import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.InterfaceC2146j;
import androidx.media3.exoplayer.source.q;
import d2.C3025C;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExternallyLoadedMediaPeriod.java */
/* renamed from: androidx.media3.exoplayer.source.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2147k implements q {

    /* renamed from: B, reason: collision with root package name */
    private final Uri f27769B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC2146j f27770C;

    /* renamed from: D, reason: collision with root package name */
    private final n2.x f27771D;

    /* renamed from: E, reason: collision with root package name */
    private final byte[] f27772E;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicBoolean f27773F;

    /* renamed from: G, reason: collision with root package name */
    private final AtomicReference<Throwable> f27774G;

    /* renamed from: H, reason: collision with root package name */
    private com.google.common.util.concurrent.f<?> f27775H;

    /* compiled from: ExternallyLoadedMediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.k$a */
    class a implements com.google.common.util.concurrent.b<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.b
        public void a(Object obj) {
            C2147k.this.f27773F.set(true);
        }

        @Override // com.google.common.util.concurrent.b
        public void b(Throwable th) {
            C2147k.this.f27774G.set(th);
        }
    }

    /* compiled from: ExternallyLoadedMediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.k$b */
    private final class b implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        private int f27777B = 0;

        public b() {
        }

        @Override // n2.s
        public void a() throws IOException {
            Throwable th = (Throwable) C2147k.this.f27774G.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // n2.s
        public boolean f() {
            return C2147k.this.f27773F.get();
        }

        @Override // n2.s
        public int n(long j10) {
            return 0;
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11 = this.f27777B;
            if (i11 == 2) {
                decoderInputBuffer.s(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c3025c.f39668b = C2147k.this.f27771D.b(0).a(0);
                this.f27777B = 1;
                return -5;
            }
            if (!C2147k.this.f27773F.get()) {
                return -3;
            }
            int length = C2147k.this.f27772E.length;
            decoderInputBuffer.s(1);
            decoderInputBuffer.f26295G = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.D(length);
                decoderInputBuffer.f26293E.put(C2147k.this.f27772E, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f27777B = 2;
            }
            return -4;
        }
    }

    public C2147k(Uri uri, String str, InterfaceC2146j interfaceC2146j) {
        this.f27769B = uri;
        U1.s sVarM = new s.b().s0(str).M();
        this.f27770C = interfaceC2146j;
        this.f27771D = new n2.x(new U1.H(sVarM));
        this.f27772E = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f27773F = new AtomicBoolean();
        this.f27774G = new AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        return !this.f27773F.get();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return this.f27773F.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return !this.f27773F.get();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        return this.f27773F.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (sVarArr[i10] != null && (xVarArr[i10] == null || !zArr[i10])) {
                sVarArr[i10] = null;
            }
            if (sVarArr[i10] == null && xVarArr[i10] != null) {
                sVarArr[i10] = new b();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    public void n() {
        com.google.common.util.concurrent.f<?> fVar = this.f27775H;
        if (fVar != null) {
            fVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        aVar.f(this);
        com.google.common.util.concurrent.f<?> fVarA = this.f27770C.a(new InterfaceC2146j.a(this.f27769B));
        this.f27775H = fVarA;
        com.google.common.util.concurrent.c.a(fVarA, new a(), com.google.common.util.concurrent.g.a());
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return this.f27771D;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }
}
