package Cc;

import Ub.C1786a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010.J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u001eH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001eH\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010?J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010\u0013J\u0017\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u0016H\u0016¢\u0006\u0004\bD\u0010EJ'\u0010C\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010HJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0019H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u0019H\u0016¢\u0006\u0004\bO\u0010KJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010MJ\u000f\u0010Q\u001a\u00020\u0001H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u000eH\u0016¢\u0006\u0004\bV\u0010\u0010J\u000f\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020,H\u0016¢\u0006\u0004\b\\\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010\"R\u001b\u0010e\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bd\u0010X\u001a\u0004\bc\u0010\b¨\u0006f"}, d2 = {"LCc/v;", "LCc/g;", "LCc/B;", "source", "<init>", "(LCc/B;)V", "LCc/e;", "G", "()LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "", "c0", "()Z", "Loa/F;", "t1", "(J)V", "Q0", "(J)Z", "", "readByte", "()B", "LCc/h;", "H", "(J)LCc/h;", "LCc/r;", "options", "", "y1", "(LCc/r;)I", "", "Z", "()[B", "b1", "(J)[B", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "LCc/z;", "V0", "(LCc/z;)J", "", "D", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "E0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "Y0", "()Ljava/lang/String;", "limit", "q0", "", "readShort", "()S", "e", "readInt", "()I", "Z0", "m1", "()J", "m0", "x1", "w", "b", "a", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "R0", "(LCc/h;)J", "c", "(LCc/h;J)J", "targetBytes", "j1", "d", "o1", "()LCc/g;", "Ljava/io/InputStream;", "A1", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "LCc/C;", "r", "()LCc/C;", "toString", "B", "LCc/B;", "C", "LCc/e;", "bufferField", "closed", "i", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.v, reason: from toString */
/* loaded from: classes3.dex */
public final class buffer implements g {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final B source;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final C0982e bufferField;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(B source) {
        C3862t.g(source, "source");
        this.source = source;
        this.bufferField = new C0982e();
    }

    @Override // Cc.g
    public InputStream A1() {
        return new a();
    }

    @Override // Cc.g
    public String D(long byteCount) throws EOFException {
        t1(byteCount);
        return this.bufferField.D(byteCount);
    }

    @Override // Cc.g
    public String E0(Charset charset) {
        C3862t.g(charset, "charset");
        this.bufferField.S(this.source);
        return this.bufferField.E0(charset);
    }

    @Override // Cc.g
    /* renamed from: G, reason: from getter */
    public C0982e getBufferField() {
        return this.bufferField;
    }

    @Override // Cc.g
    public h H(long byteCount) throws EOFException {
        t1(byteCount);
        return this.bufferField.H(byteCount);
    }

