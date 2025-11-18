package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttUnsubAck.java */
/* loaded from: classes3.dex */
public class s extends b {
    public s(byte b10, byte[] bArr) throws IOException {
        super((byte) 11);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte[] t() {
        return new byte[0];
    }
}
