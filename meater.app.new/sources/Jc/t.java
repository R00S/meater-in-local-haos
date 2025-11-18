package Jc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttUnsubscribe.java */
/* loaded from: classes3.dex */
public class t extends u {

    /* renamed from: e, reason: collision with root package name */
    private final String[] f7825e;

    /* renamed from: f, reason: collision with root package name */
    private int f7826f;

    public t(String[] strArr) {
        super((byte) 10);
        this.f7825e = strArr;
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
                String[] strArr = this.f7825e;
                if (i10 >= strArr.length) {
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                m(dataOutputStream, strArr[i10]);
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
        for (int i10 = 0; i10 < this.f7826f; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"" + this.f7825e[i10] + "\"");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public t(byte b10, byte[] bArr) throws IOException {
        super((byte) 10);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        boolean z10 = false;
        this.f7826f = 0;
        this.f7825e = new String[10];
        while (!z10) {
            try {
                this.f7825e[this.f7826f] = j(dataInputStream);
            } catch (Exception unused) {
                z10 = true;
            }
        }
        dataInputStream.close();
    }
}
