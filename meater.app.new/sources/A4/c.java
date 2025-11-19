package A4;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: MEATERPlusProbeInfo.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f754a;

    /* renamed from: b, reason: collision with root package name */
    public long f755b;

    /* renamed from: c, reason: collision with root package name */
    public String f756c;

    public static c a(ByteBuffer byteBuffer) {
        c cVar = new c();
        byteBuffer.position(0);
        cVar.f754a = byteBuffer.get();
        byteBuffer.position(1);
        cVar.f755b = byteBuffer.getLong();
        byte[] bArr = new byte[15];
        byteBuffer.position(9);
        byteBuffer.get(bArr, 0, 15);
        cVar.f756c = new String(bArr, StandardCharsets.UTF_8).trim();
        return cVar;
    }
}
