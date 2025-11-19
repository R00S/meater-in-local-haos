package Jc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttPublish.java */
/* loaded from: classes3.dex */
public class o extends h {

    /* renamed from: e, reason: collision with root package name */
    private final Fc.m f7818e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7819f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f7820g;

    public o(String str, Fc.m mVar) {
        super((byte) 3);
        this.f7820g = null;
        this.f7819f = str;
        this.f7818e = mVar;
    }

    protected static byte[] y(Fc.m mVar) {
        return mVar.b();
    }

    public String A() {
        return this.f7819f;
    }

    @Override // Jc.h, Fc.n
    public int a() {
        try {
            return r().length;
        } catch (MqttException unused) {
            return 0;
        }
    }

    @Override // Jc.u
    protected byte q() {
        byte bC = (byte) (this.f7818e.c() << 1);
        if (this.f7818e.e()) {
            bC = (byte) (bC | 1);
        }
        return (this.f7818e.d() || this.f7830c) ? (byte) (bC | 8) : bC;
    }

    @Override // Jc.u
    public byte[] r() {
        if (this.f7820g == null) {
            this.f7820g = y(this.f7818e);
        }
        return this.f7820g;
    }

    @Override // Jc.u
    protected byte[] t() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            m(dataOutputStream, this.f7819f);
            if (this.f7818e.c() > 0) {
                dataOutputStream.writeShort(this.f7829b);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // Jc.u
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArrB = this.f7818e.b();
        int iMin = Math.min(bArrB.length, 20);
        for (int i10 = 0; i10 < iMin; i10++) {
            String hexString = Integer.toHexString(bArrB[i10]);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString);
        }
        try {
            str = new String(bArrB, 0, iMin, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            str = "?";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(super.toString());
        stringBuffer2.append(" qos:");
        stringBuffer2.append(this.f7818e.c());
        if (this.f7818e.c() > 0) {
            stringBuffer2.append(" msgId:");
            stringBuffer2.append(this.f7829b);
        }
        stringBuffer2.append(" retained:");
        stringBuffer2.append(this.f7818e.e());
        stringBuffer2.append(" dup:");
        stringBuffer2.append(this.f7830c);
        stringBuffer2.append(" topic:\"");
        stringBuffer2.append(this.f7819f);
        stringBuffer2.append("\"");
        stringBuffer2.append(" payload:[hex:");
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(" utf8:\"");
        stringBuffer2.append(str);
        stringBuffer2.append("\"");
        stringBuffer2.append(" length:");
        stringBuffer2.append(bArrB.length);
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    @Override // Jc.u
    public boolean u() {
        return true;
    }

    @Override // Jc.u
    public void x(int i10) {
        super.x(i10);
        Fc.m mVar = this.f7818e;
        if (mVar instanceof p) {
            ((p) mVar).m(i10);
        }
    }

    public Fc.m z() {
        return this.f7818e;
    }

    public o(byte b10, byte[] bArr) throws IOException {
        super((byte) 3);
        this.f7820g = null;
        p pVar = new p();
        this.f7818e = pVar;
        pVar.j(3 & (b10 >> 1));
        if ((b10 & 1) == 1) {
            pVar.k(true);
        }
        if ((b10 & 8) == 8) {
            pVar.f(true);
        }
        a aVar = new a(new ByteArrayInputStream(bArr));
        DataInputStream dataInputStream = new DataInputStream(aVar);
        this.f7819f = j(dataInputStream);
        if (pVar.c() > 0) {
            this.f7829b = dataInputStream.readUnsignedShort();
        }
        byte[] bArr2 = new byte[bArr.length - aVar.a()];
        dataInputStream.readFully(bArr2);
        dataInputStream.close();
        pVar.i(bArr2);
    }
}
