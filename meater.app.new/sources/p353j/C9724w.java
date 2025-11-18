package p353j;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C9801m;

/* compiled from: RealBufferedSink.kt */
/* renamed from: j.w */
/* loaded from: classes3.dex */
public final class C9724w implements InterfaceC9705g {

    /* renamed from: f */
    public final C9703f f37083f;

    /* renamed from: g */
    public boolean f37084g;

    /* renamed from: h */
    public final InterfaceC9696b0 f37085h;

    public C9724w(InterfaceC9696b0 interfaceC9696b0) {
        C9801m.m32346f(interfaceC9696b0, "sink");
        this.f37085h = interfaceC9696b0;
        this.f37083f = new C9703f();
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: A0 */
    public InterfaceC9705g mo31997A0(String str, int i2, int i3) {
        C9801m.m32346f(str, "string");
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.mo31997A0(str, i2, i3);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: B0 */
    public long mo31999B0(InterfaceC9700d0 interfaceC9700d0) throws IOException {
        C9801m.m32346f(interfaceC9700d0, "source");
        long j2 = 0;
        while (true) {
            long j3 = interfaceC9700d0.read(this.f37083f, 8192);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            mo32032c0();
        }
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: C */
    public InterfaceC9705g mo32000C() throws IOException {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.f37083f.size();
        if (size > 0) {
            this.f37085h.write(this.f37083f, size);
        }
        return this;
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: C0 */
    public InterfaceC9705g mo32001C0(long j2) {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.mo32001C0(j2);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: U0 */
    public InterfaceC9705g mo32023U0(C9710i c9710i) {
        C9801m.m32346f(c9710i, "byteString");
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.mo32023U0(c9710i);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: c0 */
    public InterfaceC9705g mo32032c0() throws IOException {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM32036e = this.f37083f.m32036e();
        if (jM32036e > 0) {
            this.f37085h.write(this.f37083f, jM32036e);
        }
        return this;
    }

    @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f37084g) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f37083f.size() > 0) {
                InterfaceC9696b0 interfaceC9696b0 = this.f37085h;
                C9703f c9703f = this.f37083f;
                interfaceC9696b0.write(c9703f, c9703f.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f37085h.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f37084g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p353j.InterfaceC9705g, p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f37083f.size() > 0) {
            InterfaceC9696b0 interfaceC9696b0 = this.f37085h;
            C9703f c9703f = this.f37083f;
            interfaceC9696b0.write(c9703f, c9703f.size());
        }
        this.f37085h.flush();
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: i */
    public C9703f mo32042i() {
        return this.f37083f;
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: i1 */
    public InterfaceC9705g mo32043i1(long j2) {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.mo32043i1(j2);
        return mo32032c0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f37084g;
    }

    @Override // p353j.InterfaceC9705g
    /* renamed from: r0 */
    public InterfaceC9705g mo32055r0(String str) {
        C9801m.m32346f(str, "string");
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.mo32055r0(str);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9696b0
    public C9702e0 timeout() {
        return this.f37085h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f37085h + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        C9801m.m32346f(byteBuffer, "source");
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f37083f.write(byteBuffer);
        mo32032c0();
        return iWrite;
    }

    @Override // p353j.InterfaceC9705g
    public InterfaceC9705g writeByte(int i2) {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.writeByte(i2);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9705g
    public InterfaceC9705g writeInt(int i2) {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.writeInt(i2);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9705g
    public InterfaceC9705g writeShort(int i2) {
        if (!(!this.f37084g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f37083f.writeShort(i2);
        return mo32032c0();
    }

    @Override // p353j.InterfaceC9696b0
    public void write(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "source");
        if (!this.f37084g) {
            this.f37083f.write(c9703f, j2);
            mo32032c0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p353j.InterfaceC9705g
    public InterfaceC9705g write(byte[] bArr) {
        C9801m.m32346f(bArr, "source");
        if (!this.f37084g) {
            this.f37083f.write(bArr);
            return mo32032c0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p353j.InterfaceC9705g
    public InterfaceC9705g write(byte[] bArr, int i2, int i3) {
        C9801m.m32346f(bArr, "source");
        if (!this.f37084g) {
            this.f37083f.write(bArr, i2, i3);
            return mo32032c0();
        }
        throw new IllegalStateException("closed".toString());
    }
}
