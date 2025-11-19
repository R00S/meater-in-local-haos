package Jc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttWireMessage.java */
/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f7827d = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    /* renamed from: a, reason: collision with root package name */
    private final byte f7828a;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f7830c = false;

    /* renamed from: b, reason: collision with root package name */
    protected int f7829b = 0;

    public u(byte b10) {
        this.f7828a = b10;
    }

    public static u g(Fc.n nVar) {
        byte[] bArrD = nVar.d();
        if (bArrD == null) {
            bArrD = new byte[0];
        }
        return h(new v(nVar.b(), nVar.c(), nVar.f(), bArrD, nVar.e(), nVar.a()));
    }

    private static u h(InputStream inputStream) throws MqttException, IOException {
        try {
            DataInputStream dataInputStream = new DataInputStream(new a(inputStream));
            int unsignedByte = dataInputStream.readUnsignedByte();
            byte b10 = (byte) (unsignedByte >> 4);
            byte b11 = (byte) (unsignedByte & 15);
            long jA = (r0.a() + v(dataInputStream).a()) - r0.a();
            byte[] bArr = new byte[0];
            if (jA > 0) {
                int i10 = (int) jA;
                byte[] bArr2 = new byte[i10];
                dataInputStream.readFully(bArr2, 0, i10);
                bArr = bArr2;
            }
            if (b10 == 1) {
                return new d(b11, bArr);
            }
            if (b10 == 3) {
                return new o(b11, bArr);
            }
            if (b10 == 4) {
                return new k(b11, bArr);
            }
            if (b10 == 7) {
                return new l(b11, bArr);
            }
            if (b10 == 2) {
                return new c(b11, bArr);
            }
            if (b10 == 12) {
                return new i(b11, bArr);
            }
            if (b10 == 13) {
                return new j(b11, bArr);
            }
            if (b10 == 8) {
                return new r(b11, bArr);
            }
            if (b10 == 9) {
                return new q(b11, bArr);
            }
            if (b10 == 10) {
                return new t(b11, bArr);
            }
            if (b10 == 11) {
                return new s(b11, bArr);
            }
            if (b10 == 6) {
                return new n(b11, bArr);
            }
            if (b10 == 5) {
                return new m(b11, bArr);
            }
            if (b10 == 14) {
                return new e(b11, bArr);
            }
            throw Gc.h.a(6);
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public static u i(byte[] bArr) {
        return h(new ByteArrayInputStream(bArr));
    }

    protected static byte[] k(long j10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        do {
            byte b10 = (byte) (j10 % 128);
            j10 /= 128;
            if (j10 > 0) {
                b10 = (byte) (b10 | 128);
            }
            byteArrayOutputStream.write(b10);
            i10++;
            if (j10 <= 0) {
                break;
            }
        } while (i10 < 4);
        return byteArrayOutputStream.toByteArray();
    }

    protected static w v(DataInputStream dataInputStream) throws IOException {
        long j10 = 0;
        int i10 = 0;
        int i11 = 1;
        do {
            i10++;
            j10 += (r5 & 127) * i11;
            i11 *= 128;
        } while ((dataInputStream.readByte() & 128) != 0);
        return new w(j10, i10);
    }

    protected String j(DataInputStream dataInputStream) throws MqttException, IOException {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    protected byte[] l() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.f7829b);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    protected void m(DataOutputStream dataOutputStream, String str) throws MqttException, IOException {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte length = (byte) ((bytes.length >>> 8) & 255);
            byte length2 = (byte) (bytes.length & 255);
            dataOutputStream.write(length);
            dataOutputStream.write(length2);
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e10) {
            throw new MqttException(e10);
        } catch (IOException e11) {
            throw new MqttException(e11);
        }
    }

    public byte[] n() throws MqttException, IOException {
        try {
            int iS = ((s() & 15) << 4) ^ (q() & 15);
            byte[] bArrT = t();
            int length = bArrT.length + r().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(iS);
            dataOutputStream.write(k(length));
            dataOutputStream.write(bArrT);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public String o() {
        return Integer.valueOf(p()).toString();
    }

    public int p() {
        return this.f7829b;
    }

    protected abstract byte q();

    public byte[] r() {
        return new byte[0];
    }

    public byte s() {
        return this.f7828a;
    }

    protected abstract byte[] t();

    public String toString() {
        return f7827d[this.f7828a];
    }

    public boolean u() {
        return true;
    }

    public void w(boolean z10) {
        this.f7830c = z10;
    }

    public void x(int i10) {
        this.f7829b = i10;
    }
}
