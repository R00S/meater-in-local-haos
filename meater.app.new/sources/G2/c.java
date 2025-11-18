package G2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f4865a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f4866b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f4865a = byteArrayOutputStream;
        this.f4866b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) throws IOException {
        this.f4865a.reset();
        try {
            b(this.f4866b, aVar.f4859B);
            String str = aVar.f4860C;
            if (str == null) {
                str = "";
            }
            b(this.f4866b, str);
            this.f4866b.writeLong(aVar.f4861D);
            this.f4866b.writeLong(aVar.f4862E);
            this.f4866b.write(aVar.f4863F);
            this.f4866b.flush();
            return this.f4865a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
