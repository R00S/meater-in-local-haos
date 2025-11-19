package Jc;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttInputStream.java */
/* loaded from: classes3.dex */
public class f extends InputStream {

    /* renamed from: D, reason: collision with root package name */
    private static final String f7810D = "Jc.f";

    /* renamed from: E, reason: collision with root package name */
    private static final Kc.b f7811E = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f.class.getName());

    /* renamed from: B, reason: collision with root package name */
    private Gc.b f7812B;

    /* renamed from: C, reason: collision with root package name */
    private final DataInputStream f7813C;

    public f(Gc.b bVar, InputStream inputStream) {
        this.f7812B = bVar;
        this.f7813C = new DataInputStream(inputStream);
    }

    private void a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f7813C.read(bArr, i10 + i12, i11 - i12);
            this.f7812B.s(i13);
            if (i13 < 0) {
                throw new EOFException();
            }
            i12 += i13;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7813C.available();
    }

    public u b() throws MqttException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte b10 = this.f7813C.readByte();
        this.f7812B.s(1);
        byte b11 = (byte) ((b10 >>> 4) & 15);
        if (b11 < 1 || b11 > 14) {
            throw Gc.h.a(32108);
        }
        long jA = u.v(this.f7813C).a();
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(u.k(jA));
        int size = (int) (byteArrayOutputStream.size() + jA);
        byte[] bArr = new byte[size];
        a(bArr, byteArrayOutputStream.size(), size - byteArrayOutputStream.size());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
        u uVarI = u.i(bArr);
        f7811E.g(f7810D, "readMqttWireMessage", "501", new Object[]{uVarI});
        return uVarI;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7813C.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f7813C.read();
    }
}
