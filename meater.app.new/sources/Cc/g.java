package Cc;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: BufferedSource.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020&2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H&¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020/2\u0006\u00104\u001a\u00020\tH&¢\u0006\u0004\b5\u00101J\u0017\u00108\u001a\u00020/2\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u001fH&¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u001fH&¢\u0006\u0004\b>\u0010<J\u000f\u0010?\u001a\u00020\u0000H&¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH&¢\u0006\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0005\u0082\u0001\u0002\u0003Fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, d2 = {"LCc/g;", "LCc/B;", "Ljava/nio/channels/ReadableByteChannel;", "LCc/e;", "G", "()LCc/e;", "", "c0", "()Z", "", "byteCount", "Loa/F;", "t1", "(J)V", "Q0", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "", "readInt", "()I", "Z0", "m1", "()J", "m0", "x1", "w", "LCc/h;", "H", "(J)LCc/h;", "LCc/r;", "options", "y1", "(LCc/r;)I", "", "Z", "()[B", "b1", "(J)[B", "LCc/z;", "sink", "V0", "(LCc/z;)J", "", "D", "(J)Ljava/lang/String;", "Y0", "()Ljava/lang/String;", "limit", "q0", "Ljava/nio/charset/Charset;", "charset", "E0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "R0", "(LCc/h;)J", "targetBytes", "j1", "o1", "()LCc/g;", "Ljava/io/InputStream;", "A1", "()Ljava/io/InputStream;", "i", "buffer", "LCc/v;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g extends B, ReadableByteChannel {
    InputStream A1();

    String D(long byteCount);

    String E0(Charset charset);

    @InterfaceC4156a
    C0982e G();

    h H(long byteCount);

    boolean Q0(long byteCount);

    long R0(h bytes);

    long V0(z sink);

    String Y0();

    byte[] Z();

    int Z0();

    byte[] b1(long byteCount);

    boolean c0();

    C0982e i();

    long j1(h targetBytes);

    long m0();

    long m1();

    g o1();

    String q0(long limit);

    byte readByte();

    int readInt();

    short readShort();

    void t1(long byteCount);

    void w(long byteCount);

    long x1();

    int y1(r options);
}
