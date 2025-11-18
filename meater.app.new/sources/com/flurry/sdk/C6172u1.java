package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.u1 */
/* loaded from: classes2.dex */
public final class C6172u1<T> implements InterfaceC6180v1<List<T>> {

    /* renamed from: a */
    InterfaceC6180v1<T> f16401a;

    /* renamed from: com.flurry.sdk.u1$a */
    final class a extends DataOutputStream {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* renamed from: com.flurry.sdk.u1$b */
    final class b extends DataInputStream {
        b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public C6172u1(InterfaceC6180v1<T> interfaceC6180v1) {
        this.f16401a = interfaceC6180v1;
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: a */
    public final /* synthetic */ void mo13095a(OutputStream outputStream, Object obj) throws IOException {
        List list = (List) obj;
        if (outputStream != null) {
            a aVar = new a(outputStream);
            int size = list != null ? list.size() : 0;
            aVar.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f16401a.mo13095a(outputStream, list.get(i2));
            }
            aVar.flush();
        }
    }

    @Override // com.flurry.sdk.InterfaceC6180v1
    /* renamed from: b */
    public final /* synthetic */ Object mo13096b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        int i2 = new b(inputStream).readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            T tMo13096b = this.f16401a.mo13096b(inputStream);
            if (tMo13096b == null) {
                throw new IOException("Missing record.");
            }
            arrayList.add(tMo13096b);
        }
        return arrayList;
    }
}
