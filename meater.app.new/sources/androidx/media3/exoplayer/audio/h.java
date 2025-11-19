package androidx.media3.exoplayer.audio;

import X1.C1804a;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes.dex */
final class h extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private int[] f26820i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f26821j;

    h() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C1804a.e(this.f26821j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM = m(((iLimit - iPosition) / this.f26051b.f26044d) * this.f26052c.f26044d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferM.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f26051b.f26044d;
        }
        byteBuffer.position(iLimit);
        byteBufferM.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f26820i;
        if (iArr == null) {
            return AudioProcessor.a.f26040e;
        }
        if (aVar.f26043c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f26042b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f26042b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f26041a, iArr.length, 2) : AudioProcessor.a.f26040e;
    }

    @Override // androidx.media3.common.audio.b
    protected void j() {
        this.f26821j = this.f26820i;
    }

    @Override // androidx.media3.common.audio.b
    protected void l() {
        this.f26821j = null;
        this.f26820i = null;
    }

    public void n(int[] iArr) {
        this.f26820i = iArr;
    }
}
