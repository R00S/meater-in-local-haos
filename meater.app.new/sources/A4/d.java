package A4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MEATERPlusStatusCmd.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public b f757a;

    /* renamed from: b, reason: collision with root package name */
    public int f758b;

    /* renamed from: c, reason: collision with root package name */
    public int f759c;

    /* renamed from: d, reason: collision with root package name */
    public int f760d;

    public static d a(ByteBuffer byteBuffer) {
        d dVar = new d();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(0);
        dVar.f757a = b.j(byteBuffer.get());
        byteBuffer.position(1);
        dVar.f758b = byteBuffer.getShort();
        byteBuffer.position(3);
        dVar.f759c = byteBuffer.getInt();
        byteBuffer.position(7);
        dVar.f760d = byteBuffer.getInt();
        return dVar;
    }

    public ByteBuffer b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(11);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.position(0);
        byteBufferAllocate.put((byte) this.f757a.n());
        byteBufferAllocate.position(1);
        byteBufferAllocate.putShort((short) this.f758b);
        byteBufferAllocate.position(3);
        byteBufferAllocate.putInt(this.f759c);
        byteBufferAllocate.position(7);
        byteBufferAllocate.putInt(this.f760d);
        return byteBufferAllocate;
    }
}