    @Override // Cc.B
    public long I0(C0982e sink, long byteCount) {
        C3862t.g(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0 && this.source.I0(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.I0(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    @Override // Cc.g
    public boolean Q0(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.I0(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // Cc.g
    public long R0(h bytes) {
        C3862t.g(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // Cc.g
    public long V0(z sink) {
        C3862t.g(sink, "sink");
        long j10 = 0;
        while (this.source.I0(this.bufferField, 8192L) != -1) {
            long jD = this.bufferField.d();
            if (jD > 0) {
                j10 += jD;
                sink.n0(this.bufferField, jD);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.getSize();
        C0982e c0982e = this.bufferField;
        sink.n0(c0982e, c0982e.getSize());
        return size;
    }

    @Override // Cc.g
    public String Y0() {
        return q0(Long.MAX_VALUE);
    }

    @Override // Cc.g
    public byte[] Z() {
        this.bufferField.S(this.source);
        return this.bufferField.Z();
    }

    @Override // Cc.g
    public int Z0() throws EOFException {
        t1(4L);
        return this.bufferField.Z0();
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        while (fromIndex < toIndex) {
            long jN = this.bufferField.n(b10, fromIndex, toIndex);
            if (jN != -1) {
                return jN;
            }
            long size = this.bufferField.getSize();
            if (size >= toIndex || this.source.I0(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
        return -1L;
    }

    @Override // Cc.g
    public byte[] b1(long byteCount) throws EOFException {
        t1(byteCount);
        return this.bufferField.b1(byteCount);
    }

    public long c(h bytes, long fromIndex) {
        C3862t.g(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jO = this.bufferField.o(bytes, fromIndex);
            if (jO != -1) {
                return jO;
            }
            long size = this.bufferField.getSize();
            if (this.source.I0(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - bytes.J()) + 1);
        }
    }

    @Override // Cc.g
    public boolean c0() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.c0() && this.source.I0(this.bufferField, 8192L) == -1;
    }

    @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.b();
    }

    public long d(h targetBytes, long fromIndex) {
        C3862t.g(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jP = this.bufferField.p(targetBytes, fromIndex);
            if (jP != -1) {
                return jP;
            }
            long size = this.bufferField.getSize();
            if (this.source.I0(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    public short e() throws EOFException {
        t1(2L);
        return this.bufferField.N();
    }

    @Override // Cc.g, Cc.f
    /* renamed from: i */
    public C0982e getBufferField() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // Cc.g
    public long j1(h targetBytes) {
        C3862t.g(targetBytes, "targetBytes");
        return d(targetBytes, 0L);
    }

    @Override // Cc.g
    public long m0() throws EOFException {
        byte bM;
        t1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!Q0(j11)) {
                break;
            }
            bM = this.bufferField.m(j10);
            if ((bM < 48 || bM > 57) && !(j10 == 0 && bM == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bM, C1786a.a(16));
            C3862t.f(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.bufferField.m0();
    }

    @Override // Cc.g
    public long m1() throws EOFException {
        t1(8L);
        return this.bufferField.m1();
    }

    @Override // Cc.g
    public g o1() {
        return o.d(new t(this));
    }

    @Override // Cc.g
    public String q0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jB = b((byte) 10, 0L, j10);
        if (jB != -1) {
            return Dc.a.d(this.bufferField, jB);
        }
        if (j10 < Long.MAX_VALUE && Q0(j10) && this.bufferField.m(j10 - 1) == 13 && Q0(1 + j10) && this.bufferField.m(j10) == 10) {
            return Dc.a.d(this.bufferField, j10);
        }
        C0982e c0982e = new C0982e();
        C0982e c0982e2 = this.bufferField;
        c0982e2.g(c0982e, 0L, Math.min(32, c0982e2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + c0982e.u().y() + (char) 8230);
    }

    @Override // Cc.B
    /* renamed from: r */
    public C getTimeout() {
        return this.source.getTimeout();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C3862t.g(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.I0(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // Cc.g
    public byte readByte() throws EOFException {
        t1(1L);
        return this.bufferField.readByte();
    }

    @Override // Cc.g
    public int readInt() throws EOFException {
        t1(4L);
        return this.bufferField.readInt();
    }

    @Override // Cc.g
    public short readShort() throws EOFException {
        t1(2L);
        return this.bufferField.readShort();
    }

    @Override // Cc.g
    public void t1(long byteCount) throws EOFException {
        if (!Q0(byteCount)) {
            throw new EOFException();
        }
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // Cc.g
    public void w(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.I0(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.w(jMin);
            byteCount -= jMin;
        }
    }

    @Override // Cc.g
    public long x1() throws EOFException {
        byte bM;
        t1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!Q0(i11)) {
                break;
            }
            bM = this.bufferField.m(i10);
            if ((bM < 48 || bM > 57) && ((bM < 97 || bM > 102) && (bM < 65 || bM > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bM, C1786a.a(16));
            C3862t.f(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.bufferField.x1();
    }

    @Override // Cc.g
    public int y1(r options) throws EOFException {
        C3862t.g(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int iE = Dc.a.e(this.bufferField, options, true);
            if (iE != -2) {
                if (iE != -1) {
                    this.bufferField.w(options.getByteStrings()[iE].J());
                    return iE;
                }
            } else if (this.source.I0(this.bufferField, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* compiled from: RealBufferedSource.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Cc/v$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "Loa/F;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.v$a */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            buffer.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.I0(bufferVar2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            C3862t.g(data, "data");
            if (!buffer.this.closed) {
                C0979b.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.I0(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.s(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }
}
