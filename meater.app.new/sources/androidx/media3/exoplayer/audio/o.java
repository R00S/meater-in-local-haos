package androidx.media3.exoplayer.audio;

import X1.L;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes.dex */
final class o extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private int f26857i;

    /* renamed from: j, reason: collision with root package name */
    private int f26858j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26859k;

    /* renamed from: l, reason: collision with root package name */
    private int f26860l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f26861m = L.f18631f;

    /* renamed from: n, reason: collision with root package name */
    private int f26862n;

    /* renamed from: o, reason: collision with root package name */
    private long f26863o;

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean d() {
        return super.d() && this.f26862n == 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        int i10;
        if (super.d() && (i10 = this.f26862n) > 0) {
            m(i10).put(this.f26861m, 0, this.f26862n).flip();
            this.f26862n = 0;
        }
        return super.e();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f26860l);
        this.f26863o += iMin / this.f26051b.f26044d;
        this.f26860l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f26860l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f26862n + i11) - this.f26861m.length;
        ByteBuffer byteBufferM = m(length);
        int iP = L.p(length, 0, this.f26862n);
        byteBufferM.put(this.f26861m, 0, iP);
        int iP2 = L.p(length - iP, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iP2);
        byteBufferM.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iP2;
        int i13 = this.f26862n - iP;
        this.f26862n = i13;
        byte[] bArr = this.f26861m;
        System.arraycopy(bArr, iP, bArr, 0, i13);
        byteBuffer.get(this.f26861m, this.f26862n, i12);
        this.f26862n += i12;
        byteBufferM.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f26043c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f26859k = true;
        return (this.f26857i == 0 && this.f26858j == 0) ? AudioProcessor.a.f26040e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    protected void j() {
        if (this.f26859k) {
            this.f26859k = false;
            int i10 = this.f26858j;
            int i11 = this.f26051b.f26044d;
            this.f26861m = new byte[i10 * i11];
            this.f26860l = this.f26857i * i11;
        }
        this.f26862n = 0;
    }

    @Override // androidx.media3.common.audio.b
    protected void k() {
        if (this.f26859k) {
            if (this.f26862n > 0) {
                this.f26863o += r0 / this.f26051b.f26044d;
            }
            this.f26862n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    protected void l() {
        this.f26861m = L.f18631f;
    }

    public long n() {
        return this.f26863o;
    }

    public void o() {
        this.f26863o = 0L;
    }

    public void p(int i10, int i11) {
        this.f26857i = i10;
        this.f26858j = i11;
    }
}
