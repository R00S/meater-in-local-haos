package f2;

import X1.C1804a;
import X1.L;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: OggOpusAudioPacketizer.java */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f41214d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f41215e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f41216a = AudioProcessor.f26038a;

    /* renamed from: c, reason: collision with root package name */
    private int f41218c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f41217b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f41217b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f41214d.length;
            length += f41215e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f41217b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f41214d);
            }
            byteBufferC.put(f41215e);
        }
        int iJ = this.f41218c + v2.H.j(byteBuffer);
        this.f41218c = iJ;
        f(byteBufferC, iJ, this.f41217b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f41217b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f41215e;
            byteBufferC.putInt(i10 + bArr2.length + 22, L.x(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, L.x(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f41217b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f41216a.capacity() < i10) {
            this.f41216a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f41216a.clear();
        }
        return this.f41216a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(p8.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, L.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(p8.j.a(i11));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        C1804a.e(decoderInputBuffer.f26293E);
        if (decoderInputBuffer.f26293E.limit() - decoderInputBuffer.f26293E.position() == 0) {
            return;
        }
        this.f41216a = b(decoderInputBuffer.f26293E, (this.f41217b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.t();
        decoderInputBuffer.D(this.f41216a.remaining());
        decoderInputBuffer.f26293E.put(this.f41216a);
        decoderInputBuffer.E();
    }

    public void d() {
        this.f41216a = AudioProcessor.f26038a;
        this.f41218c = 0;
        this.f41217b = 2;
    }
}
