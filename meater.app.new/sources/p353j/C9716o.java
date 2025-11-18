package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C9801m;

/* compiled from: InflaterSource.kt */
/* renamed from: j.o */
/* loaded from: classes3.dex */
public final class C9716o implements InterfaceC9700d0 {

    /* renamed from: f */
    private int f37065f;

    /* renamed from: g */
    private boolean f37066g;

    /* renamed from: h */
    private final InterfaceC9709h f37067h;

    /* renamed from: i */
    private final Inflater f37068i;

    public C9716o(InterfaceC9709h interfaceC9709h, Inflater inflater) {
        C9801m.m32346f(interfaceC9709h, "source");
        C9801m.m32346f(inflater, "inflater");
        this.f37067h = interfaceC9709h;
        this.f37068i = inflater;
    }

    /* renamed from: c */
    private final void m32114c() throws IOException {
        int i2 = this.f37065f;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f37068i.getRemaining();
        this.f37065f -= remaining;
        this.f37067h.skip(remaining);
    }

    /* renamed from: a */
    public final long m32115a(C9703f c9703f, long j2) throws DataFormatException, IOException {
        C9801m.m32346f(c9703f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f37066g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            C9726y c9726yM32054q0 = c9703f.m32054q0(1);
            int iMin = (int) Math.min(j2, 8192 - c9726yM32054q0.f37093d);
            m32116b();
            int iInflate = this.f37068i.inflate(c9726yM32054q0.f37091b, c9726yM32054q0.f37093d, iMin);
            m32114c();
            if (iInflate > 0) {
                c9726yM32054q0.f37093d += iInflate;
                long j3 = iInflate;
                c9703f.m32038f0(c9703f.size() + j3);
                return j3;
            }
            if (c9726yM32054q0.f37092c == c9726yM32054q0.f37093d) {
                c9703f.f37038f = c9726yM32054q0.m32162b();
                C9727z.m32169b(c9726yM32054q0);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: b */
    public final boolean m32116b() throws IOException {
        if (!this.f37068i.needsInput()) {
            return false;
        }
        if (this.f37067h.mo32019R()) {
            return true;
        }
        C9726y c9726y = this.f37067h.mo32042i().f37038f;
        C9801m.m32343c(c9726y);
        int i2 = c9726y.f37093d;
        int i3 = c9726y.f37092c;
        int i4 = i2 - i3;
        this.f37065f = i4;
        this.f37068i.setInput(c9726y.f37091b, i3, i4);
        return false;
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37066g) {
            return;
        }
        this.f37068i.end();
        this.f37066g = true;
        this.f37067h.close();
    }

    @Override // p353j.InterfaceC9700d0
    public long read(C9703f c9703f, long j2) throws DataFormatException, IOException {
        C9801m.m32346f(c9703f, "sink");
        do {
            long jM32115a = m32115a(c9703f, j2);
            if (jM32115a > 0) {
                return jM32115a;
            }
            if (this.f37068i.finished() || this.f37068i.needsDictionary()) {
                return -1L;
            }
        } while (!this.f37067h.mo32019R());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.f37067h.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9716o(InterfaceC9700d0 interfaceC9700d0, Inflater inflater) {
        this(C9718q.m32120d(interfaceC9700d0), inflater);
        C9801m.m32346f(interfaceC9700d0, "source");
        C9801m.m32346f(inflater, "inflater");
    }
}
