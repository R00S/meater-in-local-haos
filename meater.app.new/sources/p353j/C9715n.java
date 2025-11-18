package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C9801m;

/* compiled from: GzipSource.kt */
/* renamed from: j.n */
/* loaded from: classes3.dex */
public final class C9715n implements InterfaceC9700d0 {

    /* renamed from: f */
    private byte f37060f;

    /* renamed from: g */
    private final C9725x f37061g;

    /* renamed from: h */
    private final Inflater f37062h;

    /* renamed from: i */
    private final C9716o f37063i;

    /* renamed from: j */
    private final CRC32 f37064j;

    public C9715n(InterfaceC9700d0 interfaceC9700d0) {
        C9801m.m32346f(interfaceC9700d0, "source");
        C9725x c9725x = new C9725x(interfaceC9700d0);
        this.f37061g = c9725x;
        Inflater inflater = new Inflater(true);
        this.f37062h = inflater;
        this.f37063i = new C9716o((InterfaceC9709h) c9725x, inflater);
        this.f37064j = new CRC32();
    }

    /* renamed from: a */
    private final void m32110a(String str, int i2, int i3) throws IOException {
        if (i3 == i2) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        C9801m.m32345e(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    /* renamed from: b */
    private final void m32111b() throws IOException {
        this.f37061g.mo32041g1(10L);
        byte bM32047m = this.f37061g.f37086f.m32047m(3L);
        boolean z = ((bM32047m >> 1) & 1) == 1;
        if (z) {
            m32113d(this.f37061g.f37086f, 0L, 10L);
        }
        m32110a("ID1ID2", 8075, this.f37061g.readShort());
        this.f37061g.skip(8L);
        if (((bM32047m >> 2) & 1) == 1) {
            this.f37061g.mo32041g1(2L);
            if (z) {
                m32113d(this.f37061g.f37086f, 0L, 2L);
            }
            long jM32013N = this.f37061g.f37086f.m32013N();
            this.f37061g.mo32041g1(jM32013N);
            if (z) {
                m32113d(this.f37061g.f37086f, 0L, jM32013N);
            }
            this.f37061g.skip(jM32013N);
        }
        if (((bM32047m >> 3) & 1) == 1) {
            long jM32154a = this.f37061g.m32154a((byte) 0);
            if (jM32154a == -1) {
                throw new EOFException();
            }
            if (z) {
                m32113d(this.f37061g.f37086f, 0L, jM32154a + 1);
            }
            this.f37061g.skip(jM32154a + 1);
        }
        if (((bM32047m >> 4) & 1) == 1) {
            long jM32154a2 = this.f37061g.m32154a((byte) 0);
            if (jM32154a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m32113d(this.f37061g.f37086f, 0L, jM32154a2 + 1);
            }
            this.f37061g.skip(jM32154a2 + 1);
        }
        if (z) {
            m32110a("FHCRC", this.f37061g.m32160j(), (short) this.f37064j.getValue());
            this.f37064j.reset();
        }
    }

    /* renamed from: c */
    private final void m32112c() throws IOException {
        m32110a("CRC", this.f37061g.m32159f(), (int) this.f37064j.getValue());
        m32110a("ISIZE", this.f37061g.m32159f(), (int) this.f37062h.getBytesWritten());
    }

    /* renamed from: d */
    private final void m32113d(C9703f c9703f, long j2, long j3) {
        C9726y c9726y = c9703f.f37038f;
        C9801m.m32343c(c9726y);
        while (true) {
            int i2 = c9726y.f37093d;
            int i3 = c9726y.f37092c;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            c9726y = c9726y.f37096g;
            C9801m.m32343c(c9726y);
        }
        while (j3 > 0) {
            int iMin = (int) Math.min(c9726y.f37093d - r7, j3);
            this.f37064j.update(c9726y.f37091b, (int) (c9726y.f37092c + j2), iMin);
            j3 -= iMin;
            c9726y = c9726y.f37096g;
            C9801m.m32343c(c9726y);
            j2 = 0;
        }
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37063i.close();
    }

    @Override // p353j.InterfaceC9700d0
    public long read(C9703f c9703f, long j2) throws DataFormatException, IOException {
        C9801m.m32346f(c9703f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f37060f == 0) {
            m32111b();
            this.f37060f = (byte) 1;
        }
        if (this.f37060f == 1) {
            long size = c9703f.size();
            long j3 = this.f37063i.read(c9703f, j2);
            if (j3 != -1) {
                m32113d(c9703f, size, j3);
                return j3;
            }
            this.f37060f = (byte) 2;
        }
        if (this.f37060f == 2) {
            m32112c();
            this.f37060f = (byte) 3;
            if (!this.f37061g.mo32019R()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.f37061g.timeout();
    }
}
