package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttPubRel.java */
/* loaded from: classes3.dex */
public class n extends h {
    public n(m mVar) {
        super((byte) 6);
        x(mVar.p());
    }

    @Override // Jc.u
    protected byte q() {
        return (byte) ((this.f7830c ? 8 : 0) | 2);
    }

    @Override // Jc.u
    protected byte[] t() {
        return l();
    }

    @Override // Jc.u
    public String toString() {
        return super.toString() + " msgId " + this.f7829b;
    }

    public n(byte b10, byte[] bArr) throws IOException {
        super((byte) 6);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }
}
