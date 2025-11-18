package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.r1 */
/* loaded from: classes2.dex */
public final class C6148r1 implements InterfaceC6180v1<byte[]> {
    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: a */
    public final /* synthetic */ void mo13095a(OutputStream outputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = bArr;
        if (outputStream == null || bArr2 == null) {
            return;
        }
        outputStream.write(bArr2, 0, bArr2.length);
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: b */
    public final /* synthetic */ byte[] mo13096b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6013c2.m12985a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
