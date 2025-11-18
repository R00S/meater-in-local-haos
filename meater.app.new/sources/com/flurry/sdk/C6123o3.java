package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.DigestOutputStream;

/* renamed from: com.flurry.sdk.o3 */
/* loaded from: classes2.dex */
public final class C6123o3 {
    /* renamed from: a */
    public final synchronized byte[] m13226a(InterfaceC6177u6 interfaceC6177u6) {
        byte[] byteArray;
        DataOutputStream dataOutputStream;
        C6026d6 c6026d6;
        ByteArrayOutputStream byteArrayOutputStream;
        DigestOutputStream digestOutputStream;
        byteArray = null;
        try {
            c6026d6 = new C6026d6();
            byteArrayOutputStream = new ByteArrayOutputStream(640);
            digestOutputStream = new DigestOutputStream(byteArrayOutputStream, c6026d6);
            dataOutputStream = new DataOutputStream(digestOutputStream);
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            C6021d1.m13030c(3, "FrameSerializer", "Adding frame " + interfaceC6177u6.mo12961a() + " payload " + interfaceC6177u6.mo13296d());
            dataOutputStream.writeByte(interfaceC6177u6.mo13297e());
            int i2 = interfaceC6177u6.mo12961a().f16372T;
            byte[] bArr = {(byte) (i2 >> 16), (byte) (i2 >> 8), (byte) (i2 >> 0), 0};
            for (int i3 = 0; i3 < 3; i3++) {
                dataOutputStream.write(bArr[i3]);
            }
            dataOutputStream.writeLong(interfaceC6177u6.mo13295c());
            dataOutputStream.writeLong(interfaceC6177u6.mo13294b());
            byte[] bytes = interfaceC6177u6.mo13296d().getBytes("UTF-8");
            dataOutputStream.writeInt(bytes.length);
            dataOutputStream.write(bytes);
            if (interfaceC6177u6.mo13299g()) {
                digestOutputStream.on(false);
                dataOutputStream.writeInt(c6026d6.m13046a());
            }
            dataOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            try {
                C6021d1.m13031d(3, "FrameSerializer", "Error when generating report", th);
                return byteArray;
            } finally {
                C6013c2.m12990f(dataOutputStream);
            }
        }
        return byteArray;
    }
}
