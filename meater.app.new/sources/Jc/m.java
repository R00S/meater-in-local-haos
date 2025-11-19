package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttPubRec.java */
/* loaded from: classes3.dex */
public class m extends b {
    public m(byte b10, byte[] bArr) throws IOException {
        super((byte) 5);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte[] t() {
        return l();
    }

    public m(o oVar) {
        super((byte) 5);
        this.f7829b = oVar.p();
    }
}
