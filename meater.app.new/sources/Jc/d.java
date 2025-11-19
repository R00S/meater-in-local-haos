package Jc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttConnect.java */
/* loaded from: classes3.dex */
public class d extends u {

    /* renamed from: e, reason: collision with root package name */
    private final String f7802e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7803f;

    /* renamed from: g, reason: collision with root package name */
    private Fc.m f7804g;

    /* renamed from: h, reason: collision with root package name */
    private String f7805h;

    /* renamed from: i, reason: collision with root package name */
    private char[] f7806i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7807j;

    /* renamed from: k, reason: collision with root package name */
    private String f7808k;

    /* renamed from: l, reason: collision with root package name */
    private int f7809l;

    public d(byte b10, byte[] bArr) throws MqttException, IOException {
        super((byte) 1);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        j(dataInputStream);
        dataInputStream.readByte();
        dataInputStream.readByte();
        this.f7807j = dataInputStream.readUnsignedShort();
        this.f7802e = j(dataInputStream);
        dataInputStream.close();
    }

    @Override // Jc.u
    public String o() {
        return "Con";
    }

    @Override // Jc.u
    protected byte q() {
        return (byte) 0;
    }

    @Override // Jc.u
    public byte[] r() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            m(dataOutputStream, this.f7802e);
            if (this.f7804g != null) {
                m(dataOutputStream, this.f7808k);
                dataOutputStream.writeShort(this.f7804g.b().length);
                dataOutputStream.write(this.f7804g.b());
            }
            String str = this.f7805h;
            if (str != null) {
                m(dataOutputStream, str);
                char[] cArr = this.f7806i;
                if (cArr != null) {
                    m(dataOutputStream, new String(cArr));
                }
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // Jc.u
    protected byte[] t() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i10 = this.f7809l;
            if (i10 == 3) {
                m(dataOutputStream, "MQIsdp");
            } else if (i10 == 4) {
                m(dataOutputStream, "MQTT");
            }
            dataOutputStream.write(this.f7809l);
            byte bC = this.f7803f ? (byte) 2 : (byte) 0;
            Fc.m mVar = this.f7804g;
            if (mVar != null) {
                bC = (byte) (((byte) (bC | 4)) | (mVar.c() << 3));
                if (this.f7804g.e()) {
                    bC = (byte) (bC | 32);
                }
            }
            if (this.f7805h != null) {
                bC = (byte) (bC | 128);
                if (this.f7806i != null) {
                    bC = (byte) (bC | 64);
                }
            }
            dataOutputStream.write(bC);
            dataOutputStream.writeShort(this.f7807j);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // Jc.u
    public String toString() {
        return super.toString() + " clientId " + this.f7802e + " keepAliveInterval " + this.f7807j;
    }

    @Override // Jc.u
    public boolean u() {
        return false;
    }

    public d(String str, int i10, boolean z10, int i11, String str2, char[] cArr, Fc.m mVar, String str3) {
        super((byte) 1);
        this.f7802e = str;
        this.f7803f = z10;
        this.f7807j = i11;
        this.f7805h = str2;
        this.f7806i = cArr;
        this.f7804g = mVar;
        this.f7808k = str3;
        this.f7809l = i10;
    }
}
