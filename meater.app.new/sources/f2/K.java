package f2;

import X1.C1804a;
import X1.L;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes.dex */
public final class K extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private final float f41219i;

    /* renamed from: j, reason: collision with root package name */
    private final short f41220j;

    /* renamed from: k, reason: collision with root package name */
    private final int f41221k;

    /* renamed from: l, reason: collision with root package name */
    private final long f41222l;

    /* renamed from: m, reason: collision with root package name */
    private final long f41223m;

    /* renamed from: n, reason: collision with root package name */
    private int f41224n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41225o;

    /* renamed from: p, reason: collision with root package name */
    private int f41226p;

    /* renamed from: q, reason: collision with root package name */
    private long f41227q;

    /* renamed from: r, reason: collision with root package name */
    private int f41228r;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f41229s;

    /* renamed from: t, reason: collision with root package name */
    private int f41230t;

    /* renamed from: u, reason: collision with root package name */
    private int f41231u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f41232v;

    public K() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(boolean z10) {
        int length;
        int iR;
        int i10 = this.f41231u;
        byte[] bArr = this.f41229s;
        if (i10 == bArr.length || z10) {
            if (this.f41228r == 0) {
                if (z10) {
                    B(i10, 3);
                    length = i10;
                } else {
                    C1804a.g(i10 >= bArr.length / 2);
                    length = this.f41229s.length / 2;
                    B(length, 0);
                }
                iR = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iR2 = r(length2) + (this.f41229s.length / 2);
                B(iR2, 2);
                iR = iR2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iR = r(length);
                B(iR, 1);
            }
            C1804a.h(length % this.f41224n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            C1804a.g(i10 >= iR);
            this.f41231u -= length;
            int i11 = this.f41230t + length;
            this.f41230t = i11;
            this.f41230t = i11 % this.f41229s.length;
            this.f41228r = this.f41228r + (iR / this.f41224n);
            this.f41227q += (length - iR) / r2;
        }
    }

    private void B(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        C1804a.a(this.f41231u >= i10);
        if (i11 == 2) {
            int i12 = this.f41230t;
            int i13 = this.f41231u;
            int i14 = i12 + i13;
            byte[] bArr = this.f41229s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f41232v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f41232v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f41232v, 0, i15);
                    System.arraycopy(this.f41229s, 0, this.f41232v, i15, length);
                }
            }
        } else {
            int i16 = this.f41230t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f41229s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f41232v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f41232v, 0, length2);
                System.arraycopy(this.f41229s, 0, this.f41232v, length2, i10 - length2);
            }
        }
        C1804a.b(i10 % this.f41224n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        C1804a.g(this.f41230t < this.f41229s.length);
        z(this.f41232v, i10, i11);
    }

    private void C(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f41229s.length));
        int iT = t(byteBuffer);
        if (iT == byteBuffer.position()) {
            this.f41226p = 1;
        } else {
            byteBuffer.limit(Math.min(iT, byteBuffer.capacity()));
            y(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void D(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void F(ByteBuffer byteBuffer) {
        int length;
        int i10;
        C1804a.g(this.f41230t < this.f41229s.length);
        int iLimit = byteBuffer.limit();
        int iU = u(byteBuffer);
        int iPosition = iU - byteBuffer.position();
        int i11 = this.f41230t;
        int i12 = this.f41231u;
        int i13 = i11 + i12;
        byte[] bArr = this.f41229s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iU < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f41229s, i10, iMin);
        int i14 = this.f41231u + iMin;
        this.f41231u = i14;
        C1804a.g(i14 <= this.f41229s.length);
        boolean z11 = z10 && iPosition < length;
        A(z11);
        if (z11) {
            this.f41226p = 0;
            this.f41228r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int G(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int n(float f10) {
        return o((int) f10);
    }

    private int o(int i10) {
        int i11 = this.f41224n;
        return (i10 / i11) * i11;
    }

    private int p(int i10, int i11) {
        int i12 = this.f41221k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int q(int i10, int i11) {
        return (((this.f41221k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int r(int i10) {
        int iS = ((s(this.f41223m) - this.f41228r) * this.f41224n) - (this.f41229s.length / 2);
        C1804a.g(iS >= 0);
        return n(Math.min((i10 * this.f41219i) + 0.5f, iS));
    }

    private int s(long j10) {
        return (int) ((j10 * this.f26051b.f26041a) / 1000000);
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (w(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f41224n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int u(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (w(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f41224n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean w(byte b10, byte b11) {
        return Math.abs(G(b10, b11)) > this.f41220j;
    }

    private void x(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            D(bArr, i12, (G(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? q(i12, i10 - 1) : i11 == 2 ? p(i12, i10 - 1) : this.f41221k)) / 100);
        }
    }

    private void y(ByteBuffer byteBuffer) {
        m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void z(byte[] bArr, int i10, int i11) {
        C1804a.b(i10 % this.f41224n == 0, "byteOutput size is not aligned to frame size " + i10);
        x(bArr, i10, i11);
        m(i10).put(bArr, 0, i10).flip();
    }

    public void E(boolean z10) {
        this.f41225o = z10;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return super.a() && this.f41225o;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !c()) {
            int i10 = this.f41226p;
            if (i10 == 0) {
                C(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                F(byteBuffer);
            }
        }
    }

    @Override // androidx.media3.common.audio.b
    protected AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f26043c == 2) {
            return aVar.f26041a == -1 ? AudioProcessor.a.f26040e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public void j() {
        if (a()) {
            this.f41224n = this.f26051b.f26042b * 2;
            int iO = o(s(this.f41222l) / 2) * 2;
            if (this.f41229s.length != iO) {
                this.f41229s = new byte[iO];
                this.f41232v = new byte[iO];
            }
        }
        this.f41226p = 0;
        this.f41227q = 0L;
        this.f41228r = 0;
        this.f41230t = 0;
        this.f41231u = 0;
    }

    @Override // androidx.media3.common.audio.b
    public void k() {
        if (this.f41231u > 0) {
            A(true);
            this.f41228r = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public void l() {
        this.f41225o = false;
        byte[] bArr = L.f18631f;
        this.f41229s = bArr;
        this.f41232v = bArr;
    }

    public long v() {
        return this.f41227q;
    }

    public K(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f41228r = 0;
        this.f41230t = 0;
        this.f41231u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C1804a.a(z10);
        this.f41222l = j10;
        this.f41219i = f10;
        this.f41223m = j11;
        this.f41221k = i10;
        this.f41220j = s10;
        byte[] bArr = L.f18631f;
        this.f41229s = bArr;
        this.f41232v = bArr;
    }
}
