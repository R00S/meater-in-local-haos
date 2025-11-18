package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.x1 */
/* loaded from: classes2.dex */
public final class C6196x1<T> implements InterfaceC6180v1<T> {

    /* renamed from: a */
    private final String f16506a;

    /* renamed from: b */
    private final int f16507b;

    /* renamed from: c */
    private final InterfaceC6204y1<T> f16508c;

    /* renamed from: com.flurry.sdk.x1$a */
    final class a extends DataOutputStream {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* renamed from: com.flurry.sdk.x1$b */
    final class b extends DataInputStream {
        b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public C6196x1(String str, int i2, InterfaceC6204y1<T> interfaceC6204y1) {
        this.f16506a = str;
        this.f16507b = i2;
        this.f16508c = interfaceC6204y1;
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: a */
    public final void mo13095a(OutputStream outputStream, T t) throws IOException {
        if (outputStream == null || this.f16508c == null) {
            return;
        }
        a aVar = new a(outputStream);
        aVar.writeUTF(this.f16506a);
        aVar.writeInt(this.f16507b);
        this.f16508c.mo13122a(this.f16507b).mo13095a(aVar, t);
        aVar.flush();
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: b */
    public final T mo13096b(InputStream inputStream) throws IOException {
        if (inputStream == null || this.f16508c == null) {
            return null;
        }
        b bVar = new b(inputStream);
        String utf = bVar.readUTF();
        if (this.f16506a.equals(utf)) {
            return this.f16508c.mo13122a(bVar.readInt()).mo13096b(bVar);
        }
        throw new IOException("Signature: " + utf + " is invalid");
    }
}
