package Cc;

import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* compiled from: BufferedSink.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH&¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H&¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H&¢\u0006\u0004\b'\u0010%J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0000H&¢\u0006\u0004\b-\u0010,R\u0014\u00100\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010/\u0082\u0001\u0002.1ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"LCc/f;", "LCc/z;", "Ljava/nio/channels/WritableByteChannel;", "LCc/h;", "byteString", "t0", "(LCc/h;)LCc/f;", "", "source", "i1", "([B)LCc/f;", "", "offset", "byteCount", "v", "([BII)LCc/f;", "LCc/B;", "", "S", "(LCc/B;)J", "", "string", "A0", "(Ljava/lang/String;)LCc/f;", "beginIndex", "endIndex", "J0", "(Ljava/lang/String;II)LCc/f;", "b", "d0", "(I)LCc/f;", "s", "O", "i", "U", "b0", "V", "(J)LCc/f;", "v1", "K0", "Loa/F;", "flush", "()V", "M", "()LCc/f;", "k0", "LCc/e;", "()LCc/e;", "buffer", "LCc/u;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f extends z, WritableByteChannel {
    f A0(String string);

    f J0(String string, int beginIndex, int endIndex);

    f K0(long v10);

    f M();

    f O(int s10);

    long S(B source);

    f U(int i10);

    f V(long v10);

    f b0(int i10);

    f d0(int b10);

    @Override // Cc.z, java.io.Flushable
    void flush();

    C0982e i();

    f i1(byte[] source);

    f k0();

    f t0(h byteString);

    f v(byte[] source, int offset, int byteCount);

    f v1(long v10);
}
