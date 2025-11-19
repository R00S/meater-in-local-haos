package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttSuback.java */
/* loaded from: classes3.dex */
public class q extends b {

    /* renamed from: e, reason: collision with root package name */
    private final int[] f7821e;

    public q(byte b10, byte[] bArr) throws IOException {
        super((byte) 9);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7829b = dataInputStream.readUnsignedShort();
        this.f7821e = new int[bArr.length - 2];
        int i10 = 0;
        for (int i11 = dataInputStream.read(); i11 != -1; i11 = dataInputStream.read()) {
            this.f7821e[i10] = i11;
            i10++;
        }
        dataInputStream.close();
    }

    @Override // Jc.u
    protected byte[] t() {
        return new byte[0];
    }

    @Override // Jc.b, Jc.u
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" granted Qos");
        for (int i10 = 0; i10 < this.f7821e.length; i10++) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f7821e[i10]);
        }
        return stringBuffer.toString();
    }
}
