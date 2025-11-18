package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10527b;
import p353j.p354g0.C9706a;

/* compiled from: RealBufferedSource.kt */
/* renamed from: j.x */
/* loaded from: classes3.dex */
public final class C9725x implements InterfaceC9709h {

    /* renamed from: f */
    public final C9703f f37086f;

    /* renamed from: g */
    public boolean f37087g;

    /* renamed from: h */
    public final InterfaceC9700d0 f37088h;

    public C9725x(InterfaceC9700d0 interfaceC9700d0) {
        C9801m.m32346f(interfaceC9700d0, "source");
        this.f37088h = interfaceC9700d0;
        this.f37086f = new C9703f();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: D0 */
    public C9710i mo32003D0() throws IOException {
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32003D0();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: L0 */
    public String mo32011L0() {
        return mo32040g0(Long.MAX_VALUE);
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: M */
    public byte[] mo32012M() throws IOException {
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32012M();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: O0 */
    public byte[] mo32015O0(long j2) throws EOFException {
        mo32041g1(j2);
        return this.f37086f.mo32015O0(j2);
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: P */
    public long mo32016P(C9710i c9710i) {
        C9801m.m32346f(c9710i, "bytes");
        return m32156c(c9710i, 0L);
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: R */
    public boolean mo32019R() {
        if (!this.f37087g) {
            return this.f37086f.mo32019R() && this.f37088h.read(this.f37086f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: X */
    public void mo32025X(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "sink");
        try {
            mo32041g1(j2);
            this.f37086f.mo32025X(c9703f, j2);
        } catch (EOFException e2) {
            c9703f.mo31999B0(this.f37086f);
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: Y0 */
    public long mo32026Y0(InterfaceC9696b0 interfaceC9696b0) throws IOException {
        C9801m.m32346f(interfaceC9696b0, "sink");
        long j2 = 0;
        while (this.f37088h.read(this.f37086f, 8192) != -1) {
            long jM32036e = this.f37086f.m32036e();
            if (jM32036e > 0) {
                j2 += jM32036e;
                interfaceC9696b0.write(this.f37086f, jM32036e);
            }
        }
        if (this.f37086f.size() <= 0) {
            return j2;
        }
        long size = j2 + this.f37086f.size();
        C9703f c9703f = this.f37086f;
        interfaceC9696b0.write(c9703f, c9703f.size());
        return size;
    }

    /* renamed from: a */
    public long m32154a(byte b2) {
        return m32155b(b2, 0L, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public long m32155b(byte b2, long j2, long j3) {
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long jM32052p = this.f37086f.m32052p(b2, j2, j3);
            if (jM32052p != -1) {
                return jM32052p;
            }
            long size = this.f37086f.size();
            if (size >= j3 || this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
        return -1L;
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: b0 */
    public long mo32031b0(C9710i c9710i) {
        C9801m.m32346f(c9710i, "targetBytes");
        return m32157d(c9710i, 0L);
    }

    /* renamed from: c */
    public long m32156c(C9710i c9710i, long j2) throws IOException {
        C9801m.m32346f(c9710i, "bytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jM31996A = this.f37086f.m31996A(c9710i, j2);
            if (jM31996A != -1) {
                return jM31996A;
            }
            long size = this.f37086f.size();
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - c9710i.m32093P()) + 1);
        }
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37087g) {
            return;
        }
        this.f37087g = true;
        this.f37088h.close();
        this.f37086f.m32030b();
    }

    /* renamed from: d */
    public long m32157d(C9710i c9710i, long j2) {
        C9801m.m32346f(c9710i, "targetBytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jM31998B = this.f37086f.m31998B(c9710i, j2);
            if (jM31998B != -1) {
                return jM31998B;
            }
            long size = this.f37086f.size();
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: d0 */
    public long mo32035d0() throws EOFException {
        byte bM32047m;
        mo32041g1(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!request(j3)) {
                break;
            }
            bM32047m = this.f37086f.m32047m(j2);
            if ((bM32047m < ((byte) 48) || bM32047m > ((byte) 57)) && !(j2 == 0 && bM32047m == ((byte) 45))) {
                break;
            }
            j2 = j3;
        }
        if (j2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(bM32047m, C10527b.m37411a(C10527b.m37411a(16)));
            C9801m.m32345e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f37086f.mo32035d0();
    }

    /* renamed from: e */
    public boolean m32158e(long j2, C9710i c9710i, int i2, int i3) {
        C9801m.m32346f(c9710i, "bytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 >= 0 && i2 >= 0 && i3 >= 0 && c9710i.m32093P() - i2 >= i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                long j3 = i4 + j2;
                if (request(1 + j3) && this.f37086f.m32047m(j3) == c9710i.m32097x(i2 + i4)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m32159f() throws EOFException {
        mo32041g1(4L);
        return this.f37086f.m32009K();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: g0 */
    public String mo32040g0(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b2 = (byte) 10;
        long jM32155b = m32155b(b2, 0L, j3);
        if (jM32155b != -1) {
            return C9706a.m32073d(this.f37086f, jM32155b);
        }
        if (j3 < Long.MAX_VALUE && request(j3) && this.f37086f.m32047m(j3 - 1) == ((byte) 13) && request(1 + j3) && this.f37086f.m32047m(j3) == b2) {
            return C9706a.m32073d(this.f37086f, j3);
        }
        C9703f c9703f = new C9703f();
        C9703f c9703f2 = this.f37086f;
        c9703f2.m32044j(c9703f, 0L, Math.min(32, c9703f2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f37086f.size(), j2) + " content=" + c9703f.mo32003D0().mo31967F() + "…");
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: g1 */
    public void mo32041g1(long j2) throws EOFException {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    @Override // p353j.InterfaceC9709h, p353j.InterfaceC9705g
    /* renamed from: i */
    public C9703f mo32042i() {
        return this.f37086f;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f37087g;
    }

    /* renamed from: j */
    public short m32160j() throws EOFException {
        mo32041g1(2L);
        return this.f37086f.m32013N();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: m1 */
    public long mo32049m1() throws EOFException {
        byte bM32047m;
        mo32041g1(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!request(i3)) {
                break;
            }
            bM32047m = this.f37086f.m32047m(i2);
            if ((bM32047m < ((byte) 48) || bM32047m > ((byte) 57)) && ((bM32047m < ((byte) 97) || bM32047m > ((byte) 102)) && (bM32047m < ((byte) 65) || bM32047m > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bM32047m, C10527b.m37411a(C10527b.m37411a(16)));
            C9801m.m32345e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f37086f.mo32049m1();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: o1 */
    public InputStream mo32051o1() {
        return new a();
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: p1 */
    public int mo32053p1(C9721t c9721t) throws EOFException {
        C9801m.m32346f(c9721t, "options");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iM32074e = C9706a.m32074e(this.f37086f, c9721t, true);
            if (iM32074e != -2) {
                if (iM32074e != -1) {
                    this.f37086f.skip(c9721t.m32146i()[iM32074e].m32093P());
                    return iM32074e;
                }
            } else if (this.f37088h.read(this.f37086f, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p353j.InterfaceC9709h
    public InterfaceC9709h peek() {
        return C9718q.m32120d(new C9723v(this));
    }

    @Override // p353j.InterfaceC9700d0
    public long read(C9703f c9703f, long j2) {
        C9801m.m32346f(c9703f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(true ^ this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
            return -1L;
        }
        return this.f37086f.read(c9703f, Math.min(j2, this.f37086f.size()));
    }

    @Override // p353j.InterfaceC9709h
    public byte readByte() throws EOFException {
        mo32041g1(1L);
        return this.f37086f.readByte();
    }

    @Override // p353j.InterfaceC9709h
    public void readFully(byte[] bArr) throws EOFException {
        C9801m.m32346f(bArr, "sink");
        try {
            mo32041g1(bArr.length);
            this.f37086f.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f37086f.size() > 0) {
                C9703f c9703f = this.f37086f;
                int i3 = c9703f.read(bArr, i2, (int) c9703f.size());
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9709h
    public int readInt() throws EOFException {
        mo32041g1(4L);
        return this.f37086f.readInt();
    }

    @Override // p353j.InterfaceC9709h
    public long readLong() throws EOFException {
        mo32041g1(8L);
        return this.f37086f.readLong();
    }

    @Override // p353j.InterfaceC9709h
    public short readShort() throws EOFException {
        mo32041g1(2L);
        return this.f37086f.readShort();
    }

    @Override // p353j.InterfaceC9709h
    public boolean request(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f37086f.size() < j2) {
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p353j.InterfaceC9709h
    public void skip(long j2) throws EOFException {
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.f37086f.size());
            this.f37086f.skip(jMin);
            j2 -= jMin;
        }
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: t */
    public C9703f mo32056t() {
        return this.f37086f;
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.f37088h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f37088h + ')';
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: u */
    public C9710i mo32058u(long j2) throws EOFException {
        mo32041g1(j2);
        return this.f37086f.mo32058u(j2);
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: v0 */
    public boolean mo32059v0(long j2, C9710i c9710i) {
        C9801m.m32346f(c9710i, "bytes");
        return m32158e(j2, c9710i, 0, c9710i.m32093P());
    }

    @Override // p353j.InterfaceC9709h
    /* renamed from: w0 */
    public String mo32060w0(Charset charset) throws IOException {
        C9801m.m32346f(charset, "charset");
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32060w0(charset);
    }

    /* compiled from: RealBufferedSource.kt */
    /* renamed from: j.x$a */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C9725x c9725x = C9725x.this;
            if (c9725x.f37087g) {
                throw new IOException("closed");
            }
            return (int) Math.min(c9725x.f37086f.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9725x.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C9725x c9725x = C9725x.this;
            if (c9725x.f37087g) {
                throw new IOException("closed");
            }
            if (c9725x.f37086f.size() == 0) {
                C9725x c9725x2 = C9725x.this;
                if (c9725x2.f37088h.read(c9725x2.f37086f, 8192) == -1) {
                    return -1;
                }
            }
            return C9725x.this.f37086f.readByte() & 255;
        }

        public String toString() {
            return C9725x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            C9801m.m32346f(bArr, "data");
            if (!C9725x.this.f37087g) {
                C9697c.m31982b(bArr.length, i2, i3);
                if (C9725x.this.f37086f.size() == 0) {
                    C9725x c9725x = C9725x.this;
                    if (c9725x.f37088h.read(c9725x.f37086f, 8192) == -1) {
                        return -1;
                    }
                }
                return C9725x.this.f37086f.read(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C9801m.m32346f(byteBuffer, "sink");
        if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
            return -1;
        }
        return this.f37086f.read(byteBuffer);
    }
}
