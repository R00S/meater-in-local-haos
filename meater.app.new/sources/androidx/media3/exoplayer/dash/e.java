package androidx.media3.exoplayer.dash;

import X1.L;
import androidx.media3.decoder.DecoderInputBuffer;
import d2.C3025C;
import java.io.IOException;
import n2.s;

/* compiled from: EventSampleStream.java */
/* loaded from: classes.dex */
final class e implements s {

    /* renamed from: B, reason: collision with root package name */
    private final U1.s f27006B;

    /* renamed from: D, reason: collision with root package name */
    private long[] f27008D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27009E;

    /* renamed from: F, reason: collision with root package name */
    private h2.f f27010F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f27011G;

    /* renamed from: H, reason: collision with root package name */
    private int f27012H;

    /* renamed from: C, reason: collision with root package name */
    private final G2.c f27007C = new G2.c();

    /* renamed from: I, reason: collision with root package name */
    private long f27013I = -9223372036854775807L;

    public e(h2.f fVar, U1.s sVar, boolean z10) {
        this.f27006B = sVar;
        this.f27010F = fVar;
        this.f27008D = fVar.f42248b;
        d(fVar, z10);
    }

    public String b() {
        return this.f27010F.a();
    }

    public void c(long j10) {
        int iE = L.e(this.f27008D, j10, true, false);
        this.f27012H = iE;
        if (!this.f27009E || iE != this.f27008D.length) {
            j10 = -9223372036854775807L;
        }
        this.f27013I = j10;
    }

    public void d(h2.f fVar, boolean z10) {
        int i10 = this.f27012H;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f27008D[i10 - 1];
        this.f27009E = z10;
        this.f27010F = fVar;
        long[] jArr = fVar.f42248b;
        this.f27008D = jArr;
        long j11 = this.f27013I;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f27012H = L.e(jArr, j10, false, false);
        }
    }

    @Override // n2.s
    public boolean f() {
        return true;
    }

    @Override // n2.s
    public int n(long j10) {
        int iMax = Math.max(this.f27012H, L.e(this.f27008D, j10, true, false));
        int i10 = iMax - this.f27012H;
        this.f27012H = iMax;
        return i10;
    }

    @Override // n2.s
    public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) throws IOException {
        int i11 = this.f27012H;
        boolean z10 = i11 == this.f27008D.length;
        if (z10 && !this.f27009E) {
            decoderInputBuffer.B(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f27011G) {
            c3025c.f39668b = this.f27006B;
            this.f27011G = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f27012H = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f27007C.a(this.f27010F.f42247a[i11]);
            decoderInputBuffer.D(bArrA.length);
            decoderInputBuffer.f26293E.put(bArrA);
        }
        decoderInputBuffer.f26295G = this.f27008D[i11];
        decoderInputBuffer.B(1);
        return -4;
    }

    @Override // n2.s
    public void a() {
    }
}
