package Jc;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MqttOutputStream.java */
/* loaded from: classes3.dex */
public class g extends OutputStream {

    /* renamed from: D, reason: collision with root package name */
    private static final String f7814D = "Jc.g";

    /* renamed from: E, reason: collision with root package name */
    private static final Kc.b f7815E = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", g.class.getName());

    /* renamed from: B, reason: collision with root package name */
    private Gc.b f7816B;

    /* renamed from: C, reason: collision with root package name */
    private final BufferedOutputStream f7817C;

    public g(Gc.b bVar, OutputStream outputStream) {
        this.f7816B = bVar;
        this.f7817C = new BufferedOutputStream(outputStream);
    }

    public void a(u uVar) {
        byte[] bArrN = uVar.n();
        byte[] bArrR = uVar.r();
        int i10 = 0;
        this.f7817C.write(bArrN, 0, bArrN.length);
        this.f7816B.w(bArrN.length);
        while (i10 < bArrR.length) {
            int iMin = Math.min(1024, bArrR.length - i10);
            this.f7817C.write(bArrR, i10, iMin);
            i10 += 1024;
            this.f7816B.w(iMin);
        }
        f7815E.g(f7814D, "write", "500", new Object[]{uVar});
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7817C.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f7817C.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f7817C.write(bArr);
        this.f7816B.w(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f7817C.write(bArr, i10, i11);
        this.f7816B.w(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f7817C.write(i10);
    }
}
