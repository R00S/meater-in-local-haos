package Jc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttSubscribe.java */
/* loaded from: classes3.dex */
public class r extends u {

    /* renamed from: e, reason: collision with root package name */
    private final String[] f7822e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f7823f;

    /* renamed from: g, reason: collision with root package name */
    private int f7824g;

    public r(byte b10, byte[] bArr) throws IOException {
        super((byte) 8);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        boolean z10 = false;
        this.f7824g = 0;
        this.f7822e = new String[10];
        this.f7823f = new int[10];
        while (!z10) {
            try {
                this.f7822e[this.f7824g] = j(dataInputStream);
                int[] iArr = this.f7823f;
                int i10 = this.f7824g;
                this.f7824g = i10 + 1;
                iArr[i10] = dataInputStream.readByte();
            } catch (Exception unused) {
                z10 = true;
            }
        }
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte q() {
        return (byte) ((this.f7830c ? 8 : 0) | 2);
    }

    @Override // Jc.u
    public byte[] r() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i10 = 0;
            while (true) {
                String[] strArr = this.f7822e;
                if (i10 >= strArr.length) {
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                m(dataOutputStream, strArr[i10]);
                dataOutputStream.writeByte(this.f7823f[i10]);
                i10++;
            }
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // Jc.u
    protected byte[] t() throws MqttException, IOException {
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

    @Override // Jc.u
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" names:[");
        for (int i10 = 0; i10 < this.f7824g; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"");
            stringBuffer.append(this.f7822e[i10]);
            stringBuffer.append("\"");
        }
        stringBuffer.append("] qos:[");
        for (int i11 = 0; i11 < this.f7824g; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f7823f[i11]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public r(String[] strArr, int[] iArr) {
        super((byte) 8);
        this.f7822e = strArr;
        this.f7823f = iArr;
        if (strArr.length == iArr.length) {
            for (int i10 : iArr) {
                Fc.m.l(i10);
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
