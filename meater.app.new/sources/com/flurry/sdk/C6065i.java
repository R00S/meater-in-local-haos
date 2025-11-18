package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.i */
/* loaded from: classes2.dex */
public final class C6065i {

    /* renamed from: a */
    public final boolean f15962a;

    /* renamed from: b */
    public final byte[] f15963b;

    /* renamed from: c */
    public final byte[] f15964c;

    /* renamed from: d */
    public final int f15965d;

    /* renamed from: com.flurry.sdk.i$a */
    static class a implements InterfaceC6180v1<C6065i> {

        /* renamed from: com.flurry.sdk.i$a$a, reason: collision with other inner class name */
        final class C11468a extends DataOutputStream {
            C11468a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.i$a$b */
        final class b extends DataInputStream {
            b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: a */
        public final /* synthetic */ void mo13095a(OutputStream outputStream, C6065i c6065i) throws IOException {
            C6065i c6065i2 = c6065i;
            if (outputStream == null || c6065i2 == null) {
                return;
            }
            C11468a c11468a = new C11468a(outputStream);
            c11468a.writeBoolean(c6065i2.f15962a);
            byte[] bArr = c6065i2.f15963b;
            if (bArr == null) {
                c11468a.writeInt(0);
            } else {
                c11468a.writeInt(bArr.length);
                c11468a.write(c6065i2.f15963b);
            }
            byte[] bArr2 = c6065i2.f15964c;
            if (bArr2 == null) {
                c11468a.writeInt(0);
            } else {
                c11468a.writeInt(bArr2.length);
                c11468a.write(c6065i2.f15964c);
            }
            c11468a.writeInt(c6065i2.f15965d);
            c11468a.flush();
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: b */
        public final /* synthetic */ C6065i mo13096b(InputStream inputStream) throws IOException {
            byte[] bArr;
            byte[] bArr2 = null;
            if (inputStream == null) {
                return null;
            }
            b bVar = new b(inputStream);
            boolean z = bVar.readBoolean();
            int i2 = bVar.readInt();
            if (i2 > 0) {
                bArr = new byte[i2];
                bVar.read(bArr, 0, i2);
            } else {
                bArr = null;
            }
            int i3 = bVar.readInt();
            if (i3 > 0) {
                bArr2 = new byte[i3];
                bVar.read(bArr2, 0, i3);
            }
            return new C6065i(bArr2, bArr, z, bVar.readInt());
        }
    }

    C6065i(byte[] bArr, byte[] bArr2, boolean z, int i2) {
        this.f15963b = bArr2;
        this.f15964c = bArr;
        this.f15962a = z;
        this.f15965d = i2;
    }
}
