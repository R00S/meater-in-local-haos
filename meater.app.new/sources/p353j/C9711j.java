package p353j;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C9801m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* renamed from: j.j */
/* loaded from: classes3.dex */
public final class C9711j implements InterfaceC9696b0 {

    /* renamed from: f */
    private boolean f37056f;

    /* renamed from: g */
    private final InterfaceC9705g f37057g;

    /* renamed from: h */
    private final Deflater f37058h;

    public C9711j(InterfaceC9705g interfaceC9705g, Deflater deflater) {
        C9801m.m32346f(interfaceC9705g, "sink");
        C9801m.m32346f(deflater, "deflater");
        this.f37057g = interfaceC9705g;
        this.f37058h = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private final void m32106a(boolean z) throws IOException {
        C9726y c9726yM32054q0;
        int iDeflate;
        C9703f c9703fMo32042i = this.f37057g.mo32042i();
        while (true) {
            c9726yM32054q0 = c9703fMo32042i.m32054q0(1);
            if (z) {
                Deflater deflater = this.f37058h;
                byte[] bArr = c9726yM32054q0.f37091b;
                int i2 = c9726yM32054q0.f37093d;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f37058h;
                byte[] bArr2 = c9726yM32054q0.f37091b;
                int i3 = c9726yM32054q0.f37093d;
                iDeflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                c9726yM32054q0.f37093d += iDeflate;
                c9703fMo32042i.m32038f0(c9703fMo32042i.size() + iDeflate);
                this.f37057g.mo32032c0();
            } else if (this.f37058h.needsInput()) {
                break;
            }
        }
        if (c9726yM32054q0.f37092c == c9726yM32054q0.f37093d) {
            c9703fMo32042i.f37038f = c9726yM32054q0.m32162b();
            C9727z.m32169b(c9726yM32054q0);
        }
    }

    /* renamed from: b */
    public final void m32107b() throws IOException {
        this.f37058h.finish();
        m32106a(false);
    }

    @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f37056f) {
            return;
        }
        Throwable th = null;
        try {
            m32107b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f37058h.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f37057g.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f37056f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() throws IOException {
        m32106a(true);
        this.f37057g.flush();
    }

    @Override // p353j.InterfaceC9696b0
    public C9702e0 timeout() {
        return this.f37057g.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f37057g + ')';
    }

    @Override // p353j.InterfaceC9696b0
    public void write(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "source");
        C9697c.m31982b(c9703f.size(), 0L, j2);
        while (j2 > 0) {
            C9726y c9726y = c9703f.f37038f;
            C9801m.m32343c(c9726y);
            int iMin = (int) Math.min(j2, c9726y.f37093d - c9726y.f37092c);
            this.f37058h.setInput(c9726y.f37091b, c9726y.f37092c, iMin);
            m32106a(false);
            long j3 = iMin;
            c9703f.m32038f0(c9703f.size() - j3);
            int i2 = c9726y.f37092c + iMin;
            c9726y.f37092c = i2;
            if (i2 == c9726y.f37093d) {
                c9703f.f37038f = c9726y.m32162b();
                C9727z.m32169b(c9726y);
            }
            j2 -= j3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9711j(InterfaceC9696b0 interfaceC9696b0, Deflater deflater) {
        this(C9718q.m32119c(interfaceC9696b0), deflater);
        C9801m.m32346f(interfaceC9696b0, "sink");
        C9801m.m32346f(deflater, "deflater");
    }
}
