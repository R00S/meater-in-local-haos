package androidx.media3.exoplayer.audio;

import X1.L;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: ToFloatPcmAudioProcessor.java */
/* loaded from: classes.dex */
final class n extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private static final int f26856i = Float.floatToIntBits(Float.NaN);

    n() {
    }

    private static void n(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f26856i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f26051b.f26043c;
        if (i11 == 21) {
            byteBufferM = m((i10 / 3) * 4);
            while (iPosition < iLimit) {
                n(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferM = m(i10);
            while (iPosition < iLimit) {
                n((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferM = m((i10 / 3) * 4);
            while (iPosition < iLimit) {
                n(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM = m(i10);
            while (iPosition < iLimit) {
                n((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f26043c;
        if (L.E0(i10)) {
            return i10 != 4 ? new AudioProcessor.a(aVar.f26041a, aVar.f26042b, 4) : AudioProcessor.a.f26040e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
