package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttPubComp.java */
/* loaded from: classes3.dex */
public class l extends b {
    public l(byte b10, byte[] bArr) throws IOException {
        super((byte) 7);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte[] t() {
        return l();
    }

    public l(o oVar) {
        super((byte) 7);
        this.f7829b = oVar.p();
    }

    public l(int i10) {
        super((byte) 7);
        this.f7829b = i10;
    }
}
