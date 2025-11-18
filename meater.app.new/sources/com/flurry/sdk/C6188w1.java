package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.w1 */
/* loaded from: classes2.dex */
public final class C6188w1 implements InterfaceC6180v1<String> {
    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: a */
    public final /* synthetic */ void mo13095a(OutputStream outputStream, String str) throws IOException {
        String str2 = str;
        if (outputStream == null || str2 == null) {
            return;
        }
        byte[] bytes = str2.getBytes("utf-8");
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: b */
    public final /* synthetic */ String mo13096b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6013c2.m12985a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
