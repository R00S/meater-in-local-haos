package Jc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: MqttConnack.java */
/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: e, reason: collision with root package name */
    private final int f7800e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7801f;

    public c(byte b10, byte[] bArr) throws IOException {
        super((byte) 2);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f7801f = (dataInputStream.readUnsignedByte() & 1) == 1;
        this.f7800e = dataInputStream.readUnsignedByte();
        dataInputStream.close();
    }

    @Override // Jc.u
    public String o() {
        return "Con";
    }

    @Override // Jc.u
    protected byte[] t() {
        return new byte[0];
    }

    @Override // Jc.b, Jc.u
    public String toString() {
        return super.toString() + " session present:" + this.f7801f + " return code: " + this.f7800e;
    }

    @Override // Jc.u
    public boolean u() {
        return false;
    }

    public int y() {
        return this.f7800e;
    }
}
