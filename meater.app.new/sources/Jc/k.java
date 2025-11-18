package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttPubAck.java */
/* loaded from: classes3.dex */
public class k extends b {
    public k(byte b10, byte[] bArr) throws IOException {
        super((byte) 4);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte[] t() {
        return l();
    }

    public k(o oVar) {
        super((byte) 4);
        this.f7829b = oVar.p();
    }
}
